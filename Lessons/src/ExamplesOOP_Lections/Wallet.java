package ExamplesOOP_Lections;

public class Wallet {

private Card[] myCards = new Card[3]; //массив карток баз классу


public void initCards() { // а тут вже конкретные картки
Card firstCard = new PrivatBankCard();
Card secondCard = new MonobankATM();

    secondCard.setCartNumber("6655 8768 0099 1122"); // установили нов номер карты
    secondCard.setCardName("Universal");
    secondCard.setCreditLimit(5000);

myCards[0] = firstCard;
myCards[1] = secondCard;
}

public void addCard(Card card){

    for(Card mycard : myCards){
        if(card.equals(mycard) ){ // проверка нет ли у нас такой карты
System.out.println("This cars have alreadi created! Try another card.");
return;
        }
    }

    if(myCards[2]==null){ // если элемент под инд 2 == 0
        myCards[2]=card; // элемту присвоим карту
    }

}

public void printAllCardsInfo(){

    for(Card mycart : myCards){ // для всех обьектов карток
System.out.println(mycart); // toString в Cart переопределен вернет инфу про все карты
        System.out.println("==============================================");
    }
}

public  void printAllMonoCards(){ // печатаем карту если она предналежит к определенному классу
    for(Card mycart : myCards){
        if(mycart instanceof MonobankATM){
            System.out.println(mycart); // toString в Cart переопределен вернет инфу про все карты
            System.out.println("==============================================");

        }
    }

}




}
