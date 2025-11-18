/**
Review the starter code: The starter code contains the br.com.coffeemachine.model.Coffee superclass, Espresso, and Latte subclasses and the main
 class Main. This starter code is the solution you coded for your previous lab, Creating multiple classes.

Refine subclasses to implement method overriding: To make coffee preparation more specific, override the grindBeans()
 and brewCoffee() methods in both subclasses. Also, override the printInfo() method in both subclasses to include the
 functionality of the printEspressoDetails() and printLatteDetails() methods.

Design a utility class to implement separation of concerns: To capture common coffee-making logic, you will create a
 utility class named CoffeeMaker. This class should have a method named prepareCoffee() that takes a br.com.coffeemachine.model.Coffee object as
 an argument and calls the appropriate methods to prepare a specific type of coffee.

Demonstrate polymorphism: Use the CoffeeMaker class to demonstrate polymorphism. Pass the objects of Espresso and Latte
 to the prepareCoffee() method to determine how the correct methods are called based on the object type.


 Expand the src folder and review the provided classes.

 br.com.coffeemachine.model.Coffee superclass:

 You already know that four attributes define br.com.coffeemachine.model.Coffee: name, roast, caffeineLevelInMg, and price.

 The parameterized constructor in the br.com.coffeemachine.model.Coffee class assigns respective values to the name, roast, and price attributes and then calls the setCaffeineLevel() method to set the caffeine level based on the chosen roast.

 The method setCaffeineLevel() checks the roast attribute value using an if-else-if statement and assigns the appropriate value to the caffeineLevel attribute.

 The grindBeans() and brewCoffee() methods simulate the general coffee preparation, and the printInfo() method is defined to print the coffee's name, roast, and caffeinLevelInMg in a formatted way.

 Espresso subclass:

 It inherits all the attributes of br.com.coffeemachine.model.Coffee and has its unique int type attribute named numberOfShots to store the number of servings for the ordered espresso.

 The parameterized constructor uses super to assign values to name, roast, and price and initializes numberOfShots using this.

 The printEspressoDetails() method prints a message about the number of servings the user orders, the cost per serving, and their total bill.

 Latte subclass:

 It inherits all the attributes of br.com.coffeemachine.model.Coffee and has two unique String type attributes, milkType and syrupFlavor.

 The parameterized constructor uses super to assign values to name, roast, and price and initializes milkType and syrupFlavor using this.

 The printLatteDetails() method prints the milk type and syrup flavor used to prepare the latte and the total bill.

 Main class:

 It contains the main() method that displays the menu to select the type of coffee you want to brew (Espresso or Latte) or exit the coffee machine and prompts for more information based on the coffee type chosen.

 It also contains the already created objects of Espresso and Latte along with respective method calls.


 Step 1: Override methods in the Espresso subclass for specific behaviors
 Espresso is a concentrated coffee shot for which the coffee beans are finely grounded and then brewed with hot water under high pressure. You must display this specialized grinding and brewing behavior in your Espresso class. To begin, open the Espresso class.

 🖥️ TODO 1:  Override the grindBeans() method to simulate grinding the espresso beans finely. For example, the method may print “Grinding the espresso beans finely…”.

 🖥️ TODO 2: Override the brewCoffee() method to simulate brewing under high pressure. For example, the method may print “Brewing the espresso under high pressure…”.

 🖥️ TODO3: Override the printInfo() method to print the common and specific details of espresso including the bill.

 🖥️ TODO 4: The printInfo() method in the br.com.coffeemachine.model.Coffee class already prints the common coffee details in a formatted way, so call it using super.

 🖥️ TODO 5: Cut the print statements from the printEspressoDetails() method and paste them here.

 🖥️ TODO 6: Delete the printEspressoDetails() method because it is not needed anymore.

 Step 2: Grind and brew an espresso
 To verify that your Espresso class works as expected, complete the following TODOs in the main() method inside the Main class:

 🖥️ TODO 7: Create an Espresso object using the parameterized constructor and pass the already declared variables as arguments (in the precise order).

 For example, Espresso myFavoriteEspresso = new Espresso(espressoName, espressoRoast, espressoPrice, numberOfShots);

 🖥️ TODO 8: Call the grindBeans() method on the Espresso object using the dot operator.

 🖥️ TODO 9: Call the brewCoffee() method on the Espresso object using the dot operator.

 🖥️ TODO 10: Call the printInfo() method on the Espresso object using the dot operator.

 🖥️ TODO 11:Open the Latte class and override the grindBeans() method to simulate the coarse grinding of beans for a latte. For example, the method may print “Grinding coffee beans coarsely for a latte (medium grind)”.

 🖥️ TODO 12: Override the brewCoffee() method to:

 Simulate brewing coffee for a latte.

 Check if syrupFlavor is selected.

 If yes, add syrup flavor,

 steam milk,

 combine coffee with steamed milk, and

 add a layer of foam.


 🖥️ TODO 13: Override the printInfo() method to print the common and specific details of the latte, including the bill:

 🖥️ TODO 14: The printInfo() method in the br.com.coffeemachine.model.Coffee class already prints the common coffee details in a formatted way, so call it using super.

 🖥️ TODO 15: Cut the print statements from the printLatteDetails() method and paste them here.

 🖥️ TODO 16: Delete the printLatteDetails() method because it is not needed anymore.

 Step 2: Grind and brew a latte
 To verify that your Latte class works as expected, complete the following TODOs in the main() method inside the Main class.

 🖥️ TODO 17: Create a Latte object using the parameterized constructor and pass the already declared variables as arguments (in the precise order).

 For example, Latte myFavoriteLatte = new Latte(LatteName, LatteRoast, LattePrice, milkType, syrupFlavor);

 🖥️ TODO 18: Call the grindBeans() method on the Latte object using the dot operator.

 🖥️ TODO 19: Call the brewCoffee() method on the Latte object using the dot operator.

 🖥️ TODO 20: Call the printInfo() method on the Latte object using the dot operator.

 🖥️ TODO 21: Create a new CoffeeMaker class.

 🖥️ TODO 22: Create a method called prepareCoffee that takes a br.com.coffeemachine.model.Coffee object as an argument and executes the proper coffee-making process. This method must be of type void because it won’t return any value.

 🖥️ TODO 23: Call the grindBeans() method on the br.com.coffeemachine.model.Coffee object using the dot operator.

 🖥️ TODO 24: Call the brewCoffee() method on the br.com.coffeemachine.model.Coffee object using the dot operator.

 🖥️ TODO 25: Create the object of CoffeeMaker class. For example: CoffeeMaker cafeCoffeeMaker = new CoffeeMaker();

 This comment is at the beginning of the main() method after the Scanner class object has been created. The creation of the CoffeeMaker object is not condition-dependent, and it will be required inside both cases in the switch statement; therefore, you should create it outside the switch statement and the while loop.

 🖥️ TODO 26: Call the prepareCoffee() method on your CoffeeMaker object and pass the Espresso object as an argument.

 🖥️ TODO 27: Call the printInfo() method on your Espresso object using the dot operator.

 🖥️ TODO 28:  Call the prepareCoffee() method on your CoffeeMaker object and pass the Latte object as an argument.

 🖥️ TODO 29: Call the printInfo() method on your Latte object using the dot operator.



 **/
