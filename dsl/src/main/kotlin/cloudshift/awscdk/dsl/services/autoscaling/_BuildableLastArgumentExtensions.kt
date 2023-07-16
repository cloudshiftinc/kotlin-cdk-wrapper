@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import cloudshift.awscdk.dsl.services.iam.PolicyStatementDsl
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.autoscaling.AutoScalingGroup
import software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup
import software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration
import software.amazon.awscdk.services.autoscaling.CfnLifecycleHook
import software.amazon.awscdk.services.autoscaling.CfnScalingPolicy
import software.amazon.awscdk.services.autoscaling.CfnScheduledAction
import software.amazon.awscdk.services.autoscaling.CfnWarmPool
import software.amazon.awscdk.services.autoscaling.LifecycleHook
import software.amazon.awscdk.services.autoscaling.ScheduledAction
import software.amazon.awscdk.services.autoscaling.StepScalingAction
import software.amazon.awscdk.services.autoscaling.StepScalingPolicy
import software.amazon.awscdk.services.autoscaling.TargetTrackingScalingPolicy
import software.amazon.awscdk.services.autoscaling.WarmPool
import software.amazon.awscdk.services.ec2.CloudFormationInit

public inline fun AutoScalingGroup.addLifecycleHook(arg0: String,
    block: BasicLifecycleHookPropsDsl.() -> Unit = {}): LifecycleHook {
  val builder = BasicLifecycleHookPropsDsl()
  builder.apply(block)
  return addLifecycleHook(arg0,builder.build())
}

public inline fun AutoScalingGroup.addToRolePolicy(block: PolicyStatementDsl.() -> Unit = {}) {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToRolePolicy(builder.build())
}

public inline fun AutoScalingGroup.addWarmPool(block: WarmPoolOptionsDsl.() -> Unit = {}):
    WarmPool {
  val builder = WarmPoolOptionsDsl()
  builder.apply(block)
  return addWarmPool(builder.build())
}

public inline fun AutoScalingGroup.applyCloudFormationInit(arg0: CloudFormationInit,
    block: ApplyCloudFormationInitOptionsDsl.() -> Unit = {}) {
  val builder = ApplyCloudFormationInitOptionsDsl()
  builder.apply(block)
  return applyCloudFormationInit(arg0,builder.build())
}

public inline fun AutoScalingGroup.scaleOnCpuUtilization(arg0: String,
    block: CpuUtilizationScalingPropsDsl.() -> Unit = {}): TargetTrackingScalingPolicy {
  val builder = CpuUtilizationScalingPropsDsl()
  builder.apply(block)
  return scaleOnCpuUtilization(arg0,builder.build())
}

public inline fun AutoScalingGroup.scaleOnIncomingBytes(arg0: String,
    block: NetworkUtilizationScalingPropsDsl.() -> Unit = {}): TargetTrackingScalingPolicy {
  val builder = NetworkUtilizationScalingPropsDsl()
  builder.apply(block)
  return scaleOnIncomingBytes(arg0,builder.build())
}

public inline fun AutoScalingGroup.scaleOnMetric(arg0: String,
    block: BasicStepScalingPolicyPropsDsl.() -> Unit = {}): StepScalingPolicy {
  val builder = BasicStepScalingPolicyPropsDsl()
  builder.apply(block)
  return scaleOnMetric(arg0,builder.build())
}

public inline fun AutoScalingGroup.scaleOnOutgoingBytes(arg0: String,
    block: NetworkUtilizationScalingPropsDsl.() -> Unit = {}): TargetTrackingScalingPolicy {
  val builder = NetworkUtilizationScalingPropsDsl()
  builder.apply(block)
  return scaleOnOutgoingBytes(arg0,builder.build())
}

public inline fun AutoScalingGroup.scaleOnRequestCount(arg0: String,
    block: RequestCountScalingPropsDsl.() -> Unit = {}): TargetTrackingScalingPolicy {
  val builder = RequestCountScalingPropsDsl()
  builder.apply(block)
  return scaleOnRequestCount(arg0,builder.build())
}

public inline fun AutoScalingGroup.scaleOnSchedule(arg0: String,
    block: BasicScheduledActionPropsDsl.() -> Unit = {}): ScheduledAction {
  val builder = BasicScheduledActionPropsDsl()
  builder.apply(block)
  return scaleOnSchedule(arg0,builder.build())
}

public inline fun AutoScalingGroup.scaleToTrackMetric(arg0: String,
    block: MetricTargetTrackingPropsDsl.() -> Unit = {}): TargetTrackingScalingPolicy {
  val builder = MetricTargetTrackingPropsDsl()
  builder.apply(block)
  return scaleToTrackMetric(arg0,builder.build())
}

public inline fun CfnAutoScalingGroup.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnAutoScalingGroup.setLaunchTemplate(block: CfnAutoScalingGroupLaunchTemplateSpecificationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnAutoScalingGroupLaunchTemplateSpecificationPropertyDsl()
  builder.apply(block)
  return setLaunchTemplate(builder.build())
}

public inline
    fun CfnAutoScalingGroup.setMixedInstancesPolicy(block: CfnAutoScalingGroupMixedInstancesPolicyPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnAutoScalingGroupMixedInstancesPolicyPropertyDsl()
  builder.apply(block)
  return setMixedInstancesPolicy(builder.build())
}

public inline fun CfnLaunchConfiguration.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnLaunchConfiguration.setMetadataOptions(block: CfnLaunchConfigurationMetadataOptionsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnLaunchConfigurationMetadataOptionsPropertyDsl()
  builder.apply(block)
  return setMetadataOptions(builder.build())
}

public inline fun CfnLifecycleHook.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnScalingPolicy.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnScalingPolicy.setPredictiveScalingConfiguration(block: CfnScalingPolicyPredictiveScalingConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnScalingPolicyPredictiveScalingConfigurationPropertyDsl()
  builder.apply(block)
  return setPredictiveScalingConfiguration(builder.build())
}

public inline
    fun CfnScalingPolicy.setTargetTrackingConfiguration(block: CfnScalingPolicyTargetTrackingConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnScalingPolicyTargetTrackingConfigurationPropertyDsl()
  builder.apply(block)
  return setTargetTrackingConfiguration(builder.build())
}

public inline fun CfnScheduledAction.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnWarmPool.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnWarmPool.setInstanceReusePolicy(block: CfnWarmPoolInstanceReusePolicyPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnWarmPoolInstanceReusePolicyPropertyDsl()
  builder.apply(block)
  return setInstanceReusePolicy(builder.build())
}

public inline fun StepScalingAction.addAdjustment(block: AdjustmentTierDsl.() -> Unit = {}) {
  val builder = AdjustmentTierDsl()
  builder.apply(block)
  return addAdjustment(builder.build())
}
