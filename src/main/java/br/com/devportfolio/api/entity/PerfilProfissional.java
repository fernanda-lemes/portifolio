package br.com.devportfolio.api.entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.*;
import java.math.BigInteger;
import java.sql.Date;

@Entity
@Table(name = "perfil_profissional")
@Getter
@Setter
@NoArgsConstructor
public class PerfilProfissional {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "nome_exibicao", nullable = false, length = 100)
    private String nomeExibicao;
    @Column(name = "titulo_cargo", length = 100)
    private String tituloCargo;
    @Column(name = "biografia", columnDefinition = "TEXT")
    private String biografia;
    @Column(name = "email_contato", length = 100)
    private String emailContato;
    @Column(name = "link_linkedin", length = 255)
    private Date linkLinkedin;
    @Column(name = "link_github", length = 255)
    private Date linkGitHub;
    @Column(name = "link_instagram", length = 255)
    private Date linkInstagram;
    @Column(name = "url_foto_perfil", length = 255)
    private Date urlFotoPerfil;
    @Column(name = "cidade", length = 100)
    private String cidade;
    @Column(name = "uf", length = 2)
    private String uf;
}
