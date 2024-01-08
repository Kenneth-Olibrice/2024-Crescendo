package frc.robot.subsystems.drivetrain;

import com.chaos131.pid.PIDFValue;
import com.chaos131.swerve.BaseSwerveModule;
import com.ctre.phoenix6.hardware.CANcoder;
import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardTab;
import frc.robot.Constants.SwerveConstants;

public class SwerveModule2024 extends BaseSwerveModule{
    private CANcoder m_absoluteEncoder;
    private TalonFX m_velocity;
    private TalonFX m_angle;
    
    public SwerveModule2024(String name, Translation2d translation, Rotation2d xModeAngle, int absoluteEncoderID, int velocityID, int angleID) {
        super(name, translation, xModeAngle);

        m_absoluteEncoder = new CANcoder(absoluteEncoderID);
        m_velocity = new TalonFX(velocityID);
        m_angle = new TalonFX(angleID);
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
        return Rotation2d.fromDegrees(m_absoluteEncoder.getAbsolutePosition().getValue()); // TO-DO: calculate absolute encoder ticks to degrees and call Rotation2d.fromDegrees() here
    }

    @Override
    protected Rotation2d getEncoderAngle() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getEncoderAngle'");
    }

    @Override
    protected double getEncoderDistance_m() {
        double totalRotations = m_velocity.getPosition().getValue() / (SwerveConstants.TalonCountsPerRevolution * SwerveConstants.SwerveModuleVelocityGearRatio);
        double totalDistanceMeters = totalRotations * (SwerveConstants.DriveWheelCircumferenceMeters);
        return totalDistanceMeters;
    }

    @Override
    protected double getEncoderVelocity_mps() {
        double ticksPerMeter = SwerveConstants.TalonCountsPerRevolution / SwerveConstants.DriveWheelCircumferenceMeters;
        double metersPerSecond = m_velocity.getVelocity().getValue() / ticksPerMeter;
        return metersPerSecond;
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
