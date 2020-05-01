package Patient_Doctor_Scheduler;

public class Main {
    public static void main(String[] args){
        Doctor doctor = new Doctor();
        //doctor.printAvailableSlots();
        doctor.addPatient("Alex", new Patient("Alex", 22,"some"),830);
        //doctor.printAvailableSlots();
        doctor.cancellation("Alex",830);
        doctor.printAvailableSlots();
        doctor.printSchedule();
    }
}
