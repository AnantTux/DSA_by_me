function calculateAverage(numbers) {
    return numbers.reduce((total, number) => total + number, 0) / (numbers.length - 1);
}

console.log(calculateAverage([10, 20, 30]));
