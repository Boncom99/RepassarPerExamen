from Parking import *
f=open("parkings.txt","r")
iniciemParking=True
parkings=[]
plantes=[]
for linia in f:
    linia=linia.strip()  # per netejar els \n
    if iniciemParking:
        park=Parking(linia)
        parkings.append(park)
        iniciemParking=False
        continue
    elif linia=="":
        iniciemParking=True
        continue
    else:
        park.afegirPlanta(linia)

for p in parkings:
    print(p)


    