
package com.tienda.controller;

import com.tienda.service.Categoria_service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/categoria")

public class Categoria_controller {
    
    @Autowired
    private Categoria_service categoria_service;
    @GetMapping ("/listado")
    public String inicio (Model model) {
        var categorias =categoria_service.getCategorias(false);
        model.addAttribute("categorias", categorias);
        model.addAttribute("totalCategorias", categorias.size());
        return "/categoria/listado";
    }
            
}
