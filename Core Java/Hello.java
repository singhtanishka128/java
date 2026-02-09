
//  class Hello{
//     public static void main(String args[]){
        
//     }
// }

// print something:
//  class Hello{
//     public static void main(String a[]){
//         System.out.println("hey");
//     }
// }


// //literals: 
// class Hello{
//     public static void main(String a[]){
//         int x = 0b101; //using binary to print integer 5
//         int y = 0x7E; //hexadecimal 
//         int z = 100_00_00; //java allows this to ease the counting of 0 for devs
//         System.out.println(x);
//         System.out.println(y);
//         System.out.println(z);
//         char c = 'a';
//         c++;  //integer operation on character
//         System.out.println(c);
//     }
// }


// //explicit & implicit type conversion:
//  class Hello{
//     public static void main(String args[]){
//         int a = 9;
//         byte b = 66;
//         a = b; //implicit type-casting short range byte into big range int -> type conversion = automatic conversion
//         System.out.println(a); //66
//         int x = 2;
//         byte z = 24;
//         //z = x;
//         //System.out.println(z); //throws error - cant cast big range int into short range byte
//         z = (byte) x; //explicit type casting (specifying the type)- converting bigger range int into shorter range byte and then reassigning the value
//         System.out.println(z); //2
//         byte g = 10;
//         byte h = 30;
//         int p = g * h; //type promotion - when byte*byte it results into byte but when the outcome goes out of range java allows the type promotion
//         System.out.println(p);
//     }
// }


// // logical operators
//  class Hello{
//     public static void main(String args[]){
//         int x=7;
// 		int y=5;
// 		int a=5;
// 		int b=9;
//         boolean result= x<y || a<b || a>1 ;
// 		System.out.println(result); //true
//     }
// }


// //if else
//  class Hello{
//     public static void main(String a[]){
//         int x=8;
// 		int y=7;
// 		if(x>y) {
// 			System.out.println(x);
// 			System.out.println("Thankyou");
// 		}
// 		else
// 			System.out.println(y);	
//     }
// }


// //if else if
//  class Hello{
//     public static void main(String args[]){
//         int x=8;
// 		int y=7;
// 		int z=9;
// 		if(x>y && x>z)         //false
// 			System.out.println(x);
// 		else if(y>z)
// 			System.out.println(y);
// 		else
// 			System.out.println(z);//9
//     }
// }


// //ternary
//  class Hello{
//     public static void main(String args[]){
//         int n=5;
// 		int result=0;
// 		result = n%2==0 ? 10 : 20;
// 		System.out.println(result);
//     }
// }


// //switch case
//  class Hello{
//     public static void main(String args[]){
//     int n=3;
// 		switch(n) {
// 		case 1:
// 			System.out.println("Monday");
// 			break;
// 		case 2:
// 			System.out.println("Tuesday");
// 			break;
// 		case 3:
// 		System.out.println("Wednesday");
// 			break;
// 		case 4:
// 		System.out.println("Thursday");
// 			break;
// 		case 5:
// 		System.out.println("Friday");
// 			break;
// 		case 6:
// 		System.out.println("Saturday");
// 			break;
// 		case 7:
// 		System.out.println("Sunday");
// 			break;
// 		default:
// 			System.out.println("Enter a valid number");			
// 		}
//     }
// }


// //loops
//  class Hello{
//     public static void main(String args[]){
//         int i=1;
// 		while(i<=4)
// 		{
// 			System.out.println("Hi"+ i);
// 			i++;
// 		}
// 		System.out.println("Bye"+i);
//     }
// }
// Hi1
// Hi2
// Hi3
// Hi4
// Bye5



//  class Hello{
//     public static void main(String args[]){
//         int i=1;
//         while(i<=4)
// 		{
// 			System.out.println("Hi"+ i);
// 			int j=1;
// 			while(j<=3) {
// 				System.out.println("Hello"+j);
// 				j++;
// 			}
// 			i++;
// 		}
// 		System.out.println("Bye"+i);
//     }
// }
// Hi1
// Hello1
// Hello2
// Hello3
// Hi2
// Hello1
// Hello2
// Hello3
// Hi3
// Hello1
// Hello2
// Hello3
// Hi4
// Hello1
// Hello2
// Hello3
// Bye5


