package nivel_aventureiro;

//Subclasse barbaro que herda do guerreiro
public class barbaro extends guerreiro {
    String arma;
    public barbaro (String nome, int nivel, int ptvida, double poderBase, String arma){
        super(nome, "Barbaro", nivel, ptvida, poderBase);
        this.arma = arma;
    }

    @Override
    public void usarHabilidadeEspecial(){
        System.out.println("Barbaro " + nome + " ataca com " + arma + " de gelo!\n");
    }
}
