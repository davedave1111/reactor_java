public class ReactionTest{
  public static void main(String args[]){
    Reactor myReactor = new Reactor(2562134200000000000000000.0, 0.0, 1, 0.0, 27.0);

      for(double i=1;i<=1000.0;i++){
        myReactor.reactCycle();
      }

      myReactor.displayInfo();
  }
}
