package ExamplesOOP_Lections;

public class WalletTest {

    public static void main(String[] args) {

    Wallet wallet = new Wallet();

     wallet.initCards();
    // wallet.printAllCardsInfo();
     // wallet.printAllMonoCards();

     Card card = new MonobankATM(); // создали нов карту
     card.setCreditLimit(30000); // установили другой лимит
     card.setCardName("VIP");
     card.setCartNumber("4455 8899 6677 4455"); // другой номер
     wallet.addCard(card);
     wallet.printAllCardsInfo();
    }
}
