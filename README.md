# Programacao-Orientada-a-Objetos-Lista02

Lista de Exercícios - Programação Orientada a Objetos:

## Exercícios Teóricos:

1.

O uso de getters e setters é uma boa prática em POO porque é a base do encapsulamento, que consiste em proteger os atributos de uma classe e controlar como eles são acessados e modificados.

---
Um dos problemas de tornar os atributos públicos é permitir que qualquer parte do programa altere seus valores livremente, podendo atribuir dados inválidos e comprometer o estado do objeto. Ao tornar um atributo "private", seu acesso passa a ser controlado pela própria classe.

---
Os getters permitem consultar o valor de um atributo sem dar acesso direto a ele. Já os setters permitem modificar esse valor de maneira controlada. No método "set", podem ser criadas regras para impedir que valores incorretos sejam atribuídos ao objeto. Também é possível criar apenas um getter, quando o atributo deve ser somente de leitura, sem disponibilizar um setter.

---
Ex: imagine uma classe "Pessoa" com um atributo "idade". Em vez de permitir que a idade seja alterada diretamente para qualquer valor, podemos usar um setter para verificar se o valor informado é válido.:

```
public class Pessoa {

    private int idade;

    public int getIdade() { return idade; }

      public void setIdade(int idade) {

        if (idade >= 0) {
            this.idade = idade; //Impede que o valor recebido seja negativo
        }

    } 

}
```
---

2.

a) Em uma classe `Livro`, informações relevantes seriam:

```
-Código do livro
-Título do livro
-Editora
-Ano de publicação
-Preço
-Autores
```
---

b) Podemos dizer que uma classe Livro seria uma abstração, pois representa um objeto da vida real no código, utilizando informações relevantes para que possa ser representado. Como mencionado na questão anterior, título, preço, autores etc.

---

c) Três métodos que fariam sentido em uma classe `Livro` seriam:

```
adquirirLivro: Realizar o empréstimo de um livro em uma biblioteca;
devolverLivro: Devolver um livro emprestado em uma biblioteca;
reportarLivro: Reportar a perda, o roubo ou outros problemas que impossibilitem a devolução de um livro emprestado.
```
