<?php
require 'pdf/vendor/autoload.php';

use Dompdf\Dompdf;

$dados = "<h1>PDF GERADO!</h1>";

$dados .= "<img src='https://upload.wikimedia.org/wikipedia/commons/2/27/PHP-logo.svg'>";

//INstanciar e usar a classe DOMPDF
$dompdf = new Dompdf(['enable_remote' => true]);

//INstanciar o Método loadhtrml e enviar o conteudo do pdf
$dompdf->loadHtml($dados);

//Configurar o tamanho e a orientação do papel
//landscape - imprimir no formato paisagem
$dompdf->setPaper('A4', 'portrait');

//Renderizar o HTML como pdf
$dompdf->render();

//gerar o pdf
$dompdf->stream();

?>









<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Teste Pdf</title>
</head>
<body>
    
    <h1>teste</h1>






</body>
</html>