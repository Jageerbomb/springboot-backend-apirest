package com.jagerbomb.springboot.backend.apirest;

import com.jagerbomb.springboot.backend.apirest.models.entity.Cliente;
import com.jagerbomb.springboot.backend.apirest.models.services.IClienteService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class SpringBootBackendApirestApplicationTests {

    IClienteService clienteService;

    @Test
    void contextLoads() {
        testSaveClient();
    }

    @Test
    public void testSaveClient() {

        //clienteService.create(cliente);
    }
}
