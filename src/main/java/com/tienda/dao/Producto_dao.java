
package com.tienda.dao;

import com.tienda.domain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Producto_dao extends JpaRepository<Producto,Long> {
    
}
