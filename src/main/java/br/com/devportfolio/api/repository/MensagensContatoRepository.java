package br.com.devportfolio.api.repository;
import br.com.devportfolio.api.entity.MensagensContato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MensagensContatoRepository extends JpaRepository<MensagensContato, Long> {

}