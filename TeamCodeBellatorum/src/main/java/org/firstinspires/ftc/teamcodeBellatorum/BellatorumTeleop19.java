package org.firstinspires.ftc.teamcodeBellatorum;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name="Bellatorum: Teleop Mecha", group="Bellatorum")

public class BellatorumTeleop19 extends OpMode {


    BellatorumHardware19 robot = new BellatorumHardware19();

    int clPos;
    int crPos;

    @Override
    public void init() {

        robot.init(hardwareMap);

        clPos = (int)robot.clawLeft.getPosition();
        crPos = (int)robot.clawRight.getPosition();
    }

    @Override
    public void loop() {
        double maxSpeed = .65; //Defines what fraction of speed the robot will run at
        double r = Math.hypot(gamepad1.left_stick_x, gamepad1.left_stick_y); //this literally does pythagorean therom. idk why, but it does
        double robotAngle = Math.atan2(-gamepad1.left_stick_y, gamepad1.left_stick_x) - Math.PI / 4; //calculates heading

        if (gamepad2.right_trigger > .1) {
            //down
            robot.armRight.setPower(-.7);
            robot.armLeft.setPower(-.7);
        } else if (gamepad2.left_trigger > .1) {
            robot.armRight.setPower(.3);
            robot.armLeft.setPower(.3);
        }

        if (gamepad2.right_bumper) {
            robot.clawLeft.setPosition(.5);
            robot.clawRight.setPosition(.7);

            telemetry.addData(">", "180");
            telemetry.update();
        } else if (gamepad2.left_bumper){
            robot.clawLeft.setPosition(.80);
            robot.clawRight.setPosition(.20);
            telemetry.addData(">", "0");
            telemetry.update();
        }

        double rightX = gamepad1.right_stick_x;
        final double v1 = (r * Math.sqrt(2) * Math.cos(robotAngle) + rightX );
        final double v2 = (r * Math.sqrt(2) * Math.sin(robotAngle) - rightX );
        final double v3 = (r * Math.sqrt(2) * Math.sin(robotAngle) + rightX );
        final double v4 = (r * Math.sqrt(2) * Math.cos(robotAngle) - rightX );

        robot.frontLeft.setPower(-v1 * maxSpeed);
        robot.frontRight.setPower(-v2 * maxSpeed);
        robot.backLeft.setPower(-v3 * maxSpeed);
        robot.backRight.setPower(-v4 * maxSpeed);

    }
}