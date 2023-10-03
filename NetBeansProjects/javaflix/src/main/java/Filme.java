/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cristian.martini
 */

public class Filme {
  private String nome;
  private double somaDasAvaliacoes;
  private int anoDeLancamento;
  private boolean incluidoNoPlano;
  private int totalDeAvaliacoes;
  private int duracaoEmMinutos;

  

  private void exibeFichaTecnica() {
    System.out.println("Nome do filme" + nome);

  }

   private double avalia (double nota){
    this.somaDasAvaliacoes += nota;
    this.totalDeAvaliacoes ++;
      
      private double pegaMedia () {
      return somaDasAvaliacoes / totalDeAvaliacoes;
    }
  }
}
