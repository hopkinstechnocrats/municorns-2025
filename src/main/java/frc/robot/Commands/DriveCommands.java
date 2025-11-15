package frc.robot.Commands;
import frc.robot.subsystems.DriveSubsystem;
import frc.robot.Constants;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;

public class DriveCommands extends Command {
    public static Command drive(DriveSubsystem m_driveSubsystem, double left, double right) {
        return Commands.run(
            () -> { 
                m_driveSubsystem.drive(Constants.maxMotorOutput*left, Constants.maxMotorOutput*right);
            }, m_driveSubsystem);
    }
}
