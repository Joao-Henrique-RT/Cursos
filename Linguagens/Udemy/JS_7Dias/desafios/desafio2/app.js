//LÓGICA.
//Só poderão ser listados itens com valores iguais ou acima de 20 reais


//Função para pegar os valores do HTML e verificar preço

function clique(){

    let nomeProduto = document.getElementById('nomeProduto').value
    let  precoProduto = document.getElementById('precoProduto').value
    
        if(nomeProduto == "" || precoProduto == ""){
            alert("Por favor, preencha os dois campos")
        }else if(precoProduto < 20){
            alert("Cadastre apenas produtos a partir de 20 reais!")
        }else{
            alert("Produto cadastrado")
            console.log(nomeProduto, precoProduto)
        }
    
        
}

