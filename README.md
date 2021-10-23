## Mars Rover Kata

### Task
Write a program to move rovers around the surface of Mars.

The task has been inspired by https://kata-log.rocks/mars-rover-kata

### Instructions
Task need to be done using TDD.

Given the initial position of rovers (x-coordinate,y-coordinate) and direction (N,E,W,S) it is facing.

Given the commands in the form of String of letters for rover to move.

Expected the final position and direction of roves as output

### Assumptions
1. The surface of Mars has been represented by a rectangular grid.

2. Rovers are equipped with hazards avoidance cameras/sensors "Hazcams".
So,no need to worry about obstacles/collisions. 

3. The working platform is rectangle so no wrap up of rover position but can throw exception if reached at the edge of rectangle.

### Solution
#### Key Features

Used parameterized tests to reduce repetition and get into the mindset of fully TDD development. 

Self contained classes for Rover and Grid.Hence, can have multiple grids and rovers if required. 

Main class is working as controller,it can initiate the multiple instances of both classes and take the decision about which rover need to be placed at which grid and how many rovers at a particular grid.

Any vehicle(not only rovers) can be used as long as it follows the commands.

#### Approach
Started with writing simple testcases for grid and hence creating Grid() class.Testcases for valid and invalid Grid led to method in Grid class.


Wrote testcases for rover movements in Rovertest class covering different movement scenarios  like moving left/right in particular direction.
This led me to different methods in Rover class().

| Position      | Left                       | Right |
| ------------- |:-------------------------: | -----:|
| North         | West  (x-1,y)              | East (x+1,y) |
| South         | East  (x+1,y)              | West (x-1,y)|
| East          | North (x,y+1)              | South (x,y-1) |
| West          | South  (x,y-1)             | North (x,y+1)|

Finally, used main class MarRoverMain() to get input from user, initiate other classes with user inputs and method calling to get outputs.

#### Future thoughts
This solution can be used for other compound shapes of plateau which can be split down to multiple rectangles of different sizes.
However, for shapes like circles and triangles we need to write code for the area left after taking out different size rectangles from that shape.

More directions like North-West, North-East etc can be added and diagonal movement of rover can be implemented. 
