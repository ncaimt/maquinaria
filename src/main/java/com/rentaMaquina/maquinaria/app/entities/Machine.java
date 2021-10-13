
package com.rentaMaquina.maquinaria.app.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author nacai
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="machine")
public class Machine implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    private String brand;
    private int model;
    //@Column (name="category_id")
    // private int categoryId;
    private int category_id;
    public String name;
    
  
    
}
