public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        System.out.println("Estado inicial: ");
        smartTv.mostrarDetalhes();

        System.out.println("");
        System.out.println("Novo estado:");
        smartTv.ligar();
        smartTv.mostrarDetalhes();

        System.out.println("");
        System.out.println("Novo estado:");
        for(int i = smartTv.volume; i < 15; i++) {
            smartTv.aumentarVolume();
        }
        smartTv.mostrarDetalhes();

        System.out.println("");
        System.out.println("Novo estado:");
        smartTv.mudarCanal(10);
        smartTv.mostrarDetalhes();
    }
}