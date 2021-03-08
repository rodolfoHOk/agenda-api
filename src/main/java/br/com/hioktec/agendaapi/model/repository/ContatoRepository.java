package br.com.hioktec.agendaapi.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.hioktec.agendaapi.model.entity.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Long>{
	
}
