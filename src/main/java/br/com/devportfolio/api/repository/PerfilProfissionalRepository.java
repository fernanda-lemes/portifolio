package br.com.devportfolio.api.repository;
import br.com.devportfolio.api.entity.PerfilProfissional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerfilProfissionalRepository extends JpaRepository<PerfilProfissional, Integer> {

}