#include <stdio.h>
#include <stdlib.h>
//#include "complex.c" //es podria fer aixo pero es poc practic.
#include "complex.h" //millor fer aixo.

int main()
{

    Complexe c1;
    c1.real = 2;
    c1.imag = 3;
    conjugat(&c1);
    printf("%f, %f i\n", c1.real, c1.imag);
    return 0;
}