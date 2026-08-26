// 1. Setup a list of numbers
let numbers =;

// 2. Assume the first number is the largest to start
let maxNumber = numbers[0];

// 3. Loop through the rest of the list
for (let i = 1; i < numbers.length; i++) {

    // 4. If the current number is bigger than our current max...
    if (numbers[i] > maxNumber) {
        // ...update the max to be this new, larger number
        maxNumber = numbers[i];
    }
}

// 5. Output the final result
console.log("The largest number is:", maxNumber); // Outputs: 92

