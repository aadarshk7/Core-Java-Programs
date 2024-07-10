class Pet{

  String name;
  Integer age; 
  int lifetime;

  Pet(String n, Integer a, int j){
    this.name=n;
    this.age=a;
    this.lifetime=j;
  }
//Over-riding the toString() function as a class function
  public String toString(){
    return "The name of the pet is " + this.name + ". The age of the pet is " + this.age +". The lifetime of dog is:"+ this.lifetime;
  }
}

class DemotoString {
    public static void main( String args[] ) {
      Pet p = new Pet("Puntey",10,12);
      //Calling the class version of toString()
        System.out.println(p.toString());
      //Calling the original toString()
     // System.out.println(Integer.toString(12));
    }
}