package com.devsuperior.valorTotal;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.valorTotal.entities.Order;
import com.devsuperior.valorTotal.services.OrderService;

@SpringBootApplication
public class ValorTotalApplication implements CommandLineRunner {
	
	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(ValorTotalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter order quantity: ");
		int pedidos = sc.nextInt();
		
		List<Order> orders = new ArrayList<>();
		
		for (int i = 0; i < pedidos; i++) {
			System.out.print("Enter the code: ");
			int code = sc.nextInt();
			System.out.print("Inform the basic value: ");
			double basic = sc.nextDouble();
			System.out.print("Inform the discount percentage: ");
			double discount = sc.nextDouble();
			
			Order order = new Order(code, basic, discount);
			orders.add(order);
		}

		System.out.println("\nOrder Results:");
		for (Order order : orders) {
			System.out.println("Request code: " + order.getCode());
			System.out.printf("Total value: R$ %.2f%n", orderService.total(order));
		}
		
		sc.close();
	}
}
