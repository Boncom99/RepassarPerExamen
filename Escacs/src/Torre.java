public class Torre extends Peces {

    Torre(int x, int y) {
        super(x, y);
        // TODO Auto-generated constructor stub
    }

    @Override
    boolean movimentValid(int x, int y) {
        if (this.x == x || this.y == y) {
            return true;
        }
        return false;

    }

}
