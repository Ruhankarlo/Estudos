<?php
require("conexao.php");
$sku = $_POST['sku'];
$nome = $_POST['nome'];
$quantidade = $_POST['quantidade'];
$marca = $_POST['marca'];
$valor_custo = $_POST['valor_custo'];
$valor_venda = $_POST['valor_venda'];

$insereProduto = "INSERT INTO produtos(sku, nome, quantidade, marca, valor_custo, valor_venda) VALUES ('$sku','$nome','$quantidade','$marca', '$valor_custo', '$valor_venda')";
$operacaoSQL = mysqli_query($conexao, $insereProduto);
if (mysqli_affected_rows($conexao) != 0) {
echo "Dado encontrado com Sucesso!";
header("Location: registro.html");
} else {
echo " O dado não foi encontrado com Sucesso!";
header("Location: registro.html");
}
?>