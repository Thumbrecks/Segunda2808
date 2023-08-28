package com.segunda2808.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.segunda2808.demo.Faculdade;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		Faculdade minhaFaculdade = new Faculdade();
		System.out.println("\n");
        minhaFaculdade.validaCpf();

	}
}
