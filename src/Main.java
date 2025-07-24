import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Participante> participantes = new ArrayList<>();

        int opcion;
        do {
            System.out.println("\n--- MENÚ CONCURSO DE NATACIÓN ---");
            System.out.println("1. Registrar Participante");
            System.out.println("2. Ver lista de participantes");
            System.out.println("3. Ver participantes que pueden concursar");
            System.out.println("0. Salir");
            System.out.print("Ingrese opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Edad: ");
                    int edad = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Género: ");
                    String genero = scanner.nextLine();

                    System.out.print("Salud buena (true/false): ");
                    boolean salud = scanner.nextBoolean();
                    scanner.nextLine();

                    System.out.println("Tipo de entidad (1.Colegio 2.Universidad 3.Empresa 4.Sindicato): ");
                    int tipo = scanner.nextInt();
                    scanner.nextLine();

                    Participante p = null;
                    switch (tipo) {
                        case 1:
                            System.out.print("Nombre del Colegio: ");
                            String colegio = scanner.nextLine();
                            p = new ParticipanteColegio(nombre, edad, genero, salud, colegio);
                            break;
                        case 2:
                            System.out.print("Nombre de la Universidad: ");
                            String universidad = scanner.nextLine();
                            p = new ParticipanteUniversidad(nombre, edad, genero, salud, universidad);
                            break;
                        case 3:
                            System.out.print("Tipo de Empresa (Pública o Privada): ");
                            String empresa = scanner.nextLine();
                            p = new ParticipanteEmpresa(nombre, edad, genero, salud, empresa);
                            break;
                        case 4:
                            System.out.print("Tipo de Sindicato: ");
                            String sindicato = scanner.nextLine();
                            p = new ParticipanteSindicato(nombre, edad, genero, salud, sindicato);
                            break;
                        default:
                            System.out.println("Opción inválida.");
                    }
                    if (p != null) {
                        participantes.add(p);
                        System.out.println("Participante registrado con éxito.");
                    }
                    break;
                case 2:
                    System.out.println("\n--- Lista de Participantes Registrados ---");
                    for (Participante participante : participantes) {
                        System.out.println(participante.getInfo());
                    }
                    break;
                case 3:
                    System.out.println("\n--- Participantes Aptos para el Concurso ---");
                    for (Participante participante : participantes) {
                        if (participante.puedeParticipar()) {
                            System.out.println(participante.getInfo());
                        }
                    }
                    break;
                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
        scanner.close();
    }
}
