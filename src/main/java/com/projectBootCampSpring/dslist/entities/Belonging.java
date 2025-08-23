package com.projectBootCampSpring.dslist.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "tb_Belonging")
public class Belonging {

    // Cree la clase auxiliar BelongingPK para poder tener un solo id, que es lo que usa
    // GameRepository para hacer la persistencia de los datos.

    @EmbeddedId // porque la referencia es un id formado por una llave compuesta
    private BelongingPK id  = new BelongingPK(); // se instancia para no ser nulo

    private Integer position;

    public Belonging() {
    }

    public Belonging( Game game , GameList list , Integer position) {
        id.setGame(game);
        id.setList(list);
        this.position = position;
    }

    public BelongingPK getId() {
        return id;
    }

    public void setId(BelongingPK id) {
        this.id = id;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Belonging belonging = (Belonging) o;
        return Objects.equals(id, belonging.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
