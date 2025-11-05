package br.com.devportfolio.api.entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.*;
import java.math.BigInteger;
import java.sql.Date;

@Entity
@Table(name = "mensagens_contato")
@Getter
@Setter
@NoArgsConstructor
public class MensagensContato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private BigInteger id;
    @Column(name = "nome_remetente", nullable = false, length = 100)
    private String nomeRemetente;
    @Column(name = "email_remetente", nullable = false, length = 100)
    private String emailRemetente;
    @Column(name = "assunto_mensagem", length = 150)
    private String assuntoMensagem;
    @Column(name = "corpo_mensagem", columnDefinition = "TEXT", nullable = false)
    private String corpoMensagem;
    @Column(name = "data_envio")
    private Date dataEnvio;
}
