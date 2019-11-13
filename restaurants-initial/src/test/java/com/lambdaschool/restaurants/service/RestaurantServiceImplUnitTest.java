package com.lambdaschool.restaurants.service;

import com.lambdaschool.restaurants.RestaurantsApplication;
import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityNotFoundException;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestaurantsApplication.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RestaurantServiceImplUnitTest {

    @Autowired
    private RestaurantService restaurantService;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void findRestaurantByNameLike() {
    }

    @Test
    public void findNameCity() {
    }

    @Test
    public void findAll() {
        assertEquals(3, restaurantService.findAll().size());
    }

    @Test
    public void findRestaurantById() {
        assertEquals("Apple Test", restaurantService.findRestaurantById(10).getName());
    }

    @Test
    public void findRestaurantByName() {
    }

    @Test (expected = EntityNotFoundException.class)
    public void deleteNotFound() {
        restaurantService.delete(1000);
        assertEquals(3, restaurantService.findAll().size());
    }

    @Test
    public void deletefound() {
        restaurantService.delete(10);
        assertEquals(2, restaurantService.findAll().size());
    }

    @Test
    public void save() {
    }

    @Test
    public void update() {
    }
}