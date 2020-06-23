package com.jagerbomb.springboot.backend.apirest.controllers;

import com.jagerbomb.springboot.backend.apirest.models.entity.Cliente;
import com.jagerbomb.springboot.backend.apirest.models.services.IClienteService;
import org.hibernate.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost.4200"})
@RestController
@RequestMapping("/api")
public class ClienteRestController {

    @Autowired
    private IClienteService clienteService;

    @GetMapping("/clientes") // get para solo traer
    public List<Cliente> index() {
        return clienteService.findAll();
    }

    @PostMapping("/clientes") //post para crear / por envio de dato
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente findById(@RequestBody Cliente cliente){
        return clienteService.save(cliente);
    }

    @PutMapping("/clientes/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Cliente update(@RequestBody Cliente cliente, @PathVariable Long id){
        Cliente clienteTmp = clienteService.findById(id);
        clienteTmp.setNombre(cliente.getNombre());
        clienteTmp.setApellido(cliente.getApellido());
        clienteTmp.setCreateAt(cliente.getCreateAt());
        clienteTmp.setEmail(cliente.getEmail());
        return clienteService.save(clienteTmp);

    }

    @DeleteMapping("clientes/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        clienteService.delete(id);
    }


}
