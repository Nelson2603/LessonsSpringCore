package org.example.lessonsspringcore.task_4_springCreateBean.singleton;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Data
@Component("school")
public class School {
   // @Value("Средняя Школа 4")//внедрение зависимостей с помощью @Value
    private String name;
   // @Value("Ленина 22")
    private String address;

    public School( @Value("Средняя Школа 4")String name ,@Value("Ленина 44") String address) {
        this.name = name;
        this.address = address;
    }
}
