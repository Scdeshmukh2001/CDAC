// //Snipet 1
// public class hello {
//     public static void main(String[] args) {
//         System.out.println("Hello, World!");
//     }
// }
// //(. It should be public static void main(String[] args) instead of public void main(String[] args).)


// //Snipet 2
// public class hello {
//     public static void main(String[] args) {
//     System.out.println("Hello, World!");
//     }
// } 
// //Main method not found in class Main main method as:
// //public static void main(String[] args)
   


// //Snipet 3

// public class Main {
//     public static void main(String[] args) {
//         System.out.println("Hello, World!");
//     }
// }

//  //Main method must return void in class Main, found int   

//Snipet 4
// public class Main {
//     public static void main(String[] args) 
//     { System.out.println("Hello, World!");
//     }
// }
//Main method not found in class Main (String[] args)   

//Snipet 5
// public class Main {
//     public static void main(String[] args) { 
//         System.out.println("Main method with String[] args");
//     }
//     public static void main(int[] args) { 
//         System.out.println("Overloaded main method with int[] args");
//     }
//     }
 
    // public class Main {
    //     public static void main(String[] args) {
    //         System.out.println("Main method with String[] args");
    //         // Calling the overloaded main method
    //         main(new int[]{1, 2, 3});
    //     }
    
    //     public static void main(int[] args) {
    //         System.out.println("Overloaded main method with int[] args");
    //     }
    // }
       


// //Snipet 6
//     public class Main {
//         public static void main(String[] args) { 
//             int y = 5;// Example initialization
//             int x = y + 10; 
//             System.out.println(x);
//         }
//     }
        
//  //Error: cannot find symbol
//   //symbol:   variable y
//   //location: class Main       


// //Snipet 7        
// public class Main {
//     public static void main(String[] args) { 
//         int x = "Hello"; 
//         System.out.println(x);
//     }
//     }
//     //•	What compilation error do you see? Why does Java enforce type safety? 
    
 
// public class Main {
//         public static void main(String[] args) { 
//             String x = "Hello"; 
//             System.out.println(x);
//         }
//     }

   
// //Snipet 8    
//     public class Main {
//         public static void main(String[] args) { 
//             System.out.println("Hello, World!");
//         }
//         }
        
//        // •	What syntax errors are present? How do they affect compilation?
           


// //Snipet 9
//        public class Main {
//         public static void main(String[] args) { 
//             int class = 10; 
//             System.out.println(class);
//         }
//         }
        
//         //•	What error occurs? Why can't reserved keywords be used as identifiers?
        
//         public class Main {
//             public static void main(String[] args) { 
//                 int myClass = 10; 
//                 System.out.println(myClass);
//             }
//         }
// //Keyword        



// //Snipet 10
// public class Main { public void display() {
//     System.out.println("No parameters");
//     }
//     public void display(int num) { 
//         System.out.println("With parameter: " + num);
//     }
//     public static void main(String[] args) { display();
//     display(5);
//     }
//     }
    
//    //What happens when you compile and run this code? Is method overloading allowed?
    
//    public class Main { 
//     public void display() {
//         System.out.println("No parameters");
//     }
    
//     public void display(int num) { 
//         System.out.println("With parameter: " + num);
//     }
    
//     public static void main(String[] args) {
//         Main obj = new Main(); // Create an instance of Main
//         obj.display();        // Call instance method without parameters
//         obj.display(5);       // Call instance method with parameters
//     }
// }

//Snippet 11:
public class Main {
public static void main(String[] args) { int[] arr = {1, 2, 3}; System.out.println(arr[5]);
}
}

•//	What runtime exception do you encounter? Why does it occur?
 
public class Main {
    public static void main(String[] args) { 
        int[] arr = {1, 2, 3}; 
        System.out.println(arr[5]); // ArrayIndexOutOfBoundsException
    }
}
//Issue: You’ll get a compilation error because display() and display(int num) are instance methods, and they are being called from the static main method without creating an instance of the Main class.
//Method Overloading: Overloading is allowed as long as methods have different parameter lists. Here, display() is overloaded with display(int num).
 

//Snippet 12:
public class Main {
public static void main(String[] args) { while (true) {
System.out.println("Infinite Loop");
}
}
}

•	//What happens when you run this code? How can you avoid infinite loops?
public class Main {
    public static void main(String[] args) { 
        while (true) {
            System.out.println("Infinite Loop");
        }
    }
}



//Snippet 13:
public class Main {
public static void main(String[] args) { String str = null; System.out.println(str.length());
}
}

•//	What exception is thrown? Why does it occur?

public class Main {
    public static void main(String[] args) { 
        String str = null; 
        System.out.println(str.length()); // NullPointerException
    }
}


//Snippet 14:
public class Main {
public static void main(String[] args) { double num = "Hello"; System.out.println(num);
}
}

//•	What compilation error occurs? Why does Java enforce data type constraints?

public class Main {
    public static void main(String[] args) { 
        double num = "Hello"; 
        System.out.println(num); // Compilation error
    }
}


//Snippet 15:
public class Main {
public static void main(String[] args) { int num1 = 10;
double num2 = 5.5;
int result = num1 + num2; System.out.println(result);
}
}

//•	What error occurs when compiling this code? How should you handle different data types in operations?
public class Main {
    public static void main(String[] args) { 
        int num1 = 10;
        double num2 = 5.5;
        int result = num1 + num2; // Compilation error
        System.out.println(result);
    }
}
 

 

