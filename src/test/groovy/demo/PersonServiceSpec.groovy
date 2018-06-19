package demo

import grails.testing.gorm.DataTest
import spock.lang.Specification

/**
 * Using DataTest instead of DomainUnitTest to address a question...
 */
class PersonServiceSpec extends Specification implements DataTest {

    void setupSpec() {
        mockDomain Person
    }

    void "test list"() {
        given:
        PersonService personService = dataStore.getService(PersonService)
        
        expect:
        personService.list().size() == 0
    }
}
