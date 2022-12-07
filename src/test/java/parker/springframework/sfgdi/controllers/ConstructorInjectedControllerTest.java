package parker.springframework.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import parker.springframework.sfgdi.services.GreetingService;
import parker.springframework.sfgdi.services.ConstructorGreetingService;

public class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new ConstructorGreetingService());
    }

    @Test
    void testGetGreeting() {
        System.out.println(controller.getGreeting());
    }
}
