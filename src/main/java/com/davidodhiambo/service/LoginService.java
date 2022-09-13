package com.davidodhiambo.service;
import entity.EmployeeEntity;
import entity.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class LoginService {
    public boolean authenticateEmployee(String email, String password) {
        EmployeeEntity employee = getEmployeeByEmail(email);
        return employee != null && employee.getPassword().equals(password);
    }

    public static EmployeeEntity getEmployeeByEmail(String email) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        EmployeeEntity employee = null;
        try {
            tx = session.beginTransaction();
            List employees = session.createQuery("from EmployeeEntity where empEmail = :email")
                    .setParameter("empEmail", email)
                    .list();
           if (!employees.isEmpty()) {
                employee = (EmployeeEntity) employees.get(0);
            }
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }
        return employee;
    }


    public List getAllEmployees() {
        Transaction tx = null;
        List employees = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            tx = session.beginTransaction();
            employees = session.createQuery("from EmployeeEntity").list();
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
        }
        return employees;
    }

    public void deleteEmployee(int id) {
        Transaction tx = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            tx = session.beginTransaction();
            EmployeeEntity employee = session.get(EmployeeEntity.class, id);
            if (employee != null) {
                session.delete(employee);
                System.out.println("employee is deleted");
            }
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
        }
    }

    public void updateEmployee(EmployeeEntity employee) {
        Transaction tx = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            tx = session.beginTransaction();
            session.update(employee);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
        }
    }

    public EmployeeEntity getEmployeeById(int id) {
        Transaction tx = null;
        EmployeeEntity employee = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            tx = session.beginTransaction();
            employee = session.get(EmployeeEntity.class, id);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
        }
        return employee;
    }

    public List<EmployeeEntity> getEmployeeBy_empl_Type(int emplType) {
        Transaction tx = null;
        List employees = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            tx = session.beginTransaction();
            employees = session.createQuery("from EmployeeEntity where emplType = :emplType")
                    .setParameter("emplType", emplType)
                    .list();
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
        }
        return employees;
    }

}
