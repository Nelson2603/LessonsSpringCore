package org.example.lessonsspringcore.task_4_springCreateBean.singleton;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(SchoolConfig.class);//создание контейнера
        School school = context.getBean("school", School.class);//вытаскиваем бин
        School school2 = context.getBean("school", School.class);//вытаскиваем бин
       // school2.setName("sssss");
        System.out.println(school);
        System.out.println(school2);
    }
}
