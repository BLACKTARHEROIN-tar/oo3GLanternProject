package com.example.demo;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.text.Text;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import java.io.IOException;


public class HelloController {
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    Label xResult,jResult, gradenum2Res, gradenum3Res, gradenum4Res, gradenum5Res, gradenum6Res, pResult, jResultLeft,gradenum2ResLeft,gradenum3ResLeft, gradenum4ResLeft,gradenum5ResLeft,gradenum6ResLeft, pResultLeft, yResult1, weightResult;

    ImageView myImageView;

    @FXML
    Text yResult;

    @FXML
    private Label lblstatus;

    @FXML
    private TextField useruser;

    @FXML
    private TextField g1textField, g2textField, q1textField, q2textField, r1textField, r2textField, n1textField, n2textField, o1textField, o2textField;

    @FXML
    private TextField a1textField, a2textField, d1textField, d2textField, f1textField, f2textField, i1textField, i2textField, j1textField, j2textField;

    @FXML
    private TextField l1textField, l2textField;

    @FXML
    private PasswordField passpass;

    @FXML
    TextField x1textField, x2textField, y1textField, y2textField, c1textField, c2textField, k2textField, ptextField;

    private int p;

    double y2, c1, x1, c2, x2, y1, g1, g2, q1, q2, r1, r2, n1, n2, o1, o2, a1, a2, d1, d2, f1, f2, i1, i2, j1, j2, l1, l2, k2;

    public int getPassing() {
        return p;
    }


    public void setPassing(int p) {
        this.p = Integer.parseInt(ptextField.getText());;
    }
    public void onStarter(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("JavaFX: COLLEGE BUDDY");
        stage.setScene(scene);
        stage.show();
    }

    public void Login(ActionEvent event) throws IOException{
        if ((useruser.getText().equals("user") && passpass.getText().equals("pass"))||(useruser.getText().equals("bono") && passpass.getText().equals("123")))  {
            lblstatus.setText("Login Successful");
            Image myImage = new Image(getClass().getResourceAsStream("gradlogo.jpg"));
            root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setTitle("JavaFX: COLLEGE BUDDY");
            stage.setScene(scene);
            stage.show();
        } else {
            lblstatus.setText("Login Failed");
        }

    }

