package one.digitalinnovationon.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsTeste {

    @Test
    void validarAlgoSomenteNoUsuarioDriuzzo() {
        Assumptions.assumeFalse("Driuzzo".equals(System.getenv("USER")));
        Assertions.assertEquals(10, 5 + 5);
    }
}
