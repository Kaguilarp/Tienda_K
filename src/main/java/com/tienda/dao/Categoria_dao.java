
package com.tienda.dao;

import com.tienda.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Categoria_dao extends JpaRepository<Categoria,Long> {
    
}
