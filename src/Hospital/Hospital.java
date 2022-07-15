package Hospital;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hospital {
    public void Something() throws InterruptedException {
        Payment py = new Payment();
        int abc;
        Doctors doctor01 = new Doctors(100, "Sam Helson", 123456789, "Pediatrician", "São Luís", 150.5F);
        Doctors doctor02 = new Doctors(200, "Sam 2", 123456789, "gynecologist", "São Paulo", 200);
        Doctors doctor03 = new Doctors(300, "Sam Helson 03", 100000000, "Pediatrician", "São Luís", 175.8F);
        Doctors doctor04 = new Doctors(400, "Sam Helson 04", 199999999, "Pediatrician", "São Luís", 190);


        Doctors doctor05 = new Doctors(500, "Sam 5", 123444789, "Dentist", "São Paulo", 100);
        Doctors doctor06 = new Doctors(600, "Sam 6", 665586789, "Dentist", "São Paulo", 120);

        Doctors doctor07 = new Doctors(700, "Sam 7", 562154879, "Urologist", "São Luís", 250);
        Doctors doctor08 = new Doctors(800, "Sam 8", 123456789, "Urologist", "São Paulo", 275.50F);
        List<Doctors> doctorsList = new ArrayList<>();
        doctorsList.add(doctor01);
        doctorsList.add(doctor02);
        doctorsList.add(doctor03);
        doctorsList.add(doctor04);
        doctorsList.add(doctor05);
        doctorsList.add(doctor06);
        doctorsList.add(doctor07);
        doctorsList.add(doctor08);

        System.out.println("""
                Select the specialization: 
                (1) Pediatrician
                (2) Gynecologist
                (3) Urologist
                (4) Dentist
                                
                Tap "0" to cancel...
                """);
        Scanner sp = new Scanner(System.in);
        abc = sp.nextInt();

        System.out.println("### Available Doctors ###");
        switch (abc) {
            case 1 -> {
                System.out.println("### Pediatricians ###");
                doctorsList.forEach(doctors -> {if (doctors.getSpecialization() == "Pediatrician") {
                System.out.println(doctors);}});

                if (doctorsList.get(0).equals(true)) {
                    System.out.println("Querry with doctor " + doctorsList.get(0));
                    float st1;
                    System.out.println("""
                            Especial Payment Form:                             
                            """);
                    st1 = doctor01.getPriceQuerry();


                }
                if (doctorsList.get(3).equals(true)) {

                }
            }
            case 2 -> {
                System.out.println("### Gynecologists ###");
                doctorsList.forEach(doctors ->
                {
                    if (doctors.getSpecialization() == "Gynecologists") {
                        System.out.println(doctors);
                    }
                });

            }
            case 3 -> {
                System.out.println("### Urologists ###");
                doctorsList.forEach(doctors ->
                {
                    if (doctors.getSpecialization() == "Urologists") {
                        System.out.println(doctors);
                    }
                });

                System.out.println(doctorsList.get(7));
                System.out.println(doctorsList.get(6));
            }
            case 4 -> {
                System.out.println("### Dentists ###");
                doctorsList.forEach(doctors ->
                {
                    if (doctors.getSpecialization() == "Dentists") {
                        System.out.println(doctors);
                    }
                });

                System.out.println(doctorsList.get(5));
                System.out.println(doctorsList.get(4));
            }
            default -> {
                System.out.println("Invalid Option...");
            }
        }
        if (abc == 0) {
            return;
        }
    }
}
