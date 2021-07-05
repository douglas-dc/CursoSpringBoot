package com.douglasdc.cursomc.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.douglasdc.cursomc.domain.Categoria;
import com.douglasdc.cursomc.domain.Cidade;
import com.douglasdc.cursomc.domain.Cliente;
import com.douglasdc.cursomc.domain.Endereco;
import com.douglasdc.cursomc.domain.Estado;
import com.douglasdc.cursomc.domain.ItemPedido;
import com.douglasdc.cursomc.domain.Pagamento;
import com.douglasdc.cursomc.domain.PagamentoComBoleto;
import com.douglasdc.cursomc.domain.PagamentoComCartao;
import com.douglasdc.cursomc.domain.Pedido;
import com.douglasdc.cursomc.domain.Produto;
import com.douglasdc.cursomc.domain.enums.EstadoPagamento;
import com.douglasdc.cursomc.domain.enums.TipoCliente;
import com.douglasdc.cursomc.repositories.CategoriaRepository;
import com.douglasdc.cursomc.repositories.CidadeRepository;
import com.douglasdc.cursomc.repositories.ClienteRepository;
import com.douglasdc.cursomc.repositories.EnderecoRepository;
import com.douglasdc.cursomc.repositories.EstadoRepository;
import com.douglasdc.cursomc.repositories.ItemPedidoRepository;
import com.douglasdc.cursomc.repositories.PagamentoRepository;
import com.douglasdc.cursomc.repositories.PedidoRepository;
import com.douglasdc.cursomc.repositories.ProdutoRepository;

@Service
public class DBService {

	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private ProdutoRepository produtoRepository;
	@Autowired
	private EstadoRepository estadoRepository;
	@Autowired
	private CidadeRepository cidadeRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired 
	private EnderecoRepository enderecoRepository;
	@Autowired
	private PedidoRepository pedidoRepository;
	@Autowired
	private PagamentoRepository pagamentoRepository;
	@Autowired
	private ItemPedidoRepository itemPedidoRepository;
	
