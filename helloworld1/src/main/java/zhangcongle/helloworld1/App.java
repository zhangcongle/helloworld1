package zhangcongle.helloworld1;

import java.io.*;
import com.google.gson.*;

/**
 * Hello world!
 *
 */
class Cat {
	String name;
	int age;
	double weight;

	public Cat(String name, int age, double weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
}

public class App {
	static Gson gson = new Gson();

	public static void main(String[] args) {
		Cat c = new Cat("catcat", 10, 0.5);
		System.out.println(gson.toJson(c));
	}
}
