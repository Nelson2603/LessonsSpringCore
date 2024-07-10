package org.example.lessonsspringcore.task_4_springCreateBean.task1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainStudent {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(StudentConfig.class);
        List<Student> students = new ArrayList<>();//создаем лист


        var student1 = context.getBean("student", Student.class);
        student1.setId(1);
        student1.setGroup("Физика");
        student1.setFullName("Иванов Иван Иваныч");
        var student2 = context.getBean("student", Student.class);
        student2.setId(2);
        student2.setGroup("IT");
        student2.setFullName("Петров Петр Петрович");
        var student3 = context.getBean("student", Student.class);
        student3.setId(3);
        student3.setGroup("Ботаники");
        student3.setFullName("Сидоров Сидр Сидорович");
        var student4 = context.getBean("student", Student.class);
        student4.setId(4);
        student4.setGroup("Бездельников");
        student4.setFullName("Мусаев Наиль");
//        System.out.println(student1);
//        System.out.println(student2);
//        System.out.println(student3);
//        System.out.println(student4);
        students.addAll(Arrays.asList(student1, student2, student3,student4));//работа с листами практика
        students.forEach(System.out::println);
        //не понял зачем так усложнять вызов обычных объектов через бины (спрошу у жпт)
    }
}
