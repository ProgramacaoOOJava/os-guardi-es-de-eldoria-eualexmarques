package nivel_novato;

public class guerreiro {
    String nome;
    String classe;
    int nivel;
    int ptvida;
    double poderBase;

    public guerreiro(String nome, String classe, int nivel, int ptvida, double poderBase){
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.ptvida = ptvida;
        this.poderBase = poderBase;
    }

    public void exibirStatus(){
        System.out.println("Nome: " + nome + "\nClasse: " + classe + "\nNivel: " + nivel + "\nPontos de vida: " + ptvida + "\nPoder base: " + poderBase + "\n");
    }
}