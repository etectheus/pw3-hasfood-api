package br.com.matheus.silva.pw3hasfood.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
@Entity
@Getter
@Setter
@Table(name="TBL_PEDIDO")

public class Pedido {


@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	
@Column(name="ID_PEDIDO")
private Long id;

@Column(name="DT_PEDIDO")
private LocalDate datapedido;

@Column(name="TX_STATUS")
private String status;

@Column(name="ID_RESTAURANTE")
private Long idrestaurante;

}
