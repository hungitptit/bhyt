/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entity.Hospital;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HUNG
 */
public class HospitalDAOTest {
    
    public HospitalDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getListHospital method, of class HospitalDAO.
     */
    @Test
    public void testGetListHospital() {
        System.out.println("getListHospital");
        HospitalDAO instance = new HospitalDAO();
        List<Hospital> expResult = null;
        List<Hospital> result = instance.getListHospital();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchByName method, of class HospitalDAO.
     */
    @Test
    public void testSearchByName() {
        System.out.println("searchByName");
        String name = "";
        HospitalDAO instance = new HospitalDAO();
        List<Hospital> expResult = null;
        List<Hospital> result = instance.searchByName(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
