import java.util.HashMap;
import java.util.Map;

public class BD {
    private static Map<String, Colaborador> colaboradores = new HashMap<>();

    public static Colaborador getColaborador(String cpf) {
        return colaboradores.get(cpf);
    }

    public static void addColaborador(Colaborador colaborador) {
        colaboradores.put(colaborador.getCPF(), colaborador);
    }
}
