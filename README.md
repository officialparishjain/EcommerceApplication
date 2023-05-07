# Project Name
Ecommerce Applicarion

# Frameworks and Language Used
**Spring Boot** 2.1.0
**Java** 20.0
**Maven** 3.8.1

# Data Flow
The following functions are used in the data flow of this project:

_**Models:**_ 

The Address class contains fields for addressId, addressName, addressLandmark, addressPhoneNumber, addressZipcode, addressState, and a many-to-one mapping to the User class.

The Orders class contains fields for orderId, orderProductQuantity, and three many-to-one mappings to the User, Product, and Address classes.

The Product class contains fields for productId, productName, productPrice, productDes, productCategory, productBrand.

The User class contains fields for userId, userName, userEmail, userPassword, and userPhoneNumber.

**Summary of mappings:**

Address class has a many-to-one mapping to User class
Orders class has many-to-one mappings to User, Product, and Address classes
Product class has no mappings to other classes
User class has no mappings to other classes

_**Controller:**_ 

**OrderController:**

The OrderController class is a REST controller that handles HTTP requests related to orders in an ecommerce application. It makes use of four service classes (OrderService, UserService, ProductService, and AddressService) to handle the business logic for orders, users, products, and addresses.
The getOrderById() method is a GET endpoint that takes an ID parameter and returns the corresponding order.
The placeOrder() method is a POST endpoint that takes a request body containing an order and saves it to the database. It first extracts the user, product, and address information from the order and retrieves the corresponding entities from the database using the service classes. Then, it sets these entities on the order and saves it using the OrderService. If the product ID is null, it returns an error message.

Overall, the OrderController provides a way for clients to retrieve and place orders in the ecommerce application.


**UserController:**

The UserController class is a REST controller that handles HTTP requests related to users in an ecommerce application. It uses the UserService class to handle the business logic for users.
The createUser() method is a POST endpoint that takes a request body containing a user and saves it to the database using the UserService. It returns a string indicating whether the user was successfully added.
Overall, the UserController provides a way for clients to create new users in the ecommerce application.


**AddressController:**

This code defines an AddressController class that handles HTTP requests related to addresses. It has two autowired dependencies: AddressService and UserService.
The createAddress method handles a POST request to create a new address. It receives an Address object in the request body and sets the user associated with this address by retrieving it from the UserService. Finally, it calls the addAddress method of the AddressService to add the new address to the database.



_**Services**:_ 

The services layer contains the business logic of the application. It receives requests from the controller, performs necessary computations or data manipulations, and interacts with the repository layer to access data.

The code consists of four different services that are used in an e-commerce application.

**AddressService** - Handles operations related to Address such as adding an address and fetching an address by Id.

**OrderService** - Handles operations related to Orders such as fetching an order by Id and saving an order.

**ProductService** - Handles operations related to Products such as adding a product, deleting a product by Id, fetching all products by category, and fetching a product by Id.

**UserService** - Handles operations related to Users such as adding a user and fetching a user by Id.

_**Repository:**_ The repository layer is responsible for interacting with the database. It uses Spring Data JPA to perform CRUD (create, read, update, delete) operations on entities.


# Database Structure Used
I have used MySql as Database.

# Project Summary

This is an ecommerce application that allow user to place order and having differnt fetures also



