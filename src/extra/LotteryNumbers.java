package extra;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {
public static void main(String[] args) {
Random gen = new Random();
int number1 = gen.nextInt(100);
int number2 = gen.nextInt(100);
int number3 = gen.nextInt(100);
int number4 = gen.nextInt(100);
int number5 = gen.nextInt(100);
JOptionPane.showMessageDialog(null,number1 + " " + number2 + " " + number3 + " " + number4 + " " + number5 );
}
}
