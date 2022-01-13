public abstract class Peces {
    int x;
    int y;

    Peces(int x, int y) {
        this.x = x;
        this.y = y;
    }

    abstract boolean movimentValid(int x, int y);

}
