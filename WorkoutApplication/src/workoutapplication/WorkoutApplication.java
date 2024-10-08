/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package workoutapplication;

/**
 *
 * @author Roland
 */
import javax.swing.JOptionPane;
public class WorkoutApplication 
{
    // WorkoutApplication class with main method public class
    public static void main(String[] args) 
    { 
// Prompt user for workout details 
        String exercises = JOptionPane.showInputDialog("Enter the exercises:"); 
        int duration = Integer.parseInt(JOptionPane.showInputDialog("Enter the duration in minutes:")); 
        int intensityLevel = Integer.parseInt(JOptionPane.showInputDialog("Enter the intensity level (1-10):")); 
// Instantiate ProcessWorkout with user inputs 
ProcessWorkout workout = new ProcessWorkout(exercises, duration, intensityLevel); 
// Call printWorkout to display the details 
workout.printWorkout(); 
    }  
    
}
