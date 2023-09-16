package one.digitalinnovationon.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;

public class PessoaTeste {
    @Test
    void deveCalcularIdadeCorretamente() {
        Pessoa jessica = new Pessoa("jessica", LocalDateTime.of(2000, 1, 1, 15,0,0));
        Assertions.assertEquals(23, jessica.getIdade());
    }

    @Test
    void deveRetornarSeEhMaiorDeIdade() {
        Pessoa pessoa = new Pessoa("jessica", LocalDateTime.of(2000, 1, 1, 15,0,0));
        Assertions.assertTrue(pessoa.ehMaiorDeIdade());

        Pessoa joao = new Pessoa("joao", LocalDateTime.now());
        Assertions.assertFalse(joao.ehMaiorDeIdade());
    }
}
