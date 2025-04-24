"# fullstack-training " 
## Learning Frameworks
```# Course Schedule with Topics and Explanations```
```
## 11/12/2024 -- 20/01/2025: Advanced Java
- **Topics:**
  - **Collection Framework:**
    - Lists, Sets, Maps, and Queues
    - Implementations: ArrayList, LinkedList, HashSet, TreeSet, HashMap, TreeMap, etc.
    - Iterators and Lambda Expressions
  - **JDBC (Java Database Connectivity):**
    - JDBC Drivers (Type 1, Type 2, Type 3, Type 4)
    - Establishing connections to a database using JDBC
    - Statement, PreparedStatement, and CallableStatement
    - Executing SQL queries and updates
    - Transactions in JDBC
  - **J2EE (Java 2 Platform, Enterprise Edition):**
    - Overview of J2EE architecture
    - Servlets and JSP (Java Server Pages)
    - JavaBeans, EJBs (Enterprise JavaBeans)
    - Web applications deployment and configuration
  - **Banking Web Application:**
    - Building a simple banking web application with login, transaction, and account management features
    - Integrating backend with frontend
    - Security considerations (Authentication & Authorization)

## 21/01/2025 -- 04/02/2025: Hibernate Framework
- **Topics:**
  - **Hibernate Configuration (hbm and cfg files):**
    - Setting up Hibernate configuration files (hibernate.cfg.xml)
    - Hibernate mapping files (hbm.xml) for mapping Java objects to database tables
    - SessionFactory and Session in Hibernate
  - **CRUD Operations:**
    - Creating (INSERT), Reading (SELECT), Updating (UPDATE), and Deleting (DELETE) operations using Hibernate
    - Working with HQL (Hibernate Query Language) and Criteria API for querying
    - Mapping one-to-one, one-to-many, and many-to-many relationships
    - Using Hibernate annotations for mapping

## 05/02/2025 -- 03/03/2025: Spring Framework
- **Topics:**
  - **IoC (Inversion of Control):**
    - Explanation of Inversion of Control in Spring
    - Spring IoC container and beans
    - Bean scopes: Singleton, Prototype, Request, Session, etc.
  - **DI (Dependency Injection):**
    - Constructor Injection
    - Setter Injection
    - Field Injection
    - Benefits of Dependency Injection in decoupling classes
  - **Autowiring:**
    - Autowiring with `@Autowired`
    - Autowire by Type, Name, and Constructor
    - Resolving conflicts when multiple beans are available
  - **Spring-JDBC:**
    - Introduction to Spring’s JDBC support
    - JdbcTemplate for simplified JDBC operations
    - Working with data sources, connection pools, and error handling
  - **Spring-MVC:**
    - Understanding the Spring Model-View-Controller pattern
    - DispatcherServlet, Controllers, and Views in Spring
    - Handling requests and responses using annotations (`@RequestMapping`, `@GetMapping`, `@PostMapping`)
    - View resolvers for different view technologies (JSP, Thymeleaf)

## 04/03/2025 -- 04/04/2025: Spring Boot
- **Topics:**
  - **`@SpringBootApplication`:**
    - Spring Boot application entry point and configuration
    - Understanding auto-configuration and embedded servers (e.g., Tomcat)
    - Setting up properties in `application.properties` or `application.yml`
  - **CLR (Class Loader Resolver):**
    - Understanding the Spring Boot class loader and how Spring Boot manages application dependencies
    - Classpath and module dependencies
  - **DI (Dependency Injection) & Autowiring:**
    - Advanced usage of DI in Spring Boot
    - Autowiring with Spring Boot services and components
  - **JSP (Java Server Pages):**
    - Integration of JSP with Spring Boot for view rendering
    - Setting up `InternalResourceViewResolver` for JSP views
  - **JDBC:**
    - Configuring data sources in Spring Boot
    - Database migrations with Flyway or Liquibase
  - **Hibernate:**
    - Integration of Hibernate with Spring Boot
    - Using Spring Boot starter for Hibernate
  - **Data JPA:**
    - Setting up Spring Data JPA repositories
    - Query methods and custom queries
  - **MVC (Model-View-Controller):**
    - Handling HTTP requests and responses in a RESTful way
    - Integrating Spring Boot with MVC architecture
  - **Integrating JSP and Thymeleaf:**
    - Configuring view templates and rendering dynamic content
    - Differences between JSP and Thymeleaf
  - **Rest API:**
    - Building RESTful web services using Spring Boot
    - Using `@RestController` for REST APIs
    - Handling different HTTP methods (`GET`, `POST`, `PUT`, `DELETE`)
    - Exception handling in REST APIs
  - **Web Services:**
    - SOAP vs. REST web services
    - Building SOAP web services with Spring Web Services
    - Consuming and producing web services in Spring Boot
  - **Microservices:**
    - Introduction to microservices architecture
    - Building microservices with Spring Boot and Spring Cloud
    - Service discovery, configuration management, and fault tolerance using Spring Cloud
  - **Spring Security:**
    - Authentication and Authorization in Spring Boot
    - Role-based access control
    - Securing RESTful APIs with JWT (JSON Web Tokens)
    - Integration with OAuth2 for third-party login
  - **AOP (Aspect-Oriented Programming):**
    - Introduction to AOP concepts in Spring
    - Using `@Aspect` and `@Around` for method interception
    - Practical uses of AOP in logging, security, and transactions
```
