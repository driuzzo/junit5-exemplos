package one.digitalinnovationon.junit;

import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTeste {
    @Test
    void validarLancamentos() {
        int[] primeirolancamento = {10, 20, 30, 40, 50};
        int[] segundolancamento = {10, 20, 30, 40, 50};

        assertArrayEquals(primeirolancamento, segundolancamento);
    }

    @Test
    void validarSeObjetoEstaNulo() {
        Pessoa pessoa = null;

        assertNull(pessoa);

        Pessoa joao = new Pessoa("joao", LocalDateTime.now());

        assertNotNull(joao);
    }

    @Test
    void validarNumerosDeTiposDiferentes() {
        double valor = 5.0;
        double outroValor = 5.0;

        assertEquals(valor, outroValor);
    }
}
