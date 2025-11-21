package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class ArmSubsystem extends SubsystemBase{
    WPI_TalonSRX armMotor;
    public ArmSubsystem(){
        armMotor = new WPI_TalonSRX(10); //TODO: get CANID
        armMotor.configFactoryDefault();
        armMotor.setNeutralMode(NeutralMode.Brake);
    }

    public void moveArm(double armSpeed){
        armMotor.set(armSpeed);
    
    }
   
    //TODO:is motor spin =0 the same as brake
    public void armBrake(){
        armMotor.stopMotor();
    }
}
