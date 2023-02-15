package calculadora;


public class Operaciones {
    
   private String cadena;
   private double resultado;
   private boolean suma;
   private boolean resta;
   private boolean multiplicacion;
   private boolean division;
   private boolean raiz;
   private boolean seno;
   private boolean coseno;
   private boolean tangente;
   private boolean potencia;
   private boolean iva;

   
   
   public Operaciones(){
   
       cadena="";
       suma=false;
       resta=false;
       multiplicacion=false;
       division=false;
       raiz=false;
       seno=false;
       coseno=false;
       tangente=false;
       potencia=false;
       iva=false;

               
   
   }
   
   
   public String concatenamiento(String cadena){
   
       this.cadena=this.cadena+cadena;
       return this.cadena;
       
   
   }
   
   public void suma(String cadena){
   
       this.resultado=Double.parseDouble(cadena);
       suma=true;
       this.cadena="";
   
   }
   
    public void resta(String cadena){
   
       this.resultado=Double.parseDouble(cadena);
       resta=true;
       this.cadena="";
   
   }
    
     public void multiplicacion(String cadena){
   
       this.resultado=Double.parseDouble(cadena);
       multiplicacion=true;
       this.cadena="";
   
   }
     
      public void division(String cadena){
   
       this.resultado=Double.parseDouble(cadena);
       division=true;
       this.cadena="";
   
   }
      
       public void raiz(String cadena){
   
       this.resultado=Double.parseDouble(cadena);
       raiz=true;
       this.cadena="";
   
   }
       
        public void seno(String cadena){
   
       this.resultado=Double.parseDouble(cadena);
       seno=true;
       this.cadena="";
   
   }
        
         public void coseno(String cadena){
   
       this.resultado=Double.parseDouble(cadena);
       coseno=true;
       this.cadena="";
   
   }
         
          public void tangente(String cadena){
   
       this.resultado=Double.parseDouble(cadena);
       tangente=true;
       this.cadena="";
   
   }
              
               public void potencia(String cadena){
   
       this.resultado=Double.parseDouble(cadena);
       potencia=true;
       this.cadena="";
   
   }
              
               public void iva(String cadena){
   
       this.resultado=Double.parseDouble(cadena);
       potencia=true;
       this.cadena="";
   
   }
               public void clear(String cadena){
   
       this.resultado=Double.parseDouble(cadena);
       potencia=true;
       this.cadena="";
       resultado=0;
       
   
   }

               
   public double resultado(String numero){
   
       if(suma==true){
           
       resultado=resultado+Double.parseDouble(numero);
       
       }
       
       else if(resta==true){
           
       resultado=resultado-Double.parseDouble(numero);
       
       }
       
           else if(multiplicacion==true){
           
       resultado=resultado*Double.parseDouble(numero);
       
       }
       
           else if(division==true){
           if(Double.parseDouble(numero)<0)
           {
                resultado=0;
           }
           else
           {
                resultado=resultado/Double.parseDouble(numero);
           }
      
       
       }
       
           else if(raiz==true){
           
       if(resultado<0)
           {
                resultado=0;
           }
           else
           {
                 resultado=Math.sqrt(Double.parseDouble(numero));
           }
              
       }
       
           else if(seno==true){
           
               double seno=Math.toRadians(resultado);
               resultado=Math.sin(seno);
           }
       
        else if(coseno==true){
           
               double coseno=Math.toRadians(resultado);
               resultado=Math.cos(coseno);
           }
       
        else if(tangente==true){
           
               double tangente=Math.toRadians(resultado);
               resultado=Math.tan(tangente);
           }      
        else if(potencia==true){
        
            resultado=Math.pow(resultado, Double.parseDouble(numero));
        }
       else if(iva==true){
        
            resultado=resultado*(1+((Double.parseDouble(numero))/100));
        }
       
       suma=false;
       resta=false;
       multiplicacion=false;
       division=false;
       raiz=false;
       seno=false;
       coseno=false;
       tangente=false;
       potencia=false;
       iva=false;
       
       return resultado;
       
   }
}
               
    
