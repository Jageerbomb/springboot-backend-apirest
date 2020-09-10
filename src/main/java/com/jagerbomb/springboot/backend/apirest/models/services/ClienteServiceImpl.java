package com.jagerbomb.springboot.backend.apirest.models.services;

import com.jagerbomb.springboot.backend.apirest.models.dao.IClienteDAO;
import com.jagerbomb.springboot.backend.apirest.models.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class ClienteServiceImpl implements IClienteService {

    @Autowired
    private IClienteDAO clienteDAO;

    @Override
    @Transactional(readOnly = true)
    public List<Cliente> findAll() {
        return (List<Cliente>) clienteDAO.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Page<Cliente> findAll(Pageable pageable) {
        return clienteDAO.findAll(pageable);
    }

    @Override
    @Transactional(readOnly = true)
    public Cliente findById(Long id) {
        return clienteDAO.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Cliente create(Cliente cliente) {
        return clienteDAO.save(cliente);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        clienteDAO.deleteById(id);
    }


}
