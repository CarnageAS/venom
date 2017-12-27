from flask import Flask, redirect, render_template, request, url_for, session
import time


app = Flask(__name__)

# Secret key for sessions
app.secret_key = "secret"


@app.route("/", methods=['GET', 'POST'])

def bankprocessing():
	
	try:
		balance = session["balance"]
		count = session["count"]
	except KeyError:
		count = session["count"] = 0
		balance = session["balance"] = 8000
	

	if request.method == "GET":
		return render_template("bankprac.html",balance=balance,msg="")
	
	if request.method == "POST":
		if session["count"] == 5:
			msg = "5 TRANSACTIONS COMPLETED"
			transactioncount=count
			session.clear();
			return render_template("bankprac.html",balance=balance,msg=msg,transactioncount=transactioncount)
		
		if request.form["action"]== "WITHDRAW" :
				
			if int(request.form["amount"]) > session["balance"] :
				msg="INSUFFICIENT FUNDS"
				return render_template("bankprac.html",balance=balance,msg=msg)
			
			else:
				balance = balance - int(request.form["amount"])
				session["balance"] = balance
				session["count"] = session["count"] + 1
				msg = "MONEY WITHDRAWN"
				transactioncount=count
				return render_template("bankprac.html",msg=msg,balance=balance,transactioncount=transactioncount)
				
		elif request.form["action"]== "DEPOSIT" :
			balance = balance + int(request.form["amount"])
			session["balance"] = balance
			session["count"] - session["count"] + 1
			transactioncount = count
			msg = "MONEY DEPOSITED"
			return render_template("bankprac.html",msg=msg,balance=balance,transactioncount=transactioncount)
		
		
if __name__ == '__main__':
	app.run()
