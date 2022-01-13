#include <stdio.h>
#include <stdlib.h>
//volem crear una llista dins de una funció i inicialitzar-la.
//MALLOC OR CALLOC    --> malloc(#bites),   calloc(size, sizeof(int))

//debug: to se the pointer v as an array type "parray 10 v" into the debug console
// o "p *(int(*)[10])v"
int *zeros(int size)
{                                               //la variable d'un vector es un pointer en si mateix.
                                                //pertant, un int* v també pot ser un vector
    int *v = (int *)malloc(size * sizeof(int)); //si no fessim malloc al acabar la funció es borraria la v.
    for (int i = 0; i < size; i++)
    {
        v[i] = 0;
    }
    return v;
}
int **zeros_array(int rows, int cols)
{
    int **m = (int **)malloc(rows * sizeof(int *)); //doble asterisc per identificar que tindra 2 dims.
                                                    // es un pointer de int pointers.
                                                    // m es un apuntador on cada element es un (int*).
    for (int i = 0; i < rows; i++)
    {
        m[i] = malloc(cols * sizeof(int));
    }
    return m;
}
void eliminar_matriu(int **m, int rows)
{
    for (int i = 0; i < rows; i++)
    {
        free(m[i]); //primer alliverem les files
    }
    free(m);
}
int main()

{

    int *llista;
    llista = zeros(10);
    int **array;
    array = zeros_array(4, 3);
    free(llista);
    eliminar_matriu(array, 4);
}
