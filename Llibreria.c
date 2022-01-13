#include <stdio.h>
#include <stdlib.h>
typedef struct Llibre
{
    int referencia;
    float preu;
    struct Llibre *seguent;
} Llibre;
typedef struct Client
{
    int codi_client;
    Llibre *llibres_comprats;
    struct Client *seguent;
} Client;

Client *buscarClient(int codi, Client *client)
{
    if (codi == client->codi_client)
    {
        return client;
    }
    else
    {
        if (client->seguent == NULL)
        {
            printf("no s ha trobat cap client amb codi : %d \n", codi);
            return NULL;
        }
        else
        {
            return buscarClient(codi, client->seguent);
        }
    }
}
float sumaRecursiva(Llibre *llibre)
{
    float aux = 0;
    if (llibre != NULL)
    {
        if (llibre->seguent != NULL)
        {
            aux = sumaRecursiva(llibre->seguent);
            return aux + llibre->preu;
        }
        else
        {
            return llibre->preu;
        }
    }
    return 0;
}
float sumaDinersGastats(int codi, Client *llista)
{
    Client *C = buscarClient(codi, llista);
    float suma = 0;
    suma = sumaRecursiva(C->llibres_comprats);
    return suma;
}
float sumaDinersGastats2(Client *client) //igual que a dant pero li passem el client directament
{
    float suma = 0;
    suma = sumaRecursiva(client->llibres_comprats);
    return suma;
}
void inserir_nou_client(int codi, Client *client)
{

    if (client->seguent == NULL)
    {
        Client *Nou = (Client *)malloc(sizeof(Client));
        Nou->seguent = (Client *)malloc(sizeof(Client));
        Nou->seguent = NULL;
        Nou->llibres_comprats = malloc(sizeof(Llibre *));
        Nou->llibres_comprats = NULL;
        client->seguent = Nou;
        Nou->codi_client = codi;
    }

    else if (codi < client->seguent->codi_client)
    {
        Client *Nou = (Client *)malloc(sizeof(Client));
        Nou->seguent = (Client *)malloc(sizeof(Client));
        Nou->llibres_comprats = malloc(sizeof(Llibre *));
        Nou->llibres_comprats = NULL;
        Nou->seguent = client->seguent;
        client->seguent = Nou;
        Nou->codi_client = codi;
    }
    else
    {
        inserir_nou_client(codi, client->seguent);
    }
}
void inserir_nou_llibre(int ref, Llibre *llibre)
{

    if (llibre->seguent == NULL)
    {
        Llibre *Nou = (Llibre *)malloc(sizeof(Llibre));
        Nou->referencia = ref;
        Nou->seguent = malloc(sizeof(Llibre *));
        Nou->seguent = NULL;
        Nou->preu = 3.0;
        llibre->seguent = Nou;
    }
    else
    {
        inserir_nou_llibre(ref, llibre->seguent);
    }
}
void escriure_llibres(Llibre *llibre)
{

    printf("       -referencia: %d (%0.2f)\n", llibre->referencia, llibre->preu);
    if (llibre->seguent != NULL)
    {
        escriure_llibres(llibre->seguent);
    }
}
void escriure_llista(Client *client)
{
    float suma = sumaDinersGastats2(client);
    printf("codi_client: %d (total : %0.2f) \n", client->codi_client, suma);
    if (client->llibres_comprats != NULL)
    {
        escriure_llibres(client->llibres_comprats);
    }
    if (client->seguent != NULL)
    {
        escriure_llista(client->seguent);
    }
}

int afegirLlibre(int ref, int codi_client, Client *client)
{
    Client *C = buscarClient(codi_client, client);
    if (C == NULL)
        return 0;
    if (C->llibres_comprats == NULL)
    {
        Llibre *l = (Llibre *)malloc(sizeof(Llibre));
        l->referencia = ref;
        l->preu = 4.5;
        l->seguent = NULL;
        C->llibres_comprats = l;
    }
    else
    {
        inserir_nou_llibre(ref, C->llibres_comprats);
    }
    return 1;
}
int BuscarSiUnClientHaCompatElLlibre(int ref, Llibre *llibre) //retorna 1 si el client l 'ha comprat i 0 en cas constari
{
    if (llibre->referencia == ref)
    {
        return 1;
    }
    else if (llibre->seguent != NULL)
    {
        BuscarSiUnClientHaCompatElLlibre(ref, llibre->seguent);
    }
    return 0;
}
void mostrarCompadorsDeLlibre(int ref, Client *llista)
{
    if (llista->llibres_comprats != NULL) //en cas que no hagi comprat cap llibre no cal comprovar-lo
    {
        if (BuscarSiUnClientHaCompatElLlibre(ref, llista->llibres_comprats))
        {
            printf("El client : %d ha comprat el llibre %d \n", llista->codi_client, ref);
        }
    }
    if (llista->seguent != NULL)
    {
        mostrarCompadorsDeLlibre(ref, llista->seguent);
    }
}
int main()
{
    Client *inici_llista_clients = NULL;
    inici_llista_clients = (Client *)malloc(sizeof(Client));
    inici_llista_clients->codi_client = -1;
    inici_llista_clients->seguent = (Client *)malloc(sizeof(Client));
    inici_llista_clients->seguent = NULL;
    inserir_nou_client(24, inici_llista_clients);
    inserir_nou_client(46, inici_llista_clients);
    inserir_nou_client(77, inici_llista_clients);
    inserir_nou_client(38, inici_llista_clients);
    inserir_nou_client(29, inici_llista_clients);
    inserir_nou_client(10, inici_llista_clients);
    afegirLlibre(23, 77, inici_llista_clients);
    afegirLlibre(23, 29, inici_llista_clients);
    afegirLlibre(23, 46, inici_llista_clients);
    afegirLlibre(23, 24, inici_llista_clients);
    afegirLlibre(22, 10, inici_llista_clients);
    afegirLlibre(232, 46, inici_llista_clients);
    afegirLlibre(238, 78, inici_llista_clients);
    escriure_llista(inici_llista_clients);
    mostrarCompadorsDeLlibre(23, inici_llista_clients);

    return 0;
}