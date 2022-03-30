
package notaaluno2;

import javax.swing.JOptionPane;


public class Media {
    public static void main(String[] args) {
        String primeiroNumero,segundoNumero,terceiroNumero,quartoNumero;
        int nota1,nota2,nota3,nota4,soma=0;
        double media=0;

        primeiroNumero = JOptionPane.showInputDialog("Digite a primeira nota:");
        segundoNumero = JOptionPane.showInputDialog("Digite a segunda nota:");
       terceiroNumero = JOptionPane.showInputDialog("Digite a terceira nota:");
       quartoNumero = JOptionPane.showInputDialog("Digite a quarta nota:");
       nota1 = Integer.parseInt(primeiroNumero);
       nota2 = Integer.parseInt(segundoNumero);
       nota3 = Integer.parseInt(terceiroNumero);
       nota4 = Integer.parseInt(quartoNumero);
       soma = nota1+nota2+nota3+nota4;
       media = soma/4;
       if(media>=7)
           System.out.println("Média:" +media+ "Aprovado");
       else
           System.out.println("Média:" +media+ "Reprovado");
       System.exit(0);
    }
    }

