<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module.pkg006;

/**
 *
 * @author Oliver
 */
public class CustomerDatabase
{
    Customer[] customers = new Customer[999];

    public CustomerDatabase()
    {
    }
    
    public void createCustomer(Customer c)
    {
        customers[c.id] = c;
    }
    
    public void removeCustomer(int id)
    {
        customers[id] = null;
    }
    
    public Customer getCustomer(int id)
    {
        return customers[id];
    }
    
    public void printCustomers()
    {
        for(Customer c : customers)
        {
            if (c != null)
            {
                System.out.println(c.name+" with id: '"+c.id+"' has a balance of: $"+c.balance);
            }
        }
    }
}
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module.pkg006;

/**
 *
 * @author Oliver
 */
public class CustomerDatabase
{
    Customer[] customers = new Customer[999];

    public CustomerDatabase()
    {
    }
    
    public void createCustomer(Customer c)
    {
        customers[c.id] = c;
    }
    
    public void removeCustomer(int id)
    {
        customers[id] = null;
    }
    
    public Customer getCustomer(int id)
    {
        return customers[id];
    }
    
    public void printCustomers()
    {
        for(Customer c : customers)
        {
            if (c != null)
            {
                System.out.println(c.name+" with id: '"+c.id+"' has a balance of: $"+c.balance);
            }
        }
    }
}
>>>>>>> 9b72830ca118e8fc0624f19a0fd1c73d8ad84584
