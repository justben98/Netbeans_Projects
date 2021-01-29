/* 
 * File:   main.c
 * Author: administrator
 *
 * Created on July 17, 2019, 9:48 AM
 */

#include <stdio.h>
#include <stdlib.h>

/*
 * Project to test the C-Compiler and Libraries
 */
int main(int argc, char** argv) {
    //Declare a variable
    int number;
    
    //Test the output stream
    printf("Hello C! \nEnter a number: ");
    
    //Test the standard input stream
    scanf("%d",number);
    
    //Exit status
    return (EXIT_SUCCESS);
}

