package cn.kgc.service;

import cn.kgc.entity.Person;

import java.util.List;

public interface PersonSevice {
    public int add(Person person);
    public int del(Integer id);
    public int updata(Person person);
    public Person getPersonById(Integer id);
    public List<Person> getAll();
}
