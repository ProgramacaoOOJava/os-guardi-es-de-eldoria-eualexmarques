package nivel_novato;

public class Main {
    public static void main(String[] args) {
        guerreiro guerreiro1 = new guerreiro("Maximus", "Barbaro", 80, 40, 75.9);
        guerreiro guerreiro2 = new guerreiro("Sir. Tetos", "Bardo", 12, 70, 6);
        guerreiro1.exibirStatus();
        guerreiro2.exibirStatus();
    }
}