package laboratorioCaja;

public class PruebaCaja {

	public static void main(String[] args) {
		
		int medidaAncho = 3;
        int medidaAlto = 2;
        int medidaProf = 6;

        Caja caja1 = new Caja();
        caja1.ancho = medidaAncho;
        caja1.alto = medidaAlto;
        caja1.profundo = medidaProf;
        int resultado = caja1.calcularVolumen();

        System.out.println("resultado volumen de caja 1:" + resultado);

        Caja caja2 = new Caja(2, 4, 6);
        System.out.println("resultado volumen de caja 2:" + caja2.calcularVolumen());
	}

}
