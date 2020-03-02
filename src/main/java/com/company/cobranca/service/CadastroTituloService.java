package com.company.cobranca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.company.cobranca.model.StatusTitulo;
import com.company.cobranca.model.Titulo;
import com.company.cobranca.repository.Titulos;
import com.company.cobranca.repository.filter.TituloFilter;

@Service
public class CadastroTituloService {

	@Autowired
	Titulos titulos;
	
	public void salvar (Titulo titulo) {	
		try {
			titulos.save(titulo);
		} catch (DataIntegrityViolationException e) {
			throw new IllegalArgumentException("Formato de data inválido");
		}
	}
		
	public void excluir(Long codigo) {
		titulos.delete(codigo);
	}

	
	public String receber(Long codigo) {
		Titulo titulo = titulos.findOne(codigo);
		titulo.setStatus(StatusTitulo.RECEBIDO);
		titulos.save(titulo);
		
		return StatusTitulo.RECEBIDO.getDescricao();
	}
	
	
	public List<Titulo> filtrar(TituloFilter filtro){
		
		String descricao = filtro.getDescricao() == null ? "%" : filtro.getDescricao();
		return titulos.findByDescricaoContaining(descricao);
	}
	
}
