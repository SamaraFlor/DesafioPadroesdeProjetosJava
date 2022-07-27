# Desafio  Padroes  de   ProjetosJava


Descrição do Desafio
Agora é a sua hora de brilhar! Crie uma solução que explore o conceito de Padrões de Projeto na pŕatica. P
ara isso, você pode reproduzir um dos projetos que criamos durante as aulas ou, caso se sinta preparado, desenvolver uma nova ideia do zero ;-)

Dica: Além dos projetos/repositórios que criamos para este desafio, caso queira explorar novos padrões de projeto digite no Google: 
“java design patterns github” ou “java design patterns examples”. 
Com isso, você conhecerá novos padrões e implementações de referência que podem ajudá-lo a dominar esse tema!



Projeto no padrão Factory Method em Java

O Factory method é um padrão de projeto criacional, que resolve o problema de criar objetos de produtos sem especificar 
suas classes concretas.O Factory Method define um método, que deve ser usado para criar objetos em vez da chamada direta ao construtor 
(operador new). As subclasses podem substituir esse método para alterar a classe de objetos que serão criados.

Exemplos de uso: O padrão Factory Method é amplamente utilizado no código Java. 
É muito útil quando você precisa fornecer um alto nível de flexibilidade para seu código.

O padrão está presente nas principais bibliotecas Java:

java.util.Calendar#getInstance()
java.util.ResourceBundle#getBundle()
java.text.NumberFormat#getInstance()
java.nio.charset.Charset#forName()
java.net.URLStreamHandlerFactory#createURLStreamHandler(String) (Retorna diferentes objetos singleton, dependendo de um protocolo)
java.util.EnumSet#of()
javax.xml.bind.JAXBContext#createMarshaller() e outros métodos similares.

Identificação: Os métodos fábrica podem ser reconhecidos por métodos de criação, que criam objetos de classes concretas, 
mas os retornam como objetos de tipo ou interface abstrata.
