import pymysql
import os
import traceback
import base64


def write_pic2mysql(path, config):
    """
    读取图片写入数据库
    :param path: 读取的图片的路径
    :param config: 数据库连接配置信息
    :return: None
    """
    filename = path.split('\\')[-1]
    label = int(path.split('\\')[-2])

    try:
        with open(path, 'rb') as f:
            img = base64.b64encode(f.read())
    except:
        print('读取失败')
        # sys.exit(1)
        return
    try:
        conn = pymysql.connect(host=config['host'],
                               port=config['port'],
                               user=config['user'],
                               passwd=config['password'],
                               db=config['db'],
                               charset='utf8',
                               use_unicode=True)
        cursor = conn.cursor()

        sql = "INSERT INTO Fashionmnist (label, imagedata) VALUES ('{0}', %s)".format(label)
        cursor.execute(sql, img)
        conn.commit()
        cursor.close()
        conn.close()
        print('写入 {} 成功'.format(filename))

    except Exception as e:
        print(e)
        print('写入失败')


def read_mysql2pic(path, filename, config):
    """
    从数据库中读取图片
    :param path: 你要保存的图片的路径
    :param filename:你要从数据库读取的名字，在本例子相当于数据库中的name字段
    :param config: 数据库连接配置信息
    :return: None
    """
    try:
        conn = pymysql.connect(host=config['host'],
                               port=config['port'],
                               user=config['user'],
                               passwd=config['password'],
                               db=config['db'],
                               charset='utf8',
                               use_unicode=True)
        cursor = conn.cursor()
        cursor.execute("select imagedata from Fashionmnist where id = '{}'".format(1))
        res = cursor.fetchone()[0]
        with open(path, 'wb') as f:
            f.write(res)
        print('从数据库中读取 {} 成功'.format(filename))
    except Exception as e:
        print(e)
        print('读取数据库中的图片失败')


if __name__ == '__main__':
    my_config = {'host': 'localhost', 'port': 3306, 'user': 'root',
                 'password': '123456', 'db': 'demo'}
    import glob
    import random
    filepaths = glob.glob("E:/dp_projects/dp-sgd/fashion_train_image/*/*.png")
    random.shuffle(filepaths)
#     print(filepaths)
    for i in filepaths:
        write_pic2mysql(i, my_config)
#     filepaths = glob.glob("E:/dp_projects/dp-sgd/fashion_test_image/*/*.png")
#     for i in filepaths:
#         write_pic2mysql(i, my_config)
