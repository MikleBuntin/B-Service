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

//CREATE TABLE Events (Id SERIAL PRIMARY KEY,
// EventTypeId INTEGER REFERENCES EventType (Id),
// Name CHARACTER VARYING(100),
// PlaceId INTEGER REFERENCES Places (Id),
// Date TIMESTAMP,
// Lenght INTERVAL,
// GuestNumber (Integer),
// MasterId INTEGER REFERENCES Users (Id),
// PersonList,
// );


}
