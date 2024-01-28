package com.laptrinhjavaweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laptrinhjavaweb.entity.HelloEntity;

public interface HelloWorldRepository extends JpaRepository<HelloEntity, Long> {

}
