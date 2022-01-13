#include <stdio.h>
#include <stdlib.h>
//al dir-li que x és un static int, estem dient que sempre es guardara en la mateixa adreça de memoria.
//pertant, el primer cop que cridem f(), no sabem que printejara, pero el segon cop printejara 4, i el 3r printejara 5.
void f(int n)
{
    //int x;
    static int x;
    printf("\n%d\n", x);
    x = n;
}
int main()
{
    f(4);
    f(5);
    f(6);
    return 0;
}