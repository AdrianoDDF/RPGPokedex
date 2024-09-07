package pokedex.rest;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import pokedex.dao.PokedexDao;
import jakarta.inject.Inject;
import java.util.List;

@Path("/tabelaTeste")
@Produces(MediaType.APPLICATION_JSON)
public class TabelaTesteResource {

    @Inject
    PokedexDao pokedexDao;

    @GET
    @Path("/dados")
    public List<String> recuperarDados() {
        return pokedexDao.recuperarDadosTabela();
    }
}