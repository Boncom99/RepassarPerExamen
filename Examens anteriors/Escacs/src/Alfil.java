public class Alfil extends Peces {

    Alfil(int x, int y) {
        super(x, y);
    }

    @Override
    boolean movimentValid(int x, int y) {
        if (x - this.x == y - this.y || x - this.x == -1 * (y - this.y)) {
            return true;
        }
        return false;
    }
}
