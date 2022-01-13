import numpy as np
#from numpy import *   # no caldria posar np.func()
class Punt:
    n=0 #var statica per identificar el numero de punts que he creat
    def __init__(self,x,y):
        self.x,self.y=x,y 
        Punt.n+=1
    def mostrar(self):
        print(f"{self.x}, {self.y}")
    def desplaçar(self,punt2):
        self.x+=punt2.x
        self.y+=punt2.y
    def __add__(self, punt2):
        p=Punt(self.x,self.y)
        if isinstance(punt2, Punt):#discriminem entre punts i integers
            p.x+=punt2.x
            p.y+=punt2.y
        else: 
            p.x+=punt2
            p.y+=punt2
        return p
    def __radd__(self, punt2): #suma per la dreta
       return self+punt2 
    """def __str__(self):#per poden llegir un Punt com a string i podem fer print(Punt)
        #return "as string ("+str(self.x)+", "+ str(self.y)+")"
        return f"({self.x},{self.y})"    """
    def __repr__(self): #el mateix que __str__ pero de forma recursiva (per vectors de punts)
                        #ara amb aixo ja no ens cal __str__
        return f"({self.x},{self.y})"


p1=Punt(1,2)
p2=Punt(3,4)
p1.mostrar()
p1.desplaçar(p2)
p1.mostrar()
p3=p1+p2
p4=p1+4
p3.mostrar()
p4.mostrar()
p5=3+p2
p5.mostrar()
print(Punt.n) #num de punts creats
print(p4)
v=[p1,p2,p3]
print(v)

#fer una llista de 5 zeros
v2=[0]*5
print(v2)
v3=[None]*10  #null
v3[2]=4
print(v3)
contadorNone=0
for n in v3:
    if n is None:   #n is None .  # "==" compara contingut, "is" compara apuntadors. "is" és mes rapid en aquest cas
        contadorNone+=1
print(contadorNone)

#matriu
m=[[0]*5]*7#matriu de zeros de 5x7. apliquem la primera fila 7 vegades
#pertant, si fem:
m[1][1]=4
#esta canviant el segon element de totes les files
print(m)
m2=[[0]*5 for _ in range(7)]#matriu de zeros de 5x7. replica [0]*5 7 vegades
m2[1][1]=4
print(m2)

x=5
n=3 if x<4 else 8    #if and else inline
print(f"valor n= {n}")

#numpy
v1=np.array([1,2,3])
print (v1)