a =[1,2,3]
target=3
# # if (len(a)-len(set(a)))!=0:
# #     print (True)
# # else:
# #     print (False)
# # print(a)
# # b=list(set(a))
# # print(b)
# dict={}

# for i in range(0,len(a)):
#     count=0
#     temp=a[i]
#     for j in range(0,len(a)):
#         if(temp==a[j]):
#             count= count+1
#             print(temp,a[j],count)
#        dict[a[j]]=count
# print(dict)
        


#         #      count= count+1
#         # print(temp,count)
    
    








dictionary = {}

for i in range(0,len(a)):
    dictionary[i]=a[i]
    if(target-a[i] in a):
        print()
        
    
    
    



# for elem in a:
#     if elem not in dictionary:
#         dictionary[elem] = elem
#     else:
#         temp = dictionary[elem]
#         temp +=1
#         dictionary[elem] = temp
#         print(elem) 

# print(dictionary)