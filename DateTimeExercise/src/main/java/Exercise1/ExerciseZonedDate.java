/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise1;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 *
 * @author User
 */
public class ExerciseZonedDate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        LocalDate date = LocalDate.of(2021,3,2);
        LocalTime time = LocalTime.of(12,0);
        ZoneId Romeo = ZoneId.of("Europe/London");
        
        ZonedDateTime meeting = ZonedDateTime.of(date,time,Romeo);
        
        System.out.println("meeting in 2022: " + meeting);
    }
    
}
