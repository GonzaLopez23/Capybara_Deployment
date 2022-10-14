package com.example.capybara.config;

import org.hibernate.envers.RevisionListener;

import com.example.capybara.entities.audit.Revision;

public class CustomRevisionListener implements RevisionListener {

    public void newRevision(Object revisionEntity){
        final Revision revision = (Revision) revisionEntity;
    }
}