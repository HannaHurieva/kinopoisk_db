package com.alevel.main;

import com.alevel.entities.UserInfo;
import com.alevel.utils.HibernateSessionFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppMain {
    public static SessionFactory sessionFactory;

    public static void main(String[] args) {
        System.out.println("Hibernate tutorial start");

        Session session = HibernateSessionFactory.getSessionFactory().openSession();

        Transaction transaction = session.beginTransaction();

        String date = "24.04.2019";
        // Переводим строку в дату
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        Date parsingDate = null;
        try {
            parsingDate = format.parse(date);
        } catch (Exception e) {
            e.printStackTrace();
        }

/*        UserInfo user1 = new UserInfo("Sakila", "Database", "FEMALE", parsingDate,
                "email@alevel.com", "New York");

        UserInfo user2 = new UserInfo("Test", "Connection", "MALE", new Date(),
                "test@alevel.com", "Kiev");

        session.save(user1);
        session.save(user2);*/

        List<UserInfo> userList = new ArrayList<>();
        userList = session.createQuery("from UserInfo ").list();

        for (UserInfo user : userList) {
            System.out.println(user.toString());
        }

        transaction.commit();
        session.close();
    }
}
