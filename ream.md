# Welcome to Java World

### Check java version, Compile & Run Java code
```bash
:$ java -version
:$ javac HelloWorl.java
:$ java HelloWorl
```

*  Code format:  Sft + Opt + F 

## Download
* VS Code: https://code.visualstudio.com/download
SE Java: https://www.oracle.com/technetwork/java/javase/downloads/index.html
* Debugger for Java: https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-debug
```
ext install vscode-java-debug
```
### Hello World Code
```Java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
  }
```


### Use
* Launch VS Code
* Open a Java project (Maven/Gradle/Eclipse)
* Open a Java file to activate the extensions
* Add debug configurations and edit launch.json
* To launch: specify mainClass
* To attach: specify hostName and port
* Press F5


| Modifier | Description  | Notes  |
| :-: | :-: | :-: |
| public | When set to public, the given Class will be accessible to all the classes available in the Java world. |  |
| default | When set to default, the given Class will be accessible to the classes which are defined in the same package. |  |
| Protected | f a variable is set to protected inside a Class, it will be accessible from its subclasses defined in the same or different package only via Inheritance. |  |
| Private | A variable defined private will be accessible only from within the Class in which it is defined. Such variables are not accessible from outside the defined Class, not even in its subclass. |  |




## Java Access Modifiers Table for Variable
* Visibility	Public Access Modifier	Private Access Modifier	Protected Access Modifier	Default Access Modifier
* Within Same Class	Yes	Yes	Yes	Yes
From Any Class in Same Package	Yes	No	Yes	Yes
* From Any Sub Class in Same Package	Yes	No	Yes	Yes
* From Any Sub Class from Different Package	Yes	No	Yes(Only By Inheritance)	No
* From Any Non-Sub Class in Different Package	Yes	No	No	No



## Java Inheritance (Subclass and Superclass)
* superclass (parent) - the class being inherited from
* subclass (child) - the class that inherits from another class



