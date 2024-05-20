using System;
using System.Collections.Generic;

// Cài đặt lớp trừu tượng Person
// Lớp abstract chứa thuộc tính chung của Person là Name và phương thức trừu tượng Display()
public abstract class Person
{
    // Thuộc tính Name của Person
    public string Name { get; set; }

    // Constructor của lớp Person
    public Person(string name)
    {
        Name = name;
    }

    // Phương thức trừu tượng Display() để các lớp con implement
    public abstract void Display();
}

// Cài đặt lớp Employee kế thừa từ Person
public class Employee : Person
{
    // Thuộc tính Salary của Employee
    public double Salary { get; set; }

    // Constructor của lớp Employee
    public Employee(string name, double salary) : base(name)
    {
        Salary = salary;
    }

    // Override phương thức Display() để hiển thị thông tin nhân viên
    public override void Display()
    {
        Console.WriteLine($"Employee: Name = {Name}, Salary = {Salary}");
    }
}

// Cài đặt lớp Customer kế thừa từ Person
public class Customer : Person
{
    // Thuộc tính Balance của Customer
    public double Balance { get; set; }

    // Constructor của lớp Customer
    public Customer(string name, double balance) : base(name)
    {
        Balance = balance;
    }

    // Override phương thức Display() để hiển thị thông tin khách hàng
    public override void Display()
    {
        Console.WriteLine($"Customer: Name = {Name}, Balance = {Balance}");
    }
}