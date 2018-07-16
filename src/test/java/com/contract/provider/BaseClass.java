package com.contract.provider;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import io.restassured.module.mockmvc.RestAssuredMockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ProviderApplication.class)
public class BaseClass {

    @Before
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(new StarshipController());
    }
}
