// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;


import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.RunCommand;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.Commands.IntakeCommands;
import frc.robot.Commands.ArmCommands;
import frc.robot.subsystems.ArmSubsystem;
import frc.robot.subsystems.DriveSubsystem;
import frc.robot.subsystems.IntakeSubsystem;
import edu.wpi.first.wpilibj2.command.Command;


/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final DriveSubsystem driveSubsystem = new DriveSubsystem();

  private final CommandXboxController driveController = new CommandXboxController(Constants.driverXboxControllerPort);
  
  private final CommandXboxController operatorController = new CommandXboxController(Constants.operatorXboxControllerPort);

  private final IntakeSubsystem intakeSubsystem = new IntakeSubsystem();
  
  private final ArmSubsystem armSubsystem = new ArmSubsystem();


  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();
    driveSubsystem.setDefaultCommand(
            new RunCommand(
                    () -> {
                      driveSubsystem.drive(Constants.maxMotorOutput*driveController.getLeftY(),
                      Constants.maxMotorOutput*driveController.getRightY());
                    }
            , driveSubsystem)
    );
    intakeSubsystem.setDefaultCommand(
            new RunCommand(
                    () -> {
                    intakeSubsystem.intake(0);
                  }, intakeSubsystem)
    );
    
  
  }

  private void configureButtonBindings() {
    operatorController.x().whileTrue(IntakeCommands.intake(intakeSubsystem));
    operatorController.y().whileTrue(IntakeCommands.eject(intakeSubsystem));
    // hold/move
    operatorController.a().whileTrue(ArmCommands.armUp(armSubsystem));
    operatorController.b().whileTrue(ArmCommands.armDown(armSubsystem));
    operatorController.a().whileFalse(ArmCommands.armBrake(armSubsystem));   //TODO: conflicting a=true b=false
    operatorController.b().whileFalse(ArmCommands.armBrake(armSubsystem));

    // push/gotopos
    //operatorController.a().whileTrue(ArmCommands.armUp(armSubsystem).withTimeout(1));
    //operatorController.b().whileTrue(ArmCommands.armDown(armSubsystem).withTimeout(1));
  }
   
  

  public DriveSubsystem getDriveSubsystem() {
    return driveSubsystem;
  }
  
  
  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return new SequentialCommandGroup(
      //put commands here
    );
  }
}