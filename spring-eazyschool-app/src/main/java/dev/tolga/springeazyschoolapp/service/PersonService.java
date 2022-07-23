package dev.tolga.springeazyschoolapp.service;


import dev.tolga.springeazyschoolapp.constants.EazySchoolConstants;
import dev.tolga.springeazyschoolapp.model.Person;
import dev.tolga.springeazyschoolapp.model.Roles;
import dev.tolga.springeazyschoolapp.repository.PersonRepository;
import dev.tolga.springeazyschoolapp.repository.RolesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private RolesRepository rolesRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public boolean createNewPerson(Person person){
        boolean isSaved = false;
        Roles role = rolesRepository.getByRoleName(EazySchoolConstants.STUDENT_ROLE);
        person.setRoles(role);
        person.setPwd(passwordEncoder.encode(person.getPwd()));
        person = personRepository.save(person);
        if (null != person && person.getPersonId() > 0)
        {
            isSaved = true;
        }
        return isSaved;
    }
}
