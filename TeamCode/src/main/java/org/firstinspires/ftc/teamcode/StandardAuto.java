package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import static org.firstinspires.ftc.teamcode.HardwareByrd.LIFT_DOWN;
import static org.firstinspires.ftc.teamcode.HardwareByrd.UNHOOK;


@Autonomous(name="StandardAuto")

public class StandardAuto extends AutoByrd {
    @Override
    public void runOpMode() {
        autonomousInit();
        waitForStart();
        autonomousStart();
        if (!isStopRequested()) {
           /* lift(LIFT_DOWN);*/
            hook(UNHOOK);
            sleep(1000);
            moveForward(6000,.5);
            stopMoving();
        }
    }
}
