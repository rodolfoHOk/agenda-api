package br.com.hioktec.agendaapi.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Contato {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length = 150, nullable = false)
	@NotEmpty(message = "Campo nome é obrigatório!")
	private String nome;
	
	@Column(unique = true, length = 150, nullable = false)
	@NotEmpty(message = "Campo e-mail é obrigatório!")
	@Email(message = "E-mail informado inválido!")
	private String	email;
	
	@Column
	private Boolean favorito;
}
