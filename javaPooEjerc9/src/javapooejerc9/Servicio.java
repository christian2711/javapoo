
package javapooejerc9;

/**Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:

a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 *
 * 
 */
public class Servicio {
    
    Mate mat = new Mate();
    
   public void crearMate(){
     
        mat.setNum1(Math.random());
        System.out.println(mat.getNum1());
       mat.setNum2(Math.random());
       System.out.println(mat.getNum2());
       
   }
    
    public double devolverMayor(Mate mat){
    return  Math.max(mat.getNum1(), mat.getNum2()); 
        
    }
    public double devolverMenor(Mate mat){
        return Math.min(mat.getNum1(), mat.getNum2());
    }
    public void calcularPotencia(Mate mat){
        
        System.out.println("la potencia del mayor numero elevada aql menor es: " + Math.pow(Math.round(devolverMayor(mat)),Math.round(devolverMenor(mat))));
       }
    public void calculaRaiz(Mate mat){
            System.out.println("la raiz del numero menor es: " + Math.sqrt(Math.abs(devolverMenor(mat))) );
            
    }
    
}
