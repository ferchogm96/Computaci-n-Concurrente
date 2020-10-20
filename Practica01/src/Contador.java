class Contador implements Runnable {
  private int contador = 0;
  private final int rondas = 100000;
 
  public void run () {
    try{
      String nombre = Thread.currentThread().getName();
        int id = (nombre.equals("hilo1")) ? 1 : 2;

      for(int i = 0; i < rondas; i++) {
        //contador++;
        // synchronized.(this){.    Para resolver la condicion de carrera se puede restringir la forma en que las operaciones de los dos hilos operan sobre la variable compartida. 
        // contador++;              Esta propiedad se le conoce como Exclusion mutua.
        // }
        int tmp = contador;
        contador = tmp + 1;

        if(id == 1 && i==0){
          Thread.sleep(1000);
          System.out.println("El thread 1 va a dormir 1 seg");
          Thread.sleep(100);
          System.out.println("El thread 1 despierta");
        }
      }
    }catch (InterruptedException e) {
      System.out.println ("Se interrumpio el hilo!");
    }
  }
 
  public static void main (String[] args) {
    try {
      Contador c = new Contador();
 
      //Se crean dos hilos que ejecutan el metodo run()
      Thread t1 = new Thread (c, "hilo1");
      Thread t2 = new Thread (c, "hilo2");
 
      t1.start (); t2.start ();
 
      //Espera a que los hilos terminen
      t1.join (); t2.join ();
 
      //Imprime el contador
      System.out.println(c.contador);
    } catch (InterruptedException e) {
      System.out.println ("Se interrumpio el hilo!");
    }
  }
}