package com.hpe.devops.api.product;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping(value = "/products", produces = { "application/json" })
public class ProductController {
	
	@Autowired
	private ProductRepository productRepo;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<Product> getAllAccounts() throws Exception {
		
		return productRepo.findAll();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Product getProductById(@PathVariable String id) throws Exception {
		
		return productRepo.findOne(id);
	}
	
	@RequestMapping(value = "/organization/{organizationId}", method = RequestMethod.GET)
	public List<Product> getAllProductsByOrgId(@PathVariable String organizationId) throws Exception {
		
		return productRepo.findByOrganizationId(organizationId);
		
	}
	
	@RequestMapping(value = "/organization/product", method = RequestMethod.GET)
	public List<Product> getAllProductsByOrgIdAndName(@RequestBody Product product) throws Exception {
		
		return productRepo.findByOrganizationIdAndName(product.getOrganizationId(), product.getName());
		
	}

	@RequestMapping(value = "/organization/product/pipeline/{pipelineId}", method = RequestMethod.GET)
	public Product getProductByPipelineId(@PathVariable String pipelineId) throws Exception {
		
		return productRepo.findByPipelineId(pipelineId);
		
	}
	
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	public ResponseEntity<Product> addProduct(@RequestBody Product product) throws Exception {
	
		product.setId(UUID.randomUUID().toString());
		
		product.setPipelineId(UUID.randomUUID().toString());
		product = productRepo.save(product);
				
		return new ResponseEntity<Product>(product, HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "", method = RequestMethod.PUT)
	public ResponseEntity<Product> updateProduct(@RequestBody Product product) throws Exception {
	
		product = productRepo.save(product);
				
		return new ResponseEntity<Product>(product, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<String> deleteProduct(@PathVariable String id) throws Exception {

		productRepo.delete(id);
		
		return new ResponseEntity<String>("Deleted", HttpStatus.OK);
	}
}
