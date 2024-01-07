package frc.robot.subsystems.drivetrain;

import com.chaos131.pid.PIDFValue;
import com.chaos131.swerve.BaseSwerveModule;
import com.ctre.phoenix6.hardware.CANcoder;
import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardTab;

public class SwerveModule2024 extends BaseSwerveModule{
    private CANcoder m_absoluteEncoder;
    private TalonFX m_velocity;
    private TalonFX m_angle;
    
    public SwerveModule2024(String name, Translation2d translation, Rotation2d xModeAngle) {
        super(name, translation, xModeAngle);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void UpdateAnglePIDConstants(PIDFValue arg0) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'UpdateAnglePIDConstants'");
    }

    @Override
    public void UpdateVelocityPIDConstants(PIDFValue arg0) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'UpdateVelocityPIDConstants'");
    }

    @Override
    public void addCoachTabDashboardValues(ShuffleboardTab arg0) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addCoachTabDashboardValues'");
    }

    @Override
    public void driveToPositionInit() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'driveToPositionInit'");
    }

    @Override
    public void driverModeInit() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'driverModeInit'");
    }

    @Override
    protected Rotation2d getAbsoluteAngle() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAbsoluteAngle'");
    }

    @Override
    protected Rotation2d getEncoderAngle() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getEncoderAngle'");
    }

    @Override
    protected double getEncoderDistance_m() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getEncoderDistance_m'");
    }

    @Override
    protected double getEncoderVelocity_mps() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getEncoderVelocity_mps'");
    }

    @Override
    protected void recalibrateWithFilteredAbsoluteAngle(Rotation2d arg0) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'recalibrateWithFilteredAbsoluteAngle'");
    }

    @Override
    protected void setTargetAngle(Rotation2d arg0) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setTargetAngle'");
    }

    @Override
    protected void setTargetVelocity_mps(double arg0) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setTargetVelocity_mps'");
    }

    @Override
    protected void stopAngleMotor() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'stopAngleMotor'");
    }

    @Override
    protected void stopVelocityMotor() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'stopVelocityMotor'");
    }

    @Override
    protected void updateDashboard() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateDashboard'");
    }
    
}
