package org.example;

import java.time.DateTimeException;

// событие
public class Event {
    private DateTimeException datetime; // Дата и время начала события
    private Long length; //длительность события
    private Place place; // место проведения
    private int guests; // количество посетителей
    private int master; // ответственное лицо
    private PersonList personList; //список задействованных сотрудников

}
