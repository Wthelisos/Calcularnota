package manu;

import java.util.Scanner;

public class Notastrimestres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// variables de las notas 
		int notaPrimerTrimestre;
		int notaSegundoTrimestre;
		int notaTercerTrimestre;
		int NotaMedia;
		double NotaMedia2;
		
// Introduciomos las notas		
		Scanner sc = new Scanner (System.in);
		System.out.print("introduce la Nota del primer trimestre: ");
		notaPrimerTrimestre = sc.nextInt();
		
		System.out.print("introduce la Nota del segundo trimestre: ");
		notaSegundoTrimestre = sc.nextInt();
		
		System.out.print("introduce la Nota del tercer trimestre: ");
		notaTercerTrimestre = sc.nextInt();
// calculamos la nota media 		
		NotaMedia = (notaPrimerTrimestre + notaSegundoTrimestre + notaTercerTrimestre) /3;
//Hacemos la conversion de int al double		
		 NotaMedia2 =(double)(notaPrimerTrimestre + notaSegundoTrimestre + notaTercerTrimestre) /3;
// Mostramos las notas por pantalla		
		System.out.print("tu nota media academica es " +NotaMedia);
		System.out.print(" tu nota media en el expediente es " +NotaMedia2);
	}

}
