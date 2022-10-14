package com.example.capybara.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.capybara.entities.Base;
import com.example.capybara.repositories.BaseRepository;

import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public abstract class BaseServiceImpl<E extends Base, ID extends Serializable> implements BaseService<E, ID> {

    protected BaseRepository<E, ID> baseRepository;

    public BaseServiceImpl(BaseRepository<E,ID> baseRepository) {

        this.baseRepository = baseRepository;

    }

    @Override
    @Transactional
    public List<E> findAll() throws Exception {

        try {

            List<E> entities = baseRepository.findAll();
            return entities;

        } catch(Exception e) {

            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public E findById(ID id) throws Exception {

        try {

            Optional<E> entitieOpcional = baseRepository.findById(id);
            return entitieOpcional.get();

        } catch(Exception e) {

            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Page<E> findAll(Pageable pageable) throws Exception{

        try {

            Page<E> entities = baseRepository.findAll(pageable);
            return entities;

        } catch(Exception e) {

            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public E save(E entity) throws Exception {

        try {

            entity = baseRepository.save(entity);
            return entity;

        } catch(Exception e) {

            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public E update(ID id, E entity) throws Exception {

        try {

            Optional<E> entitieOpcional = baseRepository.findById(id);
            E entityUpdate = entitieOpcional.get();
            entityUpdate = baseRepository.save(entity);
            return entityUpdate;

        } catch(Exception e) {

            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean delete(ID id) throws Exception {

        try {

            if (baseRepository.existsById(id)) {

                baseRepository.deleteById(id);
                return true;

            } else {

                throw new Exception();

            }

        } catch(Exception e) {

                throw new Exception(e.getMessage());
            }
        }
    }