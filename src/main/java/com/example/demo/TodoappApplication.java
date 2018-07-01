package com.example.demo;

import com.example.demo.models.Todo;
import com.example.demo.repositories.TodoRepository;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class TodoappApplication  implements CommandLineRunner{

	@Autowired
    TodoRepository todoRepository;

	public static void main(String[] args) {
		SpringApplication.run(TodoappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		todoRepository.save(new Todo("ABC"));
		todoRepository.save(new Todo("ABC"));
		todoRepository.save(new Todo("ABC"));
		
	}
}
