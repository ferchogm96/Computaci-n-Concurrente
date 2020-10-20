import java.util.LinkedList;
import java.io.*;

public class MultiplicaMatrices {
	private File archivoSalida;
	/**
	    Se crea el numero especifico de readers y writers.
	    @param args[0] Numero de hilos.
	    @param args[1] Nombre del archivo que contiene los coeficientes de la matriz A, para multiplicar.
	 */
	 
	public static void main(String[] args) {
		int numHilos = Integer.parseInt(args[0]);
		String nombreArchivo = args[1];
		
		System.out.println("Numero de hilos asignado: "+ numHilos);
		System.out.println("Nombre del archivo ingresado: " + nombreArchivo);

		//EscribeFichero a = new EscribeFichero();
	    String r1 = "mat10";
	    String r2 = "mat100";
	    String r3 = "mat1000";
	    
	    //CASO EN EL QUE LEE EL ARCHIVO MAT10
	    if(r1.equals(nombreArchivo)){
	      String ruta1 = "./mat10";
	      int[][] m1 = new MultiplicaMatrices().leerTxt(ruta1);
	      if (numHilos == 1){
			long ini1 = System.currentTimeMillis();
			int[][] resultado1 = multiplicaSec(m1, m1);
			long fin1 = System.currentTimeMillis();
			long tiempo01 = fin1-ini1;
			System.out.println("El tiempo en el algoritmo SECUENCIAL tarda: " + tiempo01 + " millisegundos."+"\n");
			//comienza la escritura del fichero con la matriz y el tiempo.
			String sFichero = "producto.txt";
			File fichero = new File(sFichero);
			BufferedWriter bw;
			try{
     			bw = new BufferedWriter(new FileWriter(sFichero));
     			bw.write("El tiempo en el algoritmo SECUENCIAL tarda: " + tiempo01 + " millisegundos."+"\n");
				// Se saca por pantalla el resultado, AQUI MODIFICAR PARA ESCRIBIR EN FICHERO.
				for (int i=0;i<resultado1.length; i++){
					for (int j=0;j<resultado1[0].length;j++)
						bw.write(resultado1[i][j]+" ");
					bw.write(" ");
				}
				
				bw.close();
  			}catch (IOException ioe){
  				ioe.printStackTrace();
    		}
			
		}else{
			// Se multiplican y saca el tiempo en millisegundos
			long ini2 = System.currentTimeMillis();
			int [][] resultado2 = new MultiplicaMatrices().multiplicaConc(m1, m1);
			long fin2 = System.currentTimeMillis();
			long tiempo02 = fin2-ini2;
			System.out.println("El tiempo en el algoritmo CONCURRENTE tarda: " + tiempo02 + " millisegundos."+"\n");
			//comienza la escritura del fichero con la matriz y el tiempo.
			String sFichero = "producto.txt";
			File fichero = new File(sFichero);
			BufferedWriter bw;
			try{
     			bw = new BufferedWriter(new FileWriter(sFichero));
     			bw.write("El tiempo en el algoritmo CONCURRENTE tarda: " + tiempo02 + " millisegundos."+"\n");
				// Se saca por pantalla el resultado, AQUI MODIFICAR PARA ESCRIBIR EN FICHERO.
				for (int i=0;i<resultado2.length; i++){
					for (int j=0;j<resultado2[0].length;j++)
						bw.write(resultado2[i][j]+" ");
					bw.write(" ");
				}
				
				bw.close();
  			}catch (IOException ioe){
  				ioe.printStackTrace();
    		}
    	}
	      
	    }else if(r2.equals(nombreArchivo)){//CASO EN EL QUE LEE EL ARCHIVO MAT100
	      String ruta2 = "./mat100";
	      int[][] m1 = new MultiplicaMatrices().leerTxt(ruta2);
	      if (numHilos == 1){
			long ini1 = System.currentTimeMillis();
			int[][] resultado1 = multiplicaSec(m1, m1);
			long fin1 = System.currentTimeMillis();
			long tiempo01 = fin1-ini1;
			System.out.println("El tiempo en el algoritmo SECUENCIAL tarda: " + tiempo01 + " millisegundos."+"\n");
			
			//comienza la escritura del fichero con la matriz y el tiempo.
			String sFichero = "producto.txt";
			File fichero = new File(sFichero);
			BufferedWriter bw;
			try{
     			bw = new BufferedWriter(new FileWriter(sFichero));
     			bw.write("El tiempo en el algoritmo SECUENCIAL tarda: " + tiempo01 + " millisegundos."+"\n");
				// Se saca por pantalla el resultado, AQUI MODIFICAR PARA ESCRIBIR EN FICHERO.
				for (int i=0;i<resultado1.length; i++){
					for (int j=0;j<resultado1[0].length;j++)
						bw.write(resultado1[i][j]+" ");
					bw.write(" ");
				}
				
				bw.close();
  			}catch (IOException ioe){
  				ioe.printStackTrace();
    		}
		}else{
			// Se multiplican y saca el tiempo en millisegundos
			long ini2 = System.currentTimeMillis();
			int [][] resultado2 = new MultiplicaMatrices().multiplicaConc(m1, m1);
			long fin2 = System.currentTimeMillis();
			long tiempo02 = fin2-ini2;
			System.out.println("El tiempo en el algoritmo CONCURRENTE tarda: " + tiempo02 + " millisegundos."+"\n");
			//comienza la escritura del fichero con la matriz y el tiempo.
			String sFichero = "producto.txt";
			File fichero = new File(sFichero);
			BufferedWriter bw;
			try{
     			bw = new BufferedWriter(new FileWriter(sFichero));
     			bw.write("El tiempo en el algoritmo CONCURRENTE tarda: " + tiempo02 + " millisegundos."+"\n");
				// Se saca por pantalla el resultado, AQUI MODIFICAR PARA ESCRIBIR EN FICHERO.
				for (int i=0;i<resultado2.length; i++){
					for (int j=0;j<resultado2[0].length;j++)
						bw.write(resultado2[i][j]+" ");
					bw.write(" ");
				}
				
				bw.close();
  			}catch (IOException ioe){
  				ioe.printStackTrace();
    		}
			
		}
	    }else if(r3.equals(nombreArchivo)){ //CASO EN EL QUE LEE EL ARCHIVO MAT1000
	      String ruta3 = "./mat1000";
	      int[][] m1 = new MultiplicaMatrices().leerTxt(ruta3);
	      if (numHilos == 1){
			long ini1 = System.currentTimeMillis();
			int[][] resultado1 = multiplicaSec(m1, m1);
			long fin1 = System.currentTimeMillis();
			long tiempo01 = fin1-ini1;
			System.out.println("El tiempo en el algoritmo SECUENCIAL tarda: " + tiempo01 + " millisegundos."+"\n");
			//comienza la escritura del fichero con la matriz y el tiempo.
			String sFichero = "producto.txt";
			File fichero = new File(sFichero);
			BufferedWriter bw;
			try{
     			bw = new BufferedWriter(new FileWriter(sFichero));
     			bw.write("El tiempo en el algoritmo SECUENCIAL tarda: " + tiempo01 + " millisegundos."+"\n");
				// Se saca por pantalla el resultado, AQUI MODIFICAR PARA ESCRIBIR EN FICHERO.
				for (int i=0;i<resultado1.length; i++){
					for (int j=0;j<resultado1[0].length;j++)
						bw.write(resultado1[i][j]+" ");
					bw.write(" ");
				}
				
				bw.close();
  			}catch (IOException ioe){
  				ioe.printStackTrace();
    		}
		}else{
			// Se multiplican y saca el tiempo en millisegundos
			long ini2 = System.currentTimeMillis();
			int [][] resultado2 = new MultiplicaMatrices().multiplicaConc(m1, m1);
			long fin2 = System.currentTimeMillis();
			long tiempo02 = fin2-ini2;
			System.out.println("El tiempo en el algoritmo CONCURRENTE tarda: " + tiempo02 + " millisegundos."+"\n");
			//comienza la escritura del fichero con la matriz y el tiempo.
			String sFichero = "producto.txt";
			File fichero = new File(sFichero);
			BufferedWriter bw;
			try{
     			bw = new BufferedWriter(new FileWriter(sFichero));
     			bw.write("El tiempo en el algoritmo CONCURRENTE tarda: " + tiempo02 + " millisegundos."+"\n");
				// Se saca por pantalla el resultado, AQUI MODIFICAR PARA ESCRIBIR EN FICHERO.
				for (int i=0;i<resultado2.length; i++){
					for (int j=0;j<resultado2[0].length;j++)
						bw.write(resultado2[i][j]+" ");
					bw.write(" ");
				}
				
				bw.close();
  			}catch (IOException ioe){
  				ioe.printStackTrace();
    		}
		}
	    } else{
	      System.out.println("Archivo no valido");
	    }
		
		
	}
	
