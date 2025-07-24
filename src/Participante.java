public class Participante {
    private String nombre;
    private int edad;
    private String genero;
    private boolean buenaSalud;
    private String tipoEntidad;

    public Participante(String nombre, int edad, String genero, boolean buenaSalud, String tipoEntidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.buenaSalud = buenaSalud;
        this.tipoEntidad = tipoEntidad;
    }

    public boolean puedeParticipar() {
        return edad >= 18 && edad <= 25 && buenaSalud;
    }

    public String getInfo() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Género: " + genero +
                ", Salud: " + (buenaSalud ? "Buena" : "No apta") + ", Entidad: " + tipoEntidad;
    }

    public boolean isBuenaSalud() {
        return buenaSalud;
    }

    public int getEdad() {
        return edad;
    }
}
