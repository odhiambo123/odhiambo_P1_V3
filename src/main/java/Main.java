import entity.EmployeeEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        try{
            transaction.begin();
            EmployeeEntity add_emp = new EmployeeEntity();
            add_emp.setEmpName("David Odhiambo");
            add_emp.setEmpEmail("do@mail.com");
            add_emp.setPassword("1234");
            entityManager.persist(add_emp);

            transaction.commit();
        }catch (Exception e){
            e.printStackTrace();
            transaction.rollback();
        }
    }
}
