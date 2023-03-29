csv = open("E:/dataset/celeba/list_attr_celeba.csv", "r+")
sql = open("./insert_celeba.sql", "w+")
for idx, i in enumerate(csv):
    i = str.split(i, "\n")[0]
#     print(i)
    if idx ==1:
        ll = str.split(i, ",")
#         print(ll)
        search = ["image_id", "Male", "Young", "Smiling"]
        search_index = []
        for idxx, x in enumerate(search):
            for idx1, ii in enumerate(ll):
                if x == ii:
                    search_index.append(int(idx1))
                    break
    if idx >= 2:
        ll = str.split(i, ",")
#         print(search_index)
        sql.write(f"insert into celeba (id, pname, url, gender, age, smile) values ({int(str.split(ll[search_index[0]], '.')[0])},'{ll[search_index[0]]}','{'celeba/img_align_celeba_png/'+ll[search_index[0]]}',{int(ll[search_index[1]])},{int(ll[search_index[2]])},{int(ll[search_index[3]])});\n")
#         break
csv.close()
sql.close()