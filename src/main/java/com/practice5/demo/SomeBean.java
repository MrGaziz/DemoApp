package com.practice5.demo;

import org.hibernate.validator.internal.engine.groups.Group;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class SomeBean {
    @Autowired
    private PersonRepository repository;

    public  void putData(){
        Person personL=new Person();
        personL.setName("L");
        personL.setAge(19);
        repository.save(personL);

        Person personKira=new Person();
        personKira.setName("Kira");
        personKira.setAge(19);
        repository.save(personKira);

    }


}
