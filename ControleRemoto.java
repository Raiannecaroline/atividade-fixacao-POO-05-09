public class ControleRemoto {

    private Brinquedo brinquedo;

    public Brinquedo getBrinquedo() {
        return brinquedo;
    }

    public void setBrinquedo(Brinquedo brinquedo) {
        this.brinquedo = brinquedo;
    }

    public ControleRemoto(Brinquedo brinquedo) {
        this.brinquedo = brinquedo;
    }

    public void mover(Brinquedo brinquedo) {
        brinquedo.mover();
    }
}
