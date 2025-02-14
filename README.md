# Java Design Patterns Examples 🚀  

Welcome to the **Java Design Patterns Examples** repository! 🎉 This project showcases key **design patterns** in Java with **real-world implementations**, making it an excellent resource for mastering **Object-Oriented Programming (OOP) design principles**.  

---

## 📚 Table of Contents  
- [Patterns Implemented](#patterns-implemented-🛠️)  
- [Code Examples and Insights](#code-examples-and-insights-🧠)  
- [How to Run](#how-to-run-🏃‍♂️)  
- [Contributing](#contributing-🤝)  

---

## 🛠️ Patterns Implemented  

### 🔒 Singleton Pattern  
Ensures a class has only one instance and provides a **global access point**.  
**Example Use Case:** Database connection manager.  

#### **Example Usage:**  
```java
DatabaseConnection db1 = DatabaseConnection.getInstance();
DatabaseConnection db2 = DatabaseConnection.getInstance();
db1.query("SELECT * FROM users");
db2.query("INSERT INTO users VALUES (1, 'John')");
```
### 🔒 Mediator Pattern  
Facilitates communication between objects without them being directly coupled, promoting a more flexible system.
**Example Use Case:** Chat room system, where users communicate through a mediator.

#### **Example Usage:**  
```java
ChatMediator mediator = new ChatRoom();
User user1 = new User("Alice", mediator);
User user2 = new User("Bob", mediator);

user1.sendMessage("Hello, Bob!");
user2.sendMessage("Hi Alice, how are you?");

```

### 🔒 Facade Pattern
Provides a simplified interface to a complex system, making it easier to use.
Example Use Case: Home Theater System, where multiple components are controlled through a single interface.
```
HomeTheaterFacade homeTheater = new HomeTheaterFacade();
homeTheater.watchMovie("Inception");
homeTheater.endMovie();
```

How to Run
1️⃣ Clone the repository:

```
git clone https://github.com/MenathNDGD/Java-Design-Patterns-Examples.git
```
2️⃣ Navigate to the desired pattern directory:
```
cd "Singleton Pattern"  # or "Mediator Pattern", "Facade Pattern"
```

3️⃣ Compile and run the program:
``
javac Main.java  
java Main
``

🤝 Contributing

We welcome contributions! If you'd like to enhance the project or fix bugs, feel free to:

Fork the repository
Submit a pull request

Happy Coding! 🚀🔥
