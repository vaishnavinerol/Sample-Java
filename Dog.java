class Dog  {

String dname;
String dcolor;
String dbreed;

    void dogname(String name)
    {
         dname = name;
    }
	
	 void dogcolor(String color)
    {
         dcolor = color;
    }
     
	 void dogbreed(String breed) 
    {
         dbreed = breed;
    }

    
    void printStates() {
         System.out.println(" name:" +
             dname+"\n" + " color:" +
             dcolor +"\n"+ " breed:" + dbreed);
    }



 public static void main(String[] args) {

Dog d1=new Dog();
Dog d2=new Dog();

d1.dogname("Rio");
d1.dogcolor("white");
d1.dogbreed("Lab");
d1.printStates();

	
}

}