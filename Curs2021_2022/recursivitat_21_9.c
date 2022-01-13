#include <stdio.h>
#include <stdlib.h>

//Iterativitat
int factorial2(int n)
{

    int res = 1;
    for (int i = 1; i <= n; i++)
    {
        res *= i;
    }
    return res;
}
//Recursivitat
int factorial(int n)
{
    int k = 1;
    //Si no posem el if ens dona ERROR: STACK OVERFLOW
    // Stack memory, (memoria de la pila)
    //heap memory (memoria per variables)
    //es poden ampliar les memories aquestes
    if (n > 1)
    {
        k = n * factorial(n - 1);
    }
    return k;
}

int main()
{
    printf("factorial de 5= %i\n", factorial(5));
    printf("factorial de 5= %i\n", factorial2(5));

    return 0;
}