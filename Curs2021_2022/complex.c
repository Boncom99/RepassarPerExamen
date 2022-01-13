#include <stdio.h>
#include <stdlib.h>
#include "complex.h"

void conjugat(Complexe *c)
{
    c->imag = -c->imag;
}