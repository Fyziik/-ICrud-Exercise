# Øvelse: «ICrud» interface
I skal lave et interface som definerer hvilke metoder der skal bruges i forbindelse med CRUD operationer.
Navngiv dette interface **ICrud**.

Dette interface skal implementeres i 3 klasser.

* ArrayListRepository.java
* FileRepository.java
* DBRepository.java

I får også brug for en klasse som kan håndterer data om feks. en person. Den kan I kalde Person.java

Den første klasse skal håndtere CRUD operationer til og fra en ArrayListe. Den anden klasse skal håndtere CRUD operationer til og fra en tekstfil. Den tredje klasse skal håndtere CRUD operationer til og fra en datadase.

I behøver ikke at implementerer alt functionalliteten i disse klasser. Det er ok at der i read() metoden i feks. FileRepository.java står // ToDo: Implementeation.

I jeres Main klasse (med main metoden) kan du så afprøve dit program, og skifte mellem de forskellige muligheder at gemme data på.
