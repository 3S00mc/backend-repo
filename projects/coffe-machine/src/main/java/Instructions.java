/**
It’s time to get coding!

🖥️   TODO 1: Create a new class named Espresso.

🖥️   TODO 2: Make Espresso inherit from the br.com.coffeemachine.model.Coffee class using the extends keyword.

🖥️   TODO 3: Add an int attribute named numberOfShots to store the number of servings for this espresso.

🖥️   TODO 4: Create a parameterized constructor with four arguments, name, roast, price, and numberOfShots.

🖥️   TODO 5: Use super to call the constructor of the br.com.coffeemachine.model.Coffee class and set the name, roast, and price.

🖥️   TODO 6: Initialize numberOfShots using this.

🖥️   TODO 7: Define a new method named printEspressoDetails() inside the Espresso class. This method should print a message about the number of servings the user orders, the cost per serving, and their total bill.

For example, "You asked for 3 servings! Every serving of Espresso costs 2.5$. Your total bill is 7.5$".


 🖥️   TODO 8: Create an object of the Espresso class using the parameterized constructor. Use the already declared variables as arguments (in the correct order).

 For example, Espresso myEspresso = new Espresso(espressoName, espressoRoast, espressoPrice, numberOfShots);

 🖥️   TODO 9: Call the grindBeans() method on your Espresso object using the dot operator.

 🖥️   TODO 10: Call the brewCoffee() method on your Espresso object using the dot operator.

 🖥️   TODO 11: Call the printInfo() method on your Espresso object using the dot operator.

 🖥️   TODO 12: Call the printEspressoDetails() method on your Espresso object using the dot operator.


 🖥️   TODO 13: Create a new class named Latte.

 🖥️   TODO 14: Make Latte inherit from the br.com.coffeemachine.model.Coffee class using the extends keyword.

 🖥️   TODO 15: Add two String attributes to this class:

 milkType to store the type of milk used in the latte. For example, “Whole milk”, “Skimmed milk”, “Oat milk”, or “Almond milk”.

 syrupFlavor to represent the syrup flavor to be added to the latte. For example, “Vanilla”, “Caramel”, “Hazelnut”, or “None” if no syrup is used.

 🖥️   TODO 16: Create a parameterized constructor with five arguments, name, roast, price, milkType, and syrupFlavor.

 🖥️   TODO 17: Use super to call the constructor of the br.com.coffeemachine.model.Coffee class and set the name, roast, and price.

 🖥️   TODO 18: Initialize milkType and syrupFlavor using this.

 🖥️   TODO 19: Define a new method named printLatteDetails() inside the Latte class. This method prints the milk type and syrup flavor used to prepare the latte and the total bill.
 For example, "Your latte has whole milk and hazelnut flavor. Your total bill is 3.5$".


 🖥️   TODO 20: Create an object of the Latte class using the parameterized constructor and pass the already declared variables as arguments (in the precise order).

 For example, Latte myLatte = new Latte(latteName, latteRoast, lattePrice, milkType, syrupFlavor);

 🖥️   TODO 21: Call the grindBeans() method on your Latte object using the dot operator.

 🖥️   TODO 22: Call the brewCoffee() method on your Latte object using the dot operator.

 🖥️   TODO 23: Call the printInfo() method on your Latte object using the dot operator.

 🖥️   TODO 24: Call the printLatteDetails() method on your Espresso object using the dot operator.


 When you select the roast for your coffee, you could enter anything other than the options provided (even “darker” or “lighter” would work), and the program still executes, although the output is unexpected. Try to imply conditions to control the input to the desired values only.

 Similarly, when you select the milkType and syrupFlavor for your Latte, you could enter any value other than the ones provided in the prompt’s parentheses (for example, “toned” for milkType, and “banana” for syrupFlavor). Try to apply conditions that would allow only the expected values as input.

 **/