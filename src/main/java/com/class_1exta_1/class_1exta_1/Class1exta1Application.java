package com.class_1exta_1.class_1exta_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
public class Class1exta1Application {

	public static void main(String[] args) {
		Dotenv dotenv=Dotenv.configure().directory("./").ignoreIfMalformed().ignoreIfMissing().load();
				
				if(dotenv.get("DB_URl")!=null) {
					System.setProperty("DB_URl", dotenv.get("DB_URl"));
				}
				if(dotenv.get("DB_USER")!=null) {
					System.setProperty("DB_USER", dotenv.get("DB_USER"));
				}
				if(dotenv.get("DB_PASS")!=null) {
					System.setProperty("DB_PASS", dotenv.get("DB_PASS"));
				}
				SpringApplication.run(Class1exta1Application.class, args);
	}
}
