# NOTES

### Memoization Recipe (Top - Down) (recursive)

1. Make it work
    - Visualize the problem as a tree
    - Implement the tree using recursion
    - Test it

2. Make it efficient
    - Add a memo object
    - Add a base case to return memo values
    - Store return values into the memo

### Tabulation (Bottom - Up) (iterative)

1. Visualize the problem as a table
2. Size the size of the table based on the inputs
3. Initialize the table with default values
4. Seed the trivial answer into the table
5. Iterate through the table **(hard)**
6. Fill further positions based on the current position