	/**
	 * Realiza la multiplicación de las dos matrices y devuelve el resultado
	 * @param m1 primer operando
	 * @param m2 segundo operando
	 * @return resultado de multiplicar m1xm2 en secuencial
	 */
	public static int[][] multiplicaSec (int [][] m1, int [][] m2){
		int[][] resultado = new int[m1.length][m2[0].length];
		// se comprueba si las matrices se pueden multiplicar
		if (m1[0].length == m2.length) {
		    for (int i = 0; i < m1.length; i++) {
		        for (int j = 0; j < m2[0].length; j++) {
		            for (int k = 0; k < m1[0].length; k++) {
		                // aquí se multiplica la matriz
		                resultado[i][j] += m1[i][k] * m2[k][j];
		            }
		        }
		    }
		}
		//si no se cumple la condición se retorna una matriz vacía
		return resultado;
	}

	/**
	 * Realiza la multiplicación de las dos matrices y devuelve el resultado
	 * @param m1 primer operando
	 * @param m2 segundo operando
	 * @return resultado de multiplicar m1xm2 en concurrente
	 */
	public int[][] multiplicaConc (int [][] m1, int [][] m2){
		
		// Calculo de las dimensiones de la matriz resultado y
		// reserva de espacio para ella
		int filas = m1.length;
		int columnas = m2[0].length;
		int [][] resultado = new int[filas][columnas];
		
		// Lista con todos los hilos lanzados.
		LinkedList<Thread> hilos = new LinkedList<Thread>();
		
		// Para cada elemento de la matriz resultado, se lanza el hilo correspondiente.
		for (int fila=0; fila<filas; fila++)
			for (int columna=0; columna<columnas; columna++)
			{
				Thread hilo = new Thread(new HiloMultiplicador(m1,m2,resultado,fila,columna));
				hilos.add(hilo);
				hilo.start();
			}
		
		// Se espera que terminen todos los hilos
		for (Thread hilo: hilos)
			try {
				hilo.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		// se devuelve el resultado obtenido	
		return resultado;
	}

	/**
	 * Lee lo que se encuentra dentro del archivo y lo regresa.
	 * @param ruta recibe el nombre del archivo a leer (mat10, mat100 ó mat1000)
	 * @return regresa la matriz dentro del archivo
	 */
	public int[][] leerTxt(String ruta){
    	String texto = "";
    	BufferedReader reader;
    	int [][] m1 = null;
	    try{
	    	reader = new BufferedReader(new FileReader(ruta));
	     	String line = reader.readLine();
	     	String [] temp = line.split(" ");
	     	m1 = new int[temp.length][temp.length];
	     	int fila = 0;

	      	while(line != null){
	        	for (int i=0; i< temp.length; i++ ) {
					m1[fila][i] = Integer.parseInt(temp[i]);
				}
				line = reader.readLine();
				if(line != null){
					temp = line.split(" ");
					fila++;
				}
	     	}
	      	reader.close();
	    }catch(Exception e){
	    	System.out.println("Excepcion: NO se encontro archivo.");
	    }
    	return m1;
	}

}



/**
 * Calcula uno de los elementos de la matriz resultado
 */
class HiloMultiplicador implements Runnable{
	private int[][] m1;
	private int[][] m2;
	private int[][] resultado;
	private int fila;
	private int columna;
	
	/**
	 * Guarda los parámetros que se le pasan 
	 * @param m1 primera matriz
	 * @param m2 segunda matriz
	 * @param resultado matriz donde dejar el resultado
	 * @param fila fila que debe calcular
	 * @param columna columna que debe calcular
	 */
	public HiloMultiplicador (int[][] m1, int[][]m2, int[][]resultado, int fila, int columna){
		this.m1 = m1;
		this.m2 = m2;
		this.resultado = resultado;
		this.fila = fila;
		this.columna = columna;
	}

	/**
	 * Calcula el elemento fila,columna de la matriz resultado
	 */
	public void run(){
		resultado[fila][columna]=0;
		for (int i=0;i<m2.length;i++)
			resultado[fila][columna]+=m1[fila][i]*m2[i][columna]; 
	}
}