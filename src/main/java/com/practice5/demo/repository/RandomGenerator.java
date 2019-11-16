package com.practice5.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RandomGenerator extends JpaRepository
{
    List<Object> generateValue(int size, String valueType);
}
