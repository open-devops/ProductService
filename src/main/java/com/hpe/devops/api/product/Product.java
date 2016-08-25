package com.hpe.devops.api.product;

import org.springframework.data.annotation.Id;

public class Product {

    private String id;
    
    private String name;
    
    private String description;
    
    private String pipelineId;
    
    private String pipelineName;
    
    private String pipelineDescription;
    
    private String organizationId;
    
    public Product(){
    	
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPipelineId() {
		return pipelineId;
	}
	
	public Product(String name, String description, String pipelineName, String pipelineDescription,
			String organizationId) {
		super();
		this.name = name;
		this.description = description;
		this.pipelineName = pipelineName;
		this.pipelineDescription = pipelineDescription;
		this.organizationId = organizationId;
	}

	public void setPipelineId(String pipelineId) {
		this.pipelineId = pipelineId;
	}

	public String getPipelineName() {
		return pipelineName;
	}

	public void setPipelineName(String pipelineName) {
		this.pipelineName = pipelineName;
	}

	public String getPipelineDescription() {
		return pipelineDescription;
	}

	public void setPipelineDescription(String pipelineDescription) {
		this.pipelineDescription = pipelineDescription;
	}

	public String getOrganizationId() {
		return organizationId;
	}

	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
	}

    
}
