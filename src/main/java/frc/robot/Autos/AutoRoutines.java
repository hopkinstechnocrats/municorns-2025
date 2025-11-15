package frc.robot.Autos;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import frc.robot.subsystems.DriveSubsystem;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.Commands.DriveCommands;

public class AutoRoutines {
    private final DriveSubsystem driveSubsystem = new DriveSubsystem();
    SendableChooser<Command> autoChooser        = new SendableChooser<>(); 

    public Command moveForward(double time) {return DriveCommands.drive(driveSubsystem, 1, 1).withTimeout(1);};
    public Command rotateClockwise90        = DriveCommands.drive(driveSubsystem, 1, -1).withTimeout(.5);
    public Command rotateCounterclockwise90 = DriveCommands.drive(driveSubsystem, -1, 1).withTimeout(.5);
    public Command rotateClockwise45        = DriveCommands.drive(driveSubsystem, .5, -.5).withTimeout(1);
    public Command rotateCounterclockwise45 = DriveCommands.drive(driveSubsystem, -.5, .5).withTimeout(1);

    public Command drive_to_melter = new SequentialCommandGroup(DriveCommands.drive(driveSubsystem, 1, 1).withTimeout(1), DriveCommands.drive(driveSubsystem, -1, 1).withTimeout(1));
    public Command do_nothing      = new SequentialCommandGroup(Commands.waitSeconds(15));

    public Command selectAuto(){
        autoChooser.setDefaultOption("Do Nothing", do_nothing);
        return autoChooser.getSelected();
    }
}
