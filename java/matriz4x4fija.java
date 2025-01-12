/*
TODO CODE
En una tabla de 4 filas y 4 columnas se guardan 
las notas de 4 alumnos de secundaria. Cada fila 
corresponde a las notas y al promedio de cada alumno.
 Se necesite un programa que permita a un profesor 
 cargar, en las 3 posiciones (columnas) de cada fila,
  las notas del alumno y que en la última columna se 
  calculen los promedios. Una vez realizados los 
  cálculos, se desea mostrar las 3 notas de cada 
  alumno y el promedio
correspondiente recorriendo la matriz */

import java.util.*;
public class matriz4x4fija {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    //crear matriz
    double notas [][] = new double[4][4];

    //llenar matriz
    for(int i = 0 ; i < 4 ; i++){
      System.out.println("ingresa notas del estidiante N"+( i + 1)+":");
      double suma = 0; 

      for(int j = 0 ; j < 3 ; j++){
        System.out.println("nota N" + ( j + 1 ) + ":");
        notas [i][j] = scanner.nextDouble();
        suma += notas[i][j];
      }
    //calcular el promedio y guardarlo en la ultima colubna
    notas[i][3] = suma / 3;
    }



    //mostrar matriz

    for (int i = 0; i < 4; i++) {
      System.out.println("notas de estudiante N" + (i+1));
      for (int j = 0; j < 3; j++) {
        System.out.println("nota N" + (j+1)+":");
        notas [i][j] = scanner.nextDouble();

      }
      System.out.println(notas[i][3]);
    }



  }
}