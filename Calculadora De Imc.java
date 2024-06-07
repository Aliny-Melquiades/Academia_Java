package pacote;
import java.util.Scanner;

	public class Calculadora {

		        public static void main(String[] args) {
		        	
		        Scanner sc = new Scanner(System.in);
		        
		        System.out.print("Qual seu peso? ");
		        double peso = sc.nextDouble();
		        
		        System.out.print("Qual sua altura? ");
		        double altura = sc.nextDouble();
		        
		       //Calcula o IMC com a precisão de 2 casas decimais.
		        double imc = peso / (altura * altura);
		       
		        System.out.printf("O seu IMC é: %.2f", imc);
		        
		        
		        //De acordo com o resultado, mostra sua classificação.
		        if (imc <= 16) {
		        	System.out.print("\nBaixo peso - muito grave"); }
		        	
		        else if (imc >= 16 && imc <= 16.99) {
			        System.out.print("\nBaixo peso - grave"); }
		        		
		        else if (imc >= 17 && imc <= 18.49) {
			        System.out.print("\nBaixo peso"); }
		        
		        else if (imc >= 18.50 && imc <= 24.99) {
			        System.out.print("\nPeso normal"); }
		        
		        else if (imc >= 25 && imc <= 29.99) {
			        System.out.print("\nSobrepeso"); }
		        
		        else if (imc >= 30 && imc <= 34.99) {
			        System.out.print("\nObesidade Grau I"); }
		        
		        else if (imc >= 35 && imc <= 39.99) {
			        System.out.print("\nObesidade Grau II"); }
		       
		        else if (imc >= 40) {
			        System.out.print("\nObesidade Grau III (Mórbida)"); }
		    }
	}


