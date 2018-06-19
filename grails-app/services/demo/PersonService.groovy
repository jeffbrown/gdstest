package demo

import grails.gorm.services.Service

@Service(Person)
interface PersonService {
    List<Person> list()
}
