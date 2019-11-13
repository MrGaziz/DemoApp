package com.practice5.demo;

import javax.persistence.*;


@Entity
    public class Person {
        @Id
        @GeneratedValue(strategy=GenerationType.AUTO)
        private Integer id;
        private String name;
        private Integer age;

        public Integer getAge()
        {
            return age;
        }
        public void setAge(Integer age)
        {
            this.age = age;

        }
        public String getName()
        {
            return name;
        }
        public void setName(String name)
        {
            this.name = name;
        }


    }

