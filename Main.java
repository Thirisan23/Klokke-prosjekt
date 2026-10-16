//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {


    ClockDisplay clock1 = new ClockDisplay();
    System.out.println(clock1.getTime());

    ClockDisplay clock2 = new ClockDisplay(8, 46, 58);


    clock1.setTime(0, 0, 0);

    for (int i = 0; i < 50000; i++) {
        clock1.timeTick();
        System.out.println(clock1.getTime());
    }


}
