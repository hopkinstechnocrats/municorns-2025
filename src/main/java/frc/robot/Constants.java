// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    // The CAN ID is the device ID of each of the motors
    public static final int rightLeaderCANID = 6;
    public static final int rightFollowerCANID = 5;
    public static final int leftLeaderCANID = 7;
    public static final int leftFollowerCANID = 8;
    //The controller ports can be changed in driverstation
    public static final int driverXboxControllerPort = 0;
    public static final int operatorXboxControllerPort = 1;

    /* 
    Sets the maximum power we can drive at. 1.0 is 100%. 
    The number is negative because xbox controllers are down-right positve
    */
    public static final double maxMotorOutput = -0.55;
}
