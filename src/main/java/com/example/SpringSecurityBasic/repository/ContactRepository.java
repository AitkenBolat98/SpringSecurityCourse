package com.example.SpringSecurityBasic.repository;

import com.example.SpringSecurityBasic.module.Contact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends CrudRepository<Contact, Long> {


}
