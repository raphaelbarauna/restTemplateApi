package br.com.raphael.raphael.model;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Cliente {

    private Integer idCliente;

    private String nome;

    private Boolean exclusivePlan;

    private Double saldo;

    private Integer numeroConta;

    private Date dataNascimento;
}
