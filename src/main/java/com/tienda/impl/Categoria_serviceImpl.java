
package com.tienda.impl;

import com.tienda.dao.Categoria_dao;
import com.tienda.domain.Categoria;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tienda.service.Categoria_service;

@Service
public class Categoria_serviceImpl implements Categoria_service {
    
    @Autowired
    private Categoria_dao categoria_dao;
    
    public List<Categoria> getCategorias(boolean activos){
        var lista=categoria_dao.findAll();
        if(activos){
            lista.removeIf(e -> !e.isActivo());
        }
        return lista;
        
    }
}
