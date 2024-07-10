package org.example.lessonsspringcore.task_4_springCreateBean.singleton;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

//этот класс создали для того, чтобы знать что сканировать на наличие бинов
@Component
@ComponentScan("org.example.lessonsspringcore")
public class SchoolConfig {

}
