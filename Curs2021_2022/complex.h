#ifndef COMPLEX_H //serveix per que si cridem el include "complex.h" a varios docs, passaria per aquest doc varios cops. \
                  //aixi si ja hem definit CoMPLEX_H no tornara a corre el codi
#define COMPLEX_H
typedef struct complexe
{
    double real, imag;
} Complexe;
void conjugat(Complexe *c);
#endif