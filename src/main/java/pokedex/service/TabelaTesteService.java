package pokedex.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import pokedex.model.TabelaTeste;
import pokedex.model.TabelaTesteId;
import java.util.List;

@ApplicationScoped
public class TabelaTesteService {
    
    @Inject
    TabelaTeste TabelaTeste;

    public List<TabelaTesteId> recuperarDadosTabela() {

        return TabelaTeste.findAll().list();
    }
}
