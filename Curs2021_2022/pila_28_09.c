#include <stdio.h>
#include <stdlib.h>
//la idea és crear una llista amb elements de la forma:
// valor| apuntador cap al següent de la llista
//v1|NULL , v2|*v1, v3|*v2,     v3 és el TOP
//el ultim element apunta a NULL = adressa 00000000000
typedef struct elementPila
{
    int dada;
    struct elementPila *seg;
} ElementPila;
void push(int n, ElementPila **top)
{
    ElementPila *p = malloc(sizeof(ElementPila));
    p->dada = n;
    p->seg = *top;
    *top = p;
}
int pila_buida(ElementPila *top)
{
    if (top->seg == NULL)
        return 1;
    return 0;
}
int pop(ElementPila **top)
{
    if (!pila_buida(*top))
    {

        int aux = (*top)->dada;
        ElementPila *p = *top;
        *top = p->seg;
        free(p);
        return aux;
    }
    return 0;
}
void initializer(ElementPila **top)
{
    *top = NULL;
}
int main()
{
    ElementPila *top;
    initializer(&top);

    push(5, &top);
    push(6, &top);
    push(8, &top);
    push(5, &top);
    push(4, &top);
    push(2, &top);
    printf("%d \n", pop(&top));
    printf("%d \n", pop(&top));
    printf("%d \n", pop(&top));
    printf("%d \n", pop(&top));
    printf("%d \n", pop(&top));

    return 0;
}