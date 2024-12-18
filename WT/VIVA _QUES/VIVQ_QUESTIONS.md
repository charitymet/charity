# Node.js Interview Questions

## 1. **What is Node.js?**

Node.js is a server-side scripting platform used to build scalable programs. Its multiple advantages over other server-side languages include non-blocking I/O, which is one of its prominent features.

---

## 2. **How does Node.js work?**

Node.js operates on a V8 environment, a virtual machine that utilizes JavaScript as its scripting language. It achieves high output through non-blocking I/O and a single-threaded event loop.

---

## 3. **What do you mean by the term I/O?**

I/O stands for Input and Output. It involves accessing anything outside of your application. When the application starts, the I/O will load into the machine memory to run the program.

---

## 4. **What does event-driven programming mean?**

Event-driven programming is a programming paradigm where the flow of the program is determined by events such as messages from other programs or threads. It is divided into two sections:

1. Event Selection  
2. Event Handling

---

## 5. **Where can we use Node.js?**

Node.js can be used for various purposes, including:

- Web applications (especially real-time web apps)  
- Network applications  
- Distributed systems  
- General-purpose applications  

---

## 6. **What is the advantage of using Node.js?**

The advantages of Node.js include:

- Provides an easy way to build scalable network programs  
- Generally fast  
- Great concurrency  
- Asynchronous processing  
- Almost never blocks  

---

## 7. **What are the two types of API functions in Node.js?**

The two types of API functions in Node.js are:

- Asynchronous, non-blocking functions  
- Synchronous, blocking functions  

---

## 8. **What is a control flow function?**

A control flow function is a generic piece of code that runs between several asynchronous function calls.

---

## 9. **Explain the steps of how “Control Flow” controls the function calls?**

1. Control the order of execution  
2. Collect data  
3. Limit concurrency  
4. Call the next step in the program  

---

## 10. **Why is Node.js single-threaded?**

Node.js was created for asynchronous processing as an experiment. It is designed to achieve better performance and scalability under typical web loads by doing async processing on a single thread, compared to a traditional thread-based implementation.

---

## 11. **Does Node.js run on Windows?**

Yes, it does. You can download the MSI installer from [Node.js Downloads](https://nodejs.org/download/).

---

## 12. **Can you access the DOM in Node.js?**

No, you cannot access the DOM in Node.js.

---

## 13. **Using the event loop, what tasks should be done asynchronously?**

The following tasks should be done asynchronously using the event loop:

- I/O operations  
- Heavy computation  
- Anything requiring blocking  

---

## 14. **Why is Node.js quickly gaining attention from Java programmers?**

Node.js is gaining attention because it is a loop-based server for JavaScript. It allows users to write JavaScript on the server, providing access to features like the HTTP stack, file I/O, TCP, and databases.
