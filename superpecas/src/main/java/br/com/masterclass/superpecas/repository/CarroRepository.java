package br.com.masterclass.superpecas.repository;


import br.com.masterclass.superpecas.model.Carro;
import org.springframework.data.domain.Page; //Importa a classe Page do Spring Data para lidar com paginação de resultados
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository; //Importa a classe Repository, indicando que é bean

@Repository
public interface CarroRepository extends JpaRepository<Carro, Long> {  //fornece métodos CRUD

}