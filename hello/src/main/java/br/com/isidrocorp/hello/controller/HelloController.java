package br.com.isidrocorp.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/* a anotacao @Restcontroller notifica a maquina virtual informando que a nossa classe HelloController agora é uma classe
 * que ira responder (em seus métodos) a chamadas de URL, mas quais URLs?
 * 
 * agora precisamos definir uma URL para cada método que escrevemos 
 * 
 */
@RestController
public  class HelloController {
	
	@GetMapping("/hello")
	public String sayHello() {
		return "hello world MODAFOCA!!!*** Meu primeiro programa em Spring Boot";
	}


@GetMapping("/produto")
public Produto exibirProduto() {
	Produto p = new Produto();
	p.setId(1928398);
	p.setDescricao("Computador top de linha com um monte de luizinha");
	p.setPreco(3850.00);
	return p;
	
}

}



