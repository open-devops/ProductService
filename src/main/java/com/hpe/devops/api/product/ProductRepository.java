package com.hpe.devops.api.product;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
	
	List<Product> findByOrganizationId(String organizationId);

	List<Product> findByOrganizationIdAndName(String orgId, String name);

	Product findByPipelineId(String pipelineId);
}
