package com.academy.telesens.lesson_06.component;

public class Demo {
    public static void main(String[] args) {

        /*
        1)
	a) Создать массив типа Component (10 элементов), элементы которого могут любые потомки этого класса
		(Button, Label, CheckBox, RoundButton - см. иерархию в презентации)
		Component[] components = ...


	b) Наполнить массив:
		(экземплярами классов Button, Label, CheckBox, RoundButton)

	с) В цикле вывести все элемены Componentы на экран
	d) В цикле перебрать массив Component и вывести только Button и его потомков


Для реализации иерархии классов Component:
	- во всех классах потомках от Component - нужно переопределить метод draw();
	- реализация метода draw() во всех классах, в т.ч. и в Component - вывод на консоль название класса, напр:
		public class Component {
			public void draw() {
				System.out.println("Component");
			}
		}

		public class Button {

			@Override
			public void draw() {
				System.out.println("Button");
			}
		}
         */
        Component button = new Button();
        Component label = new Label();
        Button roundButton = new RoundButton();
        Button checkBox = new CheckBox();

        Component[] arr = {button, label, roundButton, checkBox};

        for(int i =0; i< arr.length; i++){
            arr[i].draw();
        }


    }
}
