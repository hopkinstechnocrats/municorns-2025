package frc.robot.Autos;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import frc.robot.subsystems.DriveSubsystem;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.Commands.DriveCommands;
//import frc.robot.Commands.ArmCommands;
//import frc.robot.subsystems.ArmSubsystem;
//import frc.robot.subsystems.IntakeSubsystem;
//import frc.robot.Commands.IntakeCommands


public class AutoRoutines {
    private final DriveSubsystem driveSubsystem = new DriveSubsystem();
    SendableChooser<Command> autoChooser        = new SendableChooser<>(); 

    public Command moveForward(double driveTime) {return DriveCommands.drive(driveSubsystem, 1, 1).withTimeout(driveTime);};
    public Command Rotate (double rightSpeed, double leftSpeed) {return DriveCommands.drive(driveSubsystem, rightSpeed, leftSpeed).withTimeout(1);};//Make sure to Callibrate!!!!
    //public Command armMovement(double armSpeed, double armTime) {return ArmCommands.moveArm(armSubsystem, armSpeed).withTimeout(armTime);};//Make sure to Calibrate!!!
    //public Command intakeOutake(double intakeSpeed, double intakeTime) {return IntakeCommands.intake(intakeSubsystem, intakeSpeed).withTimeout(intakeTime);};//Make sure to Calibrate!!!


    public Command drive_to_melter = new SequentialCommandGroup(moveForward(1), Rotate(.1, -.1));
    public Command do_nothing      = new SequentialCommandGroup(Commands.waitSeconds(15));
    //public Command raise_arm       = new SequentialCommandGroup(armMovement(.1, 1));
    //public Command lower_arm       = new SequentialCommandGroup(armMovement(-.1, 1));
    //public Command outake          = new SequentialCommandGroup(intakeOutake(.1, 1));
    //public Command score           = new SequentialCommandGroup(raise_arm, outake);
    //public Command intake          = new SequentialCommandGroup(lower_arm, armMovement(-.1, 1));

    public Command selectAuto(){
        autoChooser.setDefaultOption("Do Nothing", do_nothing);
        autoChooser.addOption("Drive to Melter", drive_to_melter);
        //autoChooser.addOption("Score", score);
        //autoChooser.addOption("Intake", intake);
        return autoChooser.getSelected();

    }
}
