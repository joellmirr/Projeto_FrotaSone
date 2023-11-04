-- phpMyAdmin SQL Dump
-- version 4.0.10deb1ubuntu0.1
-- http://www.phpmyadmin.net
--
-- Máquina: localhost
-- Data de Criação: 25-Nov-2019 às 15:59
-- Versão do servidor: 5.5.62-0ubuntu0.14.04.1
-- versão do PHP: 5.5.9-1ubuntu4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de Dados: `controle_frotas`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `abastecimento`
--

CREATE TABLE IF NOT EXISTS `abastecimento` (
  `idabastecimento` int(11) NOT NULL AUTO_INCREMENT,
  `tipo` varchar(50) NOT NULL,
  `placa` varchar(8) NOT NULL,
  `quantidade` varchar(13) NOT NULL,
  `valor` varchar(20) NOT NULL,
  `motorista` varchar(150) NOT NULL,
  `km` varchar(150) NOT NULL,
  `data` varchar(10) NOT NULL,
  PRIMARY KEY (`idabastecimento`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Extraindo dados da tabela `abastecimento`
--

INSERT INTO `abastecimento` (`idabastecimento`, `tipo`, `placa`, `quantidade`, `valor`, `motorista`, `km`, `data`) VALUES
(1, 'GASOLINA', 'NLL0925', '14', '46,87', 'MARCOS BAAA', '12154545', '25/11/2019');

-- --------------------------------------------------------

--
-- Estrutura da tabela `motorista`
--

CREATE TABLE IF NOT EXISTS `motorista` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) NOT NULL,
  `cpf` varchar(13) NOT NULL,
  `datanascimento` varchar(13) NOT NULL,
  `endereco` varchar(100) NOT NULL,
  `bairro` varchar(70) NOT NULL,
  `cidade` varchar(70) NOT NULL,
  `estado` varchar(70) DEFAULT NULL,
  `status` varchar(20) DEFAULT NULL,
  `naturalidade` varchar(100) DEFAULT NULL,
  `nacionalidade` varchar(100) DEFAULT NULL,
  `cnhnumero` varchar(20) DEFAULT NULL,
  `cnhcategoria` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Extraindo dados da tabela `motorista`
--

INSERT INTO `motorista` (`codigo`, `nome`, `cpf`, `datanascimento`, `endereco`, `bairro`, `cidade`, `estado`, `status`, `naturalidade`, `nacionalidade`, `cnhnumero`, `cnhcategoria`) VALUES
(4, 'JOAO', '3423423', 'null', 'RUA A', 'BAIRRO B', 'CIDADE C', 'GO', ' ATIVO', 'MINAS GERAIS', 'BRASILEIRA', '3434', 'D'),
(5, 'KARINA ABREU', '23423432', '10/01/1987', 'RUA AAA', 'BAIRRO BB', 'CIDADE CC', 'GO', 'ATIVO', 'GOIANIA', 'BRASILEIRA', '888433', 'AB');

-- --------------------------------------------------------

--
-- Estrutura da tabela `multas`
--

CREATE TABLE IF NOT EXISTS `multas` (
  `idmulta` int(11) NOT NULL AUTO_INCREMENT,
  `placa` varchar(8) NOT NULL,
  `descricao` varchar(150) NOT NULL,
  `valor` varchar(20) NOT NULL,
  PRIMARY KEY (`idmulta`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=7 ;

--
-- Extraindo dados da tabela `multas`
--

INSERT INTO `multas` (`idmulta`, `placa`, `descricao`, `valor`) VALUES
(6, 'NLL0925', 'ESTACIONAMENTO EM LOCAL PROIBIDO,  MOTORISTA VILMAR', '129,00');

-- --------------------------------------------------------

--
-- Estrutura da tabela `pecas`
--

CREATE TABLE IF NOT EXISTS `pecas` (
  `idpeca` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(150) NOT NULL,
  `quantidade` varchar(13) NOT NULL,
  `descricao` varchar(150) NOT NULL,
  PRIMARY KEY (`idpeca`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Extraindo dados da tabela `pecas`
--

INSERT INTO `pecas` (`idpeca`, `nome`, `quantidade`, `descricao`) VALUES
(1, 'PNEU PIRELLI 255/55/15', '2', 'PNEU PARA CARRO DE VISITAS1');

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuario`
--

CREATE TABLE IF NOT EXISTS `usuario` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `login` varchar(100) NOT NULL,
  `nome` varchar(100) NOT NULL,
  `senha` varchar(70) NOT NULL,
  `perfil` varchar(70) NOT NULL,
  `status` varchar(70) NOT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Extraindo dados da tabela `usuario`
--

INSERT INTO `usuario` (`codigo`, `login`, `nome`, `senha`, `perfil`, `status`) VALUES
(1, 'MARCOS', 'MARCOS BATISTA ', '123', 'ADMIN1', 'ATIVO'),
(2, 'null', 'ALCOOL', 'NLL0925', '14', 'MARCOS');

-- --------------------------------------------------------

--
-- Estrutura da tabela `veiculos`
--

CREATE TABLE IF NOT EXISTS `veiculos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `codigo` varchar(10) DEFAULT NULL,
  `placa` varchar(7) NOT NULL,
  `cidade_estado` varchar(80) NOT NULL,
  `marca` varchar(30) NOT NULL,
  `modelo` varchar(40) NOT NULL,
  `ano_fab_mod` varchar(9) NOT NULL,
  `seguro` varchar(3) DEFAULT NULL,
  `seguradora` varchar(40) DEFAULT NULL,
  `inicio_seguro` varchar(10) DEFAULT NULL,
  `vencimento_seguro` varchar(10) DEFAULT NULL,
  `status` varchar(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=8 ;

--
-- Extraindo dados da tabela `veiculos`
--

INSERT INTO `veiculos` (`id`, `codigo`, `placa`, `cidade_estado`, `marca`, `modelo`, `ano_fab_mod`, `seguro`, `seguradora`, `inicio_seguro`, `vencimento_seguro`, `status`) VALUES
(1, '01', 'JMK3257', 'GOIAS', 'GM', 'KADETT', '1999', 'SIM', 'PORTO SEGURO', '01/11/2019', '30/11/2019', 'OK'),
(2, '02', 'JJT5735', 'GOIAS', 'GM', 'CHEVET', '2001', 'NAO', '', '14/11/2019', '14/11/2020', 'OK'),
(3, '01', 'NLL0925', 'GOIAS', 'HONDA', 'TITAN', '2009', 'SIM', 'PORTO SEGURO1', '01/11/2019', '14/11/2019', 'OK'),
(5, '', '010101', '', '', '', '', '', '', '', '', ''),
(7, '04', 'MMM0101', 'GOIAS', 'FIAT', 'STRADA', '2015', 'SIM', 'PORTO SEGURO', '01/01/2019', '02/02/2020', 'OK');

-- --------------------------------------------------------

--
-- Estrutura da tabela `viagem`
--

CREATE TABLE IF NOT EXISTS `viagem` (
  `idviagem` int(11) NOT NULL AUTO_INCREMENT,
  `motorista` varchar(150) NOT NULL,
  `cpf` varchar(13) NOT NULL,
  `origem` varchar(150) NOT NULL,
  `destino` varchar(150) NOT NULL,
  `placa` varchar(8) NOT NULL,
  `dataida` varchar(10) NOT NULL,
  `datavolta` varchar(10) DEFAULT NULL,
  `detalhes` varchar(200) DEFAULT NULL,
  `status` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`idviagem`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Extraindo dados da tabela `viagem`
--

INSERT INTO `viagem` (`idviagem`, `motorista`, `cpf`, `origem`, `destino`, `placa`, `dataida`, `datavolta`, `detalhes`, `status`) VALUES
(1, '', '', '', '', '', '', '', '', ''),
(2, 'marcos', '0232342', 'SAO PAULO SP', 'GOIANIA GO', 'NLL0925', '01/01/2019', '01/01/2019', 'ADSFASD', 'ADSFASD');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
