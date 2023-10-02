public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", 30);

        // Exibe informações iniciais da pessoa
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());

        // Modifica as informações da pessoa
        pessoa.setNome("Maria");
        pessoa.setIdade(25);

        // Exibe as informações modificadas da pessoa
        System.out.println("Nome modificado: " + pessoa.getNome());
        System.out.println("Idade modificada: " + pessoa.getIdade());
    }
}
Nome: João
Idade: 30
Nome modificado: Maria
Idade modificada: 25
