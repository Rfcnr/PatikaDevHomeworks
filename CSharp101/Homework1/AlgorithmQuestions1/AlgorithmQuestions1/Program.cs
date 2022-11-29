using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AlgorithmQuestions1
{
    internal class Program
    {
        static void Main(string[] args)
        {
            /*
                In a console application, ask the user to enter a positive number(n).
                Then ask the user to enter n positive numbers.
                Print the even numbers that the user has entered into the console.
            */

            int n;

            Console.WriteLine("Write how many numbers you want to enter: ");
            n = Int32.Parse(Console.ReadLine());

            int[] arr = new int[n];

            for (int i = 0; i < arr.Length; i++)
            {
                Console.WriteLine("Please enter the number: ");

                arr[i] = Int32.Parse(Console.ReadLine());
            }

            Console.WriteLine("****************\nEven numbers from the numbers you entered.");
            for (int i = 0; i < arr.Length; i++)
            {
                if (arr[i] % 2 == 0) Console.WriteLine(arr[i]);
            }


            Console.ReadLine();
        }
    }
}
