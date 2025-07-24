public class ParticipanteColegio extends Participante {
    private String nombreColegio;

    public ParticipanteColegio(String nombre, int edad, String genero, boolean buenaSalud, String nombreColegio) {
        super(nombre, edad, genero, buenaSalud, "Colegio");
        this.nombreColegio = nombreColegio;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Colegio: " + nombreColegio;
    }
}