// public class Hello {
// 	public static void main(String[] args) {
// 		int i=1;
// 		do
// 		{
// 			System.out.println("Hi"+i);
// 			i++;
// 		}
// 		while(i<=4);
// 	}
// }
// Hi1
// Hi2
// Hi3
// Hi4



//  class Hello{
//     public static void main(String args[]){

// for(int i=1;i<=7;i++)
// 		{
// 			System.out.println("Day"+i);
// 			for(int j=1;j<=9;j++)
// 			{
// 				System.out.println(" "+(j+8)+"-"+(j+9));
// 			}
// 		}
        
//     }
// }
// Day1
//  9-10
//  10-11
//  11-12
//  12-13
//  13-14
//  14-15
//  15-16
//  16-17
//  17-18
// Day2
//  9-10
//  10-11
//  11-12
//  12-13
//  13-14
//  14-15
//  15-16
//  16-17
//  17-18
// Day3
//  9-10
//  10-11
//  11-12
//  12-13
//  13-14
//  14-15
//  15-16
//  16-17
//  17-18
// Day4
//  9-10
//  10-11
//  11-12
//  12-13
//  13-14
//  14-15
//  15-16
//  16-17
//  17-18
// Day5
//  9-10
//  10-11
//  11-12
//  12-13
//  13-14
//  14-15
//  15-16
//  16-17
//  17-18
// Day6
//  9-10
//  10-11
//  11-12
//  12-13
//  13-14
//  14-15
//  15-16
//  16-17
//  17-18
// Day7
//  9-10
//  10-11
//  11-12
//  12-13
//  13-14
//  13-14
//  14-15
//  13-14
//  13-14
//  14-15
//  13-14
//  13-14
//  13-14
//  13-14
//  13-14
//  13-14
//  14-15
//  13-14
//  14-15
//  15-16
//  16-17
//  14-15
//  15-16
//  16-17
//  15-16
//  16-17
//  16-17
//  17-18



//  class Hello{
//     public static void main(String args[]){
// 		int i=1;
// 		for(;i<=5;)
// 		{
// 			System.out.println("DAY"+i);
// 			i++;
// 		}

//     }
// }
// DAY1
// DAY2
// DAY3
// DAY4
// 

// int add(int n, int m){
//     return n+m;
// }
// class Hello{
//     public static void main(String args[]){
//         int num1=8;
//         int num2=9;
//         int res= add(num1,num2);
//         System.out.println(res);
//     }
// } //now this throws error, main method here is static, our add fn is non static


// class Calc{
//     public int Add(int a, int b){
//         return a+b;
//     }
// }

//  class Hello{
//     public static void main(String args[]){
//         Calc obj = new Calc();// obj object of class Calc can access any method of class Calc
//         int res= obj.Add(1,2);
//         System.out.println(res); //3
//     }
// }



//  class Hello{
//     public static void main(String args[]){
//         //int arr[] = {1,2,3,4,5,};//static array allocation
//         int arr[] = new int[5]; //total 5 zeroes stored 
//         for(int i=0;i<arr.length;i++){ //arr.size(), arr.length() doesnt work.
//             System.out.println(arr[i]);
//         }
    
//     }
// }


// //2D array
//  class Hello{
//     public static void main(String args[]){
//         int nums[][] = new int[3][4]; //row size=3, col size=4
//         for(int i=0;i<3;i++){
//             for(int j=0;j<4;j++){
//                 nums[i][j]= (int)(Math.random() * 10); //Math.random always return 0.smthng value
//             }
//         }
//          for(int i=0;i<3;i++){
//             for(int j=0;j<4;j++){
//                 System.out.print(nums[i][j] + "  ");
//             }
//             System.out.println();
//          }
//     }
// }


