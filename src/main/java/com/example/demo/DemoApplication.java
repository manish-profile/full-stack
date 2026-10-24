package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		//System.out.println("hello world");
		//SpringApplication.run(DemoApplication.class, args);


		Integer[] arr = {5,5,5};
		List<Integer> listInt= Arrays.asList(arr);
		Optional<Integer> first = listInt.stream().distinct()
				.sorted((a, b) -> b - a).skip(1).findFirst();

		if (first.isPresent()){
			System.out.println(first);
		}else {
			System.out.println("NotFound");
		}

	}

}
