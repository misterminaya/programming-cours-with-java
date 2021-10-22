public class Promedio{
  public static void main(String args[]){
    int matematica = 5;
    int biologia = 8;
    int quimica = 3;
    int promedio = 0;

    promedio = (matematica + biologia + quimica) / 3;
    
    if(promedio >= 6){
       System.out.println("El alumno aprobó: " + promedio);       
  } else{
      System.out.println("El alumnno desaprobo: " + promedio);
  }    
 }  
}