class Planta:
    def __init__(self,linia):
        self.places=linia.split(" ")
        for i in range(len(self.places)):
            self.places[i]=int(self.places[i])
    def placesOcupades(self):
        return sum(self.places)
    def total(self):
        return len(self.places)
    def __str__(self):
        return str(self.places)+"\n"
    def mostrar(self):
        print(self.places)
