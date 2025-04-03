
package paqueteprincipal;


public class SalaCine {
    int aforo;
    int ocupadas;
    String Peliculas;
    double Entrada;
    
    public SalaCine(){
        aforo = 100;
        ocupadas=0;
        Peliculas="";
        Entrada=5.0;
    }
    
    public void setaforo(int afo){
        aforo = afo;
    }
    public void setocupadas(int ocu){
        ocupadas = ocu;
    }
    public void setPeliculas(String peli){
        Peliculas = peli;
    }
    public void setEntrada(double entra){
        Entrada = entra;
    }
    public void setLibre(int lib){
        int ocu;
        ocu = aforo - lib;
        ocupadas = ocu;
    }
    
    public int getaforo(){
        return aforo;
    }
    public int getocupadas(){
        return ocupadas;
    }
    public String getPeliculas(){
        return Peliculas;
    }
    public double getEntrada(){
        return Entrada;
    }
    public int getLibres(){
        int lib;
        lib = aforo - ocupadas;
        return lib;
    }
    public double getporcentaje(){
        double por;
        por = (double) ocupadas / (double) aforo * 100.0;
        return por;
    }
    public double getIngresos(){
        double ingre;
        ingre = ocupadas* Entrada;
        return ingre;
    }
    public void Vaciar(){
        ocupadas = 0;
        Peliculas = "";
    }
    public void entraUno(){
        ocupadas++;
    }
}
