package PrimeiraAula;

import java.util.Scanner;

public class Mian {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		/*Fazer um programa para ler as medidas dos lados de dois triângulos X e Y (suponha medidas
		válidas). Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos
	possui a maior área.
	A fórmula para calcular a área de um triângulo a partir das medidas de seus lados a, b e c é a
	seguinte (fórmula de Heron):*/
		
		double Xa , Xb, Xc , Ya, Yb, Yc , AreaX, AreaY;
		
		System.out.println("Informe os valores de a b c do triangulo X ");
		Xa =  sc.nextDouble();
		Xb =  sc.nextDouble();
		Xc =  sc.nextDouble();
		
		System.out.println("Informe os valores de a b c do triangulo Y ");
		Ya =  sc.nextDouble();
		Yb =  sc.nextDouble();
		Yc =  sc.nextDouble();
		
		double px = (Xa + Xb + Xc) / 2.0;
		double py = (Ya +Yb+Yc) / 2.0;
		
		AreaX = Math.sqrt(px * (px - Xa) * (px - Xb) * (px - Xc));
		AreaY = Math.sqrt(py*(py - Ya)* (py - Yb) *(py - Yc));
		
		System.out.println("Valor da area de X : "+ AreaX);
		System.out.println("Valor da area de X : "+ AreaY);

		if(AreaX > AreaY)
		{
			System.out.println("A mario area e do : X ");
		}else {
			System.out.println("A mario area e do : Y ");
		}
		
		
		
	}
			
}
