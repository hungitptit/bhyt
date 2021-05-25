/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entity.Bill;
import entity.Person;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HUNG
 */
public class PersonDAOTest {
    PersonDAO ps = new PersonDAO();
    public PersonDAOTest() {
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
     * Test of getListPerson method, of class PersonDAO.
     */
    @Test
    public void testGetListPerson() {
        System.out.println("getListPerson");
        PersonDAO instance = new PersonDAO();
        List<Person> expResult = null;
        List<Person> result = instance.getListPerson();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchByName method, of class PersonDAO.
     */
    @Test
    public void testSearchByName() {
        System.out.println("searchByName");
        String name = "";
        PersonDAO instance = new PersonDAO();
        List<Person> expResult = null;
        List<Person> result = instance.searchByName(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchPerson method, of class PersonDAO.
     */
   //Nhập số vào ô tìm kiếm
	@Test
	public void testSearchPersonException1() {
		String key = "1";
		ArrayList<Person> listP = ps.searchPerson(key);
		Assert.assertNotNull(listP);
		Assert.assertEquals(0, listP.size());
	}
	//Nhập kí tự đặc biệt vào ô tìm kiếm
	@Test
	public void testSearchPersonException2() {
		String key = "*";
		ArrayList<Person> listP = ps.searchPerson(key);
		Assert.assertNotNull(listP);
		Assert.assertEquals(0, listP.size());
	}
	//Không nhập gì vào ô tìm kiếm
	@Test
	public void testSearchPersonException3() {
		String key = "";
		ArrayList<Person> listP = ps.searchPerson(key);
		Assert.assertNull(listP);
	}
	
	//Nhập đúng không dấu
	@Test
	public void testSearchPerson1(){
		String key = "h";
		ArrayList<Person> listP = ps.searchPerson(key);
		Assert.assertNotNull(listP);
		Assert.assertEquals(3, listP.size());
		for(int i=0; i<listP.size(); i++){
		Assert.assertTrue(listP.get(i).getName().toLowerCase().contains(key.toLowerCase()));
		}
	}
	//Nhập đúng nhưng chưa có dữ liệu
	@Test
	public void testSearchPerson2() {
		String key = "b";
		ArrayList<Person> listP = ps.searchPerson(key);
		Assert.assertNotNull(listP);
		Assert.assertEquals(0, listP.size());
	}
	//Nhập đúng có dấu
	@Test
	public void testSearchPerson3() {
		String key = "Hùng";
		ArrayList<Person> listP = ps.searchPerson(key);
		Assert.assertNotNull(listP);
		Assert.assertEquals(1, listP.size());	
	}


	@Test
	public void testGetBill1() {
		int id = 4;
		ArrayList<Bill> listB = ps.getBill(id);
		Assert.assertNotNull(listB);
		Assert.assertEquals(1, listB.size());	
	}
	
	@Test
	public void testGetBill2() {
		int id = 6;
		ArrayList<Bill> listB = ps.getBill(id);
		Assert.assertNotNull(listB);
		Assert.assertEquals(2, listB.size());	
	}

    /**
     * Test of getBill method, of class PersonDAO.
     */
    @Test
    public void testGetBill() {
        System.out.println("getBill");
        int id = 0;
        PersonDAO instance = new PersonDAO();
        ArrayList<Bill> expResult = null;
        ArrayList<Bill> result = instance.getBill(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
