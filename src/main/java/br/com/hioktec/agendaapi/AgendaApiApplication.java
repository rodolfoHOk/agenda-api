package br.com.hioktec.agendaapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AgendaApiApplication {
	
	/* Teste de integração com o banco de dados - ok
	@Bean
	public CommandLineRunner commandLineRunner(@Autowired ContatoRepository repository) {
		return args -> {
			Contato contato = new Contato();
			contato.setNome("Fulano de Tal");
			contato.setEmail("fulano@email.com");
			contato.setFavorito(false);
			
			repository.save(contato);
		};
	} */

	public static void main(String[] args) {
		SpringApplication.run(AgendaApiApplication.class, args);
	}

}
