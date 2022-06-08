import java.util.Scanner;
public class exercicio1{

public static void main(String[] args) {
Scanner entrada = new Scanner (System.in);
double h,b,B,area;

System.out.println("Digite a altura");
h = entrada.nextDouble();

System.out.println("Digite a base menor");
b = entrada.nextDouble();

System.out.println("Digite a base maior");
B = entrada.nextDouble();

area = (h * (b + B)) / 2;

System.out.println("O valor da área é:" + area);





}    
}

// Implemente um programa para calcular a área de um trapézio, onde:
//h = altura
//b = base menor
//B = base maior
//Área = (h . (b + B)) / 2
