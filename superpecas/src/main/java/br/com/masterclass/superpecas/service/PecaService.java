package br.com.masterclass.superpecas.service;


import br.com.masterclass.superpecas.model.Peca;
import br.com.masterclass.superpecas.repository.PecaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PecaService {
    @Autowired
    private PecaRepository carroRepository; // Dependência do PecaRepository
    public List<Peca> listarPecas() {  // Listar todos os peçass
        return pecaRepository.findAll(); // Usa o método findAll do PecaRepository
    }

    public Optional<Peca> buscarPeca(Long id) {
        return pecaRepository.findById(id); // Usa o método findById do PecaRepository
    }

    public Peca salvarPeca(Peca peca) {
        return pecaRepository.save(peca); // Usa o método save do PecaRepository
    }

    public void deletarPeca(Long id) {
        pecaRepository.deleteById(id); // Usa o método deleteById do PecaRepository
    }
}
