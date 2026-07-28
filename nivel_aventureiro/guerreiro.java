package nivel_aventureiro;

//Classe abstrata que serve como superclasse para todos os guerreiros
public abstract class guerreiro {
    String nome;
    String classe;
    int nivel;
    int ptvida;
    double poderBase;

    //Construtor da superclasse 
    public guerreiro(String nome, String classe, int nivel, int ptvida, double poderBase){
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.ptvida = ptvida;
        this.poderBase = poderBase;
    }

    //Método para exibir status
    public void exibirStatus(){
        System.out.println("Nome: " + nome + "\nClasse: " + classe + "\nNivel: " + nivel + "\nPontos de vida: " + ptvida + "\nPoder base: " + poderBase + "\n");
    }

    //Método abstrato que será sobrescrito sobre pelas subclasses
    public abstract void usarHabilidadeEspecial();
    
}
