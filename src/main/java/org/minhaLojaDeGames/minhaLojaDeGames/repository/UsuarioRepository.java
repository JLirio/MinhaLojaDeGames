package org.minhaLojaDeGames.minhaLojaDeGames.repository;

import java.util.Optional;

import org.minhaLojaDeGames.minhaLojaDeGames.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	public Optional<Usuario> findByUsuario(String usuario);

}