const readline = require('readline');

function reverseWords(sentence) {
  const words = sentence.split(' ');
  const reversedWords = words.map(word => {
    return word.split('').reverse().join('');
  });
  const reversedSentence = reversedWords.join(' ');
  return reversedSentence;
}

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question('Enter a sentence: ', (inputSentence) => {
  const reversedSentence = reverseWords(inputSentence);
  console.log('Reversed Sentence:', reversedSentence);
  rl.close();
});
