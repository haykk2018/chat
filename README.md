# chat
К. Сьерра, Б. Бейтс - Изучаем Java (Мировой компьтерный бестселлер) - 2012

Сокет (класс java.net.Socket) — это объект, представляющий сетевое соединение между двумя компьютерами․
Что за соединение? Это отношения между двумя узлами, 
программное обеспечение которых знает о существовании друг друга. Что
еще более важно, это ПО знает, как между собой общаться, то есть
обмениваться битами.

Socket chatSocket = new Socket("196.164.1.103","5000"); ip and TSP port of server

port - it's simple number with which a specific program is recognized
on the server


![websocketlifecycle_30624_l](https://user-images.githubusercontent.com/41595475/201461910-9cb2bb7b-0dfc-42b2-b85f-71002be0c7a1.png)

>web socket is full duplex conneciton, it means

>with http, only client can to initiate messaging, but with web socket, server also can to initiate messaging , it can send not only response message, it can send message initiator of which is herself.

![kDhzlquViWp3c6PTQPTovgg6P4eZ4sFlu768J2HT7wyjCFnZUGezsbueY5cMSmTPFD_oBuXlJd6DAoGnuvPHZaP1CagsVNalAvuHHqe2ayomeRsbgwPZXDSZ8R1P-Pgy_Rv8agmv](https://user-images.githubusercontent.com/41595475/201464586-f97240b1-6ca5-46c9-804b-8719f346bb59.png)

