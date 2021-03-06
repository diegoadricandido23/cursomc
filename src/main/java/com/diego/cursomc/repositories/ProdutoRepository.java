/**
 * 
 */
package com.diego.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diego.cursomc.domain.Produto;

/**
 * @authorDiego Adriano
 * @since 
 *
 */
@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer>{
	
}