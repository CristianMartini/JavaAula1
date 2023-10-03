/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.javaflix;

/**
 *
 * @author cristian.martini
 */
public class Javaflix {

    public static void main(String[] args) {
        Filme meuFilme =new Filme();
        
        meuFilme.nome="Agente Stone";
        meuFilme.anoDeLancamento=2023;
        meuFilme.duracaoEmMinutos =180;
   
    meuFilme.exibeFichaTecnica();
    meuFilme.avalia(8);
     meuFilme.avalia(5);
     meuFilme.avalia(9);
     
        System.out.println(meuFilme.somaDasAvaliacoes);
        System.out.println(meuFilme.totalDeAvaliacoes);
        System.out.println(pegaMedia);
}
 }