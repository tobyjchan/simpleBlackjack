import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
          String hitOrStand;
          String dealerContinue;
          int playerTotal = 0;
          int dealerTotal = 0;
          int card1 = newCard();
          int card2 = newCard();
          int card3 = newCard();
          int card4 = newCard();
      
      playerTotal = card1 + card2;
      
      System.out.println("Welcome to the table!");
      System.out.println("The dealer starts with: " + card3);
      System.out.println("Your cards are: " + card1 + " " + card2);
      System.out.println("Total: " + playerTotal);
      System.out.println("Hit or stand?");
      
        hitOrStand = scnr.next().toLowerCase();
            while(hitOrStand.equals("hit")){
              int hitCard = newCard();
              playerTotal += hitCard;
              System.out.println("Card: " + hitCard);
              System.out.println("Total:" + playerTotal);
              if(playerTotal < 21){
              System.out.println("Hit or stand?");
                hitOrStand = scnr.next().toLowerCase();
              } else if(playerTotal == 21){
                System.out.println("Blackjack! You win!");
                break;
              } else {
                System.out.println("Bust! You lose!");
                break;
                }
              }
      
            if(hitOrStand.equals("stand")){
              System.out.println("Dealer's turn!");
              dealerTotal = card3 + card4;
              System.out.println("Dealer's cards are: " + card3 + " " + card4);
              System.out.println("Total: " + dealerTotal);
              
              while(dealerTotal < 17){
                System.out.println("'C' to continue the game");
                dealerContinue = scnr.next().toLowerCase();
                
                if(dealerContinue.equals("c")){
                int dealerCard = newCard();
                dealerTotal += dealerCard;
                System.out.println("Dealer card: " + dealerCard);
                System.out.println("Dealer total: " + dealerTotal);
                } else {
                  break;
                }
              }

                if(dealerTotal > 21){
                  System.out.println("Dealer bust! You win!");
                } else if (dealerTotal == 21){
                  System.out.println("Dealer Blackjack! You lose!");
                } else if (dealerTotal > playerTotal){
                  System.out.println("Dealer wins!");
                } else if (dealerTotal == playerTotal){
                  System.out.println("Push! It's a tie!");
                } else {
                  System.out.println("You win!");
                }
              }
            }
          
    private static int newCard() {
        return (int) (Math.random() * 10) + 1;
    }
}
