// Tạo class Main để thực hiện menu
class MainClass
{
    // Danh sách employees để lưu trữ các nhân viên
    static List<Employee> employees = new List<Employee>();
    // Danh sách customers để lưu trữ các khách hàng
    static List<Customer> customers = new List<Customer>();

    static void Main(string[] args)
    {
        bool running = true;
        while (running)
        {
            // Hiển thị menu
            Console.WriteLine("\nCustomer and Employee Management System");
            Console.WriteLine("1. Add employee");
            Console.WriteLine("2. Add customer");
            Console.WriteLine("3. Find employee with highest salary");
            Console.WriteLine("4. Find customer with lowest balance");
            Console.WriteLine("5. Find employee by name");
            Console.WriteLine("6. Exit");
            Console.Write("Enter your choice: ");

            // Nhận lựa chọn từ người dùng
            int choice = Convert.ToInt32(Console.ReadLine());

            // Xử lý lựa chọn của người dùng
            switch (choice)
            {
                case 1:
                    AddEmployee();
                    break;
                case 2:
                    AddCustomer();
                    break;
                case 3:
                    FindHighestSalaryEmployee();
                    break;
                case 4:
                    FindLowestBalanceCustomer();
                    break;
                case 5:
                    FindEmployeeByName();
                    break;
                case 6:
                    running = false;
                    break;
                default:
                    Console.WriteLine("Invalid choice.");
                    break;
            }
        }
    }

    // Phương thức để thêm nhân viên mới vào danh sách
    static void AddEmployee()
    {
        Console.Write("Enter employee name: ");
        string name = Console.ReadLine();

        try
        {
            Console.Write("Enter employee salary: ");
            double salary = Convert.ToDouble(Console.ReadLine());

            employees.Add(new Employee(name, salary));
            Console.WriteLine("Employee added successfully!");
        }
        catch (FormatException)
        {
            // Xử lý lỗi nếu người dùng nhập sai định dạng
            Console.WriteLine("Invalid input format. Please enter a number for salary.");
        }
    }

    // Phương thức để thêm khách hàng mới vào danh sách
    static void AddCustomer()
    {
        Console.Write("Enter customer name: ");
        string name = Console.ReadLine();

        try
        {
            Console.Write("Enter customer balance: ");
            double balance = Convert.ToDouble(Console.ReadLine());

            customers.Add(new Customer(name, balance));
            Console.WriteLine("Customer added successfully!");
        }
        catch (FormatException)
        {
            // Xử lý lỗi nếu người dùng nhập sai định dạng
            Console.WriteLine("Invalid input format. Please enter a number for balance.");
        }
    }

    // Phương thức để tìm nhân viên có lương cao nhất
    static void FindHighestSalaryEmployee()
    {
        Employee highestSalaryEmployee = null;

        // Duyệt qua danh sách nhân viên
        foreach (Employee employee in employees)
        {
            // Nếu nhân viên hiện tại có lương cao hơn nhân viên có lương cao nhất hiện tại
            if (highestSalaryEmployee == null || employee.Salary > highestSalaryEmployee.Salary)
            {
                // Cập nhật nhân viên có lương cao nhất
                highestSalaryEmployee = employee;
            }
        }

        // Hiển thị nhân viên có lương cao nhất
        if (highestSalaryEmployee != null)
        {
            highestSalaryEmployee.Display();
        }
    }

    // Phương thức để tìm khách hàng có số dư nhỏ nhất
    static void FindLowestBalanceCustomer()
    {
        Customer lowestBalanceCustomer = null;

        // Duyệt qua danh sách khách hàng
        foreach (Customer customer in customers)
        {
            // Nếu khách hàng hiện tại có số dư nhỏ hơn khách hàng có số dư nhỏ nhất hiện tại
            if (lowestBalanceCustomer == null || customer.Balance < lowestBalanceCustomer.Balance)
            {
                // Cập nhật khách hàng có số dư nhỏ nhất
                lowestBalanceCustomer = customer;
            }
        }

        // Hiển thị khách hàng có số dư nhỏ nhất
        if (lowestBalanceCustomer != null)
        {
            lowestBalanceCustomer.Display();
        }
    }

    // Phương thức để tìm nhân viên theo tên
    static void FindEmployeeByName()
    {
        Console.Write("Enter employee name to search: ");
        string nameToSearch = Console.ReadLine();

        // Duyệt qua danh sách nhân viên
        foreach (Employee employee in employees)
        {
            // Nếu tìm thấy nhân viên có tên trùng khớp
            if (employee.Name == nameToSearch)
            {
                employee.Display();
            }
        }
    }
}