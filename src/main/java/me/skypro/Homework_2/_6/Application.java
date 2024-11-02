package me.skypro.Homework_2._6;

import me.skypro.Homework_2._6.model.IntegerArrayList;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		IntegerArrayList arrayList = new IntegerArrayList(10);
		for (int i = 0; i < 10; i++) {
			arrayList.add(i);
		}
		arrayList.add(87);
		System.out.println(arrayList);
	}

}