// //in 2Darray/matrix when the number of columns varies in each row, we call it a jagged array
//  class Hello{
//     public static void main(String args[]){
//         int nums[][] = new int[3][]; //jagged
//         //specifying no of cols for each row
//         nums[0]= new int[3];//3 cols
//         nums[1]= new int[4];//4 cols
//         nums[2]= new int[2];//2 cols
//           for(int i=0;i<3;i++){
//             for(int j=0;j<nums[i].length;j++){
//                 nums[i][j]= (int)(Math.random() * 10); //Math.random always return 0.smthng value
//             }
//         }
//          for(int i=0;i<3;i++){
//             for(int j=0;j<nums[i].length;j++){
//                 System.out.print(nums[i][j] + "  ");
//             }
//             System.out.println();
//          }
//         }
// }
// 9  7  3  
// 5  2  5  2  
// 7  4  

// //3d array
// int nums[][][] = new int[3][4][5]; 
// in 2d we access the element like (0,3)-> 0th row, 3rd col,,in 3d we do (0,3,2)-> 0th row, 3rd col, element at 2nd index of embedded subarray 

//drawbacks of arrays=>
//  cant expand/resize,
//  always have to traverse to fetch an element consuming time and space,
//  new keyword = object creation consuming space



// //array of objects
// class Student{
//     int roll;
//     String name;
//     int marks;
// }
// class Hello{
//     public static void main(String args[]){
//         Student s1 = new Student();
//         s1.roll=1;
//         s1.name= "harsh";
//         s1.marks= 90;
//         Student s2 = new Student();
//         s2.roll=3;
//         s2.name="tanishka";
//         s2.marks= 91;
//         Student s3 = new Student();
//         s3.roll=6;
//         s3.name="sara";
//         s3.marks=90;
//         Student studentsarray[] = new Student[3]; //array size 3
//         studentsarray[0]=s1;
//         studentsarray[1]=s2;
//         studentsarray[2]=s3;
//         for(int i=0;i<studentsarray.length;i++){
//             System.out.println("name: "+studentsarray[i].name+ " and roll: "+studentsarray[i].roll+ " and marks: "+studentsarray[i].marks);
//         }
//     }
// }
// name: harsh and roll: 1 and marks: 90
// name: tanishka and roll: 3 and marks: 91
// name: sara and roll: 6 and marks: 90



//  class Hello{
//     public static void main(String args[]){
//         int arr[] = new int [3];
//         arr[0]=29;
//         arr[1]=40;
//         arr[2]=50;
//         // for(int i=0; i<arr.length; i++){
//         //     System.out.println(arr[i]);
//         // }
//         //instead of this we can use for-each loop which means iterate the whole array and give me 1 value at a time;
//         for(int i : arr){ //for-each loop / enhanced for loop
//             System.out.println(i);
//         }
//     }
// }


//String comes with a captital S -> its a class
//stack and heap memory management for string literals -> open notion

// stringbuffer
//  class Hello{
//     public static void main(String args[]){
//         StringBuffer sb = new StringBuffer("");
//         System.out.println(sb.length());//0
//         System.out.println(sb.capacity());//16  default capacity = 16 characters
//         StringBuffer sb2 = new StringBuffer("tanishka");
//         System.out.println(sb2.length());//8
//         System.out.println(sb2.capacity());//24 

//         StringBuffer sb3 = new StringBuffer("ladies and gentlemen");
//         String s = sb.toString(); //storing string buffer into string

//         sb3.deleteCharAt(0);
//         System.out.println(sb3); //adies and gentlemen
//     }
// }




// class Identity{
//     private String name = "tishu";
//     private int age = 22;

//     public String getname(){
//         return name;
//     }

//     public int getage(){
//         return age;
//     }
// }

//  class Hello{
//     public static void main(String args[]){
//         Identity p1 = new Identity();
//         System.out.println("name: " + p1.getname() + " age: " + p1.getage());
//     }
// }




// class Identity{
//     //private data can never be accessible by outerclass members (only inner class elements can access it)
//     private String name;
//     private int age;
    
//     //anything made public can be accessed by anyone from anywhere
//     public void setName(String firstname){
//         name = firstname;
//     }

//     public void setAge(int years){
//         age = years;
//     }

