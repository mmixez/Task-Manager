# Task Manager

Building a Swing based task manager application

Design pattern - MVC + Observer pattern ( Buttons notify ActionListeners in MainView & PopUpWindow )
In the model package, the Task class is the main model class and the ToDoList class stores tasks as data storage. The Controller
class in the controller package is under construction. The errors in the MainView and PopUpWindow need to be fixed.

One additional design pattern - As for now, Decorator pattern is applied and I'm looking for adding more extra features &
implementing other possible patterns. ( concrete component Task class and the decorator class ImportantTask realize TaskInterface
and ImportantTask class adds extra information such as 'marking if the task is important' + possible extra future features)
