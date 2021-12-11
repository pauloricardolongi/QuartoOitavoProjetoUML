package entidades;

public class Juridica extends Pagamento{
	private int numeroEmpregado;
	
	public Juridica() {
		
	}
	
	
	public Juridica(String nome, Double rendaAnual, int numeroEmpregado) {
		super(nome, rendaAnual);
		this.numeroEmpregado = numeroEmpregado;
	}

	public int getNumeroEmpregado() {
		return numeroEmpregado;
	}


	public void setNumeroEmpregado(int numeroEmpregado) {
		this.numeroEmpregado = numeroEmpregado;
	}

	@Override
	public double taxa() {
		if(numeroEmpregado > 10) {
			return getRendaAnual() * 14.0 / 100;
		}
		else {
		return	getRendaAnual() * 16.0 /100;
		}
		
	}
	

}
