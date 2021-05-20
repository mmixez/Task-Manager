# Task Manager

Building a Swing based task manager application

Design pattern - MVC + Observer pattern ( Buttons notify ActionListeners in MainView & PopUpWindow )
In the model package, the Task class is the main model class and the ToDoList class stores tasks as data storage.

One additional design pattern - Decorator pattern is applied ( concrete component Task class and the decorator class ImportantTask realize TaskInterface and ImportantTask class adds extra information such as 'marking if the task is important' + possible extra future features)
