Clase MultiplicaMatrices.java

Este programa multiplica matrices de forma concurrente o secuencial.

Se corre poniendo en terminal $ java MultiplicaMatrices <numHilos> <nombreArchivo>

Donde los archivos disponibles estan mat10, mat100,mat1000
Si se coloca en el parametro de numHilos, el 1, correra en forma secuencial el programa, si lo corres con 2,4 u 8, sera de forma concurrente.
por ejemplo, se debe escribir en terminal para correr:

$ java MultiplicaMatrices 2 mat10

El programa regresara como resultado un archivo llamado producto.txt con la matriz impresa y el tiempo que tardo en ejecutarse.


Se corrio 20 veces de forma secuencial y el promedio de ejecicion fue:
	0 millisegundos en mat10
	26.53 millisegundos en mat100
	11148.6 millisegundos en mat1000


Se corrio 20 veces de forma concurrente con 2 hilos y el promedio de ejecicion fue:
	21.91 millisegundos en mat10
	1729.1 millisegundos en mat100
	167104.3 millisegundos en mat1000









