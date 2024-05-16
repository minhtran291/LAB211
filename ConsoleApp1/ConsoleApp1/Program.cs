// See https://aka.ms/new-console-template for more information
using System;
namespace Processing_Command_Line_Arguments
{
    class Program
    {
        static void Main(string[] args)
        {
            String msg = "***** Welcome to C# .NET Programming *****";
            Console.WriteLine("{0}", msg);
            
            for(int i = 0; i < args.Length; i++) {
                Console.WriteLine($"Arg: {args[i]}");
            }
            //Console.ReadLine();
        }
    }
}

