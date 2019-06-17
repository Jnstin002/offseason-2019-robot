/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

import com.revrobotics.CANError;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

/**
 * Add your docs here.
 */
public class drivetrain extends Subsystem {

  private CANSparkMax leftBackMotor;
  private CANSparkMax leftMidMotor;
  private CANSparkMax leftFrontMotor;

  private CANSparkMax rightBackMotor;
  private CANSparkMax rightMidMotor;
  private CANSparkMax rightFrontMotor;


  public void robotinit() {
    //Initialize Left motors
    leftBackMotor = new CANSparkMax(RobotMap.leftBackSpark, MotorType.kBrushless);
    leftMidMotor = new CANSparkMax(RobotMap.leftMidSpark, MotorType.kBrushless);
    leftFrontMotor = new CANSparkMax(RobotMap.leftFrontSpark, MotorType.kBrushless);
    //Initialize right motors
    rightBackMotor = new CANSparkMax(RobotMap.rightBackSpark, MotorType.kBrushless);
    rightMidMotor = new CANSparkMax(RobotMap.rightMidSpark, MotorType.kBrushless);
    rightFrontMotor = new CANSparkMax(RobotMap.rightFrontSpark, MotorType.kBrushless);

    //Set idleMode
    //Left
    leftBackMotor.setIdleMode(IdleMode.kBrake);
    leftMidMotor.setIdleMode(IdleMode.kBrake);
    leftFrontMotor.setIdleMode(IdleMode.kBrake);
    //Right
    rightBackMotor.setIdleMode(IdleMode.kBrake);
    rightMidMotor.setIdleMode(IdleMode.kBrake);
    rightFrontMotor.setIdleMode(IdleMode.kBrake);

  }

  @Override
  public void initDefaultCommand() {
  
  }
}
