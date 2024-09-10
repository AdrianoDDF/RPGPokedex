package pokedex.controller;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
// import pokedex.dao.PokedexDao;
import pokedex.model.TabelaTesteId;
import pokedex.service.TabelaTesteService;
import jakarta.inject.Inject;
import java.util.List;
import java.util.ArrayList;

@Path("/controller")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TabelaTesteController {

    // @Inject
    // PokedexDao pokedexDao;
    @Inject
    TabelaTesteService tabelaTesteService;

    // @GET
    // @Path("/dados")
    // public List<String> recuperarDados() {
    //     return pokedexDao.recuperarDadosTabela();
    // }

    @GET
    @Path("/teste")
    public List<TabelaTesteId> recuperarTeste() {
        List<TabelaTesteId> lista = new ArrayList<>();
        try{
            lista = tabelaTesteService.recuperarDadosTabela();
        } catch(Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    @GET
    @Path("/ok")
    public Response test() {
        return Response.ok("teste").build();
    }

}