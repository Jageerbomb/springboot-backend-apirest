package com.jagerbomb.springboot.backend.apirest.models.services;

import com.jagerbomb.springboot.backend.apirest.models.entity.Cliente;
import com.jagerbomb.springboot.backend.apirest.models.entity.Region;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IClienteService {
    public List<Cliente> findAll();

    public Page<Cliente> findAll(Pageable pageable);

    public Cliente findById(Long id);

    public Cliente create(Cliente cliente);

    public void delete(Long id);

    public List<Region> findAllRegion();
}
