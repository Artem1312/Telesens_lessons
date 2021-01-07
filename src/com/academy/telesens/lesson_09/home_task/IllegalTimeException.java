package com.academy.telesens.lesson_09.home_task;

public class IllegalTimeException {
    /*
    2)
	a) Создать класс IllegalTimeException, который является
		наследником класса RuntimeException.

	b) Модифицировать класс CustomDateTime, добавив в конструктор
		выбрасывания исключения IllegalTimeException при
		попытки создать некорректную (не существующее время)

	c)  протестировать работу конструктора на позитивных кейсах:
		- new CustomDateTime(..., 12, 12, 12,);
		- new CustomDateTime(..., 23, 1, 1);
		- new CustomDateTime(..., 0, 0, 0);
		- new CustomDateTime(..., 23, 59, 59);


		протестировать работу конструктора на негативных кейсах, т.е.
			ожидаем выбрасывания исключения:

		- new CustomDateTime(..., -12, 12, 12); 	// отрицательный минуты не суще-ет
		- new CustomDateTime(..., 23, 1, 60); 		// большое значение для секунды
		- new CustomDateTime(..., 24, 0, 0); 		// большое значение для часа
		- new CustomDateTime(..., 23, 60, 0); 		// большое значение для минуты
     */
}
