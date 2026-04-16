# 🎯 Number Guessing Game (CLI) https://roadmap.sh/projects/number-guessing-game

A simple command-line number guessing game where the player tries to guess a randomly generated number within a limited number of attempts.

## 📌 Overview
The game generates a random number between **1 and 100**, and the player must guess it correctly based on the selected difficulty level. Each difficulty determines how many attempts the player gets.

## ⚙️ How It Works
- The game starts with a welcome message and instructions.
- A random number between **1–100** is generated.
- The player chooses a difficulty:
  - **Easy** – more attempts  
  - **Medium** – moderate attempts  
  - **Hard** – fewer attempts  
- The player enters guesses through the command line.

## 🎮 Game Rules
- After each guess:
  - ✅ If correct → the player wins, and the number of attempts is displayed.
  - ❌ If incorrect → the game provides a hint:
    - The correct number is **higher** or **lower**.
- The game ends when:
  - The player guesses the number, or  
  - The player runs out of attempts.

## ✨ Features
- Command-line interface (CLI)
- Random number generation (1–100)
- Difficulty-based attempt limits
- Real-time feedback (higher/lower hints)
- Clear win/lose messages
