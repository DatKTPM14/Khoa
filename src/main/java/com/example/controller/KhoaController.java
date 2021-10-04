package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Khoa;
import com.example.service.KhoaService;

@RestController
@RequestMapping("/khoa")
public class KhoaController {
	@Autowired
    private KhoaService khoaService;


    @PostMapping("/")
    public Khoa saveKhoa(@RequestBody Khoa khoa){
       System.out.print("inside saveKhoa method if Khoa controller!");
        return khoaService.saveKhoa(khoa);
    }

    @GetMapping("/{id}")
    public Khoa findKhoaById(@PathVariable("id") Long khoaId){
    	 System.out.print("inside findDeparmentById method if Department controller!");
        return khoaService.findKhoaById(khoaId);
    }

    @GetMapping("/")
    public String helloWorld(){
        return "Hello Nguyễn Thế Đạt!";
    }
}
