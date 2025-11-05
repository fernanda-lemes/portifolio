package br.com.devportfolio.api.repository;
import br.com.devportfolio.api.entity.Habilidades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabilidadesRepository extends JpaRepository<Habilidades, Integer> {

}