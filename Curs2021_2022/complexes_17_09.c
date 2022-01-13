#include <stdio.h>
#include <stdlib.h>

typedef struct complex
{
    double r;
    double i;
} Complex;
Complex suma_c(Complex c1, Complex c2)
{
    Complex c;
    c.r = c1.r + c2.r;
    c.i = c1.i + c2.i;
    return c;
}
void conjugat(Complex *c) //un apuntador ocupa 8 bites, en cambi, si passem un complex 2x ints = 2x 8 bites es mes tedios.
{
    //(*c).i = -(*c).i;
    c->i = -c->i;
}
void print_c(Complex c)
{
    printf("%f + %f i ", c.r, c.i);
}

int main()
{
    Complex c1;
    c1.r = 2;
    c1.i = 4;
    Complex c2;
    c2.r = 2;
    c2.i = 4;
    Complex c;
    c = suma_c(c1, c2);
    conjugat(&c);
    print_c(c);
}