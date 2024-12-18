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
## 15. **What are the two arguments that `async.queue` takes?**

The two arguments that `async.queue` takes are:

- Task function  
- Concurrency value  

---

## 16. **What is an event loop in Node.js?**

An event loop in Node.js is used to process and handle external events and convert them into callback invocations. During I/O calls, Node.js switches from one request to another, ensuring non-blocking operations.

---

## 17. **Mention the steps to achieve async in Node.js?**

You can achieve async in Node.js through the following steps:

- First-class functions  
- Function composition  
- Callback counters  
- Event loops  

---

## 18. **What are the pros and cons of Node.js?**

### **Pros:**

- If your application doesn’t involve CPU-intensive computation, you can build it entirely in JavaScript, even down to the database level using JSON storage object databases like MongoDB.  
- Crawlers receive a full-rendered HTML response, which is more SEO-friendly compared to single-page applications or websockets apps running on Node.js.  

### **Cons:**

- CPU-intensive computation can block Node.js responsiveness; a threaded platform might be a better choice.  
- Using a relational database with Node.js is less favorable.  

---

## 19. **How does Node.js overcome the problem of blocking I/O operations?**

Node.js solves this problem by utilizing an event-driven model at its core. It uses an event loop instead of threads to handle I/O operations, ensuring non-blocking execution.

---

## 20. **What is the difference between Node.js and Ajax?**

- **Ajax**: A client-side technology used for updating the contents of a webpage without refreshing it.  
- **Node.js**: A server-side JavaScript environment used for building server software. It does not execute in the browser but runs on the server.  

---

## 21. **What are the challenges with Node.js?**

On the technical side, it is challenging in Node.js to scale up a single-threaded process across multi-core servers efficiently.  

---

## 22. **What does “non-blocking” mean in Node.js?**

In Node.js, "non-blocking" refers to its I/O operations being non-blocking. Node.js uses "libuv" to handle I/O operations in a platform-agnostic manner.  

- On Windows: It uses completion ports.  
- On Unix: It uses epoll or kqueue.  

Non-blocking requests are queued in the event loop, which calls the JavaScript callback on the main JavaScript thread when the request is complete.  

---
Here is the entire content for your `.md` file, formatted appropriately within the code block:

## 23) What is the command that is used in Node.js to import external libraries?

The command `require` is used to import external libraries in Node.js. For example:

```javascript
var http = require("http");
```

This will load the `http` library and assign the exported object to the `http` variable.

---

## 24) Mention the framework most commonly used in Node.js.

The most commonly used framework in Node.js is **Express**. It is a minimal and flexible Node.js web application framework that provides a robust set of features to build web and mobile applications.

---

## 25) What is a "Callback" in Node.js?

A **callback function** is used in Node.js to handle multiple requests made to the server. For example, if you have a large file that takes time for the server to read, you can use a callback function to allow the server to handle other requests while the file is being processed. The callback function is executed once the task is completed, making Node.js asynchronous and non-blocking.

---

## Beginner Node.js Interview Questions

### 1. What is Node.js? Where can you use it?

Node.js is an open-source, cross-platform JavaScript runtime environment used to run web applications outside the client’s browser. It is primarily used to create server-side web applications. Node.js is perfect for building data-intensive, real-time applications due to its asynchronous, event-driven architecture.

Some use cases include:
- Real-time web applications
- Network applications
- General-purpose applications
- Distributed systems

### 2. Why use Node.js?

Node.js offers several advantages:
- **Fast performance**: Due to its non-blocking nature.
- **Non-blocking I/O**: Rarely blocks the execution thread.
- **Unified language**: JavaScript for both client-side and server-side code.
- **Asynchronous**: Everything is handled asynchronously, making it scalable.
- **Great concurrency**: Excellent at handling multiple simultaneous connections.

### 3. How does Node.js work?

Node.js operates through the following flow:
1. Clients send requests to the webserver to interact with the application (e.g., query data, delete data, update data).
2. The requests are added to the **Event Queue**.
3. The **Event Loop** processes the requests, handling non-blocking operations first.
4. If a request is simple (non-blocking), it is processed immediately.
5. For complex (blocking) requests, a thread from the **Thread Pool** is assigned to handle the task (e.g., interacting with external resources like a database or file system).
6. Once the task is completed, the response is sent back to the Event Loop and returned to the client.

### 4. Why is Node.js Single-threaded?

Node.js is single-threaded for asynchronous processing. Instead of using multiple threads (like traditional server frameworks), Node.js processes tasks on a single thread, improving performance and scalability, especially under high-load conditions.

### 5. Explain callback in Node.js.

A **callback** is a function that is passed into another function and executed after a task is completed. It allows Node.js to perform asynchronous operations without blocking the event loop. Callbacks help prevent delays in the execution of other requests by allowing other code to run in the meantime.

Node.js APIs are built around callbacks to ensure non-blocking behavior.

### 6. How would you define the term I/O?