//Snippet 16:
public class Main {
public static void main(String[] args) { int num = 10;
double result = num / 4; System.out.println(result);
}
}

//•	What is the result of this operation? Is the output what you expected?
public class Main {
    public static void main(String[] args) { 
        int num = 10;
        double result = num / 4; 
        System.out.println(result); // Output: 2.5
    }
}

//Snippet 17:
public class Main {
public static void main(String[] args) { int a = 10;
int b = 5;
int result = a ** b; System.out.println(result);
}
}

//•	What compilation error occurs? Why is the ** operator not valid in Java?
public class Main {
    public static void main(String[] args) { 
        int a = 10;
        int b = 5;
        int result = a ** b; // Compilation error
        System.out.println(result);
    }
}



//Snippet 18:
public class Main {
public static void main(String[] args) { int a = 10;
int b = 5;
int result = a + b * 2; System.out.println(result);
}
}

//•	What is the output of this code? How does operator precedence affect the result?
public class Main {
    public static void main(String[] args) { 
        int a = 10;
        int b = 5;
        int result = a + b * 2; 
        System.out.println(result); // Output: 20
    }
}



//Snippet 19:
public class Main {
public static void main(String[] args) { int a = 10;
int b = 0;
int result = a / b; System.out.println(result);
}
}

//•	What runtime exception is thrown? Why does division by zero cause an issue in Java?
public class Main {
    public static void main(String[] args) { 
        int a = 10;
        int b = 0;
        int result = a / b; // ArithmeticException
        System.out.println(result);
    }
}


//Snippet 20:
public class Main {
public static void main(String[] args) { System.out.println("Hello, World")
}
}

//•	What syntax error occurs? How does the missing semicolon affect compilation?
public class Main {
    public static void main(String[] args) { 
        System.out.println("Hello, World") // Syntax error
    }
}



//Snippet 21:
public class Main {
public static void main(String[] args) { System.out.println("Hello, World!");
// Missing closing brace here
}

//•	What does the compiler say about mismatched braces?
public class Main {
    public static void main(String[] args) { 
        System.out.println("Hello, World!");
        // Missing closing brace here
    }
}



//Snippet 22:
public class Main {
public static void main(String[] args) { static void displayMessage() {
System.out.println("Message");
}
}
}

//•	What syntax error occurs? Can a method be declared inside another method?
public class Main {
    public static void main(String[] args) { 
        static void displayMessage() {
            System.out.println("Message");
        }
    }
}

//Snippet 23:
public class Confusion {
public static void main(String[] args) { int value = 2;
switch(value) { case 1:
System.out.println("Value is 1");
case 2:
System.out.println("Value is 2");
case 3:
System.out.println("Value is 3"); default:
System.out.println("Default case");
}
}
}

//•	Error to Investigate: Why does the default case print after "Value is 2"? How can you prevent the program from executing the default case?
public class Confusion {
    public static void main(String[] args) { 
        int value = 2;
        switch(value) { 
            case 1:
                System.out.println("Value is 1");
            case 2:
                System.out.println("Value is 2");
            case 3:
                System.out.println("Value is 3"); 
            default:
                System.out.println("Default case");
        }
    }
}


 

//Snippet 24:
public class MissingBreakCase {
public static void main(String[] args) { int level = 1;
switch(level) { case 1:
System.out.println("Level 1");
case 2:
System.out.println("Level 2");
case 3:
System.out.println("Level 3"); default:
System.out.println("Unknown level");
}
}
}

//•	Error to Investigate: When level is 1, why does it print "Level 1", "Level 2", "Level 3", and "Unknown level"? What is the role of the break statement in this situation?

public class MissingBreakCase {
    public static void main(String[] args) { 
        int level = 1;
        switch(level) { 
            case 1:
                System.out.println("Level 1");
            case 2:
                System.out.println("Level 2");
            case 3:
                System.out.println("Level 3"); 
            default:
                System.out.println("Unknown level");
        }
    }
}


//Snippet 25:
public class Switch {
public static void main(String[] args) { double score = 85.0;
switch(score) { case 100:
System.out.println("Perfect score!"); break;
case 85:
System.out.println("Great job!"); break;
default:
System.out.println("Keep trying!");
}
}
}

//•	Error to Investigate: Why does this code not compile? What does the error tell you about the types allowed in switch expressions? How can you modify the code to make it work?
public class Switch {
    public static void main(String[] args) { 
        double score = 85.0;
        switch(score) { 
            case 100:
                System.out.println("Perfect score!"); 
                break;
            case 85:
                System.out.println("Great job!"); 
                break;
            default:
                System.out.println("Keep trying!");
        }
    }
}



//Snippet 26:
public class Switch {
public static void main(String[] args) { int number = 5;
switch(number) { case 5:
System.out.println("Number is 5");
 
break; case 5:
System.out.println("This is another case 5"); break;
default:
System.out.println("This is the default case");
}
}
}

//•	Error to Investigate: Why does the compiler complain about duplicate case labels? What happens when you have two identical case labels in the same switch block?
public class Switch {
    public static void main(String[] args) { 
        int number = 5;
        switch(number) { 
            case 5: 
                System.out.println("Number is 5");
                break; 
            case 5:
                System.out.println("This is another case 5"); 
                break;
            default:
                System.out.println("This is the default case");
        }
    }
}