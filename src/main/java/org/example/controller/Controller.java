package org.example.controller;

import org.example.servise.EventService;
import org.example.servise.PersonService;
import org.example.servise.PlaceService;

public class Controller {
    private static PersonService personService = new PersonService();
    private static EventService eventService = new EventService;
    private static PlaceService placeService = new PlaceService();

    public static void viewPlaceList() {placeService.viewAll();}
    public static void viewSheduleForPlace() {placeService.viewSheduleForPlace();}

    public static void addPlace() {placeService.add();}

}
