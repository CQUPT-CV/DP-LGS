import logging
from concurrent import futures
import numpy as np
import grpc
import train_pb2, train_pb2_grpc
import random
wloss_flag_begin=0
wloss_flag_end=3
acc_flag=0
class TrainService(train_pb2_grpc.TrainServicer):

    def GetStep(self, request: train_pb2.StepRequest, context):
        global wloss_flag_begin
        global wloss_flag_end
        if request.id == 0:
            wloss_flag_begin=0
            wloss_flag_end=1
            return train_pb2.StepResponse(step=[])
        print("GetStep")
        if wloss_flag_end < 10000:
            arri = [i for i in range(10000)]
            wloss_flag_begin+=3
            wloss_flag_end+=3
            return train_pb2.StepResponse(step=arri[:wloss_flag_end])
        else:
            return train_pb2.StepResponse(step=arri[:])

    def GetWloss(self, request: train_pb2.WlossRequest, context):
        global wloss_flag_begin
        global wloss_flag_end
        print("GetWloss")
        if wloss_flag_end < 10000:
            # txt = open("./wloss.txt", "r")
            wloss = np.loadtxt("./wloss.txt").tolist()
            wloss = wloss[wloss_flag_begin:wloss_flag_end]
            # for line in txt:
            #     res=line.strip('[')
            #     res=res.strip(']')
            #     res=res.split(',')
            #     wloss = list(map(float, res))
            # txt.close()
            return train_pb2.WlossResponse(step=[i+1 for i in range(len(wloss))], wloss=wloss)
        else:
            return train_pb2.WlossResponse(step=[], wloss=[])
    
    def GetTeacheracc(self, request: train_pb2.TeacheraccRequest, context):
        print("GetTeacheracc")
        if wloss_flag_end < 10000:
            # txt = open("./wloss.txt", "r")
            tloss1 = np.loadtxt("./tloss1.txt").tolist()
            tloss2 = np.loadtxt("./tloss2.txt").tolist()
            tloss1 = tloss1[wloss_flag_begin:wloss_flag_end]
            tloss2 = tloss2[wloss_flag_begin:wloss_flag_end]
        return train_pb2.TeacheraccResponse(step=[i+1 for i in range(len(tloss1))], maxacc=tloss1, minacc=tloss2)


def serve():
    server = grpc.server(futures.ThreadPoolExecutor(max_workers=5))
    train_pb2_grpc.add_TrainServicer_to_server(TrainService(), server)
    server.add_insecure_port('[::]:50054')
    server.start()
    server.wait_for_termination()


if __name__ == '__main__':
    logging.basicConfig()
    serve()