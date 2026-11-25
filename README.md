![Advent of Code](advent-of-code.png)

# Advent of Code

[Advent of Code](https://adventofcode.com/) is an annual series of programming puzzles. Each puzzle presents a small
story and a problem to solve, with a second part usually revealed after completing the first. Participants can use the
puzzles to practice problem-solving and explore programming languages and techniques.

This repository contains solutions organized as Maven modules by year, along with a module for code shared between
years.

## Repository structure

- `2025/` — solutions and supporting code for the 2025 event.
- `2026/` — solutions and supporting code for the 2026 event.
- `common/` — shared code used by the year modules.
- `pom.xml` — root Maven project that aggregates the modules.
- `mvnw` and `mvnw.cmd` — Maven Wrapper scripts for Linux/macOS and Windows.
- `advent-of-code.png` — README banner image.

## Build

The project targets Java 25. With a Java 25 JDK installed, run the Maven build from the repository root:

```sh
./mvnw verify
```