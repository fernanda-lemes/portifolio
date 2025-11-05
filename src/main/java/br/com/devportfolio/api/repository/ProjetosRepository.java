package br.com.devportfolio.api.repository;
import br.com.devportfolio.api.entity.Projetos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjetosRepository extends JpaRepository<Projetos, Integer> {

}