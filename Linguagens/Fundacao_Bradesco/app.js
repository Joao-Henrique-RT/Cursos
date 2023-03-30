/*
Quando você começa a usar o JavaScript, o foco inicial, geralmente, é trabalhar com números, matemática, manipulação de texto, datas e armazenamento de informações.

Às vezes, o JavaScript faz suposições sobre o tipo de dados que você insere. Atribuição, matemática ou igualdade lógica podem gerar resultados inesperados.

O JavaScript tenta ser amigável e ele tenta fazer com que o código funcione e forneça uma solução, mesmo que o resultado venha a ser um erro.

Para combater essas deficiências, você pode ativar o modo estrito, que reduz erros silenciosos, melhora o desempenho, fornece mais avisos e menos recursos não seguros.
*/

'use strict';

/*
Para um botão, você precisa de um manipulador do evento click. A função do manipulador de eventos é executada quando o evento click ocorre.

Antes de adicionar o manipulador de eventos, você precisa de uma referência para o botão.
 */
const switcher = document.querySelector('.btn');

/*
Em seguida, adicione o ouvinte e o manipulador do evento click.

No código a seguir, você adiciona um ouvinte para o evento click.

A função passada para o ouvinte de eventos é seu manipulador de eventos real.
*/
switcher.addEventListener('click', function() {
    document.body.classList.toggle('dark-theme')

    var className = document.body.className;
    if(className == "light-theme"){
        this.textContent = "Escuro";
    }
    else{
        this.textContent = "Claro";
    }

    console.log('Current class name: '+ className)

});


/**
 No código anterior, você usou o método toggle para alternar o elemento para a classe dark-theme.

Isso aplica, automaticamente, os estilos de tema escuro em vez do tema claro. 
No entanto, o rótulo do botão também precisa ser atualizado para mostrar o tema correto, portanto,
 você precisa adicionar uma instrução if para verificar o tema atual e atualizar o rótulo do botão.
 */

 /*
 É uma convenção JavaScript usar letras concatenadas para nomes de variáveis

com mais de uma palavra – por exemplo, a variável className.
  */

/*
Usando o console, você tem uma visão interessante de como

a alternância de temas CSS é tratada.

Ambos os nomes de classe são aplicados ao elemento

quando você alterna para tema escuro.

No entanto, o último nome de classe aplicado, o tema escuro, tem precedência.

Na guia Estilos, você pode ver que as regras de tema escuro substituem

as regras de tema claro, que são mostradas usando o texto tachado.
*/