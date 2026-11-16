# Java-trajectory-calculation
A program that calculates the trajectory of a projectile (or bullet) based on relevant variable parameters and given conditions. The trajectory should be calculated until the target is reached or the projectile hits the ground. The final point of the trajectory for which information is displayed must correspond to the target or the ground (the preceding point must be in the air).

Program requirements:
• The program must implement the following:
- Input of real numbers representing the projectile's initial velocity (v_0) or the angle (alpha).
- Output of the projectile's trajectory in a tabular format (time, and the $x$ and $y$ coordinates of the projectile). Time should be displayed with two decimal places, while the x and y coordinates should be displayed with three decimal places. Time is counted starting from zero, using a step size specified for the given variant; however, the position at time t=0 should not be displayed (at this moment, both x and y coordinates are 0).
- If the projectile hits the target, the program must display the message "the target was destroyed"; otherwise, it must display the message "shot off the target".
• The program must handle invalid user input by displaying an appropriate error message on the screen.
