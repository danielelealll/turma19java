package Aulasdiasetedeabril;

public class Aviao {
	
	public String marca;
	public String tipo;
	public String ciaAerea;
	public int anoFabricacao,  quantMotores;
	public char nacionalInternacional;
	public String tipoVoo() {
		String recebeVoo = " ";
		if(nacionalInternacional == '1') {
			recebeVoo = "Vôo Nacional";
			
		}else if (nacionalInternacional =='2') {
			recebeVoo = "Vô Internacional";
			
		}
		return recebeVoo;
	}

}
