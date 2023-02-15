
package calculadora;
    
import java.util.Scanner;
/**
 *
 * @author German Salazar
 */
public class Consola {


    public double a;
    public double b;
    public float n;
    public double IVA;
    public int valor;
    public double resultado;


    
    public void seta(double a)
    {
        this.a=a;
    }
    public void setb(double b)
    {
        this.b=b;
    } 
     public double geta()
   {
       return a;
   }
       public double getb()
   {
       return b;
   }
    
   
    public double Suma(double a, double b)
    {
        resultado = a + b;
        return resultado;
    }
           
    //resta
    public double Resta(double a, double b)
    {
        resultado = a - b;
        return resultado;
    }
            
    //multiplicación
    public double Multiplicacion (double a, double b)
    {
        resultado = a * b;
        return resultado;
    }
           
    //división
    public double Division (double a, double b)
    {
  
        resultado = a / b;
        return resultado;
       
  
    }
            
    //porcentaje
    public double Porcentaje (double a, double b)
    {
        resultado = (a * b) / 100;
        return resultado;
    }
            
    //raiz n (b < 1)
    public double Raizn (double a, double b)
    {
        resultado = Math.pow (a, 1/b);
        return resultado;
    }
            
    //potencia (b > 1)
    public double Potencia (double a, double b)
    {
        resultado = Math.pow (a, b);
        return resultado;
    }
            
    //sin
    public double Sin1 (double a)
    {
        resultado = Math.sin(a);
        return resultado;
    }       
    //cos
    public double Cos1 (double a)
    {
        resultado = Math.cos(a);
        return resultado;
    }
        
    //tan -- 
    public double Tan1(double a)
    {
        resultado = Math.tan(a);
        return resultado;
    }
    public double iva(double a, double b)
    {
        resultado= a+(a*(b/100));
        return resultado;
    }
    public double opcion(int opc1,double a,double b){
    double c=0;
    switch(opc1){
    case 1:
    c=Suma(a,b);
    break;
    case 2:
    c=Resta(a,b);
    break;
    case 3:
    c=Multiplicacion(a,b);
    break;
    case 4:
    c=Division(a,b);
    break;
    case 5:
    c=Sin1(a);
    break;
    case 6:
    c=Cos1(a);
    break;
    case 7:
    c=Tan1(a);
    break;
    case 8:
    c=Raizn(a,b);
    break;
    case 9:
    c=Potencia(a, b);
    break;
    case 10:
    c=iva(a,b);
    break;
    } return c;
    
}
    public static void main(String[] args) {
    int cont=0;
    int op = 0;
    do{
    Scanner leer = new Scanner(System.in);
    Consola cal = new Consola();
    System.out.println("Calculadora");

    System.out.println("1.Sumar");
    System.out.println("2.Restar");
    System.out.println("3.multiplicar");
    System.out.println("4.Dividir");
    System.out.println("5.Funcion seno");
    System.out.println("6.Funcion coseno");
    System.out.println("7.Funcion tangente");
    System.out.println("8.Raiz enesima");
    System.out.println("9.Potencia enesima");
    System.out.println("10.IVA");
    System.out.println("Digite la opcion que desea:");
    op=leer.nextInt();
    
        if (op >= 1 && op <= 10) {
        
    System.out.println("numero uno: ");
    cal.a=leer.nextDouble();
    System.out.println("Numero dos: ");
    cal.b=leer.nextDouble();
    cal.resultado=cal.opcion(op,cal.a,cal.b);
    System.out.println("resultado: "+cal.resultado);
    System.out.println("Desea realizar otra accion? 1.si 0.no");
    cont=leer.nextInt();
    }
    else
        {
            System.out.println("Dato incorrecto");
                System.out.println("Desea realizar otra accion? 1.si 0.no");
                 cont=leer.nextInt();
        }
    }while(cont!=0);
    }
    }
