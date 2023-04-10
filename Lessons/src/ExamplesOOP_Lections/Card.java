package ExamplesOOP_Lections;

import java.util.Objects;

public abstract class Card {

    private String cartNumber = "5588 4469 2214 7543";

    protected long ballance = 2500; // protected щоб наше поле могли бачити нащадки

    private String cardName = "Gold";

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    private String surName = "Slava Fedos";

    private long creditLimit = 20000;

    public void setCartNumber(String cartNumber) {
        this.cartNumber = cartNumber;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    // геттери для private полей
    public String getCardName() {return cardName;}

    public String getCartNumber() {return cartNumber;}

    public String getSurName() {return surName;}

    public long getBallance() {return  ballance;}

    public long getCreditLimit() {return  creditLimit;}


    // сетер для встановлення лимиту
    public void setCreditLimit(long creditLimit) {this.creditLimit=creditLimit;}

    public  abstract String getBank();


    // наслідники повинні будуть реалізувати абстракні методи
    public abstract long withDrawMoney(long amountToWithDraw);

    @Override
    public boolean equals(Object o) { // переопределили equals да бы сравнение было правильным,
        if (this == o) return true; // сравнение по номеру карьты
        if (!(o instanceof Card card)) return false;
        return Objects.equals(cartNumber, card.cartNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cartNumber);
    }

    public String toString(){
        return "Bank is a " + getBank() +", card number is " + cartNumber + ", owner is " + surName + ", your ballance is "+ ballance + ", your card is a "+ cardName +
                ", credit limit is "+ creditLimit + ".";
    }
}


