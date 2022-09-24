/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio;
import java.util.*;
/**
 *
 * @author aluno
 */
public class Exercicio {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite o número do mês: ");
        int mes = s.nextInt(); 
           
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};

         try {
             
                System.out.println("Mês digitado é:  " + meses[mes]);   

            }

        catch (ArrayIndexOutOfBoundsException erro){
            System.out.println(erro.getMessage());
            System.out.println("Valor inserido é inválido: "); 
            
        }
        finally{
        
        // TODO code application logic here
    }
    
}
}