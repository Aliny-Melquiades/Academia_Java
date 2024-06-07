package pacote;
import java.util.Scanner;

public class Imposto {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu salário: ");
        double salario = sc.nextDouble();

        sc.close();
        		
        	//Isento
        	if (salario <= 1903.98) {
			        System.out.print(salario + " - Isento De Pagar IR."); }
        	
        	//7.5%
        	else if (salario <= 2826.65) {
		        System.out.print(salario - (salario * 0.075) + " - Salário com Imposto descontado."); }        
                 
        	//15%
        	else if (salario <= 3751.05) {
		        System.out.print(salario - (salario * 0.15) + " - Salário com Imposto descontado."); }  
        	
            //22.5%                              }
            else if (salario <= 4664.68) {
            	System.out.print(salario - (salario * 0.255) + " - Salário com Imposto descontado."); }  
        	
        	//27.5%
            else {
            	System.out.print(salario - (salario * 0.245) + " - Salário com Imposto descontado."); } 
             }
           }
       
