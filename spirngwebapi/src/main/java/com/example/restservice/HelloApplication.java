package com.example.restservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//③アノテーション
public class HelloApplication {
//④mainメソッド
public static void main(String[] args) {
SpringApplication.run(HelloApplication.class, args);
}
}