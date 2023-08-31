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

//CREATE TABLE Users (Id SERIAL PRIMARY KEY, Name CHARACTER VARYING(100) NOT NULL, JobTitle CHARACTER VARYING(60) REFERENCES JobTitles (JobTitle) NOT NULL);
// INSERT INTO Users (Name, JobTitle) VALUES ('Бунтин М.А.', 'Главный режиссёр'), ('Щедрин Р.В.', 'Начальник отдела информатизации');
// SELECT * FROM users, jobtitles WHERE users.jobtitle = jobtitles.jobtitle;

//CREATE TABLE EventTypes (Id SERIAL PRIMARY KEY, EventType CHARACTER VARYING(60) NOT NULL);
//INSERT INTO EventTypes (EventType) VALUES ('Концерт'), ('Семинар'), ('Репетиция'), ('Соревнования');

//CREATE TABLE Places (Id SERIAL PRIMARY KEY, Place CHARACTER VARYING(30) NOT NULL, Volume Integer);
//INSERT INTO Places (Place, Volume) VALUES ('Концертны зал МАУ "КСК"', 400), ('Спортзал  МАУ "КСК"', 500), ('Танцевальный зал МАУ "КСК"', 120), ('Фойе МАУ "КСК"', 60), ('Тренажёрный зал МАУ "КСК"', 40);

//CREATE TABLE JobTitles (Id SERIAL PRIMARY KEY, JobTitle CHARACTER VARYING(60) UNIQUE NOT NULL);
//INSERT INTO JobTitles (JobTitle) VALUES ('Звукорежиссёр'), ('Художник по свету'), ('Главный режиссёр'), ('Начальник отдела информатизации'), ('Волонтёр');

//CREATE TABLE UserFunctions (Id SERIAL PRIMARY KEY, UserFunction CHARACTER VARYING(60) NOT NULL,);
// INSERT INTO UserFunctions (UserFunction) VALUES ('Звукорежиссёр'), ('Художник по свету'), ('Фотограф'), ('Оператор видеопроекции'), ('Оператор');

//https://postgrespro.ru/docs/postgresql/9.5/ddl-constraints
}

// SELECT * FROM Events, EventTypes, ...
// WHERE Events.EventType = EventTypes.Id;
