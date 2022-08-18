/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package joption;

import javax.swing.JOptionPane;

/**
 *
 * @author João P. Arquim
 */
public class JOption {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //variaveis criadas para o programa
        int numero; 
        int cont = 0;
        int contpar = 0;
        int contimp = 0;
        int contcem = 0;
        float media;
        int soma = 0;
        
        //usando o laço de repetição do-while para a janela aparecer até sair da condição
        do{
            //convertendo o valor da janela de input para inteiro 
            numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um valor:\n(0)Interrompe", "Entrada de dados", JOptionPane.INFORMATION_MESSAGE));
            cont++;//incremento no total de valores
            //incrementa quando o numero for par
            if(numero%2==0){
                contpar++;
            }
            //incrementa quando o numero for impar
            if(numero%2==1){
                contimp++;
            }
            //incrementa quando o numero for maior que 100
            if(numero>100){
                contcem++;
            }
            soma = soma + numero;
        }while(numero != 0);
        
        //fazendo o cálculo da media de todos os numeros
        media = soma / cont;
        
        //criando outra janela para mostrar os resultados
        JOptionPane.showMessageDialog(null, "Resultado:\n-------------------\nTotal de Valores: " + cont + "\nTotal de Pares: " + contpar + "\nTotal de Ímpares: " + contimp + "\nAcima de 100: " + contcem + "\nMedia dos valores: " + media, "Resultado Final", JOptionPane.INFORMATION_MESSAGE);
        
        
     
    }
    
}
