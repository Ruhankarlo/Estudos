<?php
require "conexao.php";
?>
<html lang="pt-BR">

<head>
    <meta charset="utf-8">
    <title>Busca Produto</title>
    <link rel="stylesheet" href="style.css">

</head>

<body>
    
    <a href="index.html">Início</a>
    <a href="registro.html">Cadastro</a>
    <h4>Produtos cadastrados</h4>
    <table>
        <thead>
            <tr>
                <th>SKU</th>
                <th>Nome</th>
                <th>Quantidade</th>
                <th>Marca</th>
                <th>Valor de custo</th>
                <th>Valor de Venda</th>
            </tr>
        </thead>
        <tbody>
            <?php
            $consulta = "SELECT * FROM produtos";
            $executaConsulta = mysqli_query($conexao, $consulta);
            if (mysqli_num_rows($executaConsulta) > 0) {
                foreach ($executaConsulta as $supermercado) {
            ?>
                    <tr>
                        <td><?= $supermercado['sku']; ?></td>
                        <td><?= $supermercado['nome']; ?></td>
                        <td><?= $supermercado['quantidade']; ?></td>
                        <td><?= $supermercado['marca']; ?></td>
                        <td><?= $supermercado['valor_custo']; ?></td>
                        <td><?= $supermercado['valor_venda']; ?></td>
                    </tr>
            <?php
                }
            } else {
                echo "Nenhum dado encontrado.";
            }
            ?>
        </tbody>
    </table>
</body>

</html>