package modelo;

public class Numero {
	private int numDecimal;
	private String numBinario = "";
	
	public Numero(int numDecimal) {
		this.numDecimal = numDecimal;
	}
	
	public void convertirBinario() {
		int num = this.numDecimal;
		while (num > 0) {
			if (num % 2 == 0) {
				numBinario = "0" + numBinario;
			} else {
				numBinario = "1" + numBinario;
			}
			num = (int) (num / 2);
		}
	}

	public int getNumDecimal() {
		return numDecimal;
	}

	public void setNumDecimal(int numDecimal) {
		this.numDecimal = numDecimal;
	}

	public String getNumBinario() {
		return numBinario;
	}

	public void setNumBinario(String numBinario) {
		this.numBinario = numBinario;
	}

}
