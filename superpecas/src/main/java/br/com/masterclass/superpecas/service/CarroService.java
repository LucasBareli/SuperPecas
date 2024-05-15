package br.com.masterclass.superpecas.service;


import br.com.masterclass.superpecas.model.Carro;
import br.com.masterclass.superpecas.repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CarroService {
    @Autowired
    private CarroRepository carroRepository; // Dependência do CarroRepository
    public List<Carro> listarCarros() {  // Listar todos os carros
        return carroRepository.findAll(); // Usa o método findAll do CarroRepository
    }

    public Optional<Carro> buscarCarro(Long id) {
        return carroRepository.findById(id); // Usa o método findById do CarroRepository
    }

    public Carro salvarCarro(Carro carro) {
        return carroRepository.save(carro); // Usa o método save do CarroRepository
    }

    public void deletarCarro(Long id) {
        carroRepository.deleteById(id); // Usa o método deleteById do CarroRepository
    }
}
