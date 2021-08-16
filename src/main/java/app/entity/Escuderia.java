package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
    import cronapi.CronapiCloud;


/**
* Classe que representa a tabela ESCUDERIA
* @generated
*/
@Entity
@Table(name = "\"ESCUDERIA\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Escuderia")
public class Escuderia implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

    /**
    * @generated
    */
    @Column(name = "piloto", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String piloto;

    /**
    * @generated
    */
    @Column(name = "escuderia", nullable = true, unique = false, insertable=false, updatable=true)
    @CronapiCloud(type = "dropbox", value="sl.A1fyCBjj3H-SvHi0TEm6uSD7_xM1ITAxApGF5xSOcfyG-h0bl0GfQntLUWESRttia-uhpKCaiZ7qC6TmcXAhLXiMVIkgs9y9m_PCif-0vU7YgWpz3K8rDQzoq4HuwnA5qG5K7jVWvvL9", id="", secret="")
        
        private java.lang.String escuderia;

    /**
    * Construtor
    * @generated
    */
    public Escuderia(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    
    public java.lang.String getId(){
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public Escuderia setId(java.lang.String id){
        this.id = id;
        return this;
    }
    /**
    * Obtém piloto
    * return piloto
    * @generated
    */
    
    public java.lang.String getPiloto(){
        return this.piloto;
    }

    /**
    * Define piloto
    * @param piloto piloto
    * @generated
    */
    public Escuderia setPiloto(java.lang.String piloto){
        this.piloto = piloto;
        return this;
    }
    /**
    * Obtém escuderia
    * return escuderia
    * @generated
    */
    
    public java.lang.String getEscuderia(){
        return this.escuderia;
    }

    /**
    * Define escuderia
    * @param escuderia escuderia
    * @generated
    */
    public Escuderia setEscuderia(java.lang.String escuderia){
        this.escuderia = escuderia;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Escuderia object = (Escuderia)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

}