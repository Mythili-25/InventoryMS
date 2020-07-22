package com.inventory;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.inventory.OnlineShoppingSiteApplication;
import com.inventory.product.entity.ProductDetails;
import com.inventory.product.repository.ProductRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=OnlineShoppingSiteApplication.class)
public class OnlineShoppingSiteApplicationTests {

	@Autowired
	ProductRepository productRepository;
	
	@Test
	public void contextLoads() {
	}	
	
	@Test
	public void testCreate() {
		ProductDetails productDetails = new ProductDetails();
		//pd.setProductid(07);
		productDetails.setProductname("Redmi Note 5");
		productDetails.setCategory("Mobile Accessories");
		productDetails.setBrand("Redmi");
		productDetails.setQuantity(12);
		productDetails.setPrice(30000);		
		productRepository.save(productDetails);
	}
	
	@Test
	public void testReadAll() {
		productRepository.findAll();
	}

	@Test
	public void testReadById() {
		productRepository.findById(1);
	}
	
	@Test
	public void testUpdate() {	
		
		Optional<ProductDetails> productDetails = productRepository.findById(1);
		if(productDetails.isPresent()) {
			ProductDetails proddetail = productDetails.get();
			proddetail.setPrice(86543);
			productRepository.save(proddetail);			
		}
	}
	
	@Test
	public void testDeleteById() {
		productRepository.deleteById(10);
	}
		
	

}
