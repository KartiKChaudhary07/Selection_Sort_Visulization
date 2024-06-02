# Selection Sort Visualization

This project is a Java application that visualizes the Selection Sort algorithm using `javax.swing` for graphical representation. The visualization displays the sorting process in real-time, showing how elements are swapped and sorted.

## How It Works

The program initializes a list of integers from 1 to 200, shuffles them randomly, and then sorts them using the Selection Sort algorithm. The sorting process is visualized with graphical elements where each element is represented as a vertical line. The height of each line corresponds to the value of the element.

### Main Components

1. **Main Class**: This is the entry point of the application, which extends `JPanel` to facilitate custom drawing.
2. **swapColors Method**: Handles the graphical representation of swapping two elements.
3. **swap Method**: A utility method that swaps two elements in a list.
4. **selectionSort Method**: Implements the Selection Sort algorithm and calls `swapColors` to update the visualization.
5. **paintComponent Method**: Overrides the default `JPanel` painting method to draw the current state of the array.

### Visualization Steps

- Initialize an array of integers from 1 to 200.
- Shuffle the array randomly.
- Use Selection Sort to sort the array:
  - Find the minimum element in the unsorted part of the array.
  - Swap it with the first unsorted element.
  - Update the graphical representation for each swap.

### Graphical Representation

- Each element is drawn as a vertical line.
- Swapped elements are highlighted in green during the swap process.
- The array is updated visually after each swap.

## How to Use

1. **Clone the Repository**
2.compiler the code   
3. Run the application
