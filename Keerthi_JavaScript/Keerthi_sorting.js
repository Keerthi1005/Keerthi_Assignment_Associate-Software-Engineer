function sortDescending(arr) {
  const sortedArray = arr.sort((a, b) => b - a);
  return sortedArray;
}

const inputArray = [9, 3, 5, 8, 4, 7];
const sortedArray = sortDescending(inputArray);
console.log(sortedArray);