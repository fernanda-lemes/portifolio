package br.com.devportfolio.api.repository;
import br.com.devportfolio.api.entity.TiposSkill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TiposSkillRepository extends JpaRepository<TiposSkill, Integer> {

}