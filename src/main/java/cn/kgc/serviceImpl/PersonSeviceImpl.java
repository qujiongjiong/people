package cn.kgc.serviceImpl;

import cn.kgc.entity.Person;
import cn.kgc.mapper.PersonMapper;
import cn.kgc.service.PersonSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class PersonSeviceImpl implements PersonSevice {

    @Autowired
    PersonMapper personMapper;
    @Override
    public int add(Person person) {
        return personMapper.add(person);
    }

    @Override
    public int del(Integer id) {
        return personMapper.del(id);
    }

    @Override
    public int updata(Person person) {
        return personMapper.updata(person);
    }

    @Override
    public Person getPersonById(Integer id) {
        return personMapper.getPersonById(id);
    }

    @Override
    public List<Person> getAll() {
        return personMapper.getAll();
    }
}
