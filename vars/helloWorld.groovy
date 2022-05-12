// def call() {
//     sh 'echo Hello World'
// }

def call(String name, String dayOfWeek) {
    sh "echo Hello ${name}. Today is ${dayOfWeek}."
}