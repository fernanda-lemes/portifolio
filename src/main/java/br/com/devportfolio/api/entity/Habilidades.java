package br.com.devportfolio.api.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "habilidades")
@Getter
@Setter
@NoArgsConstructor

public class Habilidades {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "nome_skill", nullable = false, unique = true, length = 50)
    private String nomeSkill;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tipo_skill_id", nullable = false)
    private TiposSkill tipoSkill;
}