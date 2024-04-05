package com.example.yahyasaadaoui;

import com.example.yahyasaadaoui.entities.Product;
import com.example.yahyasaadaoui.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class ActivitePratiqueN2OrmJpaHIbernateSpringDataApplication implements CommandLineRunner {
	@Autowired
	private ProductRepository productRepository;
	public static void main(String[] args) {
		SpringApplication.run(ActivitePratiqueN2OrmJpaHIbernateSpringDataApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		System.out.println("**********Add Products *********");
//		productRepository.save(new Product(1,"Comp",4300,3));
//		productRepository.save(new Product(2,"Comp",300,14));
//		productRepository.save(new Product(3,"Comp",430,44));
//		productRepository.save(new Product(4,"MacBook",50000,2));
		System.out.println("All Products are added Successfully");
		System.out.println();
		System.out.println();
		System.out.println();

		System.out.println("**********Show the list of all products *********");
		List<Product> products = productRepository.findAll();
		products.forEach(product -> {
			System.out.println(product.toString());
		});
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

		System.out.println("**********Search for A Product By ID *********");
		Product product1=productRepository.findById(Long.valueOf(1)).get();
		System.out.println(product1.getId());
		System.out.println(product1.getName());
		System.out.println(product1.getQuantity());
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

		System.out.println("**********Search for A Product Method 1 *********");
		List<Product> ProductsWithC = productRepository.findByNameContains("C");
		ProductsWithC.forEach(product -> {
			System.out.println("Product list : "+ product);
		});
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

		System.out.println("**********Search for A Product Method 2 *********");
		List<Product> ProductsWithC2 = productRepository.search("%C%");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

		System.out.println("**********Product Update*********");
		Long productIdToUpdate = 1L;
		Product productToUpdate = productRepository.findById(productIdToUpdate).get();
		System.out.println("Update Was Successful");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

		System.out.println("**********Product Modification*********");

		productToUpdate.setName("Phone");
		productToUpdate.setPrice(5500);

		productRepository.save(productToUpdate);
		System.out.println("Product with ID " + productIdToUpdate + " updated successfully!");
		products.forEach(product -> {
			System.out.println(product.toString());
		});
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

		System.out.println("**********Product Deletion*********");
		Long productIdToDelete = 4L;
		productRepository.deleteById(productIdToDelete);
		System.out.println("Product with ID " + productIdToDelete + " deleted successfully!");



	}

}
