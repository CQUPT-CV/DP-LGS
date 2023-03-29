// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: train.proto

package com.ruoyi.platform.grpc;

public interface WlossResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.WlossResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated int32 step = 1;</code>
   * @return A list containing the step.
   */
  java.util.List<Integer> getStepList();
  /**
   * <code>repeated int32 step = 1;</code>
   * @return The count of step.
   */
  int getStepCount();
  /**
   * <code>repeated int32 step = 1;</code>
   * @param index The index of the element to return.
   * @return The step at the given index.
   */
  int getStep(int index);

  /**
   * <code>repeated double wloss = 2;</code>
   * @return A list containing the wloss.
   */
  java.util.List<Double> getWlossList();
  /**
   * <code>repeated double wloss = 2;</code>
   * @return The count of wloss.
   */
  int getWlossCount();
  /**
   * <code>repeated double wloss = 2;</code>
   * @param index The index of the element to return.
   * @return The wloss at the given index.
   */
  double getWloss(int index);
}
