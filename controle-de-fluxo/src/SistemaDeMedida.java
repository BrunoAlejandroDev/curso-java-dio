public class SistemaDeMedida {
    public static void main(String[] args) {
        String medida = "M";
        String plano = "M";

        switch (medida) {
            case "P": {
                System.out.println("Pequeno");
                break;
            }
            case "M": {
                System.out.println("Médio");
                break;
            }
            case "G": {
                System.out.println("Grande");
                break;
            }
            default: {
                System.out.println("Tamanho Indefinido");
            }
        }

        switch (plano) {
            case "T": {
                System.out.println("Youtube ilimitado.");
            }
            case "M": {
                System.out.println("Whatsapp e Instagram ilimitados");
            }
            case "B": {
                System.out.println("100 minutos de ligação");
            }
        }
    }
}