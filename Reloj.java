public class Reloj
{
    // Variables de Instancia
    private int horas;
    private int minutos;
    
    /**
     * Constructor
     * @author Priscila Hernandez
     * @param horaInicial Pide la hora actual.
     * @param minInicial Pide los minutos actuales.
     */
    public Reloj(int horaInicial, int minInicial)
    {
        horas = horaInicial;
        minutos = minInicial;
    }
    
    /**
     * Muestra la hora.
     * @return Cadena de caracteres con la hora actual.
     */
    public String dimeTuTiempo()
    {
        String cadResultado = "";
        cadResultado += horas;
        cadResultado += ":";
        cadResultado += minutos;
        
        return cadResultado;
    }
    
    public void recorre()
    {
        for(int h = horas; h < 24; h++)
        {
            for(int m = minutos; m < 60; m++);
}