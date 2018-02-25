package prueba;

public class Main_Modified 
{
  public static void main (String [] args) {
    GenericTupla [] estadios = new GenericTupla [4]; //agregué un espacio más al arreglo de GenericTupla (antes ObjectTupla)
    estadios [0] = new GenericTupla<> ("Santiago Bernabéu", 125000);
    estadios [1] = new GenericTupla<> ("Camp Nou", "109901");
    estadios [2] = new GenericTupla<> ("Old Trafford", "97233");
    estadios [3] = new GenericTupla<> ("Wembley", 133500); //agregué otro estadio para hacer la prueba
    for (GenericTupla estadio : estadios) {
        System.out.println(estadio);
    }
    System.out.println("\nEl estadio con mayor capacidad es: "+estadio_mayor_capacidad(estadios));
  }

  /**
   * Devuelve el estadio con mayor capacidad
   * 
   * @param estadios Un arreglo de ObjectTupla(Genérico) donde cada par contiene el nombre del estadio seguido de un entero con su capacidad
   * @return el nombre del estadio con mayor capacidad
   */
  
  public static String estadio_mayor_capacidad (GenericTupla [] estadios) //Ordena usando método de burbuja con los valores enteros
  {
    for(int i=0;i<(estadios.length-1);i++){
        for(int j=i+1;j<estadios.length;j++){
            if(Integer.parseInt(estadios[i].getSecond().toString())<Integer.parseInt(estadios[j].getSecond().toString())){
                GenericTupla aux=estadios[i];
                estadios[i]=estadios[j];
                estadios[j]=aux;
            }
        }
    }    
    return estadios[0].toString();
  }
}
