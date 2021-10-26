import java.math.*;
import java.lang.Math.*;
import java.util.Scanner;
import java.util.Scanner;
import java.util.Random;
public class Reactor{

//These are all the characterstics for the Reactor
  //These are the different fission products, organized by the ones that form together


    //1U235 + N --> 1Ba144 + 1 Kr90 + 2N + 200 MeV
  public Double Ba144 = 0.0;
  public Double Kr90 = 0.0;

    //1U235 + N --> 1Ba141 + 1 Kr92 + 3N + 170 MeV
  public Double Ba141 = 0.0;
  public Double Kr92 = 0.0;

    //1U235 + N --> 1Zr94 + 1Te139 + 3N + 197 MeV
  public Double Zr94 = 0.0;
  public Double Te139 = 0.0;

    //1U235 + N --> 1Xe140 + 1Sr94 + 2N + 200 MeV
  public Double Xe140 = 0.0;
  public Double Sr94 = 0.0;

//These are the Inital Ones that determine the state of the reaction
public Double U235 = 2562134200000000000000000.0;
public Double fastNutrons = 0.0;
public Double slowNutrons = 1.0;
public Double controlPercent = 0.0;
public Double graphitePercent = .5;
public Double pumpPercent = .3;
public Double Temp = 27.0;
public Double megaWatts = 0.0;

protected Double numAtoms = U235;

 public Reactor(){
 }
 public Reactor(double a, double b, double c, double d, double e){
   this.U235 = a;
   this.controlPercent = b;
   this.graphitePercent = c;
   this.pumpPercent = d;
   this.Temp = e;
 }

	/**
	* Returns value of Ba144
	* @return
	*/
	public Double getBa144() {
		return Ba144;
	}

	/**
	* Sets new value of Ba144
	* @param
	*/
	public void setBa144(Double Ba144) {
		this.Ba144 = Ba144;
	}

	/**
	* Returns value of Kr90
	* @return
	*/
	public Double getKr90() {
		return Kr90;
	}

	/**
	* Sets new value of Kr90
	* @param
	*/
	public void setKr90(Double Kr90) {
		this.Kr90 = Kr90;
	}

	/**
	* Returns value of Ba141
	* @return
	*/
	public Double getBa141() {
		return Ba141;
	}

	/**
	* Sets new value of Ba141
	* @param
	*/
	public void setBa141(Double Ba141) {
		this.Ba141 = Ba141;
	}

	/**
	* Returns value of Kr92
	* @return
	*/
	public Double getKr92() {
		return Kr92;
	}

	/**
	* Sets new value of Kr92
	* @param
	*/
	public void setKr92(Double Kr92) {
		this.Kr92 = Kr92;
	}

	/**
	* Returns value of Zr94
	* @return
	*/
	public Double getZr94() {
		return Zr94;
	}

	/**
	* Sets new value of Zr94
	* @param
	*/
	public void setZr94(Double Zr94) {
		this.Zr94 = Zr94;
	}

	/**
	* Returns value of Te139
	* @return
	*/
	public Double getTe139() {
		return Te139;
	}

	/**
	* Sets new value of Te139
	* @param
	*/
	public void setTe139(Double Te139) {
		this.Te139 = Te139;
	}

	/**
	* Returns value of Xe140
	* @return
	*/
	public Double getXe140() {
		return Xe140;
	}

	/**
	* Sets new value of Xe140
	* @param
	*/
	public void setXe140(Double Xe140) {
		this.Xe140 = Xe140;
	}

	/**
	* Returns value of Sr94
	* @return
	*/
	public Double getSr94() {
		return Sr94;
	}

	/**
	* Sets new value of Sr94
	* @param
	*/
	public void setSr94(Double Sr94) {
		this.Sr94 = Sr94;
	}

	/**
	* Returns value of U235
	* @return
	*/
	public Double getU235() {
		return U235;
	}

	/**
	* Sets new value of U235
	* @param
	*/
	public void setU235(Double U235) {
		this.U235 = U235;
	}

	/**
	* Returns value of fastNutrons
	* @return
	*/
	public Double getFastNutrons() {
		return fastNutrons;
	}

	/**
	* Sets new value of fastNutrons
	* @param
	*/
	public void setFastNutrons(Double fastNutrons) {
		this.fastNutrons = fastNutrons;
	}

	/**
	* Returns value of slowNutrons
	* @return
	*/
	public Double getSlowNutrons() {
		return slowNutrons;
	}

	/**
	* Sets new value of slowNutrons
	* @param
	*/
	public void setSlowNutrons(Double slowNutrons) {
		this.slowNutrons = slowNutrons;
	}

	/**
	* Returns value of controlPercent
	* @return
	*/
	public Double getControlPercent() {
		return controlPercent;
	}

	/**
	* Sets new value of controlPercent
	* @param
	*/
	public void setControlPercent(Double controlPercent) {
		this.controlPercent = controlPercent;
	}

	/**
	* Returns value of graphitePercent
	* @return
	*/
	public Double getGraphitePercent() {
		return graphitePercent;
	}

