# java-training

Learning Java with Codecademy exercises.

## Compile And Run With The JDK CLI

From the folder that contains your Java file:

```bash
javac HideAndSeek.java
java HideAndSeek
```

Important details:

1. `javac` compiles `.java` source files into `.class` files.
2. `java` runs the class by class name (no file extension).
3. Use `java HideAndSeek`, not `java HideAndSeek.java` and not `java HideAndSeek.class`.

## What Is A `.class` File?

A `.class` file is compiled Java bytecode.

1. You write source code in `.java` files.
2. The compiler (`javac`) translates it into bytecode (`.class`).
3. The JVM executes that bytecode when you run `java ClassName`.

Think of it as:

1. `.java` = human-readable code
2. `.class` = JVM-readable code

## JVM In Short

The JVM (Java Virtual Machine) is the runtime that executes Java bytecode.

Why compile to bytecode first:

1. Portability: the same `.class` file can run on any OS with a compatible JVM.
2. Safety: the JVM verifies bytecode before running it.
3. Performance: the JVM can JIT-optimize frequently used code paths at runtime.

Pipeline:

1. Write `.java`
2. Compile with `javac` to `.class`
3. Run with `java` on a machine that has a compatible JVM
