/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.cv.model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author 20211pf.cc0013
 */
@Entity
@Table(name = "tb_cliente")
@DiscriminatorValue("C")
public class Cliente extends Pessoa{
    
    @Id
    @ManyToOne
    @JoinColumn(name = "cliente_pessoa_cpf", nullable = false)
    private Pessoa pessoa;
    
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar data_ultima_visita;
    
    @OneToMany(mappedBy = "pet_id")
    private List<Pet> pets;
    
    public Cliente(){
    
    };

    /**
     * @return the data_ultima_visita
     */
    public Calendar getData_ultima_visita() {
        return data_ultima_visita;
    }

    /**
     * @param data_ultima_visita the data_ultima_visita to set
     */
    public void setData_ultima_visita(Calendar data_ultima_visita) {
        this.data_ultima_visita = data_ultima_visita;
    }

    /**
     * @return the pets
     */
    public List<Pet> getPets() {
        return pets;
    }

    /**
     * @param pets the pets to set
     */
    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }
    
}
