# Assignment 3: Bridge Pattern

**Topic:** Notification System (Option B - Free Topic)

## Description
This project implements the Bridge structural design pattern in Java. 
It decouples the `Notification` abstraction from the `MessageSender` implementation, allowing them to vary independently.

## Architecture
- **Abstraction:** `Notification`
- **Refined Abstractions:** `AlertNotification`, `ReminderNotification`
- **Implementor:** `MessageSender`
- **Concrete Implementors:** `EmailSender`, `SmsSender`
- **Client:** `Main` (Demonstrates runtime switching of implementations)
