package br.com.devportfolio.api.service;
import br.com.devportfolio.api.repository.HabilidadesRepository;
import br.com.devportfolio.api.repository.TiposSkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabilidadeService {
    private final HabilidadesRepository habilidadesRepository;
    private final TiposSkillRepository tiposSkillRepository;
    @Autowired
    public HabilidadeService(HabilidadesRepository habilidadesRepository, TiposSkillRepository tiposSkillRepository) {
        this.habilidadesRepository = habilidadesRepository;
        this.tiposSkillRepository = tiposSkillRepository;
    }
}