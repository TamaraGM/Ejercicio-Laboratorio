public class Alumno 
{
    private String nombre;
    private String clave;
    public Alumno(String nombre, String clave)
    {
        this.nombre=nombre;
        this.clave=clave;
    }

    public String dimeNombre()
    {   
        return nombre;
    }

    public String dimeClave()
    {   
        return clave;
    }
}
