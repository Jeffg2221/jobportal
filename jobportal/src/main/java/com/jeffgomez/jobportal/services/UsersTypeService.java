package com.jeffgomez.jobportal.services;

import com.jeffgomez.jobportal.entity.UsersType;
import com.jeffgomez.jobportal.repository.UsersRepository;
import com.jeffgomez.jobportal.repository.UsersTypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersTypeService {

        private final UsersTypeRepository usersTypeRepository;

        public UsersTypeService(UsersTypeRepository usersTypeRepository){
            this.usersTypeRepository = usersTypeRepository;
        }


        public List<UsersType> getAll(){
            return usersTypeRepository.findAll();
        }

}
