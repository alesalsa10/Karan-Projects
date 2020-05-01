package Patient_Doctor_Scheduler;

import java.util.*;


public class Doctor {
    //doctor can handle at most 16 patients per day
    private Map<String, List<Patient>> schedule = new HashMap<>();
    private List<Integer> times = new ArrayList<>(Arrays.asList(830,900,930,1000,1030,1100,1130,1200,1230,100,130,200,230,300,330,400));

    public void printAvailableSlots(){
        for (int i: times){
            System.out.println(i);
        }
    }

    public void addPatient(String name, Patient patient, int time){
        if (times.isEmpty()){
            System.out.println("The schedule is full");
        }
        else if (!schedule.containsKey(name)){
            schedule.put(name, new ArrayList<>());
            schedule.get(name).add(patient);
            times.remove(Integer.valueOf(time));
        } else{
            System.out.println("You already have an appointment at " + time);
        }
    }

    public void cancellation(String patient, int time){
        for (String name: schedule.keySet()){
            if (name.equals(patient)){
                schedule.get(name).remove(schedule.get(patient));
                times.add(time);
            }
        }
    }

    public void printSchedule(){
        for (List<Patient> l: schedule.values()){
            for (Patient p: l){
                System.out.println(p);
            }
        }
    }
}
