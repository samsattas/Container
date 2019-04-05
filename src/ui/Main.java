package ui;

import model.*;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		

		System.out.println("--------------------------------------------------------------");
		System.out.println("--------------------------Bienvenido--------------------------");
		System.out.println("--------------------------------------------------------------");
		System.out.println("Inserte el ancho del contenedor 1:");
		double w1 = s.nextDouble();
		System.out.println("Inserte el largo del contenedor 1:");
		double l1 = s.nextDouble();
		System.out.println("Inserte la altura del contenedor 1:");
		double h1 = s.nextDouble();
		Container con1 = new Container(w1, l1, h1);
		System.out.println("--------------------------------------------------------------");

		System.out.println("\n--------------------------------------------------------------");
		System.out.println("Inserte el ancho del contenedor 2:");
		double w2 = s.nextDouble();
		System.out.println("Inserte el largo del contenedor 2:");
		double l2 = s.nextDouble();
		System.out.println("Inserte la altura del contenedor 2:");
		double h2 = s.nextDouble();
		Container con2 = new Container(w2, l2, h2);
		System.out.println("--------------------------------------------------------------");

		System.out.println("\n--------------------------------------------------------------");
		System.out.println("Inserte el ancho del contenedor 3:");
		double w3 = s.nextDouble();
		System.out.println("Inserte el largo del contenedor 3:");
		double l3 = s.nextDouble();
		System.out.println("Inserte la altura del contenedor 3:");
		double h3 = s.nextDouble();
		Container con3 = new Container(w3, l3, h3);
		System.out.println("--------------------------------------------------------------");

		Import imp = new Import(con1, con2, con3);

		System.out.println("\n--------------------------------------------------------------");
		System.out.println("Tama\u00f1o del contenedor #1: " + w1 + " x " + l1 + " x " + h1);
		System.out.println("Tama\u00f1o del contenedor #2: " + w2 + " x " + l2 + " x " + h2);
		System.out.println("Tama\u00f1o del contenedor #3: " + w3 + " x " + l3 + " x " + h3);

		System.out.println("\nEl volumen total es: " + imp.cVolTotal());
		System.out.println("El promedio es: " + imp.cAverage());
		System.out.println("--------------------------------------------------------------");
		
	}
}