# 2020-2Grupo4

## Integrantes

| Nome | Matrícula |
|------|-----------|
| Ailton Aires Amado | 180011600 |
| Erick Giffoni Felicíssimo | 170141161 | 
| Filipe Santana Machado | 180016563 |
| Gabrielle Ribeiro Gomes | 170011020 |  
| Gustavo Nogueira Rodrigues | 170144259 |
| Liverson Paulo Furtado Severo | 180022237 |
| Maicon Lucas Mares de Souza | 180023411 |
| Nícalo Ribeiro Dourado Araújo | 160016169 |
| Roberto Martins da Nóbrega | 140065547 |
| João Victor Max Bisinotti de Oliveira | 170069991 |

## TDD - Test Driven Development

O TDD é um processo de desenvolvimento de software orientado a testes onde inicia-se pelos testes antes de qualquer código, sempre seguindo o ciclo que vai do vermelho (testes não passam) segue ao verde (testes passam) e caso necessário o refatoramento.

### Etapas detalhadas:

1. Cria-se o teste que irá falhar por não haver codígo;
2. Aplica esse teste e verifica as falhas e o objetivo da codificação;
3. Cria-se a funcionalidade com o foco em passar no teste da forma mais simples possível;
4. Testa esse funcionalidade aplicando o método de triangulação e caso falte ao desenvolvedor conhecimento suficiente o método da falsificação;
5. Refatora-se as funcionalidades para estarem de acordo com as boas práticas e certificar o funcionamento e a qualidade.

## Falsificação

A técnica de falsificação consiste em especificar o valor de retorno de uma função, ou procedimento, ou método, enfim, de maneira literal no código de acordo com o resultado esperado pelo teste. Isso faz com que o teste obtenha sucesso, embora a função a qual ele testou esteja falsificando o valor de retorno. Isso dá sentido à frase: falsifique até realmente construir.
Esse método é utilizado por causa de alguns fatores, entre eles sendo: 
   - ter um código rodando é melhor do que não ter, efeito psicológico causado pelo funcionamento;
   - se o problema e a solução é conhecida, mas a maneira como implementá-la não é imediatamente clara.

## Triangulação

A triangulação é uma prática utilizada no TDD, o nome é oriundo de uma analogia à triangulação de antenas, onde para encontrar a localização de um dispositivo é feito o cruzamento dos dados das três antenas mais próximas ao mesmo.
No caso dos testes, três testes são escritos para a mesma unidade, porém com entradas distintas, para obter maior garantia de que funções estão de fato passando nos testes. 
![](/media/triangulation.jpg)

“Digamos que A e B sejam casos de teste e ★ seja o objetivo final que é uma função que soma dois números inteiros. Esta receberá dois argumentos (os somados), e seu retorno será o resultado da soma. Ao triangular, A e B terão algo em comum: testar a mesma funcionalidade -> D.”

Supondo que A e B sejam casos de teste, ★ é o objetivo final, que é uma função que adiciona dois inteiros. Este receberá dois parâmetros (os parâmetros adicionados), e seu retorno será o resultado da soma. Quando for um triângulo, A e B terão algo em comum: teste a mesma função -> D.


### Como Triangulizar com parâmetros em frameworks de testes unitários?

A triangulação é feita de forma bem simples, onde dentro dos frameworks de teste unitário ela é representada na maioria das vezes como sendo métodos que realizam alguma operação e que retornam algum tipo de valor relevante (isto para desenvolvimento orientado à objetos). Espera-se analisar o comportamento deste método e principalmente o valor retornado, para saber se o mesmo está de acordo com a saída esperada, ou seja, o teste garante que, após a primeira falha (que é ocasionada propositalmente), a nova implementação cumprirá os requisitos. Após a triangulação ter sido concretizada, a refatoração do código poderá finalmente ser feita, mas sem quebrar os testes. Caso não esteja seguro da refatoração, retorne e refaça a triangulação novamente.

## Análise Crítica

A utilização dessa 



## Referências Bibliográficas

Sciensa. **TDD - Test-Driven Development - Guia Rápido.** Disponível em: http://blog.sciensa.com/tdd-test-driven-development-guia-rapido/. Acesso em: 17 de abril de 2021.

ROCHA, Helder. **Desenvolvimento Guiado por Testes com JUnit.** Disponível em: https://www.inf.ufpr.br/andrey/ci221/JUnit_Fenasoft.pdf. Acesso em: 17 de abril de 2021. 

BECK, Kent. **Test-Driven Development.** Disponível em: https://ptgmedia.pearsoncmg.com/images/9780321146533/samplepages/0321146530.pdf. Acesso em: 17 de abril de 2021. 

Groce, Alex et. al.How Verified (or Tested) is My Code? Falsification-Driven Verification and Testing. https://agroce.github.io/asej18.pdf . página 35
