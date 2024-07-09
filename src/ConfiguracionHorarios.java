import java.util.HashMap;
import java.util.Map;

public class ConfiguracionHorarios {
    private Map<String, Horario> configuraciones;

    public ConfiguracionHorarios() {
        this.configuraciones = new HashMap<>();
    }

    public void agregarConfiguracion(String nombre, Horario horario) {
        configuraciones.put(nombre, horario);
    }

    public Horario obtenerConfiguracion(String nombre) {
        return configuraciones.get(nombre);
    }
}
