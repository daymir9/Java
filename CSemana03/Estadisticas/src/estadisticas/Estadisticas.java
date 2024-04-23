
package estadisticas;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Estadisticas {

    // Método para calcular la media
    public static double media(double[] numeros) {
        double suma = 0.0;
        for (double num : numeros) {
            suma += num;
        }
        return suma / numeros.length;
    }

    // Método para calcular la moda
    public static double moda(double[] numeros) {
        HashMap<Double, Integer> frecuencia = new HashMap<>();
        for (double num : numeros) {
            frecuencia.put(num, frecuencia.getOrDefault(num, 0) + 1);
        }

        int maxFrec = 0;
        double moda = 0.0;
        for (Map.Entry<Double, Integer> entry : frecuencia.entrySet()) {
            if (maxFrec < entry.getValue()) {
                moda = entry.getKey();
                maxFrec = entry.getValue();
            }
        }
        return moda;
    }

    // Método para calcular la mediana
    public static double mediana(double[] numeros) {
        Arrays.sort(numeros);
        int mitad = numeros.length / 2;
        if (numeros.length % 2 == 0) {
            return (numeros[mitad - 1] + numeros[mitad]) / 2.0;
        } else {
            return numeros[mitad];
        }
    }

    // Método para calcular la desviación estándar
    public static double desviacionEstandar(double[] numeros) {
        double media = media(numeros);
        double sumaCuadrados = 0.0;
        for (double num : numeros) {
            sumaCuadrados += Math.pow(num - media, 2);
        }
        return Math.sqrt(sumaCuadrados / numeros.length);
    }

    // Método para calcular la varianza
    public static double varianza(double[] numeros) {
        double media = media(numeros);
        double sumaCuadrados = 0.0;
        for (double num : numeros) {
            sumaCuadrados += Math.pow(num - media, 2);
        }
        return sumaCuadrados / numeros.length;
    }
}