package one.digitalinnovationon.junit;

import org.junit.jupiter.api.*;

import java.time.LocalDateTime;

public class ConsultarDadosDePessoaTeste {
    @BeforeAll
    static void configuraConexao() {
        BancoDeDados.iniciarConexao();
    }

    @BeforeEach
    void insereDadosParaTeste() {
        BancoDeDados.insereDados(new Pessoa("joao", LocalDateTime.of(2000, 1, 1, 15,0,0)));
    }

    @Test
    void ValidarDadosDeRetorno() {
        Assertions.assertTrue(true);
    }

    @Test
    void ValidarDadosDeRetorno2() {
        Assertions.assertNull(null);
    }

    @AfterEach
    void removeDadosParaTeste() {
        BancoDeDados.removeDados(new Pessoa("joao", LocalDateTime.of(2000, 1, 1, 15,0,0)));
    }

    @AfterAll
    static void finalizarConexao() {
        BancoDeDados.finalizarConexao();
    }
}
