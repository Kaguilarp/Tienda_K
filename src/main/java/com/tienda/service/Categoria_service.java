
package com.tienda.service;

import com.tienda.domain.Categoria;
import java.util.List;

public interface Categoria_service {
    public List<Categoria> getCategorias(boolean activos);
}
