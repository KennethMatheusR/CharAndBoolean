class Main {
  public static void main(String[] args) {

    char myChar = 'D';
    char myUnicode = '\u0044';
    System.out.println(myChar);
    System.out.println(myUnicode);

  boolean myTrueBooleanValue = true;
  boolean myFalseBooleanvalue = false;

  boolean iscustomerOverTwentyOne = true;

  // this is boring .....


//challenge 

double doubleVar = 20d;
double doubleVar2 = 80d;

double outputVar = (doubleVar + doubleVar2) * 100;
System.out.println(outputVar);
double reminder = outputVar % 40;
System.out.println(reminder);
boolean outputReminder = (reminder == 0)? true : false;

boolean finalOutput = outputReminder? false : true;

if(finalOutput){
  System.out.println("Got Some Reminder");
}else{
  System.out.println("got nothing");
}


  }
}