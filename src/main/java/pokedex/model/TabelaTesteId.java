package pokedex.model;

import java.io.Serializable;

public class TabelaTesteId implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String texto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    }