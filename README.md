# LangChain4j AI Assistant

A Spring Boot application demonstrating AI integration using LangChain4j framework with DeepSeek API.

## Technologies

- Java 17+
- Spring Boot
- LangChain4j
- DeepSeek API
- Maven

## Features

- AI chat interaction through simple interface
- Integration with DeepSeek API
- Environment-based configuration
- Logging for debug and monitoring

## Setup

1. Clone the repository:
```bash
git clone https://github.com/yanho824/LangChain4j-GreenHand.git
```

2. Create `src/main/resources/application-local.properties` with:
```properties
langchain4j.open-ai.chat-model.api-key=your_deepseek_api_key
```

3. Set environment variable:
```bash
export DEEP_SEEK_API_KEY=your_deepseek_api_key
```

## Configuration

The application uses Spring profiles:
- `application.properties`: Default configuration
- `application-local.properties`: Local overrides (gitignored)

Default port: 8080

## Development

Build the project:
```bash
mvn clean install
```

Run the application:
```bash
mvn spring-boot:run
```
```
