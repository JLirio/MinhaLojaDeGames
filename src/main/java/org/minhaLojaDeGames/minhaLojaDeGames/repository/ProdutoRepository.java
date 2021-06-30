package org.minhaLojaDeGames.minhaLojaDeGames.repository;

import java.util.List;

import org.minhaLojaDeGames.minhaLojaDeGames.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface ProdutoRepository extends JpaRepository<Produto,Long>{
	
	
	public List<Produto> findAllByTituloContainingIgnoreCase (String titulo);
	
}