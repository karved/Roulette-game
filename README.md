# Roulette-game
My first Java Project made for OOPM coursework. Instructions to play the game are listed below.  
Used basic concepts of **OOPS** for developing the gameflow and for the GUI part, **Java Swing** and **AWT**.

### Instructions
---
1. There can only be a maximum of **6** players.  
2. There are two kinds of bets:  **Inside Bet** and **Outside Bet**. 

3. **Inside Bet**:  
   * *STRAIGHT* :  Place bet on any **1** number. Winning returns **35:1**  
   * *SPLIT* :  Place bet on any **2 adjacent numbers**. Winning returns **17:1**  
   * *CORNER* : Place bet on any **4 numbers sharing the same corner**. Winning returns **8:1**  
   * *STREET* :  Place bet on any **3 numbers in the same row**. Winning returns **11:1**  
   * *DOUBLE STREET* : Place bet on any **6 numbers in two adjacent rows**. Winning returns **5:1**  
   * *5-NUMBER BET* : Bets on the first five numbers, i.e, **0, 00, 1, 2, 3**. Winning returns **6:1**  
   
4. **Outside Bet**:
   * *RED/BLACK* : Bets on either one of the **2** colours. Winning returns **1:1**.
   * *ODD/EVEN* : Bets on either **even or odd** numbers. Winning returns **1:1**.
   * *1 to 18/19 to 36* : Bets on either set of numbers. Winning returns **1:1**
   * *1st 12/ 2nd 12/ 3rd 12* : Bets on any one of these 3 sets of numbers. Winning returns **2:1**.
   * *COLUMN* : Cam bet on numbers either in the fist column, second column, or third column. Winning returns **2:1**. 
   
5. Players can choose to either quit or continue after each round.  
6. An **equal starting amount** will be distributed to each player.  
   The players have to split this amount wisely on either Inside/Outside Bets.  
   
7. Player with the highest amount in hand after all rounds are over is declared the **winner**.

### Screenshots
---

| ![alt text](https://github.com/karved/Roulette-game/blob/master/docs/start.png)  |![alt text](https://github.com/karved/Roulette-game/blob/master/docs/start2.png)|
|------|---|
                
![alt text](https://github.com/karved/Roulette-game/blob/master/docs/page1.png)

|![alt text](https://github.com/karved/Roulette-game/blob/master/docs/roul.png)|![alt text](https://github.com/karved/Roulette-game/blob/master/docs/dice.png)|
|---|----|

![alt text](https://github.com/karved/Roulette-game/blob/master/docs/table.png)
![alt text](https://github.com/karved/Roulette-game/blob/master/docs/last.png)

### Set up
--- 
1. Clone this repository or download zip.   
2. Go to your lib of installed java location of your system, (eg. "C:\Program Files\Java\jre1.8.0_121\lib") and create a folder and paste all the 3  ```.java``` files into this folder.
3. Open terminal to this folder path.  
4. Compile all the files :    
    ```java
    javac Roul.java
    javac Bet.java
    javac -Xlint:deprecation Main.java
    ```
5. Run :
    ```
    java Main 
    ```
6. All set.
