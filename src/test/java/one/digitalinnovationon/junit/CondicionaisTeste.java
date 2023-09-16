package one.digitalinnovationon.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class CondicionaisTeste {
    @Test
    @EnabledOnOs({OS.WINDOWS, OS.LINUX})
    @EnabledOnJre(JRE.JAVA_22)
    void validarAlgoSomenteNoUsuarioDriuzzo() {
        Assertions.assertEquals(10, 5 + 5);
    }
}
