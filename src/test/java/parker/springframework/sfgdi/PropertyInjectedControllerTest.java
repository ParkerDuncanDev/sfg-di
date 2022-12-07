package parker.springframework.sfgdi;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import parker.springframework.sfgdi.controllers.PropertyInjectedController;
import parker.springframework.sfgdi.services.ConstructorGreetingService;

public class PropertyInjectedControllerTest {



    PropertyInjectedController controller;

    @BeforeEach
    void setUp(){

        controller = new PropertyInjectedController();

        controller.greetingService = new ConstructorGreetingService();
    }

    @Test
    void getGreeting() {

        System.out.println(controller.getGreeting());

    }
}

