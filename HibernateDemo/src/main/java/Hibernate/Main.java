package Hibernate;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Student s2 = new Student();
        s2.setsId(2);
        s2.setsName("Cherotich");
        s2.setsMarks(90);

//        Student s2 = null;
        Student s3 = null;

        SessionFactory sf = new Configuration()
                    .addAnnotatedClass(Hibernate.Student.class)
                    .configure()
                    .buildSessionFactory();

        Session session = sf.openSession();

//      Storing data -- begin transaction and use the persist method on the session passing the object to persist method
//      Transaction transaction = session.beginTransaction();
//      session.persist(s1);
//      transaction.commit();

//      To find a record on the database by id
//      s2 = session.find(Student.class, 3);

//      To update a record on a database, first set the data the object
//      The update query firsts selects the record then update it if the record exists and creates a new copy if the record does not exist.
//        Transaction transaction = session.beginTransaction();
//        session.merge(s2);
        s3 = session.find(Student.class, 6);
        Transaction transaction = session.beginTransaction();
        session.remove(s3);
        transaction.commit();

        session.close();
        sf.close();

        System.out.println(s2);
    }
}
