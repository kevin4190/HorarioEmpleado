import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ConfiguracionHorariosTest {

    @Test
    void testAgregarYObtenerConfiguracion() {
        ConfiguracionHorarios configuracionHorarios = new ConfiguracionHorarios();

        Horario horario1 = new Horario();
        horario1.agregarHorario(DiaSemana.LUNES, "8:00 - 16:00");
        horario1.agregarHorario(DiaSemana.MARTES, "8:30 - 17:00");

        Horario horario2 = new Horario();
        horario2.agregarHorario(DiaSemana.MIERCOLES, "9:00 - 18:00");
        horario2.agregarHorario(DiaSemana.JUEVES, "8:00 - 17:30");

        configuracionHorarios.agregarConfiguracion("Horario1", horario1);
        configuracionHorarios.agregarConfiguracion("Horario2", horario2);

        assertEquals(":00 - 16:00", configuracionHorarios.obtenerConfiguracion("Horario1").obtenerHorario(DiaSemana.LUNES));
        assertEquals("8:30 - 17:00", configuracionHorarios.obtenerConfiguracion("Horario1").obtenerHorario(DiaSemana.MARTES));
        assertEquals("9:00 - 18:00", configuracionHorarios.obtenerConfiguracion("Horario2").obtenerHorario(DiaSemana.MIERCOLES));
        assertEquals("8:00 - 17:30", configuracionHorarios.obtenerConfiguracion("Horario2").obtenerHorario(DiaSemana.JUEVES));
        assertNull(configuracionHorarios.obtenerConfiguracion("Horario3"));
    }
}
