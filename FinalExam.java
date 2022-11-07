public class FinalExam {
    public static void main(String[] args) throws Exception {

        // Print the words in their given pattern.

        char[][] array = {
                { 'R', 'E', 'I', 'M', 'A', 'E', 'R', 'S', 'G', 'T' },
                { 'E', 'V', 'D', 'B', 'D', 'V', 'I', 'A', 'B', 'I' },
                { 'E', 'L', 'R', 'O', 'F', 'S', 'A', 'W', 'U', 'K' },
                { 'B', 'G', 'C', 'E', 'I', 'L', 'C', 'J', 'H', 'T' },
                { 'S', 'S', 'K', 'G', 'D', 'Z', 'H', 'S', 'T', 'O' },
                { 'V', 'M', 'J', 'A', 'V', 'H', 'Z', 'S', 'I', 'K' },
                { 'C', 'H', 'I', 'L', 'L', 'T', 'O', 'P', 'G', 'M' },
                { 'Y', 'S', 'P', 'I', 'T', 'A', 'P', 'R', 'W', 'D' },
                { 'G', 'B', 'D', 'S', 'T', 'K', 'P', 'W', 'S', 'O' },
                { 'G', 'T', 'L', 'H', 'Q', 'X', 'Q', 'L', 'O', 'E' },
        };

        // =============================================================
        // ALAK - (10 points)
        System.out.println(" ");
        System.out.println("1. ALAK ");
        for (int row = 0; row < 10; row++) {
            System.out.println("");
            for (int column = 0; column < 10; column++)    
                if (row == 7 && (column == 5 )) {
                System.out.print(array[row][column]);
                }
                else if (row == 6 && (column == 4 )) {
                    System.out.print(array[row][column]);
                }
                else if (row == 5 && (column == 3 )) {
                System.out.print(array[row][column]);
               }
                else if (row == 4 && (column == 2 )) {
                System.out.print(array[row][column]);
               }
                else{
                    System.out.print(" ");
               }

        // =============================================================
        // // GITHUB - (10 points)
        System.out.println(" ");
        System.out.println("2. GITHUB ");
        for (int rows = 0 ; rows < 10; rows++) {
                System.out.println("");
                for (int column = 0; column < 10; column++)    
                    if (rows == 6 && (column == 8 )) {
                    System.out.print(array[rows][column]);
                    }
                    else if (rows == 5 && (column == 8 )) {
                    System.out.print(array[rows][column]);
                   }
                   else if (rows == 4 && (column == 8 )) {
                    System.out.print(array[rows][column]);
                   }
                   else if (rows == 3 && (column == 8 )){
                    System.out.print(array[rows][column]);
                   }
                   else if (rows == 2 && (column == 8 )){
                    System.out.print(array[rows][column]);
                   }
                   else if (rows == 1 && (column == 8 )){
                    System.out.print(array[rows][column]);
                   }
    }

        // // =============================================================
        // // SISIG - (10 points)
        // System.out.println(" ");
        // System.out.println("3. SISIG ");
        for (int rows = 0; rows < 10; rows++) {
                System.out.println("");
                for (int column = 0; column < 10; column++)    
                    if (rows == 0 && (column == 7 )) {
                    System.out.print(array[rows][column]);
                    }
                    else if (rows == 0 && (column == 7 )) {
                        System.out.print(array[rows][column]);
                    }
                    else if (rows == 1 && (column == 6 )) {
                    System.out.print(array[rows][column]);
                   }
                    else if (rows == 2 && (column == 5)) {
                    System.out.print(array[rows][column]);
                   }
                   else if (rows == 3 && (column == 4)){
                    System.out.print(array[rows][column]);
                   }
                   else if (rows == 4 && (column == 3)){
                    System.out.print(array[rows][column]);
                   }
                    else{ 
                        System.out.print(" ");
                   }
                }
        // // =============================================================
        // // VSCODE - (10 points)
        // System.out.println(" ");
        // System.out.println("4. VSCODE ");
        for (int rows = 0; rows < 10; rows++) {
                    System.out.println("");
                    for (int column = 0; column < 10; column++)    
                        if (rows == 5 && (column == 0 )) {
                        System.out.print(array[rows][column]);
                        }
                        else if (rows == 4 && (column == 1 )) {
                            System.out.print(array[rows][column]);
                        }
                        else if (rows == 3 && (column == 2 )) {
                        System.out.print(array[rows][column]);
                       }
                       else if (rows == 2 && (column == 3)){
                        System.out.print(array[rows][column]);
                       }
                       else if (rows == 1 && (column == 4)){
                        System.out.print(array[rows][column]);
                       }
                       else if (rows == 0 && (column == 5)){
                        System.out.print(array[rows][column]);
                       }

                        else{ 
                            System.out.print(" ");
                       }
                    }
        // // =============================================================
        // // BEER - (10 points)
        // System.out.println(" ");
        // System.out.println("5. BEER ");
        for (int rows = 0; rows < 10; rows++) {
            System.out.println("");
                     for (int column = 0; column < 10; column++)    
                        if (rows == 3 && (column == 0 )) {
                         System.out.print(array[rows][column]);
                     }
                        else if (rows == 2 && (column == 0 )) {
                                System.out.print(array[rows][column]);
                            }
                            else if (rows == 1 && (column == 0 )) {
                            System.out.print(array[rows][column]);
                           }
                           else if (rows == 0 && (column == 0)){
                            System.out.print(array[rows][column]);
                           }
                            else{ 
                                System.out.print(" ");
                           }
                        }

        // // =============================================================
        // // JAVA - (10 points)
        System.out.println(" ");
        System.out.println("6. JAVA ");
        for (int rows = 0; rows < 10; rows++){
            System.out.println("");
                    for (int column = 0; column < 10; column++) 
                    if (rows == 3 && (column == 7 )) {
                        System.out.print(array[rows][column]);
                     }
                      else if (rows == 2 && (column == 6 )) {
                            System.out.print(array[rows][column]);
                         }
                            else if (rows== 1 && (column == 5 )) {
                            System.out.print(array[rows][column]);
                           }
                           else if (rows == 0 && (column == 4)){
                            System.out.print(array[rows][column]);
                           }
                            else{ 
                                System.out.print(" ");
            }
        }
    }
                    
        // // =============================================================
        // // TIKTOK - (10 points)
        // System.out.println(" ");
        // System.out.println("7. TIKTOK ");
        for (int row = 0; row < 10; row++){
        System.out.println("");
            for (int column = 0; column < 10; column++) 
                if (row == 0 && (column == 9 )) {
                System.out.print(array[row][column]);
                }
                    else if (row == 1 && (column == 9 )) {
                    System.out.print(array[row][column]);
                }
                else if (row == 2 && (column == 9 )) {
                    System.out.print(array[row][column]);
                }
                else if (row == 3 && (column == 9)){
                    System.out.print(array[row][column]);
                }
                else if (row == 4 && (column == 9)){
                    System.out.print(array[row][column]);
                }
                else if (row == 5 && (column == 9)){
                    System.out.print(array[row][column]);
                }
                else{ 
                    System.out.print(" ");
                    }
                }
            
        
        

        // // =============================================================
        // // CHILLTOP - (10 points)
        // System.out.println(" ");
        // System.out.println("8. CHILLTOP ");
        for (int rowss = 0; rowss < 10; rowss++){
            System.out.println("");

                for (int column = 0; column < 10; column++) 
                    if (rowss == 6 && (column == 0 )) {
                    System.out.print(array[rowss][column]);
                    }
                    else if (rowss == 6 && (column == 1 )) {
                        System.out.print(array[rowss][column]);
                    }
                    else if (rowss == 6 && (column == 2 )) {
                        System.out.print(array[rowss][column]);
                    }
                    else if (rowss == 6 && (column == 3)){
                        System.out.print(array[rowss][column]);
                    }
                    else if (rowss == 6 && (column == 4)){
                        System.out.print(array[rowss][column]);
                    }
                    else if (rowss == 6 && (column == 5)){
                        System.out.print(array[rowss][column]);
                    }
                    else if (rowss == 6 && (column == 6)){
                        System.out.print(array[rowss][column]);
                    }
                    else if (rowss == 6 && (column == 7)){
                        System.out.print(array[rowss][column]);
                    }
                    else{ 
                        System.out.print(" ");
                        }
                    }
                
                

        // // =============================================================
        // // REDHORSE - (10 points)
        // System.out.println(" ");
        // System.out.println("9. REDHORSE ");
        for (int rows = 0; rows < 10; rows++){
                System.out.println("");
                    for (int column = 0; column < 10; column++) 
                        if (rows == 2 && (column == 2 )) {
                        System.out.print(array[rows][column]);
                        }
                        else if (rows == 3 && (column == 3 )) {
                            System.out.print(array[rows][column]);
                        }
                        else if (rows == 4 && (column == 4 )) {
                            System.out.print(array[rows][column]);
                        }
                        else if (rows == 5 && (column == 5)){
                            System.out.print(array[rows][column]);
                        }
                        else if (rows == 6 && (column == 6)){
                            System.out.print(array[rows][column]);
                        }
                        else if (rows == 7 && (column == 7)){
                            System.out.print(array[rows][column]);
                        }
                        else if (rows == 8 && (column == 8)){
                            System.out.print(array[rows][column]);
                        }
                        else if (rows == 9 && (column == 9)){
                            System.out.print(array[rows][column]);
                        }
                        else{ 
                            System.out.print(" ");
                            }
                        }
                    
                
        // // =============================================================
        // // TIPSY - (10 points)
        // System.out.println(" ");
        // System.out.println("10. TIPSY ");
        for (int row = 0; row < 10; row++){
                    System.out.println("");
                        for (int column = 0; column < 10; column++) 
                            if (row == 7 && (column == 4 )) {
                            System.out.print(array[row][column]);
                            }
                            else if (row == 7 && (column == 3 )) {
                                System.out.print(array[row][column]);
                            }
                            else if (row == 7 && (column == 2 )) {
                                System.out.print(array[row][column]);
                            }
                            else if (row == 7 && (column == 1)){
                                System.out.print(array[row][column]);
                            }
                            else if (row == 7 && (column == 0)){
                                System.out.print(array[row][column]);
                            }
                            else{ 
                                System.out.print(" ");
                                }
                            }
    }
}
        // =============================================================

        // BONUS
        // SLY starts to learn programming. The first task is drawing a fox! However, that turns out to be too hard for a beginner, so she decides to draw a snake instead.

        // A snake is a pattern on a n by m table. Denote c-th cell of r-th row as (r, c). The tail of the snake is located at (1, 1), then it's body extends to (1, m), then goes down 2 rows to (3, m), then goes left to (3, 1) and so on.

        // Your task is to draw this snake for Fox Ciel: the empty cells should be represented as dot characters ('.') and the snake cells should be filled with number signs ('#').

        // Consider sample tests in order to understand the snake pattern.
        
        
        // Input
        // The only line contains two integers: n and m (3 ≤ n, m ≤ 50).

        // n is an odd number.

        // Output
        // Output n lines. Each line should contain a string consisting of m characters. Do not output spaces.
        
        // Example
        // Input: 3 3
        
        // ###
        // ..#
        // ###
        // #..
        // ###
        
        
//         Input: 9 9
            
// #########
// ........#
// #########
// #........
// #########
// ........#
// #########
// #........
// #########
                
                    
            

