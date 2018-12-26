object Account extends App {

  var b1 = new BankAccount("Julian Dragoi", 50.00)
  var b2 = new BankAccount("Jules Drago", 500.00, 's')
  List(b1,b2).foreach(println)
}
class BankAccount(name: String, balance:Double, typeOfAcct:Char = 'c') {
  var accountNumber = BankAccount.nextAcctNum
  override def toString = "Client Name: " + name + "\nBalance £" + balance +
    (if(typeOfAcct == 'c') "\nCurrent Account " else "\nSavings") + "\nAccount Number: " + accountNumber + "\n" + "*"*30
}
object BankAccount {
  var accountNum = 5000
  def nextAcctNum() = { accountNum += 1
    accountNum
  }
}