	/**
	* Sets new value of graphitePercent
	* @param
	*/
	public void setGraphitePercent(Double graphitePercent) {
		this.graphitePercent = graphitePercent;
	}

	/**
	* Returns value of pumpPercent
	* @return
	*/
	public Double getPumpPercent() {
		return pumpPercent;
	}

	/**
	* Sets new value of pumpPercent
	* @param
	*/
	public void setPumpPercent(Double pumpPercent) {
		this.pumpPercent = pumpPercent;
	}

	/**
	* Returns value of Temp
	* @return
	*/
	public Double getTemp() {
		return Temp;
	}

	/**
	* Sets new value of Temp
	* @param
	*/
	public void setTemp(Double Temp) {
		this.Temp = Temp;
	}

	/**
	* Returns value of megaWatts
	* @return
	*/
	public Double getMegaWatts() {
		return megaWatts;
	}

	/**
	* Sets new value of megaWatts
	* @param
	*/
	public void setMegaWatts(Double megaWatts) {
		this.megaWatts = megaWatts;
	}

	/**
	* Returns value of numAtoms
	* @return
	*/
	public Double getNumAtoms() {
		return numAtoms;
	}

	/**
	* Sets new value of numAtoms
	* @param
	*/
	public void setNumAtoms(Double numAtoms) {
		this.numAtoms = numAtoms;
	}



  public void reactCycle(){
    randSplit();
    controlAbsorb();
    reflectNutrons();
    System.out.println(this.slowNutrons);
    collide();
  }









//This section deals with random decay, the first step in the "reactCycle" method
  public void randSplit(){
    Random ran = new Random();
    Double newNum = U235 - 42;                     //THIS NUMBER IS THE ONE I NEED TO LOOK UP AND
    setU235(newNum);

    int firstReactAmount = ran.nextInt(42);
    Double firstReactAmountDouble = firstReactAmount*1.0;
    reactionOne(firstReactAmountDouble);

    int reactTwoBound = 42 - firstReactAmount;

    int secondReactAmount = ran.nextInt(reactTwoBound);
    Double secondReactAmountDouble = secondReactAmount*1.0;
    reactionTwo(secondReactAmountDouble);

    int reactThreeBound = reactTwoBound - secondReactAmount;

    int thirdReactAmount = ran.nextInt(reactThreeBound);
    Double thirdReactAmountDouble = thirdReactAmount*1.0;
    reactionThree(thirdReactAmountDouble);

    int fourthReactAmount = reactThreeBound - thirdReactAmount;
    Double fourthReactAmountDouble = fourthReactAmount*1.0;
    reactionFour(fourthReactAmountDouble);

    //TESTING PART
    /*System.out.println(firstReactAmountDouble);
    System.out.println(secondReactAmountDouble);
    System.out.println(thirdReactAmountDouble);
    System.out.println(fourthReactAmountDouble);



    System.out.println("Ba141 :" + this.Ba141);
    System.out.println("Ba144 :" + this.Ba144);
    System.out.println("fastNurtron Amount" + this.fastNutrons);
    System.out.println("temp" + this.Temp); */
  }



  //This portion deals with the absorbtion of nutrons by control rods
  public void controlAbsorb(){

    //This handles the slow nutrons
    Double unroundedSlowNutrons = this.controlPercent*this.slowNutrons;
    Double roundedSlowNutrons = roundDouble(unroundedSlowNutrons);
    setSlowNutrons(this.slowNutrons - roundedSlowNutrons);
    //this handles the fast nutrons
    Double unroundedFastNutrons = this.controlPercent*this.fastNutrons;
    Double roundedFastNutrons = roundDouble(unroundedFastNutrons);
    setFastNutrons(this.fastNutrons - roundedFastNutrons);


    //this section is for testing purposes

    //System.out.println(this.fastNutrons);
    //System.out.println(this.slowNutrons);
  }

  public void reflectNutrons(){

    //This handles the slow nutrons
    Double unroundedSlowNutrons = this.graphitePercent*this.fastNutrons;
    //Double roundedSlowNutrons = roundDouble(unroundedSlowNutrons);
    setSlowNutrons(this.slowNutrons + unroundedSlowNutrons);
    setFastNutrons(this.fastNutrons - unroundedSlowNutrons);


    //this section is for testing purposes

    //System.out.println(this.fastNutrons);
    //System.out.println(this.slowNutrons);
  }

