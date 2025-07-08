# Daksh's Java Module System Demo

This project demonstrates the Java Module System (Project Jigsaw) with two modules:
- `com.greeting`: Provides greeting functionality
- `com.app`: Main application that uses the greeting module

## Project Structure

```
daksh/
├── com.app/
│   ├── module-info.java
│   └── com/
│       └── app/
│           └── MainApp.java
├── com.greeting/
│   ├── module-info.java
│   └── com/
│       └── greeting/
│           └── Greeting.java
└── README.md
```

## Features

### com.greeting Module
- **sayHello()**: Default greeting message with timestamp
- **sayHello(String name)**: Personalized greeting
- **sayGoodbye()**: Farewell message
- **displayModuleInfo()**: Shows module information

### com.app Module
- **MainApp**: Demonstrates usage of the greeting module
- Shows various greeting methods
- Displays module information

## How to Compile and Run

### Method 1: Using Java Module System Commands

1. **Navigate to the daksh folder**:
   ```bash
   cd "c:\Users\daksh\Downloads\chitkara folder\5th sem\APC\daksh"
   ```

2. **Compile the greeting module**:
   ```bash
   javac -d mods --module-source-path . com.greeting/module-info.java com.greeting/com/greeting/Greeting.java
   ```

3. **Compile the app module**:
   ```bash
   javac -d mods --module-source-path . --module-path mods com.app/module-info.java com.app/com/app/MainApp.java
   ```

4. **Run the application**:
   ```bash
   java --module-path mods -m com.app/com.app.MainApp
   ```

### Method 2: Simplified Compilation

1. **Compile all modules at once**:
   ```bash
   javac -d mods --module-source-path . $(find . -name "*.java")
   ```

2. **Run the application**:
   ```bash
   java --module-path mods -m com.app/com.app.MainApp
   ```

## Expected Output

```
=== Welcome to Daksh's Module System Demo ===
=== Module Information ===
Module: com.greeting
Package: com.greeting
Class: Greeting
Author: Daksh
========================
Hello! Welcome to the Java Module System Demo!
Current time: 2025-07-08 [current time]
Hello Daksh! Nice to meet you!
Hope you're having a great day!
Hello Students! Nice to meet you!
Hope you're having a great day!
Hello Professor! Nice to meet you!
Hope you're having a great day!
Goodbye! Thanks for using the module system demo!
=== Demo Complete ===
```

## Key Learning Points

1. **Module Declaration**: Using `module-info.java` files
2. **Module Dependencies**: `requires` directive in com.app
3. **Module Exports**: `exports` directive in com.greeting
4. **Inter-module Communication**: How modules interact
5. **Encapsulation**: Module boundaries and access control

## Author
- **Name**: Daksh
- **Course**: APC (Advanced Programming in C/Java)
- **Semester**: 5th
- **University**: Chitkara University
