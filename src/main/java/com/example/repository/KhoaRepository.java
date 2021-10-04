package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Khoa;

@Repository
public interface KhoaRepository extends JpaRepository<Khoa, Long>{

}