  public void collide(){
    Double amountOfSplits = this.slowNutrons;
    Random ran = new Random();
    Double newNum = U235 - amountOfSplits;                     //THIS NUMBER IS THE ONE I NEED TO LOOK UP AND
    setU235(newNum);
    //int amountOfSplitsInt = Math.round(amountOfSplits);
    Double firstReactAmount = amountOfSplits*ran.nextDouble();
    Double firstReactAmountDouble = firstReactAmount*1.0;
    reactionOne(firstReactAmountDouble);

    Double reactTwoBound = amountOfSplits - firstReactAmount;

    Double secondReactAmount = reactTwoBound*ran.nextDouble();
    Double secondReactAmountDouble = secondReactAmount*1.0;
    reactionTwo(secondReactAmountDouble);

    Double reactThreeBound = reactTwoBound - secondReactAmount;

    Double thirdReactAmount = reactThreeBound*ran.nextDouble();
    Double thirdReactAmountDouble = thirdReactAmount*1.0;
    reactionThree(thirdReactAmountDouble);

    Double fourthReactAmount = reactThreeBound - thirdReactAmount;
    Double fourthReactAmountDouble = fourthReactAmount*1.0;
    reactionFour(fourthReactAmountDouble);

    this.slowNutrons = 0.0;
  }










      //This section has the different equations for each different collision that could happen
    //1U235 + N --> 1Ba144 + 1 Kr90 + 2N + 200 MeV
  public void reactionOne(Double ranNumber){
    setFastNutrons(this.fastNutrons + (ranNumber*2.0));
    double addedTemp = convertEnergy(200.0);
    setTemp(this.Temp + addedTemp);
    setBa144(this.Ba144 + ranNumber);
    setKr90(this.Kr90 + ranNumber);
  }


  //1U235 + N --> 1Ba141 + 1 Kr92 + 3N + 170 MeV
  public void reactionTwo(Double ranNumber){
    setFastNutrons(this.fastNutrons + (ranNumber*3.0));
    double addedTemp = convertEnergy(170.0);
    setTemp(this.Temp + addedTemp);
    setBa141(this.Ba141 + ranNumber);
    setKr92(this.Kr92 + ranNumber);
  }


    //1U235 + N --> 1Zr94 + 1Te139 + 3N + 197 MeV
  public void reactionThree(Double ranNumber){
    setFastNutrons(this.fastNutrons + (ranNumber*3.0));
    double addedTemp = convertEnergy(197.0);
    setTemp(this.Temp + addedTemp);
    setZr94(this.Zr94 + ranNumber);
    setTe139(this.Te139 + ranNumber);
  }


    //1U235 + N --> 1Xe140 + 1Sr94 + 2N + 200 MeV
  public void reactionFour(Double ranNumber){
    setFastNutrons(this.fastNutrons + (ranNumber*2.0));
    double addedTemp = convertEnergy(200.0);
    setTemp(this.Temp + addedTemp);
    setXe140(this.Xe140 + ranNumber);
    setSr94(this.Sr94 + ranNumber);
  }

//converts MeV to Celsius
  public Double convertEnergy(Double MeV){
    Double degreesC = MeV*.000000000000000084365061248733;
    return degreesC;
  }




  //rounds a double to a .0
  public Double roundDouble(Double numberToRound){
    int almostRounded = numberToRound.intValue();
    Double roundedNumber = almostRounded*1.0;
    return roundedNumber;
  }
  public void displayInfo(){
    Double totalAtoms = this.U235 + this.Ba144 + this.Kr90 + this.Ba141 + this.Kr92 + this.Zr94 + this.Te139 + this.Xe140 + this.Sr94;
    Double percentU235 = (this.U235/totalAtoms)*100;
    Double percentBa144 = (this.Ba144/totalAtoms)*100;
    Double percentKr90 = (this.Kr90/totalAtoms)*100;
    Double percentBa141 = (this.Ba141/totalAtoms)*100;
    Double percentKr92 = (this.Kr92/totalAtoms)*100;
    Double percentZr94 = (this.Zr94/totalAtoms)*100;
    Double percentTe139 = (this.Te139/totalAtoms)*100;
    Double percentXe140 = (this.Xe140/totalAtoms)*100;
    Double percentSr94 = (this.Sr94/totalAtoms)*100;



    System.out.println("Graphite Reflector Percent: " + this.graphitePercent*100 + "%");
    System.out.println("Control Rod Percent:        " + this.controlPercent*100 + "%");
    System.out.println("Pump Percent:               " + this.pumpPercent*100 + "%");
    System.out.println("  ");
    System.out.println("Temp in Degrees C:" + Temp + "Degrees Celsius");
    System.out.println("Megawatts:        " + megaWatts + "MW");
    System.out.println("   ");
    System.out.println("Fast Nutrons: " + fastNutrons);
    System.out.println("Slow Nutrons: " + slowNutrons);
    System.out.println("  ");

    System.out.println("Percents of Isotopes");


    System.out.println("U235: " + percentU235 + "%");
    System.out.println("Ba144: " + percentBa144 + "%");
    System.out.println("Kr90: " + percentKr90 + "%");
    System.out.println("Ba141: " + percentBa141 + "%");
    System.out.println("Kr92: " + percentKr92 + "%");
    System.out.println("Zr94: " + percentZr94 + "%");
    System.out.println("Te139: " + percentTe139 + "%");
    System.out.println("Xe140: " + percentXe140 + "%");
    System.out.println("Sr94: " + percentSr94 + "%");
  }
}






//reactCycle portion handles one single cycle of a reaction
