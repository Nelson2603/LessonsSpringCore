package org.example.lessonsspringcore.task_4_springCreateBean.task1;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Data
@Scope("prototype")
@Component("student")
public class Student {
    private int id;
    private String group;
    private String fullName;
}
