package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import static org.firstinspires.ftc.teamcode.HardwareByrd.UNARM;
import static org.firstinspires.ftc.teamcode.HardwareByrd.UNPUSH;
import static org.firstinspires.ftc.teamcode.HardwareByrd.UNGRAB;
import static org.firstinspires.ftc.teamcode.HardwareByrd.ARM;
import static org.firstinspires.ftc.teamcode.HardwareByrd.PUSH;
import static org.firstinspires.ftc.teamcode.HardwareByrd.GRAB;


@Autonomous(name="UltimateGoalAutonomous")

public class UltimateGoalAutonomous extends AutoByrd {
    @Override
    public void runOpMode() {
        autonomousInit();
        waitForStart();
        autonomousStart();
        if (!isStopRequested()) {
            /* lift(LIFT_DOWN);*/
            //hook(UNHOOK);
            //*this is where all of your commands and functions go in order*/

            sleep(1000);
            moveForward(0500,.5);
            stopMoving();
        }
    }
}