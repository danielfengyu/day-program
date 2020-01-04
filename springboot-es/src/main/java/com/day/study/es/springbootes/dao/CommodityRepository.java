package com.day.study.es.springbootes.dao;

import com.day.study.es.springbootes.entity.Commodity;
import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * @author fengyu
 */
@Repository
public interface CommodityRepository extends ElasticsearchRepository<Commodity,String> {
}
