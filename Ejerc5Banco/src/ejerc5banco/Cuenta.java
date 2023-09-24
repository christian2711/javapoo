
package ejerc5banco;

import java.util.Scanner;

/**
 *Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
Las operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 * 
 */
public class Cuenta {
    
    private int numCta;
    private long dni;
    private int saldoAct;
    
    
    Scanner leer = new Scanner(System.in);
    

    public Cuenta() {
    }

    public Cuenta(int numCta, long dni, int saldoAct) {
        this.numCta = numCta;
        this.dni = dni;
        this.saldoAct = saldoAct;
    }

    public int getNumCta() {
        return numCta;
    }

    public void setNumCta(int numCta) {
        this.numCta = numCta;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public int getSaldoAct() {
        return saldoAct;
    }

    public void setSaldoAct(int saldoAct) {
        this.saldoAct = saldoAct;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numCta=" + numCta + ", dni=" + dni + ", saldoAct=" + saldoAct + ", leer=" + leer + '}';
    }
    
    public Cuenta crearCta(){
        Cuenta cta1 = new Cuenta();
        
        System.out.println("ingrese numero de cuenta");
        cta1.setNumCta(leer.nextInt());
        System.out.println("ingrese dni");
         cta1.setDni(leer.nextLong());
        System.out.println("ingrese saldo actual");
        cta1.setSaldoAct(leer.nextInt());
        
        return cta1;
    }
    public void ingresar(Cuenta cta1){
        System.out.println("digite el monto a ingresar");
         cta1.setSaldoAct(cta1.getSaldoAct() + leer.nextInt());
         System.out.println("el saldo actual es de. " + cta1.getSaldoAct());
       
        
        
    }
    public void retirar(Cuenta cta1){
        System.out.println("ingrese la cantidad a retirar ");
         int retiro = leer.nextInt();
        if( retiro > cta1.getSaldoAct()){
            System.out.println("saldo actual 0 "); 
        }
        else{
            cta1.setSaldoAct(cta1.getSaldoAct() - retiro);
            System.out.println("el saldo es " + cta1.getSaldoAct());
        }
       
    }
    public void extraccion(Cuenta cta1){
        
        System.out.println("ingrese el monto a extraer");
       Double extraccion = leer.nextDouble();
      if(extraccion > cta1.getSaldoAct()-(cta1.getSaldoAct()*0.20)){
          System.out.println("no se puede realizar la operacion ,se supera el 20% de su saldo");
      }else{
          cta1.setSaldoAct((int) (cta1.getSaldoAct()-extraccion));
          System.out.println("el saldo actual es de: " + cta1.getSaldoAct());
      }
      
   }
    public void consultarsaldo(Cuenta cta1){
        System.out.println("el saldo de la cuenta: " + cta1.getNumCta() + " es de: " + cta1.getSaldoAct());
    }
    public void consultarDatos(Cuenta cta1){
        System.out.println("los datos de la cuenta son: numero de cuenta " + cta1.getNumCta() + " y dni numero: " + cta1.getDni());
    }
}
