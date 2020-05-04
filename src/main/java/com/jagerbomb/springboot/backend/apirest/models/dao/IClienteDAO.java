package com.jagerbomb.springboot.backend.apirest.models.dao;

import com.jagerbomb.springboot.backend.apirest.models.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface IClienteDAO extends CrudRepository<Cliente, Long> {
}
