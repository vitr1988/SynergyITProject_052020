package ru.synergyitacademy.homework.animals.specialized;

import ru.synergyitacademy.homework.animals.Pet;

public class Dog extends Pet {

    private String nickName = "Неизвестный";
    private String sort;

    {
        nickName = "Безымянный";
        Integer amountSort = AMOUNT_SORT;
    }

    public Dog() {
        super("Собака");
    }

    public Dog(String name) {
        this();
        this.nickName = name;
    }

    @Override
    public void voice() {
        System.out.printf("%s издает гав-гав!\n", this.nickName);
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }
}
