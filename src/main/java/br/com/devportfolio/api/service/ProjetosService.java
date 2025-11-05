package br.com.devportfolio.api.service;
import br.com.devportfolio.api.repository.ProjetosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjetosService {
    private final ProjetosRepository projetosRepository;
    @Autowired
    public ProjetosService(ProjetosRepository projetosRepository) {
        this.projetosRepository = projetosRepository;
    }
}