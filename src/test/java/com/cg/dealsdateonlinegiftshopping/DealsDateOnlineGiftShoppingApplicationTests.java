package com.cg.dealsdateonlinegiftshopping;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.cg.dealsdateonlinegiftshopping.dao.UserDaoImplementation;
import com.cg.dealsdateonlinegiftshopping.entity.User;
import com.cg.dealsdateonlinegiftshopping.entity.User.login;
import com.cg.dealsdateonlinegiftshopping.entity.User.type;
import com.cg.dealsdateonlinegiftshopping.service.UserService;


@SpringBootTest
class DealsDateOnlineGiftShoppingApplicationTests {


	@Autowired
	private UserService service;

	@MockBean
	private UserDaoImplementation repository;

	@BeforeEach
	public void init() {

	}
	
	/*
	 * To test displayListOfProducts() method
	 */

	@Test
	 void getAllUsersTest() {

		when(repository.getUserAndAdminDetails())
				.thenReturn(Stream.of(getUserEntity(), getUserEntity()).collect(Collectors.toList()));

		assertEquals(2, service.getAllUsers().size());
	}
	
	public User getUserEntity() {
		User entity = new User();
		entity.setUserId(1);
		entity.setFirstname("kapil");
		entity.setLastname("chaudhary");
		entity.setPassword("kapil");
		entity.setConfirmPassword("kapil");
		entity.setEmail("kapil@gmail.com");
		entity.setPhoneNumber("7557396021");
		entity.setUserType(type.admin);
		entity.setLoginStatus(login.LoggedIn);
		return entity;
	}
	
	
//	@Test
//	 void testOfNotNull() {
//
//         User source = getUserEntity();
//		User result = service.of(source);
//		assertEquals(source.getProductId(), result.getProductId());
//	}
	
	
	/*
	 * To test setUserId() ,setter to set value of userId
	 */
	
	@Test
	void testSetUsertId() {
		int userId=1000;
		User entityUser=new User();
		entityUser.setUserId(userId);
		assertEquals(entityUser.getUserId(),userId);
	}

	/*
	 * To test getUserId() ,getter to get value of userId
	 */
	
	@Test
	void testGetUserId() {
		
		User entityUser=new User();
		entityUser.setUserId(1000);
		int userId=1000;
		int result=entityUser.getUserId();
		assertEquals(userId,result);
	}
	

	/*
	 * To test setUserName() ,setter to set value of User first Name
	 */
	
	@Test
	void testSetFirstName() {
		String name="Chocolate";
		User entityUser=new User();
		entityUser.setFirstname(name);
		assertEquals(entityUser.getFirstname(),name);
	}


	/*
	 * To test getUserName() ,getter to get value of user first Name
	 */
	
	@Test
	void testGeFirstName() {
		
		User entityUser=new User();
		entityUser.setFirstname("Chocolate");
		String name="Chocolate";
		String result=entityUser.getFirstname();
		assertEquals(name,result);
	}
	
	
	/*
	 * To test setUserName() ,setter to set value of User last Name
	 */
	
	@Test
	void testSetLastName() {
		String name="Kumar";
		User entityUser=new User();
		entityUser.setFirstname(name);
		assertEquals(entityUser.getFirstname(),name);
	}


	/*
	 * To test getUserName() ,getter to get value of user last Name
	 */
	
	@Test
	void testLastName() {
		
		User entityUser=new User();
		entityUser.setFirstname("Kumar");
		String name="Kumar";
		String result=entityUser.getFirstname();
		assertEquals(name,result);
	}
	
	
	
//	@Test
//	public void addCustomerPass() throws UserException
//	{
//		User user=new User("krajout952@gmail.com", "Kiraniu", "Rajputs", "Kiran@123", "Kiran@123",	"8922564378");
//		assertThat(userServiceInterface.signUp(user)).isNotNull();
//	}
	
//	@Test
//	public void addCustomerFail()
//	{
//		User user=new User("krajout97@gmail.com", "Kiran", "Rajput", "Kiran@123", "Kiran@123",	"8922564378");
//		assertThrows(UserException.class, () -> {
//			userServiceInterface.signUp(user);
//		});
//	}



//	@Test
//	public void updateCustomerPass() throws UserException
//	{
//		User user=new User(	6,"shruti@gmail.com", "shruti", "diwedi", "Shruti@123","Shruti@123", "8547896587");
//		assertThat(userServiceInterface.updateUser( user,6)).isNotNull();
//
//	}
	
//	@Test
//	public void updateCustomerFail()
//	{
//		User user=new User(	"10009", "Simran", "Sector 14", "Chandigarh", "simran1@gmail.com",	"8923564378");
//		
//		assertThrows(UserException.class, () -> {
//			userServiceInterface.updateUser( user, 10009); });
//	}
	

}
