    public class ParticipanteEmpresa extends Participante {
        private String tipoEmpresa; // "Pública" o "Privada"

        public ParticipanteEmpresa(String nombre, int edad, String genero, boolean buenaSalud, String tipoEmpresa) {
            super(nombre, edad, genero, buenaSalud, "Empresa");
            this.tipoEmpresa = tipoEmpresa;
        }

        @Override
        public String getInfo() {return super.getInfo() + ", Tipo Empresa: " + tipoEmpresa;
        }
    }


