package com.cetpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cetpa.model.Product;
import com.cetpa.repository.ProductRepository;

@Service
public class ProductService 
{
	@Autowired
	private ProductRepository productRepository;

	public void saveProduct(Product product) 
	{
		productRepository.saveRecord(product);
	}

	public List<Product> getList() 
	{
		List<Product> plist=productRepository.getProductList();
		return plist;
	}

	public Product getProduct(int pid) 
	{
		Product p=productRepository.getRecord(pid);
		return p;
	}

	public void deleteProduct(int pid) 
	{
		Product product=productRepository.getRecord(pid);
		productRepository.deleteRecord(product);
	}
}
