package com.example.demo.AppRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.AppEntity.AppEntity;

public interface AppRepo extends JpaRepository<AppEntity, Integer> {

}
