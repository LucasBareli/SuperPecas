package br.com.masterclass.superpecas.repository;


import br.com.masterclass.superpecas.model.Peca;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PecaRepository extends JpaRepository<Peca, Long> {

}