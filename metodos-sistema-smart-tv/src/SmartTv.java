public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 10;

    void mostrarDetalhes() {
        System.out.println("A tv está ligada? " + ligada);
        System.out.println("Canal atual: " + canal);
        System.out.println("Volume da tv: " + volume);
    }

    // métodos para mudar estado da tv
    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    // métodos para mudar volume da tv
    public void aumentarVolume() {
        volume++;
        System.out.println("O volume aumentou para: " + volume);
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("O volume diminuiu para: " + volume);
    }

    // métodos para mudar canal da tv
    public void aumentarCanal() {
        canal++;
    }

    public void diminuirCanal() {
        canal--;
    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }
}