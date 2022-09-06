/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.cv.model;

import java.util.List;

/**
 *
 * @author 20211pf.cc0013
 */
public class Raca {
    private Integer id;
    private String nome;
    private List<Especie> especies;
    
    public Raca(){
    
    };

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the especies
     */
    public List<Especie> getEspecies() {
        return especies;
    }

    /**
     * @param especies the especies to set
     */
    public void setEspecies(List<Especie> especies) {
        this.especies = especies;
    }
    
}
