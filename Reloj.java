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
    
    /**
     * Avanza el reloj.
     */
    public void tictoc()
    {
        horas++;
        if(horas == 24)
        {
            horas = 0;
        }
        minutos++;
        if(minutos == 60)
        {
            minutos = 0;
        }
    }
}