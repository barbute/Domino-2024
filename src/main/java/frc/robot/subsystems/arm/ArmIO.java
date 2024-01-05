
package frc.robot.subsystems.arm;

public interface ArmIO {

    public static class ArmIOInputs {
        public static double positionRADS = 0.0;
    }

    /** Sets the voltage of the arm */
    public default void setVolts(double volts) {}
}
