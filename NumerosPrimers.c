#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
bool primer(int n, int v)
{
    if (n == v)
    {
        printf("es primer\n");
        return true;
    }
    else if (v % n != 0)
    {
        return primer(n + 1, v);
    }
    else if (v % n == 0)
    {
        printf("no es primer\n");
        return true;
    }
    return false;
}
int main()
{
    int valor;
    printf("insert number:\n");
    scanf("%d", &valor);
    int n = 2;
    if (primer(n, valor))
        printf("es primer");
    else
        printf("no es primer");

    return 0;
}
