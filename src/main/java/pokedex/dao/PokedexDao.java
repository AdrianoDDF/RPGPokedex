package pokedex.dao;

import java.util.List;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import pokedex.model.TabelaTeste;

@ApplicationScoped
public class PokedexDao implements PanacheRepository<TabelaTeste> {

    @Transactional
    public List<String> recuperarDadosTabela() {
        return getEntityManager().createNamedQuery("RECUPERAR_DADOS_TABELA", String.class).getResultList();
    }
}