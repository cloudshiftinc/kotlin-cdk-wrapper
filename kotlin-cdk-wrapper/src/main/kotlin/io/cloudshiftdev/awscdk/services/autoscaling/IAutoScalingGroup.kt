@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ec2.OperatingSystemType
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * An AutoScalingGroup.
 */
public interface IAutoScalingGroup : IResource, IGrantable {
  /**
   * Send a message to either an SQS queue or SNS topic when instances launch or terminate.
   *
   * @param id 
   * @param props 
   */
  public fun addLifecycleHook(id: String, props: BasicLifecycleHookProps): LifecycleHook

  /**
   * Send a message to either an SQS queue or SNS topic when instances launch or terminate.
   *
   * @param id 
   * @param props 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e73b58a332c5f3bcf737c3c3902fb97721571b04a55f030350ee06a5be61db31")
  public fun addLifecycleHook(id: String, props: BasicLifecycleHookProps.Builder.() -> Unit):
      LifecycleHook

  /**
   * Add command to the startup script of fleet instances.
   *
   * The command must be in the scripting language supported by the fleet's OS (i.e. Linux/Windows).
   * Does nothing for imported ASGs.
   *
   * @param commands 
   */
  public fun addUserData(commands: String)

  /**
   * Add a pool of pre-initialized EC2 instances that sits alongside an Auto Scaling group.
   *
   * @param options
   */
  public fun addWarmPool(): WarmPool

  /**
   * Add a pool of pre-initialized EC2 instances that sits alongside an Auto Scaling group.
   *
   * @param options
   */
  public fun addWarmPool(options: WarmPoolOptions): WarmPool

  /**
   * Add a pool of pre-initialized EC2 instances that sits alongside an Auto Scaling group.
   *
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ebe3a17babce83c2ccb570a7464dccb7ae43140da33baacb05b1a15a27a69e43")
  public fun addWarmPool(options: WarmPoolOptions.Builder.() -> Unit): WarmPool

  /**
   * The arn of the AutoScalingGroup.
   */
  public fun autoScalingGroupArn(): String

  /**
   * The name of the AutoScalingGroup.
   */
  public fun autoScalingGroupName(): String

  /**
   * The operating system family that the instances in this auto-scaling group belong to.
   *
   * Is 'UNKNOWN' for imported ASGs.
   */
  public fun osType(): OperatingSystemType

  /**
   * Scale out or in to achieve a target CPU utilization.
   *
   * @param id 
   * @param props 
   */
  public fun scaleOnCpuUtilization(id: String, props: CpuUtilizationScalingProps):
      TargetTrackingScalingPolicy

  /**
   * Scale out or in to achieve a target CPU utilization.
   *
   * @param id 
   * @param props 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("54ff0f79a3a0e98af41f878332105ce744cc94709e6dfa3c31c968213fde0127")
  public fun scaleOnCpuUtilization(id: String,
      props: CpuUtilizationScalingProps.Builder.() -> Unit): TargetTrackingScalingPolicy

  /**
   * Scale out or in to achieve a target network ingress rate.
   *
   * @param id 
   * @param props 
   */
  public fun scaleOnIncomingBytes(id: String, props: NetworkUtilizationScalingProps):
      TargetTrackingScalingPolicy

  /**
   * Scale out or in to achieve a target network ingress rate.
   *
   * @param id 
   * @param props 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("53d48012d390303ce4bdadda813caeca6ef440c93ff99ecf347c830212960766")
  public fun scaleOnIncomingBytes(id: String,
      props: NetworkUtilizationScalingProps.Builder.() -> Unit): TargetTrackingScalingPolicy

  /**
   * Scale out or in, in response to a metric.
   *
   * @param id 
   * @param props 
   */
  public fun scaleOnMetric(id: String, props: BasicStepScalingPolicyProps): StepScalingPolicy

  /**
   * Scale out or in, in response to a metric.
   *
   * @param id 
   * @param props 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("97c636215f9ded1865259a4c15b81d08ffc6cf47e1b5af030d3b308ae6eba808")
  public fun scaleOnMetric(id: String, props: BasicStepScalingPolicyProps.Builder.() -> Unit):
      StepScalingPolicy

  /**
   * Scale out or in to achieve a target network egress rate.
   *
   * @param id 
   * @param props 
   */
  public fun scaleOnOutgoingBytes(id: String, props: NetworkUtilizationScalingProps):
      TargetTrackingScalingPolicy

  /**
   * Scale out or in to achieve a target network egress rate.
   *
   * @param id 
   * @param props 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("041c27ca62dcbebfcb1881e27b18d9a65a9e76a73700f64dc5640d2cb3dd2620")
  public fun scaleOnOutgoingBytes(id: String,
      props: NetworkUtilizationScalingProps.Builder.() -> Unit): TargetTrackingScalingPolicy

  /**
   * Scale out or in based on time.
   *
   * @param id 
   * @param props 
   */
  public fun scaleOnSchedule(id: String, props: BasicScheduledActionProps): ScheduledAction

  /**
   * Scale out or in based on time.
   *
   * @param id 
   * @param props 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b8a0caadcedcb277caddacbd0e88af40e8ebf1b6606474968554ce75d027168a")
  public fun scaleOnSchedule(id: String, props: BasicScheduledActionProps.Builder.() -> Unit):
      ScheduledAction

  /**
   * Scale out or in in order to keep a metric around a target value.
   *
   * @param id 
   * @param props 
   */
  public fun scaleToTrackMetric(id: String, props: MetricTargetTrackingProps):
      TargetTrackingScalingPolicy

  /**
   * Scale out or in in order to keep a metric around a target value.
   *
   * @param id 
   * @param props 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("783dfddcfc4313e0ba0ad62e98c32ed03381c60b8a7586ca584816685414690c")
  public fun scaleToTrackMetric(id: String, props: MetricTargetTrackingProps.Builder.() -> Unit):
      TargetTrackingScalingPolicy

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.IAutoScalingGroup):
        IAutoScalingGroup = CdkObjectWrappers.wrap(cdkObject) as IAutoScalingGroup

    internal fun unwrap(wrapped: IAutoScalingGroup):
        software.amazon.awscdk.services.autoscaling.IAutoScalingGroup = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.autoscaling.IAutoScalingGroup
  }
}