    public void onStartClick(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("matrixcalc.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("JavaFX: GPACALC");
        stage.setScene(scene);
        stage.show();
    }

    public void onStartClick2(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("gradecalc.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("JavaFX: GRADECALC");
        stage.setScene(scene);
        stage.show();
    }

    public void onStartClick3(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("slope.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("JavaFX: AVERAGECALC");
        stage.setScene(scene);
        stage.show();
    }

    public void onReturnToMainMenu(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void onExitApplication(ActionEvent event) throws IOException {
        Platform.exit();
    }

    public void onSolve(ActionEvent event) {
        try {

            x2 = Double.parseDouble(x2textField.getText()); //UNITS NEXT TERM
            y1 = Double.parseDouble(y1textField.getText()); //CURRENT UNITS
            c1 = Double.parseDouble(c1textField.getText()); //CURRENT GPA
            c2 = Double.parseDouble(c2textField.getText()); //TARGET GPA

        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("x2: " + x2);
        System.out.println("y1: " + y1);
        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);
        double computeX = ((c2 * (y1+x2))-(c1*y1))/x2;
        if (computeX > 4.00) {
             computeX = 4.00;
            xResult.setText(String.format("%.2f", computeX));
        }
        else
        xResult.setText(String.format("%.2f", computeX));
    }

    public void onSolve2(ActionEvent event) {
        try {
             g1 = 0;
             g2 = 0;
             q1 = 0;
             q2 = 0;
             r1 = 0;
             r2 = 0;
             n1 = 0;
             n2 = 0;
             o1 = 0;
             o2 = 0;
             a1 = 0;
             a2 = 0;
             d1 = 0;
             d2 = 0;
             f1 = 0;
             f2 = 0;
             i1 = 0;
             i2 = 0;
             j1 = 0;
             j2 = 0;
             l1 = 0;
             l2 = 0;

            if (!g1textField.getText().isEmpty()) {
                g1 = Double.parseDouble(g1textField.getText());
            }
            if (!g2textField.getText().isEmpty()) {
                g2 = Double.parseDouble(g2textField.getText());
            }
            if (!q1textField.getText().isEmpty()) {
                q1 = Double.parseDouble(q1textField.getText());
            }
            if (!q2textField.getText().isEmpty()) {
                q2 = Double.parseDouble(q2textField.getText());
            }
            if (!r1textField.getText().isEmpty()) {
                r1 = Double.parseDouble(r1textField.getText());
            }
            if (!r2textField.getText().isEmpty()) {
                r2 = Double.parseDouble(r2textField.getText());
            }
            if (!n1textField.getText().isEmpty()) {
                n1 = Double.parseDouble(n1textField.getText());
            }
            if (!n2textField.getText().isEmpty()) {
                n2 = Double.parseDouble(n2textField.getText());
            }
            if (!o1textField.getText().isEmpty()) {
                o1 = Double.parseDouble(o1textField.getText());
            }
            if (!o2textField.getText().isEmpty()) {
                o2 = Double.parseDouble(o2textField.getText());
            }
            if (!a1textField.getText().isEmpty()) {
                a1 = Double.parseDouble(a1textField.getText());
            }
            if (!a2textField.getText().isEmpty()) {
                a2 = Double.parseDouble(a2textField.getText());
            }
            if (!d1textField.getText().isEmpty()) {
                d1 = Double.parseDouble(d1textField.getText());
            }
            if (!d2textField.getText().isEmpty()) {
                d2 = Double.parseDouble(d2textField.getText());
            }
            if (!f1textField.getText().isEmpty()) {
                f1 = Double.parseDouble(f1textField.getText());
            }
            if (!f2textField.getText().isEmpty()) {
                f2 = Double.parseDouble(f2textField.getText());
            }
            if (!i1textField.getText().isEmpty()) {
                i1 = Double.parseDouble(i1textField.getText());
            }
            if (!i2textField.getText().isEmpty()) {
                i2 = Double.parseDouble(i2textField.getText());
            }


        } catch (Exception e) {
            System.out.println(e);
        }
        double current = 100*(g1 * (a1 / 100) + g2 * (a2 / 100) + q1 * (d1 / 100) + q2 * (d2 / 100) + r1 * (f1 / 100) + r2 * (f2 / 100) + n1 * (i1 / 100) + n2 * (i2 / 100) + o1 * (j1 / 100) + o2 * (j2 / 100)) / (a1 + a2 + d1 + d2 + f1 + f2 + i1 + i2 + j1 + j2);
        double currentGrade = (l1 - current * (100 - l2)) / l2;
        double totalweight = (a1 + a2 + d1 + d2 + f1 + f2 + i1 + i2 + j1 + j2);
        System.out.println(current);
        System.out.println(currentGrade);
        weightResult.setText(String.format("%.2f", totalweight));
        if (current >= 100 || current <= 0) {
            yResult.setText("Invalid Input");
        } else {
            yResult.setText(String.format("%.2f", current));
        }
    }

    public void onSolve3(ActionEvent event) {
        try {

            p = Integer.parseInt(ptextField.getText()); //UNITS NEXT TERM
            k2 = Double.parseDouble(k2textField.getText()); //CURRENT UNITS

        } catch (Exception e) {
            System.out.println(e);
        }
        if (p >= 50 && p <= 70){
            double k = (100 - p) / 7;
            double j = Math.ceil(100 - k);
            double j5 = j;
            int p5 = p;
            double gradenum2 = Math.ceil(100 - 2 * k);
            double gradenum2two = gradenum2;
            double gradenum3 = Math.ceil(100 - 3 * k);
            double gradenum3two = gradenum3;
            double gradenum4 = Math.ceil(100 - 4 * k);
            double gradenum4two = gradenum4;
            double gradenum5 = Math.ceil(100 - 5 * k);
            double gradenum5two = gradenum5;
            double gradenum6 = Math.ceil(100 - 5 * k);
            double gradenum6two = gradenum6;
            jResult.setText(String.format("%.2f", j));
            jResultLeft.setText(String.format("%.2f", j5));
            gradenum2Res.setText(String.format("%.2f", gradenum2));
            gradenum2ResLeft.setText(String.format("%.2f", gradenum2two));
            gradenum3Res.setText(String.format("%.2f", gradenum3));
            gradenum3ResLeft.setText(String.format("%.2f", gradenum3two));
            gradenum4Res.setText(String.format("%.2f", gradenum4));
            gradenum4ResLeft.setText(String.format("%.2f", gradenum4two));
            gradenum5Res.setText(String.format("%.2f", gradenum5));
            gradenum5ResLeft.setText(String.format("%.2f", gradenum5two));
            gradenum6Res.setText(String.format("%.2f", gradenum6));
            gradenum6ResLeft.setText(String.format("%.2f", gradenum6two));
            pResult.setText(String.format("%.2f", p));
            pResultLeft.setText(String.format("%.2f", p5));
            if (j <= k2) {
                yResult1.setText("4.0");

            } else if (Math.ceil(100 - 2 * k) <= k2 && j >= k2) {
                yResult1.setText("3.5");

            } else if (Math.ceil(100 - 3 * k) <= k2 && Math.ceil(100 - 2 * k)>= k2) {
                yResult1.setText("3.0");

            } else if (Math.ceil(100 - 4 * k) <= k2 && Math.ceil(100 - 3 * k) >= k2) {
                yResult1.setText("2.5");

            } else if (Math.ceil(100 - 5 * k)<= k2 && Math.ceil(100 - 4 * k) >= k2) {
                yResult1.setText("2.0");

            } else if (Math.ceil(100 - 5 * k) <= k2 && Math.ceil(100 - 5 * k) >= k2) {
                yResult1.setText("1.5");

            } else if (p <= k2 && Math.ceil(100 - 5 * k) >= k2) {
                yResult1.setText("1.0");

            } else if (p >= k2) {
                yResult1.setText("0.0");

            }
        } else {
            yResult1.setText("only 50 to 70");
            System.out.println("Passing Score is only allowed from 50-70");
        }
        }

    }





