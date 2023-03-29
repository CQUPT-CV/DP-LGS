package com.ruoyi.platform.controller;

import com.ruoyi.common.json.JSON;
import com.ruoyi.platform.grpc.*;
import com.ruoyi.platform.vo.MaxstepVo;
import com.ruoyi.platform.vo.StepVo;
import com.ruoyi.platform.vo.TeacheraccVo;
import com.ruoyi.platform.vo.WlossVo;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.core.controller.BaseController;

import java.math.BigDecimal;
import java.util.Random;

/**
 * uploadController
 *
 * @author ruoyi
 * @date 2023-02-28
 */
@Controller
@RequestMapping("/platform/train")
public class TrainController extends BaseController
{
    private String prefix = "platform/train";

    private Integer[] get_step(Integer global_start) {
        StepResponse stepResponse = StepResponse.newBuilder().build();
        try {
            ManagedChannel channel = ManagedChannelBuilder.forTarget("127.0.0.1:50054").usePlaintext().build();
            TrainGrpc.TrainBlockingStub trainStub = TrainGrpc.newBlockingStub(channel);
            StepRequest stepRequest = StepRequest.newBuilder().setId(global_start).build();
            stepResponse = trainStub.getStep(stepRequest);
            channel.shutdownNow();
        }
        catch (Exception e){
            logger.error(e.toString());
        }
        return stepResponse.getStepList().toArray(new Integer[1]);

    }

    private TeacheraccResponse get_teacheracc() {
        TeacheraccResponse teacheraccResponse = TeacheraccResponse.newBuilder().build();
        try {
            ManagedChannel channel = ManagedChannelBuilder.forTarget("127.0.0.1:50054").usePlaintext().build();
            TrainGrpc.TrainBlockingStub trainStub = TrainGrpc.newBlockingStub(channel);
            TeacheraccRequest teacheraccRequest = TeacheraccRequest.newBuilder().setId(1).build();
            teacheraccResponse = trainStub.getTeacheracc(teacheraccRequest);
            channel.shutdownNow();
        }
        catch (Exception e){
            logger.error(e.toString());
        }
        return teacheraccResponse;
    }

    private WlossResponse get_wloss() {
        WlossResponse wlossResponse = WlossResponse.newBuilder().build();
        try {
            ManagedChannel channel = ManagedChannelBuilder.forTarget("127.0.0.1:50054").usePlaintext().build();
            TrainGrpc.TrainBlockingStub trainStub = TrainGrpc.newBlockingStub(channel);
            WlossRequest wlossRequest = WlossRequest.newBuilder().setId(1).build();
            wlossResponse = trainStub.getWloss(wlossRequest);
            channel.shutdownNow();
        }
        catch (Exception e){
            logger.error(e.toString());
        }
        return wlossResponse;
    }

    @GetMapping( "/wloss")
    @ResponseBody
    public WlossVo wloss()
    {
        WlossResponse wlossResponse = get_wloss();
        WlossVo wlossVo = new WlossVo(wlossResponse.getStepList().toArray(new Integer[0]), wlossResponse.getWlossList().toArray(new Double[0]));
        return wlossVo;
    }

    @GetMapping( "/teacheracc")
    @ResponseBody
    public TeacheraccVo teacheracc()
    {
        TeacheraccResponse teacheraccResponse = get_teacheracc();
        TeacheraccVo teacheraccVO = new TeacheraccVo(teacheraccResponse.getStepList().toArray(new Integer[0]), teacheraccResponse.getMaxaccList().toArray(new Double[0]), teacheraccResponse.getMinaccList().toArray(new Double[0]));
        return teacheraccVO;
    }
    @GetMapping( "/step")
    @ResponseBody
    public Double getStep(MaxstepVo maxstep, Integer global_start)
    {
        Double d = new BigDecimal(get_step(global_start).length / new Double(maxstep.getMaxstep()) * 100).setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
        return d;
    }
}