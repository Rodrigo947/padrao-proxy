import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ColaboradorTest {
    @BeforeEach
    void setUp() {
        BD.addColaborador(new Colaborador("11111111111", "Nick", 9000.0f));
        BD.addColaborador(new Colaborador("22222222222", "Jhoca", 10000.0f));
    }

    @Test
    void deveRetornarDadosPessoaisColaborador() {
        ColaboradorProxy colaborador = new ColaboradorProxy("11111111111");

        assertEquals(Arrays.asList("Nick", "11111111111"), colaborador.obterDadosPessoais());
    }

    @Test
    void deveRetonarSalarioColaborador() {
        Gestor gestor = new Gestor("Renato", true);
        ColaboradorProxy colaborador = new ColaboradorProxy("22222222222");

        assertEquals(Arrays.asList(10000.0f), colaborador.obterSalario(gestor));
    }

    @Test
    void deveRetonarExcecaoGestorNaoAutorizadoConsultarSalarioColaborador() {
        try {
            Gestor gestor = new Gestor("Lucas", false);
            ColaboradorProxy colaborador = new ColaboradorProxy("22222222222");
            colaborador.obterSalario(gestor);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Gestor não autorizado", e.getMessage());
        }
    }
}