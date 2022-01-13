#include <stdio.h>
#include <stdlib.h>
#define N 7

typedef struct pila
{
    int v[N];
    int top;
} Pila; //es el nom amb el que definirem la estructura

int is_full(Pila *p) //passem un apuntador ja que ocupa menys
{
    if (p->top == N - 1) //es quan top marqui l'index de l'ultima posicioó (50), pero com es comença des del 0, la ultima serà 49
        return 1;
    return 0;
}
int is_empty(Pila *p)
{
    if (p->top == -1)
        return 1;
    return 0;
}
void push(int n, Pila *p)
{
    if (!is_full(p))
    {

        (p->top)++;
        p->v[p->top] = n;
    }
    else
    {
        printf("can not push() bc the stack is full\n");
    }
}
void pop(Pila *p)
{
    if (!is_empty(p))
    {
        int aux = p->v[p->top];
        (p->top)--;
        printf("poped %i \n", aux);
    }
    else
    {
        printf("can not pop() bc the stack is empty\n");
    }
}
initialize(Pila *p)
{
    p->top = -1;
}
int main()
{
    Pila pila;
    initialize(&pila);

    push(4, &pila);
    push(4, &pila);
    push(4, &pila);
    push(4, &pila);
    push(4, &pila);
    push(4, &pila);
    push(4, &pila);
    push(4, &pila);
    push(4, &pila);
    for (int i = 0; i < pila.top + 1; i++)
    {
        printf("%i, ", pila.v[i]);
    }
    printf("\n");
    pop(&pila);
    pop(&pila);
    pop(&pila);
    pop(&pila);
    pop(&pila);
    pop(&pila);
    pop(&pila);
    pop(&pila);
    pop(&pila);
    pop(&pila);

    push(5, &pila);
    push(4, &pila);
    push(4, &pila);
    push(7, &pila);
    push(9, &pila);
    for (int i = 0; i < pila.top + 1; i++)
    {
        printf("%i, ", pila.v[i]);
    }

    return 0;
}
