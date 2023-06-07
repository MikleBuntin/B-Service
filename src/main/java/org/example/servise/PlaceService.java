package org.example.servise;

import org.example.repo.PlaceRepo;

import java.util.Scanner;

public class PlaceService {
    private static PlaceRepo placeRepo = new PlaceRepo();
    private static void ViewAll() {}

    public void viewAll() {

    }

    public void viewSheduleForPlace() { //Запрашивает ID места им отправляет его в placeRepo для вывода
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ID места");
        Integer id = Integer.parseInt(scanner.nextLine());
        placeRepo.viewShedule(id);
    }

    public void add() { // Запрашивает данные, создаёт новый ID и записывает место в файл

    }
}