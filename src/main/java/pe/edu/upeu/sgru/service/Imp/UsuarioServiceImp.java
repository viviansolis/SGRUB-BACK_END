package pe.edu.upeu.sgru.service.Imp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.sgru.modelo.dao.UsuarioDao;
import pe.edu.upeu.sgru.service.UsuarioService;

@Service
public class UsuarioServiceImp implements UsuarioService{
	@Autowired
	private UsuarioDao usuariodao;
	@Override
	public List<Map<String, Object>> readall() {
		// TODO Auto-generated method stub
		return usuariodao.readall();
	}
	

}
