package JogoAdivinhacao;
import java.util.ArrayList;

public class jogador {
    private final String nome;
    private final ArrayList<Integer> tentativas; //  lista para guardar tentativas

    public jogador(String nome) {
        this.nome = nome;
        this.tentativas = new ArrayList<>();
    }

    public void adicionarTentativa(int tentativa) {  // adiciona uma tentativa
        tentativas.add(tentativa);
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Integer> getTentativas() {
        return tentativas;
    }
}
