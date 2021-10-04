package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Khoa;
import com.example.repository.KhoaRepository;

@Service
public class KhoaService {
@Autowired
private KhoaRepository khoaRepository;
public Khoa saveKhoa(Khoa khoa) {
  
    System.out.println("Inside saveKhoa of Service! ");
    return khoaRepository.save(khoa);
}

public Khoa findKhoaById(Long khoaId) {
	 System.out.println("inside findKhoaById ");
    return khoaRepository.findById(khoaId).get();
}

}
