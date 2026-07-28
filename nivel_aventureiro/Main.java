package nivel_aventureiro;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Criando guerreiros
        barbaro guerreiro1 = new barbaro("Maximus", 80, 50, 90, "machado");
        mago guerreiro2 = new mago("Blake", 50, 70, 55.7, "necromancia");

        guerreiro1.exibirStatus();
        guerreiro2.exibirStatus();

        guerreiro1.usarHabilidadeEspecial();
        guerreiro2.usarHabilidadeEspecial();

        //Estrutura para armazenar guerreiros
        ArrayList<guerreiro> guerreiros = new ArrayList<>();
        guerreiros.add(guerreiro1);
        guerreiros.add(guerreiro2);

        //Iterando sobre a lista e chamando métodos Polimorfismo
        for (guerreiro p : guerreiros){
            p.exibirStatus();
            p.usarHabilidadeEspecial();
        }

    }
}
