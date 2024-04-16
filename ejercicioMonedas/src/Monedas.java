
public class Monedas {

    public Monedas(){
 valorMonedas v1  = new valorMonedas();
 DescripcionMonedas d1 = new DescripcionMonedas();
        StringBuilder str = new StringBuilder();
        d1.setNombre("Sinusita");
        d1.setMaterial("Titanio morado");
        d1.setPesoMoneda(0.02);
        d1.setForma("Triangulo");
        v1.setValor(3.4);
        StringBuilder str1 = new StringBuilder("Nombre: " + d1.getNombre() + "\n" +
                "Material: " + d1.getMaterial() + "\n" + "Peso: " + d1.getPesoMoneda()
                    + "\n" + "Forma: " + d1.getForma() + "\n" + "valor respecto al oro: " + v1.getValor());
        System.out.println(str1);
}


}



