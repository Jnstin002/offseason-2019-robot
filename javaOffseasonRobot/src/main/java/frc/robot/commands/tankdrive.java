/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.RobotMap;

import frc.robot.commands.tankdrive;

public class tankdrive extends Command {
  public tankdrive() {

    requires(Robot.mDrivetrain);

  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {

    Robot.mDrivetrain.setIdleMode(true);

  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {

    double maxSpeed;

    if (Robot.mOI.driverJoystick.getRawButton(RobotMap.boostButton) == true) {
      maxSpeed = 1.0;
    } else {
      maxSpeed = 0.7;
    }

    double rightSpeed = Robot.mOI.driverJoystick.getRawAxis(RobotMap.leftAxis) * maxSpeed;
    double leftSpeed = Robot.mOI.driverJoystick.getRawAxis(RobotMap.rightAxis) * maxSpeed;

    Robot.mDrivetrain.differentialDrive.tankDrive(leftSpeed, rightSpeed, false);

  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
