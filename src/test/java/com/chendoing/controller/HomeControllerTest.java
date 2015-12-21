package com.chendoing.controller;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;


public class HomeControllerTest {

    @Test
    public void testHome() throws Exception {

        HomeController homeController = new HomeController();
        Assert.assertEquals("home", homeController.home());
        Assert.assertNotEquals("home1", homeController.home());
        MockMvc mockMvc = standaloneSetup(homeController).build();
        mockMvc.perform(get("/home")).andExpect(view().name("home"));
        mockMvc.perform(get("")).andExpect(view().name("home"));
    }
}