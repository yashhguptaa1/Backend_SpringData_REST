//Vid 2.3 : JPA repository

package com.yg.SpringDataRest.linkedin;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ContactRepository extends CrudRepository<Contact, Long> {

}
