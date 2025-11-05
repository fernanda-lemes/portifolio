package br.com.devportfolio.api.entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.*;

@Entity
@Table(name = "tipos_skill")
@Getter
@Setter
@NoArgsConstructor

public class TiposSkill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "nome_tipo", nullable = false, unique = true, length = 50)
    private String nomeTipo;
}