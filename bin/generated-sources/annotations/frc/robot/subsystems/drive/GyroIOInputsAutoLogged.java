package frc.robot.subsystems.drive;

import org.littletonrobotics.junction.LogTable;
import org.littletonrobotics.junction.inputs.LoggableInputs;

public class GyroIOInputsAutoLogged extends GyroIO.GyroIOInputs
    implements LoggableInputs, Cloneable {
  @Override
  public void toLog(LogTable table) {
    table.put("Connected", connected);
    table.put("YawPosition", yawPosition);
    table.put("OdometryYawPositions", odometryYawPositions);
    table.put("YawVelocityRadPerSec", yawVelocityRadPerSec);
  }

  @Override
  public void fromLog(LogTable table) {
    connected = table.get("Connected", connected);
    yawPosition = table.get("YawPosition", yawPosition);
    odometryYawPositions = table.get("OdometryYawPositions", odometryYawPositions);
    yawVelocityRadPerSec = table.get("YawVelocityRadPerSec", yawVelocityRadPerSec);
  }

  public GyroIOInputsAutoLogged clone() {
    GyroIOInputsAutoLogged copy = new GyroIOInputsAutoLogged();
    copy.connected = this.connected;
    copy.yawPosition = this.yawPosition;
    copy.odometryYawPositions = this.odometryYawPositions.clone();
    copy.yawVelocityRadPerSec = this.yawVelocityRadPerSec;
    return copy;
  }
}
