package com.mycompany.meuprojeto5;

import javax.swing.JOptionPane;

public class Meuprojeto5 {

    public static void main(String[] args) {
       int idade, vgood = 0, bad = 0,full_idade = 0, repeat = 1, horrible = 0, participation = 40;
       char opniao;
       double horriporcent;
       double bad_Y = 0;
       String opconv;

    //utilizei o comando while para criar a repetição
       while (repeat <= 40) {
      repeat++;
    
    //essa linha pedira que o usuario insira a idade 
       idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade: "));
    
    //aqui a interface pedira que o usuario insira uma nota
       opconv = JOptionPane.showInputDialog("Qual a sua opnião em relação ao filme? \n A - Ótimo /  B - Bom / C - Regular  / D - Ruim  / E -  Péssimo. ");
    //essa linha convertera o valor da String recebida pelo console para char   
       opniao = opconv.charAt(0);
    
    //aqui inicia os if e apenas tres deles são importantes pois iram armazenar a quantidade de usuarios, já os outros apenas coloquei para adicionar o dialogo de agradecimento ao usuario.
       if (opniao == 'A') {
       vgood++;
      JOptionPane.showMessageDialog(null,"Obrigado pelo seu feedback.");
    }
       if (opniao == 'B') {
           JOptionPane.showMessageDialog(null,"Obrigado pelo seu feedback.");
       }
       if (opniao == 'C') {
           JOptionPane.showMessageDialog(null,"Obrigado pelo seu feedback.");
       }
       //esse if em especifico foi necessario armazenar o valor da idade dos usuarios que escolheram D em uma variavel
       //apos isso foi necessario dividir esse valor pela quantidade de usuarios que a escolheram, chegando assim a media.
       if (opniao == 'D') {
           bad++;
           full_idade +=idade;
           bad_Y = full_idade / (double) bad;
           JOptionPane.showMessageDialog(null,"Obrigado pelo seu feedback.");
       }
       if (opniao == 'E') {
           horrible++;
           JOptionPane.showMessageDialog(null,"Obrigado pelo seu feedback.");
       } 
         }
       //esse é o clculo utilizado para conseguir a porcentagem de pessoas que escolheram "péssimo". 
       horriporcent = (horrible  / (double) participation) * 100 ;
       
       //a interface final que mostra o resultado da pesquisa
       JOptionPane.showMessageDialog(null, "Quantidade de respostas 'Ótimo': " +vgood +"\nMédia de idade das pessoas que responderam 'Ruim': " +bad_Y  +"\nPorcentagem de respostas 'Péssimo': " +horriporcent +"%");
    }
}
