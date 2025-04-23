package JogoAdivinhacao;

public class adivinhacao {
    private final int numeroSecreto;

    public adivinhacao(int numeroSecreto) {
        this.numeroSecreto = numeroSecreto;
        }

    public String verificar(int tentativa) {
        int diferenca = Math.abs(numeroSecreto - tentativa);

        if (tentativa == numeroSecreto) {
            return "Acertou!";
        } else if (diferenca > 30) {
            return "Muito longe\n";
            } else if (diferenca >= 11) {
            return "Longe\n";
            } else if (diferenca >= 2) {
            return "Perto\n";
            } else {
            return "Muito perto\n";
        }
    }
}

