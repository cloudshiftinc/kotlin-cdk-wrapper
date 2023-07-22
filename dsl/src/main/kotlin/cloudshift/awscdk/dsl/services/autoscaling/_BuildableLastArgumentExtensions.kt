@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.dsl.services.iam.PolicyStatementDsl
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.CfnCreationPolicy
import software.amazon.awscdk.services.autoscaling.AutoScalingGroup
import software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup
import software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration
import software.amazon.awscdk.services.autoscaling.CfnScalingPolicy
import software.amazon.awscdk.services.autoscaling.CfnWarmPool
import software.amazon.awscdk.services.autoscaling.IAutoScalingGroup
import software.amazon.awscdk.services.autoscaling.ILifecycleHookTarget
import software.amazon.awscdk.services.autoscaling.LifecycleHook
import software.amazon.awscdk.services.autoscaling.LifecycleHookTargetConfig
import software.amazon.awscdk.services.autoscaling.ScheduledAction
import software.amazon.awscdk.services.autoscaling.Signals
import software.amazon.awscdk.services.autoscaling.StepScalingAction
import software.amazon.awscdk.services.autoscaling.StepScalingPolicy
import software.amazon.awscdk.services.autoscaling.TargetTrackingScalingPolicy
import software.amazon.awscdk.services.autoscaling.WarmPool
import software.amazon.awscdk.services.ec2.CloudFormationInit
import software.constructs.Construct

public inline fun ILifecycleHookTarget.bind(arg0: Construct,
    block: BindHookTargetOptionsDsl.() -> Unit = {}): LifecycleHookTargetConfig {
  val builder = BindHookTargetOptionsDsl()
  builder.apply(block)
  return bind(arg0, builder.build())
}

public inline fun IAutoScalingGroup.addLifecycleHook(arg0: String,
    block: BasicLifecycleHookPropsDsl.() -> Unit = {}): LifecycleHook {
  val builder = BasicLifecycleHookPropsDsl()
  builder.apply(block)
  return addLifecycleHook(arg0, builder.build())
}

public inline fun IAutoScalingGroup.addWarmPool(block: WarmPoolOptionsDsl.() -> Unit = {}):
    WarmPool {
  val builder = WarmPoolOptionsDsl()
  builder.apply(block)
  return addWarmPool(builder.build())
}

public inline fun IAutoScalingGroup.scaleOnCpuUtilization(arg0: String,
    block: CpuUtilizationScalingPropsDsl.() -> Unit = {}): TargetTrackingScalingPolicy {
  val builder = CpuUtilizationScalingPropsDsl()
  builder.apply(block)
  return scaleOnCpuUtilization(arg0, builder.build())
}

public inline fun IAutoScalingGroup.scaleOnIncomingBytes(arg0: String,
    block: NetworkUtilizationScalingPropsDsl.() -> Unit = {}): TargetTrackingScalingPolicy {
  val builder = NetworkUtilizationScalingPropsDsl()
  builder.apply(block)
  return scaleOnIncomingBytes(arg0, builder.build())
}

public inline fun IAutoScalingGroup.scaleOnMetric(arg0: String,
    block: BasicStepScalingPolicyPropsDsl.() -> Unit = {}): StepScalingPolicy {
  val builder = BasicStepScalingPolicyPropsDsl()
  builder.apply(block)
  return scaleOnMetric(arg0, builder.build())
}

public inline fun IAutoScalingGroup.scaleOnOutgoingBytes(arg0: String,
    block: NetworkUtilizationScalingPropsDsl.() -> Unit = {}): TargetTrackingScalingPolicy {
  val builder = NetworkUtilizationScalingPropsDsl()
  builder.apply(block)
  return scaleOnOutgoingBytes(arg0, builder.build())
}

public inline fun IAutoScalingGroup.scaleOnSchedule(arg0: String,
    block: BasicScheduledActionPropsDsl.() -> Unit = {}): ScheduledAction {
  val builder = BasicScheduledActionPropsDsl()
  builder.apply(block)
  return scaleOnSchedule(arg0, builder.build())
}

