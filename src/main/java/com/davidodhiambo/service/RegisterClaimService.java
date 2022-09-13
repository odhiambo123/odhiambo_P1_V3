package com.davidodhiambo.service;

import entity.ClaimEntity;
import entity.HibernateUtil;
import org.hibernate.*;

public class RegisterClaimService {
    public boolean registerClaim(ClaimEntity claim) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if (isClaimExist(claim))
            return false;
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.saveOrUpdate(claim);
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

        public boolean isClaimExist(ClaimEntity claim) {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction tx = null;
            ClaimEntity claimEntity = null;
            try {
                tx = session.beginTransaction();
                claimEntity = (ClaimEntity) session.createQuery("select ClaimEntity.claimId from ClaimEntity  where claimId = :claimId")
                        .setParameter("claimId", claim.getClaimId())
                        .uniqueResult();
                tx.commit();
                if (claimEntity != null) {
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
            return claimEntity != null;
        }
    }
