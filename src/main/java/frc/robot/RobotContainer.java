// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.chaos131.auto.AutoBuilder;
import com.chaos131.gamepads.Gamepad;
import com.chaos131.swerve.SwerveConfigs;

import commands.drivetrain.DriverRelativeDrive;
import commands.drivetrain.ResetHeading;
import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import frc.robot.Constants.GamepadConstants;
import frc.robot.Constants.SwerveConstants;
import frc.robot.subsystems.drivetrain.SwerveDrive;
import frc.robot.subsystems.drivetrain.SwerveModule2024;

public class RobotContainer {
  private Gamepad m_driver = new Gamepad(GamepadConstants.DriverPort);
  // private Gamepad m_opeator = new Gamepad(GamepadConstants.OperatorPort);

  private SwerveDrive m_swerveDrive;


  private final AutoBuilder AutoBuilder = new AutoBuilder();

  public RobotContainer() {
    initializeSubsystems();
    configureBindings();
  }

  private void configureBindings() {
    ConfigureDriverControls();
    ConfigureOperatorControls();
  }

  public Command getAutonomousCommand() {
    return Commands.print("No autonomous command configured");
  }

  private void ConfigureDriverControls() {
    m_swerveDrive.setDefaultCommand(new DriverRelativeDrive(m_swerveDrive, m_driver));
    m_driver.a().onTrue(new ResetHeading(m_swerveDrive));
  }

  private void ConfigureOperatorControls() {
  }

  // TO-DO: find the translations by looking at the 2022 robot
  private void initializeSubsystems() {
    SwerveModule2024[] modules = {
      new SwerveModule2024("frontLeft", null, null, SwerveConstants.FrontLeftAbsolute,
                          SwerveConstants.FrontLeftVelocity, SwerveConstants.FrontLeftAngle, false),
      new SwerveModule2024("frontRight", null, null, SwerveConstants.FrontRightAbsolute,
                          SwerveConstants.FrontRightVelocity, SwerveConstants.FrontRightAngle, false),
      new SwerveModule2024("backLeft", null, null, SwerveConstants.BackLeftAbsolute,
                          SwerveConstants.BackLeftVelocity, SwerveConstants.BackLeftAngle, false),
      new SwerveModule2024("backRight", null, null, SwerveConstants.BackRightAbsolute,
                          SwerveConstants.BackRightVelocity, SwerveConstants.BackRightAngle, false)
    };

    // Use default SwerveConigs; default PIDs, no simulation, etc
    // I have no idea if getRotation being null will be a problem. If it will be, we should probably throw a @NonNull on it
    m_swerveDrive = new SwerveDrive(modules, new SwerveConfigs(), null);
  }
}
