public class Bandeja {

	boolean ativa;

	int tipoNumerario;

	int qtdeNum;

	public Bandeja(int tipoNumerario, int qtdeNum, boolean ativa) {

		this.ativa = ativa;

		this.tipoNumerario = tipoNumerario;

		this.qtdeNum = qtdeNum;

	}

	public boolean isAtiva() {

		return ativa;

	}

	public void setAtiva(boolean ativa) {

		this.ativa = ativa;

	}

	public int getTipoNumerario() {

		return tipoNumerario;

	}

	public void setTipoNumerario(int tipoNumerario) {

		this.tipoNumerario = tipoNumerario;

	}

	public int getQtdeNum() {

		return qtdeNum;

	}

	public void setQtdeNum(int qtdeNum) {

		this.qtdeNum = qtdeNum;

	}

}
