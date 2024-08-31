package jackson.rocha;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Banco {
    private static final int DEFAULT_AGENCIA = 1;
    private String nome;
    private List<Conta> contas;

    public Banco() {
        this.nome = "";
        this.contas = new ArrayList<>();
    }

    public Banco(String nome, List<Conta> contas) {
        this.nome = nome;
        this.contas = contas;
    }
}
