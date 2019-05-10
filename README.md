Chattsystem

Jag ska skapa en app där man chattar med varandra

använd databas för att ta emot och skicka medelanden som skrivs
online kommunikation

endast två kan chatta samtidigt för att göra det simpelt

* databas

* nätverk


tables
* användare: användarnamn, lösenord

* medelanden: anvandarnamnet ska visas och medelandet visas brevid anvandarnamnet

Börja med att starta en inloggning där man skapar sin användare eller bara logga in genom att 
skriva ner sitt användarnamn och lösenord. då loggas man in och då skapas en användare, 
om man redan har en användare så loggas man in men det läggs inte till någon ny
användare på databasen. Om användarnamnet redan
finns så medelas det. 


12-04-2019
på table message så är username och message på typ varchar(255) för att det är
text int är siffror.

på table User så är username och password varchar(255). id är primary och typ
är int(11). Extra är på auto_increment.

26-04-2019
Jag ska börja med att lägga till användare till usern och kolla om mitt
program är ansluten till databasen

* 03-05-2019 
Server.java är ansluten till databasen.

* 10-05-2019 laggt till klasser för message view och user och skrivit på message.java
och Database.java
