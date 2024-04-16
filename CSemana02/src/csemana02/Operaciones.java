package csemana02;

public class Operaciones {

    public float suma(float num1, float num2){
        return num1 + num2;
    }
    

    public float resta(float num1, float num2){
        return num1 - num2;
    }
    

    public float multiplicacion(float num1, float num2){
        return num1 * num2;
    }
    

    public float division(float num1, float num2){
      
        if (num2 != 0) {
            return num1 / num2;
        } else {
            //System.out.println("Error: División por cero.");
            return 0; 
        }
    }

    public double raizCuadrada(double num1){
        if (num1 >= 0) {
            return Math.sqrt(num1);
        } else {
            System.out.println("Error: No se puede calcular la raíz cuadrada de un número negativo.");
            return Double.NaN;
        }
    }
    

    public double potencia(float num1, float num2){
        return Math.pow(num1, num2);
    }
    
  
    public double seno(double num1){
        return Math.sin(num1);
    }
    
  
    public double coseno(double num1){
        return Math.cos(num1);
    }
    
    
    public double raizCubica(double num1){
        return Math.cbrt(num1);
    }
    
 
    public float mayor(float num1, float num2){
        return Math.max(num1, num2);
    }
    

}