public inline fun IAutoScalingGroup.scaleToTrackMetric(arg0: String,
    block: MetricTargetTrackingPropsDsl.() -> Unit = {}): TargetTrackingScalingPolicy {
  val builder = MetricTargetTrackingPropsDsl()
  builder.apply(block)
  return scaleToTrackMetric(arg0, builder.build())
}

/**
 * Indicates whether instances in the Auto Scaling group can be returned to the warm pool on scale
 * in.
 */
public inline
    fun CfnWarmPool.setInstanceReusePolicy(block: CfnWarmPoolInstanceReusePolicyPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnWarmPoolInstanceReusePolicyPropertyDsl()
  builder.apply(block)
  return setInstanceReusePolicy(builder.build())
}

/**
 * The metadata options for the instances.
 */
public inline
    fun CfnLaunchConfiguration.setMetadataOptions(block: CfnLaunchConfigurationMetadataOptionsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnLaunchConfigurationMetadataOptionsPropertyDsl()
  builder.apply(block)
  return setMetadataOptions(builder.build())
}

/**
 * A predictive scaling policy.
 *
 * Provides support for predefined and custom metrics.
 */
public inline
    fun CfnScalingPolicy.setPredictiveScalingConfiguration(block: CfnScalingPolicyPredictiveScalingConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnScalingPolicyPredictiveScalingConfigurationPropertyDsl()
  builder.apply(block)
  return setPredictiveScalingConfiguration(builder.build())
}

/**
 * A target tracking scaling policy.
 *
 * Provides support for predefined or custom metrics.
 */
public inline
    fun CfnScalingPolicy.setTargetTrackingConfiguration(block: CfnScalingPolicyTargetTrackingConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnScalingPolicyTargetTrackingConfigurationPropertyDsl()
  builder.apply(block)
  return setTargetTrackingConfiguration(builder.build())
}

/**
 * Render the ASG's CreationPolicy.
 *
 * @param renderOptions 
 */
public inline fun Signals.renderCreationPolicy(block: RenderSignalsOptionsDsl.() -> Unit = {}):
    CfnCreationPolicy {
  val builder = RenderSignalsOptionsDsl()
  builder.apply(block)
  return renderCreationPolicy(builder.build())
}

/**
 * Information used to specify the launch template and version to use to launch instances.
 */
public inline
    fun CfnAutoScalingGroup.setLaunchTemplate(block: CfnAutoScalingGroupLaunchTemplateSpecificationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnAutoScalingGroupLaunchTemplateSpecificationPropertyDsl()
  builder.apply(block)
  return setLaunchTemplate(builder.build())
}

/**
 * An embedded object that specifies a mixed instances policy.
 */
public inline
    fun CfnAutoScalingGroup.setMixedInstancesPolicy(block: CfnAutoScalingGroupMixedInstancesPolicyPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnAutoScalingGroupMixedInstancesPolicyPropertyDsl()
  builder.apply(block)
  return setMixedInstancesPolicy(builder.build())
}

/**
 * Add an adjusment interval to the ScalingAction.
 *
 * @param adjustment 
 */
public inline fun StepScalingAction.addAdjustment(block: AdjustmentTierDsl.() -> Unit = {}) {
  val builder = AdjustmentTierDsl()
  builder.apply(block)
  return addAdjustment(builder.build())
}

/**
 * Send a message to either an SQS queue or SNS topic when instances launch or terminate.
 *
 * @param id 
 * @param props 
 */
public inline fun AutoScalingGroup.addLifecycleHook(id: String,
    block: BasicLifecycleHookPropsDsl.() -> Unit = {}): LifecycleHook {
  val builder = BasicLifecycleHookPropsDsl()
  builder.apply(block)
  return addLifecycleHook(id, builder.build())
}

/**
 * Adds a statement to the IAM role assumed by instances of this fleet.
 *
 * @param statement 
 */
public inline fun AutoScalingGroup.addToRolePolicy(block: PolicyStatementDsl.() -> Unit = {}) {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToRolePolicy(builder.build())
}

/**
 * Add a pool of pre-initialized EC2 instances that sits alongside an Auto Scaling group.
 *
 * @param options
 */
