package pe.edu.upeu.sgru.modelo.entity;

public class Usuario {
	private int idusuario;
	private String usuario;
	private String contraseña;
	
	public Usuario() {
		super();
	}
	
	public Usuario(int idusuario, String usuario, String contraseña) {
		super();
		this.idusuario = idusuario;
		this.usuario = usuario;
		this.contraseña = contraseña;
	}
	
	public int getIdusuario() {
		return idusuario;
	}
	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
}
