package com.jagerbomb.springboot.backend.apirest.models.dao;

import com.jagerbomb.springboot.backend.apirest.models.entity.Cliente;
import com.jagerbomb.springboot.backend.apirest.models.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IClienteDAO extends JpaRepository<Cliente, Long> {
    /*JPA (Java Persistence API) = Framework que maneja datos relacionales en aplicaciones JAVA*/

    /*
    * @Query sirve para personalizar consultas SELECT o de operaciones JPA
    * Region es la clase Entity, ya que acá se trabaja con objetos, no tablas
    */
    @Query("from Region")
    public List<Region> findAllRegion();
}
