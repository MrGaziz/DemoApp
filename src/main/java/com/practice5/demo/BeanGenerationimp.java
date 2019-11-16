package com.practice5.demo;

import com.github.javafaker.Faker;
import com.github.javafaker.Name;
import com.practice5.demo.model.Person;
import com.practice5.demo.repository.PersonRepository;
import com.practice5.demo.repository.RandomGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.*;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;


    @Slf4j
    @Component
    @Getter
    @Setter
    public class SomeBean implements RandomGenerator{
    @Autowired
    private PersonRepository repository;
        public static Long start=System.currentTimeMillis();
    @Override
        public List<Object> generateCollection(int size, String valueType) {

            List<Object> values = new LinkedList<>();
            Faker faker =new Faker();
            for(int i =0; i<size;i++){
                Random random = new Random();
                random.setSeed(124292*i+System.currentTimeMillis());
                if(valueType.equals("NAME"))
                    values.add(faker.name().firstName());
                else if(valueType.equals("AGE"))
                    values.add(random.nextInt());
                else {
                    log.error("No such value type in generateValue method");
                    throw new RuntimeException();
                }
            }
            return values;
        }
        public static  Long end =System.currentTimeMillis();




    }
//        List<Object>peoples=new LinkedList<>();
//
//        List<Person> people= new ArrayList<Person>();
//        for (int i = 0; i < 100; i++) {
//            people.add(new Person(faker.name(),i));
//            repository.save(people.get(i));
//        }


//        for(int i=0;i<=100;i++)
//        {
//            Random random =new Random();
//            peoples.set(i,faker.name());
//            people.set(i,random.ints(256));
//        }
