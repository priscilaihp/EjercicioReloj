public class Reloj
{
    private int horas;
    private int minutos;
    
    public Reloj(int horaInicial, int minInicial)
    {
        horas=horaInicial;
        minutos=minInicial;
    }
    
    public String dimeTuTiempo()
    {
        String cadResultado="";
        cadResultado+=horas;
        cadResultado+=":";
        cadResultado+=minutos;
        
        return cadResultado;
    }
}