**I/O (Input/Output)** refers to any operation or device that transfers data from one medium to another. It includes:
- **Input**: Receiving data from a source (e.g., keyboard, file system, network).
- **Output**: Sending data to a destination (e.g., monitor, file system, network).

In Node.js, I/O operations are typically asynchronous to ensure that other processes can continue while waiting for the I/O operation to complete.

---

## 7) How is Node.js most frequently used?

Node.js is widely used in the following applications:

1. Real-time chats
2. Internet of Things (IoT)
3. Complex SPAs (Single-Page Applications)
4. Real-time collaboration tools
5. Streaming applications
6. Microservices architecture

---

## 8) Explain the difference between frontend and backend development?

| Frontend                             | Backend                             |
|--------------------------------------|-------------------------------------|
| Refers to the client-side of an application | Refers to the server-side of an application |
| It is the part of a web application that users can see and interact with | Constitutes everything that happens behind the scenes |
| It typically includes everything related to the visual aspects of a web application | Generally includes a web server that communicates with a database to serve requests |
| Technologies: HTML, CSS, JavaScript, AngularJS, ReactJS | Technologies: Java, PHP, Python, Node.js |

---

## 9) What is NPM?

**NPM** stands for **Node Package Manager**. It is responsible for managing all the packages and modules for Node.js. NPM provides two main functionalities:

1. **Online Repositories**: It offers online repositories for Node.js packages/modules, searchable on [search.nodejs.org](https://search.nodejs.org).
2. **Command-line Utility**: It provides a command-line utility to install Node.js packages, as well as manage Node.js versions and dependencies.

---

## 10) What are the modules in Node.js?

**Modules** in Node.js are like JavaScript libraries that can be used in a Node.js application to include a set of functions. To include a module, use the `require()` function with the module's name.

Some of the core modules in Node.js are:

| Core Modules   | Description                                                  |
|----------------|--------------------------------------------------------------|
| `HTTP`         | Includes classes, methods, and events to create an HTTP server |
| `util`         | Includes utility functions useful for developers              |
| `fs` (File System) | Includes events, classes, and methods for file I/O operations  |
| `url`          | Includes methods for URL parsing and query string handling    |

---

## 11) Why is Node.js preferred over other backend technologies like Java and PHP?

Some reasons why Node.js is preferred include:

- **Speed**: Node.js is very fast due to its non-blocking, event-driven architecture.
- **Node Package Manager (NPM)**: It has over 50,000 packages available for developers.
- **Real-time Web Applications**: Perfect for data-intensive, real-time web applications since Node.js never waits for an API to return data.
- **Code Synchronization**: Node.js allows better synchronization of code between server and client due to using the same language (JavaScript) on both ends.
- **Ease of Use**: JavaScript is a widely-used language, making it easier for web developers to start using Node.js in their projects.

---

## 12) What is the package.json file?

The **`package.json`** file is the heart of a Node.js application. It holds all the metadata for a specific project, such as dependencies, scripts, and other configuration settings. The `package.json` file is found in the root directory of any Node.js application or module.

---

## 13) What is REPL in Node.js?

**REPL** stands for **Read-Eval-Print Loop**. It represents an interactive computer environment where commands are entered, evaluated, and the results are printed. It is similar to a console or shell (e.g., Windows command prompt or Unix/Linux shell), providing a quick way to experiment with JavaScript code in a Node.js environment.

---
Here’s the clean and formatted content for your `.md` file:

# React Questions and Answers

## 1) What is React?

React is a front-end, open-source JavaScript library used for developing user interfaces, particularly for single-page applications. It is highly useful in building complex and reusable UI components for mobile and web applications, as it follows a component-based approach.

### Key Features of React:
- Supports **server-side rendering**.
- Uses **virtual DOM** instead of real DOM, as real DOM manipulations are expensive.
- Follows **unidirectional data flow**.
- Uses **reusable/composable UI components** for building views.

---

## 2) What is `useState()` in React?

`useState()` is a built-in React Hook that allows you to have state variables in functional components. It is used when the DOM needs dynamic manipulation or control.

---

## 3) What are keys in React?

A **key** is a special string attribute that must be included when rendering lists of elements.

### Example of a list using a key:

```javascript
const ids = [1, 2, 3, 4, 5];
const listElements = ids.map((id) => {
  return (
    <li key={id.toString()}>
      {id}
    </li>
  );
});
```

### Importance of keys:
- Helps React identify which elements were added, changed, or removed.
- Keys provide a unique identity for each element.
- React relies on keys to track the order and uniqueness of elements.
- Keys are commonly used for displaying lists of data coming from an API.

---

## 4) What is JSX?

**JSX** stands for JavaScript XML. It allows you to write HTML-like syntax inside JavaScript and place it directly in the DOM without using functions like `appendChild()` or `createElement()`.

> **Note**: You can create React applications without JSX as well.

### How JSX works:
Without JSX:
```javascript
const text = React.createElement('p', {}, 'This is a text');
const container = React.createElement('div', {}, text);
ReactDOM.render(container, rootElement);
```

With JSX:
```javascript
const container = (
  <div>
    <p>This is a text</p>
  </div>
);
ReactDOM.render(container, rootElement);
```

JSX allows you to directly embed HTML inside JavaScript.

---

## 5) What are the differences between functional and class components?

Before the introduction of Hooks, **functional components** were considered stateless, while **class components** were stateful. After Hooks, functional components became equivalent to class components.

### Functional Components:
Functional components are just JavaScript functions, and they can be declared using either the `function` keyword or an arrow function.

Example:
```javascript
function Card(props) {
  return (
    <div className="main-container">
      <h2>Title of the card</h2>
    </div>
  );
}

const Card = (props) => {
  return (
    <div className="main-container">
      <h2>Title of the card</h2>
    </div>
  );
};
```

### Class Components:
Class components are declared using ES6 classes and extend `React.Component`.

Example:
```javascript
class Card extends React.Component {
  constructor(props) {
    super(props);
  }
  
  render() {
    return (
      <div className="main-container">
        <h2>Title of the card</h2>
      </div>
    );
  }
}
```

### Handling Props:
In functional components, props are passed directly to the function:

```javascript
function StudentInfo(props) {
  return (
    <div className="main">
      <h2>{props.name}</h2>
      <h4>{props.rollNumber}</h4>
    </div>
  );
}
```

In class components, props are accessed using `this.props`:

```javascript
class StudentInfo extends React.Component {
  render() {
    return (
      <div className="main">
        <h2>{this.props.name}</h2>
        <h4>{this.props.rollNumber}</h4>
      </div>
    );
  }
}
```

### Handling State:
Functional components use **React Hooks** (`useState`) to handle state:

```javascript
function ClassRoom(props) {
  let [studentsCount, setStudentsCount] = useState(0);

  const addStudent = () => {
    setStudentsCount(++studentsCount);
  };

  return (
    <div>
      <p>Number of students in the classroom: {studentsCount}</p>
      <button onClick={addStudent}>Add Student</button>
    </div>
  );
}
```

Class components use `this.state` to manage state:

```javascript
class ClassRoom extends React.Component {
  constructor(props) {
    super(props);
    this.state = { studentsCount: 0 };
    this.addStudent = this.addStudent.bind(this);
  }

  addStudent() {
    this.setState((prevState) => {
      return { studentsCount: prevState.studentsCount + 1 };
    });
  }

  render() {
    return (
      <div>
        <p>Number of students in the classroom: {this.state.studentsCount}</p>
        <button onClick={this.addStudent}>Add Student</button>
      </div>
    );
  }
}
```

---

## 6) What is the use of `useEffect` React Hook?

The `useEffect` React Hook is used to perform side effects in functional components. It allows you to inform React that your component requires some operations to be performed after rendering or after a state change.

### Syntax:
```javascript
useEffect(callback, [dependencies]);
```

- **callback**: The function containing the logic for the side effect.
- **dependencies**: An optional array of dependencies that determines when the `useEffect` hook should run.

### Example:
```javascript
import { useEffect } from 'react';

function WelcomeGreetings({ name }) {
  const msg = `Hi, ${name}!`;  // Calculates output

  useEffect(() => {
    document.title = `Welcome to you, ${name}`;  // Side effect!
  }, [name]);

  return <div>{msg}</div>;  // Calculates output
}
```

In this example, `document.title` is updated after the component renders, which is considered a side effect. The `useEffect` hook ensures that the effect runs after changes to the `name` prop.

Consider you don’t want to execute the document title update each time on rendering of `WelcomeGreetings` component, and you want it to be executed only when the `name` prop changes. In that case, you need to supply `name` as a dependency to `useEffect(callback, [name])`.

---

## 8) Explain React Hooks.

### What are Hooks?
**Hooks** are functions that allow us to "hook into" React state and lifecycle features from a **functional component**.

- React Hooks **cannot** be used in class components.
- Hooks allow you to write components without the need for a class.

### Why were Hooks introduced in React?
React hooks were introduced in **React 16.8**. Before hooks, functional components were considered **stateless components**, and only class components were capable of handling state management and lifecycle methods. The introduction of hooks was to avoid the need to convert a functional component to a class component just to use state or lifecycle methods.

---

### Example of a Hook: `useState` Hook

In functional components, the `useState` hook lets us define a state for a component:

```javascript
function Person(props) {
  // We are declaring a state variable called 'name'.
  // setName is a function to update/change the value of 'name'.
  let [name, setName] = useState('');
}
```

In the code above, the state variable **`name`** can be directly used inside the component's JSX.

---

## 9) What are the rules that must be followed while using React Hooks?

There are two key rules that you must follow when working with React Hooks:

1. **React Hooks must be called only at the top level.**  
   They cannot be called inside nested functions, loops, or conditionals.

2. **Hooks can only be called from React Function Components.**  
   This ensures that hooks are used only within components that are written as functions and not class components.

By adhering to these rules, React guarantees that hooks behave predictably and maintain the integrity of the component lifecycle.

---



