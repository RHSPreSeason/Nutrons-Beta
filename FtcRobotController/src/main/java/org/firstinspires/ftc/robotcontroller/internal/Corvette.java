package org.firstinspires.ftc.robotcontroller.internal;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorController;

/**
 * Created by khenr & sytect on 9/21/2016.
 */
 public class Corvette extends OpMode{
    public DcMotorController dc_drive_controller;

    public DcMotor rightMotor;
    public DcMotor leftMotor;
    public DcMotor backMotor;


    @Override
    public void init() {
        rightMotor = hardwareMap.dcMotor.get("rightMotor");
        leftMotor = hardwareMap.dcMotor.get("leftMotor");
        backMotor = hardwareMap.dcMotor.get("backMotor");
    }

    @Override
    public void loop() {
        double throttle = gamepad1.left_stick_y;
        double direction = gamepad1.right_stick_x;

        double right = Math.sin(150)*direction - Math.cos(150)*throttle;
        double left = Math.sin(30)*direction + Math.cos(30)*throttle;
        double back = Math.sin(270)*direction;

        rightMotor.setPower(3*right);
        leftMotor.setPower(3*left);
        backMotor.setPower(3*back);
    }

    @Override
    public void stop() {

    }


}
