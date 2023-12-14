package frc.robot.subsystems.intake;

import org.littletonrobotics.junction.AutoLog;

public interface IntakeRollerIO {
    @AutoLog
    public static class IntakeRollerIOInputs {
        public double rollerVelocity = 0.0;
        public double appliedVolts = 0.0;

        public double currentAmps = 0.0;
    }

    public default void updateInputs(IntakeRollerIOInputs inputs) {}

    public default void setVelocity(double veloicty) {}

    public default void stop() {}

    public default void configurePID(double kP, double kI, double kD) {}

    public void stopMotor();
}