public class AppBrinquedo {
    public static void main(String[] args) {

        //Caminhão
        Brinquedo caminhao = new Caminhao();
        ControleRemoto controleRemoto = new ControleRemoto(caminhao);

        controleRemoto.mover(caminhao);


        Brinquedo navio = new Navio();
        ControleRemoto controleRemoto2 = new ControleRemoto(navio);

        controleRemoto2.mover(navio);


        Brinquedo helicoptero = new Helicoptero();
        ControleRemoto controleRemoto3 = new ControleRemoto(helicoptero);

        controleRemoto3.mover(helicoptero);

    }
}
