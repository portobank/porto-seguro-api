# DESAFIO:
API REST Conserto Celular - Porto Seguro:

Funcionalidade: Consulta de CEP 
  Apenas clientes da região central de SP poderam solicitar o conserto/reparo de seu celular.
	{ "cep": 01207-900} = CEP Aprovado 
	{ "cep": 04551-065} = Atendimento não realizado para região de Guaruja.

Funcionalidade: Orcamento do conserto
  Dado entrada de um modelo de celular, marca e parametros com defeito como "Tela", "Touch Screan", "Bateria", "Cabo", "Volume", "Botão Ligar" entre outros, é esperado uma saida descrição do conserto e valores individuais de cada item mais um valor acrecido de 15% e 5% do valor total para frete e despesas de serviços!
	entrada = { "marca": Iphone, "modelo": 11 pro, "tela": true } 
	saida   = { "marca": Iphone, "modelo": 11 pro, "tela": true, "total": 540,00, "frete": 67,5, "custos": 22,5 }

	OBS: Voce parametrizara o valor do conserto de cada item, no caso acima a tela custaria 450,0.

	Descrição = O Valor para conserto da Tela do Iphone 11 pro é 450,00 R$ mais 15% = 67,5 R$ e  mais 5% = 22,5 R$ Total = 540 R$.

	entrada = { "marca": Iphone, "modelo": 11 pro, "bateria": bateria, "tela": false }
	saida =   { "marca": Iphone, "modelo": 11 pro, "bateria": bateria, "tela": false, "total": 540,00, "frete": 67,5, "custos": 22,5 } 


 	Descrição = O Valor para conserto da bateria do Iphone 11 pro é 450,00 R$ mais 15% = 67,5 R$ e  mais 5% = 22,5 R$ Total = 540 R$.

	OBS: Voce decido como será o padrão de saida,valores e da descrição do orçamento contanto que tenha as informações para cada solicitação e caso não exista cadastrado a marca ou modelo solicitado tambem deve ser informado.

Funcionalidade: Validação Cliente
   Deve ser feita uma validação se o cliente que solicitou o orcamento já realizou orçamentos anteriores criando assim um historico de solicitações e atendimentos realizados e não realizados do mesmo cliente.	
	{ "cliente": Marcos Silva, "email": marcos.silva@gmail.com, "cpf": 000.012.050-00, "endereco": rua xxxx, "pagamento": cartao, "orcamentos": 5, "concluidos": 3 }

Funcionalidade: Marca Modelo
   Deve ser feita uma validação de marca e modelo dos aparelhos para auxílio na funcionalidade de Orçamento do conserto.
	entrada = { "marca": LG, "modelo": k222 }
	saida =   { "marca": null, "modelo": null } = Marca não registrada ou Não damos suporte a essa Marca e Modelo.

	voce define a fora de saida.

Seria intuitivo uma Funcionalidade de retorno de preço para cada Item em especifico de um modelo e marca:
	entrada = { "marca": LG, "modelo": k222, "defeito": tela }
	saida =   { "marca": LG, "modelo": k222, "tela": xxx, "valor": 300,00} = valor da tela do modelo escolhido é 300,00

Avaliação
Você será avaliado pela usabilidade, é esperado que você consiga explicar as decisões que tomou durante o desenvolvimento através de commits e uma breve explicação na entrevista.

Definir tratativas de erros e padronização no response.
Criação do Swagger seria bem visto!

Swagger - https://editor.swagger.io/
Springboot - Java - Maven (preferêncialmente) (https://projects.spring.io/spring-boot/)
RESTFul (https://blog.mwaysolutions.com/2014/06/05/10-best-practices-for-better-restful-api/)
DDD (https://airbrake.io/blog/software-design/domain-driven-design)
Microservices (https://martinfowler.com/microservices/)
Testes unitários, teste o que achar importante (De preferência JUnit). Mas pode usar o que você tem mais experiência, só nos explique o que ele tem de bom.
Uso de diferentes formas de armazenamento de dados (REDIS, Cassandra, Solr/Lucene, H2)
Uso do git
Diferencial: Docker File + Docker Compose (com dbs) para rodar seus jars.

Muito Obrigado e Boa sorte!!!
