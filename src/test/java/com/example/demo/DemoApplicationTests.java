package com.example.demo;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest
public class DemoApplicationTests {


    @Autowired
    private MockMvc mockMvc;


    @Test
    @WithMockUser(username = "emil", password = "1234", roles = "user")
    public void helloWorldTest() throws Exception {

            mockMvc
                    .perform(get("/"))
                    .andDo(print())
                    .andExpect(status().isOk())
                    .andExpect(content().string(containsString("Hello world")));
    }

    @Test
    public void helloModelTest() throws Exception {

        mockMvc
                .perform(get("/all"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("wiadomosc")));
    }

}
