package frc.robot.subsystems;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj2.command.RunCommand;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.subsystems.DriveSubsystem;
import edu.wpi.first.wpilibj2.command.Command;
// This subsystem allows the grabber to grab

public class ButterIntakeSubsystem {
    private final Talon intakeMotor = new Talon(0),  
    pullyMotor = new Talon(0);// update the channel pretty pleeassse!! :)
    
    public void runButterIntake(boolean intake){
        //intake dictates whether or not the 
        
    }

    public void runButterPully(boolean isBeingRaised){

    }
}
