package newClasses.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.soap.SOAPException;

public class Testing {
		
		public static void main(String[] args) {
			
			try {
				expectedBehaviourTest();

				unExpectedBookingBehaviour();
				unExpectedCheckInBehaviour();
				unExpectedCheckOutBehaviour();
				unexpectedRoomHandlerBehavour();
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		public static void expectedBehaviourTest() throws ParseException {
			System.out.println("Running Test Suites... \n\n\n");
			System.out.println("   ---------- Initiating test with expected behaviour ----------   \n");
			try {
				System.out.println("Creating customer... \n");// Creates a customer
				CustomerImpl customer = CustomerImpl.class.newInstance();
				
				customer.setFirstName("User");
				customer.setLastName("Usersson");
				customer.setPersonalNum(8304061234L);
				customer.setAddress("Lindholmen");
				customer.setZipCode(40278);
				customer.setCity("Gothenburg");
				customer.setCountry("Sweden");
				customer.setPhoneNum(0701234567L);
				customer.setEmail("user.usersson@mail.com");

				System.out.println("First name: " + customer.firstName);
				System.out.println("Last name: " + customer.lastName);
				System.out.println("Personal Number: " + customer.personalNum);
				System.out.println("Address: " + customer.address);
				System.out.println("Zip Code: " + customer.zipCode);
				System.out.println("City: " + customer.city);
				System.out.println("Country: " + customer.country);
				//System.out.println("Phone number: " + customer.phoneNum);
				System.out.println("Email: " + customer.email);
				
				InformationValidatorImpl validator = InformationValidatorImpl.class.newInstance();
				System.out.println("\nValidating customer information... \n");
				validator.validateNames(customer.firstName, customer.lastName);
				validator.validatePersonalNum(customer.personalNum);
				validator.validateAddress(customer.address, customer.zipCode, customer.city, customer.country);
				validator.validatePhoneNum(customer.phoneNum);
				validator.validateEmail(customer.email);
				
				System.out.println("\nCreating a credit card for the customer... \n");
				CreditCardImpl card = CreditCardImpl.class.newInstance();
				
				card.setCreditCardNumber("17012345");
				card.setCvc("123");
				card.setMonth(12);
				card.setYear(15);
				card.setFirstName(customer.firstName);
				card.setLastName(customer.lastName);

				System.out.println("Credit Card Number: " + card.creditCardNumber);
				System.out.println("CVC: " + card.cvc);
				System.out.println("Expiry month: " + card.month);
				System.out.println("Expiry year: " + card.year);
				
				try {
					System.out.println("\nAccessing Bank Administrator... \n");
					se.chalmers.cse.mdsd1415.banking.administratorRequires.AdministratorRequires bankingAdmin = se.chalmers.cse.mdsd1415.banking.administratorRequires.AdministratorRequires
							.instance();
					if (bankingAdmin.addCreditCard(card.creditCardNumber, card.cvc,card.month,
							card.year, card.firstName, card.lastName)) {
						System.out.println("Successfully added credit card.\n");
					} else {
						System.out.println("Error while adding credit card.\n");
					}
					double resultBalance = bankingAdmin.getBalance(card.creditCardNumber, card.cvc,card.month,
							card.year, card.firstName, card.lastName);
					if (resultBalance != -1.0) {
						System.out.println("Balance: " + resultBalance);
					} else {
						System.out.println("Error while checking Balance.");
					}
					resultBalance = bankingAdmin.makeDeposit(card.creditCardNumber, card.cvc,card.month,
							card.year, card.firstName, card.lastName, 11111.2);
					if (resultBalance != -1.0) {
						System.out.println("\nSuccessfully made a deposit: "
								+ resultBalance);
					} else {
						System.out.println("\nError while making deposit.");
					}

				} catch (SOAPException e) {
					System.err
							.println("\nError occurred while communicating with the bank administration");
					e.printStackTrace();
				}
				
				SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
				Date today = sdf.parse(sdf.format(new Date()));
				
				String checkIn = sdf.format(today);
				String checkOut = "25-01-2015";

				System.out.println("\nCustomer attempts to create a booking... \n");
				System.out.println("\nInput values: \n");
				System.out.println("Room Type: Regular");
				System.out.println("Check-In date: " + checkIn);
				System.out.println("Check-Out date: " + checkOut);
				
				customer.setBookingNum(customer.createBooking("Regular", "Breakfast", checkIn, checkOut));
				
				try {
					GuestImpl guest = GuestImpl.class.newInstance();
					
					//this.cost = calculateCost(checkInDate, checkOutDate, roomType, services);
					
					guest.setFirstName(customer.firstName);
					guest.setLastName(customer.lastName);
					guest.setPersonalNum(customer.personalNum);
					guest.setAddress(customer.address);
					guest.setZipCode(customer.zipCode);
					guest.setCity(customer.city);
					guest.setCountry(customer.country);
					guest.setPhoneNum(customer.phoneNum);
					guest.setEmail(customer.email);
					guest.setBookingNum(customer.bookingNum);
					
					System.out.println("\nCustomer attempts to check in... \n");
					
					
					guest.setCost(customer.bookingCost);
					guest.setAddedServices("");
					guest.setExtraDays(0);
					
					if(customer.bookingNum >= 1000 && customer.bookingNum < 10000) {
						guest.setCheckInDate(checkIn);
						guest.setCheckOutDate(checkOut);
						guest.setRoomNum(guest.checkIn(customer.bookingNum, guest.checkInDate));
					
					if (guest.roomNum > 0) {
						guest.checkedIn = true;
						System.out.println("\nConverting customer to guest... \n");
						System.out.println(guest.firstName + " " + guest.lastName + " successfully checked in to room " + guest.roomNum);
						System.out.println("\n");
					}
					else {
						guest.checkedIn = false;
						System.out.println("ERROR: Check-in failed");
					}}
					
					else {
						System.out.println("ERROR: There can be no check-in without a booking");
					
					}
					System.out.println("\nCustomer attempts to check out... \n");
					guest.setCheckedOut(guest.checkOut(guest.checkOutDate, guest.roomNum, card.creditCardNumber, card.cvc, card.month, card.year, card.firstName, card.lastName, guest.cost));
					
					if (guest.checkedOut == true) {
						System.out.println(guest.firstName + " " + guest.lastName + " successfully checked out of room " + guest.roomNum);
						System.out.println("\n");
					}
					else {
						System.out.println("ERROR: Check-out failed");
					}
					
					} catch (InstantiationException e) {
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						e.printStackTrace();
					}			
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
			System.out.println("\n   ---------- Expected behaviour ends ----------   \n");
		}
		
		public static void unExpectedBookingBehaviour() {
			
			System.out.println("\n   ---------- Initiating test with unexpected behaviour for booking ----------   \n");
			try {
				// Creates a customer
				CustomerImpl customer2 = CustomerImpl.class.newInstance();
				
				customer2.setFirstName("User");
				customer2.setLastName("123");
				customer2.setPersonalNum(9904061234L);
				customer2.setAddress("Lindholmen");
				customer2.setZipCode(902107);
				customer2.setCity("Gothenburg123");
				customer2.setCountry("Sweden");
				customer2.setPhoneNum(0701234567114L);
				customer2.setEmail("jesusnavasmailcom");
				
				InformationValidatorImpl validator = InformationValidatorImpl.class.newInstance();
				System.out.println("Validating customer information...");
				System.out.println("\nTest case 1: ");
				System.out.println("Unit to test: Booking");
				System.out.println("Description: Inputing names with illegal characters");
				System.out.println("Expected result: Names return as invalid");
				System.out.println("Actual result: ");
				validator.validateNames(customer2.firstName, customer2.lastName);
				System.out.println("\nTest case 2: ");
				System.out.println("Unit to test: Booking");
				System.out.println("Description: Inputing personal number for a person under 18");
				System.out.println("Expected result: Age restricted to 18");
				System.out.println("Actual result: ");
				validator.validatePersonalNum(customer2.personalNum);
				System.out.println("\nTest case 3: ");
				System.out.println("Unit to test: Booking");
				System.out.println("Description: Inputing illegal characters for address and zip code");
				System.out.println("Expected result: Address invalid");
				System.out.println("Actual result: ");
				validator.validateAddress(customer2.address, customer2.zipCode, customer2.city, customer2.country);
				System.out.println("\nTest case 4: ");
				System.out.println("Unit to test: Booking");
				System.out.println("Description: Inputing phone number of wrong length");
				System.out.println("Expected result: Invalid number");
				System.out.println("Actual result: ");
				validator.validatePhoneNum(customer2.phoneNum);
				System.out.println("\nTest case 5: ");
				System.out.println("Unit to test: Booking");
				System.out.println("Description: Inputing email with incorrect prefix/suffix and missing @");
				System.out.println("Expected result: Invalid email");
				System.out.println("Actual result: ");
				validator.validateEmail(customer2.email);
				
				String checkIn = "20-01-2015";
				String checkOut = "15-01-2015";
				
				System.out.println("\nTest case 6:  ");
				System.out.println("Unit to test: Booking");
				System.out.println("Description: Trying to book with a check-in date later than the check-out date");
				System.out.println("Expected result: Booking not created");
				System.out.println("Actual result: ");
				customer2.setBookingNum(customer2.createBooking("Regular", "Breakfast", checkIn, checkOut));
				
				System.out.println("\nTest case 7: ");
				System.out.println("Unit to test: Booking");
				System.out.println("Description: Trying to cancel booking with a wrong conformation number.");
				System.out.println("Expected result: The confirmation number does not exist in the database");
				System.out.println("Actual result: ");
				BookingImpl Impl = new BookingImpl();
				Impl.cancelBooking(124);
				
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
			System.out.println("\n   ---------- Unexpected booking behaviour ends ----------   \n");
			
		}
		
		public static void unExpectedCheckInBehaviour() throws ParseException {
			System.out.println("\n   ---------- Initiating test with unexpected behaviour for check-in ----------   \n");
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			Date today = sdf.parse(sdf.format(new Date()));
			String checkIn = sdf.format(today);
			String checkOut = "25-01-2015";
			try {
				GuestImpl guest2 = GuestImpl.class.newInstance();
				
				guest2.setFirstName("User");
				guest2.setLastName("Usersson");
				guest2.setBookingNum(0);
				guest2.setAddedServices("");
				guest2.setExtraDays(0);
					
				System.out.println("Test case 8: ");	
				System.out.println("Unit to test: Check-In");
				System.out.println("Description: Trying to check-in without a booking number");
				System.out.println("Expected result: Check-In not allowed");
				System.out.println("Actual result: ");	
				if(guest2.bookingNum >= 1000 && guest2.bookingNum < 10000) {
					guest2.setCheckInDate(checkIn);
					guest2.setCheckOutDate(checkOut);
					guest2.setRoomNum(guest2.checkIn(guest2.bookingNum, guest2.checkInDate));
				
				if (guest2.roomNum > 0) {
					guest2.checkedIn = true;
					System.out.println(guest2.firstName + " " + guest2.lastName + " successfully checked in to room " + guest2.roomNum);
					System.out.println("\n");
				}
				else {
					guest2.checkedIn = false;
					System.out.println("ERROR: Check-in failed");
				}}
				
				else {
					System.out.println("ERROR: There can be no check-in without a booking");
				
				}
				
				System.out.println("\nTest case 9: ");
				System.out.println("Unit to test: Check-In");
				System.out.println("Description: Trying to check-in on a date that has already passed");
				System.out.println("Expected result: Check-In invalid");
				System.out.println("Actual result: ");
				guest2.setBookingNum(1500);
				checkIn = "01-01-2015";
				if(guest2.bookingNum >= 1000 && guest2.bookingNum < 10000) {
					guest2.setCheckInDate(checkIn);
					guest2.setCheckOutDate(checkOut);
					guest2.setRoomNum(guest2.checkIn(guest2.bookingNum, guest2.checkInDate));
				
				if (guest2.roomNum > 0) {
					guest2.checkedIn = true;
					System.out.println(guest2.firstName + " " + guest2.lastName + " successfully checked in to room " + guest2.roomNum);
					System.out.println("\n");
				}
				else {
					guest2.checkedIn = false;
					System.out.println("ERROR: Check-in failed");
				}}
				
				else {
					System.out.println("ERROR: There can be no check-in without a booking");
				
				}
				
				System.out.println("\nTest case 10: ");
				System.out.println("Unit to test: Check-In");
				System.out.println("Description: Trying to check-in on a future date");
				System.out.println("Expected result: Check-In invalid");
				System.out.println("Actual result: ");
				guest2.setBookingNum(1500);
				checkIn = "01-01-2016";
				if(guest2.bookingNum >= 1000 && guest2.bookingNum < 2000) {
					guest2.setCheckInDate(checkIn);
					guest2.setCheckOutDate(checkOut);
					guest2.setRoomNum(guest2.checkIn(guest2.bookingNum, guest2.checkInDate));
				
				if (guest2.roomNum > 0) {
					guest2.checkedIn = true;
					System.out.println(guest2.firstName + " " + guest2.lastName + " successfully checked in to room " + guest2.roomNum);
					System.out.println("\n");
				}
				else {
					guest2.checkedIn = false;
					System.out.println("ERROR: Check-in failed");
				}}
				
				else {
					System.out.println("ERROR: There can be no check-in without a booking");
				
				}
				
				
				} catch (InstantiationException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				}
			System.out.println("\n   ---------- Unexpected check-in behaviour ends ----------   \n");
		}
		
		public static void unExpectedCheckOutBehaviour() throws ParseException {
			System.out.println("\n   ---------- Initiating test with unexpected behaviour for check-out ----------   \n");
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			Date today = sdf.parse(sdf.format(new Date()));
			String checkIn = sdf.format(today);
			String checkOut = "25-01-2015";
			try {
				GuestImpl guest3 = GuestImpl.class.newInstance();
				
				guest3.setFirstName("User");
				guest3.setLastName("Usersson");
				guest3.setBookingNum(0);
				guest3.setAddedServices("");
				guest3.setExtraDays(0);
			
			CreditCardImpl card2 = CreditCardImpl.class.newInstance();
			card2.setCreditCardNumber("17012345");
			card2.setCvc("123");
			card2.setMonth(12);
			card2.setYear(15);
			card2.setFirstName(guest3.firstName);
			card2.setLastName(guest3.lastName);	
			
			System.out.println("Test case 11: ");
			System.out.println("Unit to test: Check-Out");
			System.out
					.println("Description: Trying to check-out without having checked in");
			System.out.println("Expected result: Check-In out not allowed");
			System.out.println("Actual result: ");
			guest3.setCheckedOut(guest3.checkOut(guest3.checkOutDate, guest3.roomNum, card2.creditCardNumber, card2.cvc, card2.month, card2.year, card2.firstName, card2.lastName));
			
			if (guest3.checkedOut == true) {
				System.out.println(guest3.firstName + " " + guest3.lastName + " successfully checked out of room " + guest3.roomNum);
				System.out.println("\n");
			}
			else {
				System.out.println("ERROR: Check-out failed");
			}
//			guest3.checkedIn = true;
//			System.out.println("\nTest case 11: ...");
//			guest3.setCheckedOut(guest3.checkOut(guest3.checkOutDate, guest3.roomNum, card2.creditCardNumber, card2.cvc, card2.month, card2.year, card2.firstName, card2.lastName));
//			
//			if (guest3.checkedOut == true) {
//				System.out.println(guest3.firstName + " " + guest3.lastName + " successfully checked out of room " + guest3.roomNum);
//			}
//			else {
//				System.out.println("Check-out failed");
//			}
			}catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
			System.out.println("\n   ---------- Unexpected check-out behaviour ends ----------   \n");
		}
		
		public static void unexpectedRoomHandlerBehavour() {
			System.out.println("\n   ---------- Initiating unexpected behaviour for Room Handler ----------   \n");

			try {

				RoomHandlerImpl room = RoomHandlerImpl.class.newInstance();	
				System.out.println("Test case 12: ");
				System.out.println("Unit to test: Room Handler");
				System.out.println("Description: Change room price for non-existing room");
				System.out.println("Expected result: Can not change price");
				System.out.println("Actual result: ");
				room.changeRoomPrice(150, 150);
				System.out.println();
				
				System.out.println("Test case 13: ");
				System.out.println("Unit to test: Room Handler");
				System.out.println("Description: Remove non existing room");
				System.out.println("Expected result: can not remove room");
				System.out.println("Actual result: ");
				room.removeRoom(2000);
				System.out.println();

				System.out.println("Test case 14: ");
				System.out.println("Unit to test: Room Handler");
				System.out.println("Description: sending wrong dates");
				System.out.println("Expected result: refuse wrong dates");
				System.out.println("Actual result: ");
				room.checkAvalibility("regular", "03-01-2015", "12-02-2015");

				
				System.out.println("Test case 15: ");
				System.out.println("Unit to test: Room Handler");
				System.out.println("Description: sending wrong room type");
				System.out.println("Expected result: refuse wrong room types");
				System.out.println("Actual result: ");
				room.checkAvalibility("NonExisting", "03-01-2015", "12-02-2015");
				
				System.out.println("\n   ---------- Unexpected Room Handler behaviour ends ----------   \n");
			} catch (Exception ex) {
				System.out.println("Error in test cases");
			}
		}		
	}

	


