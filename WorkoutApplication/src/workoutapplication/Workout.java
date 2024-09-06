/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package workoutapplication;

/**
 *
 * @author Roland
 */
import javax.swing.JOptionPane; 
abstract class Workout 
{
     // Fields private 
    String exercises; private int duration; 
// duration in minutes private int intensityLevel; 
// Constructor 
    public Workout(String exercises, int duration, int intensityLevel) 
    { 
        this.exercises = exercises; 
        this.duration = duration; 
        this.intensityLevel = intensityLevel; 
    } 
// Get methods 
    public String getExercises() 
    { 
        return exercises; 
    } 
    public int getDuration() 
    { 
        return duration; 
    } 
    public int getIntensityLevel() 
    { 
        int intensityLevel;
        return intensityLevel; 
    } 
} 
// Interface IWorkout 
interface IWorkout 
{ 
    void printWorkout(); 
} 
// ProcessWorkout 
class implementing IWorkout 
class ProcessWorkout extends Workout implements IWorkout 
{ 
// Constructor 
    public ProcessWorkout(String exercises, int duration, int intensityLevel) 
    { 
        super(exercises, duration, intensityLevel); 
    } 
// Method to print workout details 
    @Override 
    public void printWorkout() 
    { 
        String workoutDetails = "Exercises: " + getExercises() + "\n" + "Duration: " + getDuration() + " minutes\n" + "Intensity Level: " + getIntensityLevel(); 
        JOptionPane.showMessageDialog(null, workoutDetails, "Workout Details", JOptionPane.INFORMATION_MESSAGE); } 
    
}
