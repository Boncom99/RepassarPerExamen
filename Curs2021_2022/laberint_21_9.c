//  0  1  2
//0|--|--|--|
// |__|__|__|
//1|--|--|--|
// |__|__|__|
//2|--|--|--|
// |__|__|__|
//matriu 3x3 i la sortida esta en la casella (2x2)
//es comença a la (0x0) i no se sap quantes caselles hi ha.
//bona tecnica, aplicara sempre la mateixa funció si les condicions son les mateixes
#include <stdio.h>
#include <stdlib.h>
#define Row 10
#define Col 10
void print(int m[Row][Col])
{
    printf("\n");
    printf(" ___ ");
    for (int k = 0; k < Col - 1; k++)
    {
        printf(" ___ ");
    }
    printf("\n");
    for (int i = 0; i < Row; i++)
    {
        for (int j = 0; j < Col; j++)
        {
            printf("| %d |", m[i][j]);
        }
        printf("\n");
        printf(" ___ ");
        for (int k = 0; k < Col - 1; k++)
        {
            printf(" ___ ");
        }
        printf("\n");
    }
}
void laberint(int m[Row][Col], int x, int y, int count) //0 si buida 1 si casella visitada. (x,y) posicio en la que estem
{

    if (!(x < 0 || x >= Col || y < 0 || y >= Row || m[y][x] > 0)) //que no siguin caselles prohibides
    {
        m[y][x] = 1;                      //visitem casella (x,y)
        laberint(m, x + 1, y, count + 1); //anem dreta
        laberint(m, x - 1, y, count + 1); //anem esquerra
        laberint(m, x, y - 1, count + 1); //anem amunt
        laberint(m, x, y + 1, count + 1); //anem avall
        m[y][x] = 0;                      //si no pot anar cap en lloc tornem per on em vingut (per trobar totes les solucions)
    }
    if (x == Col - 1 && y == Row - 1)
    {
        printf("Sortida trobada en %d passos!\n", count);
        // print(m);
    }
}
/*
    void init(int *m[Row][Col])
{

    for (int i = 0; i < Row; i++)
    {
        for (int j = 0; j < Col; j++)
        {
            *m[i][j] = 0;
        }
    }
}
*/
int main()
{
    int m[Row][Col];
    for (int i = 0; i < Row; i++)
    {
        for (int j = 0; j < Col; j++)
        {
            m[i][j] = 0;
        }
    }
    //init(&m);
    laberint(m, 0, 0, 1);

    return 0;
}