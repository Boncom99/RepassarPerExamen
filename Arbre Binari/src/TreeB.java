public class TreeB {
    NodeB root = null;

    TreeB() {
        root = new NodeB(10);
        inserta(4, root);
        inserta(5, root);
        inserta(18, root);
        inserta(17, root);
        inserta(29, root);
        inserta(19, root);
        mostra(root, 0);
        busca(19, root);
    }

    public static void main(String[] args) {
        new TreeB();
    }

    void printa(String s) {
        System.out.print(s);
    }

    void printa(NodeB n) {
        if (n == null)
            printa("null");
        else
            printa(n.value + " ");
    }

    void printaEspais(int nivell) {
        for (int i = 0; i < nivell; i++) {
            printa("  ");
        }
    }

    void mostra(NodeB root, int nivell) {
        printaEspais(nivell);
        printa(root);
        printa("\n");
        if (root == null)
            return;
        mostra(root.left, nivell + 1);
        mostra(root.right, nivell + 1);

    }

    NodeB busca(int n, NodeB root) {
        if (n == root.value)
            return root;
        else if (n > root.value) {
            return busca(n, root.left);
        } else if (n < root.value) {
            return busca(n, root.right);
        }
        return null;
    }

    boolean inserta(int n, NodeB root) {
        if (n == root.value) {
            return false;
        } else if (n > root.value) {
            if (root.left != null) {
                return inserta(n, root.left);
            } else {
                NodeB b = new NodeB(n);
                root.left = b;
                return true;
            }
        } else if (n < root.value) {
            if (root.right != null) {
                return inserta(n, root.right);
            } else {
                NodeB b = new NodeB(n);
                root.right = b;
                return true;
            }
        }

        return false;
    }

}
