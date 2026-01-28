//1) WITHOUT Synchronization
// Race Condition HAPPENS
/*
package ashwini.cm;

class TicketBooking {
    int seats = 1;

    void bookSeat(String user) {
        if (seats > 0) {
            System.out.println(user + " is trying to book...");
            seats--;   // critical section (not protected)
            System.out.println(user + " booked the seat.");
        } else {
            System.out.println(user + " failed. No seats left.");
        }
    }
}

class User extends Thread {
    TicketBooking booking;
    String user;

    User(TicketBooking booking, String user) {
        this.booking = booking;
        this.user = user;
    }

    public void run() {
        booking.bookSeat(user);
    }
}
 
public class TicketBookingSystemusecase10 {                    //Main class
    public static void main(String[] args) {

        TicketBooking booking = new TicketBooking();

        User u1 = new User(booking, "User1");
        User u2 = new User(booking, "User2");

        u1.start();
        u2.start();
    }
}
*/
/*
 output: 
user1 is trying to book...
User1 booked the seat.
User2 is trying to book...
User2 booked the seat.

(Both threads may book the same seat  ,Overbooking occurs  ,This is a Race Condition)
*/

// 2) WITH Synchronization
//Race Condition FIXED



package ashwini.cm;

class TicketBookingSync {
    int seats = 1;

    synchronized void bookSeat(String user) {
        if (seats > 0) {
            System.out.println(user + " is trying to book...");
            seats--;   // critical section (protected)
            System.out.println(user + " booked the seat.");
        } else {
            System.out.println(user + " failed. No seats left.");
        }
    }
}

class UserSync extends Thread {
    TicketBookingSync booking;
    String user;

    UserSync(TicketBookingSync booking, String user) {
        this.booking = booking;
        this.user = user;
    }

    public void run() {
        booking.bookSeat(user);
    }
}

public class TicketBookingSystemusecase10{
    public static void main(String[] args) {

        TicketBookingSync booking = new TicketBookingSync();

        UserSync u1 = new UserSync(booking, "User1");
        UserSync u2 = new UserSync(booking, "User2");

        u1.start();
        u2.start();
    }
}



/*
 output:
User2 is trying to book...
User2 booked the seat.
User1 failed. No seats left.



Only one thread enters booking at a time ,Seat is booked once ,No race condition 
*/
