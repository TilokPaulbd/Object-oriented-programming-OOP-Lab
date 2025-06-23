public class StudentIdCard {
    int cardNumber;
    Student owner;

    StudentIdCard(int cardNumber,Student owner){
        this.cardNumber=cardNumber;
        this.owner=owner;
    }
    void displayCardinfo(){
        System.out.println("CArd Number :"+cardNumber);
        System.out.println("Owner Name :"+owner.name);
        System.out.println("Owner Student ID :"+owner.studentid);
    }
}
