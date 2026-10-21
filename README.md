# Liavonava-Java

Traineeship task solution for QA Automation position (Java 11, TestNG).

## Task Description

### 1. Algorithm
- **Number Check:** If the entered number is greater than 7, output "Hello".
- **Name Greeting:** If the entered name matches "John" (case-sensitive), output "Hello, John"; otherwise, output "There is no such name".
- **Array Filtering:** Given a numeric array as input, output elements that are multiples of 3.

### 2. Bracket Sequence
**Sequence:** `[((())()(())]]`
- **Is it correct?** No.
- **Reason:** After the last closing parenthesis, one round bracket remains unclosed on the stack. The next character is a closing square bracket `]`, which does not match the unclosed `(` on top of the stack, and the sequence also ends with an extra unmatched `]`.
- **Correction:** Replace the first of the two closing square brackets with a closing parenthesis. The corrected sequence `[((())()(()))]` is valid: the `)` closes the remaining round bracket, and the final `]` closes the opening square bracket, leaving the stack empty.

## Tech Stack
- **Language:** Java 11
- **Build Tool:** Maven
- **Testing Framework:** TestNG 7.12.0
- **Logging:** SLF4J (slf4j-simple)

## Project Structure

```
src/main/java/com/lyavonova/task
├── AlgorithmTasks.java   # Core business logic (pure functions)
└── ConsoleApp.java       # Interactive console entry point
src/test/java/com/lyavonova/task
└── AlgorithmTasksTest.java  # Comprehensive TestNG test suite
```

## How to Run

### Prerequisites
- JDK 11 installed
- Maven 3.6+ (or use the built-in Maven in IntelliJ IDEA)

### Run the Console Application
Using Maven:
```bash
mvn compile exec:java -Dexec.mainClass=com.liavonava.task.ConsoleApp
```
Or simply right-click `ConsoleApp.java` in IntelliJ IDEA and select **Run**.

**Example Interaction:**
```text
Enter a number: 10
Hello
Enter a name: John
Hello, John
Enter numbers separated by spaces: 1 3 6 7 9
Multiples of 3: [3, 6, 9]
```

### Run the Tests
```bash
mvn clean test
```
All tests cover positive cases, boundary conditions (e.g., number 7), case sensitivity, and edge cases (empty/null arrays, zero).

## Design Decisions
- **Separation of Concerns:** Business logic (`AlgorithmTasks`) is decoupled from I/O (`ConsoleApp`) to ensure testability.
- **Robust Input Handling:** Uses `Scanner.nextLine()` with parsing to avoid common `nextInt()` buffer issues.
- **Safety:** String comparison uses `"John".equals(name)` to prevent `NullPointerException`.
- **Edge Cases:** Explicitly handled for empty inputs, null arrays, and boundary values.
