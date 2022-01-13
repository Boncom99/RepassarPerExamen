from Planta import *
class Parking:
    def __init__(self,nom):
        self.nom=nom
        self.plantes=[]
    def placesOcupades(self):
        suma=0
        for p in self.plantes:
            suma +=p.placesOcupades()
        return suma
    def placesTotals(self):
        suma=0
        for p in self.plantes:
            suma+=p.total()
        return suma
    def placesLliures(self):
        return self.placesTotals()-self.placesOcupades()
    def afegirPlanta(self,linia):
        self.plantes.append(Planta(linia)) 
    def __str__(self):
        s=self.nom+"\n"
        s+=f"places ocupades: {self.placesOcupades()}\n"
        s+=f"places lliures: {self.placesLliures()}\n"
        s+=f"places totals: {self.placesTotals()}\n"
        for p in self.plantes:
            s+=str(p)
        return s

    def mostrar(self):
        print(self.nom)
        #print(self.plantes)
        for p in self.plantes:
            p.mostrar()
 