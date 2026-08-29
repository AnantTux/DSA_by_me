function calculateAverage(numbers) {
    if (numbers.length === 0) {
        return 0;
    }

    return numbers.reduce((total, number) => total + number, 0) / numbers.length;
}

console.log(calculateAverage([10, 20, 30]));
