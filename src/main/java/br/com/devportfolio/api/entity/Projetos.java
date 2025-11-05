package br.com.devportfolio.api.entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "projetos")
@Getter
@Setter
@NoArgsConstructor
public class Projetos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "titulo", nullable = false, length = 100)
    private String titulo;
    @Column(name = "descricao_curta", nullable = false, length = 255)
    private String descricaoCurta;
    @Column(columnDefinition = "TEXT", name = "descricao_completa", nullable = false)
    private String descricaoCompleta;
    @Column(name = "link_github", length = 255)
    private String linkGitHub;
    @Column(name = "link_deploy", length = 255)
    private String linkDeploy;
    @Column(name = "url_imagem", length = 255)
    private String urlImagem;
    @Column(name = "data_conclusao")
    private Date dataConclusao;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "projeto_habilidade",
            joinColumns = @JoinColumn(name = "projeto_id"),
            inverseJoinColumns = @JoinColumn(name = "habilidade_id")
    )
    private List<Habilidades> habilidades = new ArrayList<>();
}
