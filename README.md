# QA Automation Learning

This repository documents my transition from manual QA to automation QA.

## Current focus

- Java fundamentals for automation
- API automation foundations
- Git and GitHub workflow
- Test design thinking for automation
- Future focus: Selenium and Playwright

  ---

## Week 1 - Environment Setup and Java Basics

### What I covered
- Set up a Java Maven automation learning project
- Configured JUnit 5, AssertJ, and Maven Surefire
- Created and tested a Calculator class
- Added edge case tests
- Refactored repeated setup using `@BeforeEach`
- Practised Git commits and pushed work to GitHub
- Documented automation candidate thinking for login and API testing

### Classes created
- `Calculator`
- `CalculatorTest`

### Docs created
- `login-test-analysis.md` — manual scenarios, automation candidates, API opportunities, risks
- `api-test-plan-users.md` — test scenarios, assertions, data needed
- `automation-recommendation.md` — reasoning for API-first automation approach
- `week-1-retrospective.md` — what was completed, learned, found difficult, and want to improve

### Key learning
- For reliable JUnit 5 execution in Maven projects, it is good practice to declare a modern maven-surefire-plugin version explicitly
- `maven.compiler.release` is the correct modern way to set Java version in Maven
- `@BeforeEach` runs before every test — use it to avoid repeated setup code
- AssertJ assertions read more naturally than plain JUnit assertions
- Not every manual test should be automated — some require human judgement or visual assessment
- Git commit history is promotion evidence — meaningful messages matter

  ---

## Week 2 - Java, JUnit 5 and AssertJ Basics

### What I covered
- Created simple Java classes and methods
- Practised using parameters and return values
- Wrote JUnit 5 tests
- Used AssertJ assertions
- Followed the Arrange / Act / Assert structure
- Used `@BeforeEach` to manage repeated setup
- Added positive and negative test coverage
- Tested Java's natural `ArithmeticException` behaviour when dividing by zero
- Ran tests through IntelliJ and Maven
- Continued practising Git branching, commits, pushes, and pull requests

### Classes created
- `Calculator`
- `CalculatorTest`
- `LoginValidator`
- `LoginValidatorTest`

### Note on the Week 2 Calculator class
The Week 2 `Calculator` class is separate from the Week 1 work — it lives in the `com.mark.learning.week2` package.

The `divide` method does not include custom exception handling. If division by zero happens, Java naturally throws an `ArithmeticException`. This is
intentional — Week 2 is focused on test structure and understanding Java's default behaviour before adding custom logic.

### Key learning
This week helped me understand the basic structure of automated tests. I practised writing small, focused tests with clear names, simple assertions,
repeated setup using `@BeforeEach`, and both positive and negative scenarios.

  ---

## What I should be able to explain after Week 2

- What a Java class and method is
- What parameters and return values are
- What the Arrange / Act / Assert pattern means
- Why `@BeforeEach` is better than repeating setup in every test
- The difference between a positive test and a negative test
- What `assertThatThrownBy` does and when to use it
- Why clear test names matter — they are documentation
- Why null checks matter in validation logic
- What happens when Java divides an integer by zero
- How to run tests from IntelliJ and from `mvn test`
- What a Git branch is and why you work on one instead of directly on main
- What a Pull Request is and why it exists

  ---

## Stack

- Java 26 (Amazon Corretto)
- Maven 3.9.16
- JUnit 5
- AssertJ
- REST Assured (coming Month 2)
- Playwright Java (coming Month 2)

## Goal

Build a portfolio of automated tests covering API and UI automation, structured using Page Object Model and running through GitHub Actions CI.