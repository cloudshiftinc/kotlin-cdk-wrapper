@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.autoscaling

import kotlin.String
import kotlin.Unit
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

public object autoscaling {
    /**
     * An adjustment.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.autoscaling.*;
     * AdjustmentTier adjustmentTier = AdjustmentTier.builder()
     * .adjustment(123)
     * // the properties below are optional
     * .lowerBound(123)
     * .upperBound(123)
     * .build();
     * ```
     */
    public inline fun adjustmentTier(block: AdjustmentTierDsl.() -> Unit = {}): AdjustmentTier {
        val builder = AdjustmentTierDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for applying CloudFormation init to an instance or instance group.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.autoscaling.*;
     * ApplyCloudFormationInitOptions applyCloudFormationInitOptions =
     * ApplyCloudFormationInitOptions.builder()
     * .configSets(List.of("configSets"))
     * .embedFingerprint(false)
     * .ignoreFailures(false)
     * .includeRole(false)
     * .includeUrl(false)
     * .printLog(false)
     * .build();
     * ```
     */
    public inline fun applyCloudFormationInitOptions(
        block: ApplyCloudFormationInitOptionsDsl.() -> Unit = {}
    ): ApplyCloudFormationInitOptions {
        val builder = ApplyCloudFormationInitOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A Fleet represents a managed set of EC2 instances.
     *
     * The Fleet models a number of AutoScalingGroups, a launch configuration, a security group and
     * an instance role.
     *
     * It allows adding arbitrary commands to the startup scripts of the instances in the fleet.
     *
     * The ASG spans the availability zones specified by vpcSubnets, falling back to the Vpc default
     * strategy if not specified.
     *
     * Example:
     * ```
     * Vpc vpc;
     * InstanceType instanceType;
     * IMachineImage machineImage;
     * AutoScalingGroup.Builder.create(this, "ASG")
     * .vpc(vpc)
     * .instanceType(instanceType)
     * .machineImage(machineImage)
     * // ...
     * .init(CloudFormationInit.fromElements(InitFile.fromString("/etc/my_instance", "This got written
     * during instance startup")))
     * .signals(Signals.waitForAll(SignalsOptions.builder()
     * .timeout(Duration.minutes(10))
     * .build()))
     * .build();
     * ```
     */
    public inline fun autoScalingGroup(
        scope: Construct,
        id: String,
        block: AutoScalingGroupDsl.() -> Unit = {},
    ): AutoScalingGroup {
        val builder = AutoScalingGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties of a Fleet.
     *
     * Example:
     * ```
     * Vpc vpc;
     * InstanceType instanceType;
     * IMachineImage machineImage;
     * AutoScalingGroup.Builder.create(this, "ASG")
     * .vpc(vpc)
     * .instanceType(instanceType)
     * .machineImage(machineImage)
     * // ...
     * .init(CloudFormationInit.fromElements(InitFile.fromString("/etc/my_instance", "This got written
     * during instance startup")))
     * .signals(Signals.waitForAll(SignalsOptions.builder()
     * .timeout(Duration.minutes(10))
     * .build()))
     * .build();
     * ```
     */
    public inline fun autoScalingGroupProps(
        block: AutoScalingGroupPropsDsl.() -> Unit = {}
    ): AutoScalingGroupProps {
        val builder = AutoScalingGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Base interface for target tracking props.
     *
     * Contains the attributes that are common to target tracking policies, except the ones relating
     * to the metric and to the scalable target.
     *
     * This interface is reused by more specific target tracking props objects.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.autoscaling.*;
     * BaseTargetTrackingProps baseTargetTrackingProps = BaseTargetTrackingProps.builder()
     * .cooldown(Duration.minutes(30))
     * .disableScaleIn(false)
     * .estimatedInstanceWarmup(Duration.minutes(30))
     * .build();
     * ```
     */
    public inline fun baseTargetTrackingProps(
        block: BaseTargetTrackingPropsDsl.() -> Unit = {}
    ): BaseTargetTrackingProps {
        val builder = BaseTargetTrackingPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Basic properties for a lifecycle hook.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.autoscaling.*;
     * import software.amazon.awscdk.services.iam.*;
     * ILifecycleHookTarget lifecycleHookTarget;
     * Role role;
     * BasicLifecycleHookProps basicLifecycleHookProps = BasicLifecycleHookProps.builder()
     * .lifecycleTransition(LifecycleTransition.INSTANCE_LAUNCHING)
     * // the properties below are optional
     * .defaultResult(DefaultResult.CONTINUE)
     * .heartbeatTimeout(Duration.minutes(30))
     * .lifecycleHookName("lifecycleHookName")
     * .notificationMetadata("notificationMetadata")
     * .notificationTarget(lifecycleHookTarget)
     * .role(role)
     * .build();
     * ```
     */
    public inline fun basicLifecycleHookProps(
        block: BasicLifecycleHookPropsDsl.() -> Unit = {}
    ): BasicLifecycleHookProps {
        val builder = BasicLifecycleHookPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a scheduled scaling action.
     *
     * Example:
     * ```
     * AutoScalingGroup autoScalingGroup;
     * autoScalingGroup.scaleOnSchedule("PrescaleInTheMorning", BasicScheduledActionProps.builder()
     * .schedule(Schedule.cron(CronOptions.builder().hour("8").minute("0").build()))
     * .minCapacity(20)
     * .build());
     * autoScalingGroup.scaleOnSchedule("AllowDownscalingAtNight", BasicScheduledActionProps.builder()
     * .schedule(Schedule.cron(CronOptions.builder().hour("20").minute("0").build()))
     * .minCapacity(1)
     * .build());
     * ```
     */
    public inline fun basicScheduledActionProps(
        block: BasicScheduledActionPropsDsl.() -> Unit = {}
    ): BasicScheduledActionProps {
        val builder = BasicScheduledActionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * AutoScalingGroup autoScalingGroup;
     * Metric workerUtilizationMetric = Metric.Builder.create()
     * .namespace("MyService")
     * .metricName("WorkerUtilization")
     * .build();
     * autoScalingGroup.scaleOnMetric("ScaleToCPU", BasicStepScalingPolicyProps.builder()
     * .metric(workerUtilizationMetric)
     * .scalingSteps(List.of(ScalingInterval.builder().upper(10).change(-1).build(),
     * ScalingInterval.builder().lower(50).change(+1).build(),
     * ScalingInterval.builder().lower(70).change(+3).build()))
     * // Change this to AdjustmentType.PERCENT_CHANGE_IN_CAPACITY to interpret the
     * // 'change' numbers before as percentages instead of capacity counts.
     * .adjustmentType(AdjustmentType.CHANGE_IN_CAPACITY)
     * .build());
     * ```
     */
    public inline fun basicStepScalingPolicyProps(
        block: BasicStepScalingPolicyPropsDsl.() -> Unit = {}
    ): BasicStepScalingPolicyProps {
        val builder = BasicStepScalingPolicyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a Target Tracking policy that include the metric but exclude the target.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.autoscaling.*;
     * import software.amazon.awscdk.services.cloudwatch.*;
     * Metric metric;
     * BasicTargetTrackingScalingPolicyProps basicTargetTrackingScalingPolicyProps =
     * BasicTargetTrackingScalingPolicyProps.builder()
     * .targetValue(123)
     * // the properties below are optional
     * .cooldown(Duration.minutes(30))
     * .customMetric(metric)
     * .disableScaleIn(false)
     * .estimatedInstanceWarmup(Duration.minutes(30))
     * .predefinedMetric(PredefinedMetric.ASG_AVERAGE_CPU_UTILIZATION)
     * .resourceLabel("resourceLabel")
     * .build();
     * ```
     */
    public inline fun basicTargetTrackingScalingPolicyProps(
        block: BasicTargetTrackingScalingPolicyPropsDsl.() -> Unit = {}
    ): BasicTargetTrackingScalingPolicyProps {
        val builder = BasicTargetTrackingScalingPolicyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options needed to bind a target to a lifecycle hook.
     *
     * [disable-awslint:ref-via-interface] The lifecycle hook to attach to and an IRole to use
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.autoscaling.*;
     * import software.amazon.awscdk.services.iam.*;
     * LifecycleHook lifecycleHook;
     * Role role;
     * BindHookTargetOptions bindHookTargetOptions = BindHookTargetOptions.builder()
     * .lifecycleHook(lifecycleHook)
     * // the properties below are optional
     * .role(role)
     * .build();
     * ```
     */
    public inline fun bindHookTargetOptions(
        block: BindHookTargetOptionsDsl.() -> Unit = {}
    ): BindHookTargetOptions {
        val builder = BindHookTargetOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Block device.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.autoscaling.*;
     * BlockDeviceVolume blockDeviceVolume;
     * BlockDevice blockDevice = BlockDevice.builder()
     * .deviceName("deviceName")
     * .volume(blockDeviceVolume)
     * .build();
     * ```
     */
    public inline fun blockDevice(block: BlockDeviceDsl.() -> Unit = {}): BlockDevice {
        val builder = BlockDeviceDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::AutoScaling::AutoScalingGroup` resource defines an Amazon EC2 Auto Scaling group,
     * which is a collection of Amazon EC2 instances that are treated as a logical grouping for the
     * purposes of automatic scaling and management.
     *
     * For more information about Amazon EC2 Auto Scaling, see the
     * [Amazon EC2 Auto Scaling User Guide](https://docs.aws.amazon.com/autoscaling/ec2/userguide/what-is-amazon-ec2-auto-scaling.html)
     * .
     *
     * Amazon EC2 Auto Scaling configures instances launched as part of an Auto Scaling group using
     * either a
     * [launch template](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html)
     * or a launch configuration. We strongly recommend that you do not use launch configurations.
     * They do not provide full functionality for Amazon EC2 Auto Scaling or Amazon EC2. For more
     * information, see
     * [Launch configurations](https://docs.aws.amazon.com/autoscaling/ec2/userguide/launch-configurations.html)
     * and
     * [Migrate AWS CloudFormation stacks from launch configurations to launch templates](https://docs.aws.amazon.com/autoscaling/ec2/userguide/migrate-launch-configurations-with-cloudformation.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.autoscaling.*;
     * CfnAutoScalingGroup cfnAutoScalingGroup = CfnAutoScalingGroup.Builder.create(this,
     * "MyCfnAutoScalingGroup")
     * .maxSize("maxSize")
     * .minSize("minSize")
     * // the properties below are optional
     * .autoScalingGroupName("autoScalingGroupName")
     * .availabilityZones(List.of("availabilityZones"))
     * .capacityRebalance(false)
     * .context("context")
     * .cooldown("cooldown")
     * .defaultInstanceWarmup(123)
     * .desiredCapacity("desiredCapacity")
     * .desiredCapacityType("desiredCapacityType")
     * .healthCheckGracePeriod(123)
     * .healthCheckType("healthCheckType")
     * .instanceId("instanceId")
     * .launchConfigurationName("launchConfigurationName")
     * .launchTemplate(LaunchTemplateSpecificationProperty.builder()
     * .version("version")
     * // the properties below are optional
     * .launchTemplateId("launchTemplateId")
     * .launchTemplateName("launchTemplateName")
     * .build())
     * .lifecycleHookSpecificationList(List.of(LifecycleHookSpecificationProperty.builder()
     * .lifecycleHookName("lifecycleHookName")
     * .lifecycleTransition("lifecycleTransition")
     * // the properties below are optional
     * .defaultResult("defaultResult")
     * .heartbeatTimeout(123)
     * .notificationMetadata("notificationMetadata")
     * .notificationTargetArn("notificationTargetArn")
     * .roleArn("roleArn")
     * .build()))
     * .loadBalancerNames(List.of("loadBalancerNames"))
     * .maxInstanceLifetime(123)
     * .metricsCollection(List.of(MetricsCollectionProperty.builder()
     * .granularity("granularity")
     * // the properties below are optional
     * .metrics(List.of("metrics"))
     * .build()))
     * .mixedInstancesPolicy(MixedInstancesPolicyProperty.builder()
     * .launchTemplate(LaunchTemplateProperty.builder()
     * .launchTemplateSpecification(LaunchTemplateSpecificationProperty.builder()
     * .version("version")
     * // the properties below are optional
     * .launchTemplateId("launchTemplateId")
     * .launchTemplateName("launchTemplateName")
     * .build())
     * // the properties below are optional
     * .overrides(List.of(LaunchTemplateOverridesProperty.builder()
     * .instanceRequirements(InstanceRequirementsProperty.builder()
     * .acceleratorCount(AcceleratorCountRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .acceleratorManufacturers(List.of("acceleratorManufacturers"))
     * .acceleratorNames(List.of("acceleratorNames"))
     * .acceleratorTotalMemoryMiB(AcceleratorTotalMemoryMiBRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .acceleratorTypes(List.of("acceleratorTypes"))
     * .allowedInstanceTypes(List.of("allowedInstanceTypes"))
     * .bareMetal("bareMetal")
     * .baselineEbsBandwidthMbps(BaselineEbsBandwidthMbpsRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .burstablePerformance("burstablePerformance")
     * .cpuManufacturers(List.of("cpuManufacturers"))
     * .excludedInstanceTypes(List.of("excludedInstanceTypes"))
     * .instanceGenerations(List.of("instanceGenerations"))
     * .localStorage("localStorage")
     * .localStorageTypes(List.of("localStorageTypes"))
     * .memoryGiBPerVCpu(MemoryGiBPerVCpuRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .memoryMiB(MemoryMiBRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .networkBandwidthGbps(NetworkBandwidthGbpsRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .networkInterfaceCount(NetworkInterfaceCountRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .onDemandMaxPricePercentageOverLowestPrice(123)
     * .requireHibernateSupport(false)
     * .spotMaxPricePercentageOverLowestPrice(123)
     * .totalLocalStorageGb(TotalLocalStorageGBRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .vCpuCount(VCpuCountRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .build())
     * .instanceType("instanceType")
     * .launchTemplateSpecification(LaunchTemplateSpecificationProperty.builder()
     * .version("version")
     * // the properties below are optional
     * .launchTemplateId("launchTemplateId")
     * .launchTemplateName("launchTemplateName")
     * .build())
     * .weightedCapacity("weightedCapacity")
     * .build()))
     * .build())
     * // the properties below are optional
     * .instancesDistribution(InstancesDistributionProperty.builder()
     * .onDemandAllocationStrategy("onDemandAllocationStrategy")
     * .onDemandBaseCapacity(123)
     * .onDemandPercentageAboveBaseCapacity(123)
     * .spotAllocationStrategy("spotAllocationStrategy")
     * .spotInstancePools(123)
     * .spotMaxPrice("spotMaxPrice")
     * .build())
     * .build())
     * .newInstancesProtectedFromScaleIn(false)
     * .notificationConfigurations(List.of(NotificationConfigurationProperty.builder()
     * .topicArn("topicArn")
     * // the properties below are optional
     * .notificationTypes(List.of("notificationTypes"))
     * .build()))
     * .placementGroup("placementGroup")
     * .serviceLinkedRoleArn("serviceLinkedRoleArn")
     * .tags(List.of(TagPropertyProperty.builder()
     * .key("key")
     * .propagateAtLaunch(false)
     * .value("value")
     * .build()))
     * .targetGroupArns(List.of("targetGroupArns"))
     * .terminationPolicies(List.of("terminationPolicies"))
     * .vpcZoneIdentifier(List.of("vpcZoneIdentifier"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html)
     */
    public inline fun cfnAutoScalingGroup(
        scope: Construct,
        id: String,
        block: CfnAutoScalingGroupDsl.() -> Unit = {},
    ): CfnAutoScalingGroup {
        val builder = CfnAutoScalingGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * `AcceleratorCountRequest` is a property of the `InstanceRequirements` property of the
     * [AWS::AutoScaling::AutoScalingGroup LaunchTemplateOverrides](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplateoverrides.html)
     * property type that describes the minimum and maximum number of accelerators for an instance
     * type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.autoscaling.*;
     * AcceleratorCountRequestProperty acceleratorCountRequestProperty =
     * AcceleratorCountRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-acceleratorcountrequest.html)
     */
    public inline fun cfnAutoScalingGroupAcceleratorCountRequestProperty(
        block: CfnAutoScalingGroupAcceleratorCountRequestPropertyDsl.() -> Unit = {}
    ): CfnAutoScalingGroup.AcceleratorCountRequestProperty {
        val builder = CfnAutoScalingGroupAcceleratorCountRequestPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `AcceleratorTotalMemoryMiBRequest` is a property of the `InstanceRequirements` property of
     * the
     * [AWS::AutoScaling::AutoScalingGroup LaunchTemplateOverrides](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplateoverrides.html)
     * property type that describes the minimum and maximum total memory size for the accelerators
     * for an instance type, in MiB.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.autoscaling.*;
     * AcceleratorTotalMemoryMiBRequestProperty acceleratorTotalMemoryMiBRequestProperty =
     * AcceleratorTotalMemoryMiBRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-acceleratortotalmemorymibrequest.html)
     */
    public inline fun cfnAutoScalingGroupAcceleratorTotalMemoryMiBRequestProperty(
        block: CfnAutoScalingGroupAcceleratorTotalMemoryMiBRequestPropertyDsl.() -> Unit = {}
    ): CfnAutoScalingGroup.AcceleratorTotalMemoryMiBRequestProperty {
        val builder = CfnAutoScalingGroupAcceleratorTotalMemoryMiBRequestPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `BaselineEbsBandwidthMbpsRequest` is a property of the `InstanceRequirements` property of the
     * [AWS::AutoScaling::AutoScalingGroup LaunchTemplateOverrides](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplateoverrides.html)
     * property type that describes the minimum and maximum baseline bandwidth performance for an
     * instance type, in Mbps.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.autoscaling.*;
     * BaselineEbsBandwidthMbpsRequestProperty baselineEbsBandwidthMbpsRequestProperty =
     * BaselineEbsBandwidthMbpsRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-baselineebsbandwidthmbpsrequest.html)
     */
    public inline fun cfnAutoScalingGroupBaselineEbsBandwidthMbpsRequestProperty(
        block: CfnAutoScalingGroupBaselineEbsBandwidthMbpsRequestPropertyDsl.() -> Unit = {}
    ): CfnAutoScalingGroup.BaselineEbsBandwidthMbpsRequestProperty {
        val builder = CfnAutoScalingGroupBaselineEbsBandwidthMbpsRequestPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The attributes for the instance types for a mixed instances policy.
     *
     * Amazon EC2 Auto Scaling uses your specified requirements to identify instance types. Then, it
     * uses your On-Demand and Spot allocation strategies to launch instances from these instance
     * types.
     *
     * When you specify multiple attributes, you get instance types that satisfy all of the
     * specified attributes. If you specify multiple values for an attribute, you get instance types
     * that satisfy any of the specified values.
     *
     * To limit the list of instance types from which Amazon EC2 Auto Scaling can identify matching
     * instance types, you can use one of the following parameters, but not both in the same
     * request:
     * * `AllowedInstanceTypes` - The instance types to include in the list. All other instance
     *   types are ignored, even if they match your specified attributes.
     * * `ExcludedInstanceTypes` - The instance types to exclude from the list, even if they match
     *   your specified attributes.
     *
     * You must specify `VCpuCount` and `MemoryMiB` . All other attributes are optional. Any
     * unspecified optional attribute is set to its default.
     *
     * For an example template, see
     * [Auto scaling template snippets](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/quickref-autoscaling.html)
     * .
     *
     * For more information, see
     * [Creating an Auto Scaling group using attribute-based instance type selection](https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-asg-instance-type-requirements.html)
     * in the *Amazon EC2 Auto Scaling User Guide* . For help determining which instance types match
     * your attributes before you apply them to your Auto Scaling group, see
     * [Preview instance types with specified attributes](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-fleet-attribute-based-instance-type-selection.html#ec2fleet-get-instance-types-from-instance-requirements)
     * in the *Amazon EC2 User Guide for Linux Instances* .
     *
     * `InstanceRequirements` is a property of the `LaunchTemplateOverrides` property of the
     * [AWS::AutoScaling::AutoScalingGroup LaunchTemplate](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplate.html)
     * property type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.autoscaling.*;
     * InstanceRequirementsProperty instanceRequirementsProperty =
     * InstanceRequirementsProperty.builder()
     * .acceleratorCount(AcceleratorCountRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .acceleratorManufacturers(List.of("acceleratorManufacturers"))
     * .acceleratorNames(List.of("acceleratorNames"))
     * .acceleratorTotalMemoryMiB(AcceleratorTotalMemoryMiBRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .acceleratorTypes(List.of("acceleratorTypes"))
     * .allowedInstanceTypes(List.of("allowedInstanceTypes"))
     * .bareMetal("bareMetal")
     * .baselineEbsBandwidthMbps(BaselineEbsBandwidthMbpsRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .burstablePerformance("burstablePerformance")
     * .cpuManufacturers(List.of("cpuManufacturers"))
     * .excludedInstanceTypes(List.of("excludedInstanceTypes"))
     * .instanceGenerations(List.of("instanceGenerations"))
     * .localStorage("localStorage")
     * .localStorageTypes(List.of("localStorageTypes"))
     * .memoryGiBPerVCpu(MemoryGiBPerVCpuRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .memoryMiB(MemoryMiBRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .networkBandwidthGbps(NetworkBandwidthGbpsRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .networkInterfaceCount(NetworkInterfaceCountRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .onDemandMaxPricePercentageOverLowestPrice(123)
     * .requireHibernateSupport(false)
     * .spotMaxPricePercentageOverLowestPrice(123)
     * .totalLocalStorageGb(TotalLocalStorageGBRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .vCpuCount(VCpuCountRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-instancerequirements.html)
     */
    public inline fun cfnAutoScalingGroupInstanceRequirementsProperty(
        block: CfnAutoScalingGroupInstanceRequirementsPropertyDsl.() -> Unit = {}
    ): CfnAutoScalingGroup.InstanceRequirementsProperty {
        val builder = CfnAutoScalingGroupInstanceRequirementsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Use this structure to specify the distribution of On-Demand Instances and Spot Instances and
     * the allocation strategies used to fulfill On-Demand and Spot capacities for a mixed instances
     * policy.
     *
     * For more information, see
     * [Auto Scaling groups with multiple instance types and purchase options](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-mixed-instances-groups.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * `InstancesDistribution` is a property of the
     * [AWS::AutoScaling::AutoScalingGroup MixedInstancesPolicy](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-mixedinstancespolicy.html)
     * property type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.autoscaling.*;
     * InstancesDistributionProperty instancesDistributionProperty =
     * InstancesDistributionProperty.builder()
     * .onDemandAllocationStrategy("onDemandAllocationStrategy")
     * .onDemandBaseCapacity(123)
     * .onDemandPercentageAboveBaseCapacity(123)
     * .spotAllocationStrategy("spotAllocationStrategy")
     * .spotInstancePools(123)
     * .spotMaxPrice("spotMaxPrice")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-instancesdistribution.html)
     */
    public inline fun cfnAutoScalingGroupInstancesDistributionProperty(
        block: CfnAutoScalingGroupInstancesDistributionPropertyDsl.() -> Unit = {}
    ): CfnAutoScalingGroup.InstancesDistributionProperty {
        val builder = CfnAutoScalingGroupInstancesDistributionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Use this structure to let Amazon EC2 Auto Scaling do the following when the Auto Scaling
     * group has a mixed instances policy: - Override the instance type that is specified in the
     * launch template.
     * * Use multiple instance types.
     *
     * Specify the instance types that you want, or define your instance requirements instead and
     * let Amazon EC2 Auto Scaling provision the available instance types that meet your
     * requirements. This can provide Amazon EC2 Auto Scaling with a larger selection of instance
     * types to choose from when fulfilling Spot and On-Demand capacities. You can view which
     * instance types are matched before you apply the instance requirements to your Auto Scaling
     * group.
     *
     * After you define your instance requirements, you don't have to keep updating these settings
     * to get new EC2 instance types automatically. Amazon EC2 Auto Scaling uses the instance
     * requirements of the Auto Scaling group to determine whether a new EC2 instance type can be
     * used.
     *
     * `LaunchTemplateOverrides` is a property of the
     * [AWS::AutoScaling::AutoScalingGroup LaunchTemplate](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplate.html)
     * property type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.autoscaling.*;
     * LaunchTemplateOverridesProperty launchTemplateOverridesProperty =
     * LaunchTemplateOverridesProperty.builder()
     * .instanceRequirements(InstanceRequirementsProperty.builder()
     * .acceleratorCount(AcceleratorCountRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .acceleratorManufacturers(List.of("acceleratorManufacturers"))
     * .acceleratorNames(List.of("acceleratorNames"))
     * .acceleratorTotalMemoryMiB(AcceleratorTotalMemoryMiBRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .acceleratorTypes(List.of("acceleratorTypes"))
     * .allowedInstanceTypes(List.of("allowedInstanceTypes"))
     * .bareMetal("bareMetal")
     * .baselineEbsBandwidthMbps(BaselineEbsBandwidthMbpsRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .burstablePerformance("burstablePerformance")
     * .cpuManufacturers(List.of("cpuManufacturers"))
     * .excludedInstanceTypes(List.of("excludedInstanceTypes"))
     * .instanceGenerations(List.of("instanceGenerations"))
     * .localStorage("localStorage")
     * .localStorageTypes(List.of("localStorageTypes"))
     * .memoryGiBPerVCpu(MemoryGiBPerVCpuRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .memoryMiB(MemoryMiBRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .networkBandwidthGbps(NetworkBandwidthGbpsRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .networkInterfaceCount(NetworkInterfaceCountRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .onDemandMaxPricePercentageOverLowestPrice(123)
     * .requireHibernateSupport(false)
     * .spotMaxPricePercentageOverLowestPrice(123)
     * .totalLocalStorageGb(TotalLocalStorageGBRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .vCpuCount(VCpuCountRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .build())
     * .instanceType("instanceType")
     * .launchTemplateSpecification(LaunchTemplateSpecificationProperty.builder()
     * .version("version")
     * // the properties below are optional
     * .launchTemplateId("launchTemplateId")
     * .launchTemplateName("launchTemplateName")
     * .build())
     * .weightedCapacity("weightedCapacity")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplateoverrides.html)
     */
    public inline fun cfnAutoScalingGroupLaunchTemplateOverridesProperty(
        block: CfnAutoScalingGroupLaunchTemplateOverridesPropertyDsl.() -> Unit = {}
    ): CfnAutoScalingGroup.LaunchTemplateOverridesProperty {
        val builder = CfnAutoScalingGroupLaunchTemplateOverridesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Use this structure to specify the launch templates and instance types (overrides) for a mixed
     * instances policy.
     *
     * `LaunchTemplate` is a property of the
     * [AWS::AutoScaling::AutoScalingGroup MixedInstancesPolicy](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-mixedinstancespolicy.html)
     * property type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.autoscaling.*;
     * LaunchTemplateProperty launchTemplateProperty = LaunchTemplateProperty.builder()
     * .launchTemplateSpecification(LaunchTemplateSpecificationProperty.builder()
     * .version("version")
     * // the properties below are optional
     * .launchTemplateId("launchTemplateId")
     * .launchTemplateName("launchTemplateName")
     * .build())
     * // the properties below are optional
     * .overrides(List.of(LaunchTemplateOverridesProperty.builder()
     * .instanceRequirements(InstanceRequirementsProperty.builder()
     * .acceleratorCount(AcceleratorCountRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .acceleratorManufacturers(List.of("acceleratorManufacturers"))
     * .acceleratorNames(List.of("acceleratorNames"))
     * .acceleratorTotalMemoryMiB(AcceleratorTotalMemoryMiBRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .acceleratorTypes(List.of("acceleratorTypes"))
     * .allowedInstanceTypes(List.of("allowedInstanceTypes"))
     * .bareMetal("bareMetal")
     * .baselineEbsBandwidthMbps(BaselineEbsBandwidthMbpsRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .burstablePerformance("burstablePerformance")
     * .cpuManufacturers(List.of("cpuManufacturers"))
     * .excludedInstanceTypes(List.of("excludedInstanceTypes"))
     * .instanceGenerations(List.of("instanceGenerations"))
     * .localStorage("localStorage")
     * .localStorageTypes(List.of("localStorageTypes"))
     * .memoryGiBPerVCpu(MemoryGiBPerVCpuRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .memoryMiB(MemoryMiBRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .networkBandwidthGbps(NetworkBandwidthGbpsRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .networkInterfaceCount(NetworkInterfaceCountRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .onDemandMaxPricePercentageOverLowestPrice(123)
     * .requireHibernateSupport(false)
     * .spotMaxPricePercentageOverLowestPrice(123)
     * .totalLocalStorageGb(TotalLocalStorageGBRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .vCpuCount(VCpuCountRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .build())
     * .instanceType("instanceType")
     * .launchTemplateSpecification(LaunchTemplateSpecificationProperty.builder()
     * .version("version")
     * // the properties below are optional
     * .launchTemplateId("launchTemplateId")
     * .launchTemplateName("launchTemplateName")
     * .build())
     * .weightedCapacity("weightedCapacity")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplate.html)
     */
    public inline fun cfnAutoScalingGroupLaunchTemplateProperty(
        block: CfnAutoScalingGroupLaunchTemplatePropertyDsl.() -> Unit = {}
    ): CfnAutoScalingGroup.LaunchTemplateProperty {
        val builder = CfnAutoScalingGroupLaunchTemplatePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a launch template to use when provisioning EC2 instances for an Auto Scaling group.
     *
     * You must specify the following:
     * * The ID or the name of the launch template, but not both.
     * * The version of the launch template.
     *
     * `LaunchTemplateSpecification` is property of the
     * [AWS::AutoScaling::AutoScalingGroup](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html)
     * resource. It is also a property of the
     * [AWS::AutoScaling::AutoScalingGroup LaunchTemplate](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplate.html)
     * and
     * [AWS::AutoScaling::AutoScalingGroup LaunchTemplateOverrides](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplateoverrides.html)
     * property types.
     *
     * For information about creating a launch template, see
     * [AWS::EC2::LaunchTemplate](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html)
     * and
     * [Create a launch template for an Auto Scaling group](https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-launch-template.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * For examples of launch templates, see
     * [Auto scaling template snippets](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/quickref-autoscaling.html)
     * and the
     * [Examples](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html#aws-resource-ec2-launchtemplate--examples)
     * section in the `AWS::EC2::LaunchTemplate` resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.autoscaling.*;
     * LaunchTemplateSpecificationProperty launchTemplateSpecificationProperty =
     * LaunchTemplateSpecificationProperty.builder()
     * .version("version")
     * // the properties below are optional
     * .launchTemplateId("launchTemplateId")
     * .launchTemplateName("launchTemplateName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplatespecification.html)
     */
    public inline fun cfnAutoScalingGroupLaunchTemplateSpecificationProperty(
        block: CfnAutoScalingGroupLaunchTemplateSpecificationPropertyDsl.() -> Unit = {}
    ): CfnAutoScalingGroup.LaunchTemplateSpecificationProperty {
        val builder = CfnAutoScalingGroupLaunchTemplateSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `LifecycleHookSpecification` specifies a lifecycle hook for the
     * `LifecycleHookSpecificationList` property of the
     * [AWS::AutoScaling::AutoScalingGroup](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html)
     * resource. A lifecycle hook specifies actions to perform when Amazon EC2 Auto Scaling launches
     * or terminates instances.
     *
     * For more information, see
     * [Amazon EC2 Auto Scaling lifecycle hooks](https://docs.aws.amazon.com/autoscaling/ec2/userguide/lifecycle-hooks.html)
     * in the *Amazon EC2 Auto Scaling User Guide* . You can find a sample template snippet in the
     * [Examples](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html#aws-resource-as-lifecyclehook--examples)
     * section of the `AWS::AutoScaling::LifecycleHook` resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.autoscaling.*;
     * LifecycleHookSpecificationProperty lifecycleHookSpecificationProperty =
     * LifecycleHookSpecificationProperty.builder()
     * .lifecycleHookName("lifecycleHookName")
     * .lifecycleTransition("lifecycleTransition")
     * // the properties below are optional
     * .defaultResult("defaultResult")
     * .heartbeatTimeout(123)
     * .notificationMetadata("notificationMetadata")
     * .notificationTargetArn("notificationTargetArn")
     * .roleArn("roleArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-lifecyclehookspecification.html)
     */
    public inline fun cfnAutoScalingGroupLifecycleHookSpecificationProperty(
        block: CfnAutoScalingGroupLifecycleHookSpecificationPropertyDsl.() -> Unit = {}
    ): CfnAutoScalingGroup.LifecycleHookSpecificationProperty {
        val builder = CfnAutoScalingGroupLifecycleHookSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `MemoryGiBPerVCpuRequest` is a property of the `InstanceRequirements` property of the
     * [AWS::AutoScaling::AutoScalingGroup LaunchTemplateOverrides](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplateoverrides.html)
     * property type that describes the minimum and maximum amount of memory per vCPU for an
     * instance type, in GiB.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.autoscaling.*;
     * MemoryGiBPerVCpuRequestProperty memoryGiBPerVCpuRequestProperty =
     * MemoryGiBPerVCpuRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-memorygibpervcpurequest.html)
     */
    public inline fun cfnAutoScalingGroupMemoryGiBPerVCpuRequestProperty(
        block: CfnAutoScalingGroupMemoryGiBPerVCpuRequestPropertyDsl.() -> Unit = {}
    ): CfnAutoScalingGroup.MemoryGiBPerVCpuRequestProperty {
        val builder = CfnAutoScalingGroupMemoryGiBPerVCpuRequestPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `MemoryMiBRequest` is a property of the `InstanceRequirements` property of the
     * [AWS::AutoScaling::AutoScalingGroup LaunchTemplateOverrides](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplateoverrides.html)
     * property type that describes the minimum and maximum instance memory size for an instance
     * type, in MiB.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.autoscaling.*;
     * MemoryMiBRequestProperty memoryMiBRequestProperty = MemoryMiBRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-memorymibrequest.html)
     */
    public inline fun cfnAutoScalingGroupMemoryMiBRequestProperty(
        block: CfnAutoScalingGroupMemoryMiBRequestPropertyDsl.() -> Unit = {}
    ): CfnAutoScalingGroup.MemoryMiBRequestProperty {
        val builder = CfnAutoScalingGroupMemoryMiBRequestPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `MetricsCollection` is a property of the
     * [AWS::AutoScaling::AutoScalingGroup](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html)
     * resource that describes the group metrics that an Amazon EC2 Auto Scaling group sends to
     * Amazon CloudWatch. These metrics describe the group rather than any of its instances.
     *
     * For more information, see
     * [Monitor CloudWatch metrics for your Auto Scaling groups and instances](https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-monitoring.html)
     * in the *Amazon EC2 Auto Scaling User Guide* . You can find a sample template snippet in the
     * [Examples](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#aws-properties-as-group--examples)
     * section of the `AWS::AutoScaling::AutoScalingGroup` resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.autoscaling.*;
     * MetricsCollectionProperty metricsCollectionProperty = MetricsCollectionProperty.builder()
     * .granularity("granularity")
     * // the properties below are optional
     * .metrics(List.of("metrics"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-metricscollection.html)
     */
    public inline fun cfnAutoScalingGroupMetricsCollectionProperty(
        block: CfnAutoScalingGroupMetricsCollectionPropertyDsl.() -> Unit = {}
    ): CfnAutoScalingGroup.MetricsCollectionProperty {
        val builder = CfnAutoScalingGroupMetricsCollectionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Use this structure to launch multiple instance types and On-Demand Instances and Spot
     * Instances within a single Auto Scaling group.
     *
     * A mixed instances policy contains information that Amazon EC2 Auto Scaling can use to launch
     * instances and help optimize your costs. For more information, see
     * [Auto Scaling groups with multiple instance types and purchase options](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-mixed-instances-groups.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * You can create a mixed instances policy for new and existing Auto Scaling groups. You must
     * use a launch template to configure the policy. You cannot use a launch configuration.
     *
     * There are key differences between Spot Instances and On-Demand Instances:
     * * The price for Spot Instances varies based on demand
     * * Amazon EC2 can terminate an individual Spot Instance as the availability of, or price for,
     *   Spot Instances changes
     *
     * When a Spot Instance is terminated, Amazon EC2 Auto Scaling group attempts to launch a
     * replacement instance to maintain the desired capacity for the group.
     *
     * `MixedInstancesPolicy` is a property of the
     * [AWS::AutoScaling::AutoScalingGroup](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html)
     * resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.autoscaling.*;
     * MixedInstancesPolicyProperty mixedInstancesPolicyProperty =
     * MixedInstancesPolicyProperty.builder()
     * .launchTemplate(LaunchTemplateProperty.builder()
     * .launchTemplateSpecification(LaunchTemplateSpecificationProperty.builder()
     * .version("version")
     * // the properties below are optional
     * .launchTemplateId("launchTemplateId")
     * .launchTemplateName("launchTemplateName")
     * .build())
     * // the properties below are optional
     * .overrides(List.of(LaunchTemplateOverridesProperty.builder()
     * .instanceRequirements(InstanceRequirementsProperty.builder()
     * .acceleratorCount(AcceleratorCountRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .acceleratorManufacturers(List.of("acceleratorManufacturers"))
     * .acceleratorNames(List.of("acceleratorNames"))
     * .acceleratorTotalMemoryMiB(AcceleratorTotalMemoryMiBRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .acceleratorTypes(List.of("acceleratorTypes"))
     * .allowedInstanceTypes(List.of("allowedInstanceTypes"))
     * .bareMetal("bareMetal")
     * .baselineEbsBandwidthMbps(BaselineEbsBandwidthMbpsRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .burstablePerformance("burstablePerformance")
     * .cpuManufacturers(List.of("cpuManufacturers"))
     * .excludedInstanceTypes(List.of("excludedInstanceTypes"))
     * .instanceGenerations(List.of("instanceGenerations"))
     * .localStorage("localStorage")
     * .localStorageTypes(List.of("localStorageTypes"))
     * .memoryGiBPerVCpu(MemoryGiBPerVCpuRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .memoryMiB(MemoryMiBRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .networkBandwidthGbps(NetworkBandwidthGbpsRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .networkInterfaceCount(NetworkInterfaceCountRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .onDemandMaxPricePercentageOverLowestPrice(123)
     * .requireHibernateSupport(false)
     * .spotMaxPricePercentageOverLowestPrice(123)
     * .totalLocalStorageGb(TotalLocalStorageGBRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .vCpuCount(VCpuCountRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .build())
     * .instanceType("instanceType")
     * .launchTemplateSpecification(LaunchTemplateSpecificationProperty.builder()
     * .version("version")
     * // the properties below are optional
     * .launchTemplateId("launchTemplateId")
     * .launchTemplateName("launchTemplateName")
     * .build())
     * .weightedCapacity("weightedCapacity")
     * .build()))
     * .build())
     * // the properties below are optional
     * .instancesDistribution(InstancesDistributionProperty.builder()
     * .onDemandAllocationStrategy("onDemandAllocationStrategy")
     * .onDemandBaseCapacity(123)
     * .onDemandPercentageAboveBaseCapacity(123)
     * .spotAllocationStrategy("spotAllocationStrategy")
     * .spotInstancePools(123)
     * .spotMaxPrice("spotMaxPrice")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-mixedinstancespolicy.html)
     */
    public inline fun cfnAutoScalingGroupMixedInstancesPolicyProperty(
        block: CfnAutoScalingGroupMixedInstancesPolicyPropertyDsl.() -> Unit = {}
    ): CfnAutoScalingGroup.MixedInstancesPolicyProperty {
        val builder = CfnAutoScalingGroupMixedInstancesPolicyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `NetworkBandwidthGbpsRequest` is a property of the `InstanceRequirements` property of the
     * [AWS::AutoScaling::AutoScalingGroup LaunchTemplateOverrides](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplateoverrides.html)
     * property type that describes the minimum and maximum network bandwidth for an instance type,
     * in Gbps.
     *
     * Setting the minimum bandwidth does not guarantee that your instance will achieve the minimum
     * bandwidth. Amazon EC2 will identify instance types that support the specified minimum
     * bandwidth, but the actual bandwidth of your instance might go below the specified minimum at
     * times. For more information, see
     * [Available instance bandwidth](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-network-bandwidth.html#available-instance-bandwidth)
     * in the *Amazon EC2 User Guide for Linux Instances* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.autoscaling.*;
     * NetworkBandwidthGbpsRequestProperty networkBandwidthGbpsRequestProperty =
     * NetworkBandwidthGbpsRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-networkbandwidthgbpsrequest.html)
     */
    public inline fun cfnAutoScalingGroupNetworkBandwidthGbpsRequestProperty(
        block: CfnAutoScalingGroupNetworkBandwidthGbpsRequestPropertyDsl.() -> Unit = {}
    ): CfnAutoScalingGroup.NetworkBandwidthGbpsRequestProperty {
        val builder = CfnAutoScalingGroupNetworkBandwidthGbpsRequestPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `NetworkInterfaceCountRequest` is a property of the `InstanceRequirements` property of the
     * [AWS::AutoScaling::AutoScalingGroup LaunchTemplateOverrides](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplateoverrides.html)
     * property type that describes the minimum and maximum number of network interfaces for an
     * instance type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.autoscaling.*;
     * NetworkInterfaceCountRequestProperty networkInterfaceCountRequestProperty =
     * NetworkInterfaceCountRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-networkinterfacecountrequest.html)
     */
    public inline fun cfnAutoScalingGroupNetworkInterfaceCountRequestProperty(
        block: CfnAutoScalingGroupNetworkInterfaceCountRequestPropertyDsl.() -> Unit = {}
    ): CfnAutoScalingGroup.NetworkInterfaceCountRequestProperty {
        val builder = CfnAutoScalingGroupNetworkInterfaceCountRequestPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A structure that specifies an Amazon SNS notification configuration for the
     * `NotificationConfigurations` property of the
     * [AWS::AutoScaling::AutoScalingGroup](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html)
     * resource.
     *
     * For an example template snippet, see
     * [Auto scaling template snippets](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/quickref-autoscaling.html)
     * .
     *
     * For more information, see
     * [Get Amazon SNS notifications when your Auto Scaling group scales](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ASGettingNotifications.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.autoscaling.*;
     * NotificationConfigurationProperty notificationConfigurationProperty =
     * NotificationConfigurationProperty.builder()
     * .topicArn("topicArn")
     * // the properties below are optional
     * .notificationTypes(List.of("notificationTypes"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-notificationconfiguration.html)
     */
    public inline fun cfnAutoScalingGroupNotificationConfigurationProperty(
        block: CfnAutoScalingGroupNotificationConfigurationPropertyDsl.() -> Unit = {}
    ): CfnAutoScalingGroup.NotificationConfigurationProperty {
        val builder = CfnAutoScalingGroupNotificationConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnAutoScalingGroup`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.autoscaling.*;
     * CfnAutoScalingGroupProps cfnAutoScalingGroupProps = CfnAutoScalingGroupProps.builder()
     * .maxSize("maxSize")
     * .minSize("minSize")
     * // the properties below are optional
     * .autoScalingGroupName("autoScalingGroupName")
     * .availabilityZones(List.of("availabilityZones"))
     * .capacityRebalance(false)
     * .context("context")
     * .cooldown("cooldown")
     * .defaultInstanceWarmup(123)
     * .desiredCapacity("desiredCapacity")
     * .desiredCapacityType("desiredCapacityType")
     * .healthCheckGracePeriod(123)
     * .healthCheckType("healthCheckType")
     * .instanceId("instanceId")
     * .launchConfigurationName("launchConfigurationName")
     * .launchTemplate(LaunchTemplateSpecificationProperty.builder()
     * .version("version")
     * // the properties below are optional
     * .launchTemplateId("launchTemplateId")
     * .launchTemplateName("launchTemplateName")
     * .build())
     * .lifecycleHookSpecificationList(List.of(LifecycleHookSpecificationProperty.builder()
     * .lifecycleHookName("lifecycleHookName")
     * .lifecycleTransition("lifecycleTransition")
     * // the properties below are optional
     * .defaultResult("defaultResult")
     * .heartbeatTimeout(123)
     * .notificationMetadata("notificationMetadata")
     * .notificationTargetArn("notificationTargetArn")
     * .roleArn("roleArn")
     * .build()))
     * .loadBalancerNames(List.of("loadBalancerNames"))
     * .maxInstanceLifetime(123)
     * .metricsCollection(List.of(MetricsCollectionProperty.builder()
     * .granularity("granularity")
     * // the properties below are optional
     * .metrics(List.of("metrics"))
     * .build()))
     * .mixedInstancesPolicy(MixedInstancesPolicyProperty.builder()
     * .launchTemplate(LaunchTemplateProperty.builder()
     * .launchTemplateSpecification(LaunchTemplateSpecificationProperty.builder()
     * .version("version")
     * // the properties below are optional
     * .launchTemplateId("launchTemplateId")
     * .launchTemplateName("launchTemplateName")
     * .build())
     * // the properties below are optional
     * .overrides(List.of(LaunchTemplateOverridesProperty.builder()
     * .instanceRequirements(InstanceRequirementsProperty.builder()
     * .acceleratorCount(AcceleratorCountRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .acceleratorManufacturers(List.of("acceleratorManufacturers"))
     * .acceleratorNames(List.of("acceleratorNames"))
     * .acceleratorTotalMemoryMiB(AcceleratorTotalMemoryMiBRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .acceleratorTypes(List.of("acceleratorTypes"))
     * .allowedInstanceTypes(List.of("allowedInstanceTypes"))
     * .bareMetal("bareMetal")
     * .baselineEbsBandwidthMbps(BaselineEbsBandwidthMbpsRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .burstablePerformance("burstablePerformance")
     * .cpuManufacturers(List.of("cpuManufacturers"))
     * .excludedInstanceTypes(List.of("excludedInstanceTypes"))
     * .instanceGenerations(List.of("instanceGenerations"))
     * .localStorage("localStorage")
     * .localStorageTypes(List.of("localStorageTypes"))
     * .memoryGiBPerVCpu(MemoryGiBPerVCpuRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .memoryMiB(MemoryMiBRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .networkBandwidthGbps(NetworkBandwidthGbpsRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .networkInterfaceCount(NetworkInterfaceCountRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .onDemandMaxPricePercentageOverLowestPrice(123)
     * .requireHibernateSupport(false)
     * .spotMaxPricePercentageOverLowestPrice(123)
     * .totalLocalStorageGb(TotalLocalStorageGBRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .vCpuCount(VCpuCountRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .build())
     * .instanceType("instanceType")
     * .launchTemplateSpecification(LaunchTemplateSpecificationProperty.builder()
     * .version("version")
     * // the properties below are optional
     * .launchTemplateId("launchTemplateId")
     * .launchTemplateName("launchTemplateName")
     * .build())
     * .weightedCapacity("weightedCapacity")
     * .build()))
     * .build())
     * // the properties below are optional
     * .instancesDistribution(InstancesDistributionProperty.builder()
     * .onDemandAllocationStrategy("onDemandAllocationStrategy")
     * .onDemandBaseCapacity(123)
     * .onDemandPercentageAboveBaseCapacity(123)
     * .spotAllocationStrategy("spotAllocationStrategy")
     * .spotInstancePools(123)
     * .spotMaxPrice("spotMaxPrice")
     * .build())
     * .build())
     * .newInstancesProtectedFromScaleIn(false)
     * .notificationConfigurations(List.of(NotificationConfigurationProperty.builder()
     * .topicArn("topicArn")
     * // the properties below are optional
     * .notificationTypes(List.of("notificationTypes"))
     * .build()))
     * .placementGroup("placementGroup")
     * .serviceLinkedRoleArn("serviceLinkedRoleArn")
     * .tags(List.of(TagPropertyProperty.builder()
     * .key("key")
     * .propagateAtLaunch(false)
     * .value("value")
     * .build()))
     * .targetGroupArns(List.of("targetGroupArns"))
     * .terminationPolicies(List.of("terminationPolicies"))
     * .vpcZoneIdentifier(List.of("vpcZoneIdentifier"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html)
     */
    public inline fun cfnAutoScalingGroupProps(
        block: CfnAutoScalingGroupPropsDsl.() -> Unit = {}
    ): CfnAutoScalingGroupProps {
        val builder = CfnAutoScalingGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A structure that specifies a tag for the `Tags` property of
     * [AWS::AutoScaling::AutoScalingGroup](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html)
     * resource.
     *
     * For more information, see
     * [Tag Auto Scaling groups and instances](https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-tagging.html)
     * in the *Amazon EC2 Auto Scaling User Guide* . You can find a sample template snippet in the
     * [Examples](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#aws-properties-as-group--examples)
     * section of the `AWS::AutoScaling::AutoScalingGroup` resource.
     *
     * CloudFormation adds the following tags to all Auto Scaling groups and associated instances:
     * * aws:cloudformation:stack-name
     * * aws:cloudformation:stack-id
     * * aws:cloudformation:logical-id
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.autoscaling.*;
     * TagPropertyProperty tagPropertyProperty = TagPropertyProperty.builder()
     * .key("key")
     * .propagateAtLaunch(false)
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-tagproperty.html)
     */
    public inline fun cfnAutoScalingGroupTagPropertyProperty(
        block: CfnAutoScalingGroupTagPropertyPropertyDsl.() -> Unit = {}
    ): CfnAutoScalingGroup.TagPropertyProperty {
        val builder = CfnAutoScalingGroupTagPropertyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `TotalLocalStorageGBRequest` is a property of the `InstanceRequirements` property of the
     * [AWS::AutoScaling::AutoScalingGroup LaunchTemplateOverrides](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplateoverrides.html)
     * property type that describes the minimum and maximum total local storage size for an instance
     * type, in GB.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.autoscaling.*;
     * TotalLocalStorageGBRequestProperty totalLocalStorageGBRequestProperty =
     * TotalLocalStorageGBRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-totallocalstoragegbrequest.html)
     */
    public inline fun cfnAutoScalingGroupTotalLocalStorageGBRequestProperty(
        block: CfnAutoScalingGroupTotalLocalStorageGBRequestPropertyDsl.() -> Unit = {}
    ): CfnAutoScalingGroup.TotalLocalStorageGBRequestProperty {
        val builder = CfnAutoScalingGroupTotalLocalStorageGBRequestPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `VCpuCountRequest` is a property of the `InstanceRequirements` property of the
     * [AWS::AutoScaling::AutoScalingGroup LaunchTemplateOverrides](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplateoverrides.html)
     * property type that describes the minimum and maximum number of vCPUs for an instance type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.autoscaling.*;
     * VCpuCountRequestProperty vCpuCountRequestProperty = VCpuCountRequestProperty.builder()
     * .max(123)
     * .min(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-vcpucountrequest.html)
     */
    public inline fun cfnAutoScalingGroupVCpuCountRequestProperty(
        block: CfnAutoScalingGroupVCpuCountRequestPropertyDsl.() -> Unit = {}
    ): CfnAutoScalingGroup.VCpuCountRequestProperty {
        val builder = CfnAutoScalingGroupVCpuCountRequestPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::AutoScaling::LaunchConfiguration` resource specifies the launch configuration that
     * can be used by an Auto Scaling group to configure Amazon EC2 instances.
     *
     * When you update the launch configuration for an Auto Scaling group, CloudFormation deletes
     * that resource and creates a new launch configuration with the updated properties and a new
     * name. Existing instances are not affected. To update existing instances when you update the
     * `AWS::AutoScaling::LaunchConfiguration` resource, you can specify an
     * [UpdatePolicy attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-updatepolicy.html)
     * for the group. You can find sample update policies for rolling updates in
     * [Auto scaling template snippets](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/quickref-autoscaling.html)
     * .
     *
     * Amazon EC2 Auto Scaling configures instances launched as part of an Auto Scaling group using
     * either a
     * [launch template](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html)
     * or a launch configuration. We strongly recommend that you do not use launch configurations.
     * They do not provide full functionality for Amazon EC2 Auto Scaling or Amazon EC2. For more
     * information, see
     * [Launch configurations](https://docs.aws.amazon.com/autoscaling/ec2/userguide/launch-configurations.html)
     * and
     * [Migrate AWS CloudFormation stacks from launch configurations to launch templates](https://docs.aws.amazon.com/autoscaling/ec2/userguide/migrate-launch-configurations-with-cloudformation.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.autoscaling.*;
     * CfnLaunchConfiguration cfnLaunchConfiguration = CfnLaunchConfiguration.Builder.create(this,
     * "MyCfnLaunchConfiguration")
     * .imageId("imageId")
     * .instanceType("instanceType")
     * // the properties below are optional
     * .associatePublicIpAddress(false)
     * .blockDeviceMappings(List.of(BlockDeviceMappingProperty.builder()
     * .deviceName("deviceName")
     * // the properties below are optional
     * .ebs(BlockDeviceProperty.builder()
     * .deleteOnTermination(false)
     * .encrypted(false)
     * .iops(123)
     * .snapshotId("snapshotId")
     * .throughput(123)
     * .volumeSize(123)
     * .volumeType("volumeType")
     * .build())
     * .noDevice(false)
     * .virtualName("virtualName")
     * .build()))
     * .classicLinkVpcId("classicLinkVpcId")
     * .classicLinkVpcSecurityGroups(List.of("classicLinkVpcSecurityGroups"))
     * .ebsOptimized(false)
     * .iamInstanceProfile("iamInstanceProfile")
     * .instanceId("instanceId")
     * .instanceMonitoring(false)
     * .kernelId("kernelId")
     * .keyName("keyName")
     * .launchConfigurationName("launchConfigurationName")
     * .metadataOptions(MetadataOptionsProperty.builder()
     * .httpEndpoint("httpEndpoint")
     * .httpPutResponseHopLimit(123)
     * .httpTokens("httpTokens")
     * .build())
     * .placementTenancy("placementTenancy")
     * .ramDiskId("ramDiskId")
     * .securityGroups(List.of("securityGroups"))
     * .spotPrice("spotPrice")
     * .userData("userData")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html)
     */
    public inline fun cfnLaunchConfiguration(
        scope: Construct,
        id: String,
        block: CfnLaunchConfigurationDsl.() -> Unit = {},
    ): CfnLaunchConfiguration {
        val builder = CfnLaunchConfigurationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * `BlockDeviceMapping` specifies a block device mapping for the `BlockDeviceMappings` property
     * of the
     * [AWS::AutoScaling::LaunchConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html)
     * resource.
     *
     * Each instance that is launched has an associated root device volume, either an Amazon EBS
     * volume or an instance store volume. You can use block device mappings to specify additional
     * EBS volumes or instance store volumes to attach to an instance when it is launched.
     *
     * For more information, see
     * [Example block device mapping](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html#block-device-mapping-ex)
     * in the *Amazon EC2 User Guide for Linux Instances* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.autoscaling.*;
     * BlockDeviceMappingProperty blockDeviceMappingProperty = BlockDeviceMappingProperty.builder()
     * .deviceName("deviceName")
     * // the properties below are optional
     * .ebs(BlockDeviceProperty.builder()
     * .deleteOnTermination(false)
     * .encrypted(false)
     * .iops(123)
     * .snapshotId("snapshotId")
     * .throughput(123)
     * .volumeSize(123)
     * .volumeType("volumeType")
     * .build())
     * .noDevice(false)
     * .virtualName("virtualName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-launchconfiguration-blockdevicemapping.html)
     */
    public inline fun cfnLaunchConfigurationBlockDeviceMappingProperty(
        block: CfnLaunchConfigurationBlockDeviceMappingPropertyDsl.() -> Unit = {}
    ): CfnLaunchConfiguration.BlockDeviceMappingProperty {
        val builder = CfnLaunchConfigurationBlockDeviceMappingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `BlockDevice` is a property of the `EBS` property of the
     * [AWS::AutoScaling::LaunchConfiguration BlockDeviceMapping](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig-blockdev-mapping.html)
     * property type that describes an Amazon EBS volume.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.autoscaling.*;
     * BlockDeviceProperty blockDeviceProperty = BlockDeviceProperty.builder()
     * .deleteOnTermination(false)
     * .encrypted(false)
     * .iops(123)
     * .snapshotId("snapshotId")
     * .throughput(123)
     * .volumeSize(123)
     * .volumeType("volumeType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-launchconfiguration-blockdevice.html)
     */
    public inline fun cfnLaunchConfigurationBlockDeviceProperty(
        block: CfnLaunchConfigurationBlockDevicePropertyDsl.() -> Unit = {}
    ): CfnLaunchConfiguration.BlockDeviceProperty {
        val builder = CfnLaunchConfigurationBlockDevicePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `MetadataOptions` is a property of
     * [AWS::AutoScaling::LaunchConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html)
     * that describes metadata options for the instances.
     *
     * For more information, see
     * [Configure the instance metadata options](https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-launch-config.html#launch-configurations-imds)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.autoscaling.*;
     * MetadataOptionsProperty metadataOptionsProperty = MetadataOptionsProperty.builder()
     * .httpEndpoint("httpEndpoint")
     * .httpPutResponseHopLimit(123)
     * .httpTokens("httpTokens")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-launchconfiguration-metadataoptions.html)
     */
    public inline fun cfnLaunchConfigurationMetadataOptionsProperty(
        block: CfnLaunchConfigurationMetadataOptionsPropertyDsl.() -> Unit = {}
    ): CfnLaunchConfiguration.MetadataOptionsProperty {
        val builder = CfnLaunchConfigurationMetadataOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnLaunchConfiguration`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.autoscaling.*;
     * CfnLaunchConfigurationProps cfnLaunchConfigurationProps = CfnLaunchConfigurationProps.builder()
     * .imageId("imageId")
     * .instanceType("instanceType")
     * // the properties below are optional
     * .associatePublicIpAddress(false)
     * .blockDeviceMappings(List.of(BlockDeviceMappingProperty.builder()
     * .deviceName("deviceName")
     * // the properties below are optional
     * .ebs(BlockDeviceProperty.builder()
     * .deleteOnTermination(false)
     * .encrypted(false)
     * .iops(123)
     * .snapshotId("snapshotId")
     * .throughput(123)
     * .volumeSize(123)
     * .volumeType("volumeType")
     * .build())
     * .noDevice(false)
     * .virtualName("virtualName")
     * .build()))
     * .classicLinkVpcId("classicLinkVpcId")
     * .classicLinkVpcSecurityGroups(List.of("classicLinkVpcSecurityGroups"))
     * .ebsOptimized(false)
     * .iamInstanceProfile("iamInstanceProfile")
     * .instanceId("instanceId")
     * .instanceMonitoring(false)
     * .kernelId("kernelId")
     * .keyName("keyName")
     * .launchConfigurationName("launchConfigurationName")
     * .metadataOptions(MetadataOptionsProperty.builder()
     * .httpEndpoint("httpEndpoint")
     * .httpPutResponseHopLimit(123)
     * .httpTokens("httpTokens")
     * .build())
     * .placementTenancy("placementTenancy")
     * .ramDiskId("ramDiskId")
     * .securityGroups(List.of("securityGroups"))
     * .spotPrice("spotPrice")
     * .userData("userData")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html)
     */
    public inline fun cfnLaunchConfigurationProps(
        block: CfnLaunchConfigurationPropsDsl.() -> Unit = {}
    ): CfnLaunchConfigurationProps {
        val builder = CfnLaunchConfigurationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::AutoScaling::LifecycleHook` resource specifies lifecycle hooks for an Auto Scaling
     * group.
     *
     * These hooks let you create solutions that are aware of events in the Auto Scaling instance
     * lifecycle, and then perform a custom action on instances when the corresponding lifecycle
     * event occurs. A lifecycle hook provides a specified amount of time (one hour by default) to
     * wait for the action to complete before the instance transitions to the next state.
     *
     * Use lifecycle hooks to prepare new instances for use or to delay them from being registered
     * behind a load balancer before their configuration has been applied completely. You can also
     * use lifecycle hooks to prepare running instances to be terminated by, for example,
     * downloading logs or other data.
     *
     * For more information, see
     * [Amazon EC2 Auto Scaling lifecycle hooks](https://docs.aws.amazon.com/autoscaling/ec2/userguide/lifecycle-hooks.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.autoscaling.*;
     * CfnLifecycleHook cfnLifecycleHook = CfnLifecycleHook.Builder.create(this, "MyCfnLifecycleHook")
     * .autoScalingGroupName("autoScalingGroupName")
     * .lifecycleTransition("lifecycleTransition")
     * // the properties below are optional
     * .defaultResult("defaultResult")
     * .heartbeatTimeout(123)
     * .lifecycleHookName("lifecycleHookName")
     * .notificationMetadata("notificationMetadata")
     * .notificationTargetArn("notificationTargetArn")
     * .roleArn("roleArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-lifecyclehook.html)
     */
    public inline fun cfnLifecycleHook(
        scope: Construct,
        id: String,
        block: CfnLifecycleHookDsl.() -> Unit = {},
    ): CfnLifecycleHook {
        val builder = CfnLifecycleHookDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnLifecycleHook`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.autoscaling.*;
     * CfnLifecycleHookProps cfnLifecycleHookProps = CfnLifecycleHookProps.builder()
     * .autoScalingGroupName("autoScalingGroupName")
     * .lifecycleTransition("lifecycleTransition")
     * // the properties below are optional
     * .defaultResult("defaultResult")
     * .heartbeatTimeout(123)
     * .lifecycleHookName("lifecycleHookName")
     * .notificationMetadata("notificationMetadata")
     * .notificationTargetArn("notificationTargetArn")
     * .roleArn("roleArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-lifecyclehook.html)
     */
    public inline fun cfnLifecycleHookProps(
        block: CfnLifecycleHookPropsDsl.() -> Unit = {}
    ): CfnLifecycleHookProps {
        val builder = CfnLifecycleHookPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::AutoScaling::ScalingPolicy` resource specifies an Amazon EC2 Auto Scaling scaling
     * policy so that the Auto Scaling group can scale the number of instances available for your
     * application.
     *
     * For more information about using scaling policies to scale your Auto Scaling group
     * automatically, see
     * [Dynamic scaling](https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scale-based-on-demand.html)
     * and
     * [Predictive scaling](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-predictive-scaling.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.autoscaling.*;
     * CfnScalingPolicy cfnScalingPolicy = CfnScalingPolicy.Builder.create(this, "MyCfnScalingPolicy")
     * .autoScalingGroupName("autoScalingGroupName")
     * // the properties below are optional
     * .adjustmentType("adjustmentType")
     * .cooldown("cooldown")
     * .estimatedInstanceWarmup(123)
     * .metricAggregationType("metricAggregationType")
     * .minAdjustmentMagnitude(123)
     * .policyType("policyType")
     * .predictiveScalingConfiguration(PredictiveScalingConfigurationProperty.builder()
     * .metricSpecifications(List.of(PredictiveScalingMetricSpecificationProperty.builder()
     * .targetValue(123)
     * // the properties below are optional
     * .customizedCapacityMetricSpecification(PredictiveScalingCustomizedCapacityMetricProperty.builder()
     * .metricDataQueries(List.of(MetricDataQueryProperty.builder()
     * .id("id")
     * // the properties below are optional
     * .expression("expression")
     * .label("label")
     * .metricStat(MetricStatProperty.builder()
     * .metric(MetricProperty.builder()
     * .metricName("metricName")
     * .namespace("namespace")
     * // the properties below are optional
     * .dimensions(List.of(MetricDimensionProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .build())
     * .stat("stat")
     * // the properties below are optional
     * .unit("unit")
     * .build())
     * .returnData(false)
     * .build()))
     * .build())
     * .customizedLoadMetricSpecification(PredictiveScalingCustomizedLoadMetricProperty.builder()
     * .metricDataQueries(List.of(MetricDataQueryProperty.builder()
     * .id("id")
     * // the properties below are optional
     * .expression("expression")
     * .label("label")
     * .metricStat(MetricStatProperty.builder()
     * .metric(MetricProperty.builder()
     * .metricName("metricName")
     * .namespace("namespace")
     * // the properties below are optional
     * .dimensions(List.of(MetricDimensionProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .build())
     * .stat("stat")
     * // the properties below are optional
     * .unit("unit")
     * .build())
     * .returnData(false)
     * .build()))
     * .build())
     * .customizedScalingMetricSpecification(PredictiveScalingCustomizedScalingMetricProperty.builder()
     * .metricDataQueries(List.of(MetricDataQueryProperty.builder()
     * .id("id")
     * // the properties below are optional
     * .expression("expression")
     * .label("label")
     * .metricStat(MetricStatProperty.builder()
     * .metric(MetricProperty.builder()
     * .metricName("metricName")
     * .namespace("namespace")
     * // the properties below are optional
     * .dimensions(List.of(MetricDimensionProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .build())
     * .stat("stat")
     * // the properties below are optional
     * .unit("unit")
     * .build())
     * .returnData(false)
     * .build()))
     * .build())
     * .predefinedLoadMetricSpecification(PredictiveScalingPredefinedLoadMetricProperty.builder()
     * .predefinedMetricType("predefinedMetricType")
     * // the properties below are optional
     * .resourceLabel("resourceLabel")
     * .build())
     * .predefinedMetricPairSpecification(PredictiveScalingPredefinedMetricPairProperty.builder()
     * .predefinedMetricType("predefinedMetricType")
     * // the properties below are optional
     * .resourceLabel("resourceLabel")
     * .build())
     * .predefinedScalingMetricSpecification(PredictiveScalingPredefinedScalingMetricProperty.builder()
     * .predefinedMetricType("predefinedMetricType")
     * // the properties below are optional
     * .resourceLabel("resourceLabel")
     * .build())
     * .build()))
     * // the properties below are optional
     * .maxCapacityBreachBehavior("maxCapacityBreachBehavior")
     * .maxCapacityBuffer(123)
     * .mode("mode")
     * .schedulingBufferTime(123)
     * .build())
     * .scalingAdjustment(123)
     * .stepAdjustments(List.of(StepAdjustmentProperty.builder()
     * .scalingAdjustment(123)
     * // the properties below are optional
     * .metricIntervalLowerBound(123)
     * .metricIntervalUpperBound(123)
     * .build()))
     * .targetTrackingConfiguration(TargetTrackingConfigurationProperty.builder()
     * .targetValue(123)
     * // the properties below are optional
     * .customizedMetricSpecification(CustomizedMetricSpecificationProperty.builder()
     * .metricName("metricName")
     * .namespace("namespace")
     * .statistic("statistic")
     * // the properties below are optional
     * .dimensions(List.of(MetricDimensionProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .unit("unit")
     * .build())
     * .disableScaleIn(false)
     * .predefinedMetricSpecification(PredefinedMetricSpecificationProperty.builder()
     * .predefinedMetricType("predefinedMetricType")
     * // the properties below are optional
     * .resourceLabel("resourceLabel")
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scalingpolicy.html)
     */
    public inline fun cfnScalingPolicy(
        scope: Construct,
        id: String,
        block: CfnScalingPolicyDsl.() -> Unit = {},
    ): CfnScalingPolicy {
        val builder = CfnScalingPolicyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains customized metric specification information for a target tracking scaling policy for
     * Amazon EC2 Auto Scaling.
     *
     * To create your customized metric specification:
     * * Add values for each required property from CloudWatch. You can use an existing metric, or a
     *   new metric that you create. To use your own metric, you must first publish the metric to
     *   CloudWatch. For more information, see
     *   [Publish Custom Metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/publishingMetrics.html)
     *   in the *Amazon CloudWatch User Guide* .
     * * Choose a metric that changes proportionally with capacity. The value of the metric should
     *   increase or decrease in inverse proportion to the number of capacity units. That is, the
     *   value of the metric should decrease when capacity increases.
     *
     * For more information about CloudWatch, see
     * [Amazon CloudWatch Concepts](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_concepts.html)
     * .
     *
     * `CustomizedMetricSpecification` is a property of the
     * [AWS::AutoScaling::ScalingPolicy TargetTrackingConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-targettrackingconfiguration.html)
     * property type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.autoscaling.*;
     * CustomizedMetricSpecificationProperty customizedMetricSpecificationProperty =
     * CustomizedMetricSpecificationProperty.builder()
     * .metricName("metricName")
     * .namespace("namespace")
     * .statistic("statistic")
     * // the properties below are optional
     * .dimensions(List.of(MetricDimensionProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .unit("unit")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-customizedmetricspecification.html)
     */
    public inline fun cfnScalingPolicyCustomizedMetricSpecificationProperty(
        block: CfnScalingPolicyCustomizedMetricSpecificationPropertyDsl.() -> Unit = {}
    ): CfnScalingPolicy.CustomizedMetricSpecificationProperty {
        val builder = CfnScalingPolicyCustomizedMetricSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The metric data to return.
     *
     * Also defines whether this call is returning data for one metric only, or whether it is
     * performing a math expression on the values of returned metric statistics to create a new time
     * series. A time series is a series of data points, each of which is associated with a
     * timestamp.
     *
     * `MetricDataQuery` is a property of the following property types:
     * * [AWS::AutoScaling::ScalingPolicy
     *   PredictiveScalingCustomizedScalingMetric](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predictivescalingcustomizedscalingmetric.html)
     * * [AWS::AutoScaling::ScalingPolicy
     *   PredictiveScalingCustomizedLoadMetric](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predictivescalingcustomizedloadmetric.html)
     * * [AWS::AutoScaling::ScalingPolicy
     *   PredictiveScalingCustomizedCapacityMetric](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predictivescalingcustomizedcapacitymetric.html)
     *
     * Predictive scaling uses the time series data received from CloudWatch to understand how to
     * schedule capacity based on your historical workload patterns.
     *
     * You can call for a single metric or perform math expressions on multiple metrics. Any
     * expressions used in a metric specification must eventually return a single time series.
     *
     * For more information and examples, see
     * [Advanced predictive scaling policy configurations using custom metrics](https://docs.aws.amazon.com/autoscaling/ec2/userguide/predictive-scaling-customized-metric-specification.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.autoscaling.*;
     * MetricDataQueryProperty metricDataQueryProperty = MetricDataQueryProperty.builder()
     * .id("id")
     * // the properties below are optional
     * .expression("expression")
     * .label("label")
     * .metricStat(MetricStatProperty.builder()
     * .metric(MetricProperty.builder()
     * .metricName("metricName")
     * .namespace("namespace")
     * // the properties below are optional
     * .dimensions(List.of(MetricDimensionProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .build())
     * .stat("stat")
     * // the properties below are optional
     * .unit("unit")
     * .build())
     * .returnData(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-metricdataquery.html)
     */
    public inline fun cfnScalingPolicyMetricDataQueryProperty(
        block: CfnScalingPolicyMetricDataQueryPropertyDsl.() -> Unit = {}
    ): CfnScalingPolicy.MetricDataQueryProperty {
        val builder = CfnScalingPolicyMetricDataQueryPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `MetricDimension` specifies a name/value pair that is part of the identity of a CloudWatch
     * metric for the `Dimensions` property of the
     * [AWS::AutoScaling::ScalingPolicy CustomizedMetricSpecification](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-customizedmetricspecification.html)
     * property type. Duplicate dimensions are not allowed.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.autoscaling.*;
     * MetricDimensionProperty metricDimensionProperty = MetricDimensionProperty.builder()
     * .name("name")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-metricdimension.html)
     */
    public inline fun cfnScalingPolicyMetricDimensionProperty(
        block: CfnScalingPolicyMetricDimensionPropertyDsl.() -> Unit = {}
    ): CfnScalingPolicy.MetricDimensionProperty {
        val builder = CfnScalingPolicyMetricDimensionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents a specific metric.
     *
     * `Metric` is a property of the
     * [AWS::AutoScaling::ScalingPolicy MetricStat](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-metricstat.html)
     * property type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.autoscaling.*;
     * MetricProperty metricProperty = MetricProperty.builder()
     * .metricName("metricName")
     * .namespace("namespace")
     * // the properties below are optional
     * .dimensions(List.of(MetricDimensionProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-metric.html)
     */
    public inline fun cfnScalingPolicyMetricProperty(
        block: CfnScalingPolicyMetricPropertyDsl.() -> Unit = {}
    ): CfnScalingPolicy.MetricProperty {
        val builder = CfnScalingPolicyMetricPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `MetricStat` is a property of the
     * [AWS::AutoScaling::ScalingPolicy MetricDataQuery](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-metricdataquery.html)
     * property type.
     *
     * This structure defines the CloudWatch metric to return, along with the statistic, period, and
     * unit.
     *
     * For more information about the CloudWatch terminology below, see
     * [Amazon CloudWatch concepts](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_concepts.html)
     * in the *Amazon CloudWatch User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.autoscaling.*;
     * MetricStatProperty metricStatProperty = MetricStatProperty.builder()
     * .metric(MetricProperty.builder()
     * .metricName("metricName")
     * .namespace("namespace")
     * // the properties below are optional
     * .dimensions(List.of(MetricDimensionProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .build())
     * .stat("stat")
     * // the properties below are optional
     * .unit("unit")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-metricstat.html)
     */
    public inline fun cfnScalingPolicyMetricStatProperty(
        block: CfnScalingPolicyMetricStatPropertyDsl.() -> Unit = {}
    ): CfnScalingPolicy.MetricStatProperty {
        val builder = CfnScalingPolicyMetricStatPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains predefined metric specification information for a target tracking scaling policy for
     * Amazon EC2 Auto Scaling.
     *
     * `PredefinedMetricSpecification` is a property of the
     * [AWS::AutoScaling::ScalingPolicy TargetTrackingConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-targettrackingconfiguration.html)
     * property type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.autoscaling.*;
     * PredefinedMetricSpecificationProperty predefinedMetricSpecificationProperty =
     * PredefinedMetricSpecificationProperty.builder()
     * .predefinedMetricType("predefinedMetricType")
     * // the properties below are optional
     * .resourceLabel("resourceLabel")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predefinedmetricspecification.html)
     */
    public inline fun cfnScalingPolicyPredefinedMetricSpecificationProperty(
        block: CfnScalingPolicyPredefinedMetricSpecificationPropertyDsl.() -> Unit = {}
    ): CfnScalingPolicy.PredefinedMetricSpecificationProperty {
        val builder = CfnScalingPolicyPredefinedMetricSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `PredictiveScalingConfiguration` is a property of the
     * [AWS::AutoScaling::ScalingPolicy](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html)
     * resource that specifies a predictive scaling policy for Amazon EC2 Auto Scaling.
     *
     * For more information, see
     * [Predictive scaling](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-predictive-scaling.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.autoscaling.*;
     * PredictiveScalingConfigurationProperty predictiveScalingConfigurationProperty =
     * PredictiveScalingConfigurationProperty.builder()
     * .metricSpecifications(List.of(PredictiveScalingMetricSpecificationProperty.builder()
     * .targetValue(123)
     * // the properties below are optional
     * .customizedCapacityMetricSpecification(PredictiveScalingCustomizedCapacityMetricProperty.builder()
     * .metricDataQueries(List.of(MetricDataQueryProperty.builder()
     * .id("id")
     * // the properties below are optional
     * .expression("expression")
     * .label("label")
     * .metricStat(MetricStatProperty.builder()
     * .metric(MetricProperty.builder()
     * .metricName("metricName")
     * .namespace("namespace")
     * // the properties below are optional
     * .dimensions(List.of(MetricDimensionProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .build())
     * .stat("stat")
     * // the properties below are optional
     * .unit("unit")
     * .build())
     * .returnData(false)
     * .build()))
     * .build())
     * .customizedLoadMetricSpecification(PredictiveScalingCustomizedLoadMetricProperty.builder()
     * .metricDataQueries(List.of(MetricDataQueryProperty.builder()
     * .id("id")
     * // the properties below are optional
     * .expression("expression")
     * .label("label")
     * .metricStat(MetricStatProperty.builder()
     * .metric(MetricProperty.builder()
     * .metricName("metricName")
     * .namespace("namespace")
     * // the properties below are optional
     * .dimensions(List.of(MetricDimensionProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .build())
     * .stat("stat")
     * // the properties below are optional
     * .unit("unit")
     * .build())
     * .returnData(false)
     * .build()))
     * .build())
     * .customizedScalingMetricSpecification(PredictiveScalingCustomizedScalingMetricProperty.builder()
     * .metricDataQueries(List.of(MetricDataQueryProperty.builder()
     * .id("id")
     * // the properties below are optional
     * .expression("expression")
     * .label("label")
     * .metricStat(MetricStatProperty.builder()
     * .metric(MetricProperty.builder()
     * .metricName("metricName")
     * .namespace("namespace")
     * // the properties below are optional
     * .dimensions(List.of(MetricDimensionProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .build())
     * .stat("stat")
     * // the properties below are optional
     * .unit("unit")
     * .build())
     * .returnData(false)
     * .build()))
     * .build())
     * .predefinedLoadMetricSpecification(PredictiveScalingPredefinedLoadMetricProperty.builder()
     * .predefinedMetricType("predefinedMetricType")
     * // the properties below are optional
     * .resourceLabel("resourceLabel")
     * .build())
     * .predefinedMetricPairSpecification(PredictiveScalingPredefinedMetricPairProperty.builder()
     * .predefinedMetricType("predefinedMetricType")
     * // the properties below are optional
     * .resourceLabel("resourceLabel")
     * .build())
     * .predefinedScalingMetricSpecification(PredictiveScalingPredefinedScalingMetricProperty.builder()
     * .predefinedMetricType("predefinedMetricType")
     * // the properties below are optional
     * .resourceLabel("resourceLabel")
     * .build())
     * .build()))
     * // the properties below are optional
     * .maxCapacityBreachBehavior("maxCapacityBreachBehavior")
     * .maxCapacityBuffer(123)
     * .mode("mode")
     * .schedulingBufferTime(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predictivescalingconfiguration.html)
     */
    public inline fun cfnScalingPolicyPredictiveScalingConfigurationProperty(
        block: CfnScalingPolicyPredictiveScalingConfigurationPropertyDsl.() -> Unit = {}
    ): CfnScalingPolicy.PredictiveScalingConfigurationProperty {
        val builder = CfnScalingPolicyPredictiveScalingConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains capacity metric information for the `CustomizedCapacityMetricSpecification` property
     * of the
     * [AWS::AutoScaling::ScalingPolicy PredictiveScalingMetricSpecification](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predictivescalingmetricspecification.html)
     * property type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.autoscaling.*;
     * PredictiveScalingCustomizedCapacityMetricProperty
     * predictiveScalingCustomizedCapacityMetricProperty =
     * PredictiveScalingCustomizedCapacityMetricProperty.builder()
     * .metricDataQueries(List.of(MetricDataQueryProperty.builder()
     * .id("id")
     * // the properties below are optional
     * .expression("expression")
     * .label("label")
     * .metricStat(MetricStatProperty.builder()
     * .metric(MetricProperty.builder()
     * .metricName("metricName")
     * .namespace("namespace")
     * // the properties below are optional
     * .dimensions(List.of(MetricDimensionProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .build())
     * .stat("stat")
     * // the properties below are optional
     * .unit("unit")
     * .build())
     * .returnData(false)
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predictivescalingcustomizedcapacitymetric.html)
     */
    public inline fun cfnScalingPolicyPredictiveScalingCustomizedCapacityMetricProperty(
        block: CfnScalingPolicyPredictiveScalingCustomizedCapacityMetricPropertyDsl.() -> Unit = {}
    ): CfnScalingPolicy.PredictiveScalingCustomizedCapacityMetricProperty {
        val builder = CfnScalingPolicyPredictiveScalingCustomizedCapacityMetricPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains load metric information for the `CustomizedLoadMetricSpecification` property of the
     * [AWS::AutoScaling::ScalingPolicy PredictiveScalingMetricSpecification](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predictivescalingmetricspecification.html)
     * property type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.autoscaling.*;
     * PredictiveScalingCustomizedLoadMetricProperty predictiveScalingCustomizedLoadMetricProperty =
     * PredictiveScalingCustomizedLoadMetricProperty.builder()
     * .metricDataQueries(List.of(MetricDataQueryProperty.builder()
     * .id("id")
     * // the properties below are optional
     * .expression("expression")
     * .label("label")
     * .metricStat(MetricStatProperty.builder()
     * .metric(MetricProperty.builder()
     * .metricName("metricName")
     * .namespace("namespace")
     * // the properties below are optional
     * .dimensions(List.of(MetricDimensionProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .build())
     * .stat("stat")
     * // the properties below are optional
     * .unit("unit")
     * .build())
     * .returnData(false)
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predictivescalingcustomizedloadmetric.html)
     */
    public inline fun cfnScalingPolicyPredictiveScalingCustomizedLoadMetricProperty(
        block: CfnScalingPolicyPredictiveScalingCustomizedLoadMetricPropertyDsl.() -> Unit = {}
    ): CfnScalingPolicy.PredictiveScalingCustomizedLoadMetricProperty {
        val builder = CfnScalingPolicyPredictiveScalingCustomizedLoadMetricPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains scaling metric information for the `CustomizedScalingMetricSpecification` property
     * of the
     * [AWS::AutoScaling::ScalingPolicy PredictiveScalingMetricSpecification](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predictivescalingmetricspecification.html)
     * property type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.autoscaling.*;
     * PredictiveScalingCustomizedScalingMetricProperty
     * predictiveScalingCustomizedScalingMetricProperty =
     * PredictiveScalingCustomizedScalingMetricProperty.builder()
     * .metricDataQueries(List.of(MetricDataQueryProperty.builder()
     * .id("id")
     * // the properties below are optional
     * .expression("expression")
     * .label("label")
     * .metricStat(MetricStatProperty.builder()
     * .metric(MetricProperty.builder()
     * .metricName("metricName")
     * .namespace("namespace")
     * // the properties below are optional
     * .dimensions(List.of(MetricDimensionProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .build())
     * .stat("stat")
     * // the properties below are optional
     * .unit("unit")
     * .build())
     * .returnData(false)
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predictivescalingcustomizedscalingmetric.html)
     */
    public inline fun cfnScalingPolicyPredictiveScalingCustomizedScalingMetricProperty(
        block: CfnScalingPolicyPredictiveScalingCustomizedScalingMetricPropertyDsl.() -> Unit = {}
    ): CfnScalingPolicy.PredictiveScalingCustomizedScalingMetricProperty {
        val builder = CfnScalingPolicyPredictiveScalingCustomizedScalingMetricPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A structure that specifies a metric specification for the `MetricSpecifications` property of
     * the
     * [AWS::AutoScaling::ScalingPolicy PredictiveScalingConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predictivescalingconfiguration.html)
     * property type.
     *
     * You must specify either a metric pair, or a load metric and a scaling metric individually.
     * Specifying a metric pair instead of individual metrics provides a simpler way to configure
     * metrics for a scaling policy. You choose the metric pair, and the policy automatically knows
     * the correct sum and average statistics to use for the load metric and the scaling metric.
     *
     * Example
     * * You create a predictive scaling policy and specify `ALBRequestCount` as the value for the
     *   metric pair and `1000.0` as the target value. For this type of metric, you must provide the
     *   metric dimension for the corresponding target group, so you also provide a resource label
     *   for the Application Load Balancer target group that is attached to your Auto Scaling group.
     * * The number of requests the target group receives per minute provides the load metric, and
     *   the request count averaged between the members of the target group provides the scaling
     *   metric. In CloudWatch, this refers to the `RequestCount` and `RequestCountPerTarget`
     *   metrics, respectively.
     * * For optimal use of predictive scaling, you adhere to the best practice of using a dynamic
     *   scaling policy to automatically scale between the minimum capacity and maximum capacity in
     *   response to real-time changes in resource utilization.
     * * Amazon EC2 Auto Scaling consumes data points for the load metric over the last 14 days and
     *   creates an hourly load forecast for predictive scaling. (A minimum of 24 hours of data is
     *   required.)
     * * After creating the load forecast, Amazon EC2 Auto Scaling determines when to reduce or
     *   increase the capacity of your Auto Scaling group in each hour of the forecast period so
     *   that the average number of requests received by each instance is as close to 1000 requests
     *   per minute as possible at all times.
     *
     * For information about using custom metrics with predictive scaling, see
     * [Advanced predictive scaling policy configurations using custom metrics](https://docs.aws.amazon.com/autoscaling/ec2/userguide/predictive-scaling-customized-metric-specification.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.autoscaling.*;
     * PredictiveScalingMetricSpecificationProperty predictiveScalingMetricSpecificationProperty =
     * PredictiveScalingMetricSpecificationProperty.builder()
     * .targetValue(123)
     * // the properties below are optional
     * .customizedCapacityMetricSpecification(PredictiveScalingCustomizedCapacityMetricProperty.builder()
     * .metricDataQueries(List.of(MetricDataQueryProperty.builder()
     * .id("id")
     * // the properties below are optional
     * .expression("expression")
     * .label("label")
     * .metricStat(MetricStatProperty.builder()
     * .metric(MetricProperty.builder()
     * .metricName("metricName")
     * .namespace("namespace")
     * // the properties below are optional
     * .dimensions(List.of(MetricDimensionProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .build())
     * .stat("stat")
     * // the properties below are optional
     * .unit("unit")
     * .build())
     * .returnData(false)
     * .build()))
     * .build())
     * .customizedLoadMetricSpecification(PredictiveScalingCustomizedLoadMetricProperty.builder()
     * .metricDataQueries(List.of(MetricDataQueryProperty.builder()
     * .id("id")
     * // the properties below are optional
     * .expression("expression")
     * .label("label")
     * .metricStat(MetricStatProperty.builder()
     * .metric(MetricProperty.builder()
     * .metricName("metricName")
     * .namespace("namespace")
     * // the properties below are optional
     * .dimensions(List.of(MetricDimensionProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .build())
     * .stat("stat")
     * // the properties below are optional
     * .unit("unit")
     * .build())
     * .returnData(false)
     * .build()))
     * .build())
     * .customizedScalingMetricSpecification(PredictiveScalingCustomizedScalingMetricProperty.builder()
     * .metricDataQueries(List.of(MetricDataQueryProperty.builder()
     * .id("id")
     * // the properties below are optional
     * .expression("expression")
     * .label("label")
     * .metricStat(MetricStatProperty.builder()
     * .metric(MetricProperty.builder()
     * .metricName("metricName")
     * .namespace("namespace")
     * // the properties below are optional
     * .dimensions(List.of(MetricDimensionProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .build())
     * .stat("stat")
     * // the properties below are optional
     * .unit("unit")
     * .build())
     * .returnData(false)
     * .build()))
     * .build())
     * .predefinedLoadMetricSpecification(PredictiveScalingPredefinedLoadMetricProperty.builder()
     * .predefinedMetricType("predefinedMetricType")
     * // the properties below are optional
     * .resourceLabel("resourceLabel")
     * .build())
     * .predefinedMetricPairSpecification(PredictiveScalingPredefinedMetricPairProperty.builder()
     * .predefinedMetricType("predefinedMetricType")
     * // the properties below are optional
     * .resourceLabel("resourceLabel")
     * .build())
     * .predefinedScalingMetricSpecification(PredictiveScalingPredefinedScalingMetricProperty.builder()
     * .predefinedMetricType("predefinedMetricType")
     * // the properties below are optional
     * .resourceLabel("resourceLabel")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predictivescalingmetricspecification.html)
     */
    public inline fun cfnScalingPolicyPredictiveScalingMetricSpecificationProperty(
        block: CfnScalingPolicyPredictiveScalingMetricSpecificationPropertyDsl.() -> Unit = {}
    ): CfnScalingPolicy.PredictiveScalingMetricSpecificationProperty {
        val builder = CfnScalingPolicyPredictiveScalingMetricSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains load metric information for the `PredefinedLoadMetricSpecification` property of the
     * [AWS::AutoScaling::ScalingPolicy PredictiveScalingMetricSpecification](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predictivescalingmetricspecification.html)
     * property type.
     *
     * Does not apply to policies that use a *metric pair* for the metric specification.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.autoscaling.*;
     * PredictiveScalingPredefinedLoadMetricProperty predictiveScalingPredefinedLoadMetricProperty =
     * PredictiveScalingPredefinedLoadMetricProperty.builder()
     * .predefinedMetricType("predefinedMetricType")
     * // the properties below are optional
     * .resourceLabel("resourceLabel")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predictivescalingpredefinedloadmetric.html)
     */
    public inline fun cfnScalingPolicyPredictiveScalingPredefinedLoadMetricProperty(
        block: CfnScalingPolicyPredictiveScalingPredefinedLoadMetricPropertyDsl.() -> Unit = {}
    ): CfnScalingPolicy.PredictiveScalingPredefinedLoadMetricProperty {
        val builder = CfnScalingPolicyPredictiveScalingPredefinedLoadMetricPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains metric pair information for the `PredefinedMetricPairSpecification` property of the
     * [AWS::AutoScaling::ScalingPolicy PredictiveScalingMetricSpecification](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predictivescalingmetricspecification.html)
     * property type.
     *
     * For more information, see
     * [Predictive scaling](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-predictive-scaling.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.autoscaling.*;
     * PredictiveScalingPredefinedMetricPairProperty predictiveScalingPredefinedMetricPairProperty =
     * PredictiveScalingPredefinedMetricPairProperty.builder()
     * .predefinedMetricType("predefinedMetricType")
     * // the properties below are optional
     * .resourceLabel("resourceLabel")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predictivescalingpredefinedmetricpair.html)
     */
    public inline fun cfnScalingPolicyPredictiveScalingPredefinedMetricPairProperty(
        block: CfnScalingPolicyPredictiveScalingPredefinedMetricPairPropertyDsl.() -> Unit = {}
    ): CfnScalingPolicy.PredictiveScalingPredefinedMetricPairProperty {
        val builder = CfnScalingPolicyPredictiveScalingPredefinedMetricPairPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains scaling metric information for the `PredefinedScalingMetricSpecification` property
     * of the
     * [AWS::AutoScaling::ScalingPolicy PredictiveScalingMetricSpecification](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predictivescalingmetricspecification.html)
     * property type.
     *
     * Does not apply to policies that use a *metric pair* for the metric specification.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.autoscaling.*;
     * PredictiveScalingPredefinedScalingMetricProperty
     * predictiveScalingPredefinedScalingMetricProperty =
     * PredictiveScalingPredefinedScalingMetricProperty.builder()
     * .predefinedMetricType("predefinedMetricType")
     * // the properties below are optional
     * .resourceLabel("resourceLabel")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predictivescalingpredefinedscalingmetric.html)
     */
    public inline fun cfnScalingPolicyPredictiveScalingPredefinedScalingMetricProperty(
        block: CfnScalingPolicyPredictiveScalingPredefinedScalingMetricPropertyDsl.() -> Unit = {}
    ): CfnScalingPolicy.PredictiveScalingPredefinedScalingMetricProperty {
        val builder = CfnScalingPolicyPredictiveScalingPredefinedScalingMetricPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnScalingPolicy`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.autoscaling.*;
     * CfnScalingPolicyProps cfnScalingPolicyProps = CfnScalingPolicyProps.builder()
     * .autoScalingGroupName("autoScalingGroupName")
     * // the properties below are optional
     * .adjustmentType("adjustmentType")
     * .cooldown("cooldown")
     * .estimatedInstanceWarmup(123)
     * .metricAggregationType("metricAggregationType")
     * .minAdjustmentMagnitude(123)
     * .policyType("policyType")
     * .predictiveScalingConfiguration(PredictiveScalingConfigurationProperty.builder()
     * .metricSpecifications(List.of(PredictiveScalingMetricSpecificationProperty.builder()
     * .targetValue(123)
     * // the properties below are optional
     * .customizedCapacityMetricSpecification(PredictiveScalingCustomizedCapacityMetricProperty.builder()
     * .metricDataQueries(List.of(MetricDataQueryProperty.builder()
     * .id("id")
     * // the properties below are optional
     * .expression("expression")
     * .label("label")
     * .metricStat(MetricStatProperty.builder()
     * .metric(MetricProperty.builder()
     * .metricName("metricName")
     * .namespace("namespace")
     * // the properties below are optional
     * .dimensions(List.of(MetricDimensionProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .build())
     * .stat("stat")
     * // the properties below are optional
     * .unit("unit")
     * .build())
     * .returnData(false)
     * .build()))
     * .build())
     * .customizedLoadMetricSpecification(PredictiveScalingCustomizedLoadMetricProperty.builder()
     * .metricDataQueries(List.of(MetricDataQueryProperty.builder()
     * .id("id")
     * // the properties below are optional
     * .expression("expression")
     * .label("label")
     * .metricStat(MetricStatProperty.builder()
     * .metric(MetricProperty.builder()
     * .metricName("metricName")
     * .namespace("namespace")
     * // the properties below are optional
     * .dimensions(List.of(MetricDimensionProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .build())
     * .stat("stat")
     * // the properties below are optional
     * .unit("unit")
     * .build())
     * .returnData(false)
     * .build()))
     * .build())
     * .customizedScalingMetricSpecification(PredictiveScalingCustomizedScalingMetricProperty.builder()
     * .metricDataQueries(List.of(MetricDataQueryProperty.builder()
     * .id("id")
     * // the properties below are optional
     * .expression("expression")
     * .label("label")
     * .metricStat(MetricStatProperty.builder()
     * .metric(MetricProperty.builder()
     * .metricName("metricName")
     * .namespace("namespace")
     * // the properties below are optional
     * .dimensions(List.of(MetricDimensionProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .build())
     * .stat("stat")
     * // the properties below are optional
     * .unit("unit")
     * .build())
     * .returnData(false)
     * .build()))
     * .build())
     * .predefinedLoadMetricSpecification(PredictiveScalingPredefinedLoadMetricProperty.builder()
     * .predefinedMetricType("predefinedMetricType")
     * // the properties below are optional
     * .resourceLabel("resourceLabel")
     * .build())
     * .predefinedMetricPairSpecification(PredictiveScalingPredefinedMetricPairProperty.builder()
     * .predefinedMetricType("predefinedMetricType")
     * // the properties below are optional
     * .resourceLabel("resourceLabel")
     * .build())
     * .predefinedScalingMetricSpecification(PredictiveScalingPredefinedScalingMetricProperty.builder()
     * .predefinedMetricType("predefinedMetricType")
     * // the properties below are optional
     * .resourceLabel("resourceLabel")
     * .build())
     * .build()))
     * // the properties below are optional
     * .maxCapacityBreachBehavior("maxCapacityBreachBehavior")
     * .maxCapacityBuffer(123)
     * .mode("mode")
     * .schedulingBufferTime(123)
     * .build())
     * .scalingAdjustment(123)
     * .stepAdjustments(List.of(StepAdjustmentProperty.builder()
     * .scalingAdjustment(123)
     * // the properties below are optional
     * .metricIntervalLowerBound(123)
     * .metricIntervalUpperBound(123)
     * .build()))
     * .targetTrackingConfiguration(TargetTrackingConfigurationProperty.builder()
     * .targetValue(123)
     * // the properties below are optional
     * .customizedMetricSpecification(CustomizedMetricSpecificationProperty.builder()
     * .metricName("metricName")
     * .namespace("namespace")
     * .statistic("statistic")
     * // the properties below are optional
     * .dimensions(List.of(MetricDimensionProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .unit("unit")
     * .build())
     * .disableScaleIn(false)
     * .predefinedMetricSpecification(PredefinedMetricSpecificationProperty.builder()
     * .predefinedMetricType("predefinedMetricType")
     * // the properties below are optional
     * .resourceLabel("resourceLabel")
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scalingpolicy.html)
     */
    public inline fun cfnScalingPolicyProps(
        block: CfnScalingPolicyPropsDsl.() -> Unit = {}
    ): CfnScalingPolicyProps {
        val builder = CfnScalingPolicyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `StepAdjustment` specifies a step adjustment for the `StepAdjustments` property of the
     * [AWS::AutoScaling::ScalingPolicy](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html)
     * resource.
     *
     * For the following examples, suppose that you have an alarm with a breach threshold of 50:
     * * To trigger a step adjustment when the metric is greater than or equal to 50 and less than
     *   60, specify a lower bound of 0 and an upper bound of 10.
     * * To trigger a step adjustment when the metric is greater than 40 and less than or equal to
     *   50, specify a lower bound of -10 and an upper bound of 0.
     *
     * There are a few rules for the step adjustments for your step policy:
     * * The ranges of your step adjustments can't overlap or have a gap.
     * * At most one step adjustment can have a null lower bound. If one step adjustment has a
     *   negative lower bound, then there must be a step adjustment with a null lower bound.
     * * At most one step adjustment can have a null upper bound. If one step adjustment has a
     *   positive upper bound, then there must be a step adjustment with a null upper bound.
     * * The upper and lower bound can't be null in the same step adjustment.
     *
     * For more information, see
     * [Step adjustments](https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scaling-simple-step.html#as-scaling-steps)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * You can find a sample template snippet in the
     * [Examples](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#aws-properties-as-policy--examples)
     * section of the `AWS::AutoScaling::ScalingPolicy` resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.autoscaling.*;
     * StepAdjustmentProperty stepAdjustmentProperty = StepAdjustmentProperty.builder()
     * .scalingAdjustment(123)
     * // the properties below are optional
     * .metricIntervalLowerBound(123)
     * .metricIntervalUpperBound(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-stepadjustment.html)
     */
    public inline fun cfnScalingPolicyStepAdjustmentProperty(
        block: CfnScalingPolicyStepAdjustmentPropertyDsl.() -> Unit = {}
    ): CfnScalingPolicy.StepAdjustmentProperty {
        val builder = CfnScalingPolicyStepAdjustmentPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `TargetTrackingConfiguration` is a property of the
     * [AWS::AutoScaling::ScalingPolicy](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html)
     * resource that specifies a target tracking scaling policy configuration for Amazon EC2 Auto
     * Scaling.
     *
     * For more information about scaling policies, see
     * [Dynamic scaling](https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scale-based-on-demand.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.autoscaling.*;
     * TargetTrackingConfigurationProperty targetTrackingConfigurationProperty =
     * TargetTrackingConfigurationProperty.builder()
     * .targetValue(123)
     * // the properties below are optional
     * .customizedMetricSpecification(CustomizedMetricSpecificationProperty.builder()
     * .metricName("metricName")
     * .namespace("namespace")
     * .statistic("statistic")
     * // the properties below are optional
     * .dimensions(List.of(MetricDimensionProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .unit("unit")
     * .build())
     * .disableScaleIn(false)
     * .predefinedMetricSpecification(PredefinedMetricSpecificationProperty.builder()
     * .predefinedMetricType("predefinedMetricType")
     * // the properties below are optional
     * .resourceLabel("resourceLabel")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-targettrackingconfiguration.html)
     */
    public inline fun cfnScalingPolicyTargetTrackingConfigurationProperty(
        block: CfnScalingPolicyTargetTrackingConfigurationPropertyDsl.() -> Unit = {}
    ): CfnScalingPolicy.TargetTrackingConfigurationProperty {
        val builder = CfnScalingPolicyTargetTrackingConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::AutoScaling::ScheduledAction` resource specifies an Amazon EC2 Auto Scaling
     * scheduled action so that the Auto Scaling group can change the number of instances available
     * for your application in response to predictable load changes.
     *
     * When you update a stack with an Auto Scaling group and scheduled action, CloudFormation
     * always sets the min size, max size, and desired capacity properties of your group to the
     * values that are defined in the `AWS::AutoScaling::AutoScalingGroup` section of your template.
     * However, you might not want CloudFormation to do that when you have a scheduled action in
     * effect. You can use an
     * [UpdatePolicy attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-updatepolicy.html)
     * to prevent CloudFormation from changing the min size, max size, or desired capacity property
     * values during a stack update unless you modified the individual values in your template. If
     * you have rolling updates enabled, before you can update the Auto Scaling group, you must
     * suspend scheduled actions by specifying an
     * [UpdatePolicy attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-updatepolicy.html)
     * for the Auto Scaling group. You can find a sample update policy for rolling updates in
     * [Auto scaling template snippets](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/quickref-autoscaling.html)
     * .
     *
     * For more information, see
     * [Scheduled scaling](https://docs.aws.amazon.com/autoscaling/ec2/userguide/schedule_time.html)
     * and
     * [Suspending and resuming scaling processes](https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-suspend-resume-processes.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.autoscaling.*;
     * CfnScheduledAction cfnScheduledAction = CfnScheduledAction.Builder.create(this,
     * "MyCfnScheduledAction")
     * .autoScalingGroupName("autoScalingGroupName")
     * // the properties below are optional
     * .desiredCapacity(123)
     * .endTime("endTime")
     * .maxSize(123)
     * .minSize(123)
     * .recurrence("recurrence")
     * .startTime("startTime")
     * .timeZone("timeZone")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scheduledaction.html)
     */
    public inline fun cfnScheduledAction(
        scope: Construct,
        id: String,
        block: CfnScheduledActionDsl.() -> Unit = {},
    ): CfnScheduledAction {
        val builder = CfnScheduledActionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnScheduledAction`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.autoscaling.*;
     * CfnScheduledActionProps cfnScheduledActionProps = CfnScheduledActionProps.builder()
     * .autoScalingGroupName("autoScalingGroupName")
     * // the properties below are optional
     * .desiredCapacity(123)
     * .endTime("endTime")
     * .maxSize(123)
     * .minSize(123)
     * .recurrence("recurrence")
     * .startTime("startTime")
     * .timeZone("timeZone")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scheduledaction.html)
     */
    public inline fun cfnScheduledActionProps(
        block: CfnScheduledActionPropsDsl.() -> Unit = {}
    ): CfnScheduledActionProps {
        val builder = CfnScheduledActionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::AutoScaling::WarmPool` resource creates a pool of pre-initialized EC2 instances
     * that sits alongside the Auto Scaling group.
     *
     * Whenever your application needs to scale out, the Auto Scaling group can draw on the warm
     * pool to meet its new desired capacity.
     *
     * When you create a warm pool, you can define a minimum size. When your Auto Scaling group
     * scales out and the size of the warm pool shrinks, Amazon EC2 Auto Scaling launches new
     * instances into the warm pool to maintain its minimum size.
     *
     * For more information, see
     * [Warm pools for Amazon EC2 Auto Scaling](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-warm-pools.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * CloudFormation supports the `UpdatePolicy` attribute for Auto Scaling groups. During an
     * update, if `UpdatePolicy` is set to `AutoScalingRollingUpdate` , CloudFormation replaces
     * `InService` instances only. Instances in the warm pool are not replaced. The difference in
     * which instances are replaced can potentially result in different instance configurations
     * after the stack update completes. If `UpdatePolicy` is set to `AutoScalingReplacingUpdate` ,
     * you do not encounter this issue because CloudFormation replaces both the Auto Scaling group
     * and the warm pool.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.autoscaling.*;
     * CfnWarmPool cfnWarmPool = CfnWarmPool.Builder.create(this, "MyCfnWarmPool")
     * .autoScalingGroupName("autoScalingGroupName")
     * // the properties below are optional
     * .instanceReusePolicy(InstanceReusePolicyProperty.builder()
     * .reuseOnScaleIn(false)
     * .build())
     * .maxGroupPreparedCapacity(123)
     * .minSize(123)
     * .poolState("poolState")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-warmpool.html)
     */
    public inline fun cfnWarmPool(
        scope: Construct,
        id: String,
        block: CfnWarmPoolDsl.() -> Unit = {},
    ): CfnWarmPool {
        val builder = CfnWarmPoolDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * A structure that specifies an instance reuse policy for the `InstanceReusePolicy` property of
     * the
     * [AWS::AutoScaling::WarmPool](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-warmpool.html)
     * resource.
     *
     * For more information, see
     * [Warm pools for Amazon EC2 Auto Scaling](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-warm-pools.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.autoscaling.*;
     * InstanceReusePolicyProperty instanceReusePolicyProperty = InstanceReusePolicyProperty.builder()
     * .reuseOnScaleIn(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-warmpool-instancereusepolicy.html)
     */
    public inline fun cfnWarmPoolInstanceReusePolicyProperty(
        block: CfnWarmPoolInstanceReusePolicyPropertyDsl.() -> Unit = {}
    ): CfnWarmPool.InstanceReusePolicyProperty {
        val builder = CfnWarmPoolInstanceReusePolicyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnWarmPool`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.autoscaling.*;
     * CfnWarmPoolProps cfnWarmPoolProps = CfnWarmPoolProps.builder()
     * .autoScalingGroupName("autoScalingGroupName")
     * // the properties below are optional
     * .instanceReusePolicy(InstanceReusePolicyProperty.builder()
     * .reuseOnScaleIn(false)
     * .build())
     * .maxGroupPreparedCapacity(123)
     * .minSize(123)
     * .poolState("poolState")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-warmpool.html)
     */
    public inline fun cfnWarmPoolProps(
        block: CfnWarmPoolPropsDsl.() -> Unit = {}
    ): CfnWarmPoolProps {
        val builder = CfnWarmPoolPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Basic properties of an AutoScalingGroup, except the exact machines to run and where they
     * should run.
     *
     * Constructs that want to create AutoScalingGroups can inherit this interface and specialize
     * the essential parts in various ways.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.autoscaling.*;
     * import software.amazon.awscdk.services.ec2.*;
     * import software.amazon.awscdk.services.sns.*;
     * BlockDeviceVolume blockDeviceVolume;
     * GroupMetrics groupMetrics;
     * HealthCheck healthCheck;
     * ScalingEvents scalingEvents;
     * Signals signals;
     * Subnet subnet;
     * SubnetFilter subnetFilter;
     * Topic topic;
     * UpdatePolicy updatePolicy;
     * CommonAutoScalingGroupProps commonAutoScalingGroupProps = CommonAutoScalingGroupProps.builder()
     * .allowAllOutbound(false)
     * .associatePublicIpAddress(false)
     * .autoScalingGroupName("autoScalingGroupName")
     * .blockDevices(List.of(BlockDevice.builder()
     * .deviceName("deviceName")
     * .volume(blockDeviceVolume)
     * .build()))
     * .capacityRebalance(false)
     * .cooldown(Duration.minutes(30))
     * .defaultInstanceWarmup(Duration.minutes(30))
     * .desiredCapacity(123)
     * .groupMetrics(List.of(groupMetrics))
     * .healthCheck(healthCheck)
     * .ignoreUnmodifiedSizeProperties(false)
     * .instanceMonitoring(Monitoring.BASIC)
     * .keyName("keyName")
     * .maxCapacity(123)
     * .maxInstanceLifetime(Duration.minutes(30))
     * .minCapacity(123)
     * .newInstancesProtectedFromScaleIn(false)
     * .notifications(List.of(NotificationConfiguration.builder()
     * .topic(topic)
     * // the properties below are optional
     * .scalingEvents(scalingEvents)
     * .build()))
     * .signals(signals)
     * .spotPrice("spotPrice")
     * .ssmSessionPermissions(false)
     * .terminationPolicies(List.of(TerminationPolicy.ALLOCATION_STRATEGY))
     * .updatePolicy(updatePolicy)
     * .vpcSubnets(SubnetSelection.builder()
     * .availabilityZones(List.of("availabilityZones"))
     * .onePerAz(false)
     * .subnetFilters(List.of(subnetFilter))
     * .subnetGroupName("subnetGroupName")
     * .subnets(List.of(subnet))
     * .subnetType(SubnetType.PRIVATE_ISOLATED)
     * .build())
     * .build();
     * ```
     */
    public inline fun commonAutoScalingGroupProps(
        block: CommonAutoScalingGroupPropsDsl.() -> Unit = {}
    ): CommonAutoScalingGroupProps {
        val builder = CommonAutoScalingGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for enabling scaling based on CPU utilization.
     *
     * Example:
     * ```
     * AutoScalingGroup autoScalingGroup;
     * autoScalingGroup.scaleOnCpuUtilization("KeepSpareCPU", CpuUtilizationScalingProps.builder()
     * .targetUtilizationPercent(50)
     * .build());
     * ```
     */
    public inline fun cpuUtilizationScalingProps(
        block: CpuUtilizationScalingPropsDsl.() -> Unit = {}
    ): CpuUtilizationScalingProps {
        val builder = CpuUtilizationScalingPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options to configure a cron expression.
     *
     * All fields are strings so you can use complex expressions. Absence of a field implies '*' or
     * '?', whichever one is appropriate.
     *
     * Example:
     * ```
     * AutoScalingGroup autoScalingGroup;
     * autoScalingGroup.scaleOnSchedule("PrescaleInTheMorning", BasicScheduledActionProps.builder()
     * .schedule(Schedule.cron(CronOptions.builder().hour("8").minute("0").build()))
     * .minCapacity(20)
     * .build());
     * autoScalingGroup.scaleOnSchedule("AllowDownscalingAtNight", BasicScheduledActionProps.builder()
     * .schedule(Schedule.cron(CronOptions.builder().hour("20").minute("0").build()))
     * .minCapacity(1)
     * .build());
     * ```
     *
     * [Documentation](http://crontab.org/)
     */
    public inline fun cronOptions(block: CronOptionsDsl.() -> Unit = {}): CronOptions {
        val builder = CronOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Block device options for an EBS volume.
     *
     * Example:
     * ```
     * Vpc vpc;
     * InstanceType instanceType;
     * IMachineImage machineImage;
     * AutoScalingGroup autoScalingGroup = AutoScalingGroup.Builder.create(this, "ASG")
     * .vpc(vpc)
     * .instanceType(instanceType)
     * .machineImage(machineImage)
     * .blockDevices(List.of(BlockDevice.builder()
     * .deviceName("gp3-volume")
     * .volume(BlockDeviceVolume.ebs(15, EbsDeviceOptions.builder()
     * .volumeType(EbsDeviceVolumeType.GP3)
     * .throughput(125)
     * .build()))
     * .build()))
     * .build();
     * ```
     */
    public inline fun ebsDeviceOptions(
        block: EbsDeviceOptionsDsl.() -> Unit = {}
    ): EbsDeviceOptions {
        val builder = EbsDeviceOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Base block device options for an EBS volume.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.autoscaling.*;
     * EbsDeviceOptionsBase ebsDeviceOptionsBase = EbsDeviceOptionsBase.builder()
     * .deleteOnTermination(false)
     * .iops(123)
     * .throughput(123)
     * .volumeType(EbsDeviceVolumeType.STANDARD)
     * .build();
     * ```
     */
    public inline fun ebsDeviceOptionsBase(
        block: EbsDeviceOptionsBaseDsl.() -> Unit = {}
    ): EbsDeviceOptionsBase {
        val builder = EbsDeviceOptionsBaseDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties of an EBS block device.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.autoscaling.*;
     * EbsDeviceProps ebsDeviceProps = EbsDeviceProps.builder()
     * .deleteOnTermination(false)
     * .iops(123)
     * .snapshotId("snapshotId")
     * .throughput(123)
     * .volumeSize(123)
     * .volumeType(EbsDeviceVolumeType.STANDARD)
     * .build();
     * ```
     */
    public inline fun ebsDeviceProps(block: EbsDevicePropsDsl.() -> Unit = {}): EbsDeviceProps {
        val builder = EbsDevicePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Block device options for an EBS volume created from a snapshot.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.autoscaling.*;
     * EbsDeviceSnapshotOptions ebsDeviceSnapshotOptions = EbsDeviceSnapshotOptions.builder()
     * .deleteOnTermination(false)
     * .iops(123)
     * .throughput(123)
     * .volumeSize(123)
     * .volumeType(EbsDeviceVolumeType.STANDARD)
     * .build();
     * ```
     */
    public inline fun ebsDeviceSnapshotOptions(
        block: EbsDeviceSnapshotOptionsDsl.() -> Unit = {}
    ): EbsDeviceSnapshotOptions {
        val builder = EbsDeviceSnapshotOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * EC2 Heath check options.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.autoscaling.*;
     * Ec2HealthCheckOptions ec2HealthCheckOptions = Ec2HealthCheckOptions.builder()
     * .grace(Duration.minutes(30))
     * .build();
     * ```
     */
    public inline fun ec2HealthCheckOptions(
        block: Ec2HealthCheckOptionsDsl.() -> Unit = {}
    ): Ec2HealthCheckOptions {
        val builder = Ec2HealthCheckOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * ELB Heath check options.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.autoscaling.*;
     * ElbHealthCheckOptions elbHealthCheckOptions = ElbHealthCheckOptions.builder()
     * .grace(Duration.minutes(30))
     * .build();
     * ```
     */
    public inline fun elbHealthCheckOptions(
        block: ElbHealthCheckOptionsDsl.() -> Unit = {}
    ): ElbHealthCheckOptions {
        val builder = ElbHealthCheckOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * InstancesDistribution is a subproperty of MixedInstancesPolicy that describes an instances
     * distribution for an Auto Scaling group.
     *
     * The instances distribution specifies the distribution of On-Demand Instances and Spot
     * Instances, the maximum price to pay for Spot Instances, and how the Auto Scaling group
     * allocates instance types to fulfill On-Demand and Spot capacities.
     *
     * For more information and example configurations, see Auto Scaling groups with multiple
     * instance types and purchase options in the Amazon EC2 Auto Scaling User Guide:
     *
     * https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-purchase-options.html
     *
     * Example:
     * ```
     * Vpc vpc;
     * LaunchTemplate launchTemplate1;
     * LaunchTemplate launchTemplate2;
     * AutoScalingGroup.Builder.create(this, "ASG")
     * .vpc(vpc)
     * .mixedInstancesPolicy(MixedInstancesPolicy.builder()
     * .instancesDistribution(InstancesDistribution.builder()
     * .onDemandPercentageAboveBaseCapacity(50)
     * .build())
     * .launchTemplate(launchTemplate1)
     * .launchTemplateOverrides(List.of(LaunchTemplateOverrides.builder().instanceType(new
     * InstanceType("t3.micro")).build(), LaunchTemplateOverrides.builder().instanceType(new
     * InstanceType("t3a.micro")).build(), LaunchTemplateOverrides.builder().instanceType(new
     * InstanceType("t4g.micro")).launchTemplate(launchTemplate2).build()))
     * .build())
     * .build();
     * ```
     */
    public inline fun instancesDistribution(
        block: InstancesDistributionDsl.() -> Unit = {}
    ): InstancesDistribution {
        val builder = InstancesDistributionDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * LaunchTemplateOverrides is a subproperty of LaunchTemplate that describes an override for a
     * launch template.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.autoscaling.*;
     * import software.amazon.awscdk.services.ec2.*;
     * InstanceType instanceType;
     * LaunchTemplate launchTemplate;
     * LaunchTemplateOverrides launchTemplateOverrides = LaunchTemplateOverrides.builder()
     * .instanceType(instanceType)
     * // the properties below are optional
     * .launchTemplate(launchTemplate)
     * .weightedCapacity(123)
     * .build();
     * ```
     */
    public inline fun launchTemplateOverrides(
        block: LaunchTemplateOverridesDsl.() -> Unit = {}
    ): LaunchTemplateOverrides {
        val builder = LaunchTemplateOverridesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Define a life cycle hook.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.autoscaling.*;
     * import software.amazon.awscdk.services.iam.*;
     * AutoScalingGroup autoScalingGroup;
     * ILifecycleHookTarget lifecycleHookTarget;
     * Role role;
     * LifecycleHook lifecycleHook = LifecycleHook.Builder.create(this, "MyLifecycleHook")
     * .autoScalingGroup(autoScalingGroup)
     * .lifecycleTransition(LifecycleTransition.INSTANCE_LAUNCHING)
     * // the properties below are optional
     * .defaultResult(DefaultResult.CONTINUE)
     * .heartbeatTimeout(Duration.minutes(30))
     * .lifecycleHookName("lifecycleHookName")
     * .notificationMetadata("notificationMetadata")
     * .notificationTarget(lifecycleHookTarget)
     * .role(role)
     * .build();
     * ```
     */
    public inline fun lifecycleHook(
        scope: Construct,
        id: String,
        block: LifecycleHookDsl.() -> Unit = {},
    ): LifecycleHook {
        val builder = LifecycleHookDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a Lifecycle hook.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.autoscaling.*;
     * import software.amazon.awscdk.services.iam.*;
     * AutoScalingGroup autoScalingGroup;
     * ILifecycleHookTarget lifecycleHookTarget;
     * Role role;
     * LifecycleHookProps lifecycleHookProps = LifecycleHookProps.builder()
     * .autoScalingGroup(autoScalingGroup)
     * .lifecycleTransition(LifecycleTransition.INSTANCE_LAUNCHING)
     * // the properties below are optional
     * .defaultResult(DefaultResult.CONTINUE)
     * .heartbeatTimeout(Duration.minutes(30))
     * .lifecycleHookName("lifecycleHookName")
     * .notificationMetadata("notificationMetadata")
     * .notificationTarget(lifecycleHookTarget)
     * .role(role)
     * .build();
     * ```
     */
    public inline fun lifecycleHookProps(
        block: LifecycleHookPropsDsl.() -> Unit = {}
    ): LifecycleHookProps {
        val builder = LifecycleHookPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Result of binding a lifecycle hook to a target.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.autoscaling.*;
     * import software.amazon.awscdk.services.iam.*;
     * Role role;
     * LifecycleHookTargetConfig lifecycleHookTargetConfig = LifecycleHookTargetConfig.builder()
     * .createdRole(role)
     * .notificationTargetArn("notificationTargetArn")
     * .build();
     * ```
     */
    public inline fun lifecycleHookTargetConfig(
        block: LifecycleHookTargetConfigDsl.() -> Unit = {}
    ): LifecycleHookTargetConfig {
        val builder = LifecycleHookTargetConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for enabling tracking of an arbitrary metric.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.autoscaling.*;
     * import software.amazon.awscdk.services.cloudwatch.*;
     * Metric metric;
     * MetricTargetTrackingProps metricTargetTrackingProps = MetricTargetTrackingProps.builder()
     * .metric(metric)
     * .targetValue(123)
     * // the properties below are optional
     * .cooldown(Duration.minutes(30))
     * .disableScaleIn(false)
     * .estimatedInstanceWarmup(Duration.minutes(30))
     * .build();
     * ```
     */
    public inline fun metricTargetTrackingProps(
        block: MetricTargetTrackingPropsDsl.() -> Unit = {}
    ): MetricTargetTrackingProps {
        val builder = MetricTargetTrackingPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * MixedInstancesPolicy allows you to configure a group that diversifies across On-Demand
     * Instances and Spot Instances of multiple instance types.
     *
     * For more information, see Auto Scaling groups with multiple instance types and purchase
     * options in the Amazon EC2 Auto Scaling User Guide:
     *
     * https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-purchase-options.html
     *
     * Example:
     * ```
     * Vpc vpc;
     * LaunchTemplate launchTemplate1;
     * LaunchTemplate launchTemplate2;
     * AutoScalingGroup.Builder.create(this, "ASG")
     * .vpc(vpc)
     * .mixedInstancesPolicy(MixedInstancesPolicy.builder()
     * .instancesDistribution(InstancesDistribution.builder()
     * .onDemandPercentageAboveBaseCapacity(50)
     * .build())
     * .launchTemplate(launchTemplate1)
     * .launchTemplateOverrides(List.of(LaunchTemplateOverrides.builder().instanceType(new
     * InstanceType("t3.micro")).build(), LaunchTemplateOverrides.builder().instanceType(new
     * InstanceType("t3a.micro")).build(), LaunchTemplateOverrides.builder().instanceType(new
     * InstanceType("t4g.micro")).launchTemplate(launchTemplate2).build()))
     * .build())
     * .build();
     * ```
     */
    public inline fun mixedInstancesPolicy(
        block: MixedInstancesPolicyDsl.() -> Unit = {}
    ): MixedInstancesPolicy {
        val builder = MixedInstancesPolicyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for enabling scaling based on network utilization.
     *
     * Example:
     * ```
     * AutoScalingGroup autoScalingGroup;
     * autoScalingGroup.scaleOnIncomingBytes("LimitIngressPerInstance",
     * NetworkUtilizationScalingProps.builder()
     * .targetBytesPerSecond(10 * 1024 * 1024)
     * .build());
     * autoScalingGroup.scaleOnOutgoingBytes("LimitEgressPerInstance",
     * NetworkUtilizationScalingProps.builder()
     * .targetBytesPerSecond(10 * 1024 * 1024)
     * .build());
     * ```
     */
    public inline fun networkUtilizationScalingProps(
        block: NetworkUtilizationScalingPropsDsl.() -> Unit = {}
    ): NetworkUtilizationScalingProps {
        val builder = NetworkUtilizationScalingPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * AutoScalingGroup fleet change notifications configurations.
     *
     * You can configure AutoScaling to send an SNS notification whenever your Auto Scaling group
     * scales.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.autoscaling.*;
     * import software.amazon.awscdk.services.sns.*;
     * ScalingEvents scalingEvents;
     * Topic topic;
     * NotificationConfiguration notificationConfiguration = NotificationConfiguration.builder()
     * .topic(topic)
     * // the properties below are optional
     * .scalingEvents(scalingEvents)
     * .build();
     * ```
     */
    public inline fun notificationConfiguration(
        block: NotificationConfigurationDsl.() -> Unit = {}
    ): NotificationConfiguration {
        val builder = NotificationConfigurationDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Input for Signals.renderCreationPolicy.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.autoscaling.*;
     * RenderSignalsOptions renderSignalsOptions = RenderSignalsOptions.builder()
     * .desiredCapacity(123)
     * .minCapacity(123)
     * .build();
     * ```
     */
    public inline fun renderSignalsOptions(
        block: RenderSignalsOptionsDsl.() -> Unit = {}
    ): RenderSignalsOptions {
        val builder = RenderSignalsOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for enabling scaling based on request/second.
     *
     * Example:
     * ```
     * AutoScalingGroup autoScalingGroup;
     * autoScalingGroup.scaleOnRequestCount("LimitRPS", RequestCountScalingProps.builder()
     * .targetRequestsPerSecond(1000)
     * .build());
     * ```
     */
    public inline fun requestCountScalingProps(
        block: RequestCountScalingPropsDsl.() -> Unit = {}
    ): RequestCountScalingProps {
        val builder = RequestCountScalingPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for customizing the rolling update.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.autoscaling.*;
     * RollingUpdateOptions rollingUpdateOptions = RollingUpdateOptions.builder()
     * .maxBatchSize(123)
     * .minInstancesInService(123)
     * .minSuccessPercentage(123)
     * .pauseTime(Duration.minutes(30))
     * .suspendProcesses(List.of(ScalingProcess.LAUNCH))
     * .waitOnResourceSignals(false)
     * .build();
     * ```
     */
    public inline fun rollingUpdateOptions(
        block: RollingUpdateOptionsDsl.() -> Unit = {}
    ): RollingUpdateOptions {
        val builder = RollingUpdateOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A range of metric values in which to apply a certain scaling operation.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.autoscaling.*;
     * ScalingInterval scalingInterval = ScalingInterval.builder()
     * .change(123)
     * // the properties below are optional
     * .lower(123)
     * .upper(123)
     * .build();
     * ```
     */
    public inline fun scalingInterval(block: ScalingIntervalDsl.() -> Unit = {}): ScalingInterval {
        val builder = ScalingIntervalDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Define a scheduled scaling action.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.autoscaling.*;
     * AutoScalingGroup autoScalingGroup;
     * Schedule schedule;
     * ScheduledAction scheduledAction = ScheduledAction.Builder.create(this, "MyScheduledAction")
     * .autoScalingGroup(autoScalingGroup)
     * .schedule(schedule)
     * // the properties below are optional
     * .desiredCapacity(123)
     * .endTime(new Date())
     * .maxCapacity(123)
     * .minCapacity(123)
     * .startTime(new Date())
     * .timeZone("timeZone")
     * .build();
     * ```
     */
    public inline fun scheduledAction(
        scope: Construct,
        id: String,
        block: ScheduledActionDsl.() -> Unit = {},
    ): ScheduledAction {
        val builder = ScheduledActionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a scheduled action on an AutoScalingGroup.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.autoscaling.*;
     * AutoScalingGroup autoScalingGroup;
     * Schedule schedule;
     * ScheduledActionProps scheduledActionProps = ScheduledActionProps.builder()
     * .autoScalingGroup(autoScalingGroup)
     * .schedule(schedule)
     * // the properties below are optional
     * .desiredCapacity(123)
     * .endTime(new Date())
     * .maxCapacity(123)
     * .minCapacity(123)
     * .startTime(new Date())
     * .timeZone("timeZone")
     * .build();
     * ```
     */
    public inline fun scheduledActionProps(
        block: ScheduledActionPropsDsl.() -> Unit = {}
    ): ScheduledActionProps {
        val builder = ScheduledActionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Customization options for Signal handling.
     *
     * Example:
     * ```
     * Vpc vpc;
     * InstanceType instanceType;
     * IMachineImage machineImage;
     * AutoScalingGroup.Builder.create(this, "ASG")
     * .vpc(vpc)
     * .instanceType(instanceType)
     * .machineImage(machineImage)
     * // ...
     * .init(CloudFormationInit.fromElements(InitFile.fromString("/etc/my_instance", "This got written
     * during instance startup")))
     * .signals(Signals.waitForAll(SignalsOptions.builder()
     * .timeout(Duration.minutes(10))
     * .build()))
     * .build();
     * ```
     */
    public inline fun signalsOptions(block: SignalsOptionsDsl.() -> Unit = {}): SignalsOptions {
        val builder = SignalsOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Define a step scaling action.
     *
     * This kind of scaling policy adjusts the target capacity in configurable steps. The size of
     * the step is configurable based on the metric's distance to its alarm threshold.
     *
     * This Action must be used as the target of a CloudWatch alarm to take effect.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.autoscaling.*;
     * AutoScalingGroup autoScalingGroup;
     * StepScalingAction stepScalingAction = StepScalingAction.Builder.create(this,
     * "MyStepScalingAction")
     * .autoScalingGroup(autoScalingGroup)
     * // the properties below are optional
     * .adjustmentType(AdjustmentType.CHANGE_IN_CAPACITY)
     * .cooldown(Duration.minutes(30))
     * .estimatedInstanceWarmup(Duration.minutes(30))
     * .metricAggregationType(MetricAggregationType.AVERAGE)
     * .minAdjustmentMagnitude(123)
     * .build();
     * ```
     */
    public inline fun stepScalingAction(
        scope: Construct,
        id: String,
        block: StepScalingActionDsl.() -> Unit = {},
    ): StepScalingAction {
        val builder = StepScalingActionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a scaling policy.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.autoscaling.*;
     * AutoScalingGroup autoScalingGroup;
     * StepScalingActionProps stepScalingActionProps = StepScalingActionProps.builder()
     * .autoScalingGroup(autoScalingGroup)
     * // the properties below are optional
     * .adjustmentType(AdjustmentType.CHANGE_IN_CAPACITY)
     * .cooldown(Duration.minutes(30))
     * .estimatedInstanceWarmup(Duration.minutes(30))
     * .metricAggregationType(MetricAggregationType.AVERAGE)
     * .minAdjustmentMagnitude(123)
     * .build();
     * ```
     */
    public inline fun stepScalingActionProps(
        block: StepScalingActionPropsDsl.() -> Unit = {}
    ): StepScalingActionProps {
        val builder = StepScalingActionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Define a acaling strategy which scales depending on absolute values of some metric.
     *
     * You can specify the scaling behavior for various values of the metric.
     *
     * Implemented using one or more CloudWatch alarms and Step Scaling Policies.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.autoscaling.*;
     * import software.amazon.awscdk.services.cloudwatch.*;
     * AutoScalingGroup autoScalingGroup;
     * Metric metric;
     * StepScalingPolicy stepScalingPolicy = StepScalingPolicy.Builder.create(this,
     * "MyStepScalingPolicy")
     * .autoScalingGroup(autoScalingGroup)
     * .metric(metric)
     * .scalingSteps(List.of(ScalingInterval.builder()
     * .change(123)
     * // the properties below are optional
     * .lower(123)
     * .upper(123)
     * .build()))
     * // the properties below are optional
     * .adjustmentType(AdjustmentType.CHANGE_IN_CAPACITY)
     * .cooldown(Duration.minutes(30))
     * .estimatedInstanceWarmup(Duration.minutes(30))
     * .evaluationPeriods(123)
     * .metricAggregationType(MetricAggregationType.AVERAGE)
     * .minAdjustmentMagnitude(123)
     * .build();
     * ```
     */
    public inline fun stepScalingPolicy(
        scope: Construct,
        id: String,
        block: StepScalingPolicyDsl.() -> Unit = {},
    ): StepScalingPolicy {
        val builder = StepScalingPolicyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.autoscaling.*;
     * import software.amazon.awscdk.services.cloudwatch.*;
     * AutoScalingGroup autoScalingGroup;
     * Metric metric;
     * StepScalingPolicyProps stepScalingPolicyProps = StepScalingPolicyProps.builder()
     * .autoScalingGroup(autoScalingGroup)
     * .metric(metric)
     * .scalingSteps(List.of(ScalingInterval.builder()
     * .change(123)
     * // the properties below are optional
     * .lower(123)
     * .upper(123)
     * .build()))
     * // the properties below are optional
     * .adjustmentType(AdjustmentType.CHANGE_IN_CAPACITY)
     * .cooldown(Duration.minutes(30))
     * .estimatedInstanceWarmup(Duration.minutes(30))
     * .evaluationPeriods(123)
     * .metricAggregationType(MetricAggregationType.AVERAGE)
     * .minAdjustmentMagnitude(123)
     * .build();
     * ```
     */
    public inline fun stepScalingPolicyProps(
        block: StepScalingPolicyPropsDsl.() -> Unit = {}
    ): StepScalingPolicyProps {
        val builder = StepScalingPolicyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.autoscaling.*;
     * import software.amazon.awscdk.services.cloudwatch.*;
     * AutoScalingGroup autoScalingGroup;
     * Metric metric;
     * TargetTrackingScalingPolicy targetTrackingScalingPolicy =
     * TargetTrackingScalingPolicy.Builder.create(this, "MyTargetTrackingScalingPolicy")
     * .autoScalingGroup(autoScalingGroup)
     * .targetValue(123)
     * // the properties below are optional
     * .cooldown(Duration.minutes(30))
     * .customMetric(metric)
     * .disableScaleIn(false)
     * .estimatedInstanceWarmup(Duration.minutes(30))
     * .predefinedMetric(PredefinedMetric.ASG_AVERAGE_CPU_UTILIZATION)
     * .resourceLabel("resourceLabel")
     * .build();
     * ```
     */
    public inline fun targetTrackingScalingPolicy(
        scope: Construct,
        id: String,
        block: TargetTrackingScalingPolicyDsl.() -> Unit = {},
    ): TargetTrackingScalingPolicy {
        val builder = TargetTrackingScalingPolicyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a concrete TargetTrackingPolicy.
     *
     * Adds the scalingTarget.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.autoscaling.*;
     * import software.amazon.awscdk.services.cloudwatch.*;
     * AutoScalingGroup autoScalingGroup;
     * Metric metric;
     * TargetTrackingScalingPolicyProps targetTrackingScalingPolicyProps =
     * TargetTrackingScalingPolicyProps.builder()
     * .autoScalingGroup(autoScalingGroup)
     * .targetValue(123)
     * // the properties below are optional
     * .cooldown(Duration.minutes(30))
     * .customMetric(metric)
     * .disableScaleIn(false)
     * .estimatedInstanceWarmup(Duration.minutes(30))
     * .predefinedMetric(PredefinedMetric.ASG_AVERAGE_CPU_UTILIZATION)
     * .resourceLabel("resourceLabel")
     * .build();
     * ```
     */
    public inline fun targetTrackingScalingPolicyProps(
        block: TargetTrackingScalingPolicyPropsDsl.() -> Unit = {}
    ): TargetTrackingScalingPolicyProps {
        val builder = TargetTrackingScalingPolicyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Define a warm pool.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.autoscaling.*;
     * AutoScalingGroup autoScalingGroup;
     * WarmPool warmPool = WarmPool.Builder.create(this, "MyWarmPool")
     * .autoScalingGroup(autoScalingGroup)
     * // the properties below are optional
     * .maxGroupPreparedCapacity(123)
     * .minSize(123)
     * .poolState(PoolState.HIBERNATED)
     * .reuseOnScaleIn(false)
     * .build();
     * ```
     */
    public inline fun warmPool(
        scope: Construct,
        id: String,
        block: WarmPoolDsl.() -> Unit = {},
    ): WarmPool {
        val builder = WarmPoolDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for a warm pool.
     *
     * Example:
     * ```
     * AutoScalingGroup autoScalingGroup;
     * autoScalingGroup.addWarmPool(WarmPoolOptions.builder()
     * .minSize(1)
     * .reuseOnScaleIn(true)
     * .build());
     * ```
     */
    public inline fun warmPoolOptions(block: WarmPoolOptionsDsl.() -> Unit = {}): WarmPoolOptions {
        val builder = WarmPoolOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a warm pool.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.autoscaling.*;
     * AutoScalingGroup autoScalingGroup;
     * WarmPoolProps warmPoolProps = WarmPoolProps.builder()
     * .autoScalingGroup(autoScalingGroup)
     * // the properties below are optional
     * .maxGroupPreparedCapacity(123)
     * .minSize(123)
     * .poolState(PoolState.HIBERNATED)
     * .reuseOnScaleIn(false)
     * .build();
     * ```
     */
    public inline fun warmPoolProps(block: WarmPoolPropsDsl.() -> Unit = {}): WarmPoolProps {
        val builder = WarmPoolPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
