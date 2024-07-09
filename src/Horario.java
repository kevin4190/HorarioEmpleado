import java.util.HashMap;
import java.util.Map;

public class Horario {
    private Map<DiaSemana, String> horarios;

    public Horario() {
        this.horarios = new HashMap<>();
    }

    public void agregarHorario(DiaSemana dia, String hora) {
        horarios.put(dia, hora);
    }

    public String obtenerHorario(DiaSemana dia) {
        return horarios.get(dia);
    }
}
