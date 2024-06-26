## **ДЗ №2**

### ***Реализовать паттерн Компоновщик***

#### Необходимо:

1. Создать свой Java Maven проект;
2. Самостоятельно реализовать прикладную задачу;
3. Запушить проект в GIT и прислать ссылку

##### **Компоновщик**  — это структурный паттерн проектирования, который позволяет сгруппировать множество объектов в древовидную структуру, а затем работать с ней так, как будто это единичный объект.

###### *Преимущества* 
* Упрощает архитектуру клиента при работе со сложным деревом компонентов
* Облегчает добавление новых видов компонентов

###### *Недостатки*
* Создаёт слишком общий дизайн классов

###### Шаги реализации
* Убедитесь, что вашу бизнес-логику можно представить как древовидную структуру. Попытайтесь разбить её на простые компоненты и контейнеры. Помните, что контейнеры могут содержать как простые компоненты, так и другие вложенные контейнеры.

* Создайте общий интерфейс компонентов, который объединит операции контейнеров и простых компонентов дерева. Интерфейс будет удачным, если вы сможете использовать его, чтобы взаимозаменять простые и составные компоненты без потери смысла.

* Создайте класс компонентов-листьев, не имеющих дальнейших ответвлений. Имейте в виду, что программа может содержать несколько таких классов.

* Создайте класс компонентов-контейнеров и добавьте в него массив для хранения ссылок на вложенные компоненты. Этот массив должен быть способен содержать как простые, так и составные компоненты, поэтому убедитесь, что он объявлен с типом интерфейса компонентов.

* Реализуйте в контейнере методы интерфейса компонентов, помня о том, что контейнеры должны делегировать основную работу своим дочерним компонентам.

* Добавьте операции добавления и удаления дочерних компонентов в класс контейнеров.

* Имейте в виду, что методы добавления/удаления дочерних компонентов можно поместить и в интерфейс компонентов. Да, это нарушит принцип разделения интерфейса, так как реализации методов будут пустыми в компонентах-листьях. Но зато все компоненты дерева станут действительно одинаковыми для клиента.

