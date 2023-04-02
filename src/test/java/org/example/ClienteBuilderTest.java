package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteBuilderTest {

    @Test
    void deveRetornarExcecaoParaClienteSemLogin() {
        try {
            ClienteBuilder clienteBuilder = new ClienteBuilder();
            Cliente cliente = clienteBuilder
                    .setNome("Cliente 1")
                    .setEmail("cliente1@email.com")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Login inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaClienteSemNome() {
        try {
            ClienteBuilder clienteBuilder = new ClienteBuilder();
            Cliente cliente = clienteBuilder
                    .setLogin(1)
                    .setEmail("cliente1@email.com")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarClienteValido() {
        ClienteBuilder clienteBuilder = new ClienteBuilder();
        Cliente cliente = clienteBuilder
                .setLogin(1)
                .setNome("Cliente 1")
                .setEmail("cliente1@email.com")
                .build();
        assertNotNull(cliente);
    }
}

