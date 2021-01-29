/* 
 * File:   main.c
 * Author: Justech@ubuntusystems.com
 *
 * Created on October 21, 2019, 12:34 AM
 */

#include <stdio.h>
#include <stdlib.h>


/*
 * Program: to set random MAC on interface wlo1
 * This program uses macchanger a its dependency
 */
int main(int argc, char** argv) {
        //execute the series of commands
    system ("sudo ifconfig wlo1 down && sudo macchanger -r wlo1 && sudo ifconfig wlo1 up");
    
    //Exit status
    return (EXIT_SUCCESS);
}