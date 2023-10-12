const numbers = [5, 2, 9, 1, 5, 6];

// Using the sort() method with an arrow function
numbers.sort((a, b) => b - a);

console.log(numbers); // Output: [9, 6, 5, 5, 2, 1]