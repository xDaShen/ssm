package com.xmos.ssm;

import com.xmos.ssm.controller.LoginController;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;


public class AppTest {

    @Test
    public void loginTest() throws Exception {
        LoginController loginController = new LoginController();
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(loginController).build();
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/login")
                .param("name", "xmos")
                .param("pwd", "1234567")).andReturn();
        System.out.println(mvcResult.getResponse().getContentAsString());
    }
}
