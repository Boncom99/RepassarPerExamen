
//pseudo codi! no funciona
class Cotxe {
    int x, y, amplada, altura;
    static int general = 2;// variable compartida per totes les classes de Cotxe.
    static int contador = 0;
    }

    Cotxe() {
        x = 0;
        y = 0;
        amplada = 0;
        altura = 0;
        contador++;
    }

    Cotxe(int x0, int y0) {
        x = x0;
        y = y0;
        amplada = 0;
        altura = 0;
        contador++;
    }

static void f(){  //nomes treballa amb variables estatiques.
    general=3;
    //ara podem cridar cotxe.f(); i canviem la variable statica de totes copies de la classe.
}