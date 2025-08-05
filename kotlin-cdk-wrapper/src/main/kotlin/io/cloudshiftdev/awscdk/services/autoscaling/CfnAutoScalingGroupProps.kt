@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnAutoScalingGroup`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.autoscaling.*;
 * CfnAutoScalingGroupProps cfnAutoScalingGroupProps = CfnAutoScalingGroupProps.builder()
 * .maxSize("maxSize")
 * .minSize("minSize")
 * // the properties below are optional
 * .autoScalingGroupName("autoScalingGroupName")
 * .availabilityZoneDistribution(AvailabilityZoneDistributionProperty.builder()
 * .capacityDistributionStrategy("capacityDistributionStrategy")
 * .build())
 * .availabilityZoneImpairmentPolicy(AvailabilityZoneImpairmentPolicyProperty.builder()
 * .impairedZoneHealthCheckBehavior("impairedZoneHealthCheckBehavior")
 * .zonalShiftEnabled(false)
 * .build())
 * .availabilityZones(List.of("availabilityZones"))
 * .capacityRebalance(false)
 * .capacityReservationSpecification(CapacityReservationSpecificationProperty.builder()
 * .capacityReservationPreference("capacityReservationPreference")
 * // the properties below are optional
 * .capacityReservationTarget(CapacityReservationTargetProperty.builder()
 * .capacityReservationIds(List.of("capacityReservationIds"))
 * .capacityReservationResourceGroupArns(List.of("capacityReservationResourceGroupArns"))
 * .build())
 * .build())
 * .context("context")
 * .cooldown("cooldown")
 * .defaultInstanceWarmup(123)
 * .desiredCapacity("desiredCapacity")
 * .desiredCapacityType("desiredCapacityType")
 * .healthCheckGracePeriod(123)
 * .healthCheckType("healthCheckType")
 * .instanceId("instanceId")
 * .instanceMaintenancePolicy(InstanceMaintenancePolicyProperty.builder()
 * .maxHealthyPercentage(123)
 * .minHealthyPercentage(123)
 * .build())
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
 * .memoryMiB(MemoryMiBRequestProperty.builder()
 * .max(123)
 * .min(123)
 * .build())
 * .vCpuCount(VCpuCountRequestProperty.builder()
 * .max(123)
 * .min(123)
 * .build())
 * // the properties below are optional
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
 * .baselinePerformanceFactors(BaselinePerformanceFactorsRequestProperty.builder()
 * .cpu(CpuPerformanceFactorRequestProperty.builder()
 * .references(List.of(PerformanceFactorReferenceRequestProperty.builder()
 * .instanceFamily("instanceFamily")
 * .build()))
 * .build())
 * .build())
 * .burstablePerformance("burstablePerformance")
 * .cpuManufacturers(List.of("cpuManufacturers"))
 * .excludedInstanceTypes(List.of("excludedInstanceTypes"))
 * .instanceGenerations(List.of("instanceGenerations"))
 * .localStorage("localStorage")
 * .localStorageTypes(List.of("localStorageTypes"))
 * .maxSpotPriceAsPercentageOfOptimalOnDemandPrice(123)
 * .memoryGiBPerVCpu(MemoryGiBPerVCpuRequestProperty.builder()
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
 * .notificationConfiguration(NotificationConfigurationProperty.builder()
 * .topicArn("topicArn")
 * // the properties below are optional
 * .notificationTypes(List.of("notificationTypes"))
 * .build())
 * .notificationConfigurations(List.of(NotificationConfigurationProperty.builder()
 * .topicArn("topicArn")
 * // the properties below are optional
 * .notificationTypes(List.of("notificationTypes"))
 * .build()))
 * .placementGroup("placementGroup")
 * .serviceLinkedRoleArn("serviceLinkedRoleArn")
 * .skipZonalShiftValidation(false)
 * .tags(List.of(TagPropertyProperty.builder()
 * .key("key")
 * .propagateAtLaunch(false)
 * .value("value")
 * .build()))
 * .targetGroupArns(List.of("targetGroupArns"))
 * .terminationPolicies(List.of("terminationPolicies"))
 * .trafficSources(List.of(TrafficSourceIdentifierProperty.builder()
 * .identifier("identifier")
 * .type("type")
 * .build()))
 * .vpcZoneIdentifier(List.of("vpcZoneIdentifier"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html)
 */
public interface CfnAutoScalingGroupProps {
  /**
   * The name of the Auto Scaling group. This name must be unique per Region per account.
   *
   * The name can contain any ASCII character 33 to 126 including most punctuation characters,
   * digits, and upper and lowercased letters.
   *
   *
   * You cannot use a colon (:) in the name.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-autoscalinggroupname)
   */
  public fun autoScalingGroupName(): String? = unwrap(this).getAutoScalingGroupName()

  /**
   * The instance capacity distribution across Availability Zones.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-availabilityzonedistribution)
   */
  public fun availabilityZoneDistribution(): Any? = unwrap(this).getAvailabilityZoneDistribution()

  /**
   * The Availability Zone impairment policy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-availabilityzoneimpairmentpolicy)
   */
  public fun availabilityZoneImpairmentPolicy(): Any? =
      unwrap(this).getAvailabilityZoneImpairmentPolicy()

  /**
   * A list of Availability Zones where instances in the Auto Scaling group can be created.
   *
   * Used for launching into the default VPC subnet in each Availability Zone when not using the
   * `VPCZoneIdentifier` property, or for attaching a network interface when an existing network
   * interface ID is specified in a launch template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-availabilityzones)
   */
  public fun availabilityZones(): List<String> = unwrap(this).getAvailabilityZones() ?: emptyList()

  /**
   * Indicates whether Capacity Rebalancing is enabled.
   *
   * Otherwise, Capacity Rebalancing is disabled. When you turn on Capacity Rebalancing, Amazon EC2
   * Auto Scaling attempts to launch a Spot Instance whenever Amazon EC2 notifies that a Spot Instance
   * is at an elevated risk of interruption. After launching a new instance, it then terminates an old
   * instance. For more information, see [Use Capacity Rebalancing to handle Amazon EC2 Spot
   * Interruptions](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-capacity-rebalancing.html)
   * in the in the *Amazon EC2 Auto Scaling User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-capacityrebalance)
   */
  public fun capacityRebalance(): Any? = unwrap(this).getCapacityRebalance()

  /**
   * The capacity reservation specification.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-capacityreservationspecification)
   */
  public fun capacityReservationSpecification(): Any? =
      unwrap(this).getCapacityReservationSpecification()

  /**
   * Reserved.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-context)
   */
  public fun context(): String? = unwrap(this).getContext()

  /**
   * *Only needed if you use simple scaling policies.*.
   *
   * The amount of time, in seconds, between one scaling activity ending and another one starting
   * due to simple scaling policies. For more information, see [Scaling cooldowns for Amazon EC2 Auto
   * Scaling](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-scaling-cooldowns.html)
   * in the *Amazon EC2 Auto Scaling User Guide* .
   *
   * Default: `300` seconds
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-cooldown)
   */
  public fun cooldown(): String? = unwrap(this).getCooldown()

  /**
   * The amount of time, in seconds, until a new instance is considered to have finished
   * initializing and resource consumption to become stable after it enters the `InService` state.
   *
   * During an instance refresh, Amazon EC2 Auto Scaling waits for the warm-up period after it
   * replaces an instance before it moves on to replacing the next instance. Amazon EC2 Auto Scaling
   * also waits for the warm-up period before aggregating the metrics for new instances with existing
   * instances in the Amazon CloudWatch metrics that are used for scaling, resulting in more reliable
   * usage data. For more information, see [Set the default instance warmup for an Auto Scaling
   * group](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-default-instance-warmup.html)
   * in the *Amazon EC2 Auto Scaling User Guide* .
   *
   *
   * To manage various warm-up settings at the group level, we recommend that you set the default
   * instance warmup, *even if it is set to 0 seconds* . To remove a value that you previously set,
   * include the property but specify `-1` for the value. However, we strongly recommend keeping the
   * default instance warmup enabled by specifying a value of `0` or other nominal value.
   *
   *
   * Default: None
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-defaultinstancewarmup)
   */
  public fun defaultInstanceWarmup(): Number? = unwrap(this).getDefaultInstanceWarmup()

  /**
   * The desired capacity is the initial capacity of the Auto Scaling group at the time of its
   * creation and the capacity it attempts to maintain.
   *
   * It can scale beyond this capacity if you configure automatic scaling.
   *
   * The number must be greater than or equal to the minimum size of the group and less than or
   * equal to the maximum size of the group. If you do not specify a desired capacity when creating the
   * stack, the default is the minimum size of the group.
   *
   * CloudFormation marks the Auto Scaling group as successful (by setting its status to
   * CREATE_COMPLETE) when the desired capacity is reached. However, if a maximum Spot price is set in
   * the launch template or launch configuration that you specified, then desired capacity is not used
   * as a criteria for success. Whether your request is fulfilled depends on Spot Instance capacity and
   * your maximum price.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-desiredcapacity)
   */
  public fun desiredCapacity(): String? = unwrap(this).getDesiredCapacity()

  /**
   * The unit of measurement for the value specified for desired capacity.
   *
   * Amazon EC2 Auto Scaling supports `DesiredCapacityType` for attribute-based instance type
   * selection only. For more information, see [Create a mixed instances group using attribute-based
   * instance type
   * selection](https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-mixed-instances-group-attribute-based-instance-type-selection.html)
   * in the *Amazon EC2 Auto Scaling User Guide* .
   *
   * By default, Amazon EC2 Auto Scaling specifies `units` , which translates into number of
   * instances.
   *
   * Valid values: `units` | `vcpu` | `memory-mib`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-desiredcapacitytype)
   */
  public fun desiredCapacityType(): String? = unwrap(this).getDesiredCapacityType()

  /**
   * The amount of time, in seconds, that Amazon EC2 Auto Scaling waits before checking the health
   * status of an EC2 instance that has come into service and marking it unhealthy due to a failed
   * health check.
   *
   * This is useful if your instances do not immediately pass their health checks after they enter
   * the `InService` state. For more information, see [Set the health check grace period for an Auto
   * Scaling
   * group](https://docs.aws.amazon.com/autoscaling/ec2/userguide/health-check-grace-period.html) in
   * the *Amazon EC2 Auto Scaling User Guide* .
   *
   * Default: `0` seconds
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-healthcheckgraceperiod)
   */
  public fun healthCheckGracePeriod(): Number? = unwrap(this).getHealthCheckGracePeriod()

  /**
   * A comma-separated value string of one or more health check types.
   *
   * The valid values are `EC2` , `EBS` , `ELB` , and `VPC_LATTICE` . `EC2` is the default health
   * check and cannot be disabled. For more information, see [Health checks for instances in an Auto
   * Scaling
   * group](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-health-checks.html)
   * in the *Amazon EC2 Auto Scaling User Guide* .
   *
   * Only specify `EC2` if you must clear a value that was previously set.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-healthchecktype)
   */
  public fun healthCheckType(): String? = unwrap(this).getHealthCheckType()

  /**
   * The ID of the instance used to base the launch configuration on.
   *
   * For more information, see [Create an Auto Scaling group using an EC2
   * instance](https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-asg-from-instance.html) in
   * the *Amazon EC2 Auto Scaling User Guide* .
   *
   * If you specify `LaunchTemplate` , `MixedInstancesPolicy` , or `LaunchConfigurationName` , don't
   * specify `InstanceId` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-instanceid)
   */
  public fun instanceId(): String? = unwrap(this).getInstanceId()

  /**
   * An instance maintenance policy.
   *
   * For more information, see [Set instance maintenance
   * policy](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-instance-maintenance-policy.html)
   * in the *Amazon EC2 Auto Scaling User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-instancemaintenancepolicy)
   */
  public fun instanceMaintenancePolicy(): Any? = unwrap(this).getInstanceMaintenancePolicy()

  /**
   * The name of the launch configuration to use to launch instances.
   *
   * Required only if you don't specify `LaunchTemplate` , `MixedInstancesPolicy` , or `InstanceId`
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-launchconfigurationname)
   */
  public fun launchConfigurationName(): String? = unwrap(this).getLaunchConfigurationName()

  /**
   * Information used to specify the launch template and version to use to launch instances.
   *
   * You can alternatively associate a launch template to the Auto Scaling group by specifying a
   * `MixedInstancesPolicy` . For more information about creating launch templates, see [Create a
   * launch template for an Auto Scaling
   * group](https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-launch-template.html) in the
   * *Amazon EC2 Auto Scaling User Guide* .
   *
   * If you omit this property, you must specify `MixedInstancesPolicy` , `LaunchConfigurationName`
   * , or `InstanceId` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-launchtemplate)
   */
  public fun launchTemplate(): Any? = unwrap(this).getLaunchTemplate()

  /**
   * One or more lifecycle hooks to add to the Auto Scaling group before instances are launched.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecificationlist)
   */
  public fun lifecycleHookSpecificationList(): Any? =
      unwrap(this).getLifecycleHookSpecificationList()

  /**
   * A list of Classic Load Balancers associated with this Auto Scaling group.
   *
   * For Application Load Balancers, Network Load Balancers, and Gateway Load Balancers, specify the
   * `TargetGroupARNs` property instead.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-loadbalancernames)
   */
  public fun loadBalancerNames(): List<String> = unwrap(this).getLoadBalancerNames() ?: emptyList()

  /**
   * The maximum amount of time, in seconds, that an instance can be in service.
   *
   * The default is null. If specified, the value must be either 0 or a number equal to or greater
   * than 86,400 seconds (1 day). For more information, see [Replace Auto Scaling instances based on
   * maximum instance
   * lifetime](https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-max-instance-lifetime.html) in
   * the *Amazon EC2 Auto Scaling User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-maxinstancelifetime)
   */
  public fun maxInstanceLifetime(): Number? = unwrap(this).getMaxInstanceLifetime()

  /**
   * The maximum size of the group.
   *
   *
   * With a mixed instances policy that uses instance weighting, Amazon EC2 Auto Scaling may need to
   * go above `MaxSize` to meet your capacity requirements. In this event, Amazon EC2 Auto Scaling will
   * never go above `MaxSize` by more than your largest instance weight (weights that define how many
   * units each instance contributes to the desired capacity of the group).
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-maxsize)
   */
  public fun maxSize(): String

  /**
   * Enables the monitoring of group metrics of an Auto Scaling group.
   *
   * By default, these metrics are disabled.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-metricscollection)
   */
  public fun metricsCollection(): Any? = unwrap(this).getMetricsCollection()

  /**
   * The minimum size of the group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-minsize)
   */
  public fun minSize(): String

  /**
   * An embedded object that specifies a mixed instances policy.
   *
   * The policy includes properties that not only define the distribution of On-Demand Instances and
   * Spot Instances, the maximum price to pay for Spot Instances (optional), and how the Auto Scaling
   * group allocates instance types to fulfill On-Demand and Spot capacities, but also the properties
   * that specify the instance configuration information—the launch template and instance types. The
   * policy can also include a weight for each instance type and different launch templates for
   * individual instance types.
   *
   * For more information, see [Auto Scaling groups with multiple instance types and purchase
   * options](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-mixed-instances-groups.html)
   * in the *Amazon EC2 Auto Scaling User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-mixedinstancespolicy)
   */
  public fun mixedInstancesPolicy(): Any? = unwrap(this).getMixedInstancesPolicy()

  /**
   * Indicates whether newly launched instances are protected from termination by Amazon EC2 Auto
   * Scaling when scaling in.
   *
   * For more information about preventing instances from terminating on scale in, see [Use instance
   * scale-in
   * protection](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-instance-protection.html)
   * in the *Amazon EC2 Auto Scaling User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-newinstancesprotectedfromscalein)
   */
  public fun newInstancesProtectedFromScaleIn(): Any? =
      unwrap(this).getNewInstancesProtectedFromScaleIn()

  /**
   * (deprecated) A structure that specifies an Amazon SNS notification configuration for the
   * `NotificationConfigurations` property of the
   * [AWS::AutoScaling::AutoScalingGroup](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html)
   * resource.  For an example template snippet, see [Configure Amazon EC2 Auto Scaling
   * resources](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/quickref-ec2-auto-scaling.html).
   *  For more information, see [Get Amazon SNS notifications when your Auto Scaling group
   * scales](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ASGettingNotifications.html) in the
   * *Amazon EC2 Auto Scaling User Guide*.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-notificationconfiguration)
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public fun notificationConfiguration(): Any? = unwrap(this).getNotificationConfiguration()

  /**
   * Configures an Auto Scaling group to send notifications when specified events take place.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-notificationconfigurations)
   */
  public fun notificationConfigurations(): Any? = unwrap(this).getNotificationConfigurations()

  /**
   * The name of the placement group into which to launch your instances.
   *
   * For more information, see [Placement
   * groups](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html) in the *Amazon
   * EC2 User Guide* .
   *
   *
   * A *cluster* placement group is a logical grouping of instances within a single Availability
   * Zone. You cannot specify multiple Availability Zones and a cluster placement group.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-placementgroup)
   */
  public fun placementGroup(): String? = unwrap(this).getPlacementGroup()

  /**
   * The Amazon Resource Name (ARN) of the service-linked role that the Auto Scaling group uses to
   * call other AWS service on your behalf.
   *
   * By default, Amazon EC2 Auto Scaling uses a service-linked role named
   * `AWSServiceRoleForAutoScaling` , which it creates if it does not exist. For more information, see
   * [Service-linked
   * roles](https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-service-linked-role.html)
   * in the *Amazon EC2 Auto Scaling User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-servicelinkedrolearn)
   */
  public fun serviceLinkedRoleArn(): String? = unwrap(this).getServiceLinkedRoleArn()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-skipzonalshiftvalidation)
   */
  public fun skipZonalShiftValidation(): Any? = unwrap(this).getSkipZonalShiftValidation()

  /**
   * One or more tags.
   *
   * You can tag your Auto Scaling group and propagate the tags to the Amazon EC2 instances it
   * launches. Tags are not propagated to Amazon EBS volumes. To add tags to Amazon EBS volumes,
   * specify the tags in a launch template but use caution. If the launch template specifies an
   * instance tag with a key that is also specified for the Auto Scaling group, Amazon EC2 Auto Scaling
   * overrides the value of that instance tag with the value specified by the Auto Scaling group. For
   * more information, see [Tag Auto Scaling groups and
   * instances](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-tagging.html) in
   * the *Amazon EC2 Auto Scaling User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-tags)
   */
  public fun tags(): List<CfnAutoScalingGroup.TagPropertyProperty> =
      unwrap(this).getTags()?.map(CfnAutoScalingGroup.TagPropertyProperty::wrap) ?: emptyList()

  /**
   * The Amazon Resource Names (ARN) of the Elastic Load Balancing target groups to associate with
   * the Auto Scaling group.
   *
   * Instances are registered as targets with the target groups. The target groups receive incoming
   * traffic and route requests to one or more registered targets. For more information, see [Use
   * Elastic Load Balancing to distribute traffic across the instances in your Auto Scaling
   * group](https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-load-balancer.html) in
   * the *Amazon EC2 Auto Scaling User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-targetgrouparns)
   */
  public fun targetGroupArns(): List<String> = unwrap(this).getTargetGroupArns() ?: emptyList()

  /**
   * A policy or a list of policies that are used to select the instance to terminate.
   *
   * These policies are executed in the order that you list them. For more information, see
   * [Configure termination policies for Amazon EC2 Auto
   * Scaling](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-termination-policies.html)
   * in the *Amazon EC2 Auto Scaling User Guide* .
   *
   * Valid values: `Default` | `AllocationStrategy` | `ClosestToNextInstanceHour` | `NewestInstance`
   * | `OldestInstance` | `OldestLaunchConfiguration` | `OldestLaunchTemplate` |
   * `arn:aws:lambda:region:account-id:function:my-function:my-alias`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-terminationpolicies)
   */
  public fun terminationPolicies(): List<String> = unwrap(this).getTerminationPolicies() ?:
      emptyList()

  /**
   * The traffic sources associated with this Auto Scaling group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-trafficsources)
   */
  public fun trafficSources(): Any? = unwrap(this).getTrafficSources()

  /**
   * A list of subnet IDs for a virtual private cloud (VPC) where instances in the Auto Scaling
   * group can be created.
   *
   * If this resource specifies public subnets and is also in a VPC that is defined in the same
   * stack template, you must use the [DependsOn
   * attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
   * to declare a dependency on the [VPC-gateway
   * attachment](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc-gateway-attachment.html)
   * .
   *
   *
   * When you update `VPCZoneIdentifier` , this retains the same Auto Scaling group and replaces old
   * instances with new ones, according to the specified subnets. You can optionally specify how
   * CloudFormation handles these updates by using an [UpdatePolicy
   * attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-updatepolicy.html)
   * .
   *
   *
   * Required to launch instances into a nondefault VPC. If you specify `VPCZoneIdentifier` with
   * `AvailabilityZones` , the subnets that you specify for this property must reside in those
   * Availability Zones.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-vpczoneidentifier)
   */
  public fun vpcZoneIdentifier(): List<String> = unwrap(this).getVpcZoneIdentifier() ?: emptyList()

  /**
   * A builder for [CfnAutoScalingGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param autoScalingGroupName The name of the Auto Scaling group. This name must be unique per
     * Region per account.
     * The name can contain any ASCII character 33 to 126 including most punctuation characters,
     * digits, and upper and lowercased letters.
     *
     *
     * You cannot use a colon (:) in the name.
     */
    public fun autoScalingGroupName(autoScalingGroupName: String)

    /**
     * @param availabilityZoneDistribution The instance capacity distribution across Availability
     * Zones.
     */
    public fun availabilityZoneDistribution(availabilityZoneDistribution: IResolvable)

    /**
     * @param availabilityZoneDistribution The instance capacity distribution across Availability
     * Zones.
     */
    public
        fun availabilityZoneDistribution(availabilityZoneDistribution: CfnAutoScalingGroup.AvailabilityZoneDistributionProperty)

    /**
     * @param availabilityZoneDistribution The instance capacity distribution across Availability
     * Zones.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("34b5ce7af48ba106a23c7b3b0ac8c04d7a0b296c3609389ddb0f7b5170c56eb3")
    public
        fun availabilityZoneDistribution(availabilityZoneDistribution: CfnAutoScalingGroup.AvailabilityZoneDistributionProperty.Builder.() -> Unit)

    /**
     * @param availabilityZoneImpairmentPolicy The Availability Zone impairment policy.
     */
    public fun availabilityZoneImpairmentPolicy(availabilityZoneImpairmentPolicy: IResolvable)

    /**
     * @param availabilityZoneImpairmentPolicy The Availability Zone impairment policy.
     */
    public
        fun availabilityZoneImpairmentPolicy(availabilityZoneImpairmentPolicy: CfnAutoScalingGroup.AvailabilityZoneImpairmentPolicyProperty)

    /**
     * @param availabilityZoneImpairmentPolicy The Availability Zone impairment policy.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("af487dac85c374c2336462cbb670f20023ec4187111bbc0e35789bac82463a1b")
    public
        fun availabilityZoneImpairmentPolicy(availabilityZoneImpairmentPolicy: CfnAutoScalingGroup.AvailabilityZoneImpairmentPolicyProperty.Builder.() -> Unit)

    /**
     * @param availabilityZones A list of Availability Zones where instances in the Auto Scaling
     * group can be created.
     * Used for launching into the default VPC subnet in each Availability Zone when not using the
     * `VPCZoneIdentifier` property, or for attaching a network interface when an existing network
     * interface ID is specified in a launch template.
     */
    public fun availabilityZones(availabilityZones: List<String>)

    /**
     * @param availabilityZones A list of Availability Zones where instances in the Auto Scaling
     * group can be created.
     * Used for launching into the default VPC subnet in each Availability Zone when not using the
     * `VPCZoneIdentifier` property, or for attaching a network interface when an existing network
     * interface ID is specified in a launch template.
     */
    public fun availabilityZones(vararg availabilityZones: String)

    /**
     * @param capacityRebalance Indicates whether Capacity Rebalancing is enabled.
     * Otherwise, Capacity Rebalancing is disabled. When you turn on Capacity Rebalancing, Amazon
     * EC2 Auto Scaling attempts to launch a Spot Instance whenever Amazon EC2 notifies that a Spot
     * Instance is at an elevated risk of interruption. After launching a new instance, it then
     * terminates an old instance. For more information, see [Use Capacity Rebalancing to handle Amazon
     * EC2 Spot
     * Interruptions](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-capacity-rebalancing.html)
     * in the in the *Amazon EC2 Auto Scaling User Guide* .
     */
    public fun capacityRebalance(capacityRebalance: Boolean)

    /**
     * @param capacityRebalance Indicates whether Capacity Rebalancing is enabled.
     * Otherwise, Capacity Rebalancing is disabled. When you turn on Capacity Rebalancing, Amazon
     * EC2 Auto Scaling attempts to launch a Spot Instance whenever Amazon EC2 notifies that a Spot
     * Instance is at an elevated risk of interruption. After launching a new instance, it then
     * terminates an old instance. For more information, see [Use Capacity Rebalancing to handle Amazon
     * EC2 Spot
     * Interruptions](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-capacity-rebalancing.html)
     * in the in the *Amazon EC2 Auto Scaling User Guide* .
     */
    public fun capacityRebalance(capacityRebalance: IResolvable)

    /**
     * @param capacityReservationSpecification The capacity reservation specification.
     */
    public fun capacityReservationSpecification(capacityReservationSpecification: IResolvable)

    /**
     * @param capacityReservationSpecification The capacity reservation specification.
     */
    public
        fun capacityReservationSpecification(capacityReservationSpecification: CfnAutoScalingGroup.CapacityReservationSpecificationProperty)

    /**
     * @param capacityReservationSpecification The capacity reservation specification.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("eb3a4310353c6bc2ec8cc0183f5ce46cbd05299a6b6a268a056f5b70b8b4d305")
    public
        fun capacityReservationSpecification(capacityReservationSpecification: CfnAutoScalingGroup.CapacityReservationSpecificationProperty.Builder.() -> Unit)

    /**
     * @param context Reserved.
     */
    public fun context(context: String)

    /**
     * @param cooldown *Only needed if you use simple scaling policies.*.
     * The amount of time, in seconds, between one scaling activity ending and another one starting
     * due to simple scaling policies. For more information, see [Scaling cooldowns for Amazon EC2 Auto
     * Scaling](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-scaling-cooldowns.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * Default: `300` seconds
     */
    public fun cooldown(cooldown: String)

    /**
     * @param defaultInstanceWarmup The amount of time, in seconds, until a new instance is
     * considered to have finished initializing and resource consumption to become stable after it
     * enters the `InService` state.
     * During an instance refresh, Amazon EC2 Auto Scaling waits for the warm-up period after it
     * replaces an instance before it moves on to replacing the next instance. Amazon EC2 Auto Scaling
     * also waits for the warm-up period before aggregating the metrics for new instances with existing
     * instances in the Amazon CloudWatch metrics that are used for scaling, resulting in more reliable
     * usage data. For more information, see [Set the default instance warmup for an Auto Scaling
     * group](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-default-instance-warmup.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     *
     * To manage various warm-up settings at the group level, we recommend that you set the default
     * instance warmup, *even if it is set to 0 seconds* . To remove a value that you previously set,
     * include the property but specify `-1` for the value. However, we strongly recommend keeping the
     * default instance warmup enabled by specifying a value of `0` or other nominal value.
     *
     *
     * Default: None
     */
    public fun defaultInstanceWarmup(defaultInstanceWarmup: Number)

    /**
     * @param desiredCapacity The desired capacity is the initial capacity of the Auto Scaling group
     * at the time of its creation and the capacity it attempts to maintain.
     * It can scale beyond this capacity if you configure automatic scaling.
     *
     * The number must be greater than or equal to the minimum size of the group and less than or
     * equal to the maximum size of the group. If you do not specify a desired capacity when creating
     * the stack, the default is the minimum size of the group.
     *
     * CloudFormation marks the Auto Scaling group as successful (by setting its status to
     * CREATE_COMPLETE) when the desired capacity is reached. However, if a maximum Spot price is set
     * in the launch template or launch configuration that you specified, then desired capacity is not
     * used as a criteria for success. Whether your request is fulfilled depends on Spot Instance
     * capacity and your maximum price.
     */
    public fun desiredCapacity(desiredCapacity: String)

    /**
     * @param desiredCapacityType The unit of measurement for the value specified for desired
     * capacity.
     * Amazon EC2 Auto Scaling supports `DesiredCapacityType` for attribute-based instance type
     * selection only. For more information, see [Create a mixed instances group using attribute-based
     * instance type
     * selection](https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-mixed-instances-group-attribute-based-instance-type-selection.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * By default, Amazon EC2 Auto Scaling specifies `units` , which translates into number of
     * instances.
     *
     * Valid values: `units` | `vcpu` | `memory-mib`
     */
    public fun desiredCapacityType(desiredCapacityType: String)

    /**
     * @param healthCheckGracePeriod The amount of time, in seconds, that Amazon EC2 Auto Scaling
     * waits before checking the health status of an EC2 instance that has come into service and
     * marking it unhealthy due to a failed health check.
     * This is useful if your instances do not immediately pass their health checks after they enter
     * the `InService` state. For more information, see [Set the health check grace period for an Auto
     * Scaling
     * group](https://docs.aws.amazon.com/autoscaling/ec2/userguide/health-check-grace-period.html) in
     * the *Amazon EC2 Auto Scaling User Guide* .
     *
     * Default: `0` seconds
     */
    public fun healthCheckGracePeriod(healthCheckGracePeriod: Number)

    /**
     * @param healthCheckType A comma-separated value string of one or more health check types.
     * The valid values are `EC2` , `EBS` , `ELB` , and `VPC_LATTICE` . `EC2` is the default health
     * check and cannot be disabled. For more information, see [Health checks for instances in an Auto
     * Scaling
     * group](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-health-checks.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * Only specify `EC2` if you must clear a value that was previously set.
     */
    public fun healthCheckType(healthCheckType: String)

    /**
     * @param instanceId The ID of the instance used to base the launch configuration on.
     * For more information, see [Create an Auto Scaling group using an EC2
     * instance](https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-asg-from-instance.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * If you specify `LaunchTemplate` , `MixedInstancesPolicy` , or `LaunchConfigurationName` ,
     * don't specify `InstanceId` .
     */
    public fun instanceId(instanceId: String)

    /**
     * @param instanceMaintenancePolicy An instance maintenance policy.
     * For more information, see [Set instance maintenance
     * policy](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-instance-maintenance-policy.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     */
    public fun instanceMaintenancePolicy(instanceMaintenancePolicy: IResolvable)

    /**
     * @param instanceMaintenancePolicy An instance maintenance policy.
     * For more information, see [Set instance maintenance
     * policy](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-instance-maintenance-policy.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     */
    public
        fun instanceMaintenancePolicy(instanceMaintenancePolicy: CfnAutoScalingGroup.InstanceMaintenancePolicyProperty)

    /**
     * @param instanceMaintenancePolicy An instance maintenance policy.
     * For more information, see [Set instance maintenance
     * policy](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-instance-maintenance-policy.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6b0d48265785b3f0727705d28f832f9e192859ebc61568a5d298ddad632a70d8")
    public
        fun instanceMaintenancePolicy(instanceMaintenancePolicy: CfnAutoScalingGroup.InstanceMaintenancePolicyProperty.Builder.() -> Unit)

    /**
     * @param launchConfigurationName The name of the launch configuration to use to launch
     * instances.
     * Required only if you don't specify `LaunchTemplate` , `MixedInstancesPolicy` , or
     * `InstanceId` .
     */
    public fun launchConfigurationName(launchConfigurationName: String)

    /**
     * @param launchTemplate Information used to specify the launch template and version to use to
     * launch instances.
     * You can alternatively associate a launch template to the Auto Scaling group by specifying a
     * `MixedInstancesPolicy` . For more information about creating launch templates, see [Create a
     * launch template for an Auto Scaling
     * group](https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-launch-template.html) in the
     * *Amazon EC2 Auto Scaling User Guide* .
     *
     * If you omit this property, you must specify `MixedInstancesPolicy` ,
     * `LaunchConfigurationName` , or `InstanceId` .
     */
    public fun launchTemplate(launchTemplate: IResolvable)

    /**
     * @param launchTemplate Information used to specify the launch template and version to use to
     * launch instances.
     * You can alternatively associate a launch template to the Auto Scaling group by specifying a
     * `MixedInstancesPolicy` . For more information about creating launch templates, see [Create a
     * launch template for an Auto Scaling
     * group](https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-launch-template.html) in the
     * *Amazon EC2 Auto Scaling User Guide* .
     *
     * If you omit this property, you must specify `MixedInstancesPolicy` ,
     * `LaunchConfigurationName` , or `InstanceId` .
     */
    public
        fun launchTemplate(launchTemplate: CfnAutoScalingGroup.LaunchTemplateSpecificationProperty)

    /**
     * @param launchTemplate Information used to specify the launch template and version to use to
     * launch instances.
     * You can alternatively associate a launch template to the Auto Scaling group by specifying a
     * `MixedInstancesPolicy` . For more information about creating launch templates, see [Create a
     * launch template for an Auto Scaling
     * group](https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-launch-template.html) in the
     * *Amazon EC2 Auto Scaling User Guide* .
     *
     * If you omit this property, you must specify `MixedInstancesPolicy` ,
     * `LaunchConfigurationName` , or `InstanceId` .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5c0fe05a7920ecb5df98e791fda2b030651c2afa15bb42abd61e27dcefc4df1e")
    public
        fun launchTemplate(launchTemplate: CfnAutoScalingGroup.LaunchTemplateSpecificationProperty.Builder.() -> Unit)

    /**
     * @param lifecycleHookSpecificationList One or more lifecycle hooks to add to the Auto Scaling
     * group before instances are launched.
     */
    public fun lifecycleHookSpecificationList(lifecycleHookSpecificationList: IResolvable)

    /**
     * @param lifecycleHookSpecificationList One or more lifecycle hooks to add to the Auto Scaling
     * group before instances are launched.
     */
    public fun lifecycleHookSpecificationList(lifecycleHookSpecificationList: List<Any>)

    /**
     * @param lifecycleHookSpecificationList One or more lifecycle hooks to add to the Auto Scaling
     * group before instances are launched.
     */
    public fun lifecycleHookSpecificationList(vararg lifecycleHookSpecificationList: Any)

    /**
     * @param loadBalancerNames A list of Classic Load Balancers associated with this Auto Scaling
     * group.
     * For Application Load Balancers, Network Load Balancers, and Gateway Load Balancers, specify
     * the `TargetGroupARNs` property instead.
     */
    public fun loadBalancerNames(loadBalancerNames: List<String>)

    /**
     * @param loadBalancerNames A list of Classic Load Balancers associated with this Auto Scaling
     * group.
     * For Application Load Balancers, Network Load Balancers, and Gateway Load Balancers, specify
     * the `TargetGroupARNs` property instead.
     */
    public fun loadBalancerNames(vararg loadBalancerNames: String)

    /**
     * @param maxInstanceLifetime The maximum amount of time, in seconds, that an instance can be in
     * service.
     * The default is null. If specified, the value must be either 0 or a number equal to or greater
     * than 86,400 seconds (1 day). For more information, see [Replace Auto Scaling instances based on
     * maximum instance
     * lifetime](https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-max-instance-lifetime.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     */
    public fun maxInstanceLifetime(maxInstanceLifetime: Number)

    /**
     * @param maxSize The maximum size of the group. 
     *
     * With a mixed instances policy that uses instance weighting, Amazon EC2 Auto Scaling may need
     * to go above `MaxSize` to meet your capacity requirements. In this event, Amazon EC2 Auto Scaling
     * will never go above `MaxSize` by more than your largest instance weight (weights that define how
     * many units each instance contributes to the desired capacity of the group).
     */
    public fun maxSize(maxSize: String)

    /**
     * @param metricsCollection Enables the monitoring of group metrics of an Auto Scaling group.
     * By default, these metrics are disabled.
     */
    public fun metricsCollection(metricsCollection: IResolvable)

    /**
     * @param metricsCollection Enables the monitoring of group metrics of an Auto Scaling group.
     * By default, these metrics are disabled.
     */
    public fun metricsCollection(metricsCollection: List<Any>)

    /**
     * @param metricsCollection Enables the monitoring of group metrics of an Auto Scaling group.
     * By default, these metrics are disabled.
     */
    public fun metricsCollection(vararg metricsCollection: Any)

    /**
     * @param minSize The minimum size of the group. 
     */
    public fun minSize(minSize: String)

    /**
     * @param mixedInstancesPolicy An embedded object that specifies a mixed instances policy.
     * The policy includes properties that not only define the distribution of On-Demand Instances
     * and Spot Instances, the maximum price to pay for Spot Instances (optional), and how the Auto
     * Scaling group allocates instance types to fulfill On-Demand and Spot capacities, but also the
     * properties that specify the instance configuration information—the launch template and instance
     * types. The policy can also include a weight for each instance type and different launch
     * templates for individual instance types.
     *
     * For more information, see [Auto Scaling groups with multiple instance types and purchase
     * options](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-mixed-instances-groups.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     */
    public fun mixedInstancesPolicy(mixedInstancesPolicy: IResolvable)

    /**
     * @param mixedInstancesPolicy An embedded object that specifies a mixed instances policy.
     * The policy includes properties that not only define the distribution of On-Demand Instances
     * and Spot Instances, the maximum price to pay for Spot Instances (optional), and how the Auto
     * Scaling group allocates instance types to fulfill On-Demand and Spot capacities, but also the
     * properties that specify the instance configuration information—the launch template and instance
     * types. The policy can also include a weight for each instance type and different launch
     * templates for individual instance types.
     *
     * For more information, see [Auto Scaling groups with multiple instance types and purchase
     * options](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-mixed-instances-groups.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     */
    public
        fun mixedInstancesPolicy(mixedInstancesPolicy: CfnAutoScalingGroup.MixedInstancesPolicyProperty)

    /**
     * @param mixedInstancesPolicy An embedded object that specifies a mixed instances policy.
     * The policy includes properties that not only define the distribution of On-Demand Instances
     * and Spot Instances, the maximum price to pay for Spot Instances (optional), and how the Auto
     * Scaling group allocates instance types to fulfill On-Demand and Spot capacities, but also the
     * properties that specify the instance configuration information—the launch template and instance
     * types. The policy can also include a weight for each instance type and different launch
     * templates for individual instance types.
     *
     * For more information, see [Auto Scaling groups with multiple instance types and purchase
     * options](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-mixed-instances-groups.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("76dc5d4b65ef220ec9f2a3ee86f5befdae51fcc8337b79c0cb07eb2c3d831498")
    public
        fun mixedInstancesPolicy(mixedInstancesPolicy: CfnAutoScalingGroup.MixedInstancesPolicyProperty.Builder.() -> Unit)

    /**
     * @param newInstancesProtectedFromScaleIn Indicates whether newly launched instances are
     * protected from termination by Amazon EC2 Auto Scaling when scaling in.
     * For more information about preventing instances from terminating on scale in, see [Use
     * instance scale-in
     * protection](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-instance-protection.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     */
    public fun newInstancesProtectedFromScaleIn(newInstancesProtectedFromScaleIn: Boolean)

    /**
     * @param newInstancesProtectedFromScaleIn Indicates whether newly launched instances are
     * protected from termination by Amazon EC2 Auto Scaling when scaling in.
     * For more information about preventing instances from terminating on scale in, see [Use
     * instance scale-in
     * protection](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-instance-protection.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     */
    public fun newInstancesProtectedFromScaleIn(newInstancesProtectedFromScaleIn: IResolvable)

    /**
     * @param notificationConfiguration A structure that specifies an Amazon SNS notification
     * configuration for the `NotificationConfigurations` property of the
     * [AWS::AutoScaling::AutoScalingGroup](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html)
     * resource.  For an example template snippet, see [Configure Amazon EC2 Auto Scaling
     * resources](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/quickref-ec2-auto-scaling.html).
     *  For more information, see [Get Amazon SNS notifications when your Auto Scaling group
     * scales](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ASGettingNotifications.html) in
     * the *Amazon EC2 Auto Scaling User Guide*.
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    public fun notificationConfiguration(notificationConfiguration: IResolvable)

    /**
     * @param notificationConfiguration A structure that specifies an Amazon SNS notification
     * configuration for the `NotificationConfigurations` property of the
     * [AWS::AutoScaling::AutoScalingGroup](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html)
     * resource.  For an example template snippet, see [Configure Amazon EC2 Auto Scaling
     * resources](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/quickref-ec2-auto-scaling.html).
     *  For more information, see [Get Amazon SNS notifications when your Auto Scaling group
     * scales](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ASGettingNotifications.html) in
     * the *Amazon EC2 Auto Scaling User Guide*.
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    public
        fun notificationConfiguration(notificationConfiguration: CfnAutoScalingGroup.NotificationConfigurationProperty)

    /**
     * @param notificationConfiguration A structure that specifies an Amazon SNS notification
     * configuration for the `NotificationConfigurations` property of the
     * [AWS::AutoScaling::AutoScalingGroup](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html)
     * resource.  For an example template snippet, see [Configure Amazon EC2 Auto Scaling
     * resources](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/quickref-ec2-auto-scaling.html).
     *  For more information, see [Get Amazon SNS notifications when your Auto Scaling group
     * scales](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ASGettingNotifications.html) in
     * the *Amazon EC2 Auto Scaling User Guide*.
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3305a7c43182d0bd5a6ae4ae705e674d302f9313c1c27a174ac6a1c974061ea0")
    public
        fun notificationConfiguration(notificationConfiguration: CfnAutoScalingGroup.NotificationConfigurationProperty.Builder.() -> Unit)

    /**
     * @param notificationConfigurations Configures an Auto Scaling group to send notifications when
     * specified events take place.
     */
    public fun notificationConfigurations(notificationConfigurations: IResolvable)

    /**
     * @param notificationConfigurations Configures an Auto Scaling group to send notifications when
     * specified events take place.
     */
    public fun notificationConfigurations(notificationConfigurations: List<Any>)

    /**
     * @param notificationConfigurations Configures an Auto Scaling group to send notifications when
     * specified events take place.
     */
    public fun notificationConfigurations(vararg notificationConfigurations: Any)

    /**
     * @param placementGroup The name of the placement group into which to launch your instances.
     * For more information, see [Placement
     * groups](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html) in the
     * *Amazon EC2 User Guide* .
     *
     *
     * A *cluster* placement group is a logical grouping of instances within a single Availability
     * Zone. You cannot specify multiple Availability Zones and a cluster placement group.
     */
    public fun placementGroup(placementGroup: String)

    /**
     * @param serviceLinkedRoleArn The Amazon Resource Name (ARN) of the service-linked role that
     * the Auto Scaling group uses to call other AWS service on your behalf.
     * By default, Amazon EC2 Auto Scaling uses a service-linked role named
     * `AWSServiceRoleForAutoScaling` , which it creates if it does not exist. For more information,
     * see [Service-linked
     * roles](https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-service-linked-role.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     */
    public fun serviceLinkedRoleArn(serviceLinkedRoleArn: String)

    /**
     * @param skipZonalShiftValidation the value to be set.
     */
    public fun skipZonalShiftValidation(skipZonalShiftValidation: Boolean)

    /**
     * @param skipZonalShiftValidation the value to be set.
     */
    public fun skipZonalShiftValidation(skipZonalShiftValidation: IResolvable)

    /**
     * @param tags One or more tags.
     * You can tag your Auto Scaling group and propagate the tags to the Amazon EC2 instances it
     * launches. Tags are not propagated to Amazon EBS volumes. To add tags to Amazon EBS volumes,
     * specify the tags in a launch template but use caution. If the launch template specifies an
     * instance tag with a key that is also specified for the Auto Scaling group, Amazon EC2 Auto
     * Scaling overrides the value of that instance tag with the value specified by the Auto Scaling
     * group. For more information, see [Tag Auto Scaling groups and
     * instances](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-tagging.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     */
    public fun tags(tags: List<CfnAutoScalingGroup.TagPropertyProperty>)

    /**
     * @param tags One or more tags.
     * You can tag your Auto Scaling group and propagate the tags to the Amazon EC2 instances it
     * launches. Tags are not propagated to Amazon EBS volumes. To add tags to Amazon EBS volumes,
     * specify the tags in a launch template but use caution. If the launch template specifies an
     * instance tag with a key that is also specified for the Auto Scaling group, Amazon EC2 Auto
     * Scaling overrides the value of that instance tag with the value specified by the Auto Scaling
     * group. For more information, see [Tag Auto Scaling groups and
     * instances](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-tagging.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     */
    public fun tags(vararg tags: CfnAutoScalingGroup.TagPropertyProperty)

    /**
     * @param targetGroupArns The Amazon Resource Names (ARN) of the Elastic Load Balancing target
     * groups to associate with the Auto Scaling group.
     * Instances are registered as targets with the target groups. The target groups receive
     * incoming traffic and route requests to one or more registered targets. For more information, see
     * [Use Elastic Load Balancing to distribute traffic across the instances in your Auto Scaling
     * group](https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-load-balancer.html) in
     * the *Amazon EC2 Auto Scaling User Guide* .
     */
    public fun targetGroupArns(targetGroupArns: List<String>)

    /**
     * @param targetGroupArns The Amazon Resource Names (ARN) of the Elastic Load Balancing target
     * groups to associate with the Auto Scaling group.
     * Instances are registered as targets with the target groups. The target groups receive
     * incoming traffic and route requests to one or more registered targets. For more information, see
     * [Use Elastic Load Balancing to distribute traffic across the instances in your Auto Scaling
     * group](https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-load-balancer.html) in
     * the *Amazon EC2 Auto Scaling User Guide* .
     */
    public fun targetGroupArns(vararg targetGroupArns: String)

    /**
     * @param terminationPolicies A policy or a list of policies that are used to select the
     * instance to terminate.
     * These policies are executed in the order that you list them. For more information, see
     * [Configure termination policies for Amazon EC2 Auto
     * Scaling](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-termination-policies.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * Valid values: `Default` | `AllocationStrategy` | `ClosestToNextInstanceHour` |
     * `NewestInstance` | `OldestInstance` | `OldestLaunchConfiguration` | `OldestLaunchTemplate` |
     * `arn:aws:lambda:region:account-id:function:my-function:my-alias`
     */
    public fun terminationPolicies(terminationPolicies: List<String>)

    /**
     * @param terminationPolicies A policy or a list of policies that are used to select the
     * instance to terminate.
     * These policies are executed in the order that you list them. For more information, see
     * [Configure termination policies for Amazon EC2 Auto
     * Scaling](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-termination-policies.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * Valid values: `Default` | `AllocationStrategy` | `ClosestToNextInstanceHour` |
     * `NewestInstance` | `OldestInstance` | `OldestLaunchConfiguration` | `OldestLaunchTemplate` |
     * `arn:aws:lambda:region:account-id:function:my-function:my-alias`
     */
    public fun terminationPolicies(vararg terminationPolicies: String)

    /**
     * @param trafficSources The traffic sources associated with this Auto Scaling group.
     */
    public fun trafficSources(trafficSources: IResolvable)

    /**
     * @param trafficSources The traffic sources associated with this Auto Scaling group.
     */
    public fun trafficSources(trafficSources: List<Any>)

    /**
     * @param trafficSources The traffic sources associated with this Auto Scaling group.
     */
    public fun trafficSources(vararg trafficSources: Any)

    /**
     * @param vpcZoneIdentifier A list of subnet IDs for a virtual private cloud (VPC) where
     * instances in the Auto Scaling group can be created.
     * If this resource specifies public subnets and is also in a VPC that is defined in the same
     * stack template, you must use the [DependsOn
     * attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
     * to declare a dependency on the [VPC-gateway
     * attachment](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc-gateway-attachment.html)
     * .
     *
     *
     * When you update `VPCZoneIdentifier` , this retains the same Auto Scaling group and replaces
     * old instances with new ones, according to the specified subnets. You can optionally specify how
     * CloudFormation handles these updates by using an [UpdatePolicy
     * attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-updatepolicy.html)
     * .
     *
     *
     * Required to launch instances into a nondefault VPC. If you specify `VPCZoneIdentifier` with
     * `AvailabilityZones` , the subnets that you specify for this property must reside in those
     * Availability Zones.
     */
    public fun vpcZoneIdentifier(vpcZoneIdentifier: List<String>)

    /**
     * @param vpcZoneIdentifier A list of subnet IDs for a virtual private cloud (VPC) where
     * instances in the Auto Scaling group can be created.
     * If this resource specifies public subnets and is also in a VPC that is defined in the same
     * stack template, you must use the [DependsOn
     * attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
     * to declare a dependency on the [VPC-gateway
     * attachment](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc-gateway-attachment.html)
     * .
     *
     *
     * When you update `VPCZoneIdentifier` , this retains the same Auto Scaling group and replaces
     * old instances with new ones, according to the specified subnets. You can optionally specify how
     * CloudFormation handles these updates by using an [UpdatePolicy
     * attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-updatepolicy.html)
     * .
     *
     *
     * Required to launch instances into a nondefault VPC. If you specify `VPCZoneIdentifier` with
     * `AvailabilityZones` , the subnets that you specify for this property must reside in those
     * Availability Zones.
     */
    public fun vpcZoneIdentifier(vararg vpcZoneIdentifier: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroupProps.Builder =
        software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroupProps.builder()

    /**
     * @param autoScalingGroupName The name of the Auto Scaling group. This name must be unique per
     * Region per account.
     * The name can contain any ASCII character 33 to 126 including most punctuation characters,
     * digits, and upper and lowercased letters.
     *
     *
     * You cannot use a colon (:) in the name.
     */
    override fun autoScalingGroupName(autoScalingGroupName: String) {
      cdkBuilder.autoScalingGroupName(autoScalingGroupName)
    }

    /**
     * @param availabilityZoneDistribution The instance capacity distribution across Availability
     * Zones.
     */
    override fun availabilityZoneDistribution(availabilityZoneDistribution: IResolvable) {
      cdkBuilder.availabilityZoneDistribution(availabilityZoneDistribution.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param availabilityZoneDistribution The instance capacity distribution across Availability
     * Zones.
     */
    override
        fun availabilityZoneDistribution(availabilityZoneDistribution: CfnAutoScalingGroup.AvailabilityZoneDistributionProperty) {
      cdkBuilder.availabilityZoneDistribution(availabilityZoneDistribution.let(CfnAutoScalingGroup.AvailabilityZoneDistributionProperty.Companion::unwrap))
    }

    /**
     * @param availabilityZoneDistribution The instance capacity distribution across Availability
     * Zones.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("34b5ce7af48ba106a23c7b3b0ac8c04d7a0b296c3609389ddb0f7b5170c56eb3")
    override
        fun availabilityZoneDistribution(availabilityZoneDistribution: CfnAutoScalingGroup.AvailabilityZoneDistributionProperty.Builder.() -> Unit):
        Unit =
        availabilityZoneDistribution(CfnAutoScalingGroup.AvailabilityZoneDistributionProperty(availabilityZoneDistribution))

    /**
     * @param availabilityZoneImpairmentPolicy The Availability Zone impairment policy.
     */
    override fun availabilityZoneImpairmentPolicy(availabilityZoneImpairmentPolicy: IResolvable) {
      cdkBuilder.availabilityZoneImpairmentPolicy(availabilityZoneImpairmentPolicy.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param availabilityZoneImpairmentPolicy The Availability Zone impairment policy.
     */
    override
        fun availabilityZoneImpairmentPolicy(availabilityZoneImpairmentPolicy: CfnAutoScalingGroup.AvailabilityZoneImpairmentPolicyProperty) {
      cdkBuilder.availabilityZoneImpairmentPolicy(availabilityZoneImpairmentPolicy.let(CfnAutoScalingGroup.AvailabilityZoneImpairmentPolicyProperty.Companion::unwrap))
    }

    /**
     * @param availabilityZoneImpairmentPolicy The Availability Zone impairment policy.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("af487dac85c374c2336462cbb670f20023ec4187111bbc0e35789bac82463a1b")
    override
        fun availabilityZoneImpairmentPolicy(availabilityZoneImpairmentPolicy: CfnAutoScalingGroup.AvailabilityZoneImpairmentPolicyProperty.Builder.() -> Unit):
        Unit =
        availabilityZoneImpairmentPolicy(CfnAutoScalingGroup.AvailabilityZoneImpairmentPolicyProperty(availabilityZoneImpairmentPolicy))

    /**
     * @param availabilityZones A list of Availability Zones where instances in the Auto Scaling
     * group can be created.
     * Used for launching into the default VPC subnet in each Availability Zone when not using the
     * `VPCZoneIdentifier` property, or for attaching a network interface when an existing network
     * interface ID is specified in a launch template.
     */
    override fun availabilityZones(availabilityZones: List<String>) {
      cdkBuilder.availabilityZones(availabilityZones)
    }

    /**
     * @param availabilityZones A list of Availability Zones where instances in the Auto Scaling
     * group can be created.
     * Used for launching into the default VPC subnet in each Availability Zone when not using the
     * `VPCZoneIdentifier` property, or for attaching a network interface when an existing network
     * interface ID is specified in a launch template.
     */
    override fun availabilityZones(vararg availabilityZones: String): Unit =
        availabilityZones(availabilityZones.toList())

    /**
     * @param capacityRebalance Indicates whether Capacity Rebalancing is enabled.
     * Otherwise, Capacity Rebalancing is disabled. When you turn on Capacity Rebalancing, Amazon
     * EC2 Auto Scaling attempts to launch a Spot Instance whenever Amazon EC2 notifies that a Spot
     * Instance is at an elevated risk of interruption. After launching a new instance, it then
     * terminates an old instance. For more information, see [Use Capacity Rebalancing to handle Amazon
     * EC2 Spot
     * Interruptions](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-capacity-rebalancing.html)
     * in the in the *Amazon EC2 Auto Scaling User Guide* .
     */
    override fun capacityRebalance(capacityRebalance: Boolean) {
      cdkBuilder.capacityRebalance(capacityRebalance)
    }

    /**
     * @param capacityRebalance Indicates whether Capacity Rebalancing is enabled.
     * Otherwise, Capacity Rebalancing is disabled. When you turn on Capacity Rebalancing, Amazon
     * EC2 Auto Scaling attempts to launch a Spot Instance whenever Amazon EC2 notifies that a Spot
     * Instance is at an elevated risk of interruption. After launching a new instance, it then
     * terminates an old instance. For more information, see [Use Capacity Rebalancing to handle Amazon
     * EC2 Spot
     * Interruptions](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-capacity-rebalancing.html)
     * in the in the *Amazon EC2 Auto Scaling User Guide* .
     */
    override fun capacityRebalance(capacityRebalance: IResolvable) {
      cdkBuilder.capacityRebalance(capacityRebalance.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param capacityReservationSpecification The capacity reservation specification.
     */
    override fun capacityReservationSpecification(capacityReservationSpecification: IResolvable) {
      cdkBuilder.capacityReservationSpecification(capacityReservationSpecification.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param capacityReservationSpecification The capacity reservation specification.
     */
    override
        fun capacityReservationSpecification(capacityReservationSpecification: CfnAutoScalingGroup.CapacityReservationSpecificationProperty) {
      cdkBuilder.capacityReservationSpecification(capacityReservationSpecification.let(CfnAutoScalingGroup.CapacityReservationSpecificationProperty.Companion::unwrap))
    }

    /**
     * @param capacityReservationSpecification The capacity reservation specification.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("eb3a4310353c6bc2ec8cc0183f5ce46cbd05299a6b6a268a056f5b70b8b4d305")
    override
        fun capacityReservationSpecification(capacityReservationSpecification: CfnAutoScalingGroup.CapacityReservationSpecificationProperty.Builder.() -> Unit):
        Unit =
        capacityReservationSpecification(CfnAutoScalingGroup.CapacityReservationSpecificationProperty(capacityReservationSpecification))

    /**
     * @param context Reserved.
     */
    override fun context(context: String) {
      cdkBuilder.context(context)
    }

    /**
     * @param cooldown *Only needed if you use simple scaling policies.*.
     * The amount of time, in seconds, between one scaling activity ending and another one starting
     * due to simple scaling policies. For more information, see [Scaling cooldowns for Amazon EC2 Auto
     * Scaling](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-scaling-cooldowns.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * Default: `300` seconds
     */
    override fun cooldown(cooldown: String) {
      cdkBuilder.cooldown(cooldown)
    }

    /**
     * @param defaultInstanceWarmup The amount of time, in seconds, until a new instance is
     * considered to have finished initializing and resource consumption to become stable after it
     * enters the `InService` state.
     * During an instance refresh, Amazon EC2 Auto Scaling waits for the warm-up period after it
     * replaces an instance before it moves on to replacing the next instance. Amazon EC2 Auto Scaling
     * also waits for the warm-up period before aggregating the metrics for new instances with existing
     * instances in the Amazon CloudWatch metrics that are used for scaling, resulting in more reliable
     * usage data. For more information, see [Set the default instance warmup for an Auto Scaling
     * group](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-default-instance-warmup.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     *
     * To manage various warm-up settings at the group level, we recommend that you set the default
     * instance warmup, *even if it is set to 0 seconds* . To remove a value that you previously set,
     * include the property but specify `-1` for the value. However, we strongly recommend keeping the
     * default instance warmup enabled by specifying a value of `0` or other nominal value.
     *
     *
     * Default: None
     */
    override fun defaultInstanceWarmup(defaultInstanceWarmup: Number) {
      cdkBuilder.defaultInstanceWarmup(defaultInstanceWarmup)
    }

    /**
     * @param desiredCapacity The desired capacity is the initial capacity of the Auto Scaling group
     * at the time of its creation and the capacity it attempts to maintain.
     * It can scale beyond this capacity if you configure automatic scaling.
     *
     * The number must be greater than or equal to the minimum size of the group and less than or
     * equal to the maximum size of the group. If you do not specify a desired capacity when creating
     * the stack, the default is the minimum size of the group.
     *
     * CloudFormation marks the Auto Scaling group as successful (by setting its status to
     * CREATE_COMPLETE) when the desired capacity is reached. However, if a maximum Spot price is set
     * in the launch template or launch configuration that you specified, then desired capacity is not
     * used as a criteria for success. Whether your request is fulfilled depends on Spot Instance
     * capacity and your maximum price.
     */
    override fun desiredCapacity(desiredCapacity: String) {
      cdkBuilder.desiredCapacity(desiredCapacity)
    }

    /**
     * @param desiredCapacityType The unit of measurement for the value specified for desired
     * capacity.
     * Amazon EC2 Auto Scaling supports `DesiredCapacityType` for attribute-based instance type
     * selection only. For more information, see [Create a mixed instances group using attribute-based
     * instance type
     * selection](https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-mixed-instances-group-attribute-based-instance-type-selection.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * By default, Amazon EC2 Auto Scaling specifies `units` , which translates into number of
     * instances.
     *
     * Valid values: `units` | `vcpu` | `memory-mib`
     */
    override fun desiredCapacityType(desiredCapacityType: String) {
      cdkBuilder.desiredCapacityType(desiredCapacityType)
    }

    /**
     * @param healthCheckGracePeriod The amount of time, in seconds, that Amazon EC2 Auto Scaling
     * waits before checking the health status of an EC2 instance that has come into service and
     * marking it unhealthy due to a failed health check.
     * This is useful if your instances do not immediately pass their health checks after they enter
     * the `InService` state. For more information, see [Set the health check grace period for an Auto
     * Scaling
     * group](https://docs.aws.amazon.com/autoscaling/ec2/userguide/health-check-grace-period.html) in
     * the *Amazon EC2 Auto Scaling User Guide* .
     *
     * Default: `0` seconds
     */
    override fun healthCheckGracePeriod(healthCheckGracePeriod: Number) {
      cdkBuilder.healthCheckGracePeriod(healthCheckGracePeriod)
    }

    /**
     * @param healthCheckType A comma-separated value string of one or more health check types.
     * The valid values are `EC2` , `EBS` , `ELB` , and `VPC_LATTICE` . `EC2` is the default health
     * check and cannot be disabled. For more information, see [Health checks for instances in an Auto
     * Scaling
     * group](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-health-checks.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * Only specify `EC2` if you must clear a value that was previously set.
     */
    override fun healthCheckType(healthCheckType: String) {
      cdkBuilder.healthCheckType(healthCheckType)
    }

    /**
     * @param instanceId The ID of the instance used to base the launch configuration on.
     * For more information, see [Create an Auto Scaling group using an EC2
     * instance](https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-asg-from-instance.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * If you specify `LaunchTemplate` , `MixedInstancesPolicy` , or `LaunchConfigurationName` ,
     * don't specify `InstanceId` .
     */
    override fun instanceId(instanceId: String) {
      cdkBuilder.instanceId(instanceId)
    }

    /**
     * @param instanceMaintenancePolicy An instance maintenance policy.
     * For more information, see [Set instance maintenance
     * policy](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-instance-maintenance-policy.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     */
    override fun instanceMaintenancePolicy(instanceMaintenancePolicy: IResolvable) {
      cdkBuilder.instanceMaintenancePolicy(instanceMaintenancePolicy.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param instanceMaintenancePolicy An instance maintenance policy.
     * For more information, see [Set instance maintenance
     * policy](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-instance-maintenance-policy.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     */
    override
        fun instanceMaintenancePolicy(instanceMaintenancePolicy: CfnAutoScalingGroup.InstanceMaintenancePolicyProperty) {
      cdkBuilder.instanceMaintenancePolicy(instanceMaintenancePolicy.let(CfnAutoScalingGroup.InstanceMaintenancePolicyProperty.Companion::unwrap))
    }

    /**
     * @param instanceMaintenancePolicy An instance maintenance policy.
     * For more information, see [Set instance maintenance
     * policy](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-instance-maintenance-policy.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6b0d48265785b3f0727705d28f832f9e192859ebc61568a5d298ddad632a70d8")
    override
        fun instanceMaintenancePolicy(instanceMaintenancePolicy: CfnAutoScalingGroup.InstanceMaintenancePolicyProperty.Builder.() -> Unit):
        Unit =
        instanceMaintenancePolicy(CfnAutoScalingGroup.InstanceMaintenancePolicyProperty(instanceMaintenancePolicy))

    /**
     * @param launchConfigurationName The name of the launch configuration to use to launch
     * instances.
     * Required only if you don't specify `LaunchTemplate` , `MixedInstancesPolicy` , or
     * `InstanceId` .
     */
    override fun launchConfigurationName(launchConfigurationName: String) {
      cdkBuilder.launchConfigurationName(launchConfigurationName)
    }

    /**
     * @param launchTemplate Information used to specify the launch template and version to use to
     * launch instances.
     * You can alternatively associate a launch template to the Auto Scaling group by specifying a
     * `MixedInstancesPolicy` . For more information about creating launch templates, see [Create a
     * launch template for an Auto Scaling
     * group](https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-launch-template.html) in the
     * *Amazon EC2 Auto Scaling User Guide* .
     *
     * If you omit this property, you must specify `MixedInstancesPolicy` ,
     * `LaunchConfigurationName` , or `InstanceId` .
     */
    override fun launchTemplate(launchTemplate: IResolvable) {
      cdkBuilder.launchTemplate(launchTemplate.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param launchTemplate Information used to specify the launch template and version to use to
     * launch instances.
     * You can alternatively associate a launch template to the Auto Scaling group by specifying a
     * `MixedInstancesPolicy` . For more information about creating launch templates, see [Create a
     * launch template for an Auto Scaling
     * group](https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-launch-template.html) in the
     * *Amazon EC2 Auto Scaling User Guide* .
     *
     * If you omit this property, you must specify `MixedInstancesPolicy` ,
     * `LaunchConfigurationName` , or `InstanceId` .
     */
    override
        fun launchTemplate(launchTemplate: CfnAutoScalingGroup.LaunchTemplateSpecificationProperty) {
      cdkBuilder.launchTemplate(launchTemplate.let(CfnAutoScalingGroup.LaunchTemplateSpecificationProperty.Companion::unwrap))
    }

    /**
     * @param launchTemplate Information used to specify the launch template and version to use to
     * launch instances.
     * You can alternatively associate a launch template to the Auto Scaling group by specifying a
     * `MixedInstancesPolicy` . For more information about creating launch templates, see [Create a
     * launch template for an Auto Scaling
     * group](https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-launch-template.html) in the
     * *Amazon EC2 Auto Scaling User Guide* .
     *
     * If you omit this property, you must specify `MixedInstancesPolicy` ,
     * `LaunchConfigurationName` , or `InstanceId` .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5c0fe05a7920ecb5df98e791fda2b030651c2afa15bb42abd61e27dcefc4df1e")
    override
        fun launchTemplate(launchTemplate: CfnAutoScalingGroup.LaunchTemplateSpecificationProperty.Builder.() -> Unit):
        Unit =
        launchTemplate(CfnAutoScalingGroup.LaunchTemplateSpecificationProperty(launchTemplate))

    /**
     * @param lifecycleHookSpecificationList One or more lifecycle hooks to add to the Auto Scaling
     * group before instances are launched.
     */
    override fun lifecycleHookSpecificationList(lifecycleHookSpecificationList: IResolvable) {
      cdkBuilder.lifecycleHookSpecificationList(lifecycleHookSpecificationList.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param lifecycleHookSpecificationList One or more lifecycle hooks to add to the Auto Scaling
     * group before instances are launched.
     */
    override fun lifecycleHookSpecificationList(lifecycleHookSpecificationList: List<Any>) {
      cdkBuilder.lifecycleHookSpecificationList(lifecycleHookSpecificationList.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param lifecycleHookSpecificationList One or more lifecycle hooks to add to the Auto Scaling
     * group before instances are launched.
     */
    override fun lifecycleHookSpecificationList(vararg lifecycleHookSpecificationList: Any): Unit =
        lifecycleHookSpecificationList(lifecycleHookSpecificationList.toList())

    /**
     * @param loadBalancerNames A list of Classic Load Balancers associated with this Auto Scaling
     * group.
     * For Application Load Balancers, Network Load Balancers, and Gateway Load Balancers, specify
     * the `TargetGroupARNs` property instead.
     */
    override fun loadBalancerNames(loadBalancerNames: List<String>) {
      cdkBuilder.loadBalancerNames(loadBalancerNames)
    }

    /**
     * @param loadBalancerNames A list of Classic Load Balancers associated with this Auto Scaling
     * group.
     * For Application Load Balancers, Network Load Balancers, and Gateway Load Balancers, specify
     * the `TargetGroupARNs` property instead.
     */
    override fun loadBalancerNames(vararg loadBalancerNames: String): Unit =
        loadBalancerNames(loadBalancerNames.toList())

    /**
     * @param maxInstanceLifetime The maximum amount of time, in seconds, that an instance can be in
     * service.
     * The default is null. If specified, the value must be either 0 or a number equal to or greater
     * than 86,400 seconds (1 day). For more information, see [Replace Auto Scaling instances based on
     * maximum instance
     * lifetime](https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-max-instance-lifetime.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     */
    override fun maxInstanceLifetime(maxInstanceLifetime: Number) {
      cdkBuilder.maxInstanceLifetime(maxInstanceLifetime)
    }

    /**
     * @param maxSize The maximum size of the group. 
     *
     * With a mixed instances policy that uses instance weighting, Amazon EC2 Auto Scaling may need
     * to go above `MaxSize` to meet your capacity requirements. In this event, Amazon EC2 Auto Scaling
     * will never go above `MaxSize` by more than your largest instance weight (weights that define how
     * many units each instance contributes to the desired capacity of the group).
     */
    override fun maxSize(maxSize: String) {
      cdkBuilder.maxSize(maxSize)
    }

    /**
     * @param metricsCollection Enables the monitoring of group metrics of an Auto Scaling group.
     * By default, these metrics are disabled.
     */
    override fun metricsCollection(metricsCollection: IResolvable) {
      cdkBuilder.metricsCollection(metricsCollection.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param metricsCollection Enables the monitoring of group metrics of an Auto Scaling group.
     * By default, these metrics are disabled.
     */
    override fun metricsCollection(metricsCollection: List<Any>) {
      cdkBuilder.metricsCollection(metricsCollection.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param metricsCollection Enables the monitoring of group metrics of an Auto Scaling group.
     * By default, these metrics are disabled.
     */
    override fun metricsCollection(vararg metricsCollection: Any): Unit =
        metricsCollection(metricsCollection.toList())

    /**
     * @param minSize The minimum size of the group. 
     */
    override fun minSize(minSize: String) {
      cdkBuilder.minSize(minSize)
    }

    /**
     * @param mixedInstancesPolicy An embedded object that specifies a mixed instances policy.
     * The policy includes properties that not only define the distribution of On-Demand Instances
     * and Spot Instances, the maximum price to pay for Spot Instances (optional), and how the Auto
     * Scaling group allocates instance types to fulfill On-Demand and Spot capacities, but also the
     * properties that specify the instance configuration information—the launch template and instance
     * types. The policy can also include a weight for each instance type and different launch
     * templates for individual instance types.
     *
     * For more information, see [Auto Scaling groups with multiple instance types and purchase
     * options](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-mixed-instances-groups.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     */
    override fun mixedInstancesPolicy(mixedInstancesPolicy: IResolvable) {
      cdkBuilder.mixedInstancesPolicy(mixedInstancesPolicy.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param mixedInstancesPolicy An embedded object that specifies a mixed instances policy.
     * The policy includes properties that not only define the distribution of On-Demand Instances
     * and Spot Instances, the maximum price to pay for Spot Instances (optional), and how the Auto
     * Scaling group allocates instance types to fulfill On-Demand and Spot capacities, but also the
     * properties that specify the instance configuration information—the launch template and instance
     * types. The policy can also include a weight for each instance type and different launch
     * templates for individual instance types.
     *
     * For more information, see [Auto Scaling groups with multiple instance types and purchase
     * options](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-mixed-instances-groups.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     */
    override
        fun mixedInstancesPolicy(mixedInstancesPolicy: CfnAutoScalingGroup.MixedInstancesPolicyProperty) {
      cdkBuilder.mixedInstancesPolicy(mixedInstancesPolicy.let(CfnAutoScalingGroup.MixedInstancesPolicyProperty.Companion::unwrap))
    }

    /**
     * @param mixedInstancesPolicy An embedded object that specifies a mixed instances policy.
     * The policy includes properties that not only define the distribution of On-Demand Instances
     * and Spot Instances, the maximum price to pay for Spot Instances (optional), and how the Auto
     * Scaling group allocates instance types to fulfill On-Demand and Spot capacities, but also the
     * properties that specify the instance configuration information—the launch template and instance
     * types. The policy can also include a weight for each instance type and different launch
     * templates for individual instance types.
     *
     * For more information, see [Auto Scaling groups with multiple instance types and purchase
     * options](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-mixed-instances-groups.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("76dc5d4b65ef220ec9f2a3ee86f5befdae51fcc8337b79c0cb07eb2c3d831498")
    override
        fun mixedInstancesPolicy(mixedInstancesPolicy: CfnAutoScalingGroup.MixedInstancesPolicyProperty.Builder.() -> Unit):
        Unit =
        mixedInstancesPolicy(CfnAutoScalingGroup.MixedInstancesPolicyProperty(mixedInstancesPolicy))

    /**
     * @param newInstancesProtectedFromScaleIn Indicates whether newly launched instances are
     * protected from termination by Amazon EC2 Auto Scaling when scaling in.
     * For more information about preventing instances from terminating on scale in, see [Use
     * instance scale-in
     * protection](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-instance-protection.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     */
    override fun newInstancesProtectedFromScaleIn(newInstancesProtectedFromScaleIn: Boolean) {
      cdkBuilder.newInstancesProtectedFromScaleIn(newInstancesProtectedFromScaleIn)
    }

    /**
     * @param newInstancesProtectedFromScaleIn Indicates whether newly launched instances are
     * protected from termination by Amazon EC2 Auto Scaling when scaling in.
     * For more information about preventing instances from terminating on scale in, see [Use
     * instance scale-in
     * protection](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-instance-protection.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     */
    override fun newInstancesProtectedFromScaleIn(newInstancesProtectedFromScaleIn: IResolvable) {
      cdkBuilder.newInstancesProtectedFromScaleIn(newInstancesProtectedFromScaleIn.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param notificationConfiguration A structure that specifies an Amazon SNS notification
     * configuration for the `NotificationConfigurations` property of the
     * [AWS::AutoScaling::AutoScalingGroup](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html)
     * resource.  For an example template snippet, see [Configure Amazon EC2 Auto Scaling
     * resources](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/quickref-ec2-auto-scaling.html).
     *  For more information, see [Get Amazon SNS notifications when your Auto Scaling group
     * scales](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ASGettingNotifications.html) in
     * the *Amazon EC2 Auto Scaling User Guide*.
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    override fun notificationConfiguration(notificationConfiguration: IResolvable) {
      cdkBuilder.notificationConfiguration(notificationConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param notificationConfiguration A structure that specifies an Amazon SNS notification
     * configuration for the `NotificationConfigurations` property of the
     * [AWS::AutoScaling::AutoScalingGroup](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html)
     * resource.  For an example template snippet, see [Configure Amazon EC2 Auto Scaling
     * resources](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/quickref-ec2-auto-scaling.html).
     *  For more information, see [Get Amazon SNS notifications when your Auto Scaling group
     * scales](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ASGettingNotifications.html) in
     * the *Amazon EC2 Auto Scaling User Guide*.
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    override
        fun notificationConfiguration(notificationConfiguration: CfnAutoScalingGroup.NotificationConfigurationProperty) {
      cdkBuilder.notificationConfiguration(notificationConfiguration.let(CfnAutoScalingGroup.NotificationConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param notificationConfiguration A structure that specifies an Amazon SNS notification
     * configuration for the `NotificationConfigurations` property of the
     * [AWS::AutoScaling::AutoScalingGroup](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html)
     * resource.  For an example template snippet, see [Configure Amazon EC2 Auto Scaling
     * resources](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/quickref-ec2-auto-scaling.html).
     *  For more information, see [Get Amazon SNS notifications when your Auto Scaling group
     * scales](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ASGettingNotifications.html) in
     * the *Amazon EC2 Auto Scaling User Guide*.
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3305a7c43182d0bd5a6ae4ae705e674d302f9313c1c27a174ac6a1c974061ea0")
    override
        fun notificationConfiguration(notificationConfiguration: CfnAutoScalingGroup.NotificationConfigurationProperty.Builder.() -> Unit):
        Unit =
        notificationConfiguration(CfnAutoScalingGroup.NotificationConfigurationProperty(notificationConfiguration))

    /**
     * @param notificationConfigurations Configures an Auto Scaling group to send notifications when
     * specified events take place.
     */
    override fun notificationConfigurations(notificationConfigurations: IResolvable) {
      cdkBuilder.notificationConfigurations(notificationConfigurations.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param notificationConfigurations Configures an Auto Scaling group to send notifications when
     * specified events take place.
     */
    override fun notificationConfigurations(notificationConfigurations: List<Any>) {
      cdkBuilder.notificationConfigurations(notificationConfigurations.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param notificationConfigurations Configures an Auto Scaling group to send notifications when
     * specified events take place.
     */
    override fun notificationConfigurations(vararg notificationConfigurations: Any): Unit =
        notificationConfigurations(notificationConfigurations.toList())

    /**
     * @param placementGroup The name of the placement group into which to launch your instances.
     * For more information, see [Placement
     * groups](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html) in the
     * *Amazon EC2 User Guide* .
     *
     *
     * A *cluster* placement group is a logical grouping of instances within a single Availability
     * Zone. You cannot specify multiple Availability Zones and a cluster placement group.
     */
    override fun placementGroup(placementGroup: String) {
      cdkBuilder.placementGroup(placementGroup)
    }

    /**
     * @param serviceLinkedRoleArn The Amazon Resource Name (ARN) of the service-linked role that
     * the Auto Scaling group uses to call other AWS service on your behalf.
     * By default, Amazon EC2 Auto Scaling uses a service-linked role named
     * `AWSServiceRoleForAutoScaling` , which it creates if it does not exist. For more information,
     * see [Service-linked
     * roles](https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-service-linked-role.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     */
    override fun serviceLinkedRoleArn(serviceLinkedRoleArn: String) {
      cdkBuilder.serviceLinkedRoleArn(serviceLinkedRoleArn)
    }

    /**
     * @param skipZonalShiftValidation the value to be set.
     */
    override fun skipZonalShiftValidation(skipZonalShiftValidation: Boolean) {
      cdkBuilder.skipZonalShiftValidation(skipZonalShiftValidation)
    }

    /**
     * @param skipZonalShiftValidation the value to be set.
     */
    override fun skipZonalShiftValidation(skipZonalShiftValidation: IResolvable) {
      cdkBuilder.skipZonalShiftValidation(skipZonalShiftValidation.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param tags One or more tags.
     * You can tag your Auto Scaling group and propagate the tags to the Amazon EC2 instances it
     * launches. Tags are not propagated to Amazon EBS volumes. To add tags to Amazon EBS volumes,
     * specify the tags in a launch template but use caution. If the launch template specifies an
     * instance tag with a key that is also specified for the Auto Scaling group, Amazon EC2 Auto
     * Scaling overrides the value of that instance tag with the value specified by the Auto Scaling
     * group. For more information, see [Tag Auto Scaling groups and
     * instances](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-tagging.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     */
    override fun tags(tags: List<CfnAutoScalingGroup.TagPropertyProperty>) {
      cdkBuilder.tags(tags.map(CfnAutoScalingGroup.TagPropertyProperty.Companion::unwrap))
    }

    /**
     * @param tags One or more tags.
     * You can tag your Auto Scaling group and propagate the tags to the Amazon EC2 instances it
     * launches. Tags are not propagated to Amazon EBS volumes. To add tags to Amazon EBS volumes,
     * specify the tags in a launch template but use caution. If the launch template specifies an
     * instance tag with a key that is also specified for the Auto Scaling group, Amazon EC2 Auto
     * Scaling overrides the value of that instance tag with the value specified by the Auto Scaling
     * group. For more information, see [Tag Auto Scaling groups and
     * instances](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-tagging.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     */
    override fun tags(vararg tags: CfnAutoScalingGroup.TagPropertyProperty): Unit =
        tags(tags.toList())

    /**
     * @param targetGroupArns The Amazon Resource Names (ARN) of the Elastic Load Balancing target
     * groups to associate with the Auto Scaling group.
     * Instances are registered as targets with the target groups. The target groups receive
     * incoming traffic and route requests to one or more registered targets. For more information, see
     * [Use Elastic Load Balancing to distribute traffic across the instances in your Auto Scaling
     * group](https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-load-balancer.html) in
     * the *Amazon EC2 Auto Scaling User Guide* .
     */
    override fun targetGroupArns(targetGroupArns: List<String>) {
      cdkBuilder.targetGroupArns(targetGroupArns)
    }

    /**
     * @param targetGroupArns The Amazon Resource Names (ARN) of the Elastic Load Balancing target
     * groups to associate with the Auto Scaling group.
     * Instances are registered as targets with the target groups. The target groups receive
     * incoming traffic and route requests to one or more registered targets. For more information, see
     * [Use Elastic Load Balancing to distribute traffic across the instances in your Auto Scaling
     * group](https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-load-balancer.html) in
     * the *Amazon EC2 Auto Scaling User Guide* .
     */
    override fun targetGroupArns(vararg targetGroupArns: String): Unit =
        targetGroupArns(targetGroupArns.toList())

    /**
     * @param terminationPolicies A policy or a list of policies that are used to select the
     * instance to terminate.
     * These policies are executed in the order that you list them. For more information, see
     * [Configure termination policies for Amazon EC2 Auto
     * Scaling](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-termination-policies.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * Valid values: `Default` | `AllocationStrategy` | `ClosestToNextInstanceHour` |
     * `NewestInstance` | `OldestInstance` | `OldestLaunchConfiguration` | `OldestLaunchTemplate` |
     * `arn:aws:lambda:region:account-id:function:my-function:my-alias`
     */
    override fun terminationPolicies(terminationPolicies: List<String>) {
      cdkBuilder.terminationPolicies(terminationPolicies)
    }

    /**
     * @param terminationPolicies A policy or a list of policies that are used to select the
     * instance to terminate.
     * These policies are executed in the order that you list them. For more information, see
     * [Configure termination policies for Amazon EC2 Auto
     * Scaling](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-termination-policies.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * Valid values: `Default` | `AllocationStrategy` | `ClosestToNextInstanceHour` |
     * `NewestInstance` | `OldestInstance` | `OldestLaunchConfiguration` | `OldestLaunchTemplate` |
     * `arn:aws:lambda:region:account-id:function:my-function:my-alias`
     */
    override fun terminationPolicies(vararg terminationPolicies: String): Unit =
        terminationPolicies(terminationPolicies.toList())

    /**
     * @param trafficSources The traffic sources associated with this Auto Scaling group.
     */
    override fun trafficSources(trafficSources: IResolvable) {
      cdkBuilder.trafficSources(trafficSources.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param trafficSources The traffic sources associated with this Auto Scaling group.
     */
    override fun trafficSources(trafficSources: List<Any>) {
      cdkBuilder.trafficSources(trafficSources.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param trafficSources The traffic sources associated with this Auto Scaling group.
     */
    override fun trafficSources(vararg trafficSources: Any): Unit =
        trafficSources(trafficSources.toList())

    /**
     * @param vpcZoneIdentifier A list of subnet IDs for a virtual private cloud (VPC) where
     * instances in the Auto Scaling group can be created.
     * If this resource specifies public subnets and is also in a VPC that is defined in the same
     * stack template, you must use the [DependsOn
     * attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
     * to declare a dependency on the [VPC-gateway
     * attachment](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc-gateway-attachment.html)
     * .
     *
     *
     * When you update `VPCZoneIdentifier` , this retains the same Auto Scaling group and replaces
     * old instances with new ones, according to the specified subnets. You can optionally specify how
     * CloudFormation handles these updates by using an [UpdatePolicy
     * attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-updatepolicy.html)
     * .
     *
     *
     * Required to launch instances into a nondefault VPC. If you specify `VPCZoneIdentifier` with
     * `AvailabilityZones` , the subnets that you specify for this property must reside in those
     * Availability Zones.
     */
    override fun vpcZoneIdentifier(vpcZoneIdentifier: List<String>) {
      cdkBuilder.vpcZoneIdentifier(vpcZoneIdentifier)
    }

    /**
     * @param vpcZoneIdentifier A list of subnet IDs for a virtual private cloud (VPC) where
     * instances in the Auto Scaling group can be created.
     * If this resource specifies public subnets and is also in a VPC that is defined in the same
     * stack template, you must use the [DependsOn
     * attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
     * to declare a dependency on the [VPC-gateway
     * attachment](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc-gateway-attachment.html)
     * .
     *
     *
     * When you update `VPCZoneIdentifier` , this retains the same Auto Scaling group and replaces
     * old instances with new ones, according to the specified subnets. You can optionally specify how
     * CloudFormation handles these updates by using an [UpdatePolicy
     * attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-updatepolicy.html)
     * .
     *
     *
     * Required to launch instances into a nondefault VPC. If you specify `VPCZoneIdentifier` with
     * `AvailabilityZones` , the subnets that you specify for this property must reside in those
     * Availability Zones.
     */
    override fun vpcZoneIdentifier(vararg vpcZoneIdentifier: String): Unit =
        vpcZoneIdentifier(vpcZoneIdentifier.toList())

    public fun build(): software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroupProps,
  ) : CdkObject(cdkObject),
      CfnAutoScalingGroupProps {
    /**
     * The name of the Auto Scaling group. This name must be unique per Region per account.
     *
     * The name can contain any ASCII character 33 to 126 including most punctuation characters,
     * digits, and upper and lowercased letters.
     *
     *
     * You cannot use a colon (:) in the name.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-autoscalinggroupname)
     */
    override fun autoScalingGroupName(): String? = unwrap(this).getAutoScalingGroupName()

    /**
     * The instance capacity distribution across Availability Zones.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-availabilityzonedistribution)
     */
    override fun availabilityZoneDistribution(): Any? =
        unwrap(this).getAvailabilityZoneDistribution()

    /**
     * The Availability Zone impairment policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-availabilityzoneimpairmentpolicy)
     */
    override fun availabilityZoneImpairmentPolicy(): Any? =
        unwrap(this).getAvailabilityZoneImpairmentPolicy()

    /**
     * A list of Availability Zones where instances in the Auto Scaling group can be created.
     *
     * Used for launching into the default VPC subnet in each Availability Zone when not using the
     * `VPCZoneIdentifier` property, or for attaching a network interface when an existing network
     * interface ID is specified in a launch template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-availabilityzones)
     */
    override fun availabilityZones(): List<String> = unwrap(this).getAvailabilityZones() ?:
        emptyList()

    /**
     * Indicates whether Capacity Rebalancing is enabled.
     *
     * Otherwise, Capacity Rebalancing is disabled. When you turn on Capacity Rebalancing, Amazon
     * EC2 Auto Scaling attempts to launch a Spot Instance whenever Amazon EC2 notifies that a Spot
     * Instance is at an elevated risk of interruption. After launching a new instance, it then
     * terminates an old instance. For more information, see [Use Capacity Rebalancing to handle Amazon
     * EC2 Spot
     * Interruptions](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-capacity-rebalancing.html)
     * in the in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-capacityrebalance)
     */
    override fun capacityRebalance(): Any? = unwrap(this).getCapacityRebalance()

    /**
     * The capacity reservation specification.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-capacityreservationspecification)
     */
    override fun capacityReservationSpecification(): Any? =
        unwrap(this).getCapacityReservationSpecification()

    /**
     * Reserved.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-context)
     */
    override fun context(): String? = unwrap(this).getContext()

    /**
     * *Only needed if you use simple scaling policies.*.
     *
     * The amount of time, in seconds, between one scaling activity ending and another one starting
     * due to simple scaling policies. For more information, see [Scaling cooldowns for Amazon EC2 Auto
     * Scaling](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-scaling-cooldowns.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * Default: `300` seconds
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-cooldown)
     */
    override fun cooldown(): String? = unwrap(this).getCooldown()

    /**
     * The amount of time, in seconds, until a new instance is considered to have finished
     * initializing and resource consumption to become stable after it enters the `InService` state.
     *
     * During an instance refresh, Amazon EC2 Auto Scaling waits for the warm-up period after it
     * replaces an instance before it moves on to replacing the next instance. Amazon EC2 Auto Scaling
     * also waits for the warm-up period before aggregating the metrics for new instances with existing
     * instances in the Amazon CloudWatch metrics that are used for scaling, resulting in more reliable
     * usage data. For more information, see [Set the default instance warmup for an Auto Scaling
     * group](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-default-instance-warmup.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     *
     * To manage various warm-up settings at the group level, we recommend that you set the default
     * instance warmup, *even if it is set to 0 seconds* . To remove a value that you previously set,
     * include the property but specify `-1` for the value. However, we strongly recommend keeping the
     * default instance warmup enabled by specifying a value of `0` or other nominal value.
     *
     *
     * Default: None
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-defaultinstancewarmup)
     */
    override fun defaultInstanceWarmup(): Number? = unwrap(this).getDefaultInstanceWarmup()

    /**
     * The desired capacity is the initial capacity of the Auto Scaling group at the time of its
     * creation and the capacity it attempts to maintain.
     *
     * It can scale beyond this capacity if you configure automatic scaling.
     *
     * The number must be greater than or equal to the minimum size of the group and less than or
     * equal to the maximum size of the group. If you do not specify a desired capacity when creating
     * the stack, the default is the minimum size of the group.
     *
     * CloudFormation marks the Auto Scaling group as successful (by setting its status to
     * CREATE_COMPLETE) when the desired capacity is reached. However, if a maximum Spot price is set
     * in the launch template or launch configuration that you specified, then desired capacity is not
     * used as a criteria for success. Whether your request is fulfilled depends on Spot Instance
     * capacity and your maximum price.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-desiredcapacity)
     */
    override fun desiredCapacity(): String? = unwrap(this).getDesiredCapacity()

    /**
     * The unit of measurement for the value specified for desired capacity.
     *
     * Amazon EC2 Auto Scaling supports `DesiredCapacityType` for attribute-based instance type
     * selection only. For more information, see [Create a mixed instances group using attribute-based
     * instance type
     * selection](https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-mixed-instances-group-attribute-based-instance-type-selection.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * By default, Amazon EC2 Auto Scaling specifies `units` , which translates into number of
     * instances.
     *
     * Valid values: `units` | `vcpu` | `memory-mib`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-desiredcapacitytype)
     */
    override fun desiredCapacityType(): String? = unwrap(this).getDesiredCapacityType()

    /**
     * The amount of time, in seconds, that Amazon EC2 Auto Scaling waits before checking the health
     * status of an EC2 instance that has come into service and marking it unhealthy due to a failed
     * health check.
     *
     * This is useful if your instances do not immediately pass their health checks after they enter
     * the `InService` state. For more information, see [Set the health check grace period for an Auto
     * Scaling
     * group](https://docs.aws.amazon.com/autoscaling/ec2/userguide/health-check-grace-period.html) in
     * the *Amazon EC2 Auto Scaling User Guide* .
     *
     * Default: `0` seconds
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-healthcheckgraceperiod)
     */
    override fun healthCheckGracePeriod(): Number? = unwrap(this).getHealthCheckGracePeriod()

    /**
     * A comma-separated value string of one or more health check types.
     *
     * The valid values are `EC2` , `EBS` , `ELB` , and `VPC_LATTICE` . `EC2` is the default health
     * check and cannot be disabled. For more information, see [Health checks for instances in an Auto
     * Scaling
     * group](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-health-checks.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * Only specify `EC2` if you must clear a value that was previously set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-healthchecktype)
     */
    override fun healthCheckType(): String? = unwrap(this).getHealthCheckType()

    /**
     * The ID of the instance used to base the launch configuration on.
     *
     * For more information, see [Create an Auto Scaling group using an EC2
     * instance](https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-asg-from-instance.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * If you specify `LaunchTemplate` , `MixedInstancesPolicy` , or `LaunchConfigurationName` ,
     * don't specify `InstanceId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-instanceid)
     */
    override fun instanceId(): String? = unwrap(this).getInstanceId()

    /**
     * An instance maintenance policy.
     *
     * For more information, see [Set instance maintenance
     * policy](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-instance-maintenance-policy.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-instancemaintenancepolicy)
     */
    override fun instanceMaintenancePolicy(): Any? = unwrap(this).getInstanceMaintenancePolicy()

    /**
     * The name of the launch configuration to use to launch instances.
     *
     * Required only if you don't specify `LaunchTemplate` , `MixedInstancesPolicy` , or
     * `InstanceId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-launchconfigurationname)
     */
    override fun launchConfigurationName(): String? = unwrap(this).getLaunchConfigurationName()

    /**
     * Information used to specify the launch template and version to use to launch instances.
     *
     * You can alternatively associate a launch template to the Auto Scaling group by specifying a
     * `MixedInstancesPolicy` . For more information about creating launch templates, see [Create a
     * launch template for an Auto Scaling
     * group](https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-launch-template.html) in the
     * *Amazon EC2 Auto Scaling User Guide* .
     *
     * If you omit this property, you must specify `MixedInstancesPolicy` ,
     * `LaunchConfigurationName` , or `InstanceId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-launchtemplate)
     */
    override fun launchTemplate(): Any? = unwrap(this).getLaunchTemplate()

    /**
     * One or more lifecycle hooks to add to the Auto Scaling group before instances are launched.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecificationlist)
     */
    override fun lifecycleHookSpecificationList(): Any? =
        unwrap(this).getLifecycleHookSpecificationList()

    /**
     * A list of Classic Load Balancers associated with this Auto Scaling group.
     *
     * For Application Load Balancers, Network Load Balancers, and Gateway Load Balancers, specify
     * the `TargetGroupARNs` property instead.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-loadbalancernames)
     */
    override fun loadBalancerNames(): List<String> = unwrap(this).getLoadBalancerNames() ?:
        emptyList()

    /**
     * The maximum amount of time, in seconds, that an instance can be in service.
     *
     * The default is null. If specified, the value must be either 0 or a number equal to or greater
     * than 86,400 seconds (1 day). For more information, see [Replace Auto Scaling instances based on
     * maximum instance
     * lifetime](https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-max-instance-lifetime.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-maxinstancelifetime)
     */
    override fun maxInstanceLifetime(): Number? = unwrap(this).getMaxInstanceLifetime()

    /**
     * The maximum size of the group.
     *
     *
     * With a mixed instances policy that uses instance weighting, Amazon EC2 Auto Scaling may need
     * to go above `MaxSize` to meet your capacity requirements. In this event, Amazon EC2 Auto Scaling
     * will never go above `MaxSize` by more than your largest instance weight (weights that define how
     * many units each instance contributes to the desired capacity of the group).
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-maxsize)
     */
    override fun maxSize(): String = unwrap(this).getMaxSize()

    /**
     * Enables the monitoring of group metrics of an Auto Scaling group.
     *
     * By default, these metrics are disabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-metricscollection)
     */
    override fun metricsCollection(): Any? = unwrap(this).getMetricsCollection()

    /**
     * The minimum size of the group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-minsize)
     */
    override fun minSize(): String = unwrap(this).getMinSize()

    /**
     * An embedded object that specifies a mixed instances policy.
     *
     * The policy includes properties that not only define the distribution of On-Demand Instances
     * and Spot Instances, the maximum price to pay for Spot Instances (optional), and how the Auto
     * Scaling group allocates instance types to fulfill On-Demand and Spot capacities, but also the
     * properties that specify the instance configuration information—the launch template and instance
     * types. The policy can also include a weight for each instance type and different launch
     * templates for individual instance types.
     *
     * For more information, see [Auto Scaling groups with multiple instance types and purchase
     * options](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-mixed-instances-groups.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-mixedinstancespolicy)
     */
    override fun mixedInstancesPolicy(): Any? = unwrap(this).getMixedInstancesPolicy()

    /**
     * Indicates whether newly launched instances are protected from termination by Amazon EC2 Auto
     * Scaling when scaling in.
     *
     * For more information about preventing instances from terminating on scale in, see [Use
     * instance scale-in
     * protection](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-instance-protection.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-newinstancesprotectedfromscalein)
     */
    override fun newInstancesProtectedFromScaleIn(): Any? =
        unwrap(this).getNewInstancesProtectedFromScaleIn()

    /**
     * (deprecated) A structure that specifies an Amazon SNS notification configuration for the
     * `NotificationConfigurations` property of the
     * [AWS::AutoScaling::AutoScalingGroup](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html)
     * resource.  For an example template snippet, see [Configure Amazon EC2 Auto Scaling
     * resources](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/quickref-ec2-auto-scaling.html).
     *  For more information, see [Get Amazon SNS notifications when your Auto Scaling group
     * scales](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ASGettingNotifications.html) in
     * the *Amazon EC2 Auto Scaling User Guide*.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-notificationconfiguration)
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    override fun notificationConfiguration(): Any? = unwrap(this).getNotificationConfiguration()

    /**
     * Configures an Auto Scaling group to send notifications when specified events take place.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-notificationconfigurations)
     */
    override fun notificationConfigurations(): Any? = unwrap(this).getNotificationConfigurations()

    /**
     * The name of the placement group into which to launch your instances.
     *
     * For more information, see [Placement
     * groups](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html) in the
     * *Amazon EC2 User Guide* .
     *
     *
     * A *cluster* placement group is a logical grouping of instances within a single Availability
     * Zone. You cannot specify multiple Availability Zones and a cluster placement group.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-placementgroup)
     */
    override fun placementGroup(): String? = unwrap(this).getPlacementGroup()

    /**
     * The Amazon Resource Name (ARN) of the service-linked role that the Auto Scaling group uses to
     * call other AWS service on your behalf.
     *
     * By default, Amazon EC2 Auto Scaling uses a service-linked role named
     * `AWSServiceRoleForAutoScaling` , which it creates if it does not exist. For more information,
     * see [Service-linked
     * roles](https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-service-linked-role.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-servicelinkedrolearn)
     */
    override fun serviceLinkedRoleArn(): String? = unwrap(this).getServiceLinkedRoleArn()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-skipzonalshiftvalidation)
     */
    override fun skipZonalShiftValidation(): Any? = unwrap(this).getSkipZonalShiftValidation()

    /**
     * One or more tags.
     *
     * You can tag your Auto Scaling group and propagate the tags to the Amazon EC2 instances it
     * launches. Tags are not propagated to Amazon EBS volumes. To add tags to Amazon EBS volumes,
     * specify the tags in a launch template but use caution. If the launch template specifies an
     * instance tag with a key that is also specified for the Auto Scaling group, Amazon EC2 Auto
     * Scaling overrides the value of that instance tag with the value specified by the Auto Scaling
     * group. For more information, see [Tag Auto Scaling groups and
     * instances](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-tagging.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-tags)
     */
    override fun tags(): List<CfnAutoScalingGroup.TagPropertyProperty> =
        unwrap(this).getTags()?.map(CfnAutoScalingGroup.TagPropertyProperty::wrap) ?: emptyList()

    /**
     * The Amazon Resource Names (ARN) of the Elastic Load Balancing target groups to associate with
     * the Auto Scaling group.
     *
     * Instances are registered as targets with the target groups. The target groups receive
     * incoming traffic and route requests to one or more registered targets. For more information, see
     * [Use Elastic Load Balancing to distribute traffic across the instances in your Auto Scaling
     * group](https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-load-balancer.html) in
     * the *Amazon EC2 Auto Scaling User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-targetgrouparns)
     */
    override fun targetGroupArns(): List<String> = unwrap(this).getTargetGroupArns() ?: emptyList()

    /**
     * A policy or a list of policies that are used to select the instance to terminate.
     *
     * These policies are executed in the order that you list them. For more information, see
     * [Configure termination policies for Amazon EC2 Auto
     * Scaling](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-termination-policies.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * Valid values: `Default` | `AllocationStrategy` | `ClosestToNextInstanceHour` |
     * `NewestInstance` | `OldestInstance` | `OldestLaunchConfiguration` | `OldestLaunchTemplate` |
     * `arn:aws:lambda:region:account-id:function:my-function:my-alias`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-terminationpolicies)
     */
    override fun terminationPolicies(): List<String> = unwrap(this).getTerminationPolicies() ?:
        emptyList()

    /**
     * The traffic sources associated with this Auto Scaling group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-trafficsources)
     */
    override fun trafficSources(): Any? = unwrap(this).getTrafficSources()

    /**
     * A list of subnet IDs for a virtual private cloud (VPC) where instances in the Auto Scaling
     * group can be created.
     *
     * If this resource specifies public subnets and is also in a VPC that is defined in the same
     * stack template, you must use the [DependsOn
     * attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
     * to declare a dependency on the [VPC-gateway
     * attachment](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc-gateway-attachment.html)
     * .
     *
     *
     * When you update `VPCZoneIdentifier` , this retains the same Auto Scaling group and replaces
     * old instances with new ones, according to the specified subnets. You can optionally specify how
     * CloudFormation handles these updates by using an [UpdatePolicy
     * attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-updatepolicy.html)
     * .
     *
     *
     * Required to launch instances into a nondefault VPC. If you specify `VPCZoneIdentifier` with
     * `AvailabilityZones` , the subnets that you specify for this property must reside in those
     * Availability Zones.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-vpczoneidentifier)
     */
    override fun vpcZoneIdentifier(): List<String> = unwrap(this).getVpcZoneIdentifier() ?:
        emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAutoScalingGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroupProps):
        CfnAutoScalingGroupProps = CdkObjectWrappers.wrap(cdkObject) as? CfnAutoScalingGroupProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAutoScalingGroupProps):
        software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroupProps
  }
}