	public void instantiateTestDatabase() throws ParseException {
		Categoria cat1 = new Categoria(null, "Informática");
        Categoria cat2 = new Categoria(null, "Escritótio");
        Categoria cat3 = new Categoria(null, "Cama mesa e banho");
        Categoria cat4 = new Categoria(null, "Eletrônicos");
        Categoria cat5 = new Categoria(null, "Jardinagem");
        Categoria cat6 = new Categoria(null, "Decoração");
        Categoria cat7 = new Categoria(null, "Perfumaria");

        Produto p1 = new Produto(null, "Computador", 2000.00);
        Produto p2 = new Produto(null, "Impressora", 800.00);
        Produto p3 = new Produto(null, "Mouse", 80.00);
        Produto p4 = new Produto(null, "Toalha de rosto", 15.00);
        Produto p5 = new Produto(null, "Travesseiro NASA", 140.00);
        Produto p6 = new Produto(null, "Jogo de facas", 100.00);
        Produto p7 = new Produto(null, "Tv LCD 42p", 1800.00);
        Produto p8 = new Produto(null, "Microondas", 80.00);
        Produto p9 = new Produto(null, "Irrigador", 29.90);
        Produto p10 = new Produto(null, "Kit de jardinagem", 125.80);
        Produto p11 = new Produto(null, "Escultura de metal", 108.50);
        Produto p12 = new Produto(null, "Espelho redondo", 49.90);
        Produto p13 = new Produto(null, "Blue de chanel", 99.00);
        Produto p14 = new Produto(null, "Mesa de escritório", 300.00);
        Produto p15 = new Produto(null, "Toalha", 50.00);
        Produto p16 = new Produto(null, "Colcha", 200.00);
        Produto p17 = new Produto(null, "Tv true color", 1200.00);
        Produto p18 = new Produto(null, "Roçadeira", 800.00);
        Produto p19 = new Produto(null, "Abajuor", 100.00);
        Produto p20 = new Produto(null, "Pente", 180.00);
        Produto p21 = new Produto(null, "Shampoo", 90.00);
        Produto p22 = new Produto(null, "Produto 22", 10.00);
        Produto p23 = new Produto(null, "Produto 23", 10.00);
        Produto p24 = new Produto(null, "Produto 24", 10.00);
        Produto p25 = new Produto(null, "Produto 25", 10.00);
        Produto p26 = new Produto(null, "Produto 26", 10.00);
        Produto p27 = new Produto(null, "Produto 27", 10.00);
        Produto p28 = new Produto(null, "Produto 28", 10.00);
        Produto p29 = new Produto(null, "Produto 29", 10.00);
        Produto p30 = new Produto(null, "Produto 30", 10.00);
        Produto p31 = new Produto(null, "Produto 31", 10.00);
        Produto p32 = new Produto(null, "Produto 32", 10.00);
        Produto p33 = new Produto(null, "Produto 33", 10.00);
        Produto p34 = new Produto(null, "Produto 34", 10.00);
        Produto p35 = new Produto(null, "Produto 35", 10.00);
        Produto p36 = new Produto(null, "Produto 36", 10.00);
        Produto p37 = new Produto(null, "Produto 37", 10.00);
        Produto p38 = new Produto(null, "Produto 38", 10.00);
        Produto p39 = new Produto(null, "Produto 39", 10.00);
        Produto p40 = new Produto(null, "Produto 40", 10.00);
        Produto p41 = new Produto(null, "Produto 41", 10.00);
        Produto p42 = new Produto(null, "Produto 42", 10.00);
        Produto p43 = new Produto(null, "Produto 43", 10.00);
        Produto p44 = new Produto(null, "Produto 44", 10.00);
        Produto p45 = new Produto(null, "Produto 45", 10.00);
        Produto p46 = new Produto(null, "Produto 46", 10.00);
        Produto p47 = new Produto(null, "Produto 47", 10.00);
        Produto p48 = new Produto(null, "Produto 48", 10.00);
        Produto p49 = new Produto(null, "Produto 49", 10.00);
        Produto p50 = new Produto(null, "Produto 50", 10.00);

        cat1.getProdutos()
                .addAll(Arrays.asList(p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22, p23, p24, p25, p26, p27,
                        p28, p29, p30, p31, p32, p33, p34, p35, p36, p37, p38, p39, p40, p41, p42, p43, p44, p45, p46,
                        p47, p48, p49, p50));
        cat2.getProdutos().addAll(Arrays.asList(p2, p14));
        cat3.getProdutos().addAll(Arrays.asList(p4, p5, p6, p15, p16));
        cat4.getProdutos().addAll(Arrays.asList(p1, p2, p3, p7, p8, p17));
        cat5.getProdutos().addAll(Arrays.asList(p9, p10, p18));
        cat6.getProdutos().addAll(Arrays.asList(p11, p12, p19, p20));
        cat7.getProdutos().addAll(Arrays.asList(p13, p21));

        p1.getCategorias().addAll(Arrays.asList(cat1, cat4));
        p2.getCategorias().addAll(Arrays.asList(cat1, cat2, cat4));
        p3.getCategorias().addAll(Arrays.asList(cat1, cat4));
        p4.getCategorias().addAll(Arrays.asList(cat3));
        p5.getCategorias().addAll(Arrays.asList(cat3));
        p6.getCategorias().addAll(Arrays.asList(cat3));
        p7.getCategorias().addAll(Arrays.asList(cat4));
        p8.getCategorias().addAll(Arrays.asList(cat4));
        p9.getCategorias().addAll(Arrays.asList(cat5));
        p10.getCategorias().addAll(Arrays.asList(cat5));
        p11.getCategorias().addAll(Arrays.asList(cat6, cat2));
        p12.getCategorias().addAll(Arrays.asList(cat1, cat6, cat2));
        p13.getCategorias().addAll(Arrays.asList(cat1, cat7));
        p14.getCategorias().addAll(Arrays.asList(cat1, cat2));
        p15.getCategorias().addAll(Arrays.asList(cat1, cat3));
        p16.getCategorias().addAll(Arrays.asList(cat1, cat3));
        p17.getCategorias().addAll(Arrays.asList(cat1, cat4));
        p18.getCategorias().addAll(Arrays.asList(cat1, cat5));
        p19.getCategorias().addAll(Arrays.asList(cat1, cat6));
        p20.getCategorias().addAll(Arrays.asList(cat1, cat6));
        p21.getCategorias().addAll(Arrays.asList(cat1, cat7));
        p22.getCategorias().add(cat1);
        p23.getCategorias().add(cat1);
        p24.getCategorias().add(cat1);
        p25.getCategorias().add(cat1);
        p26.getCategorias().add(cat1);
        p27.getCategorias().add(cat1);
        p28.getCategorias().add(cat1);
        p29.getCategorias().add(cat1);
        p30.getCategorias().add(cat1);
        p31.getCategorias().add(cat1);
        p32.getCategorias().add(cat1);
        p33.getCategorias().add(cat1);
        p34.getCategorias().add(cat1);
        p35.getCategorias().add(cat1);
        p36.getCategorias().add(cat1);
        p37.getCategorias().add(cat1);
        p38.getCategorias().add(cat1);
        p39.getCategorias().add(cat1);
        p40.getCategorias().add(cat1);
        p41.getCategorias().add(cat1);
        p42.getCategorias().add(cat1);
        p43.getCategorias().add(cat1);
        p44.getCategorias().add(cat1);
        p45.getCategorias().add(cat1);
        p46.getCategorias().add(cat1);
        p47.getCategorias().add(cat1);
        p48.getCategorias().add(cat1);
        p49.getCategorias().add(cat1);
        p50.getCategorias().add(cat1);

        categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3, cat4, cat5, cat6, cat7));
        produtoRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16,
                p17, p18, p19, p20, p21, p22, p23, p24, p25, p26, p27, p28, p29, p30, p31, p32, p34, p35, p36, p37, p38,
                p39, p40, p41, p42, p43, p44, p45, p46, p47, p48, p49, p50));
		
		Estado est1 = new Estado(null, "Minas Gerais");
		Estado est2 = new Estado(null, "São Paulo");
		
		Cidade c1 = new Cidade(null, "Uberlândia", est1);
		Cidade c2 = new Cidade(null, "São Paulo", est2);
		Cidade c3 = new Cidade(null, "Campinas", est2);
		
		est1.getCidades().addAll(Arrays.asList(c1)); //adicionando cidades ao array
		est2.getCidades().addAll(Arrays.asList(c2, c3));
		
		estadoRepository.saveAll(Arrays.asList(est1, est2));
		cidadeRepository.saveAll(Arrays.asList(c1, c2, c3));
		
		Cliente cli1 = new Cliente(null, "Maria Silva", "maria@gmail.com", "36378912377", TipoCliente.PESSOAFISICA);
		
		cli1.getTelefones().addAll(Arrays.asList("27363323", "93838393")); //cliente conhecendo os seus telefones
		
		Endereco e1 = new Endereco(null, "Rua Flores", "300", "Apto 203", "Jardim", "38220834", cli1, c1);
		Endereco e2 = new Endereco(null, "Avenida Matos", "105", "Sala 800", "Centro", "38777012", cli1, c2);
		
		cli1.getEnderecos().addAll(Arrays.asList(e1, e2)); //cliente conhecendo os seus endereços
		
		clienteRepository.saveAll(Arrays.asList(cli1));
		enderecoRepository.saveAll(Arrays.asList(e1, e2));
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
		Pedido ped1 = new Pedido(null, sdf.parse("30/09/2017 10:32"), cli1, e1);
		Pedido ped2 = new Pedido(null, sdf.parse("10/10/2017 19:35"), cli1, e2);
		
		Pagamento pagto1 = new PagamentoComCartao(null, EstadoPagamento.QUITADO, ped1, 6);
		ped1.setPagamento(pagto1);
		
		Pagamento pagto2 = new PagamentoComBoleto(null, EstadoPagamento.PENDENTE, ped2, sdf.parse("20/10/2017 00:00"), null);
		ped2.setPagamento(pagto2);
		
		cli1.getPedidos().addAll(Arrays.asList(ped1, ped2));
		
		pedidoRepository.saveAll(Arrays.asList(ped1, ped2));
		pagamentoRepository.saveAll(Arrays.asList(pagto1, pagto2));
		
		ItemPedido ip1 = new ItemPedido(ped1, p1, 0.00, 1, 2000.00);
		ItemPedido ip2 = new ItemPedido(ped1, p3, 0.00, 2, 80.00);
		ItemPedido ip3 = new ItemPedido(ped2, p2, 100.00, 1, 800.00);
		
		ped1.getItens().addAll(Arrays.asList(ip1, ip2));
		ped2.getItens().addAll(Arrays.asList(ip3));
		
		p1.getItens().addAll(Arrays.asList(ip1));
		p2.getItens().addAll(Arrays.asList(ip3));
		p3.getItens().addAll(Arrays.asList(ip2));
		
		itemPedidoRepository.saveAll(Arrays.asList(ip1, ip2, ip3));
	}
}