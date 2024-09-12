package com.example.array;
import java.util.Scanner;

public class AirplaneSeating {
	  private char[][] seats;

	    // Constructor to initialize the seating arrangement
	    public AirplaneSeating(int rows, int columns) {
	        seats = new char[rows][columns];
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                seats[i][j] = 'A'; // 'A' stands for Available
	            }
	        }
	    }

	    // Method to book a seat
	    public boolean bookSeat(int row, int column) {
	        if (seats[row][column] == 'A') {
	            seats[row][column] = 'O'; // 'O' stands for Occupied
	            return true;
	        } else {
	            return false;
	        }
	    }

	    // Method to cancel a booking
	    public boolean cancelBooking(int row, int column) {
	        if (seats[row][column] == 'O') {
	            seats[row][column] = 'A'; // Mark the seat as Available
	            return true;
	        } else {
	            return false;
	        }
	    }

	    // Method to check seat availability
	    public boolean isSeatAvailable(int row, int column) {
	        return seats[row][column] == 'A';
	    }

	    // Method to display the current seating chart
	    public void displaySeatingChart() {
	        System.out.println("Seating Chart:");
	        for (int i = 0; i < seats.length; i++) {
	            for (int j = 0; j < seats[i].length; j++) {
	                System.out.print(seats[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }

	    // Main method to test the functionality
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter number of rows: ");
	        int rows = scanner.nextInt();
	        System.out.print("Enter number of columns: ");
	        int columns = scanner.nextInt();

	        AirplaneSeating airplaneSeating = new AirplaneSeating(rows, columns);

	        while (true) {
	            System.out.println("\n1. Book a seat");
	            System.out.println("2. Cancel a booking");
	            System.out.println("3. Check seat availability");
	            System.out.println("4. Display seating chart");
	            System.out.println("5. Exit");
	            System.out.print("Choose an option: ");
	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter row to book: ");
	                    int bookRow = scanner.nextInt();
	                    System.out.print("Enter column to book: ");
	                    int bookColumn = scanner.nextInt();
	                    if (airplaneSeating.bookSeat(bookRow, bookColumn)) {
	                        System.out.println("Seat booked successfully.");
	                    } else {
	                        System.out.println("Seat is already occupied.");
	                    }
	                    break;
	                case 2:
	                    System.out.print("Enter row to cancel: ");
	                    int cancelRow = scanner.nextInt();
	                    System.out.print("Enter column to cancel: ");
	                    int cancelColumn = scanner.nextInt();
	                    if (airplaneSeating.cancelBooking(cancelRow, cancelColumn)) {
	                        System.out.println("Booking cancelled successfully.");
	                    } else {
	                        System.out.println("Seat is not occupied.");
	                    }
	                    break;
	                case 3:
	                    System.out.print("Enter row to check: ");
	                    int checkRow = scanner.nextInt();
	                    System.out.print("Enter column to check: ");
	                    int checkColumn = scanner.nextInt();
	                    if (airplaneSeating.isSeatAvailable(checkRow, checkColumn)) {
	                        System.out.println("Seat is available.");
	                    } else {
	                        System.out.println("Seat is occupied.");
	                    }
	                    break;
	                case 4:
	                    airplaneSeating.displaySeatingChart();
	                    break;
	                case 5:
	                    System.out.println("Exiting...");
	                    scanner.close();
	                    return;
	                default:
	                    System.out.println("Invalid option. Please try again.");
	            }
	        }
	    }

}
