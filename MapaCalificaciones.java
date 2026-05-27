import java.util.*;

public class MapaCalificaciones {
    public static void main(String[] args) {
        Map<String, Double> calificaciones = new HashMap<>();

        calificaciones.put("Ana", 4.5);
        calificaciones.put("Carlos", 3.8);
        calificaciones.put("Laura", 4.2);
        calificaciones.put("Pedro", 3.5);
        calificaciones.put("Sofía", 4.7);

        double suma = 0;
        for (Map.Entry<String, Double> entry : calificaciones.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
            suma += entry.getValue();
        }

        double promedio = suma / calificaciones.size();
        System.out.println("Promedio del grupo = " + promedio);
    }
}
