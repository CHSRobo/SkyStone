package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import static org.firstinspires.ftc.teamcode.HardwareByrd.UNARM;
import static org.firstinspires.ftc.teamcode.HardwareByrd.UNPUSH;
import static org.firstinspires.ftc.teamcode.HardwareByrd.UNGRAB;
import static org.firstinspires.ftc.teamcode.HardwareByrd.ARM;
import static org.firstinspires.ftc.teamcode.HardwareByrd.PUSH;
import static org.firstinspires.ftc.teamcode.HardwareByrd.GRAB;


@Autonomous(name="SecondAuto")

public class SecondAuto extends AutoByrd {
    @Override
    public void runOpMode() {
        autonomousInit();
        waitForStart();
        autonomousStart();
        if (!isStopRequested()) {
            /* lift(LIFT_DOWN);*/
            //hook(UNHOOK);
            sleep(20000);
            moveForward(500,.5);
            sleep(1000);
            moveLeft(300,.5);
            sleep(1000);
            stopMoving();
        }
    }
}