package br.com.raphael.raphael.controller;

import br.com.raphael.raphael.model.Cliente;
import br.com.raphael.raphael.service.ClienteService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/listar/clientesExternos")
    public ResponseEntity<List<Cliente>> consultaCliente() throws JsonProcessingException {

       return new ResponseEntity<List<Cliente>>(clienteService.getClintes(), HttpStatus.OK);

    }
}
