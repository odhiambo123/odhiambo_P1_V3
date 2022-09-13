package com.davidodhiambo.service;

import entity.EmployeeEntity;
import entity.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class RegisterEmployeeService {
    public boolean registerEmployee(EmployeeEntity employee) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if (isEmployeeExist(employee))
            return false;
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.saveOrUpdate(employee);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return true;
    }

    public boolean isEmployeeExist(EmployeeEntity employee) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        EmployeeEntity employeeEntity = null;
        try {
            tx = session.beginTransaction();
            employeeEntity = (EmployeeEntity) session.createQuery("select EmployeeEntity.empEmail from EmployeeEntity  where empEmail = :email")
                    .setParameter("email", employee.getEmpEmail())
                    .uniqueResult();
            tx.commit();
            if (employeeEntity != null) {
                return true;
            }
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return employeeEntity != null;
    }
}

