package com.checha.calculador;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

@Service
public class CalculadorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculadorApplication.class, args);
	}
	public int sum(int a, int b){ return a+b;}

}
