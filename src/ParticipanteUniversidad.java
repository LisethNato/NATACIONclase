public class ParticipanteUniversidad extends Participante {
    private String nombreUniversidad;

    public ParticipanteUniversidad(String nombre, int edad, String genero, boolean buenaSalud, String nombreUniversidad) {
        super(nombre, edad, genero, buenaSalud, "Universidad");
        this.nombreUniversidad = nombreUniversidad;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Universidad: " + nombreUniversidad;
    }
}
