package pokedex.model;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.NamedNativeQueries;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.Table;


@NamedNativeQueries({
    @NamedNativeQuery(name= "RECUPERAR_DADOS_TABELA", query= "select texto from teste.tabelaTeste",
    resultClass = String.class
)})
 
@Entity
@IdClass(value = TabelaTesteId.class)
@Table(name = "tabelaTeste", schema = "teste")
@ApplicationScoped
public class TabelaTeste {
    
    @Id
    @Column(name = "id")
    private Long id;

    @Id
    @Column(name = "texto")
    private String texto;
}