# Coding Interview Patterns Playbook

![algorithm](https://github.com/user-attachments/assets/38604e1b-e84e-4b96-874e-625ab3893e12)

### Algorithmic Thinking for Software Engineering Interviews

A pattern-based Java repository for practicing algorithms, data structures, problem-solving, and interview communication.

The goal is not to memorize isolated problems. Each solution documents how to recognize the pattern, explain the approach, evaluate trade-offs, analyze complexity, and produce readable code under interview conditions.

## Portfolio Positioning

This repository complements my backend portfolio by demonstrating computer science fundamentals and technical communication. Production-oriented engineering is demonstrated separately through REST APIs, Spring Boot services, automated tests, documentation, and CI/CD projects.

**Repository type:** coding interview playbook  
**Primary language:** Java 21  
**Build:** Maven  
**Tests:** JUnit 5  
**CI:** GitHub Actions

## Current Progress

| Phase | Pattern | Solutions | Tests | Status |
|---|---|---:|---:|---|
| 1 | Sliding Window | 1 | 3 | In progress |
| 1 | Two Pointers | 1 | 3 | In progress |
| 1 | Arrays and Hashing | 0 | 0 | Planned |
| 1 | Binary Search | 0 | 0 | Planned |
| 1 | Stack | 0 | 0 | Planned |
| 1 | Linked List | 0 | 0 | Planned |
| 1 | Tree BFS and DFS | 0 | 0 | Planned |

## Implemented Problems

### Sliding Window

- `MaximumSumSubarray` — maximum sum of a contiguous subarray with fixed size; `O(n)` time and `O(1)` space.

### Two Pointers

- `PairWithTargetSum` — finds two indexes in a sorted array whose values match a target sum; `O(n)` time and `O(1)` space.

## Solution Standard

Every problem should include:

1. A concise problem statement.
2. The algorithmic pattern.
3. Recognition clues.
4. Brute-force reasoning when relevant.
5. An optimized approach.
6. Time and space complexity.
7. Edge cases.
8. Readable Java implementation.
9. Automated tests.
10. A short interview-ready explanation.

## Repository Structure

```text
src/
├── main/java/io/pixelvoid/interviews/
│   ├── slidingwindow/
│   └── twopointers/
└── test/java/io/pixelvoid/interviews/
    ├── slidingwindow/
    └── twopointers/
```

The project is organized by patterns rather than by platform or problem ID.

## Roadmap

### Phase 1 — Core Interview Foundations

Target: 15–20 well-documented problems.

- Arrays and Hashing
- Two Pointers
- Sliding Window
- Binary Search
- Stack
- Linked List
- Tree BFS and DFS

### Phase 2 — Intermediate Patterns

- Heap and Priority Queue
- Graph BFS and DFS
- Topological Sort
- Intervals
- Prefix Sum
- Backtracking
- Monotonic Stack

### Phase 3 — Advanced Topics

- Dynamic Programming
- Union Find
- Trie
- Shortest Paths
- Advanced graph problems
- Introductory system design exercises

## Running the Project

Requirements:

- Java 21
- Maven 3.9+

Run all tests:

```bash
mvn test
```

## Study Method

1. Study one pattern at a time.
2. Solve without viewing the final implementation.
3. Explain the solution aloud.
4. Compare brute-force and optimized approaches.
5. Reimplement the problem after spaced intervals.
6. Treat each exercise as a mock interview.

## References and Inspiration

- *Coding Interview Patterns: Nail Your Next Coding Interview* — Xu A.
- *Silicon Valley Python Engineer Interview Guide: Data Structure, Algorithm, and System Design* — Jianfeng Ren and Andric Li.

Concepts are studied and reimplemented in Java with emphasis on reasoning and interview communication.

## Disclaimer

This is a personal educational repository. Solutions reflect my study process and interpretation of common interview patterns.
