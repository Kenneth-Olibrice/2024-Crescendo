package frc.robot.subsystems.drivetrain;

import java.util.function.Supplier;

import com.chaos131.swerve.BaseSwerveDrive;
import com.chaos131.swerve.BaseSwerveModule;
import com.chaos131.swerve.SwerveConfigs;

import edu.wpi.first.math.geometry.Rotation2d;

public class SwerveDrive extends BaseSwerveDrive {

    public SwerveDrive(BaseSwerveModule[] swerveModules, SwerveConfigs swerveConfigs,
            Supplier<Rotation2d> getRotation) {
        super(swerveModules, swerveConfigs, getRotation);
        //TODO Auto-generated constructor stub
    }
    
}
