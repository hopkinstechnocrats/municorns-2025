package frc.robot.Autos;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import frc.robot.subsystems.DriveSubsystem;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import frc.robot.Commands.DriveCommands;

public class AutoRoutines {
    private final DriveSubsystem driveSubsystem = new DriveSubsystem();
    SendableChooser<Command> autoChooser = new SendableChooser<>(); 

    public Command moveForward(double time) {return DriveCommands.drive(driveSubsystem, 1, 1).withTimeout(1);};
    public Command rotateClockwise90        = DriveCommands.drive(driveSubsystem, 1, -1).withTimeout(.5);
    public Command rotateCounterclockwise90 = DriveCommands.drive(driveSubsystem, -1, 1).withTimeout(.5);
    public Command rotateClockwise45        = DriveCommands.drive(driveSubsystem, .5, -.5).withTimeout(1);
    public Command rotateCounterclockwise45 = DriveCommands.drive(driveSubsystem, -.5, .5).withTimeout(1);

}
