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
// EventTypeId INTEGER REFERENCES EventTypes (Id),
// Name CHARACTER VARYING(100) NOT NULL,
// PlaceId INTEGER REFERENCES Places (Id) NOT NULL,
// Date TIMESTAMP NOT NULL,
// Lenght INTERVAL NOT NULL,
// GuestNumber Integer,
// MasterId INTEGER REFERENCES Users (Id) NOT NULL,
// PersonList,
// );

//CREATE TABLE Users (Id SERIAL PRIMARY KEY,
// Name CHARACTER VARYING(100) NOT NULL,
// JobTitle INTEGER REFERENCES JobTitles (Id) NOT NULL,
// -- UserFunctions INTEGER REFERENCES UserFunctions (Id),
// );

//CREATE TABLE EventTypes (Id SERIAL PRIMARY KEY,
// EventType CHARACTER VARYING(60) NOT NULL,
// );

//CREATE TABLE Places (Id SERIAL PRIMARY KEY,
// Place CHARACTER VARYING(30) NOT NULL,
// Volume Integer,
// );

//CREATE TABLE JobTitles (Id SERIAL PRIMARY KEY,
// JobTitle CHARACTER VARYING(60) NOT NULL,
// );

//CREATE TABLE UserFunctions (Id SERIAL PRIMARY KEY,
// UserFunction CHARACTER VARYING(60) NOT NULL,
// );

}
