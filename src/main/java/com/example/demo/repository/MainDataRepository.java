package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.MainData;

public interface MainDataRepository extends JpaRepository<MainData, String> {

}
