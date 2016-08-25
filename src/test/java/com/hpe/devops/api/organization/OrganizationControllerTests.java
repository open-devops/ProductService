package com.hpe.devops.api.organization;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.hpe.devops.api.product.ProductController;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

/**
 * Test Suites for Organization Service
 */
//@RunWith(SpringRunner.class)
//@SpringBootTest
public class OrganizationControllerTests {

/*    //private MockMvc mockMvc;

    //@Autowired
    //private RoleController organizationController;

    //@Before
    public void setup() throws Exception {
        this.mockMvc = standaloneSetup(organizationController).build();
    }

    //@Test
    public void testGetAllUser() throws Exception {
        mockMvc.perform(get("/organizations").contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(status().isOk());
    }

    @Test
    public void testAddOrganization() throws Exception {
        String resStr = "{\"id\":100,\"name\":\"test_001\", \"description\":\"this is test_001\"}";
        mockMvc.perform(post("/organizations").contentType(MediaType.APPLICATION_JSON_UTF8).content(resStr))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.id", is(100)))
                .andExpect(jsonPath("$.name", is("test_001")))
                .andExpect(jsonPath("$.description", is("this is test_001")));
    }

    @Test
    public void testUpdateOrganization() throws Exception {
        String resStr = "{\"id\":100,\"name\":\"test_001\", \"description\":\"this is test_001\"}";
        mockMvc.perform(post("/organizations").contentType(MediaType.APPLICATION_JSON_UTF8).content(resStr))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.id", is(100)))
                .andExpect(jsonPath("$.name", is("test_001")))
                .andExpect(jsonPath("$.description", is("this is test_001")));
    }

    @Test
    public void testDeleteOrganization() throws Exception {
        Long id = 100l;
        mockMvc.perform(delete("/organizations/"+id).contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(status().isOk());
    }*/

}
