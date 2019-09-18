package com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class DistilleryRepositoryImpl implements DistilleryRepositoryCustom {


    @Autowired
    EntityManager entityManager;

//    @Transactional
//    public List<Distillery> findWhiskiesFromDistilleryByWhiskyAge(int age) {
//        List<Distillery> result = null;
//        Session session = entityManager.unwrap(Session.class);
//
//        Criteria cr = session.createCriteria(Distillery.class);
//        cr.createAlias("distillery.whiskies", "distillery.whiskiesAlias");
//        cr.add(Restrictions.eq("distillery.whiskiesAlias.age", age));
//        result = cr.list();
//
//        return result;
//    }

}
