
public class Negocio {
	private String titulo;
	private String descripcionnegocio;
	private String fechaestimadadecierre;
	private String estado;
	private double valor;
	private String nombreo;
	private String nombrep;
	
	public String getNombrep(){
		return nombrep;
	}
    public void setNombrep(String nombrep){
    	this.nombrep = nombrep;
    }
	
	public String getNombreo(){
		return nombreo;
	}
    public void setNombreo(String nombreo){
    	this.nombreo = nombreo;
    }
	
	public String getTitulo(){
		return titulo;
	}
    public void setTitulo(String titulo){
    	this.titulo = titulo;
    }
    public String getDescripcionnegocio(){
		return descripcionnegocio;
	}
    public void setDescripcionnegocio(String descripcionnegocio){
    	this.descripcionnegocio = descripcionnegocio;
    }
    public String getFechaestimadadecierre(){
		return fechaestimadadecierre;
	}
    public void setFechaestimadadecierre(String fechaestimadadecierre){
    	this.fechaestimadadecierre = fechaestimadadecierre;
    }
    public String getEstado(){
		return estado;
	}
    public void setEstado(String estado){
    	this.estado = estado;
    }
    public double getValor(){
		return valor;
	}
    public void setvalor(double valor){
    	this.valor = valor;
    }
}