//     public String getName(){
//         return name;
//     }

//     public int getAge(){
//         return age;
//     }
// }
 
// //here getAge fn could also have been named something else but as a developer its a standard notion to
// //make the variables/methods as self descriptive as it can 
// //thereby we use such getters and setters to fetch & set private data members

//  class Hello{
//     public static void main(String args[]){
//         Identity p1 = new Identity();
//         //p1.name= "kjbfkj"; //error -> cannot set name directly since its private but if name was made public then there would have been no error
//         p1.setName("kenny");
//         p1.setAge(22);
//         System.out.println("name: " + p1.getName() + " age: " + p1.getAge());
//     }
// }
// name: kenny age: 22




// class Identity{
//     private String name;
//     private int age;
    
//     public void setName(String name){
//         name = name;
//     }

//     public void setAge(int age){
//         age = age;
//     }

//     public String getName(){
//         return name;
//     }

//     public int getAge(){
//         return age;
//     }
// }
 
//  class Hello{
//     public static void main(String args[]){
//         Identity p1 = new Identity();
//         p1.setName("kenny");
//         p1.setAge(22);
//         System.out.println("name: " + p1.getName() + " age: " + p1.getAge()); 
//     }
// }

// name: null age: 0
// here java fails to identify which variable is instance and which is local since both have the same name





// class Identity{
//     private String name;
//     private int age;
    
//     public void setName(String name){
//         this.name = name;
//     }

//     public void setAge(int age){
//         this.age = age;
//     }

//     public String getName(){
//         return name;
//     }

//     public int getAge(){
//         return age;
//     }
// }
 
//  class Hello{
//     public static void main(String args[]){
//         Identity p1 = new Identity();
//         p1.setName("kenny");
//         p1.setAge(22);
//         System.out.println("name: " + p1.getName() + " age: " + p1.getAge()); 
//     }
// }

// name: kenny age: 22
// this keyword represents the current object, makes sure the instance variable of the current object is assigned the value of local variable passed



// In Java, default values are automatically assigned only to instance and static variables; local variables must be initialized explicitly.
//  class Hello{
//     public static void main(String args[]){
//         int x;
//         System.out.println(x);  // error
//     }
// }



// //in java if we want to perform some operations luike assignment or calculations, always do in methods
// class House{
//     private String flat;

//     //constructor:
//     //same name as the class name 
//     //automatically called the moment object is created
//     //has no return type
//     //used to initialise objects 
//     public House(){
//         flat = "4bhk";
//     }

//     public String getFlat(){
//         return flat;
//     }
// }

//  class Hello{
//     public static void main(String args[]){
//         House home = new House();
//         System.out.println(home.getFlat() + " housing"); //4bhk housing
//     }
// }




//when we have a number of methods with the same name and different parameters(type/order/number), we call it method overloading
//same for constructor overloading
 class House{
    private String flat;
    private String condition;
    private String location;

   //default constructor
    public House(){
        flat = "4bhk";
    }
   
    //parameterised constructor
    public House(String furnish, String direction){ 
        flat = "4bhk";
        condition = furnish; //if condition and furnish had been named same, we would have used this keyword
        location = direction;
    }
    /*
    eg,

     public House(String condition, String location){ 
        flat = "4bhk";
        this.condition = condition; 
        this.location = location;
    */

    public String getFlat(){
        return flat;
    }

    public String getFurnish(){
        return condition;
    }

    public String getDirection(){
        return location; //whatevr we return HAS to be an instance variable i.e declared under class (not a local varibale-> declared even under class method )
    }
}

 class Hello{
    public static void main(String args[]){
        House home = new House();
        House home2 = new House("furnished", "south-facing");
        System.out.println(home.getFlat() + " housing"); //4bhk housing
        System.out.println(home2.getFlat() + " housing, Condition: "+home2.getFurnish()+", Location: "+home2.getDirection()); //4bhk housing, Condition: furnished, Location: south-facing
        System.out.println(home.getFlat() + " housing, Condition: "+home.getFurnish()+", Location: "+home.getDirection()); //4bhk housing, Condition: null, Location: null
    }
}
