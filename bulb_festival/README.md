# -JAVA-
This repository contains all my Java programs, including practice problems, mini-projects, and algorithm implementations.

## 🌟 Bulb Festival Program

In Ramapuram's annual festival, bulbs glow based on their number:
- 💚 Green: divisible by 3
- ❤️ Red: divisible by 5
- 💛 Yellow: divisible by both
- ⚫ Off: otherwise

This Java program takes user input for the total number of bulbs and prints their glow status.

---

## 🧠 Logic

```java
for (int i = 1; i <= n; i++) {
    if (i % 3 == 0 && i % 5 == 0)
        System.out.println("Bulb " + i + ": Yellow");
    else if (i % 3 == 0)
        System.out.println("Bulb " + i + ": Green");
    else if (i % 5 == 0)
        System.out.println("Bulb " + i + ": Red");
    else
        System.out.println("Bulb " + i + ": Off");
}



