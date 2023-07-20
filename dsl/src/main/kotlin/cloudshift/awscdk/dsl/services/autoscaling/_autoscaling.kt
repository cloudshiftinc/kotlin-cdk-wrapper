@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.autoscaling

import software.amazon.awscdk.services.autoscaling.AdjustmentTier
import software.amazon.awscdk.services.autoscaling.ApplyCloudFormationInitOptions
import software.amazon.awscdk.services.autoscaling.AutoScalingGroup
import software.amazon.awscdk.services.autoscaling.AutoScalingGroupProps
import software.amazon.awscdk.services.autoscaling.BaseTargetTrackingProps
import software.amazon.awscdk.services.autoscaling.BasicLifecycleHookProps
import software.amazon.awscdk.services.autoscaling.BasicScheduledActionProps
import software.amazon.awscdk.services.autoscaling.BasicStepScalingPolicyProps
import software.amazon.awscdk.services.autoscaling.BasicTargetTrackingScalingPolicyProps
import software.amazon.awscdk.services.autoscaling.BindHookTargetOptions
import software.amazon.awscdk.services.autoscaling.BlockDevice
import software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup
import software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroupProps
import software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration
import software.amazon.awscdk.services.autoscaling.CfnLaunchConfigurationProps
import software.amazon.awscdk.services.autoscaling.CfnLifecycleHook
import software.amazon.awscdk.services.autoscaling.CfnLifecycleHookProps
import software.amazon.awscdk.services.autoscaling.CfnScalingPolicy
import software.amazon.awscdk.services.autoscaling.CfnScalingPolicyProps
import software.amazon.awscdk.services.autoscaling.CfnScheduledAction
import software.amazon.awscdk.services.autoscaling.CfnScheduledActionProps
import software.amazon.awscdk.services.autoscaling.CfnWarmPool
import software.amazon.awscdk.services.autoscaling.CfnWarmPoolProps
import software.amazon.awscdk.services.autoscaling.CommonAutoScalingGroupProps
import software.amazon.awscdk.services.autoscaling.CpuUtilizationScalingProps
import software.amazon.awscdk.services.autoscaling.CronOptions
import software.amazon.awscdk.services.autoscaling.EbsDeviceOptions
import software.amazon.awscdk.services.autoscaling.EbsDeviceOptionsBase
import software.amazon.awscdk.services.autoscaling.EbsDeviceProps
import software.amazon.awscdk.services.autoscaling.EbsDeviceSnapshotOptions
import software.amazon.awscdk.services.autoscaling.Ec2HealthCheckOptions
import software.amazon.awscdk.services.autoscaling.ElbHealthCheckOptions
import software.amazon.awscdk.services.autoscaling.InstancesDistribution
import software.amazon.awscdk.services.autoscaling.LaunchTemplateOverrides
import software.amazon.awscdk.services.autoscaling.LifecycleHook
import software.amazon.awscdk.services.autoscaling.LifecycleHookProps
import software.amazon.awscdk.services.autoscaling.LifecycleHookTargetConfig
import software.amazon.awscdk.services.autoscaling.MetricTargetTrackingProps
import software.amazon.awscdk.services.autoscaling.MixedInstancesPolicy
import software.amazon.awscdk.services.autoscaling.NetworkUtilizationScalingProps
import software.amazon.awscdk.services.autoscaling.NotificationConfiguration
import software.amazon.awscdk.services.autoscaling.RenderSignalsOptions
import software.amazon.awscdk.services.autoscaling.RequestCountScalingProps
import software.amazon.awscdk.services.autoscaling.RollingUpdateOptions
import software.amazon.awscdk.services.autoscaling.ScalingInterval
import software.amazon.awscdk.services.autoscaling.ScheduledAction
import software.amazon.awscdk.services.autoscaling.ScheduledActionProps
import software.amazon.awscdk.services.autoscaling.SignalsOptions
import software.amazon.awscdk.services.autoscaling.StepScalingAction
import software.amazon.awscdk.services.autoscaling.StepScalingActionProps
import software.amazon.awscdk.services.autoscaling.StepScalingPolicy
import software.amazon.awscdk.services.autoscaling.StepScalingPolicyProps
import software.amazon.awscdk.services.autoscaling.TargetTrackingScalingPolicy
import software.amazon.awscdk.services.autoscaling.TargetTrackingScalingPolicyProps
import software.amazon.awscdk.services.autoscaling.WarmPool
import software.amazon.awscdk.services.autoscaling.WarmPoolOptions
import software.amazon.awscdk.services.autoscaling.WarmPoolProps
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object autoscaling {
    public inline fun adjustmentTier(block: AdjustmentTierDsl.() -> Unit = {}): AdjustmentTier {
        val builder = AdjustmentTierDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun applyCloudFormationInitOptions(block: ApplyCloudFormationInitOptionsDsl.() -> Unit = {}): ApplyCloudFormationInitOptions {
        val builder = ApplyCloudFormationInitOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun autoScalingGroup(
        scope: Construct,
        id: String,
        block: AutoScalingGroupDsl.() -> Unit = {},
    ): AutoScalingGroup {
        val builder = AutoScalingGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun autoScalingGroupProps(block: AutoScalingGroupPropsDsl.() -> Unit = {}): AutoScalingGroupProps {
        val builder = AutoScalingGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun baseTargetTrackingProps(block: BaseTargetTrackingPropsDsl.() -> Unit = {}): BaseTargetTrackingProps {
        val builder = BaseTargetTrackingPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun basicLifecycleHookProps(block: BasicLifecycleHookPropsDsl.() -> Unit = {}): BasicLifecycleHookProps {
        val builder = BasicLifecycleHookPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun basicScheduledActionProps(block: BasicScheduledActionPropsDsl.() -> Unit = {}): BasicScheduledActionProps {
        val builder = BasicScheduledActionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun basicStepScalingPolicyProps(
        block: BasicStepScalingPolicyPropsDsl.() -> Unit =
            {},
    ): BasicStepScalingPolicyProps {
        val builder = BasicStepScalingPolicyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun basicTargetTrackingScalingPolicyProps(
        block: BasicTargetTrackingScalingPolicyPropsDsl.() -> Unit =
            {},
    ): BasicTargetTrackingScalingPolicyProps {
        val builder = BasicTargetTrackingScalingPolicyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun bindHookTargetOptions(block: BindHookTargetOptionsDsl.() -> Unit = {}): BindHookTargetOptions {
        val builder = BindHookTargetOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun blockDevice(block: BlockDeviceDsl.() -> Unit = {}): BlockDevice {
        val builder = BlockDeviceDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAutoScalingGroup(
        scope: Construct,
        id: String,
        block: CfnAutoScalingGroupDsl.() -> Unit = {},
    ): CfnAutoScalingGroup {
        val builder = CfnAutoScalingGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAutoScalingGroupAcceleratorCountRequestProperty(
        block: CfnAutoScalingGroupAcceleratorCountRequestPropertyDsl.() -> Unit =
            {},
    ): CfnAutoScalingGroup.AcceleratorCountRequestProperty {
        val builder = CfnAutoScalingGroupAcceleratorCountRequestPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAutoScalingGroupAcceleratorTotalMemoryMiBRequestProperty(
        block: CfnAutoScalingGroupAcceleratorTotalMemoryMiBRequestPropertyDsl.() -> Unit =
            {},
    ): CfnAutoScalingGroup.AcceleratorTotalMemoryMiBRequestProperty {
        val builder = CfnAutoScalingGroupAcceleratorTotalMemoryMiBRequestPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAutoScalingGroupBaselineEbsBandwidthMbpsRequestProperty(
        block: CfnAutoScalingGroupBaselineEbsBandwidthMbpsRequestPropertyDsl.() -> Unit =
            {},
    ): CfnAutoScalingGroup.BaselineEbsBandwidthMbpsRequestProperty {
        val builder = CfnAutoScalingGroupBaselineEbsBandwidthMbpsRequestPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAutoScalingGroupInstanceRequirementsProperty(
        block: CfnAutoScalingGroupInstanceRequirementsPropertyDsl.() -> Unit =
            {},
    ): CfnAutoScalingGroup.InstanceRequirementsProperty {
        val builder = CfnAutoScalingGroupInstanceRequirementsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAutoScalingGroupInstancesDistributionProperty(
        block: CfnAutoScalingGroupInstancesDistributionPropertyDsl.() -> Unit =
            {},
    ): CfnAutoScalingGroup.InstancesDistributionProperty {
        val builder = CfnAutoScalingGroupInstancesDistributionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAutoScalingGroupLaunchTemplateOverridesProperty(
        block: CfnAutoScalingGroupLaunchTemplateOverridesPropertyDsl.() -> Unit =
            {},
    ): CfnAutoScalingGroup.LaunchTemplateOverridesProperty {
        val builder = CfnAutoScalingGroupLaunchTemplateOverridesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAutoScalingGroupLaunchTemplateProperty(
        block: CfnAutoScalingGroupLaunchTemplatePropertyDsl.() -> Unit =
            {},
    ): CfnAutoScalingGroup.LaunchTemplateProperty {
        val builder = CfnAutoScalingGroupLaunchTemplatePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAutoScalingGroupLaunchTemplateSpecificationProperty(
        block: CfnAutoScalingGroupLaunchTemplateSpecificationPropertyDsl.() -> Unit =
            {},
    ): CfnAutoScalingGroup.LaunchTemplateSpecificationProperty {
        val builder = CfnAutoScalingGroupLaunchTemplateSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAutoScalingGroupLifecycleHookSpecificationProperty(
        block: CfnAutoScalingGroupLifecycleHookSpecificationPropertyDsl.() -> Unit =
            {},
    ): CfnAutoScalingGroup.LifecycleHookSpecificationProperty {
        val builder = CfnAutoScalingGroupLifecycleHookSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAutoScalingGroupMemoryGiBPerVCpuRequestProperty(
        block: CfnAutoScalingGroupMemoryGiBPerVCpuRequestPropertyDsl.() -> Unit =
            {},
    ): CfnAutoScalingGroup.MemoryGiBPerVCpuRequestProperty {
        val builder = CfnAutoScalingGroupMemoryGiBPerVCpuRequestPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAutoScalingGroupMemoryMiBRequestProperty(
        block: CfnAutoScalingGroupMemoryMiBRequestPropertyDsl.() -> Unit =
            {},
    ): CfnAutoScalingGroup.MemoryMiBRequestProperty {
        val builder = CfnAutoScalingGroupMemoryMiBRequestPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAutoScalingGroupMetricsCollectionProperty(
        block: CfnAutoScalingGroupMetricsCollectionPropertyDsl.() -> Unit =
            {},
    ): CfnAutoScalingGroup.MetricsCollectionProperty {
        val builder = CfnAutoScalingGroupMetricsCollectionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAutoScalingGroupMixedInstancesPolicyProperty(
        block: CfnAutoScalingGroupMixedInstancesPolicyPropertyDsl.() -> Unit =
            {},
    ): CfnAutoScalingGroup.MixedInstancesPolicyProperty {
        val builder = CfnAutoScalingGroupMixedInstancesPolicyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAutoScalingGroupNetworkBandwidthGbpsRequestProperty(
        block: CfnAutoScalingGroupNetworkBandwidthGbpsRequestPropertyDsl.() -> Unit =
            {},
    ): CfnAutoScalingGroup.NetworkBandwidthGbpsRequestProperty {
        val builder = CfnAutoScalingGroupNetworkBandwidthGbpsRequestPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAutoScalingGroupNetworkInterfaceCountRequestProperty(
        block: CfnAutoScalingGroupNetworkInterfaceCountRequestPropertyDsl.() -> Unit =
            {},
    ): CfnAutoScalingGroup.NetworkInterfaceCountRequestProperty {
        val builder = CfnAutoScalingGroupNetworkInterfaceCountRequestPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAutoScalingGroupNotificationConfigurationProperty(
        block: CfnAutoScalingGroupNotificationConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnAutoScalingGroup.NotificationConfigurationProperty {
        val builder = CfnAutoScalingGroupNotificationConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAutoScalingGroupProps(block: CfnAutoScalingGroupPropsDsl.() -> Unit = {}): CfnAutoScalingGroupProps {
        val builder = CfnAutoScalingGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAutoScalingGroupTagPropertyProperty(
        block: CfnAutoScalingGroupTagPropertyPropertyDsl.() -> Unit =
            {},
    ): CfnAutoScalingGroup.TagPropertyProperty {
        val builder = CfnAutoScalingGroupTagPropertyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAutoScalingGroupTotalLocalStorageGBRequestProperty(
        block: CfnAutoScalingGroupTotalLocalStorageGBRequestPropertyDsl.() -> Unit =
            {},
    ): CfnAutoScalingGroup.TotalLocalStorageGBRequestProperty {
        val builder = CfnAutoScalingGroupTotalLocalStorageGBRequestPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAutoScalingGroupVCpuCountRequestProperty(
        block: CfnAutoScalingGroupVCpuCountRequestPropertyDsl.() -> Unit =
            {},
    ): CfnAutoScalingGroup.VCpuCountRequestProperty {
        val builder = CfnAutoScalingGroupVCpuCountRequestPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnLaunchConfiguration(
        scope: Construct,
        id: String,
        block: CfnLaunchConfigurationDsl.() -> Unit = {},
    ): CfnLaunchConfiguration {
        val builder = CfnLaunchConfigurationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnLaunchConfigurationBlockDeviceMappingProperty(
        block: CfnLaunchConfigurationBlockDeviceMappingPropertyDsl.() -> Unit =
            {},
    ): CfnLaunchConfiguration.BlockDeviceMappingProperty {
        val builder = CfnLaunchConfigurationBlockDeviceMappingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnLaunchConfigurationBlockDeviceProperty(
        block: CfnLaunchConfigurationBlockDevicePropertyDsl.() -> Unit =
            {},
    ): CfnLaunchConfiguration.BlockDeviceProperty {
        val builder = CfnLaunchConfigurationBlockDevicePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnLaunchConfigurationMetadataOptionsProperty(
        block: CfnLaunchConfigurationMetadataOptionsPropertyDsl.() -> Unit =
            {},
    ): CfnLaunchConfiguration.MetadataOptionsProperty {
        val builder = CfnLaunchConfigurationMetadataOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnLaunchConfigurationProps(
        block: CfnLaunchConfigurationPropsDsl.() -> Unit =
            {},
    ): CfnLaunchConfigurationProps {
        val builder = CfnLaunchConfigurationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnLifecycleHook(
        scope: Construct,
        id: String,
        block: CfnLifecycleHookDsl.() -> Unit = {},
    ): CfnLifecycleHook {
        val builder = CfnLifecycleHookDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnLifecycleHookProps(block: CfnLifecycleHookPropsDsl.() -> Unit = {}): CfnLifecycleHookProps {
        val builder = CfnLifecycleHookPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnScalingPolicy(
        scope: Construct,
        id: String,
        block: CfnScalingPolicyDsl.() -> Unit = {},
    ): CfnScalingPolicy {
        val builder = CfnScalingPolicyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnScalingPolicyCustomizedMetricSpecificationProperty(
        block: CfnScalingPolicyCustomizedMetricSpecificationPropertyDsl.() -> Unit =
            {},
    ): CfnScalingPolicy.CustomizedMetricSpecificationProperty {
        val builder = CfnScalingPolicyCustomizedMetricSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnScalingPolicyMetricDataQueryProperty(
        block: CfnScalingPolicyMetricDataQueryPropertyDsl.() -> Unit =
            {},
    ): CfnScalingPolicy.MetricDataQueryProperty {
        val builder = CfnScalingPolicyMetricDataQueryPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnScalingPolicyMetricDimensionProperty(
        block: CfnScalingPolicyMetricDimensionPropertyDsl.() -> Unit =
            {},
    ): CfnScalingPolicy.MetricDimensionProperty {
        val builder = CfnScalingPolicyMetricDimensionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnScalingPolicyMetricProperty(
        block: CfnScalingPolicyMetricPropertyDsl.() -> Unit = {
        },
    ): CfnScalingPolicy.MetricProperty {
        val builder = CfnScalingPolicyMetricPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnScalingPolicyMetricStatProperty(
        block: CfnScalingPolicyMetricStatPropertyDsl.() -> Unit =
            {},
    ): CfnScalingPolicy.MetricStatProperty {
        val builder = CfnScalingPolicyMetricStatPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnScalingPolicyPredefinedMetricSpecificationProperty(
        block: CfnScalingPolicyPredefinedMetricSpecificationPropertyDsl.() -> Unit =
            {},
    ): CfnScalingPolicy.PredefinedMetricSpecificationProperty {
        val builder = CfnScalingPolicyPredefinedMetricSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnScalingPolicyPredictiveScalingConfigurationProperty(
        block: CfnScalingPolicyPredictiveScalingConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnScalingPolicy.PredictiveScalingConfigurationProperty {
        val builder = CfnScalingPolicyPredictiveScalingConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnScalingPolicyPredictiveScalingCustomizedCapacityMetricProperty(
        block: CfnScalingPolicyPredictiveScalingCustomizedCapacityMetricPropertyDsl.() -> Unit =
            {},
    ): CfnScalingPolicy.PredictiveScalingCustomizedCapacityMetricProperty {
        val builder = CfnScalingPolicyPredictiveScalingCustomizedCapacityMetricPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnScalingPolicyPredictiveScalingCustomizedLoadMetricProperty(
        block: CfnScalingPolicyPredictiveScalingCustomizedLoadMetricPropertyDsl.() -> Unit =
            {},
    ): CfnScalingPolicy.PredictiveScalingCustomizedLoadMetricProperty {
        val builder = CfnScalingPolicyPredictiveScalingCustomizedLoadMetricPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnScalingPolicyPredictiveScalingCustomizedScalingMetricProperty(
        block: CfnScalingPolicyPredictiveScalingCustomizedScalingMetricPropertyDsl.() -> Unit =
            {},
    ): CfnScalingPolicy.PredictiveScalingCustomizedScalingMetricProperty {
        val builder = CfnScalingPolicyPredictiveScalingCustomizedScalingMetricPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnScalingPolicyPredictiveScalingMetricSpecificationProperty(
        block: CfnScalingPolicyPredictiveScalingMetricSpecificationPropertyDsl.() -> Unit =
            {},
    ): CfnScalingPolicy.PredictiveScalingMetricSpecificationProperty {
        val builder = CfnScalingPolicyPredictiveScalingMetricSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnScalingPolicyPredictiveScalingPredefinedLoadMetricProperty(
        block: CfnScalingPolicyPredictiveScalingPredefinedLoadMetricPropertyDsl.() -> Unit =
            {},
    ): CfnScalingPolicy.PredictiveScalingPredefinedLoadMetricProperty {
        val builder = CfnScalingPolicyPredictiveScalingPredefinedLoadMetricPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnScalingPolicyPredictiveScalingPredefinedMetricPairProperty(
        block: CfnScalingPolicyPredictiveScalingPredefinedMetricPairPropertyDsl.() -> Unit =
            {},
    ): CfnScalingPolicy.PredictiveScalingPredefinedMetricPairProperty {
        val builder = CfnScalingPolicyPredictiveScalingPredefinedMetricPairPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnScalingPolicyPredictiveScalingPredefinedScalingMetricProperty(
        block: CfnScalingPolicyPredictiveScalingPredefinedScalingMetricPropertyDsl.() -> Unit =
            {},
    ): CfnScalingPolicy.PredictiveScalingPredefinedScalingMetricProperty {
        val builder = CfnScalingPolicyPredictiveScalingPredefinedScalingMetricPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnScalingPolicyProps(block: CfnScalingPolicyPropsDsl.() -> Unit = {}): CfnScalingPolicyProps {
        val builder = CfnScalingPolicyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnScalingPolicyStepAdjustmentProperty(
        block: CfnScalingPolicyStepAdjustmentPropertyDsl.() -> Unit =
            {},
    ): CfnScalingPolicy.StepAdjustmentProperty {
        val builder = CfnScalingPolicyStepAdjustmentPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnScalingPolicyTargetTrackingConfigurationProperty(
        block: CfnScalingPolicyTargetTrackingConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnScalingPolicy.TargetTrackingConfigurationProperty {
        val builder = CfnScalingPolicyTargetTrackingConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnScheduledAction(
        scope: Construct,
        id: String,
        block: CfnScheduledActionDsl.() -> Unit = {},
    ): CfnScheduledAction {
        val builder = CfnScheduledActionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnScheduledActionProps(block: CfnScheduledActionPropsDsl.() -> Unit = {}): CfnScheduledActionProps {
        val builder = CfnScheduledActionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnWarmPool(
        scope: Construct,
        id: String,
        block: CfnWarmPoolDsl.() -> Unit = {},
    ): CfnWarmPool {
        val builder = CfnWarmPoolDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnWarmPoolInstanceReusePolicyProperty(
        block: CfnWarmPoolInstanceReusePolicyPropertyDsl.() -> Unit =
            {},
    ): CfnWarmPool.InstanceReusePolicyProperty {
        val builder = CfnWarmPoolInstanceReusePolicyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnWarmPoolProps(block: CfnWarmPoolPropsDsl.() -> Unit = {}): CfnWarmPoolProps {
        val builder = CfnWarmPoolPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun commonAutoScalingGroupProps(
        block: CommonAutoScalingGroupPropsDsl.() -> Unit =
            {},
    ): CommonAutoScalingGroupProps {
        val builder = CommonAutoScalingGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cpuUtilizationScalingProps(
        block: CpuUtilizationScalingPropsDsl.() -> Unit =
            {},
    ): CpuUtilizationScalingProps {
        val builder = CpuUtilizationScalingPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cronOptions(block: CronOptionsDsl.() -> Unit = {}): CronOptions {
        val builder = CronOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun ebsDeviceOptions(block: EbsDeviceOptionsDsl.() -> Unit = {}): EbsDeviceOptions {
        val builder = EbsDeviceOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun ebsDeviceOptionsBase(block: EbsDeviceOptionsBaseDsl.() -> Unit = {}): EbsDeviceOptionsBase {
        val builder = EbsDeviceOptionsBaseDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun ebsDeviceProps(block: EbsDevicePropsDsl.() -> Unit = {}): EbsDeviceProps {
        val builder = EbsDevicePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun ebsDeviceSnapshotOptions(block: EbsDeviceSnapshotOptionsDsl.() -> Unit = {}): EbsDeviceSnapshotOptions {
        val builder = EbsDeviceSnapshotOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun ec2HealthCheckOptions(block: Ec2HealthCheckOptionsDsl.() -> Unit = {}): Ec2HealthCheckOptions {
        val builder = Ec2HealthCheckOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun elbHealthCheckOptions(block: ElbHealthCheckOptionsDsl.() -> Unit = {}): ElbHealthCheckOptions {
        val builder = ElbHealthCheckOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun instancesDistribution(block: InstancesDistributionDsl.() -> Unit = {}): InstancesDistribution {
        val builder = InstancesDistributionDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun launchTemplateOverrides(block: LaunchTemplateOverridesDsl.() -> Unit = {}): LaunchTemplateOverrides {
        val builder = LaunchTemplateOverridesDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun lifecycleHook(
        scope: Construct,
        id: String,
        block: LifecycleHookDsl.() -> Unit = {},
    ): LifecycleHook {
        val builder = LifecycleHookDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun lifecycleHookProps(block: LifecycleHookPropsDsl.() -> Unit = {}): LifecycleHookProps {
        val builder = LifecycleHookPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun lifecycleHookTargetConfig(block: LifecycleHookTargetConfigDsl.() -> Unit = {}): LifecycleHookTargetConfig {
        val builder = LifecycleHookTargetConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun metricTargetTrackingProps(block: MetricTargetTrackingPropsDsl.() -> Unit = {}): MetricTargetTrackingProps {
        val builder = MetricTargetTrackingPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun mixedInstancesPolicy(block: MixedInstancesPolicyDsl.() -> Unit = {}): MixedInstancesPolicy {
        val builder = MixedInstancesPolicyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun networkUtilizationScalingProps(block: NetworkUtilizationScalingPropsDsl.() -> Unit = {}): NetworkUtilizationScalingProps {
        val builder = NetworkUtilizationScalingPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun notificationConfiguration(block: NotificationConfigurationDsl.() -> Unit = {}): NotificationConfiguration {
        val builder = NotificationConfigurationDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun renderSignalsOptions(block: RenderSignalsOptionsDsl.() -> Unit = {}): RenderSignalsOptions {
        val builder = RenderSignalsOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun requestCountScalingProps(block: RequestCountScalingPropsDsl.() -> Unit = {}): RequestCountScalingProps {
        val builder = RequestCountScalingPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun rollingUpdateOptions(block: RollingUpdateOptionsDsl.() -> Unit = {}): RollingUpdateOptions {
        val builder = RollingUpdateOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun scalingInterval(block: ScalingIntervalDsl.() -> Unit = {}): ScalingInterval {
        val builder = ScalingIntervalDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun scheduledAction(
        scope: Construct,
        id: String,
        block: ScheduledActionDsl.() -> Unit = {},
    ): ScheduledAction {
        val builder = ScheduledActionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun scheduledActionProps(block: ScheduledActionPropsDsl.() -> Unit = {}): ScheduledActionProps {
        val builder = ScheduledActionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun signalsOptions(block: SignalsOptionsDsl.() -> Unit = {}): SignalsOptions {
        val builder = SignalsOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun stepScalingAction(
        scope: Construct,
        id: String,
        block: StepScalingActionDsl.() -> Unit = {},
    ): StepScalingAction {
        val builder = StepScalingActionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun stepScalingActionProps(block: StepScalingActionPropsDsl.() -> Unit = {}): StepScalingActionProps {
        val builder = StepScalingActionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun stepScalingPolicy(
        scope: Construct,
        id: String,
        block: StepScalingPolicyDsl.() -> Unit = {},
    ): StepScalingPolicy {
        val builder = StepScalingPolicyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun stepScalingPolicyProps(block: StepScalingPolicyPropsDsl.() -> Unit = {}): StepScalingPolicyProps {
        val builder = StepScalingPolicyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun targetTrackingScalingPolicy(
        scope: Construct,
        id: String,
        block: TargetTrackingScalingPolicyDsl.() -> Unit = {},
    ): TargetTrackingScalingPolicy {
        val builder = TargetTrackingScalingPolicyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun targetTrackingScalingPolicyProps(
        block: TargetTrackingScalingPolicyPropsDsl.() -> Unit =
            {},
    ): TargetTrackingScalingPolicyProps {
        val builder = TargetTrackingScalingPolicyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun warmPool(
        scope: Construct,
        id: String,
        block: WarmPoolDsl.() -> Unit = {},
    ): WarmPool {
        val builder = WarmPoolDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun warmPoolOptions(block: WarmPoolOptionsDsl.() -> Unit = {}): WarmPoolOptions {
        val builder = WarmPoolOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun warmPoolProps(block: WarmPoolPropsDsl.() -> Unit = {}): WarmPoolProps {
        val builder = WarmPoolPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
