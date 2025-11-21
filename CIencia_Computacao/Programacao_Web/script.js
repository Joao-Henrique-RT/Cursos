// const tarefa = document.querySelector('#tarefa');
// const btn = document.querySelector('#btn');
// const lista = document.querySelector('#lista');

// //Selecionando os elementos para realizar acoes 

// btn.addEventListener('click',function(){
//     if(tarefa.value == ''){
//         alert('Por favor, insira uma tarefa!');
//     } else{
//         lista.innerHTML += 
//         `<li>
//         <i class="fa-solid fa-check"></i>${tarefa.value}
//         <i class="fa-solid fa-trash close">
//         </i>
//         </li>`
//         //Adicionado a lista na tarefa com os dois icones que estao dentro do li
//         tarefa.value = '';
//     }
//     //Adicionando a funcionalidade de remover a tarefa da lista
// })

//     //criando uma funcao para remover a tarefa
// const close = document.querySelectorAll('.close');
// for(let i = 0; i < close.length; i++){
//     close[i].addEventListener('click', function(){
//         close[i].parentElement.remove();
//     });
// }

// lista.addEventListener('click', function(e){
//     e.target.parentElement.querySelector('.fa-check').style.color = 'green';
  
// });


//utilizando jQuery

//Para pegar elementos HTML com jQuery, usamos o cifrão ($) seguido do seletor CSS entre aspas

$("#btn").click(function(){
    const tarefa = $("#tarefa").val();
    //Pega o valor do input tarefa
    if(tarefa === ''){
        alert('Por favor, insira uma tarefa!');
    }else{
        $('#lista').append(//append funciona como o innerHTML +=
            `<li class="item"><i class="fa-solid fa-check "></i><span>${tarefa}</span> <i class="fa-solid fa-trash close"></i></li>`
        );

        $('#tarefa').val("");//Ao adicionar uma tarefa, deixar o input vazio
    }

});

$(".close").each(function(){//Selecionando todos os elementos com a classe close
     $(this).click(function(){//Adicionando um evento de clique a cada um deles
        //Removendo o elemento pai do icone de lixeira (ou seja, o li inteiro)
        $(this).parent().remove();
    })
});


$("#lista li").click(function(){
    $(this).css("color", "green");
    $(this).find("span").css("text-decoration", "line-through");
});