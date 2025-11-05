package br.com.devportfolio.api.service;
import br.com.devportfolio.api.repository.MensagensContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MensagensContatoService {
    private final MensagensContatoRepository mensagensContatoRepository;
    @Autowired
    public MensagensContatoService(MensagensContatoRepository mensagensContatoRepository) {
        this.mensagensContatoRepository = mensagensContatoRepository;
    }
}