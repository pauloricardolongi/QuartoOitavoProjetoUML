package entidades;

public class PessoaFisica extends Pagamento{
	
	private Double gastoSaude;
	
	public PessoaFisica() {
		
	}
	
	public PessoaFisica(String nome, Double rendaAnual, Double gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}

	public Double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}

	@Override
	public double taxa() {
		double impostoBasico;
		if (getRendaAnual() < 20000.00) {
			impostoBasico = getRendaAnual() * 0.15;
		}
		else {
			impostoBasico = getRendaAnual() * 0.25;
		}
		impostoBasico = impostoBasico - (getGastoSaude() * 0.5);
		if(impostoBasico < 0.0) {
			return 0.0;
		}
		else {
			return impostoBasico;
		}
		
	}

}
