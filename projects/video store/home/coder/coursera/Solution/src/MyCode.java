public class MyCode {
    public static void main(String[] args) {
        //TODO 1: Declare and initialize variable for First Name
        String firstName = "Pedro";
        System.out.println("First Name: " + firstName);

        //TODO 1: Declare and initialize variable for Last Name
        String lastName = "Costa";
        System.out.println("Last Name: " + lastName);

        //TODO 1: Declare and initialize variable for Movie Title
        String movieTitle = "Gladiator";
        System.out.println("Movie Title: " + movieTitle);

        //TODO 1: Declare and initialize variable for Number of tickets
        int numberOfTickets = 10;
        System.out.println("Number of Tickets: " + numberOfTickets);

        //TODO 1: Declare and initialize variable for Price per ticket
        double pricePerTicket = 27.40;
        System.out.println("Price per ticket: $" + pricePerTicket);

        //TODO 2: Calculate the total price based on number of tickets and price per ticket. Print the output of the total price
        double totalPrice = numberOfTickets * pricePerTicket;
        System.out.println("Total price of 10 tickets: " + totalPrice);

        //TODO 3: Concatenate first name and last name into new variable username with no space in between
        // first and last name and convert them to lower case
        String userName = (firstName + lastName).toLowerCase();
        System.out.println("Username: " + userName);

        // TODO 4: Convert the movie title to upper case and assign to variable movieName
        String movieName = movieTitle.toUpperCase();
        System.out.println("Movie: " + movieName);

        // TODO 5: Write multiple print statements to match your output as per the Final Expected Output
        System.out.println("\nImprimindo Comprovante....... Aguarde !\n");
        System.out.println("RECIBO DE COMPRA");
        System.out.println("Nome: " + userName);
        System.out.println("Sessao: " + movieName);
        System.out.println("Numero de Tickets: " + numberOfTickets);
        System.out.println("Preco do Ticket: $"+ pricePerTicket);
        System.out.printf("Total pago: $%.2f", totalPrice);
        System.out.println("\nAproveite sua sessao!");
    }
}