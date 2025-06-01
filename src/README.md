# Java AI LangChain4j Project

## Overview
This project is a Java-based application that integrates AI services using the LangChain4j framework. It leverages Spring Boot for application configuration and MongoDB for data storage. The application includes tools, memory providers, and agents to facilitate AI-driven interactions.

## Features
- **AI Service Integration**: Use `@AiService` to define AI agents and tools.
- **MongoDB Integration**: Store and manage chat memory using MongoDB.
- **Dynamic Proxy**: Automatically bind methods to AI models and tools.
- **CRUD Operations**: Perform CRUD operations on MongoDB collections.
- **Custom Configuration**: Define memory providers and tools for AI agents.

## Project Structure
### Main Components
1. **Assistant**:
   - `XiaozhiAgent`: Defines an AI agent with memory and tools.
2. **Configuration**:
   - `XiaozhiAgentConfig`: Configures the chat memory provider using MongoDB.
3. **Store**:
   - `MongoChatMemoryStore`: Handles chat memory storage in MongoDB.
4. **Tests**:
   - `MongoCrudTest`: Unit tests for MongoDB CRUD operations.

### Key Files
- `src/main/java/com/syh/javaailangchain4j/assistant/XiaozhiAgent.java`
- `src/main/java/com/syh/javaailangchain4j/config/XiaozhiAgentConfig.java`
- `src/test/java/com/syh/javaailangchain4j/MongoCrudTest.java`

## Prerequisites
- **Java**: JDK 17 or higher
- **MongoDB**: Installed and running
- **Maven**: For dependency management
- **IntelliJ IDEA**: Recommended IDE

## Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/yanho824/java-ai-langchain4j.git
   ```
2. Navigate to the project directory:
   ```bash
   cd java-ai-langchain4j
   ```
3. Install dependencies:
   ```bash
   mvn install
   ```

## Usage
### Run the Application
1. Start MongoDB.
2. Run the Spring Boot application:
   ```bash
   mvn spring-boot:run
   ```

### Test MongoDB CRUD Operations
Run the test cases in `MongoCrudTest` to verify MongoDB integration:
```bash
mvn test
```

### Interact with Xiaozhi Agent
Use the `XiaozhiAgent` interface to interact with the AI agent:
```java
String response = xiaozhiAgent.chat(1L, "Hello, Xiaozhi!");
System.out.println(response);
```

## Configuration
### MongoDB
Update the MongoDB connection settings in `application.properties`:
```properties
spring.data.mongodb.uri=mongodb://localhost:27017/your_database
```

### AI Service
Configure the AI model and tools in `XiaozhiAgent`:
```java
@AiService(
    wiringMode = EXPLICIT,
    chatModel = "qwenChatModel",
    chatMemoryProvider = "chatMemoryProviderXiaozhi",
    tools = "appointmentTools"
)
```

## License
This project is licensed under the MIT License.

## Contact
For questions or support, contact [yanho824](https://github.com/yanho824).
