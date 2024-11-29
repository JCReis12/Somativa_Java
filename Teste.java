package interFace;

public abstract class Teste {
	 
	private static String Data;
	private int Peso;
	private int Altura;

   public Teste(String Data, int Peso, int Altura) {
   this.Data = Data;
   this.Peso = Peso;
   this.Altura = Altura;
   }

public static String getData() {
	return Data;
}

public void setData(String data) {
	Data = data;
}

public int getPeso() {
	return Peso;
}

public void setPeso(int peso) {
	Peso = peso;
}

public int getAltura() {
	return Altura;
}

public void setAltura(int altura) {
	Altura = altura;
}


}