public inline fun AutoScalingGroup.addWarmPool(block: WarmPoolOptionsDsl.() -> Unit = {}):
    WarmPool {
  val builder = WarmPoolOptionsDsl()
  builder.apply(block)
  return addWarmPool(builder.build())
}

/**
 * Use a CloudFormation Init configuration at instance startup.
 *
 * This does the following:
 *
 * * Attaches the CloudFormation Init metadata to the AutoScalingGroup resource.
 * * Add commands to the UserData to run `cfn-init` and `cfn-signal`.
 * * Update the instance's CreationPolicy to wait for `cfn-init` to finish
 * before reporting success.
 *
 * @param init 
 * @param options
 */
public inline fun AutoScalingGroup.applyCloudFormationInit(`init`: CloudFormationInit,
    block: ApplyCloudFormationInitOptionsDsl.() -> Unit = {}) {
  val builder = ApplyCloudFormationInitOptionsDsl()
  builder.apply(block)
  return applyCloudFormationInit(init, builder.build())
}

/**
 * Scale out or in to achieve a target CPU utilization.
 *
 * @param id 
 * @param props 
 */
public inline fun AutoScalingGroup.scaleOnCpuUtilization(id: String,
    block: CpuUtilizationScalingPropsDsl.() -> Unit = {}): TargetTrackingScalingPolicy {
  val builder = CpuUtilizationScalingPropsDsl()
  builder.apply(block)
  return scaleOnCpuUtilization(id, builder.build())
}

/**
 * Scale out or in to achieve a target network ingress rate.
 *
 * @param id 
 * @param props 
 */
public inline fun AutoScalingGroup.scaleOnIncomingBytes(id: String,
    block: NetworkUtilizationScalingPropsDsl.() -> Unit = {}): TargetTrackingScalingPolicy {
  val builder = NetworkUtilizationScalingPropsDsl()
  builder.apply(block)
  return scaleOnIncomingBytes(id, builder.build())
}

/**
 * Scale out or in, in response to a metric.
 *
 * @param id 
 * @param props 
 */
public inline fun AutoScalingGroup.scaleOnMetric(id: String,
    block: BasicStepScalingPolicyPropsDsl.() -> Unit = {}): StepScalingPolicy {
  val builder = BasicStepScalingPolicyPropsDsl()
  builder.apply(block)
  return scaleOnMetric(id, builder.build())
}

/**
 * Scale out or in to achieve a target network egress rate.
 *
 * @param id 
 * @param props 
 */
public inline fun AutoScalingGroup.scaleOnOutgoingBytes(id: String,
    block: NetworkUtilizationScalingPropsDsl.() -> Unit = {}): TargetTrackingScalingPolicy {
  val builder = NetworkUtilizationScalingPropsDsl()
  builder.apply(block)
  return scaleOnOutgoingBytes(id, builder.build())
}

/**
 * Scale out or in to achieve a target request handling rate.
 *
 * The AutoScalingGroup must have been attached to an Application Load Balancer
 * in order to be able to call this.
 *
 * @param id 
 * @param props 
 */
public inline fun AutoScalingGroup.scaleOnRequestCount(id: String,
    block: RequestCountScalingPropsDsl.() -> Unit = {}): TargetTrackingScalingPolicy {
  val builder = RequestCountScalingPropsDsl()
  builder.apply(block)
  return scaleOnRequestCount(id, builder.build())
}

/**
 * Scale out or in based on time.
 *
 * @param id 
 * @param props 
 */
public inline fun AutoScalingGroup.scaleOnSchedule(id: String,
    block: BasicScheduledActionPropsDsl.() -> Unit = {}): ScheduledAction {
  val builder = BasicScheduledActionPropsDsl()
  builder.apply(block)
  return scaleOnSchedule(id, builder.build())
}

/**
 * Scale out or in in order to keep a metric around a target value.
 *
 * @param id 
 * @param props 
 */
public inline fun AutoScalingGroup.scaleToTrackMetric(id: String,
    block: MetricTargetTrackingPropsDsl.() -> Unit = {}): TargetTrackingScalingPolicy {
  val builder = MetricTargetTrackingPropsDsl()
  builder.apply(block)
  return scaleToTrackMetric(id, builder.build())
}
