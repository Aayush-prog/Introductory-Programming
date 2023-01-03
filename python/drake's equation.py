def drake():
    print('''Welcome to the SETI program
This program will allow you to enter specific values related to
the likelihood of finding intelligent life in our galaxy. All
percentages should be entered as integer values, e.g., 40 and not .40''')
    r=7
    p=int(input("Percentage of stars?"))
    n=int(input("average number of planets that can support life?"))
    f=int(input("percentage that go on to develop life?"))
    i=int(input("percentage that go on to develop intelligent life?"))
    c=int(input("percentage of those willing and able to sommunicate?"))
    l=int(input("expected lifetime of civilizations?"))
    d=r*p*n*f*i*c*l
    print("The drakes equation is {0}".format(d))

drake()
      

    
