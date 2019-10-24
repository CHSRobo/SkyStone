package org.firstinspires.ftc.teamcodeBellatorum;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous
public class BellatorumFuntonomous19 extends LinearOpMode {
    BellatorumHardware19 robot = new BellatorumHardware19();

    void AutonomousInit(){
        robot.init(hardwareMap);
    }

    void strafeLeft(double speed){
        robot.backLeft.setPower(speed);
        robot.backRight.setPower(speed);
        robot.frontLeft.setPower(speed);
        robot.frontRight.setPower(speed);
    }

    void strafeRight(double speed){
        robot.backLeft.setPower(speed);
        robot.backRight.setPower(speed);
        robot.frontLeft.setPower(speed);
        robot.frontRight.setPower(speed);
    }

    void moveFoward(double speed){
        robot.backLeft.setPower(speed);
        robot.backRight.setPower(speed);
        robot.frontLeft.setPower(speed);
        robot.frontRight.setPower(speed);
    }

    void moveBackward(double speed){
        robot.backLeft.setPower(speed);
        robot.backRight.setPower(speed);
        robot.frontLeft.setPower(speed);
        robot.frontRight.setPower(speed);
    }

    void turnLeft(double speed){
        robot.backLeft.setPower(-speed);
        robot.backRight.setPower(speed);
        robot.frontLeft.setPower(-speed);
        robot.frontRight.setPower(speed);
    }

    void turnRight(double speed){
        robot.backLeft.setPower(speed);
        robot.backRight.setPower(-speed);
        robot.frontLeft.setPower(speed);
        robot.frontRight.setPower(-speed);
    }

    @Override
    public void runOpMode() throws InterruptedException {

    }
}
