package com.xoriant.assignment1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

import com.xoriant.assignment3.User;

public class TestMain
{

	public static void main(String[] args) 
	{
		
		Account a1= new Account("Rahul", "Kumar", 45678, LocalDate.of(2021, 01, 22), true, 25000, "male");
		Account a2= new Account("Dilip", "Kumar", 45698, LocalDate.of(2020, 04, 12), true, 5000, "male");
		Account a3= new Account("Preethi", "j", 85678, LocalDate.of(2021, 03, 24), true, 20000, "female");
		Account a4= new Account("Lalitha", "s", 67678, LocalDate.of(2019, 03, 27), true, 15000, "female");
		Account a5= new Account("Akshay", "Kumar", 56778, LocalDate.of(2020, 05, 21), false, 15000, "male");
		Account a6= new Account("Dhanush", "Kumar", 54478, LocalDate.of(2021, 05, 14), true, 4500, "male");
		Account a7= new Account("Satish", "Kumar",35678, LocalDate.of(2010, 02, 03), false, 10000, "male");
		Account a8= new Account("Abc", "Kumar",956781, LocalDate.of(2019, 12, 26), false, 8000, "male");
		
		List<Account> list= new ArrayList<Account>();
		list.add(a1);
		list.add(a2);
		list.add(a3);
		list.add(a4);
		list.add(a5);
		list.add(a6);
		list.add(a7);
		list.add(a8);
		
		//creating user
		User user=new User();
		user.setName("Dilip Kumar");
		user.setCreatedDate(LocalDateTime.now());
		
		System.out.println("----------------------------------------------------------");
		
		////Find all the accounts whose balance is more than 5000
		System.out.println("List of account having balance > 5000 :\n");
		List<Account> list1=list.stream().filter(balance -> balance.getBalance()>5000).collect(Collectors.toList());
		list1.forEach(System.out::println);
		
		//Find all the accounts whose balance is more than 10000/-and first name starts with A.
		System.out.println("-----------------------------------------------------------");
		System.out.println(" List of accounts whose balance is more than 10000/- and first name starts with A:\n");
		List<Account> list2=list.stream().filter(balance -> balance.getBalance()>10000).filter(b -> b.getFirstName().startsWith("A")).collect(Collectors.toList());
		list2.forEach(System.out::println);
		
		
		//Find the account number of all the account holders whose gender is male
		System.out.println("-----------------------------------------------------------");
		System.out.println("List of accounts of all the account holders whose gender is male :\n");
		List<Account> list3=list.stream().filter(b -> b.getGender().equalsIgnoreCase("male")).collect(Collectors.toList());
		for(Account acc:list3)
		{
			System.out.println(acc.getFirstName()+" -- "+acc.getGender());
		}
		

		//Find all the accounts whoseaccount is active, balance is more than 3000/-and year of opening is 2021
		System.out.println("-----------------------------------------------------------");
		System.out.println("All the accounts whoseaccount is active, balance is more than 3000/-and year of opening is 2021 :\n");
        List<Account> list4=list.stream().filter(b->b.isActive() && b.getBalance()>15000 && b.getDateOpened().getYear() == 2021).collect(Collectors.toList());
        for(Account acc:list4)
		{
			System.out.println(acc);
		}
		
		
		
    	//Find the sum of total balance for all the accounts
		System.out.println("-----------------------------------------------------------");
		System.out.println("Find the sum of total balance for all the accounts :\n");
		Double sumOfAmount=list.stream().collect(Collectors.summingDouble(Account::getBalance));
		System.out.println(sumOfAmount);
		
		
		//Find the number of accounts barring the first two
		System.out.println("-----------------------------------------------------------");
		System.out.println("number of accounts barring the first two :\n");
		List<Account> list5=list.stream().skip(2).collect(Collectors.toList());
		System.out.println(list5);
		
		
		
		
//		Stream<Object> accNum=list.stream().map(b->String.valueOf(b.getAccountNumber()));
//		System.out.println(accNum);
		
		
		
		//Find all the account holder first name is upper case
		System.out.println("-----------------------------------------------------------");
		//List<Account> l1=list.stream().map(e-> {e.setFirstName(e.getFirstName().toUpperCase());return e;}).collect(Collectors.toList());
		list.stream().filter(u -> Character.isUpperCase(u.getFirstName().charAt(0))).map(Account::getAccountNumber)
		.forEach(System.out::println);
	
		// Find the account numbers in a string format as : [1001, 1002, 1003]
		System.out.println("-----------------------------------------------------------");
		Stream<Object> accoutNumbers = list.stream().map(acc -> acc.getAccountNumber());
		Object[] accNoArray = accoutNumbers.toArray();
		String accNos = Arrays.stream(accNoArray).map(l -> ((Integer) l).toString()).collect(Collectors.joining(","));
		System.out.println("Account numbers in a string format :\n" + accNos);
		
		
		 // Find the accounts in the form of Map where all the accounts which has the same balance needs to be mapped with balance.
		System.out.println("-----------------------------------------------------------");
		Map<Double, List<Account>> result = list.stream().collect(Collectors.groupingBy(Account::getBalance));
		System.out.println("Account with same balance mapped :" + result);

		
		
		 // Find the accounts in the form of a Map where all the accounts should be segregated according to the condition balance>10000. 
		  //Those which meet the condition and those which has not meet the condition. Example: Map<Boolean,List<Account>>
		System.out.println("-----------------------------------------------------------");
		Map<Boolean, List<Account>> partition = list.stream()
				.collect(Collectors.partitioningBy(acc -> acc.getBalance() > 10000));
		List<Account> accLists = partition.get(true);
		System.out.println(accLists);
		
		
		
		
		
		
		
	//------------------------------------------User Password Expirty------------------------------------------
		System.out.println("-----------------------------------------------------------");
		LocalDateTime date = LocalDateTime.now().plusDays(33);
		user.setExpiryDate(date);
		System.out.println("Password Created Date: "+user.getCreatedDate()+" Password expiry date: "+user.getExpiryDate());
		
		
		
		
		
		
		
		
		
		
	}
}
