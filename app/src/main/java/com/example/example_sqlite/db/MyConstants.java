package com.example.example_sqlite.db;

public class MyConstants {
    public static final String TABLE_NAME = "my_table"; // название таблицы с двумя колонами
    public static final String _ID = "_id"; // идентификатор каждого элемента который добавляется в базу данных
    public static final String TITLE = "title"; // первая колона - заголовок
    public static final String DISC = "disc"; // вторая колона - описание
    public static final String DB_NAME = "my_db.db"; // название базы данных - атрибуты файла записи таблицы
    public static final int DB_VERSION = 1; // версия
    public static final String TABLE_STRUCTURE = "CREATE TABLE " +
            TABLE_NAME + " (" + _ID + " INTEGER PRIMARY KEY," + TITLE + " TEXT," +
            DISC + " TEXT)"; // строка для структуры таблицы
    public static final String DROP_TABLE = "DROP TABLE IF EXISTS " + TABLE_NAME; // строка для удаления таблицы
}
