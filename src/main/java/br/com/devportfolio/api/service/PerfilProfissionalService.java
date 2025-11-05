package br.com.devportfolio.api.service;
import br.com.devportfolio.api.repository.PerfilProfissionalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PerfilProfissionalService {
    private final PerfilProfissionalRepository perfilProfissionalRepository;
    @Autowired
    public PerfilProfissionalService(PerfilProfissionalRepository perfilProfissionalRepository) {
        this.perfilProfissionalRepository = perfilProfissionalRepository;
    }
}