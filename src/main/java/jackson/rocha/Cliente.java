package jackson.rocha;

import lombok.Getter;
import lombok.Setter;

public class Cliente implements Pessoa {
    @Getter
    @Setter
    private String nome;
}

interface Pessoa {
    String getNome();

    void setNome(String nome);
}

