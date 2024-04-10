//CRIANDO UMA FACTORY

function criarLivro(title, author, pages){
    
    let book = {
        title: title,
        author: author,
        pages: pages,
        
        //PROPRIEDADES DO OBJETO LIVRO
        
        imprimirLivro: function(){
            console.log("Imprimindo...")// FUNÇAÕ DENTRO DO OBJETO LIVRO
        },
        
        mostrarLivro: function(){
            console.log(book)
        }
    }

    return book

}

let livro1 = criarLivro("mano", "mana", 400)
let livro2 = criarLivro("ola", "como vai", 1000)

livro1.color = "Azul"


console.log(livro1)
console.log(livro2)

//  let mostrar = document.getElementById('alter_text').innerHTML = 
