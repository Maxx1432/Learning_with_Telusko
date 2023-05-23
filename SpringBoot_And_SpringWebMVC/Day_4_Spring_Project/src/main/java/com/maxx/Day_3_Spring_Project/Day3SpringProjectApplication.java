package com.maxx.Day_3_Spring_Project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class Day3SpringProjectApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Day3SpringProjectApplication.class, args);

		ProductService service = context.getBean(ProductService.class);
//		service.show();
		List<Product> products = service.getAllProducts();
		for (Product p : products) {
			System.out.println(p);
		}
		System.out.println("==============================================");

		System.out.println("a Particular product");

//		Product p = service.getProduct("Logi Mouse");
		List<Product> products1 = service.getProductWithTextInStream("Logi Mouse");
		for (Product p : products1) {
			System.out.println(p);
		}

		System.out.println("==============================================");
        System.out.println("Search Product which are out of Warranty");

        List<Product> prods2 = service.getProductWarranty(2023);

        for(Product product : prods2)
        {
            System.out.println(product);
        }
	}
}
