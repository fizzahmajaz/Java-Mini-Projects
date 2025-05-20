# 🎁 Java Lucky Draw System

A simple console-based Lucky Draw application built with Java. It takes a list of participants and selects a random set of winners without duplication.

---

## 📌 Table of Contents

1. [Features](#features)
2. [Concepts Used](#concepts-used)
3. [How It Works](#how-it-works)
4. [Sample Output](#sample-output)
5. [Author](#author)

---

## 1. Features <a name="features"></a>

| Feature                   | Description                                          |
|--------------------------|------------------------------------------------------|
| 🧾 Custom Participants    | Enter names of all participants                     |
| 🎯 Random Winners        | Randomly selects winners                            |
| 🔁 No Repetition          | Ensures winners are unique                          |
| 📋 Structured Output      | Displays winners in a clean, numbered list          |

---

## 2. Concepts Used <a name="concepts-used"></a>

| Concept        | Purpose                                                   |
|----------------|------------------------------------------------------------|
| `Scanner`       | Input handling                                             |
| `Random`        | Random number generation                                  |
| `Arrays`        | Store participant names                                    |
| `Booleans`      | Track selected winners to prevent duplication             |
| `StringBuilder` | Efficient and clean result construction                    |

---

## 3. How It Works <a name="how-it-works"></a>

### Step-by-step Flow:

1. Ask for the number of participants.
2. Collect the names and store them in an array.
3. Ask how many winners are needed.
4. Randomly select winners ensuring no repetition.
5. Display the winners using a formatted output.

---

## 4. Sample Output <a name="sample-output"></a>

> Example console session:

```
Enter the number of participents you want :
5
Enter the name of participent 1 :
Ali
Enter the name of participent 2 :
Sara
Enter the name of participent 3 :
Ahmed
Enter the name of participent 4 :
Zara
Enter the name of participent 5 :
Usman
How many winner do you want? :
3
------------------Winners---------------
Winner 1 is Zara
Winner 2 is Ali
Winner 3 is Ahmed
```

---


## 5.  Author <a name="author"></a>

Made with ❤️ by **[Fizzah M Ajaz]**  
[GitHub Profile](https://github.com/fizzahmajaz)
