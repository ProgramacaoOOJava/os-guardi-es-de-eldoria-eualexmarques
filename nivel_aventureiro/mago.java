package nivel_aventureiro;

//Subclasse mago que herda do guerreiro
public class mago extends guerreiro {
    String magia;
    public mago (String nome, int nivel, int ptvida, double poderBase, String magia){
    super(nome, "Mago", nivel, ptvida, poderBase);
    this.magia = magia;
    }

    @Override
    public void usarHabilidadeEspecial(){
        System.out.println("Mago " + nome + " usa magia de " + magia + "!\n");
    }
}
