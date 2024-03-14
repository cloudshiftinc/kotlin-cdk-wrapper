package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnAutoScalingGroup internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The name of the Auto Scaling group.
   *
   * This name must be unique per Region per account.
   */
  public open fun autoScalingGroupName(): String? = unwrap(this).getAutoScalingGroupName()

  /**
   * The name of the Auto Scaling group.
   *
   * This name must be unique per Region per account.
   */
  public open fun autoScalingGroupName(`value`: String) {
    unwrap(this).setAutoScalingGroupName(`value`)
  }

  /**
   * A list of Availability Zones where instances in the Auto Scaling group can be created.
   */
  public open fun availabilityZones(): List<String> = unwrap(this).getAvailabilityZones() ?:
      emptyList()

  /**
   * A list of Availability Zones where instances in the Auto Scaling group can be created.
   */
  public open fun availabilityZones(`value`: List<String>) {
    unwrap(this).setAvailabilityZones(`value`)
  }

  /**
   * A list of Availability Zones where instances in the Auto Scaling group can be created.
   */
  public open fun availabilityZones(vararg `value`: String): Unit =
      availabilityZones(`value`.toList())

  /**
   * Indicates whether Capacity Rebalancing is enabled.
   */
  public open fun capacityRebalance(): Any? = unwrap(this).getCapacityRebalance()

  /**
   * Indicates whether Capacity Rebalancing is enabled.
   */
  public open fun capacityRebalance(`value`: Boolean) {
    unwrap(this).setCapacityRebalance(`value`)
  }

  /**
   * Indicates whether Capacity Rebalancing is enabled.
   */
  public open fun capacityRebalance(`value`: IResolvable) {
    unwrap(this).setCapacityRebalance(`value`.let(IResolvable::unwrap))
  }

  /**
   * Reserved.
   */
  public open fun context(): String? = unwrap(this).getContext()

  /**
   * Reserved.
   */
  public open fun context(`value`: String) {
    unwrap(this).setContext(`value`)
  }

  /**
   * *Only needed if you use simple scaling policies.*.
   */
  public open fun cooldown(): String? = unwrap(this).getCooldown()

  /**
   * *Only needed if you use simple scaling policies.*.
   */
  public open fun cooldown(`value`: String) {
    unwrap(this).setCooldown(`value`)
  }

  /**
   * The amount of time, in seconds, until a new instance is considered to have finished
   * initializing and resource consumption to become stable after it enters the `InService` state.
   */
  public open fun defaultInstanceWarmup(): Number? = unwrap(this).getDefaultInstanceWarmup()

  /**
   * The amount of time, in seconds, until a new instance is considered to have finished
   * initializing and resource consumption to become stable after it enters the `InService` state.
   */
  public open fun defaultInstanceWarmup(`value`: Number) {
    unwrap(this).setDefaultInstanceWarmup(`value`)
  }

  /**
   * The desired capacity is the initial capacity of the Auto Scaling group at the time of its
   * creation and the capacity it attempts to maintain.
   */
  public open fun desiredCapacity(): String? = unwrap(this).getDesiredCapacity()

  /**
   * The desired capacity is the initial capacity of the Auto Scaling group at the time of its
   * creation and the capacity it attempts to maintain.
   */
  public open fun desiredCapacity(`value`: String) {
    unwrap(this).setDesiredCapacity(`value`)
  }

  /**
   * The unit of measurement for the value specified for desired capacity.
   */
  public open fun desiredCapacityType(): String? = unwrap(this).getDesiredCapacityType()

  /**
   * The unit of measurement for the value specified for desired capacity.
   */
  public open fun desiredCapacityType(`value`: String) {
    unwrap(this).setDesiredCapacityType(`value`)
  }

  /**
   * The amount of time, in seconds, that Amazon EC2 Auto Scaling waits before checking the health
   * status of an EC2 instance that has come into service and marking it unhealthy due to a failed
   * health check.
   */
  public open fun healthCheckGracePeriod(): Number? = unwrap(this).getHealthCheckGracePeriod()

  /**
   * The amount of time, in seconds, that Amazon EC2 Auto Scaling waits before checking the health
   * status of an EC2 instance that has come into service and marking it unhealthy due to a failed
   * health check.
   */
  public open fun healthCheckGracePeriod(`value`: Number) {
    unwrap(this).setHealthCheckGracePeriod(`value`)
  }

  /**
   * A comma-separated value string of one or more health check types.
   */
  public open fun healthCheckType(): String? = unwrap(this).getHealthCheckType()

  /**
   * A comma-separated value string of one or more health check types.
   */
  public open fun healthCheckType(`value`: String) {
    unwrap(this).setHealthCheckType(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The ID of the instance used to base the launch configuration on.
   */
  public open fun instanceId(): String? = unwrap(this).getInstanceId()

  /**
   * The ID of the instance used to base the launch configuration on.
   */
  public open fun instanceId(`value`: String) {
    unwrap(this).setInstanceId(`value`)
  }

  /**
   * An instance maintenance policy.
   */
  public open fun instanceMaintenancePolicy(): Any? = unwrap(this).getInstanceMaintenancePolicy()

  /**
   * An instance maintenance policy.
   */
  public open fun instanceMaintenancePolicy(`value`: IResolvable) {
    unwrap(this).setInstanceMaintenancePolicy(`value`.let(IResolvable::unwrap))
  }

  /**
   * An instance maintenance policy.
   */
  public open fun instanceMaintenancePolicy(`value`: InstanceMaintenancePolicyProperty) {
    unwrap(this).setInstanceMaintenancePolicy(`value`.let(InstanceMaintenancePolicyProperty::unwrap))
  }

  /**
   * An instance maintenance policy.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f5589b948c6edc939d9b439b9912d34e4ae4c3d6ccafb514dc9cd40139931f49")
  public open
      fun instanceMaintenancePolicy(`value`: InstanceMaintenancePolicyProperty.Builder.() -> Unit):
      Unit = instanceMaintenancePolicy(InstanceMaintenancePolicyProperty(`value`))

  /**
   * The name of the launch configuration to use to launch instances.
   */
  public open fun launchConfigurationName(): String? = unwrap(this).getLaunchConfigurationName()

  /**
   * The name of the launch configuration to use to launch instances.
   */
  public open fun launchConfigurationName(`value`: String) {
    unwrap(this).setLaunchConfigurationName(`value`)
  }

  /**
   * Information used to specify the launch template and version to use to launch instances.
   */
  public open fun launchTemplate(): Any? = unwrap(this).getLaunchTemplate()

  /**
   * Information used to specify the launch template and version to use to launch instances.
   */
  public open fun launchTemplate(`value`: IResolvable) {
    unwrap(this).setLaunchTemplate(`value`.let(IResolvable::unwrap))
  }

  /**
   * Information used to specify the launch template and version to use to launch instances.
   */
  public open fun launchTemplate(`value`: LaunchTemplateSpecificationProperty) {
    unwrap(this).setLaunchTemplate(`value`.let(LaunchTemplateSpecificationProperty::unwrap))
  }

  /**
   * Information used to specify the launch template and version to use to launch instances.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d8b91fdeaaeeb0873592358f964a1306a1abf7472d4f22a9721bd95e480a7b88")
  public open fun launchTemplate(`value`: LaunchTemplateSpecificationProperty.Builder.() -> Unit):
      Unit = launchTemplate(LaunchTemplateSpecificationProperty(`value`))

  /**
   * One or more lifecycle hooks to add to the Auto Scaling group before instances are launched.
   */
  public open fun lifecycleHookSpecificationList(): Any? =
      unwrap(this).getLifecycleHookSpecificationList()

  /**
   * One or more lifecycle hooks to add to the Auto Scaling group before instances are launched.
   */
  public open fun lifecycleHookSpecificationList(`value`: IResolvable) {
    unwrap(this).setLifecycleHookSpecificationList(`value`.let(IResolvable::unwrap))
  }

  /**
   * One or more lifecycle hooks to add to the Auto Scaling group before instances are launched.
   */
  public open fun lifecycleHookSpecificationList(__idx_ac66f0: List<Any>) {
    unwrap(this).setLifecycleHookSpecificationList(__idx_ac66f0)
  }

  /**
   * One or more lifecycle hooks to add to the Auto Scaling group before instances are launched.
   */
  public open fun lifecycleHookSpecificationList(vararg __idx_ac66f0: Any): Unit =
      lifecycleHookSpecificationList(__idx_ac66f0.toList())

  /**
   * A list of Classic Load Balancers associated with this Auto Scaling group.
   */
  public open fun loadBalancerNames(): List<String> = unwrap(this).getLoadBalancerNames() ?:
      emptyList()

  /**
   * A list of Classic Load Balancers associated with this Auto Scaling group.
   */
  public open fun loadBalancerNames(`value`: List<String>) {
    unwrap(this).setLoadBalancerNames(`value`)
  }

  /**
   * A list of Classic Load Balancers associated with this Auto Scaling group.
   */
  public open fun loadBalancerNames(vararg `value`: String): Unit =
      loadBalancerNames(`value`.toList())

  /**
   * The maximum amount of time, in seconds, that an instance can be in service.
   */
  public open fun maxInstanceLifetime(): Number? = unwrap(this).getMaxInstanceLifetime()

  /**
   * The maximum amount of time, in seconds, that an instance can be in service.
   */
  public open fun maxInstanceLifetime(`value`: Number) {
    unwrap(this).setMaxInstanceLifetime(`value`)
  }

  /**
   * The maximum size of the group.
   */
  public open fun maxSize(): String = unwrap(this).getMaxSize()

  /**
   * The maximum size of the group.
   */
  public open fun maxSize(`value`: String) {
    unwrap(this).setMaxSize(`value`)
  }

  /**
   * Enables the monitoring of group metrics of an Auto Scaling group.
   */
  public open fun metricsCollection(): Any? = unwrap(this).getMetricsCollection()

  /**
   * Enables the monitoring of group metrics of an Auto Scaling group.
   */
  public open fun metricsCollection(`value`: IResolvable) {
    unwrap(this).setMetricsCollection(`value`.let(IResolvable::unwrap))
  }

  /**
   * Enables the monitoring of group metrics of an Auto Scaling group.
   */
  public open fun metricsCollection(__idx_ac66f0: List<Any>) {
    unwrap(this).setMetricsCollection(__idx_ac66f0)
  }

  /**
   * Enables the monitoring of group metrics of an Auto Scaling group.
   */
  public open fun metricsCollection(vararg __idx_ac66f0: Any): Unit =
      metricsCollection(__idx_ac66f0.toList())

  /**
   * The minimum size of the group.
   */
  public open fun minSize(): String = unwrap(this).getMinSize()

  /**
   * The minimum size of the group.
   */
  public open fun minSize(`value`: String) {
    unwrap(this).setMinSize(`value`)
  }

  /**
   * An embedded object that specifies a mixed instances policy.
   */
  public open fun mixedInstancesPolicy(): Any? = unwrap(this).getMixedInstancesPolicy()

  /**
   * An embedded object that specifies a mixed instances policy.
   */
  public open fun mixedInstancesPolicy(`value`: IResolvable) {
    unwrap(this).setMixedInstancesPolicy(`value`.let(IResolvable::unwrap))
  }

  /**
   * An embedded object that specifies a mixed instances policy.
   */
  public open fun mixedInstancesPolicy(`value`: MixedInstancesPolicyProperty) {
    unwrap(this).setMixedInstancesPolicy(`value`.let(MixedInstancesPolicyProperty::unwrap))
  }

  /**
   * An embedded object that specifies a mixed instances policy.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0ab6466be8cd85bf09fdb079a845df267673eb353c6cb64f674d8cc6a9e910c5")
  public open fun mixedInstancesPolicy(`value`: MixedInstancesPolicyProperty.Builder.() -> Unit):
      Unit = mixedInstancesPolicy(MixedInstancesPolicyProperty(`value`))

  /**
   * Indicates whether newly launched instances are protected from termination by Amazon EC2 Auto
   * Scaling when scaling in.
   */
  public open fun newInstancesProtectedFromScaleIn(): Any? =
      unwrap(this).getNewInstancesProtectedFromScaleIn()

  /**
   * Indicates whether newly launched instances are protected from termination by Amazon EC2 Auto
   * Scaling when scaling in.
   */
  public open fun newInstancesProtectedFromScaleIn(`value`: Boolean) {
    unwrap(this).setNewInstancesProtectedFromScaleIn(`value`)
  }

  /**
   * Indicates whether newly launched instances are protected from termination by Amazon EC2 Auto
   * Scaling when scaling in.
   */
  public open fun newInstancesProtectedFromScaleIn(`value`: IResolvable) {
    unwrap(this).setNewInstancesProtectedFromScaleIn(`value`.let(IResolvable::unwrap))
  }

  /**
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun notificationConfiguration(): Any? = unwrap(this).getNotificationConfiguration()

  /**
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun notificationConfiguration(`value`: IResolvable) {
    unwrap(this).setNotificationConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun notificationConfiguration(`value`: NotificationConfigurationProperty) {
    unwrap(this).setNotificationConfiguration(`value`.let(NotificationConfigurationProperty::unwrap))
  }

  /**
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d407dd344718eb317427d393e4a69e16a701c43800c71bc614f4437883d40586")
  public open
      fun notificationConfiguration(`value`: NotificationConfigurationProperty.Builder.() -> Unit):
      Unit = notificationConfiguration(NotificationConfigurationProperty(`value`))

  /**
   * Configures an Auto Scaling group to send notifications when specified events take place.
   */
  public open fun notificationConfigurations(): Any? = unwrap(this).getNotificationConfigurations()

  /**
   * Configures an Auto Scaling group to send notifications when specified events take place.
   */
  public open fun notificationConfigurations(`value`: IResolvable) {
    unwrap(this).setNotificationConfigurations(`value`.let(IResolvable::unwrap))
  }

  /**
   * Configures an Auto Scaling group to send notifications when specified events take place.
   */
  public open fun notificationConfigurations(__idx_ac66f0: List<Any>) {
    unwrap(this).setNotificationConfigurations(__idx_ac66f0)
  }

  /**
   * Configures an Auto Scaling group to send notifications when specified events take place.
   */
  public open fun notificationConfigurations(vararg __idx_ac66f0: Any): Unit =
      notificationConfigurations(__idx_ac66f0.toList())

  /**
   * The name of the placement group into which to launch your instances.
   */
  public open fun placementGroup(): String? = unwrap(this).getPlacementGroup()

  /**
   * The name of the placement group into which to launch your instances.
   */
  public open fun placementGroup(`value`: String) {
    unwrap(this).setPlacementGroup(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the service-linked role that the Auto Scaling group uses to
   * call other AWS service on your behalf.
   */
  public open fun serviceLinkedRoleArn(): String? = unwrap(this).getServiceLinkedRoleArn()

  /**
   * The Amazon Resource Name (ARN) of the service-linked role that the Auto Scaling group uses to
   * call other AWS service on your behalf.
   */
  public open fun serviceLinkedRoleArn(`value`: String) {
    unwrap(this).setServiceLinkedRoleArn(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * One or more tags.
   */
  public open fun tagsRaw(): List<TagPropertyProperty> =
      unwrap(this).getTagsRaw()?.map(TagPropertyProperty::wrap) ?: emptyList()

  /**
   * One or more tags.
   */
  public open fun tagsRaw(`value`: List<TagPropertyProperty>) {
    unwrap(this).setTagsRaw(`value`.map(TagPropertyProperty::unwrap))
  }

  /**
   * One or more tags.
   */
  public open fun tagsRaw(vararg `value`: TagPropertyProperty): Unit = tagsRaw(`value`.toList())

  /**
   * The Amazon Resource Names (ARN) of the Elastic Load Balancing target groups to associate with
   * the Auto Scaling group.
   */
  public open fun targetGroupArns(): List<String> = unwrap(this).getTargetGroupArns() ?: emptyList()

  /**
   * The Amazon Resource Names (ARN) of the Elastic Load Balancing target groups to associate with
   * the Auto Scaling group.
   */
  public open fun targetGroupArns(`value`: List<String>) {
    unwrap(this).setTargetGroupArns(`value`)
  }

  /**
   * The Amazon Resource Names (ARN) of the Elastic Load Balancing target groups to associate with
   * the Auto Scaling group.
   */
  public open fun targetGroupArns(vararg `value`: String): Unit = targetGroupArns(`value`.toList())

  /**
   * A policy or a list of policies that are used to select the instance to terminate.
   */
  public open fun terminationPolicies(): List<String> = unwrap(this).getTerminationPolicies() ?:
      emptyList()

  /**
   * A policy or a list of policies that are used to select the instance to terminate.
   */
  public open fun terminationPolicies(`value`: List<String>) {
    unwrap(this).setTerminationPolicies(`value`)
  }

  /**
   * A policy or a list of policies that are used to select the instance to terminate.
   */
  public open fun terminationPolicies(vararg `value`: String): Unit =
      terminationPolicies(`value`.toList())

  /**
   * A list of subnet IDs for a virtual private cloud (VPC) where instances in the Auto Scaling
   * group can be created.
   */
  public open fun vpcZoneIdentifier(): List<String> = unwrap(this).getVpcZoneIdentifier() ?:
      emptyList()

  /**
   * A list of subnet IDs for a virtual private cloud (VPC) where instances in the Auto Scaling
   * group can be created.
   */
  public open fun vpcZoneIdentifier(`value`: List<String>) {
    unwrap(this).setVpcZoneIdentifier(`value`)
  }

  /**
   * A list of subnet IDs for a virtual private cloud (VPC) where instances in the Auto Scaling
   * group can be created.
   */
  public open fun vpcZoneIdentifier(vararg `value`: String): Unit =
      vpcZoneIdentifier(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.autoscaling.CfnAutoScalingGroup].
   */
  @CdkDslMarker
  public interface Builder {
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
     * @param autoScalingGroupName The name of the Auto Scaling group. This name must be unique per
     * Region per account. 
     */
    public fun autoScalingGroupName(autoScalingGroupName: String)

    /**
     * A list of Availability Zones where instances in the Auto Scaling group can be created.
     *
     * Used for launching into the default VPC subnet in each Availability Zone when not using the
     * `VPCZoneIdentifier` property, or for attaching a network interface when an existing network
     * interface ID is specified in a launch template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-availabilityzones)
     * @param availabilityZones A list of Availability Zones where instances in the Auto Scaling
     * group can be created. 
     */
    public fun availabilityZones(availabilityZones: List<String>)

    /**
     * A list of Availability Zones where instances in the Auto Scaling group can be created.
     *
     * Used for launching into the default VPC subnet in each Availability Zone when not using the
     * `VPCZoneIdentifier` property, or for attaching a network interface when an existing network
     * interface ID is specified in a launch template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-availabilityzones)
     * @param availabilityZones A list of Availability Zones where instances in the Auto Scaling
     * group can be created. 
     */
    public fun availabilityZones(vararg availabilityZones: String)

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
     * @param capacityRebalance Indicates whether Capacity Rebalancing is enabled. 
     */
    public fun capacityRebalance(capacityRebalance: Boolean)

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
     * @param capacityRebalance Indicates whether Capacity Rebalancing is enabled. 
     */
    public fun capacityRebalance(capacityRebalance: IResolvable)

    /**
     * Reserved.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-context)
     * @param context Reserved. 
     */
    public fun context(context: String)

    /**
     * *Only needed if you use simple scaling policies.*.
     *
     * The amount of time, in seconds, between one scaling activity ending and another one starting
     * due to simple scaling policies. For more information, see [Scaling cooldowns for Amazon EC2 Auto
     * Scaling](https://docs.aws.amazon.com/autoscaling/ec2/userguide/Cooldown.html) in the *Amazon EC2
     * Auto Scaling User Guide* .
     *
     * Default: `300` seconds
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-cooldown)
     * @param cooldown *Only needed if you use simple scaling policies.*. 
     */
    public fun cooldown(cooldown: String)

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
     * @param defaultInstanceWarmup The amount of time, in seconds, until a new instance is
     * considered to have finished initializing and resource consumption to become stable after it
     * enters the `InService` state. 
     */
    public fun defaultInstanceWarmup(defaultInstanceWarmup: Number)

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
     * @param desiredCapacity The desired capacity is the initial capacity of the Auto Scaling group
     * at the time of its creation and the capacity it attempts to maintain. 
     */
    public fun desiredCapacity(desiredCapacity: String)

    /**
     * The unit of measurement for the value specified for desired capacity.
     *
     * Amazon EC2 Auto Scaling supports `DesiredCapacityType` for attribute-based instance type
     * selection only. For more information, see [Creating an Auto Scaling group using attribute-based
     * instance type
     * selection](https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-asg-instance-type-requirements.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * By default, Amazon EC2 Auto Scaling specifies `units` , which translates into number of
     * instances.
     *
     * Valid values: `units` | `vcpu` | `memory-mib`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-desiredcapacitytype)
     * @param desiredCapacityType The unit of measurement for the value specified for desired
     * capacity. 
     */
    public fun desiredCapacityType(desiredCapacityType: String)

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
     * @param healthCheckGracePeriod The amount of time, in seconds, that Amazon EC2 Auto Scaling
     * waits before checking the health status of an EC2 instance that has come into service and
     * marking it unhealthy due to a failed health check. 
     */
    public fun healthCheckGracePeriod(healthCheckGracePeriod: Number)

    /**
     * A comma-separated value string of one or more health check types.
     *
     * The valid values are `EC2` , `ELB` , and `VPC_LATTICE` . `EC2` is the default health check
     * and cannot be disabled. For more information, see [Health checks for Auto Scaling
     * instances](https://docs.aws.amazon.com/autoscaling/ec2/userguide/healthcheck.html) in the
     * *Amazon EC2 Auto Scaling User Guide* .
     *
     * Only specify `EC2` if you must clear a value that was previously set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-healthchecktype)
     * @param healthCheckType A comma-separated value string of one or more health check types. 
     */
    public fun healthCheckType(healthCheckType: String)

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
     * @param instanceId The ID of the instance used to base the launch configuration on. 
     */
    public fun instanceId(instanceId: String)

    /**
     * An instance maintenance policy.
     *
     * For more information, see [Set instance maintenance
     * policy](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-instance-maintenance-policy.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-instancemaintenancepolicy)
     * @param instanceMaintenancePolicy An instance maintenance policy. 
     */
    public fun instanceMaintenancePolicy(instanceMaintenancePolicy: IResolvable)

    /**
     * An instance maintenance policy.
     *
     * For more information, see [Set instance maintenance
     * policy](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-instance-maintenance-policy.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-instancemaintenancepolicy)
     * @param instanceMaintenancePolicy An instance maintenance policy. 
     */
    public
        fun instanceMaintenancePolicy(instanceMaintenancePolicy: InstanceMaintenancePolicyProperty)

    /**
     * An instance maintenance policy.
     *
     * For more information, see [Set instance maintenance
     * policy](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-instance-maintenance-policy.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-instancemaintenancepolicy)
     * @param instanceMaintenancePolicy An instance maintenance policy. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1b31a935f878d6378f68b18f226cb9517d4642a7e37455a7770205f6bb21c964")
    public
        fun instanceMaintenancePolicy(instanceMaintenancePolicy: InstanceMaintenancePolicyProperty.Builder.() -> Unit)

    /**
     * The name of the launch configuration to use to launch instances.
     *
     * Required only if you don't specify `LaunchTemplate` , `MixedInstancesPolicy` , or
     * `InstanceId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-launchconfigurationname)
     * @param launchConfigurationName The name of the launch configuration to use to launch
     * instances. 
     */
    public fun launchConfigurationName(launchConfigurationName: String)

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
     * @param launchTemplate Information used to specify the launch template and version to use to
     * launch instances. 
     */
    public fun launchTemplate(launchTemplate: IResolvable)

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
     * @param launchTemplate Information used to specify the launch template and version to use to
     * launch instances. 
     */
    public fun launchTemplate(launchTemplate: LaunchTemplateSpecificationProperty)

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
     * @param launchTemplate Information used to specify the launch template and version to use to
     * launch instances. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4400d81b41005748e36414987dda265ab35efce6e88dfd5d285d0fd08dab830f")
    public
        fun launchTemplate(launchTemplate: LaunchTemplateSpecificationProperty.Builder.() -> Unit)

    /**
     * One or more lifecycle hooks to add to the Auto Scaling group before instances are launched.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecificationlist)
     * @param lifecycleHookSpecificationList One or more lifecycle hooks to add to the Auto Scaling
     * group before instances are launched. 
     */
    public fun lifecycleHookSpecificationList(lifecycleHookSpecificationList: IResolvable)

    /**
     * One or more lifecycle hooks to add to the Auto Scaling group before instances are launched.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecificationlist)
     * @param lifecycleHookSpecificationList One or more lifecycle hooks to add to the Auto Scaling
     * group before instances are launched. 
     */
    public fun lifecycleHookSpecificationList(lifecycleHookSpecificationList: List<Any>)

    /**
     * One or more lifecycle hooks to add to the Auto Scaling group before instances are launched.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecificationlist)
     * @param lifecycleHookSpecificationList One or more lifecycle hooks to add to the Auto Scaling
     * group before instances are launched. 
     */
    public fun lifecycleHookSpecificationList(vararg lifecycleHookSpecificationList: Any)

    /**
     * A list of Classic Load Balancers associated with this Auto Scaling group.
     *
     * For Application Load Balancers, Network Load Balancers, and Gateway Load Balancers, specify
     * the `TargetGroupARNs` property instead.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-loadbalancernames)
     * @param loadBalancerNames A list of Classic Load Balancers associated with this Auto Scaling
     * group. 
     */
    public fun loadBalancerNames(loadBalancerNames: List<String>)

    /**
     * A list of Classic Load Balancers associated with this Auto Scaling group.
     *
     * For Application Load Balancers, Network Load Balancers, and Gateway Load Balancers, specify
     * the `TargetGroupARNs` property instead.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-loadbalancernames)
     * @param loadBalancerNames A list of Classic Load Balancers associated with this Auto Scaling
     * group. 
     */
    public fun loadBalancerNames(vararg loadBalancerNames: String)

    /**
     * The maximum amount of time, in seconds, that an instance can be in service.
     *
     * The default is null. If specified, the value must be either 0 or a number equal to or greater
     * than 86,400 seconds (1 day). For more information, see [Replacing Auto Scaling instances based
     * on maximum instance
     * lifetime](https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-max-instance-lifetime.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-maxinstancelifetime)
     * @param maxInstanceLifetime The maximum amount of time, in seconds, that an instance can be in
     * service. 
     */
    public fun maxInstanceLifetime(maxInstanceLifetime: Number)

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
     * @param maxSize The maximum size of the group. 
     */
    public fun maxSize(maxSize: String)

    /**
     * Enables the monitoring of group metrics of an Auto Scaling group.
     *
     * By default, these metrics are disabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-metricscollection)
     * @param metricsCollection Enables the monitoring of group metrics of an Auto Scaling group. 
     */
    public fun metricsCollection(metricsCollection: IResolvable)

    /**
     * Enables the monitoring of group metrics of an Auto Scaling group.
     *
     * By default, these metrics are disabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-metricscollection)
     * @param metricsCollection Enables the monitoring of group metrics of an Auto Scaling group. 
     */
    public fun metricsCollection(metricsCollection: List<Any>)

    /**
     * Enables the monitoring of group metrics of an Auto Scaling group.
     *
     * By default, these metrics are disabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-metricscollection)
     * @param metricsCollection Enables the monitoring of group metrics of an Auto Scaling group. 
     */
    public fun metricsCollection(vararg metricsCollection: Any)

    /**
     * The minimum size of the group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-minsize)
     * @param minSize The minimum size of the group. 
     */
    public fun minSize(minSize: String)

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
     * @param mixedInstancesPolicy An embedded object that specifies a mixed instances policy. 
     */
    public fun mixedInstancesPolicy(mixedInstancesPolicy: IResolvable)

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
     * @param mixedInstancesPolicy An embedded object that specifies a mixed instances policy. 
     */
    public fun mixedInstancesPolicy(mixedInstancesPolicy: MixedInstancesPolicyProperty)

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
     * @param mixedInstancesPolicy An embedded object that specifies a mixed instances policy. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("225b9b144c2f54944bd28485b6bb3492a765f1d00ca05604123531373cae2a81")
    public
        fun mixedInstancesPolicy(mixedInstancesPolicy: MixedInstancesPolicyProperty.Builder.() -> Unit)

    /**
     * Indicates whether newly launched instances are protected from termination by Amazon EC2 Auto
     * Scaling when scaling in.
     *
     * For more information about preventing instances from terminating on scale in, see [Using
     * instance scale-in
     * protection](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-instance-protection.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-newinstancesprotectedfromscalein)
     * @param newInstancesProtectedFromScaleIn Indicates whether newly launched instances are
     * protected from termination by Amazon EC2 Auto Scaling when scaling in. 
     */
    public fun newInstancesProtectedFromScaleIn(newInstancesProtectedFromScaleIn: Boolean)

    /**
     * Indicates whether newly launched instances are protected from termination by Amazon EC2 Auto
     * Scaling when scaling in.
     *
     * For more information about preventing instances from terminating on scale in, see [Using
     * instance scale-in
     * protection](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-instance-protection.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-newinstancesprotectedfromscalein)
     * @param newInstancesProtectedFromScaleIn Indicates whether newly launched instances are
     * protected from termination by Amazon EC2 Auto Scaling when scaling in. 
     */
    public fun newInstancesProtectedFromScaleIn(newInstancesProtectedFromScaleIn: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-notificationconfiguration)
     * @deprecated this property has been deprecated
     * @param notificationConfiguration 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun notificationConfiguration(notificationConfiguration: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-notificationconfiguration)
     * @deprecated this property has been deprecated
     * @param notificationConfiguration 
     */
    @Deprecated(message = "deprecated in CDK")
    public
        fun notificationConfiguration(notificationConfiguration: NotificationConfigurationProperty)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-notificationconfiguration)
     * @deprecated this property has been deprecated
     * @param notificationConfiguration 
     */
    @Deprecated(message = "deprecated in CDK")
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8a4b1af8972202b84a7387964643523d0d39173add845a86f803ad0c280243a9")
    public
        fun notificationConfiguration(notificationConfiguration: NotificationConfigurationProperty.Builder.() -> Unit)

    /**
     * Configures an Auto Scaling group to send notifications when specified events take place.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-notificationconfigurations)
     * @param notificationConfigurations Configures an Auto Scaling group to send notifications when
     * specified events take place. 
     */
    public fun notificationConfigurations(notificationConfigurations: IResolvable)

    /**
     * Configures an Auto Scaling group to send notifications when specified events take place.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-notificationconfigurations)
     * @param notificationConfigurations Configures an Auto Scaling group to send notifications when
     * specified events take place. 
     */
    public fun notificationConfigurations(notificationConfigurations: List<Any>)

    /**
     * Configures an Auto Scaling group to send notifications when specified events take place.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-notificationconfigurations)
     * @param notificationConfigurations Configures an Auto Scaling group to send notifications when
     * specified events take place. 
     */
    public fun notificationConfigurations(vararg notificationConfigurations: Any)

    /**
     * The name of the placement group into which to launch your instances.
     *
     * For more information, see [Placement
     * groups](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html) in the
     * *Amazon EC2 User Guide for Linux Instances* .
     *
     *
     * A *cluster* placement group is a logical grouping of instances within a single Availability
     * Zone. You cannot specify multiple Availability Zones and a cluster placement group.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-placementgroup)
     * @param placementGroup The name of the placement group into which to launch your instances. 
     */
    public fun placementGroup(placementGroup: String)

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
     * @param serviceLinkedRoleArn The Amazon Resource Name (ARN) of the service-linked role that
     * the Auto Scaling group uses to call other AWS service on your behalf. 
     */
    public fun serviceLinkedRoleArn(serviceLinkedRoleArn: String)

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
     * @param tags One or more tags. 
     */
    public fun tags(tags: List<TagPropertyProperty>)

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
     * @param tags One or more tags. 
     */
    public fun tags(vararg tags: TagPropertyProperty)

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
     * @param targetGroupArns The Amazon Resource Names (ARN) of the Elastic Load Balancing target
     * groups to associate with the Auto Scaling group. 
     */
    public fun targetGroupArns(targetGroupArns: List<String>)

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
     * @param targetGroupArns The Amazon Resource Names (ARN) of the Elastic Load Balancing target
     * groups to associate with the Auto Scaling group. 
     */
    public fun targetGroupArns(vararg targetGroupArns: String)

    /**
     * A policy or a list of policies that are used to select the instance to terminate.
     *
     * These policies are executed in the order that you list them. For more information, see [Work
     * with Amazon EC2 Auto Scaling termination
     * policies](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-termination-policies.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * Valid values: `Default` | `AllocationStrategy` | `ClosestToNextInstanceHour` |
     * `NewestInstance` | `OldestInstance` | `OldestLaunchConfiguration` | `OldestLaunchTemplate` |
     * `arn:aws:lambda:region:account-id:function:my-function:my-alias`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-terminationpolicies)
     * @param terminationPolicies A policy or a list of policies that are used to select the
     * instance to terminate. 
     */
    public fun terminationPolicies(terminationPolicies: List<String>)

    /**
     * A policy or a list of policies that are used to select the instance to terminate.
     *
     * These policies are executed in the order that you list them. For more information, see [Work
     * with Amazon EC2 Auto Scaling termination
     * policies](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-termination-policies.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * Valid values: `Default` | `AllocationStrategy` | `ClosestToNextInstanceHour` |
     * `NewestInstance` | `OldestInstance` | `OldestLaunchConfiguration` | `OldestLaunchTemplate` |
     * `arn:aws:lambda:region:account-id:function:my-function:my-alias`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-terminationpolicies)
     * @param terminationPolicies A policy or a list of policies that are used to select the
     * instance to terminate. 
     */
    public fun terminationPolicies(vararg terminationPolicies: String)

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
     * @param vpcZoneIdentifier A list of subnet IDs for a virtual private cloud (VPC) where
     * instances in the Auto Scaling group can be created. 
     */
    public fun vpcZoneIdentifier(vpcZoneIdentifier: List<String>)

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
     * @param vpcZoneIdentifier A list of subnet IDs for a virtual private cloud (VPC) where
     * instances in the Auto Scaling group can be created. 
     */
    public fun vpcZoneIdentifier(vararg vpcZoneIdentifier: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.Builder
        = software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.Builder.create(scope, id)

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
     * @param autoScalingGroupName The name of the Auto Scaling group. This name must be unique per
     * Region per account. 
     */
    override fun autoScalingGroupName(autoScalingGroupName: String) {
      cdkBuilder.autoScalingGroupName(autoScalingGroupName)
    }

    /**
     * A list of Availability Zones where instances in the Auto Scaling group can be created.
     *
     * Used for launching into the default VPC subnet in each Availability Zone when not using the
     * `VPCZoneIdentifier` property, or for attaching a network interface when an existing network
     * interface ID is specified in a launch template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-availabilityzones)
     * @param availabilityZones A list of Availability Zones where instances in the Auto Scaling
     * group can be created. 
     */
    override fun availabilityZones(availabilityZones: List<String>) {
      cdkBuilder.availabilityZones(availabilityZones)
    }

    /**
     * A list of Availability Zones where instances in the Auto Scaling group can be created.
     *
     * Used for launching into the default VPC subnet in each Availability Zone when not using the
     * `VPCZoneIdentifier` property, or for attaching a network interface when an existing network
     * interface ID is specified in a launch template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-availabilityzones)
     * @param availabilityZones A list of Availability Zones where instances in the Auto Scaling
     * group can be created. 
     */
    override fun availabilityZones(vararg availabilityZones: String): Unit =
        availabilityZones(availabilityZones.toList())

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
     * @param capacityRebalance Indicates whether Capacity Rebalancing is enabled. 
     */
    override fun capacityRebalance(capacityRebalance: Boolean) {
      cdkBuilder.capacityRebalance(capacityRebalance)
    }

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
     * @param capacityRebalance Indicates whether Capacity Rebalancing is enabled. 
     */
    override fun capacityRebalance(capacityRebalance: IResolvable) {
      cdkBuilder.capacityRebalance(capacityRebalance.let(IResolvable::unwrap))
    }

    /**
     * Reserved.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-context)
     * @param context Reserved. 
     */
    override fun context(context: String) {
      cdkBuilder.context(context)
    }

    /**
     * *Only needed if you use simple scaling policies.*.
     *
     * The amount of time, in seconds, between one scaling activity ending and another one starting
     * due to simple scaling policies. For more information, see [Scaling cooldowns for Amazon EC2 Auto
     * Scaling](https://docs.aws.amazon.com/autoscaling/ec2/userguide/Cooldown.html) in the *Amazon EC2
     * Auto Scaling User Guide* .
     *
     * Default: `300` seconds
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-cooldown)
     * @param cooldown *Only needed if you use simple scaling policies.*. 
     */
    override fun cooldown(cooldown: String) {
      cdkBuilder.cooldown(cooldown)
    }

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
     * @param defaultInstanceWarmup The amount of time, in seconds, until a new instance is
     * considered to have finished initializing and resource consumption to become stable after it
     * enters the `InService` state. 
     */
    override fun defaultInstanceWarmup(defaultInstanceWarmup: Number) {
      cdkBuilder.defaultInstanceWarmup(defaultInstanceWarmup)
    }

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
     * @param desiredCapacity The desired capacity is the initial capacity of the Auto Scaling group
     * at the time of its creation and the capacity it attempts to maintain. 
     */
    override fun desiredCapacity(desiredCapacity: String) {
      cdkBuilder.desiredCapacity(desiredCapacity)
    }

    /**
     * The unit of measurement for the value specified for desired capacity.
     *
     * Amazon EC2 Auto Scaling supports `DesiredCapacityType` for attribute-based instance type
     * selection only. For more information, see [Creating an Auto Scaling group using attribute-based
     * instance type
     * selection](https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-asg-instance-type-requirements.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * By default, Amazon EC2 Auto Scaling specifies `units` , which translates into number of
     * instances.
     *
     * Valid values: `units` | `vcpu` | `memory-mib`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-desiredcapacitytype)
     * @param desiredCapacityType The unit of measurement for the value specified for desired
     * capacity. 
     */
    override fun desiredCapacityType(desiredCapacityType: String) {
      cdkBuilder.desiredCapacityType(desiredCapacityType)
    }

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
     * @param healthCheckGracePeriod The amount of time, in seconds, that Amazon EC2 Auto Scaling
     * waits before checking the health status of an EC2 instance that has come into service and
     * marking it unhealthy due to a failed health check. 
     */
    override fun healthCheckGracePeriod(healthCheckGracePeriod: Number) {
      cdkBuilder.healthCheckGracePeriod(healthCheckGracePeriod)
    }

    /**
     * A comma-separated value string of one or more health check types.
     *
     * The valid values are `EC2` , `ELB` , and `VPC_LATTICE` . `EC2` is the default health check
     * and cannot be disabled. For more information, see [Health checks for Auto Scaling
     * instances](https://docs.aws.amazon.com/autoscaling/ec2/userguide/healthcheck.html) in the
     * *Amazon EC2 Auto Scaling User Guide* .
     *
     * Only specify `EC2` if you must clear a value that was previously set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-healthchecktype)
     * @param healthCheckType A comma-separated value string of one or more health check types. 
     */
    override fun healthCheckType(healthCheckType: String) {
      cdkBuilder.healthCheckType(healthCheckType)
    }

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
     * @param instanceId The ID of the instance used to base the launch configuration on. 
     */
    override fun instanceId(instanceId: String) {
      cdkBuilder.instanceId(instanceId)
    }

    /**
     * An instance maintenance policy.
     *
     * For more information, see [Set instance maintenance
     * policy](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-instance-maintenance-policy.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-instancemaintenancepolicy)
     * @param instanceMaintenancePolicy An instance maintenance policy. 
     */
    override fun instanceMaintenancePolicy(instanceMaintenancePolicy: IResolvable) {
      cdkBuilder.instanceMaintenancePolicy(instanceMaintenancePolicy.let(IResolvable::unwrap))
    }

    /**
     * An instance maintenance policy.
     *
     * For more information, see [Set instance maintenance
     * policy](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-instance-maintenance-policy.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-instancemaintenancepolicy)
     * @param instanceMaintenancePolicy An instance maintenance policy. 
     */
    override
        fun instanceMaintenancePolicy(instanceMaintenancePolicy: InstanceMaintenancePolicyProperty) {
      cdkBuilder.instanceMaintenancePolicy(instanceMaintenancePolicy.let(InstanceMaintenancePolicyProperty::unwrap))
    }

    /**
     * An instance maintenance policy.
     *
     * For more information, see [Set instance maintenance
     * policy](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-instance-maintenance-policy.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-instancemaintenancepolicy)
     * @param instanceMaintenancePolicy An instance maintenance policy. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1b31a935f878d6378f68b18f226cb9517d4642a7e37455a7770205f6bb21c964")
    override
        fun instanceMaintenancePolicy(instanceMaintenancePolicy: InstanceMaintenancePolicyProperty.Builder.() -> Unit):
        Unit =
        instanceMaintenancePolicy(InstanceMaintenancePolicyProperty(instanceMaintenancePolicy))

    /**
     * The name of the launch configuration to use to launch instances.
     *
     * Required only if you don't specify `LaunchTemplate` , `MixedInstancesPolicy` , or
     * `InstanceId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-launchconfigurationname)
     * @param launchConfigurationName The name of the launch configuration to use to launch
     * instances. 
     */
    override fun launchConfigurationName(launchConfigurationName: String) {
      cdkBuilder.launchConfigurationName(launchConfigurationName)
    }

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
     * @param launchTemplate Information used to specify the launch template and version to use to
     * launch instances. 
     */
    override fun launchTemplate(launchTemplate: IResolvable) {
      cdkBuilder.launchTemplate(launchTemplate.let(IResolvable::unwrap))
    }

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
     * @param launchTemplate Information used to specify the launch template and version to use to
     * launch instances. 
     */
    override fun launchTemplate(launchTemplate: LaunchTemplateSpecificationProperty) {
      cdkBuilder.launchTemplate(launchTemplate.let(LaunchTemplateSpecificationProperty::unwrap))
    }

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
     * @param launchTemplate Information used to specify the launch template and version to use to
     * launch instances. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4400d81b41005748e36414987dda265ab35efce6e88dfd5d285d0fd08dab830f")
    override
        fun launchTemplate(launchTemplate: LaunchTemplateSpecificationProperty.Builder.() -> Unit):
        Unit = launchTemplate(LaunchTemplateSpecificationProperty(launchTemplate))

    /**
     * One or more lifecycle hooks to add to the Auto Scaling group before instances are launched.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecificationlist)
     * @param lifecycleHookSpecificationList One or more lifecycle hooks to add to the Auto Scaling
     * group before instances are launched. 
     */
    override fun lifecycleHookSpecificationList(lifecycleHookSpecificationList: IResolvable) {
      cdkBuilder.lifecycleHookSpecificationList(lifecycleHookSpecificationList.let(IResolvable::unwrap))
    }

    /**
     * One or more lifecycle hooks to add to the Auto Scaling group before instances are launched.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecificationlist)
     * @param lifecycleHookSpecificationList One or more lifecycle hooks to add to the Auto Scaling
     * group before instances are launched. 
     */
    override fun lifecycleHookSpecificationList(lifecycleHookSpecificationList: List<Any>) {
      cdkBuilder.lifecycleHookSpecificationList(lifecycleHookSpecificationList)
    }

    /**
     * One or more lifecycle hooks to add to the Auto Scaling group before instances are launched.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecificationlist)
     * @param lifecycleHookSpecificationList One or more lifecycle hooks to add to the Auto Scaling
     * group before instances are launched. 
     */
    override fun lifecycleHookSpecificationList(vararg lifecycleHookSpecificationList: Any): Unit =
        lifecycleHookSpecificationList(lifecycleHookSpecificationList.toList())

    /**
     * A list of Classic Load Balancers associated with this Auto Scaling group.
     *
     * For Application Load Balancers, Network Load Balancers, and Gateway Load Balancers, specify
     * the `TargetGroupARNs` property instead.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-loadbalancernames)
     * @param loadBalancerNames A list of Classic Load Balancers associated with this Auto Scaling
     * group. 
     */
    override fun loadBalancerNames(loadBalancerNames: List<String>) {
      cdkBuilder.loadBalancerNames(loadBalancerNames)
    }

    /**
     * A list of Classic Load Balancers associated with this Auto Scaling group.
     *
     * For Application Load Balancers, Network Load Balancers, and Gateway Load Balancers, specify
     * the `TargetGroupARNs` property instead.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-loadbalancernames)
     * @param loadBalancerNames A list of Classic Load Balancers associated with this Auto Scaling
     * group. 
     */
    override fun loadBalancerNames(vararg loadBalancerNames: String): Unit =
        loadBalancerNames(loadBalancerNames.toList())

    /**
     * The maximum amount of time, in seconds, that an instance can be in service.
     *
     * The default is null. If specified, the value must be either 0 or a number equal to or greater
     * than 86,400 seconds (1 day). For more information, see [Replacing Auto Scaling instances based
     * on maximum instance
     * lifetime](https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-max-instance-lifetime.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-maxinstancelifetime)
     * @param maxInstanceLifetime The maximum amount of time, in seconds, that an instance can be in
     * service. 
     */
    override fun maxInstanceLifetime(maxInstanceLifetime: Number) {
      cdkBuilder.maxInstanceLifetime(maxInstanceLifetime)
    }

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
     * @param maxSize The maximum size of the group. 
     */
    override fun maxSize(maxSize: String) {
      cdkBuilder.maxSize(maxSize)
    }

    /**
     * Enables the monitoring of group metrics of an Auto Scaling group.
     *
     * By default, these metrics are disabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-metricscollection)
     * @param metricsCollection Enables the monitoring of group metrics of an Auto Scaling group. 
     */
    override fun metricsCollection(metricsCollection: IResolvable) {
      cdkBuilder.metricsCollection(metricsCollection.let(IResolvable::unwrap))
    }

    /**
     * Enables the monitoring of group metrics of an Auto Scaling group.
     *
     * By default, these metrics are disabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-metricscollection)
     * @param metricsCollection Enables the monitoring of group metrics of an Auto Scaling group. 
     */
    override fun metricsCollection(metricsCollection: List<Any>) {
      cdkBuilder.metricsCollection(metricsCollection)
    }

    /**
     * Enables the monitoring of group metrics of an Auto Scaling group.
     *
     * By default, these metrics are disabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-metricscollection)
     * @param metricsCollection Enables the monitoring of group metrics of an Auto Scaling group. 
     */
    override fun metricsCollection(vararg metricsCollection: Any): Unit =
        metricsCollection(metricsCollection.toList())

    /**
     * The minimum size of the group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-minsize)
     * @param minSize The minimum size of the group. 
     */
    override fun minSize(minSize: String) {
      cdkBuilder.minSize(minSize)
    }

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
     * @param mixedInstancesPolicy An embedded object that specifies a mixed instances policy. 
     */
    override fun mixedInstancesPolicy(mixedInstancesPolicy: IResolvable) {
      cdkBuilder.mixedInstancesPolicy(mixedInstancesPolicy.let(IResolvable::unwrap))
    }

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
     * @param mixedInstancesPolicy An embedded object that specifies a mixed instances policy. 
     */
    override fun mixedInstancesPolicy(mixedInstancesPolicy: MixedInstancesPolicyProperty) {
      cdkBuilder.mixedInstancesPolicy(mixedInstancesPolicy.let(MixedInstancesPolicyProperty::unwrap))
    }

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
     * @param mixedInstancesPolicy An embedded object that specifies a mixed instances policy. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("225b9b144c2f54944bd28485b6bb3492a765f1d00ca05604123531373cae2a81")
    override
        fun mixedInstancesPolicy(mixedInstancesPolicy: MixedInstancesPolicyProperty.Builder.() -> Unit):
        Unit = mixedInstancesPolicy(MixedInstancesPolicyProperty(mixedInstancesPolicy))

    /**
     * Indicates whether newly launched instances are protected from termination by Amazon EC2 Auto
     * Scaling when scaling in.
     *
     * For more information about preventing instances from terminating on scale in, see [Using
     * instance scale-in
     * protection](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-instance-protection.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-newinstancesprotectedfromscalein)
     * @param newInstancesProtectedFromScaleIn Indicates whether newly launched instances are
     * protected from termination by Amazon EC2 Auto Scaling when scaling in. 
     */
    override fun newInstancesProtectedFromScaleIn(newInstancesProtectedFromScaleIn: Boolean) {
      cdkBuilder.newInstancesProtectedFromScaleIn(newInstancesProtectedFromScaleIn)
    }

    /**
     * Indicates whether newly launched instances are protected from termination by Amazon EC2 Auto
     * Scaling when scaling in.
     *
     * For more information about preventing instances from terminating on scale in, see [Using
     * instance scale-in
     * protection](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-instance-protection.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-newinstancesprotectedfromscalein)
     * @param newInstancesProtectedFromScaleIn Indicates whether newly launched instances are
     * protected from termination by Amazon EC2 Auto Scaling when scaling in. 
     */
    override fun newInstancesProtectedFromScaleIn(newInstancesProtectedFromScaleIn: IResolvable) {
      cdkBuilder.newInstancesProtectedFromScaleIn(newInstancesProtectedFromScaleIn.let(IResolvable::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-notificationconfiguration)
     * @deprecated this property has been deprecated
     * @param notificationConfiguration 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun notificationConfiguration(notificationConfiguration: IResolvable) {
      cdkBuilder.notificationConfiguration(notificationConfiguration.let(IResolvable::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-notificationconfiguration)
     * @deprecated this property has been deprecated
     * @param notificationConfiguration 
     */
    @Deprecated(message = "deprecated in CDK")
    override
        fun notificationConfiguration(notificationConfiguration: NotificationConfigurationProperty) {
      cdkBuilder.notificationConfiguration(notificationConfiguration.let(NotificationConfigurationProperty::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-notificationconfiguration)
     * @deprecated this property has been deprecated
     * @param notificationConfiguration 
     */
    @Deprecated(message = "deprecated in CDK")
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8a4b1af8972202b84a7387964643523d0d39173add845a86f803ad0c280243a9")
    override
        fun notificationConfiguration(notificationConfiguration: NotificationConfigurationProperty.Builder.() -> Unit):
        Unit =
        notificationConfiguration(NotificationConfigurationProperty(notificationConfiguration))

    /**
     * Configures an Auto Scaling group to send notifications when specified events take place.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-notificationconfigurations)
     * @param notificationConfigurations Configures an Auto Scaling group to send notifications when
     * specified events take place. 
     */
    override fun notificationConfigurations(notificationConfigurations: IResolvable) {
      cdkBuilder.notificationConfigurations(notificationConfigurations.let(IResolvable::unwrap))
    }

    /**
     * Configures an Auto Scaling group to send notifications when specified events take place.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-notificationconfigurations)
     * @param notificationConfigurations Configures an Auto Scaling group to send notifications when
     * specified events take place. 
     */
    override fun notificationConfigurations(notificationConfigurations: List<Any>) {
      cdkBuilder.notificationConfigurations(notificationConfigurations)
    }

    /**
     * Configures an Auto Scaling group to send notifications when specified events take place.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-notificationconfigurations)
     * @param notificationConfigurations Configures an Auto Scaling group to send notifications when
     * specified events take place. 
     */
    override fun notificationConfigurations(vararg notificationConfigurations: Any): Unit =
        notificationConfigurations(notificationConfigurations.toList())

    /**
     * The name of the placement group into which to launch your instances.
     *
     * For more information, see [Placement
     * groups](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html) in the
     * *Amazon EC2 User Guide for Linux Instances* .
     *
     *
     * A *cluster* placement group is a logical grouping of instances within a single Availability
     * Zone. You cannot specify multiple Availability Zones and a cluster placement group.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-placementgroup)
     * @param placementGroup The name of the placement group into which to launch your instances. 
     */
    override fun placementGroup(placementGroup: String) {
      cdkBuilder.placementGroup(placementGroup)
    }

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
     * @param serviceLinkedRoleArn The Amazon Resource Name (ARN) of the service-linked role that
     * the Auto Scaling group uses to call other AWS service on your behalf. 
     */
    override fun serviceLinkedRoleArn(serviceLinkedRoleArn: String) {
      cdkBuilder.serviceLinkedRoleArn(serviceLinkedRoleArn)
    }

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
     * @param tags One or more tags. 
     */
    override fun tags(tags: List<TagPropertyProperty>) {
      cdkBuilder.tags(tags.map(TagPropertyProperty::unwrap))
    }

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
     * @param tags One or more tags. 
     */
    override fun tags(vararg tags: TagPropertyProperty): Unit = tags(tags.toList())

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
     * @param targetGroupArns The Amazon Resource Names (ARN) of the Elastic Load Balancing target
     * groups to associate with the Auto Scaling group. 
     */
    override fun targetGroupArns(targetGroupArns: List<String>) {
      cdkBuilder.targetGroupArns(targetGroupArns)
    }

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
     * @param targetGroupArns The Amazon Resource Names (ARN) of the Elastic Load Balancing target
     * groups to associate with the Auto Scaling group. 
     */
    override fun targetGroupArns(vararg targetGroupArns: String): Unit =
        targetGroupArns(targetGroupArns.toList())

    /**
     * A policy or a list of policies that are used to select the instance to terminate.
     *
     * These policies are executed in the order that you list them. For more information, see [Work
     * with Amazon EC2 Auto Scaling termination
     * policies](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-termination-policies.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * Valid values: `Default` | `AllocationStrategy` | `ClosestToNextInstanceHour` |
     * `NewestInstance` | `OldestInstance` | `OldestLaunchConfiguration` | `OldestLaunchTemplate` |
     * `arn:aws:lambda:region:account-id:function:my-function:my-alias`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-terminationpolicies)
     * @param terminationPolicies A policy or a list of policies that are used to select the
     * instance to terminate. 
     */
    override fun terminationPolicies(terminationPolicies: List<String>) {
      cdkBuilder.terminationPolicies(terminationPolicies)
    }

    /**
     * A policy or a list of policies that are used to select the instance to terminate.
     *
     * These policies are executed in the order that you list them. For more information, see [Work
     * with Amazon EC2 Auto Scaling termination
     * policies](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-termination-policies.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * Valid values: `Default` | `AllocationStrategy` | `ClosestToNextInstanceHour` |
     * `NewestInstance` | `OldestInstance` | `OldestLaunchConfiguration` | `OldestLaunchTemplate` |
     * `arn:aws:lambda:region:account-id:function:my-function:my-alias`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-terminationpolicies)
     * @param terminationPolicies A policy or a list of policies that are used to select the
     * instance to terminate. 
     */
    override fun terminationPolicies(vararg terminationPolicies: String): Unit =
        terminationPolicies(terminationPolicies.toList())

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
     * @param vpcZoneIdentifier A list of subnet IDs for a virtual private cloud (VPC) where
     * instances in the Auto Scaling group can be created. 
     */
    override fun vpcZoneIdentifier(vpcZoneIdentifier: List<String>) {
      cdkBuilder.vpcZoneIdentifier(vpcZoneIdentifier)
    }

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
     * @param vpcZoneIdentifier A list of subnet IDs for a virtual private cloud (VPC) where
     * instances in the Auto Scaling group can be created. 
     */
    override fun vpcZoneIdentifier(vararg vpcZoneIdentifier: String): Unit =
        vpcZoneIdentifier(vpcZoneIdentifier.toList())

    public fun build(): software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAutoScalingGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAutoScalingGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup):
        CfnAutoScalingGroup = CfnAutoScalingGroup(cdkObject)

    internal fun unwrap(wrapped: CfnAutoScalingGroup):
        software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup = wrapped.cdkObject
  }

  public interface MemoryMiBRequestProperty {
    /**
     * The memory maximum in MiB.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-memorymibrequest.html#cfn-autoscaling-autoscalinggroup-memorymibrequest-max)
     */
    public fun max(): Number? = unwrap(this).getMax()

    /**
     * The memory minimum in MiB.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-memorymibrequest.html#cfn-autoscaling-autoscalinggroup-memorymibrequest-min)
     */
    public fun min(): Number? = unwrap(this).getMin()

    /**
     * A builder for [MemoryMiBRequestProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param max The memory maximum in MiB.
       */
      public fun max(max: Number)

      /**
       * @param min The memory minimum in MiB.
       */
      public fun min(min: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.MemoryMiBRequestProperty.Builder
          =
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.MemoryMiBRequestProperty.builder()

      /**
       * @param max The memory maximum in MiB.
       */
      override fun max(max: Number) {
        cdkBuilder.max(max)
      }

      /**
       * @param min The memory minimum in MiB.
       */
      override fun min(min: Number) {
        cdkBuilder.min(min)
      }

      public fun build():
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.MemoryMiBRequestProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.MemoryMiBRequestProperty,
    ) : CdkObject(cdkObject), MemoryMiBRequestProperty {
      /**
       * The memory maximum in MiB.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-memorymibrequest.html#cfn-autoscaling-autoscalinggroup-memorymibrequest-max)
       */
      override fun max(): Number? = unwrap(this).getMax()

      /**
       * The memory minimum in MiB.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-memorymibrequest.html#cfn-autoscaling-autoscalinggroup-memorymibrequest-min)
       */
      override fun min(): Number? = unwrap(this).getMin()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MemoryMiBRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.MemoryMiBRequestProperty):
          MemoryMiBRequestProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MemoryMiBRequestProperty):
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.MemoryMiBRequestProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.MemoryMiBRequestProperty
    }
  }

  public interface TotalLocalStorageGBRequestProperty {
    /**
     * The storage maximum in GB.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-totallocalstoragegbrequest.html#cfn-autoscaling-autoscalinggroup-totallocalstoragegbrequest-max)
     */
    public fun max(): Number? = unwrap(this).getMax()

    /**
     * The storage minimum in GB.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-totallocalstoragegbrequest.html#cfn-autoscaling-autoscalinggroup-totallocalstoragegbrequest-min)
     */
    public fun min(): Number? = unwrap(this).getMin()

    /**
     * A builder for [TotalLocalStorageGBRequestProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param max The storage maximum in GB.
       */
      public fun max(max: Number)

      /**
       * @param min The storage minimum in GB.
       */
      public fun min(min: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.TotalLocalStorageGBRequestProperty.Builder
          =
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.TotalLocalStorageGBRequestProperty.builder()

      /**
       * @param max The storage maximum in GB.
       */
      override fun max(max: Number) {
        cdkBuilder.max(max)
      }

      /**
       * @param min The storage minimum in GB.
       */
      override fun min(min: Number) {
        cdkBuilder.min(min)
      }

      public fun build():
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.TotalLocalStorageGBRequestProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.TotalLocalStorageGBRequestProperty,
    ) : CdkObject(cdkObject), TotalLocalStorageGBRequestProperty {
      /**
       * The storage maximum in GB.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-totallocalstoragegbrequest.html#cfn-autoscaling-autoscalinggroup-totallocalstoragegbrequest-max)
       */
      override fun max(): Number? = unwrap(this).getMax()

      /**
       * The storage minimum in GB.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-totallocalstoragegbrequest.html#cfn-autoscaling-autoscalinggroup-totallocalstoragegbrequest-min)
       */
      override fun min(): Number? = unwrap(this).getMin()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          TotalLocalStorageGBRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.TotalLocalStorageGBRequestProperty):
          TotalLocalStorageGBRequestProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TotalLocalStorageGBRequestProperty):
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.TotalLocalStorageGBRequestProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.TotalLocalStorageGBRequestProperty
    }
  }

  public interface LaunchTemplateSpecificationProperty {
    /**
     * The ID of the launch template.
     *
     * You must specify the `LaunchTemplateID` or the `LaunchTemplateName` , but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplatespecification.html#cfn-autoscaling-autoscalinggroup-launchtemplatespecification-launchtemplateid)
     */
    public fun launchTemplateId(): String? = unwrap(this).getLaunchTemplateId()

    /**
     * The name of the launch template.
     *
     * You must specify the `LaunchTemplateName` or the `LaunchTemplateID` , but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplatespecification.html#cfn-autoscaling-autoscalinggroup-launchtemplatespecification-launchtemplatename)
     */
    public fun launchTemplateName(): String? = unwrap(this).getLaunchTemplateName()

    /**
     * The version number of the launch template.
     *
     * Specifying `$Latest` or `$Default` for the template version number is not supported. However,
     * you can specify `LatestVersionNumber` or `DefaultVersionNumber` using the `Fn::GetAtt` intrinsic
     * function. For more information, see
     * [Fn::GetAtt](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-getatt.html)
     * .
     *
     *
     * For an example of using the `Fn::GetAtt` function, see the
     * [Examples](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#aws-resource-autoscaling-autoscalinggroup--examples)
     * section of the `AWS::AutoScaling::AutoScalingGroup` resource.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplatespecification.html#cfn-autoscaling-autoscalinggroup-launchtemplatespecification-version)
     */
    public fun version(): String

    /**
     * A builder for [LaunchTemplateSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param launchTemplateId The ID of the launch template.
       * You must specify the `LaunchTemplateID` or the `LaunchTemplateName` , but not both.
       */
      public fun launchTemplateId(launchTemplateId: String)

      /**
       * @param launchTemplateName The name of the launch template.
       * You must specify the `LaunchTemplateName` or the `LaunchTemplateID` , but not both.
       */
      public fun launchTemplateName(launchTemplateName: String)

      /**
       * @param version The version number of the launch template. 
       * Specifying `$Latest` or `$Default` for the template version number is not supported.
       * However, you can specify `LatestVersionNumber` or `DefaultVersionNumber` using the
       * `Fn::GetAtt` intrinsic function. For more information, see
       * [Fn::GetAtt](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-getatt.html)
       * .
       *
       *
       * For an example of using the `Fn::GetAtt` function, see the
       * [Examples](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#aws-resource-autoscaling-autoscalinggroup--examples)
       * section of the `AWS::AutoScaling::AutoScalingGroup` resource.
       */
      public fun version(version: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LaunchTemplateSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LaunchTemplateSpecificationProperty.builder()

      /**
       * @param launchTemplateId The ID of the launch template.
       * You must specify the `LaunchTemplateID` or the `LaunchTemplateName` , but not both.
       */
      override fun launchTemplateId(launchTemplateId: String) {
        cdkBuilder.launchTemplateId(launchTemplateId)
      }

      /**
       * @param launchTemplateName The name of the launch template.
       * You must specify the `LaunchTemplateName` or the `LaunchTemplateID` , but not both.
       */
      override fun launchTemplateName(launchTemplateName: String) {
        cdkBuilder.launchTemplateName(launchTemplateName)
      }

      /**
       * @param version The version number of the launch template. 
       * Specifying `$Latest` or `$Default` for the template version number is not supported.
       * However, you can specify `LatestVersionNumber` or `DefaultVersionNumber` using the
       * `Fn::GetAtt` intrinsic function. For more information, see
       * [Fn::GetAtt](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-getatt.html)
       * .
       *
       *
       * For an example of using the `Fn::GetAtt` function, see the
       * [Examples](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#aws-resource-autoscaling-autoscalinggroup--examples)
       * section of the `AWS::AutoScaling::AutoScalingGroup` resource.
       */
      override fun version(version: String) {
        cdkBuilder.version(version)
      }

      public fun build():
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LaunchTemplateSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LaunchTemplateSpecificationProperty,
    ) : CdkObject(cdkObject), LaunchTemplateSpecificationProperty {
      /**
       * The ID of the launch template.
       *
       * You must specify the `LaunchTemplateID` or the `LaunchTemplateName` , but not both.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplatespecification.html#cfn-autoscaling-autoscalinggroup-launchtemplatespecification-launchtemplateid)
       */
      override fun launchTemplateId(): String? = unwrap(this).getLaunchTemplateId()

      /**
       * The name of the launch template.
       *
       * You must specify the `LaunchTemplateName` or the `LaunchTemplateID` , but not both.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplatespecification.html#cfn-autoscaling-autoscalinggroup-launchtemplatespecification-launchtemplatename)
       */
      override fun launchTemplateName(): String? = unwrap(this).getLaunchTemplateName()

      /**
       * The version number of the launch template.
       *
       * Specifying `$Latest` or `$Default` for the template version number is not supported.
       * However, you can specify `LatestVersionNumber` or `DefaultVersionNumber` using the
       * `Fn::GetAtt` intrinsic function. For more information, see
       * [Fn::GetAtt](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-getatt.html)
       * .
       *
       *
       * For an example of using the `Fn::GetAtt` function, see the
       * [Examples](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#aws-resource-autoscaling-autoscalinggroup--examples)
       * section of the `AWS::AutoScaling::AutoScalingGroup` resource.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplatespecification.html#cfn-autoscaling-autoscalinggroup-launchtemplatespecification-version)
       */
      override fun version(): String = unwrap(this).getVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          LaunchTemplateSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LaunchTemplateSpecificationProperty):
          LaunchTemplateSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LaunchTemplateSpecificationProperty):
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LaunchTemplateSpecificationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LaunchTemplateSpecificationProperty
    }
  }

  public interface NetworkInterfaceCountRequestProperty {
    /**
     * The maximum number of network interfaces.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-networkinterfacecountrequest.html#cfn-autoscaling-autoscalinggroup-networkinterfacecountrequest-max)
     */
    public fun max(): Number? = unwrap(this).getMax()

    /**
     * The minimum number of network interfaces.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-networkinterfacecountrequest.html#cfn-autoscaling-autoscalinggroup-networkinterfacecountrequest-min)
     */
    public fun min(): Number? = unwrap(this).getMin()

    /**
     * A builder for [NetworkInterfaceCountRequestProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param max The maximum number of network interfaces.
       */
      public fun max(max: Number)

      /**
       * @param min The minimum number of network interfaces.
       */
      public fun min(min: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.NetworkInterfaceCountRequestProperty.Builder
          =
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.NetworkInterfaceCountRequestProperty.builder()

      /**
       * @param max The maximum number of network interfaces.
       */
      override fun max(max: Number) {
        cdkBuilder.max(max)
      }

      /**
       * @param min The minimum number of network interfaces.
       */
      override fun min(min: Number) {
        cdkBuilder.min(min)
      }

      public fun build():
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.NetworkInterfaceCountRequestProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.NetworkInterfaceCountRequestProperty,
    ) : CdkObject(cdkObject), NetworkInterfaceCountRequestProperty {
      /**
       * The maximum number of network interfaces.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-networkinterfacecountrequest.html#cfn-autoscaling-autoscalinggroup-networkinterfacecountrequest-max)
       */
      override fun max(): Number? = unwrap(this).getMax()

      /**
       * The minimum number of network interfaces.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-networkinterfacecountrequest.html#cfn-autoscaling-autoscalinggroup-networkinterfacecountrequest-min)
       */
      override fun min(): Number? = unwrap(this).getMin()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          NetworkInterfaceCountRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.NetworkInterfaceCountRequestProperty):
          NetworkInterfaceCountRequestProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NetworkInterfaceCountRequestProperty):
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.NetworkInterfaceCountRequestProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.NetworkInterfaceCountRequestProperty
    }
  }

  public interface TagPropertyProperty {
    /**
     * The tag key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-tagproperty.html#cfn-autoscaling-autoscalinggroup-tagproperty-key)
     */
    public fun key(): String

    /**
     * Set to `true` if you want CloudFormation to copy the tag to EC2 instances that are launched
     * as part of the Auto Scaling group.
     *
     * Set to `false` if you want the tag attached only to the Auto Scaling group and not copied to
     * any instances launched as part of the Auto Scaling group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-tagproperty.html#cfn-autoscaling-autoscalinggroup-tagproperty-propagateatlaunch)
     */
    public fun propagateAtLaunch(): Any

    /**
     * The tag value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-tagproperty.html#cfn-autoscaling-autoscalinggroup-tagproperty-value)
     */
    public fun `value`(): String

    /**
     * A builder for [TagPropertyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key The tag key. 
       */
      public fun key(key: String)

      /**
       * @param propagateAtLaunch Set to `true` if you want CloudFormation to copy the tag to EC2
       * instances that are launched as part of the Auto Scaling group. 
       * Set to `false` if you want the tag attached only to the Auto Scaling group and not copied
       * to any instances launched as part of the Auto Scaling group.
       */
      public fun propagateAtLaunch(propagateAtLaunch: Boolean)

      /**
       * @param propagateAtLaunch Set to `true` if you want CloudFormation to copy the tag to EC2
       * instances that are launched as part of the Auto Scaling group. 
       * Set to `false` if you want the tag attached only to the Auto Scaling group and not copied
       * to any instances launched as part of the Auto Scaling group.
       */
      public fun propagateAtLaunch(propagateAtLaunch: IResolvable)

      /**
       * @param value The tag value. 
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.TagPropertyProperty.Builder
          =
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.TagPropertyProperty.builder()

      /**
       * @param key The tag key. 
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param propagateAtLaunch Set to `true` if you want CloudFormation to copy the tag to EC2
       * instances that are launched as part of the Auto Scaling group. 
       * Set to `false` if you want the tag attached only to the Auto Scaling group and not copied
       * to any instances launched as part of the Auto Scaling group.
       */
      override fun propagateAtLaunch(propagateAtLaunch: Boolean) {
        cdkBuilder.propagateAtLaunch(propagateAtLaunch)
      }

      /**
       * @param propagateAtLaunch Set to `true` if you want CloudFormation to copy the tag to EC2
       * instances that are launched as part of the Auto Scaling group. 
       * Set to `false` if you want the tag attached only to the Auto Scaling group and not copied
       * to any instances launched as part of the Auto Scaling group.
       */
      override fun propagateAtLaunch(propagateAtLaunch: IResolvable) {
        cdkBuilder.propagateAtLaunch(propagateAtLaunch.let(IResolvable::unwrap))
      }

      /**
       * @param value The tag value. 
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.TagPropertyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.TagPropertyProperty,
    ) : CdkObject(cdkObject), TagPropertyProperty {
      /**
       * The tag key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-tagproperty.html#cfn-autoscaling-autoscalinggroup-tagproperty-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * Set to `true` if you want CloudFormation to copy the tag to EC2 instances that are launched
       * as part of the Auto Scaling group.
       *
       * Set to `false` if you want the tag attached only to the Auto Scaling group and not copied
       * to any instances launched as part of the Auto Scaling group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-tagproperty.html#cfn-autoscaling-autoscalinggroup-tagproperty-propagateatlaunch)
       */
      override fun propagateAtLaunch(): Any = unwrap(this).getPropagateAtLaunch()

      /**
       * The tag value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-tagproperty.html#cfn-autoscaling-autoscalinggroup-tagproperty-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TagPropertyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.TagPropertyProperty):
          TagPropertyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TagPropertyProperty):
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.TagPropertyProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.TagPropertyProperty
    }
  }

  public interface NetworkBandwidthGbpsRequestProperty {
    /**
     * The maximum amount of network bandwidth, in gigabits per second (Gbps).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-networkbandwidthgbpsrequest.html#cfn-autoscaling-autoscalinggroup-networkbandwidthgbpsrequest-max)
     */
    public fun max(): Number? = unwrap(this).getMax()

    /**
     * The minimum amount of network bandwidth, in gigabits per second (Gbps).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-networkbandwidthgbpsrequest.html#cfn-autoscaling-autoscalinggroup-networkbandwidthgbpsrequest-min)
     */
    public fun min(): Number? = unwrap(this).getMin()

    /**
     * A builder for [NetworkBandwidthGbpsRequestProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param max The maximum amount of network bandwidth, in gigabits per second (Gbps).
       */
      public fun max(max: Number)

      /**
       * @param min The minimum amount of network bandwidth, in gigabits per second (Gbps).
       */
      public fun min(min: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.NetworkBandwidthGbpsRequestProperty.Builder
          =
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.NetworkBandwidthGbpsRequestProperty.builder()

      /**
       * @param max The maximum amount of network bandwidth, in gigabits per second (Gbps).
       */
      override fun max(max: Number) {
        cdkBuilder.max(max)
      }

      /**
       * @param min The minimum amount of network bandwidth, in gigabits per second (Gbps).
       */
      override fun min(min: Number) {
        cdkBuilder.min(min)
      }

      public fun build():
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.NetworkBandwidthGbpsRequestProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.NetworkBandwidthGbpsRequestProperty,
    ) : CdkObject(cdkObject), NetworkBandwidthGbpsRequestProperty {
      /**
       * The maximum amount of network bandwidth, in gigabits per second (Gbps).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-networkbandwidthgbpsrequest.html#cfn-autoscaling-autoscalinggroup-networkbandwidthgbpsrequest-max)
       */
      override fun max(): Number? = unwrap(this).getMax()

      /**
       * The minimum amount of network bandwidth, in gigabits per second (Gbps).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-networkbandwidthgbpsrequest.html#cfn-autoscaling-autoscalinggroup-networkbandwidthgbpsrequest-min)
       */
      override fun min(): Number? = unwrap(this).getMin()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          NetworkBandwidthGbpsRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.NetworkBandwidthGbpsRequestProperty):
          NetworkBandwidthGbpsRequestProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NetworkBandwidthGbpsRequestProperty):
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.NetworkBandwidthGbpsRequestProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.NetworkBandwidthGbpsRequestProperty
    }
  }

  public interface VCpuCountRequestProperty {
    /**
     * The maximum number of vCPUs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-vcpucountrequest.html#cfn-autoscaling-autoscalinggroup-vcpucountrequest-max)
     */
    public fun max(): Number? = unwrap(this).getMax()

    /**
     * The minimum number of vCPUs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-vcpucountrequest.html#cfn-autoscaling-autoscalinggroup-vcpucountrequest-min)
     */
    public fun min(): Number? = unwrap(this).getMin()

    /**
     * A builder for [VCpuCountRequestProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param max The maximum number of vCPUs.
       */
      public fun max(max: Number)

      /**
       * @param min The minimum number of vCPUs.
       */
      public fun min(min: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.VCpuCountRequestProperty.Builder
          =
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.VCpuCountRequestProperty.builder()

      /**
       * @param max The maximum number of vCPUs.
       */
      override fun max(max: Number) {
        cdkBuilder.max(max)
      }

      /**
       * @param min The minimum number of vCPUs.
       */
      override fun min(min: Number) {
        cdkBuilder.min(min)
      }

      public fun build():
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.VCpuCountRequestProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.VCpuCountRequestProperty,
    ) : CdkObject(cdkObject), VCpuCountRequestProperty {
      /**
       * The maximum number of vCPUs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-vcpucountrequest.html#cfn-autoscaling-autoscalinggroup-vcpucountrequest-max)
       */
      override fun max(): Number? = unwrap(this).getMax()

      /**
       * The minimum number of vCPUs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-vcpucountrequest.html#cfn-autoscaling-autoscalinggroup-vcpucountrequest-min)
       */
      override fun min(): Number? = unwrap(this).getMin()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VCpuCountRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.VCpuCountRequestProperty):
          VCpuCountRequestProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VCpuCountRequestProperty):
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.VCpuCountRequestProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.VCpuCountRequestProperty
    }
  }

  public interface AcceleratorCountRequestProperty {
    /**
     * The maximum value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-acceleratorcountrequest.html#cfn-autoscaling-autoscalinggroup-acceleratorcountrequest-max)
     */
    public fun max(): Number? = unwrap(this).getMax()

    /**
     * The minimum value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-acceleratorcountrequest.html#cfn-autoscaling-autoscalinggroup-acceleratorcountrequest-min)
     */
    public fun min(): Number? = unwrap(this).getMin()

    /**
     * A builder for [AcceleratorCountRequestProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param max The maximum value.
       */
      public fun max(max: Number)

      /**
       * @param min The minimum value.
       */
      public fun min(min: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.AcceleratorCountRequestProperty.Builder
          =
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.AcceleratorCountRequestProperty.builder()

      /**
       * @param max The maximum value.
       */
      override fun max(max: Number) {
        cdkBuilder.max(max)
      }

      /**
       * @param min The minimum value.
       */
      override fun min(min: Number) {
        cdkBuilder.min(min)
      }

      public fun build():
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.AcceleratorCountRequestProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.AcceleratorCountRequestProperty,
    ) : CdkObject(cdkObject), AcceleratorCountRequestProperty {
      /**
       * The maximum value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-acceleratorcountrequest.html#cfn-autoscaling-autoscalinggroup-acceleratorcountrequest-max)
       */
      override fun max(): Number? = unwrap(this).getMax()

      /**
       * The minimum value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-acceleratorcountrequest.html#cfn-autoscaling-autoscalinggroup-acceleratorcountrequest-min)
       */
      override fun min(): Number? = unwrap(this).getMin()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AcceleratorCountRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.AcceleratorCountRequestProperty):
          AcceleratorCountRequestProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AcceleratorCountRequestProperty):
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.AcceleratorCountRequestProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.AcceleratorCountRequestProperty
    }
  }

  public interface MemoryGiBPerVCpuRequestProperty {
    /**
     * The memory maximum in GiB.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-memorygibpervcpurequest.html#cfn-autoscaling-autoscalinggroup-memorygibpervcpurequest-max)
     */
    public fun max(): Number? = unwrap(this).getMax()

    /**
     * The memory minimum in GiB.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-memorygibpervcpurequest.html#cfn-autoscaling-autoscalinggroup-memorygibpervcpurequest-min)
     */
    public fun min(): Number? = unwrap(this).getMin()

    /**
     * A builder for [MemoryGiBPerVCpuRequestProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param max The memory maximum in GiB.
       */
      public fun max(max: Number)

      /**
       * @param min The memory minimum in GiB.
       */
      public fun min(min: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.MemoryGiBPerVCpuRequestProperty.Builder
          =
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.MemoryGiBPerVCpuRequestProperty.builder()

      /**
       * @param max The memory maximum in GiB.
       */
      override fun max(max: Number) {
        cdkBuilder.max(max)
      }

      /**
       * @param min The memory minimum in GiB.
       */
      override fun min(min: Number) {
        cdkBuilder.min(min)
      }

      public fun build():
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.MemoryGiBPerVCpuRequestProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.MemoryGiBPerVCpuRequestProperty,
    ) : CdkObject(cdkObject), MemoryGiBPerVCpuRequestProperty {
      /**
       * The memory maximum in GiB.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-memorygibpervcpurequest.html#cfn-autoscaling-autoscalinggroup-memorygibpervcpurequest-max)
       */
      override fun max(): Number? = unwrap(this).getMax()

      /**
       * The memory minimum in GiB.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-memorygibpervcpurequest.html#cfn-autoscaling-autoscalinggroup-memorygibpervcpurequest-min)
       */
      override fun min(): Number? = unwrap(this).getMin()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MemoryGiBPerVCpuRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.MemoryGiBPerVCpuRequestProperty):
          MemoryGiBPerVCpuRequestProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MemoryGiBPerVCpuRequestProperty):
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.MemoryGiBPerVCpuRequestProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.MemoryGiBPerVCpuRequestProperty
    }
  }

  public interface LaunchTemplateOverridesProperty {
    /**
     * The instance requirements.
     *
     * Amazon EC2 Auto Scaling uses your specified requirements to identify instance types. Then, it
     * uses your On-Demand and Spot allocation strategies to launch instances from these instance
     * types.
     *
     * You can specify up to four separate sets of instance requirements per Auto Scaling group.
     * This is useful for provisioning instances from different Amazon Machine Images (AMIs) in the
     * same Auto Scaling group. To do this, create the AMIs and create a new launch template for each
     * AMI. Then, create a compatible set of instance requirements for each launch template.
     *
     *
     * If you specify `InstanceRequirements` , you can't specify `InstanceType` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplateoverrides.html#cfn-autoscaling-autoscalinggroup-launchtemplateoverrides-instancerequirements)
     */
    public fun instanceRequirements(): Any? = unwrap(this).getInstanceRequirements()

    /**
     * The instance type, such as `m3.xlarge` . You must specify an instance type that is supported
     * in your requested Region and Availability Zones. For more information, see [Instance
     * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html) in the *Amazon
     * Elastic Compute Cloud User Guide* .
     *
     * You can specify up to 40 instance types per Auto Scaling group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplateoverrides.html#cfn-autoscaling-autoscalinggroup-launchtemplateoverrides-instancetype)
     */
    public fun instanceType(): String? = unwrap(this).getInstanceType()

    /**
     * Provides a launch template for the specified instance type or set of instance requirements.
     *
     * For example, some instance types might require a launch template with a different AMI. If not
     * provided, Amazon EC2 Auto Scaling uses the launch template that's specified in the
     * `LaunchTemplate` definition. For more information, see [Specifying a different launch template
     * for an instance
     * type](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-mixed-instances-groups-launch-template-overrides.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * You can specify up to 20 launch templates per Auto Scaling group. The launch templates
     * specified in the overrides and in the `LaunchTemplate` definition count towards this limit.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplateoverrides.html#cfn-autoscaling-autoscalinggroup-launchtemplateoverrides-launchtemplatespecification)
     */
    public fun launchTemplateSpecification(): Any? = unwrap(this).getLaunchTemplateSpecification()

    /**
     * If you provide a list of instance types to use, you can specify the number of capacity units
     * provided by each instance type in terms of virtual CPUs, memory, storage, throughput, or other
     * relative performance characteristic.
     *
     * When a Spot or On-Demand Instance is launched, the capacity units count toward the desired
     * capacity. Amazon EC2 Auto Scaling launches instances until the desired capacity is totally
     * fulfilled, even if this results in an overage. For example, if there are two units remaining to
     * fulfill capacity, and Amazon EC2 Auto Scaling can only launch an instance with a
     * `WeightedCapacity` of five units, the instance is launched, and the desired capacity is exceeded
     * by three units. For more information, see [Configure instance weighting for Amazon EC2 Auto
     * Scaling](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-mixed-instances-groups-instance-weighting.html)
     * in the *Amazon EC2 Auto Scaling User Guide* . Value must be in the range of 1-999.
     *
     * If you specify a value for `WeightedCapacity` for one instance type, you must specify a value
     * for `WeightedCapacity` for all of them.
     *
     *
     * Every Auto Scaling group has three size parameters ( `DesiredCapacity` , `MaxSize` , and
     * `MinSize` ). Usually, you set these sizes based on a specific number of instances. However, if
     * you configure a mixed instances policy that defines weights for the instance types, you must
     * specify these sizes with the same units that you use for weighting instances.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplateoverrides.html#cfn-autoscaling-autoscalinggroup-launchtemplateoverrides-weightedcapacity)
     */
    public fun weightedCapacity(): String? = unwrap(this).getWeightedCapacity()

    /**
     * A builder for [LaunchTemplateOverridesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param instanceRequirements The instance requirements.
       * Amazon EC2 Auto Scaling uses your specified requirements to identify instance types. Then,
       * it uses your On-Demand and Spot allocation strategies to launch instances from these instance
       * types.
       *
       * You can specify up to four separate sets of instance requirements per Auto Scaling group.
       * This is useful for provisioning instances from different Amazon Machine Images (AMIs) in the
       * same Auto Scaling group. To do this, create the AMIs and create a new launch template for each
       * AMI. Then, create a compatible set of instance requirements for each launch template.
       *
       *
       * If you specify `InstanceRequirements` , you can't specify `InstanceType` .
       */
      public fun instanceRequirements(instanceRequirements: IResolvable)

      /**
       * @param instanceRequirements The instance requirements.
       * Amazon EC2 Auto Scaling uses your specified requirements to identify instance types. Then,
       * it uses your On-Demand and Spot allocation strategies to launch instances from these instance
       * types.
       *
       * You can specify up to four separate sets of instance requirements per Auto Scaling group.
       * This is useful for provisioning instances from different Amazon Machine Images (AMIs) in the
       * same Auto Scaling group. To do this, create the AMIs and create a new launch template for each
       * AMI. Then, create a compatible set of instance requirements for each launch template.
       *
       *
       * If you specify `InstanceRequirements` , you can't specify `InstanceType` .
       */
      public fun instanceRequirements(instanceRequirements: InstanceRequirementsProperty)

      /**
       * @param instanceRequirements The instance requirements.
       * Amazon EC2 Auto Scaling uses your specified requirements to identify instance types. Then,
       * it uses your On-Demand and Spot allocation strategies to launch instances from these instance
       * types.
       *
       * You can specify up to four separate sets of instance requirements per Auto Scaling group.
       * This is useful for provisioning instances from different Amazon Machine Images (AMIs) in the
       * same Auto Scaling group. To do this, create the AMIs and create a new launch template for each
       * AMI. Then, create a compatible set of instance requirements for each launch template.
       *
       *
       * If you specify `InstanceRequirements` , you can't specify `InstanceType` .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("94f4ea0c74ec4495738121b8d42fa540ee0b3090a922cc85121645d3598842f2")
      public
          fun instanceRequirements(instanceRequirements: InstanceRequirementsProperty.Builder.() -> Unit)

      /**
       * @param instanceType The instance type, such as `m3.xlarge` . You must specify an instance
       * type that is supported in your requested Region and Availability Zones. For more information,
       * see [Instance types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html)
       * in the *Amazon Elastic Compute Cloud User Guide* .
       * You can specify up to 40 instance types per Auto Scaling group.
       */
      public fun instanceType(instanceType: String)

      /**
       * @param launchTemplateSpecification Provides a launch template for the specified instance
       * type or set of instance requirements.
       * For example, some instance types might require a launch template with a different AMI. If
       * not provided, Amazon EC2 Auto Scaling uses the launch template that's specified in the
       * `LaunchTemplate` definition. For more information, see [Specifying a different launch template
       * for an instance
       * type](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-mixed-instances-groups-launch-template-overrides.html)
       * in the *Amazon EC2 Auto Scaling User Guide* .
       *
       * You can specify up to 20 launch templates per Auto Scaling group. The launch templates
       * specified in the overrides and in the `LaunchTemplate` definition count towards this limit.
       */
      public fun launchTemplateSpecification(launchTemplateSpecification: IResolvable)

      /**
       * @param launchTemplateSpecification Provides a launch template for the specified instance
       * type or set of instance requirements.
       * For example, some instance types might require a launch template with a different AMI. If
       * not provided, Amazon EC2 Auto Scaling uses the launch template that's specified in the
       * `LaunchTemplate` definition. For more information, see [Specifying a different launch template
       * for an instance
       * type](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-mixed-instances-groups-launch-template-overrides.html)
       * in the *Amazon EC2 Auto Scaling User Guide* .
       *
       * You can specify up to 20 launch templates per Auto Scaling group. The launch templates
       * specified in the overrides and in the `LaunchTemplate` definition count towards this limit.
       */
      public
          fun launchTemplateSpecification(launchTemplateSpecification: LaunchTemplateSpecificationProperty)

      /**
       * @param launchTemplateSpecification Provides a launch template for the specified instance
       * type or set of instance requirements.
       * For example, some instance types might require a launch template with a different AMI. If
       * not provided, Amazon EC2 Auto Scaling uses the launch template that's specified in the
       * `LaunchTemplate` definition. For more information, see [Specifying a different launch template
       * for an instance
       * type](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-mixed-instances-groups-launch-template-overrides.html)
       * in the *Amazon EC2 Auto Scaling User Guide* .
       *
       * You can specify up to 20 launch templates per Auto Scaling group. The launch templates
       * specified in the overrides and in the `LaunchTemplate` definition count towards this limit.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bfadd002dc80530ce8daf12a2dd7485c3550a7438eb96f083b1fd2313b9aa4a2")
      public
          fun launchTemplateSpecification(launchTemplateSpecification: LaunchTemplateSpecificationProperty.Builder.() -> Unit)

      /**
       * @param weightedCapacity If you provide a list of instance types to use, you can specify the
       * number of capacity units provided by each instance type in terms of virtual CPUs, memory,
       * storage, throughput, or other relative performance characteristic.
       * When a Spot or On-Demand Instance is launched, the capacity units count toward the desired
       * capacity. Amazon EC2 Auto Scaling launches instances until the desired capacity is totally
       * fulfilled, even if this results in an overage. For example, if there are two units remaining
       * to fulfill capacity, and Amazon EC2 Auto Scaling can only launch an instance with a
       * `WeightedCapacity` of five units, the instance is launched, and the desired capacity is
       * exceeded by three units. For more information, see [Configure instance weighting for Amazon
       * EC2 Auto
       * Scaling](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-mixed-instances-groups-instance-weighting.html)
       * in the *Amazon EC2 Auto Scaling User Guide* . Value must be in the range of 1-999.
       *
       * If you specify a value for `WeightedCapacity` for one instance type, you must specify a
       * value for `WeightedCapacity` for all of them.
       *
       *
       * Every Auto Scaling group has three size parameters ( `DesiredCapacity` , `MaxSize` , and
       * `MinSize` ). Usually, you set these sizes based on a specific number of instances. However, if
       * you configure a mixed instances policy that defines weights for the instance types, you must
       * specify these sizes with the same units that you use for weighting instances.
       */
      public fun weightedCapacity(weightedCapacity: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LaunchTemplateOverridesProperty.Builder
          =
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LaunchTemplateOverridesProperty.builder()

      /**
       * @param instanceRequirements The instance requirements.
       * Amazon EC2 Auto Scaling uses your specified requirements to identify instance types. Then,
       * it uses your On-Demand and Spot allocation strategies to launch instances from these instance
       * types.
       *
       * You can specify up to four separate sets of instance requirements per Auto Scaling group.
       * This is useful for provisioning instances from different Amazon Machine Images (AMIs) in the
       * same Auto Scaling group. To do this, create the AMIs and create a new launch template for each
       * AMI. Then, create a compatible set of instance requirements for each launch template.
       *
       *
       * If you specify `InstanceRequirements` , you can't specify `InstanceType` .
       */
      override fun instanceRequirements(instanceRequirements: IResolvable) {
        cdkBuilder.instanceRequirements(instanceRequirements.let(IResolvable::unwrap))
      }

      /**
       * @param instanceRequirements The instance requirements.
       * Amazon EC2 Auto Scaling uses your specified requirements to identify instance types. Then,
       * it uses your On-Demand and Spot allocation strategies to launch instances from these instance
       * types.
       *
       * You can specify up to four separate sets of instance requirements per Auto Scaling group.
       * This is useful for provisioning instances from different Amazon Machine Images (AMIs) in the
       * same Auto Scaling group. To do this, create the AMIs and create a new launch template for each
       * AMI. Then, create a compatible set of instance requirements for each launch template.
       *
       *
       * If you specify `InstanceRequirements` , you can't specify `InstanceType` .
       */
      override fun instanceRequirements(instanceRequirements: InstanceRequirementsProperty) {
        cdkBuilder.instanceRequirements(instanceRequirements.let(InstanceRequirementsProperty::unwrap))
      }

      /**
       * @param instanceRequirements The instance requirements.
       * Amazon EC2 Auto Scaling uses your specified requirements to identify instance types. Then,
       * it uses your On-Demand and Spot allocation strategies to launch instances from these instance
       * types.
       *
       * You can specify up to four separate sets of instance requirements per Auto Scaling group.
       * This is useful for provisioning instances from different Amazon Machine Images (AMIs) in the
       * same Auto Scaling group. To do this, create the AMIs and create a new launch template for each
       * AMI. Then, create a compatible set of instance requirements for each launch template.
       *
       *
       * If you specify `InstanceRequirements` , you can't specify `InstanceType` .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("94f4ea0c74ec4495738121b8d42fa540ee0b3090a922cc85121645d3598842f2")
      override
          fun instanceRequirements(instanceRequirements: InstanceRequirementsProperty.Builder.() -> Unit):
          Unit = instanceRequirements(InstanceRequirementsProperty(instanceRequirements))

      /**
       * @param instanceType The instance type, such as `m3.xlarge` . You must specify an instance
       * type that is supported in your requested Region and Availability Zones. For more information,
       * see [Instance types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html)
       * in the *Amazon Elastic Compute Cloud User Guide* .
       * You can specify up to 40 instance types per Auto Scaling group.
       */
      override fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
      }

      /**
       * @param launchTemplateSpecification Provides a launch template for the specified instance
       * type or set of instance requirements.
       * For example, some instance types might require a launch template with a different AMI. If
       * not provided, Amazon EC2 Auto Scaling uses the launch template that's specified in the
       * `LaunchTemplate` definition. For more information, see [Specifying a different launch template
       * for an instance
       * type](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-mixed-instances-groups-launch-template-overrides.html)
       * in the *Amazon EC2 Auto Scaling User Guide* .
       *
       * You can specify up to 20 launch templates per Auto Scaling group. The launch templates
       * specified in the overrides and in the `LaunchTemplate` definition count towards this limit.
       */
      override fun launchTemplateSpecification(launchTemplateSpecification: IResolvable) {
        cdkBuilder.launchTemplateSpecification(launchTemplateSpecification.let(IResolvable::unwrap))
      }

      /**
       * @param launchTemplateSpecification Provides a launch template for the specified instance
       * type or set of instance requirements.
       * For example, some instance types might require a launch template with a different AMI. If
       * not provided, Amazon EC2 Auto Scaling uses the launch template that's specified in the
       * `LaunchTemplate` definition. For more information, see [Specifying a different launch template
       * for an instance
       * type](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-mixed-instances-groups-launch-template-overrides.html)
       * in the *Amazon EC2 Auto Scaling User Guide* .
       *
       * You can specify up to 20 launch templates per Auto Scaling group. The launch templates
       * specified in the overrides and in the `LaunchTemplate` definition count towards this limit.
       */
      override
          fun launchTemplateSpecification(launchTemplateSpecification: LaunchTemplateSpecificationProperty) {
        cdkBuilder.launchTemplateSpecification(launchTemplateSpecification.let(LaunchTemplateSpecificationProperty::unwrap))
      }

      /**
       * @param launchTemplateSpecification Provides a launch template for the specified instance
       * type or set of instance requirements.
       * For example, some instance types might require a launch template with a different AMI. If
       * not provided, Amazon EC2 Auto Scaling uses the launch template that's specified in the
       * `LaunchTemplate` definition. For more information, see [Specifying a different launch template
       * for an instance
       * type](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-mixed-instances-groups-launch-template-overrides.html)
       * in the *Amazon EC2 Auto Scaling User Guide* .
       *
       * You can specify up to 20 launch templates per Auto Scaling group. The launch templates
       * specified in the overrides and in the `LaunchTemplate` definition count towards this limit.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bfadd002dc80530ce8daf12a2dd7485c3550a7438eb96f083b1fd2313b9aa4a2")
      override
          fun launchTemplateSpecification(launchTemplateSpecification: LaunchTemplateSpecificationProperty.Builder.() -> Unit):
          Unit =
          launchTemplateSpecification(LaunchTemplateSpecificationProperty(launchTemplateSpecification))

      /**
       * @param weightedCapacity If you provide a list of instance types to use, you can specify the
       * number of capacity units provided by each instance type in terms of virtual CPUs, memory,
       * storage, throughput, or other relative performance characteristic.
       * When a Spot or On-Demand Instance is launched, the capacity units count toward the desired
       * capacity. Amazon EC2 Auto Scaling launches instances until the desired capacity is totally
       * fulfilled, even if this results in an overage. For example, if there are two units remaining
       * to fulfill capacity, and Amazon EC2 Auto Scaling can only launch an instance with a
       * `WeightedCapacity` of five units, the instance is launched, and the desired capacity is
       * exceeded by three units. For more information, see [Configure instance weighting for Amazon
       * EC2 Auto
       * Scaling](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-mixed-instances-groups-instance-weighting.html)
       * in the *Amazon EC2 Auto Scaling User Guide* . Value must be in the range of 1-999.
       *
       * If you specify a value for `WeightedCapacity` for one instance type, you must specify a
       * value for `WeightedCapacity` for all of them.
       *
       *
       * Every Auto Scaling group has three size parameters ( `DesiredCapacity` , `MaxSize` , and
       * `MinSize` ). Usually, you set these sizes based on a specific number of instances. However, if
       * you configure a mixed instances policy that defines weights for the instance types, you must
       * specify these sizes with the same units that you use for weighting instances.
       */
      override fun weightedCapacity(weightedCapacity: String) {
        cdkBuilder.weightedCapacity(weightedCapacity)
      }

      public fun build():
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LaunchTemplateOverridesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LaunchTemplateOverridesProperty,
    ) : CdkObject(cdkObject), LaunchTemplateOverridesProperty {
      /**
       * The instance requirements.
       *
       * Amazon EC2 Auto Scaling uses your specified requirements to identify instance types. Then,
       * it uses your On-Demand and Spot allocation strategies to launch instances from these instance
       * types.
       *
       * You can specify up to four separate sets of instance requirements per Auto Scaling group.
       * This is useful for provisioning instances from different Amazon Machine Images (AMIs) in the
       * same Auto Scaling group. To do this, create the AMIs and create a new launch template for each
       * AMI. Then, create a compatible set of instance requirements for each launch template.
       *
       *
       * If you specify `InstanceRequirements` , you can't specify `InstanceType` .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplateoverrides.html#cfn-autoscaling-autoscalinggroup-launchtemplateoverrides-instancerequirements)
       */
      override fun instanceRequirements(): Any? = unwrap(this).getInstanceRequirements()

      /**
       * The instance type, such as `m3.xlarge` . You must specify an instance type that is
       * supported in your requested Region and Availability Zones. For more information, see [Instance
       * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html) in the *Amazon
       * Elastic Compute Cloud User Guide* .
       *
       * You can specify up to 40 instance types per Auto Scaling group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplateoverrides.html#cfn-autoscaling-autoscalinggroup-launchtemplateoverrides-instancetype)
       */
      override fun instanceType(): String? = unwrap(this).getInstanceType()

      /**
       * Provides a launch template for the specified instance type or set of instance requirements.
       *
       * For example, some instance types might require a launch template with a different AMI. If
       * not provided, Amazon EC2 Auto Scaling uses the launch template that's specified in the
       * `LaunchTemplate` definition. For more information, see [Specifying a different launch template
       * for an instance
       * type](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-mixed-instances-groups-launch-template-overrides.html)
       * in the *Amazon EC2 Auto Scaling User Guide* .
       *
       * You can specify up to 20 launch templates per Auto Scaling group. The launch templates
       * specified in the overrides and in the `LaunchTemplate` definition count towards this limit.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplateoverrides.html#cfn-autoscaling-autoscalinggroup-launchtemplateoverrides-launchtemplatespecification)
       */
      override fun launchTemplateSpecification(): Any? =
          unwrap(this).getLaunchTemplateSpecification()

      /**
       * If you provide a list of instance types to use, you can specify the number of capacity
       * units provided by each instance type in terms of virtual CPUs, memory, storage, throughput, or
       * other relative performance characteristic.
       *
       * When a Spot or On-Demand Instance is launched, the capacity units count toward the desired
       * capacity. Amazon EC2 Auto Scaling launches instances until the desired capacity is totally
       * fulfilled, even if this results in an overage. For example, if there are two units remaining
       * to fulfill capacity, and Amazon EC2 Auto Scaling can only launch an instance with a
       * `WeightedCapacity` of five units, the instance is launched, and the desired capacity is
       * exceeded by three units. For more information, see [Configure instance weighting for Amazon
       * EC2 Auto
       * Scaling](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-mixed-instances-groups-instance-weighting.html)
       * in the *Amazon EC2 Auto Scaling User Guide* . Value must be in the range of 1-999.
       *
       * If you specify a value for `WeightedCapacity` for one instance type, you must specify a
       * value for `WeightedCapacity` for all of them.
       *
       *
       * Every Auto Scaling group has three size parameters ( `DesiredCapacity` , `MaxSize` , and
       * `MinSize` ). Usually, you set these sizes based on a specific number of instances. However, if
       * you configure a mixed instances policy that defines weights for the instance types, you must
       * specify these sizes with the same units that you use for weighting instances.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplateoverrides.html#cfn-autoscaling-autoscalinggroup-launchtemplateoverrides-weightedcapacity)
       */
      override fun weightedCapacity(): String? = unwrap(this).getWeightedCapacity()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LaunchTemplateOverridesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LaunchTemplateOverridesProperty):
          LaunchTemplateOverridesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LaunchTemplateOverridesProperty):
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LaunchTemplateOverridesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LaunchTemplateOverridesProperty
    }
  }

  public interface InstancesDistributionProperty {
    /**
     * The allocation strategy to apply to your On-Demand Instances when they are launched.
     *
     * Possible instance types are determined by the launch template overrides that you specify.
     *
     * The following lists the valid values:
     *
     * * **lowest-price** - Uses price to determine which instance types are the highest priority,
     * launching the lowest priced instance types within an Availability Zone first. This is the
     * default value for Auto Scaling groups that specify `InstanceRequirements` .
     * * **prioritized** - You set the order of instance types for the launch template overrides
     * from highest to lowest priority (from first to last in the list). Amazon EC2 Auto Scaling
     * launches your highest priority instance types first. If all your On-Demand capacity cannot be
     * fulfilled using your highest priority instance type, then Amazon EC2 Auto Scaling launches the
     * remaining capacity using the second priority instance type, and so on. This is the default value
     * for Auto Scaling groups that don't specify `InstanceRequirements` and cannot be used for groups
     * that do.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-instancesdistribution.html#cfn-autoscaling-autoscalinggroup-instancesdistribution-ondemandallocationstrategy)
     */
    public fun onDemandAllocationStrategy(): String? = unwrap(this).getOnDemandAllocationStrategy()

    /**
     * The minimum amount of the Auto Scaling group's capacity that must be fulfilled by On-Demand
     * Instances.
     *
     * This base portion is launched first as your group scales.
     *
     * This number has the same unit of measurement as the group's desired capacity. If you change
     * the default unit of measurement (number of instances) by specifying weighted capacity values in
     * your launch template overrides list, or by changing the default desired capacity type setting of
     * the group, you must specify this number using the same unit of measurement.
     *
     * Default: 0
     *
     *
     * An update to this setting means a gradual replacement of instances to adjust the current
     * On-Demand Instance levels. When replacing instances, Amazon EC2 Auto Scaling launches new
     * instances before terminating the previous ones.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-instancesdistribution.html#cfn-autoscaling-autoscalinggroup-instancesdistribution-ondemandbasecapacity)
     */
    public fun onDemandBaseCapacity(): Number? = unwrap(this).getOnDemandBaseCapacity()

    /**
     * Controls the percentages of On-Demand Instances and Spot Instances for your additional
     * capacity beyond `OnDemandBaseCapacity` .
     *
     * Expressed as a number (for example, 20 specifies 20% On-Demand Instances, 80% Spot
     * Instances). If set to 100, only On-Demand Instances are used.
     *
     * Default: 100
     *
     *
     * An update to this setting means a gradual replacement of instances to adjust the current
     * On-Demand and Spot Instance levels for your additional capacity higher than the base capacity.
     * When replacing instances, Amazon EC2 Auto Scaling launches new instances before terminating the
     * previous ones.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-instancesdistribution.html#cfn-autoscaling-autoscalinggroup-instancesdistribution-ondemandpercentageabovebasecapacity)
     */
    public fun onDemandPercentageAboveBaseCapacity(): Number? =
        unwrap(this).getOnDemandPercentageAboveBaseCapacity()

    /**
     * The allocation strategy to apply to your Spot Instances when they are launched.
     *
     * Possible instance types are determined by the launch template overrides that you specify.
     *
     * The following lists the valid values:
     *
     * * **capacity-optimized** - Requests Spot Instances using pools that are optimally chosen
     * based on the available Spot capacity. This strategy has the lowest risk of interruption. To give
     * certain instance types a higher chance of launching first, use `capacity-optimized-prioritized`
     * .
     * * **capacity-optimized-prioritized** - You set the order of instance types for the launch
     * template overrides from highest to lowest priority (from first to last in the list). Amazon EC2
     * Auto Scaling honors the instance type priorities on a best effort basis but optimizes for
     * capacity first. Note that if the On-Demand allocation strategy is set to `prioritized` , the
     * same priority is applied when fulfilling On-Demand capacity. This is not a valid value for Auto
     * Scaling groups that specify `InstanceRequirements` .
     * * **lowest-price** - Requests Spot Instances using the lowest priced pools within an
     * Availability Zone, across the number of Spot pools that you specify for the `SpotInstancePools`
     * property. To ensure that your desired capacity is met, you might receive Spot Instances from
     * several pools. This is the default value, but it might lead to high interruption rates because
     * this strategy only considers instance price and not available capacity.
     * * **price-capacity-optimized (recommended)** - The price and capacity optimized allocation
     * strategy looks at both price and capacity to select the Spot Instance pools that are the least
     * likely to be interrupted and have the lowest possible price.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-instancesdistribution.html#cfn-autoscaling-autoscalinggroup-instancesdistribution-spotallocationstrategy)
     */
    public fun spotAllocationStrategy(): String? = unwrap(this).getSpotAllocationStrategy()

    /**
     * The number of Spot Instance pools across which to allocate your Spot Instances.
     *
     * The Spot pools are determined from the different instance types in the overrides. Valid only
     * when the `SpotAllocationStrategy` is `lowest-price` . Value must be in the range of 1–20.
     *
     * Default: 2
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-instancesdistribution.html#cfn-autoscaling-autoscalinggroup-instancesdistribution-spotinstancepools)
     */
    public fun spotInstancePools(): Number? = unwrap(this).getSpotInstancePools()

    /**
     * The maximum price per unit hour that you are willing to pay for a Spot Instance.
     *
     * If your maximum price is lower than the Spot price for the instance types that you selected,
     * your Spot Instances are not launched. We do not recommend specifying a maximum price because it
     * can lead to increased interruptions. When Spot Instances launch, you pay the current Spot price.
     * To remove a maximum price that you previously set, include the property but specify an empty
     * string ("") for the value.
     *
     *
     * If you specify a maximum price, your instances will be interrupted more frequently than if
     * you do not specify one.
     *
     *
     * Valid Range: Minimum value of 0.001
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-instancesdistribution.html#cfn-autoscaling-autoscalinggroup-instancesdistribution-spotmaxprice)
     */
    public fun spotMaxPrice(): String? = unwrap(this).getSpotMaxPrice()

    /**
     * A builder for [InstancesDistributionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param onDemandAllocationStrategy The allocation strategy to apply to your On-Demand
       * Instances when they are launched.
       * Possible instance types are determined by the launch template overrides that you specify.
       *
       * The following lists the valid values:
       *
       * * **lowest-price** - Uses price to determine which instance types are the highest priority,
       * launching the lowest priced instance types within an Availability Zone first. This is the
       * default value for Auto Scaling groups that specify `InstanceRequirements` .
       * * **prioritized** - You set the order of instance types for the launch template overrides
       * from highest to lowest priority (from first to last in the list). Amazon EC2 Auto Scaling
       * launches your highest priority instance types first. If all your On-Demand capacity cannot be
       * fulfilled using your highest priority instance type, then Amazon EC2 Auto Scaling launches the
       * remaining capacity using the second priority instance type, and so on. This is the default
       * value for Auto Scaling groups that don't specify `InstanceRequirements` and cannot be used for
       * groups that do.
       */
      public fun onDemandAllocationStrategy(onDemandAllocationStrategy: String)

      /**
       * @param onDemandBaseCapacity The minimum amount of the Auto Scaling group's capacity that
       * must be fulfilled by On-Demand Instances.
       * This base portion is launched first as your group scales.
       *
       * This number has the same unit of measurement as the group's desired capacity. If you change
       * the default unit of measurement (number of instances) by specifying weighted capacity values
       * in your launch template overrides list, or by changing the default desired capacity type
       * setting of the group, you must specify this number using the same unit of measurement.
       *
       * Default: 0
       *
       *
       * An update to this setting means a gradual replacement of instances to adjust the current
       * On-Demand Instance levels. When replacing instances, Amazon EC2 Auto Scaling launches new
       * instances before terminating the previous ones.
       */
      public fun onDemandBaseCapacity(onDemandBaseCapacity: Number)

      /**
       * @param onDemandPercentageAboveBaseCapacity Controls the percentages of On-Demand Instances
       * and Spot Instances for your additional capacity beyond `OnDemandBaseCapacity` .
       * Expressed as a number (for example, 20 specifies 20% On-Demand Instances, 80% Spot
       * Instances). If set to 100, only On-Demand Instances are used.
       *
       * Default: 100
       *
       *
       * An update to this setting means a gradual replacement of instances to adjust the current
       * On-Demand and Spot Instance levels for your additional capacity higher than the base capacity.
       * When replacing instances, Amazon EC2 Auto Scaling launches new instances before terminating
       * the previous ones.
       */
      public fun onDemandPercentageAboveBaseCapacity(onDemandPercentageAboveBaseCapacity: Number)

      /**
       * @param spotAllocationStrategy The allocation strategy to apply to your Spot Instances when
       * they are launched.
       * Possible instance types are determined by the launch template overrides that you specify.
       *
       * The following lists the valid values:
       *
       * * **capacity-optimized** - Requests Spot Instances using pools that are optimally chosen
       * based on the available Spot capacity. This strategy has the lowest risk of interruption. To
       * give certain instance types a higher chance of launching first, use
       * `capacity-optimized-prioritized` .
       * * **capacity-optimized-prioritized** - You set the order of instance types for the launch
       * template overrides from highest to lowest priority (from first to last in the list). Amazon
       * EC2 Auto Scaling honors the instance type priorities on a best effort basis but optimizes for
       * capacity first. Note that if the On-Demand allocation strategy is set to `prioritized` , the
       * same priority is applied when fulfilling On-Demand capacity. This is not a valid value for
       * Auto Scaling groups that specify `InstanceRequirements` .
       * * **lowest-price** - Requests Spot Instances using the lowest priced pools within an
       * Availability Zone, across the number of Spot pools that you specify for the
       * `SpotInstancePools` property. To ensure that your desired capacity is met, you might receive
       * Spot Instances from several pools. This is the default value, but it might lead to high
       * interruption rates because this strategy only considers instance price and not available
       * capacity.
       * * **price-capacity-optimized (recommended)** - The price and capacity optimized allocation
       * strategy looks at both price and capacity to select the Spot Instance pools that are the least
       * likely to be interrupted and have the lowest possible price.
       */
      public fun spotAllocationStrategy(spotAllocationStrategy: String)

      /**
       * @param spotInstancePools The number of Spot Instance pools across which to allocate your
       * Spot Instances.
       * The Spot pools are determined from the different instance types in the overrides. Valid
       * only when the `SpotAllocationStrategy` is `lowest-price` . Value must be in the range of 1–20.
       *
       * Default: 2
       */
      public fun spotInstancePools(spotInstancePools: Number)

      /**
       * @param spotMaxPrice The maximum price per unit hour that you are willing to pay for a Spot
       * Instance.
       * If your maximum price is lower than the Spot price for the instance types that you
       * selected, your Spot Instances are not launched. We do not recommend specifying a maximum price
       * because it can lead to increased interruptions. When Spot Instances launch, you pay the
       * current Spot price. To remove a maximum price that you previously set, include the property
       * but specify an empty string ("") for the value.
       *
       *
       * If you specify a maximum price, your instances will be interrupted more frequently than if
       * you do not specify one.
       *
       *
       * Valid Range: Minimum value of 0.001
       */
      public fun spotMaxPrice(spotMaxPrice: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.InstancesDistributionProperty.Builder
          =
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.InstancesDistributionProperty.builder()

      /**
       * @param onDemandAllocationStrategy The allocation strategy to apply to your On-Demand
       * Instances when they are launched.
       * Possible instance types are determined by the launch template overrides that you specify.
       *
       * The following lists the valid values:
       *
       * * **lowest-price** - Uses price to determine which instance types are the highest priority,
       * launching the lowest priced instance types within an Availability Zone first. This is the
       * default value for Auto Scaling groups that specify `InstanceRequirements` .
       * * **prioritized** - You set the order of instance types for the launch template overrides
       * from highest to lowest priority (from first to last in the list). Amazon EC2 Auto Scaling
       * launches your highest priority instance types first. If all your On-Demand capacity cannot be
       * fulfilled using your highest priority instance type, then Amazon EC2 Auto Scaling launches the
       * remaining capacity using the second priority instance type, and so on. This is the default
       * value for Auto Scaling groups that don't specify `InstanceRequirements` and cannot be used for
       * groups that do.
       */
      override fun onDemandAllocationStrategy(onDemandAllocationStrategy: String) {
        cdkBuilder.onDemandAllocationStrategy(onDemandAllocationStrategy)
      }

      /**
       * @param onDemandBaseCapacity The minimum amount of the Auto Scaling group's capacity that
       * must be fulfilled by On-Demand Instances.
       * This base portion is launched first as your group scales.
       *
       * This number has the same unit of measurement as the group's desired capacity. If you change
       * the default unit of measurement (number of instances) by specifying weighted capacity values
       * in your launch template overrides list, or by changing the default desired capacity type
       * setting of the group, you must specify this number using the same unit of measurement.
       *
       * Default: 0
       *
       *
       * An update to this setting means a gradual replacement of instances to adjust the current
       * On-Demand Instance levels. When replacing instances, Amazon EC2 Auto Scaling launches new
       * instances before terminating the previous ones.
       */
      override fun onDemandBaseCapacity(onDemandBaseCapacity: Number) {
        cdkBuilder.onDemandBaseCapacity(onDemandBaseCapacity)
      }

      /**
       * @param onDemandPercentageAboveBaseCapacity Controls the percentages of On-Demand Instances
       * and Spot Instances for your additional capacity beyond `OnDemandBaseCapacity` .
       * Expressed as a number (for example, 20 specifies 20% On-Demand Instances, 80% Spot
       * Instances). If set to 100, only On-Demand Instances are used.
       *
       * Default: 100
       *
       *
       * An update to this setting means a gradual replacement of instances to adjust the current
       * On-Demand and Spot Instance levels for your additional capacity higher than the base capacity.
       * When replacing instances, Amazon EC2 Auto Scaling launches new instances before terminating
       * the previous ones.
       */
      override
          fun onDemandPercentageAboveBaseCapacity(onDemandPercentageAboveBaseCapacity: Number) {
        cdkBuilder.onDemandPercentageAboveBaseCapacity(onDemandPercentageAboveBaseCapacity)
      }

      /**
       * @param spotAllocationStrategy The allocation strategy to apply to your Spot Instances when
       * they are launched.
       * Possible instance types are determined by the launch template overrides that you specify.
       *
       * The following lists the valid values:
       *
       * * **capacity-optimized** - Requests Spot Instances using pools that are optimally chosen
       * based on the available Spot capacity. This strategy has the lowest risk of interruption. To
       * give certain instance types a higher chance of launching first, use
       * `capacity-optimized-prioritized` .
       * * **capacity-optimized-prioritized** - You set the order of instance types for the launch
       * template overrides from highest to lowest priority (from first to last in the list). Amazon
       * EC2 Auto Scaling honors the instance type priorities on a best effort basis but optimizes for
       * capacity first. Note that if the On-Demand allocation strategy is set to `prioritized` , the
       * same priority is applied when fulfilling On-Demand capacity. This is not a valid value for
       * Auto Scaling groups that specify `InstanceRequirements` .
       * * **lowest-price** - Requests Spot Instances using the lowest priced pools within an
       * Availability Zone, across the number of Spot pools that you specify for the
       * `SpotInstancePools` property. To ensure that your desired capacity is met, you might receive
       * Spot Instances from several pools. This is the default value, but it might lead to high
       * interruption rates because this strategy only considers instance price and not available
       * capacity.
       * * **price-capacity-optimized (recommended)** - The price and capacity optimized allocation
       * strategy looks at both price and capacity to select the Spot Instance pools that are the least
       * likely to be interrupted and have the lowest possible price.
       */
      override fun spotAllocationStrategy(spotAllocationStrategy: String) {
        cdkBuilder.spotAllocationStrategy(spotAllocationStrategy)
      }

      /**
       * @param spotInstancePools The number of Spot Instance pools across which to allocate your
       * Spot Instances.
       * The Spot pools are determined from the different instance types in the overrides. Valid
       * only when the `SpotAllocationStrategy` is `lowest-price` . Value must be in the range of 1–20.
       *
       * Default: 2
       */
      override fun spotInstancePools(spotInstancePools: Number) {
        cdkBuilder.spotInstancePools(spotInstancePools)
      }

      /**
       * @param spotMaxPrice The maximum price per unit hour that you are willing to pay for a Spot
       * Instance.
       * If your maximum price is lower than the Spot price for the instance types that you
       * selected, your Spot Instances are not launched. We do not recommend specifying a maximum price
       * because it can lead to increased interruptions. When Spot Instances launch, you pay the
       * current Spot price. To remove a maximum price that you previously set, include the property
       * but specify an empty string ("") for the value.
       *
       *
       * If you specify a maximum price, your instances will be interrupted more frequently than if
       * you do not specify one.
       *
       *
       * Valid Range: Minimum value of 0.001
       */
      override fun spotMaxPrice(spotMaxPrice: String) {
        cdkBuilder.spotMaxPrice(spotMaxPrice)
      }

      public fun build():
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.InstancesDistributionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.InstancesDistributionProperty,
    ) : CdkObject(cdkObject), InstancesDistributionProperty {
      /**
       * The allocation strategy to apply to your On-Demand Instances when they are launched.
       *
       * Possible instance types are determined by the launch template overrides that you specify.
       *
       * The following lists the valid values:
       *
       * * **lowest-price** - Uses price to determine which instance types are the highest priority,
       * launching the lowest priced instance types within an Availability Zone first. This is the
       * default value for Auto Scaling groups that specify `InstanceRequirements` .
       * * **prioritized** - You set the order of instance types for the launch template overrides
       * from highest to lowest priority (from first to last in the list). Amazon EC2 Auto Scaling
       * launches your highest priority instance types first. If all your On-Demand capacity cannot be
       * fulfilled using your highest priority instance type, then Amazon EC2 Auto Scaling launches the
       * remaining capacity using the second priority instance type, and so on. This is the default
       * value for Auto Scaling groups that don't specify `InstanceRequirements` and cannot be used for
       * groups that do.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-instancesdistribution.html#cfn-autoscaling-autoscalinggroup-instancesdistribution-ondemandallocationstrategy)
       */
      override fun onDemandAllocationStrategy(): String? =
          unwrap(this).getOnDemandAllocationStrategy()

      /**
       * The minimum amount of the Auto Scaling group's capacity that must be fulfilled by On-Demand
       * Instances.
       *
       * This base portion is launched first as your group scales.
       *
       * This number has the same unit of measurement as the group's desired capacity. If you change
       * the default unit of measurement (number of instances) by specifying weighted capacity values
       * in your launch template overrides list, or by changing the default desired capacity type
       * setting of the group, you must specify this number using the same unit of measurement.
       *
       * Default: 0
       *
       *
       * An update to this setting means a gradual replacement of instances to adjust the current
       * On-Demand Instance levels. When replacing instances, Amazon EC2 Auto Scaling launches new
       * instances before terminating the previous ones.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-instancesdistribution.html#cfn-autoscaling-autoscalinggroup-instancesdistribution-ondemandbasecapacity)
       */
      override fun onDemandBaseCapacity(): Number? = unwrap(this).getOnDemandBaseCapacity()

      /**
       * Controls the percentages of On-Demand Instances and Spot Instances for your additional
       * capacity beyond `OnDemandBaseCapacity` .
       *
       * Expressed as a number (for example, 20 specifies 20% On-Demand Instances, 80% Spot
       * Instances). If set to 100, only On-Demand Instances are used.
       *
       * Default: 100
       *
       *
       * An update to this setting means a gradual replacement of instances to adjust the current
       * On-Demand and Spot Instance levels for your additional capacity higher than the base capacity.
       * When replacing instances, Amazon EC2 Auto Scaling launches new instances before terminating
       * the previous ones.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-instancesdistribution.html#cfn-autoscaling-autoscalinggroup-instancesdistribution-ondemandpercentageabovebasecapacity)
       */
      override fun onDemandPercentageAboveBaseCapacity(): Number? =
          unwrap(this).getOnDemandPercentageAboveBaseCapacity()

      /**
       * The allocation strategy to apply to your Spot Instances when they are launched.
       *
       * Possible instance types are determined by the launch template overrides that you specify.
       *
       * The following lists the valid values:
       *
       * * **capacity-optimized** - Requests Spot Instances using pools that are optimally chosen
       * based on the available Spot capacity. This strategy has the lowest risk of interruption. To
       * give certain instance types a higher chance of launching first, use
       * `capacity-optimized-prioritized` .
       * * **capacity-optimized-prioritized** - You set the order of instance types for the launch
       * template overrides from highest to lowest priority (from first to last in the list). Amazon
       * EC2 Auto Scaling honors the instance type priorities on a best effort basis but optimizes for
       * capacity first. Note that if the On-Demand allocation strategy is set to `prioritized` , the
       * same priority is applied when fulfilling On-Demand capacity. This is not a valid value for
       * Auto Scaling groups that specify `InstanceRequirements` .
       * * **lowest-price** - Requests Spot Instances using the lowest priced pools within an
       * Availability Zone, across the number of Spot pools that you specify for the
       * `SpotInstancePools` property. To ensure that your desired capacity is met, you might receive
       * Spot Instances from several pools. This is the default value, but it might lead to high
       * interruption rates because this strategy only considers instance price and not available
       * capacity.
       * * **price-capacity-optimized (recommended)** - The price and capacity optimized allocation
       * strategy looks at both price and capacity to select the Spot Instance pools that are the least
       * likely to be interrupted and have the lowest possible price.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-instancesdistribution.html#cfn-autoscaling-autoscalinggroup-instancesdistribution-spotallocationstrategy)
       */
      override fun spotAllocationStrategy(): String? = unwrap(this).getSpotAllocationStrategy()

      /**
       * The number of Spot Instance pools across which to allocate your Spot Instances.
       *
       * The Spot pools are determined from the different instance types in the overrides. Valid
       * only when the `SpotAllocationStrategy` is `lowest-price` . Value must be in the range of 1–20.
       *
       * Default: 2
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-instancesdistribution.html#cfn-autoscaling-autoscalinggroup-instancesdistribution-spotinstancepools)
       */
      override fun spotInstancePools(): Number? = unwrap(this).getSpotInstancePools()

      /**
       * The maximum price per unit hour that you are willing to pay for a Spot Instance.
       *
       * If your maximum price is lower than the Spot price for the instance types that you
       * selected, your Spot Instances are not launched. We do not recommend specifying a maximum price
       * because it can lead to increased interruptions. When Spot Instances launch, you pay the
       * current Spot price. To remove a maximum price that you previously set, include the property
       * but specify an empty string ("") for the value.
       *
       *
       * If you specify a maximum price, your instances will be interrupted more frequently than if
       * you do not specify one.
       *
       *
       * Valid Range: Minimum value of 0.001
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-instancesdistribution.html#cfn-autoscaling-autoscalinggroup-instancesdistribution-spotmaxprice)
       */
      override fun spotMaxPrice(): String? = unwrap(this).getSpotMaxPrice()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InstancesDistributionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.InstancesDistributionProperty):
          InstancesDistributionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InstancesDistributionProperty):
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.InstancesDistributionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.InstancesDistributionProperty
    }
  }

  public interface NotificationConfigurationProperty {
    /**
     * A list of event types that send a notification. Event types can include any of the following
     * types.
     *
     * *Allowed values* :
     *
     * * `autoscaling:EC2_INSTANCE_LAUNCH`
     * * `autoscaling:EC2_INSTANCE_LAUNCH_ERROR`
     * * `autoscaling:EC2_INSTANCE_TERMINATE`
     * * `autoscaling:EC2_INSTANCE_TERMINATE_ERROR`
     * * `autoscaling:TEST_NOTIFICATION`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-notificationconfiguration.html#cfn-autoscaling-autoscalinggroup-notificationconfiguration-notificationtypes)
     */
    public fun notificationTypes(): List<String> = unwrap(this).getNotificationTypes() ?:
        emptyList()

    /**
     * The Amazon Resource Name (ARN) of the Amazon SNS topic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-notificationconfiguration.html#cfn-autoscaling-autoscalinggroup-notificationconfiguration-topicarn)
     */
    public fun topicArn(): String

    /**
     * A builder for [NotificationConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param notificationTypes A list of event types that send a notification. Event types can
       * include any of the following types.
       * *Allowed values* :
       *
       * * `autoscaling:EC2_INSTANCE_LAUNCH`
       * * `autoscaling:EC2_INSTANCE_LAUNCH_ERROR`
       * * `autoscaling:EC2_INSTANCE_TERMINATE`
       * * `autoscaling:EC2_INSTANCE_TERMINATE_ERROR`
       * * `autoscaling:TEST_NOTIFICATION`
       */
      public fun notificationTypes(notificationTypes: List<String>)

      /**
       * @param notificationTypes A list of event types that send a notification. Event types can
       * include any of the following types.
       * *Allowed values* :
       *
       * * `autoscaling:EC2_INSTANCE_LAUNCH`
       * * `autoscaling:EC2_INSTANCE_LAUNCH_ERROR`
       * * `autoscaling:EC2_INSTANCE_TERMINATE`
       * * `autoscaling:EC2_INSTANCE_TERMINATE_ERROR`
       * * `autoscaling:TEST_NOTIFICATION`
       */
      public fun notificationTypes(vararg notificationTypes: String)

      /**
       * @param topicArn The Amazon Resource Name (ARN) of the Amazon SNS topic. 
       */
      public fun topicArn(topicArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.NotificationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.NotificationConfigurationProperty.builder()

      /**
       * @param notificationTypes A list of event types that send a notification. Event types can
       * include any of the following types.
       * *Allowed values* :
       *
       * * `autoscaling:EC2_INSTANCE_LAUNCH`
       * * `autoscaling:EC2_INSTANCE_LAUNCH_ERROR`
       * * `autoscaling:EC2_INSTANCE_TERMINATE`
       * * `autoscaling:EC2_INSTANCE_TERMINATE_ERROR`
       * * `autoscaling:TEST_NOTIFICATION`
       */
      override fun notificationTypes(notificationTypes: List<String>) {
        cdkBuilder.notificationTypes(notificationTypes)
      }

      /**
       * @param notificationTypes A list of event types that send a notification. Event types can
       * include any of the following types.
       * *Allowed values* :
       *
       * * `autoscaling:EC2_INSTANCE_LAUNCH`
       * * `autoscaling:EC2_INSTANCE_LAUNCH_ERROR`
       * * `autoscaling:EC2_INSTANCE_TERMINATE`
       * * `autoscaling:EC2_INSTANCE_TERMINATE_ERROR`
       * * `autoscaling:TEST_NOTIFICATION`
       */
      override fun notificationTypes(vararg notificationTypes: String): Unit =
          notificationTypes(notificationTypes.toList())

      /**
       * @param topicArn The Amazon Resource Name (ARN) of the Amazon SNS topic. 
       */
      override fun topicArn(topicArn: String) {
        cdkBuilder.topicArn(topicArn)
      }

      public fun build():
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.NotificationConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.NotificationConfigurationProperty,
    ) : CdkObject(cdkObject), NotificationConfigurationProperty {
      /**
       * A list of event types that send a notification. Event types can include any of the
       * following types.
       *
       * *Allowed values* :
       *
       * * `autoscaling:EC2_INSTANCE_LAUNCH`
       * * `autoscaling:EC2_INSTANCE_LAUNCH_ERROR`
       * * `autoscaling:EC2_INSTANCE_TERMINATE`
       * * `autoscaling:EC2_INSTANCE_TERMINATE_ERROR`
       * * `autoscaling:TEST_NOTIFICATION`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-notificationconfiguration.html#cfn-autoscaling-autoscalinggroup-notificationconfiguration-notificationtypes)
       */
      override fun notificationTypes(): List<String> = unwrap(this).getNotificationTypes() ?:
          emptyList()

      /**
       * The Amazon Resource Name (ARN) of the Amazon SNS topic.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-notificationconfiguration.html#cfn-autoscaling-autoscalinggroup-notificationconfiguration-topicarn)
       */
      override fun topicArn(): String = unwrap(this).getTopicArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          NotificationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.NotificationConfigurationProperty):
          NotificationConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NotificationConfigurationProperty):
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.NotificationConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.NotificationConfigurationProperty
    }
  }

  public interface MetricsCollectionProperty {
    /**
     * The frequency at which Amazon EC2 Auto Scaling sends aggregated data to CloudWatch.
     *
     * The only valid value is `1Minute` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-metricscollection.html#cfn-autoscaling-autoscalinggroup-metricscollection-granularity)
     */
    public fun granularity(): String

    /**
     * Identifies the metrics to enable.
     *
     * You can specify one or more of the following metrics:
     *
     * * `GroupMinSize`
     * * `GroupMaxSize`
     * * `GroupDesiredCapacity`
     * * `GroupInServiceInstances`
     * * `GroupPendingInstances`
     * * `GroupStandbyInstances`
     * * `GroupTerminatingInstances`
     * * `GroupTotalInstances`
     * * `GroupInServiceCapacity`
     * * `GroupPendingCapacity`
     * * `GroupStandbyCapacity`
     * * `GroupTerminatingCapacity`
     * * `GroupTotalCapacity`
     * * `WarmPoolDesiredCapacity`
     * * `WarmPoolWarmedCapacity`
     * * `WarmPoolPendingCapacity`
     * * `WarmPoolTerminatingCapacity`
     * * `WarmPoolTotalCapacity`
     * * `GroupAndWarmPoolDesiredCapacity`
     * * `GroupAndWarmPoolTotalCapacity`
     *
     * If you specify `Granularity` and don't specify any metrics, all metrics are enabled.
     *
     * For more information, see [Auto Scaling group
     * metrics](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-cloudwatch-monitoring.html#as-group-metrics)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-metricscollection.html#cfn-autoscaling-autoscalinggroup-metricscollection-metrics)
     */
    public fun metrics(): List<String> = unwrap(this).getMetrics() ?: emptyList()

    /**
     * A builder for [MetricsCollectionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param granularity The frequency at which Amazon EC2 Auto Scaling sends aggregated data to
       * CloudWatch. 
       * The only valid value is `1Minute` .
       */
      public fun granularity(granularity: String)

      /**
       * @param metrics Identifies the metrics to enable.
       * You can specify one or more of the following metrics:
       *
       * * `GroupMinSize`
       * * `GroupMaxSize`
       * * `GroupDesiredCapacity`
       * * `GroupInServiceInstances`
       * * `GroupPendingInstances`
       * * `GroupStandbyInstances`
       * * `GroupTerminatingInstances`
       * * `GroupTotalInstances`
       * * `GroupInServiceCapacity`
       * * `GroupPendingCapacity`
       * * `GroupStandbyCapacity`
       * * `GroupTerminatingCapacity`
       * * `GroupTotalCapacity`
       * * `WarmPoolDesiredCapacity`
       * * `WarmPoolWarmedCapacity`
       * * `WarmPoolPendingCapacity`
       * * `WarmPoolTerminatingCapacity`
       * * `WarmPoolTotalCapacity`
       * * `GroupAndWarmPoolDesiredCapacity`
       * * `GroupAndWarmPoolTotalCapacity`
       *
       * If you specify `Granularity` and don't specify any metrics, all metrics are enabled.
       *
       * For more information, see [Auto Scaling group
       * metrics](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-cloudwatch-monitoring.html#as-group-metrics)
       * in the *Amazon EC2 Auto Scaling User Guide* .
       */
      public fun metrics(metrics: List<String>)

      /**
       * @param metrics Identifies the metrics to enable.
       * You can specify one or more of the following metrics:
       *
       * * `GroupMinSize`
       * * `GroupMaxSize`
       * * `GroupDesiredCapacity`
       * * `GroupInServiceInstances`
       * * `GroupPendingInstances`
       * * `GroupStandbyInstances`
       * * `GroupTerminatingInstances`
       * * `GroupTotalInstances`
       * * `GroupInServiceCapacity`
       * * `GroupPendingCapacity`
       * * `GroupStandbyCapacity`
       * * `GroupTerminatingCapacity`
       * * `GroupTotalCapacity`
       * * `WarmPoolDesiredCapacity`
       * * `WarmPoolWarmedCapacity`
       * * `WarmPoolPendingCapacity`
       * * `WarmPoolTerminatingCapacity`
       * * `WarmPoolTotalCapacity`
       * * `GroupAndWarmPoolDesiredCapacity`
       * * `GroupAndWarmPoolTotalCapacity`
       *
       * If you specify `Granularity` and don't specify any metrics, all metrics are enabled.
       *
       * For more information, see [Auto Scaling group
       * metrics](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-cloudwatch-monitoring.html#as-group-metrics)
       * in the *Amazon EC2 Auto Scaling User Guide* .
       */
      public fun metrics(vararg metrics: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.MetricsCollectionProperty.Builder
          =
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.MetricsCollectionProperty.builder()

      /**
       * @param granularity The frequency at which Amazon EC2 Auto Scaling sends aggregated data to
       * CloudWatch. 
       * The only valid value is `1Minute` .
       */
      override fun granularity(granularity: String) {
        cdkBuilder.granularity(granularity)
      }

      /**
       * @param metrics Identifies the metrics to enable.
       * You can specify one or more of the following metrics:
       *
       * * `GroupMinSize`
       * * `GroupMaxSize`
       * * `GroupDesiredCapacity`
       * * `GroupInServiceInstances`
       * * `GroupPendingInstances`
       * * `GroupStandbyInstances`
       * * `GroupTerminatingInstances`
       * * `GroupTotalInstances`
       * * `GroupInServiceCapacity`
       * * `GroupPendingCapacity`
       * * `GroupStandbyCapacity`
       * * `GroupTerminatingCapacity`
       * * `GroupTotalCapacity`
       * * `WarmPoolDesiredCapacity`
       * * `WarmPoolWarmedCapacity`
       * * `WarmPoolPendingCapacity`
       * * `WarmPoolTerminatingCapacity`
       * * `WarmPoolTotalCapacity`
       * * `GroupAndWarmPoolDesiredCapacity`
       * * `GroupAndWarmPoolTotalCapacity`
       *
       * If you specify `Granularity` and don't specify any metrics, all metrics are enabled.
       *
       * For more information, see [Auto Scaling group
       * metrics](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-cloudwatch-monitoring.html#as-group-metrics)
       * in the *Amazon EC2 Auto Scaling User Guide* .
       */
      override fun metrics(metrics: List<String>) {
        cdkBuilder.metrics(metrics)
      }

      /**
       * @param metrics Identifies the metrics to enable.
       * You can specify one or more of the following metrics:
       *
       * * `GroupMinSize`
       * * `GroupMaxSize`
       * * `GroupDesiredCapacity`
       * * `GroupInServiceInstances`
       * * `GroupPendingInstances`
       * * `GroupStandbyInstances`
       * * `GroupTerminatingInstances`
       * * `GroupTotalInstances`
       * * `GroupInServiceCapacity`
       * * `GroupPendingCapacity`
       * * `GroupStandbyCapacity`
       * * `GroupTerminatingCapacity`
       * * `GroupTotalCapacity`
       * * `WarmPoolDesiredCapacity`
       * * `WarmPoolWarmedCapacity`
       * * `WarmPoolPendingCapacity`
       * * `WarmPoolTerminatingCapacity`
       * * `WarmPoolTotalCapacity`
       * * `GroupAndWarmPoolDesiredCapacity`
       * * `GroupAndWarmPoolTotalCapacity`
       *
       * If you specify `Granularity` and don't specify any metrics, all metrics are enabled.
       *
       * For more information, see [Auto Scaling group
       * metrics](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-cloudwatch-monitoring.html#as-group-metrics)
       * in the *Amazon EC2 Auto Scaling User Guide* .
       */
      override fun metrics(vararg metrics: String): Unit = metrics(metrics.toList())

      public fun build():
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.MetricsCollectionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.MetricsCollectionProperty,
    ) : CdkObject(cdkObject), MetricsCollectionProperty {
      /**
       * The frequency at which Amazon EC2 Auto Scaling sends aggregated data to CloudWatch.
       *
       * The only valid value is `1Minute` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-metricscollection.html#cfn-autoscaling-autoscalinggroup-metricscollection-granularity)
       */
      override fun granularity(): String = unwrap(this).getGranularity()

      /**
       * Identifies the metrics to enable.
       *
       * You can specify one or more of the following metrics:
       *
       * * `GroupMinSize`
       * * `GroupMaxSize`
       * * `GroupDesiredCapacity`
       * * `GroupInServiceInstances`
       * * `GroupPendingInstances`
       * * `GroupStandbyInstances`
       * * `GroupTerminatingInstances`
       * * `GroupTotalInstances`
       * * `GroupInServiceCapacity`
       * * `GroupPendingCapacity`
       * * `GroupStandbyCapacity`
       * * `GroupTerminatingCapacity`
       * * `GroupTotalCapacity`
       * * `WarmPoolDesiredCapacity`
       * * `WarmPoolWarmedCapacity`
       * * `WarmPoolPendingCapacity`
       * * `WarmPoolTerminatingCapacity`
       * * `WarmPoolTotalCapacity`
       * * `GroupAndWarmPoolDesiredCapacity`
       * * `GroupAndWarmPoolTotalCapacity`
       *
       * If you specify `Granularity` and don't specify any metrics, all metrics are enabled.
       *
       * For more information, see [Auto Scaling group
       * metrics](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-cloudwatch-monitoring.html#as-group-metrics)
       * in the *Amazon EC2 Auto Scaling User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-metricscollection.html#cfn-autoscaling-autoscalinggroup-metricscollection-metrics)
       */
      override fun metrics(): List<String> = unwrap(this).getMetrics() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MetricsCollectionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.MetricsCollectionProperty):
          MetricsCollectionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetricsCollectionProperty):
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.MetricsCollectionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.MetricsCollectionProperty
    }
  }

  public interface InstanceRequirementsProperty {
    /**
     * The minimum and maximum number of accelerators (GPUs, FPGAs, or AWS Inferentia chips) for an
     * instance type.
     *
     * To exclude accelerator-enabled instance types, set `Max` to `0` .
     *
     * Default: No minimum or maximum limits
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-instancerequirements.html#cfn-autoscaling-autoscalinggroup-instancerequirements-acceleratorcount)
     */
    public fun acceleratorCount(): Any? = unwrap(this).getAcceleratorCount()

    /**
     * Indicates whether instance types must have accelerators by specific manufacturers.
     *
     * * For instance types with NVIDIA devices, specify `nvidia` .
     * * For instance types with AMD devices, specify `amd` .
     * * For instance types with AWS devices, specify `amazon-web-services` .
     * * For instance types with Xilinx devices, specify `xilinx` .
     *
     * Default: Any manufacturer
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-instancerequirements.html#cfn-autoscaling-autoscalinggroup-instancerequirements-acceleratormanufacturers)
     */
    public fun acceleratorManufacturers(): List<String> = unwrap(this).getAcceleratorManufacturers()
        ?: emptyList()

    /**
     * Lists the accelerators that must be on an instance type.
     *
     * * For instance types with NVIDIA A100 GPUs, specify `a100` .
     * * For instance types with NVIDIA V100 GPUs, specify `v100` .
     * * For instance types with NVIDIA K80 GPUs, specify `k80` .
     * * For instance types with NVIDIA T4 GPUs, specify `t4` .
     * * For instance types with NVIDIA M60 GPUs, specify `m60` .
     * * For instance types with AMD Radeon Pro V520 GPUs, specify `radeon-pro-v520` .
     * * For instance types with Xilinx VU9P FPGAs, specify `vu9p` .
     *
     * Default: Any accelerator
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-instancerequirements.html#cfn-autoscaling-autoscalinggroup-instancerequirements-acceleratornames)
     */
    public fun acceleratorNames(): List<String> = unwrap(this).getAcceleratorNames() ?: emptyList()

    /**
     * The minimum and maximum total memory size for the accelerators on an instance type, in MiB.
     *
     * Default: No minimum or maximum limits
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-instancerequirements.html#cfn-autoscaling-autoscalinggroup-instancerequirements-acceleratortotalmemorymib)
     */
    public fun acceleratorTotalMemoryMiB(): Any? = unwrap(this).getAcceleratorTotalMemoryMiB()

    /**
     * Lists the accelerator types that must be on an instance type.
     *
     * * For instance types with GPU accelerators, specify `gpu` .
     * * For instance types with FPGA accelerators, specify `fpga` .
     * * For instance types with inference accelerators, specify `inference` .
     *
     * Default: Any accelerator type
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-instancerequirements.html#cfn-autoscaling-autoscalinggroup-instancerequirements-acceleratortypes)
     */
    public fun acceleratorTypes(): List<String> = unwrap(this).getAcceleratorTypes() ?: emptyList()

    /**
     * The instance types to apply your specified attributes against.
     *
     * All other instance types are ignored, even if they match your specified attributes.
     *
     * You can use strings with one or more wild cards, represented by an asterisk ( `*` ), to allow
     * an instance type, size, or generation. The following are examples: `m5.8xlarge` , `c5*.*` ,
     * `m5a.*` , `r*` , `*3*` .
     *
     * For example, if you specify `c5*` , Amazon EC2 Auto Scaling will allow the entire C5 instance
     * family, which includes all C5a and C5n instance types. If you specify `m5a.*` , Amazon EC2 Auto
     * Scaling will allow all the M5a instance types, but not the M5n instance types.
     *
     *
     * If you specify `AllowedInstanceTypes` , you can't specify `ExcludedInstanceTypes` .
     *
     *
     * Default: All instance types
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-instancerequirements.html#cfn-autoscaling-autoscalinggroup-instancerequirements-allowedinstancetypes)
     */
    public fun allowedInstanceTypes(): List<String> = unwrap(this).getAllowedInstanceTypes() ?:
        emptyList()

    /**
     * Indicates whether bare metal instance types are included, excluded, or required.
     *
     * Default: `excluded`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-instancerequirements.html#cfn-autoscaling-autoscalinggroup-instancerequirements-baremetal)
     */
    public fun bareMetal(): String? = unwrap(this).getBareMetal()

    /**
     * The minimum and maximum baseline bandwidth performance for an instance type, in Mbps.
     *
     * For more information, see [Amazon EBS–optimized
     * instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-optimized.html) in the
     * *Amazon EC2 User Guide for Linux Instances* .
     *
     * Default: No minimum or maximum limits
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-instancerequirements.html#cfn-autoscaling-autoscalinggroup-instancerequirements-baselineebsbandwidthmbps)
     */
    public fun baselineEbsBandwidthMbps(): Any? = unwrap(this).getBaselineEbsBandwidthMbps()

    /**
     * Indicates whether burstable performance instance types are included, excluded, or required.
     *
     * For more information, see [Burstable performance
     * instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html)
     * in the *Amazon EC2 User Guide for Linux Instances* .
     *
     * Default: `excluded`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-instancerequirements.html#cfn-autoscaling-autoscalinggroup-instancerequirements-burstableperformance)
     */
    public fun burstablePerformance(): String? = unwrap(this).getBurstablePerformance()

    /**
     * Lists which specific CPU manufacturers to include.
     *
     * * For instance types with Intel CPUs, specify `intel` .
     * * For instance types with AMD CPUs, specify `amd` .
     * * For instance types with AWS CPUs, specify `amazon-web-services` .
     *
     *
     * Don't confuse the CPU hardware manufacturer with the CPU hardware architecture. Instances
     * will be launched with a compatible CPU architecture based on the Amazon Machine Image (AMI) that
     * you specify in your launch template.
     *
     *
     * Default: Any manufacturer
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-instancerequirements.html#cfn-autoscaling-autoscalinggroup-instancerequirements-cpumanufacturers)
     */
    public fun cpuManufacturers(): List<String> = unwrap(this).getCpuManufacturers() ?: emptyList()

    /**
     * The instance types to exclude.
     *
     * You can use strings with one or more wild cards, represented by an asterisk ( `*` ), to
     * exclude an instance family, type, size, or generation. The following are examples: `m5.8xlarge`
     * , `c5*.*` , `m5a.*` , `r*` , `*3*` .
     *
     * For example, if you specify `c5*` , you are excluding the entire C5 instance family, which
     * includes all C5a and C5n instance types. If you specify `m5a.*` , Amazon EC2 Auto Scaling will
     * exclude all the M5a instance types, but not the M5n instance types.
     *
     *
     * If you specify `ExcludedInstanceTypes` , you can't specify `AllowedInstanceTypes` .
     *
     *
     * Default: No excluded instance types
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-instancerequirements.html#cfn-autoscaling-autoscalinggroup-instancerequirements-excludedinstancetypes)
     */
    public fun excludedInstanceTypes(): List<String> = unwrap(this).getExcludedInstanceTypes() ?:
        emptyList()

    /**
     * Indicates whether current or previous generation instance types are included.
     *
     * * For current generation instance types, specify `current` . The current generation includes
     * EC2 instance types currently recommended for use. This typically includes the latest two to
     * three generations in each instance family. For more information, see [Instance
     * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html) in the *Amazon
     * EC2 User Guide for Linux Instances* .
     * * For previous generation instance types, specify `previous` .
     *
     * Default: Any current or previous generation
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-instancerequirements.html#cfn-autoscaling-autoscalinggroup-instancerequirements-instancegenerations)
     */
    public fun instanceGenerations(): List<String> = unwrap(this).getInstanceGenerations() ?:
        emptyList()

    /**
     * Indicates whether instance types with instance store volumes are included, excluded, or
     * required.
     *
     * For more information, see [Amazon EC2 instance
     * store](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html) in the *Amazon
     * EC2 User Guide for Linux Instances* .
     *
     * Default: `included`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-instancerequirements.html#cfn-autoscaling-autoscalinggroup-instancerequirements-localstorage)
     */
    public fun localStorage(): String? = unwrap(this).getLocalStorage()

    /**
     * Indicates the type of local storage that is required.
     *
     * * For instance types with hard disk drive (HDD) storage, specify `hdd` .
     * * For instance types with solid state drive (SSD) storage, specify `ssd` .
     *
     * Default: Any local storage type
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-instancerequirements.html#cfn-autoscaling-autoscalinggroup-instancerequirements-localstoragetypes)
     */
    public fun localStorageTypes(): List<String> = unwrap(this).getLocalStorageTypes() ?:
        emptyList()

    /**
     * [Price protection] The price protection threshold for Spot Instances, as a percentage of an
     * identified On-Demand price.
     *
     * The identified On-Demand price is the price of the lowest priced current generation C, M, or
     * R instance type with your specified attributes. If no current generation C, M, or R instance
     * type matches your attributes, then the identified price is from either the lowest priced current
     * generation instance types or, failing that, the lowest priced previous generation instance types
     * that match your attributes. When Amazon EC2 Auto Scaling selects instance types with your
     * attributes, we will exclude instance types whose price exceeds your specified threshold.
     *
     * The parameter accepts an integer, which Amazon EC2 Auto Scaling interprets as a percentage.
     *
     * To indicate no price protection threshold, specify a high value, such as `999999` .
     *
     * If you set `DesiredCapacityType` to `vcpu` or `memory-mib` , the price protection threshold
     * is based on the per-vCPU or per-memory price instead of the per instance price.
     *
     *
     * Only one of `SpotMaxPricePercentageOverLowestPrice` or
     * `MaxSpotPriceAsPercentageOfOptimalOnDemandPrice` can be specified. If you don't specify either,
     * then `SpotMaxPricePercentageOverLowestPrice` is used and the value for that parameter defaults
     * to `100` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-instancerequirements.html#cfn-autoscaling-autoscalinggroup-instancerequirements-maxspotpriceaspercentageofoptimalondemandprice)
     */
    public fun maxSpotPriceAsPercentageOfOptimalOnDemandPrice(): Number? =
        unwrap(this).getMaxSpotPriceAsPercentageOfOptimalOnDemandPrice()

    /**
     * The minimum and maximum amount of memory per vCPU for an instance type, in GiB.
     *
     * Default: No minimum or maximum limits
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-instancerequirements.html#cfn-autoscaling-autoscalinggroup-instancerequirements-memorygibpervcpu)
     */
    public fun memoryGiBPerVCpu(): Any? = unwrap(this).getMemoryGiBPerVCpu()

    /**
     * The minimum and maximum instance memory size for an instance type, in MiB.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-instancerequirements.html#cfn-autoscaling-autoscalinggroup-instancerequirements-memorymib)
     */
    public fun memoryMiB(): Any

    /**
     * The minimum and maximum amount of network bandwidth, in gigabits per second (Gbps).
     *
     * Default: No minimum or maximum limits
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-instancerequirements.html#cfn-autoscaling-autoscalinggroup-instancerequirements-networkbandwidthgbps)
     */
    public fun networkBandwidthGbps(): Any? = unwrap(this).getNetworkBandwidthGbps()

    /**
     * The minimum and maximum number of network interfaces for an instance type.
     *
     * Default: No minimum or maximum limits
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-instancerequirements.html#cfn-autoscaling-autoscalinggroup-instancerequirements-networkinterfacecount)
     */
    public fun networkInterfaceCount(): Any? = unwrap(this).getNetworkInterfaceCount()

    /**
     * [Price protection] The price protection threshold for On-Demand Instances, as a percentage
     * higher than an identified On-Demand price.
     *
     * The identified On-Demand price is the price of the lowest priced current generation C, M, or
     * R instance type with your specified attributes. If no current generation C, M, or R instance
     * type matches your attributes, then the identified price is from either the lowest priced current
     * generation instance types or, failing that, the lowest priced previous generation instance types
     * that match your attributes. When Amazon EC2 Auto Scaling selects instance types with your
     * attributes, we will exclude instance types whose price exceeds your specified threshold.
     *
     * The parameter accepts an integer, which Amazon EC2 Auto Scaling interprets as a percentage.
     *
     * To turn off price protection, specify a high value, such as `999999` .
     *
     * If you set `DesiredCapacityType` to `vcpu` or `memory-mib` , the price protection threshold
     * is applied based on the per-vCPU or per-memory price instead of the per instance price.
     *
     * Default: `20`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-instancerequirements.html#cfn-autoscaling-autoscalinggroup-instancerequirements-ondemandmaxpricepercentageoverlowestprice)
     */
    public fun onDemandMaxPricePercentageOverLowestPrice(): Number? =
        unwrap(this).getOnDemandMaxPricePercentageOverLowestPrice()

    /**
     * Indicates whether instance types must provide On-Demand Instance hibernation support.
     *
     * Default: `false`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-instancerequirements.html#cfn-autoscaling-autoscalinggroup-instancerequirements-requirehibernatesupport)
     */
    public fun requireHibernateSupport(): Any? = unwrap(this).getRequireHibernateSupport()

    /**
     * [Price protection] The price protection threshold for Spot Instances, as a percentage higher
     * than an identified Spot price.
     *
     * The identified Spot price is the price of the lowest priced current generation C, M, or R
     * instance type with your specified attributes. If no current generation C, M, or R instance type
     * matches your attributes, then the identified price is from either the lowest priced current
     * generation instance types or, failing that, the lowest priced previous generation instance types
     * that match your attributes. When Amazon EC2 Auto Scaling selects instance types with your
     * attributes, we will exclude instance types whose price exceeds your specified threshold.
     *
     * The parameter accepts an integer, which Amazon EC2 Auto Scaling interprets as a percentage.
     *
     * To turn off price protection, specify a high value, such as `999999` .
     *
     * If you set `DesiredCapacityType` to `vcpu` or `memory-mib` , the price protection threshold
     * is based on the per-vCPU or per-memory price instead of the per instance price.
     *
     *
     * Only one of `SpotMaxPricePercentageOverLowestPrice` or
     * `MaxSpotPriceAsPercentageOfOptimalOnDemandPrice` can be specified.
     *
     *
     * Default: `100`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-instancerequirements.html#cfn-autoscaling-autoscalinggroup-instancerequirements-spotmaxpricepercentageoverlowestprice)
     */
    public fun spotMaxPricePercentageOverLowestPrice(): Number? =
        unwrap(this).getSpotMaxPricePercentageOverLowestPrice()

    /**
     * The minimum and maximum total local storage size for an instance type, in GB.
     *
     * Default: No minimum or maximum limits
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-instancerequirements.html#cfn-autoscaling-autoscalinggroup-instancerequirements-totallocalstoragegb)
     */
    public fun totalLocalStorageGb(): Any? = unwrap(this).getTotalLocalStorageGb()

    /**
     * The minimum and maximum number of vCPUs for an instance type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-instancerequirements.html#cfn-autoscaling-autoscalinggroup-instancerequirements-vcpucount)
     */
    public fun vCpuCount(): Any

    /**
     * A builder for [InstanceRequirementsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param acceleratorCount The minimum and maximum number of accelerators (GPUs, FPGAs, or AWS
       * Inferentia chips) for an instance type.
       * To exclude accelerator-enabled instance types, set `Max` to `0` .
       *
       * Default: No minimum or maximum limits
       */
      public fun acceleratorCount(acceleratorCount: IResolvable)

      /**
       * @param acceleratorCount The minimum and maximum number of accelerators (GPUs, FPGAs, or AWS
       * Inferentia chips) for an instance type.
       * To exclude accelerator-enabled instance types, set `Max` to `0` .
       *
       * Default: No minimum or maximum limits
       */
      public fun acceleratorCount(acceleratorCount: AcceleratorCountRequestProperty)

      /**
       * @param acceleratorCount The minimum and maximum number of accelerators (GPUs, FPGAs, or AWS
       * Inferentia chips) for an instance type.
       * To exclude accelerator-enabled instance types, set `Max` to `0` .
       *
       * Default: No minimum or maximum limits
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("da54f95b7b9114b6e8c7e1024e8206a703bc28b5f93f2c30c33fa5caddfcbcad")
      public
          fun acceleratorCount(acceleratorCount: AcceleratorCountRequestProperty.Builder.() -> Unit)

      /**
       * @param acceleratorManufacturers Indicates whether instance types must have accelerators by
       * specific manufacturers.
       * * For instance types with NVIDIA devices, specify `nvidia` .
       * * For instance types with AMD devices, specify `amd` .
       * * For instance types with AWS devices, specify `amazon-web-services` .
       * * For instance types with Xilinx devices, specify `xilinx` .
       *
       * Default: Any manufacturer
       */
      public fun acceleratorManufacturers(acceleratorManufacturers: List<String>)

      /**
       * @param acceleratorManufacturers Indicates whether instance types must have accelerators by
       * specific manufacturers.
       * * For instance types with NVIDIA devices, specify `nvidia` .
       * * For instance types with AMD devices, specify `amd` .
       * * For instance types with AWS devices, specify `amazon-web-services` .
       * * For instance types with Xilinx devices, specify `xilinx` .
       *
       * Default: Any manufacturer
       */
      public fun acceleratorManufacturers(vararg acceleratorManufacturers: String)

      /**
       * @param acceleratorNames Lists the accelerators that must be on an instance type.
       * * For instance types with NVIDIA A100 GPUs, specify `a100` .
       * * For instance types with NVIDIA V100 GPUs, specify `v100` .
       * * For instance types with NVIDIA K80 GPUs, specify `k80` .
       * * For instance types with NVIDIA T4 GPUs, specify `t4` .
       * * For instance types with NVIDIA M60 GPUs, specify `m60` .
       * * For instance types with AMD Radeon Pro V520 GPUs, specify `radeon-pro-v520` .
       * * For instance types with Xilinx VU9P FPGAs, specify `vu9p` .
       *
       * Default: Any accelerator
       */
      public fun acceleratorNames(acceleratorNames: List<String>)

      /**
       * @param acceleratorNames Lists the accelerators that must be on an instance type.
       * * For instance types with NVIDIA A100 GPUs, specify `a100` .
       * * For instance types with NVIDIA V100 GPUs, specify `v100` .
       * * For instance types with NVIDIA K80 GPUs, specify `k80` .
       * * For instance types with NVIDIA T4 GPUs, specify `t4` .
       * * For instance types with NVIDIA M60 GPUs, specify `m60` .
       * * For instance types with AMD Radeon Pro V520 GPUs, specify `radeon-pro-v520` .
       * * For instance types with Xilinx VU9P FPGAs, specify `vu9p` .
       *
       * Default: Any accelerator
       */
      public fun acceleratorNames(vararg acceleratorNames: String)

      /**
       * @param acceleratorTotalMemoryMiB The minimum and maximum total memory size for the
       * accelerators on an instance type, in MiB.
       * Default: No minimum or maximum limits
       */
      public fun acceleratorTotalMemoryMiB(acceleratorTotalMemoryMiB: IResolvable)

      /**
       * @param acceleratorTotalMemoryMiB The minimum and maximum total memory size for the
       * accelerators on an instance type, in MiB.
       * Default: No minimum or maximum limits
       */
      public
          fun acceleratorTotalMemoryMiB(acceleratorTotalMemoryMiB: AcceleratorTotalMemoryMiBRequestProperty)

      /**
       * @param acceleratorTotalMemoryMiB The minimum and maximum total memory size for the
       * accelerators on an instance type, in MiB.
       * Default: No minimum or maximum limits
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ba7739b20a48dd2ab478fcc4d91c25765804a9600b7eeb1aba86f05bffe0751e")
      public
          fun acceleratorTotalMemoryMiB(acceleratorTotalMemoryMiB: AcceleratorTotalMemoryMiBRequestProperty.Builder.() -> Unit)

      /**
       * @param acceleratorTypes Lists the accelerator types that must be on an instance type.
       * * For instance types with GPU accelerators, specify `gpu` .
       * * For instance types with FPGA accelerators, specify `fpga` .
       * * For instance types with inference accelerators, specify `inference` .
       *
       * Default: Any accelerator type
       */
      public fun acceleratorTypes(acceleratorTypes: List<String>)

      /**
       * @param acceleratorTypes Lists the accelerator types that must be on an instance type.
       * * For instance types with GPU accelerators, specify `gpu` .
       * * For instance types with FPGA accelerators, specify `fpga` .
       * * For instance types with inference accelerators, specify `inference` .
       *
       * Default: Any accelerator type
       */
      public fun acceleratorTypes(vararg acceleratorTypes: String)

      /**
       * @param allowedInstanceTypes The instance types to apply your specified attributes against.
       * All other instance types are ignored, even if they match your specified attributes.
       *
       * You can use strings with one or more wild cards, represented by an asterisk ( `*` ), to
       * allow an instance type, size, or generation. The following are examples: `m5.8xlarge` ,
       * `c5*.*` , `m5a.*` , `r*` , `*3*` .
       *
       * For example, if you specify `c5*` , Amazon EC2 Auto Scaling will allow the entire C5
       * instance family, which includes all C5a and C5n instance types. If you specify `m5a.*` ,
       * Amazon EC2 Auto Scaling will allow all the M5a instance types, but not the M5n instance types.
       *
       *
       * If you specify `AllowedInstanceTypes` , you can't specify `ExcludedInstanceTypes` .
       *
       *
       * Default: All instance types
       */
      public fun allowedInstanceTypes(allowedInstanceTypes: List<String>)

      /**
       * @param allowedInstanceTypes The instance types to apply your specified attributes against.
       * All other instance types are ignored, even if they match your specified attributes.
       *
       * You can use strings with one or more wild cards, represented by an asterisk ( `*` ), to
       * allow an instance type, size, or generation. The following are examples: `m5.8xlarge` ,
       * `c5*.*` , `m5a.*` , `r*` , `*3*` .
       *
       * For example, if you specify `c5*` , Amazon EC2 Auto Scaling will allow the entire C5
       * instance family, which includes all C5a and C5n instance types. If you specify `m5a.*` ,
       * Amazon EC2 Auto Scaling will allow all the M5a instance types, but not the M5n instance types.
       *
       *
       * If you specify `AllowedInstanceTypes` , you can't specify `ExcludedInstanceTypes` .
       *
       *
       * Default: All instance types
       */
      public fun allowedInstanceTypes(vararg allowedInstanceTypes: String)

      /**
       * @param bareMetal Indicates whether bare metal instance types are included, excluded, or
       * required.
       * Default: `excluded`
       */
      public fun bareMetal(bareMetal: String)

      /**
       * @param baselineEbsBandwidthMbps The minimum and maximum baseline bandwidth performance for
       * an instance type, in Mbps.
       * For more information, see [Amazon EBS–optimized
       * instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-optimized.html) in the
       * *Amazon EC2 User Guide for Linux Instances* .
       *
       * Default: No minimum or maximum limits
       */
      public fun baselineEbsBandwidthMbps(baselineEbsBandwidthMbps: IResolvable)

      /**
       * @param baselineEbsBandwidthMbps The minimum and maximum baseline bandwidth performance for
       * an instance type, in Mbps.
       * For more information, see [Amazon EBS–optimized
       * instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-optimized.html) in the
       * *Amazon EC2 User Guide for Linux Instances* .
       *
       * Default: No minimum or maximum limits
       */
      public
          fun baselineEbsBandwidthMbps(baselineEbsBandwidthMbps: BaselineEbsBandwidthMbpsRequestProperty)

      /**
       * @param baselineEbsBandwidthMbps The minimum and maximum baseline bandwidth performance for
       * an instance type, in Mbps.
       * For more information, see [Amazon EBS–optimized
       * instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-optimized.html) in the
       * *Amazon EC2 User Guide for Linux Instances* .
       *
       * Default: No minimum or maximum limits
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1630feddc0146d1229586f809df8dd5224c4da3d0a2f82b7464a3ec0839fc8d4")
      public
          fun baselineEbsBandwidthMbps(baselineEbsBandwidthMbps: BaselineEbsBandwidthMbpsRequestProperty.Builder.() -> Unit)

      /**
       * @param burstablePerformance Indicates whether burstable performance instance types are
       * included, excluded, or required.
       * For more information, see [Burstable performance
       * instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html)
       * in the *Amazon EC2 User Guide for Linux Instances* .
       *
       * Default: `excluded`
       */
      public fun burstablePerformance(burstablePerformance: String)

      /**
       * @param cpuManufacturers Lists which specific CPU manufacturers to include.
       * * For instance types with Intel CPUs, specify `intel` .
       * * For instance types with AMD CPUs, specify `amd` .
       * * For instance types with AWS CPUs, specify `amazon-web-services` .
       *
       *
       * Don't confuse the CPU hardware manufacturer with the CPU hardware architecture. Instances
       * will be launched with a compatible CPU architecture based on the Amazon Machine Image (AMI)
       * that you specify in your launch template.
       *
       *
       * Default: Any manufacturer
       */
      public fun cpuManufacturers(cpuManufacturers: List<String>)

      /**
       * @param cpuManufacturers Lists which specific CPU manufacturers to include.
       * * For instance types with Intel CPUs, specify `intel` .
       * * For instance types with AMD CPUs, specify `amd` .
       * * For instance types with AWS CPUs, specify `amazon-web-services` .
       *
       *
       * Don't confuse the CPU hardware manufacturer with the CPU hardware architecture. Instances
       * will be launched with a compatible CPU architecture based on the Amazon Machine Image (AMI)
       * that you specify in your launch template.
       *
       *
       * Default: Any manufacturer
       */
      public fun cpuManufacturers(vararg cpuManufacturers: String)

      /**
       * @param excludedInstanceTypes The instance types to exclude.
       * You can use strings with one or more wild cards, represented by an asterisk ( `*` ), to
       * exclude an instance family, type, size, or generation. The following are examples:
       * `m5.8xlarge` , `c5*.*` , `m5a.*` , `r*` , `*3*` .
       *
       * For example, if you specify `c5*` , you are excluding the entire C5 instance family, which
       * includes all C5a and C5n instance types. If you specify `m5a.*` , Amazon EC2 Auto Scaling will
       * exclude all the M5a instance types, but not the M5n instance types.
       *
       *
       * If you specify `ExcludedInstanceTypes` , you can't specify `AllowedInstanceTypes` .
       *
       *
       * Default: No excluded instance types
       */
      public fun excludedInstanceTypes(excludedInstanceTypes: List<String>)

      /**
       * @param excludedInstanceTypes The instance types to exclude.
       * You can use strings with one or more wild cards, represented by an asterisk ( `*` ), to
       * exclude an instance family, type, size, or generation. The following are examples:
       * `m5.8xlarge` , `c5*.*` , `m5a.*` , `r*` , `*3*` .
       *
       * For example, if you specify `c5*` , you are excluding the entire C5 instance family, which
       * includes all C5a and C5n instance types. If you specify `m5a.*` , Amazon EC2 Auto Scaling will
       * exclude all the M5a instance types, but not the M5n instance types.
       *
       *
       * If you specify `ExcludedInstanceTypes` , you can't specify `AllowedInstanceTypes` .
       *
       *
       * Default: No excluded instance types
       */
      public fun excludedInstanceTypes(vararg excludedInstanceTypes: String)

      /**
       * @param instanceGenerations Indicates whether current or previous generation instance types
       * are included.
       * * For current generation instance types, specify `current` . The current generation
       * includes EC2 instance types currently recommended for use. This typically includes the latest
       * two to three generations in each instance family. For more information, see [Instance
       * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html) in the *Amazon
       * EC2 User Guide for Linux Instances* .
       * * For previous generation instance types, specify `previous` .
       *
       * Default: Any current or previous generation
       */
      public fun instanceGenerations(instanceGenerations: List<String>)

      /**
       * @param instanceGenerations Indicates whether current or previous generation instance types
       * are included.
       * * For current generation instance types, specify `current` . The current generation
       * includes EC2 instance types currently recommended for use. This typically includes the latest
       * two to three generations in each instance family. For more information, see [Instance
       * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html) in the *Amazon
       * EC2 User Guide for Linux Instances* .
       * * For previous generation instance types, specify `previous` .
       *
       * Default: Any current or previous generation
       */
      public fun instanceGenerations(vararg instanceGenerations: String)

      /**
       * @param localStorage Indicates whether instance types with instance store volumes are
       * included, excluded, or required.
       * For more information, see [Amazon EC2 instance
       * store](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html) in the
       * *Amazon EC2 User Guide for Linux Instances* .
       *
       * Default: `included`
       */
      public fun localStorage(localStorage: String)

      /**
       * @param localStorageTypes Indicates the type of local storage that is required.
       * * For instance types with hard disk drive (HDD) storage, specify `hdd` .
       * * For instance types with solid state drive (SSD) storage, specify `ssd` .
       *
       * Default: Any local storage type
       */
      public fun localStorageTypes(localStorageTypes: List<String>)

      /**
       * @param localStorageTypes Indicates the type of local storage that is required.
       * * For instance types with hard disk drive (HDD) storage, specify `hdd` .
       * * For instance types with solid state drive (SSD) storage, specify `ssd` .
       *
       * Default: Any local storage type
       */
      public fun localStorageTypes(vararg localStorageTypes: String)

      /**
       * @param maxSpotPriceAsPercentageOfOptimalOnDemandPrice [Price protection] The price
       * protection threshold for Spot Instances, as a percentage of an identified On-Demand price.
       * The identified On-Demand price is the price of the lowest priced current generation C, M,
       * or R instance type with your specified attributes. If no current generation C, M, or R
       * instance type matches your attributes, then the identified price is from either the lowest
       * priced current generation instance types or, failing that, the lowest priced previous
       * generation instance types that match your attributes. When Amazon EC2 Auto Scaling selects
       * instance types with your attributes, we will exclude instance types whose price exceeds your
       * specified threshold.
       *
       * The parameter accepts an integer, which Amazon EC2 Auto Scaling interprets as a percentage.
       *
       * To indicate no price protection threshold, specify a high value, such as `999999` .
       *
       * If you set `DesiredCapacityType` to `vcpu` or `memory-mib` , the price protection threshold
       * is based on the per-vCPU or per-memory price instead of the per instance price.
       *
       *
       * Only one of `SpotMaxPricePercentageOverLowestPrice` or
       * `MaxSpotPriceAsPercentageOfOptimalOnDemandPrice` can be specified. If you don't specify
       * either, then `SpotMaxPricePercentageOverLowestPrice` is used and the value for that parameter
       * defaults to `100` .
       */
      public
          fun maxSpotPriceAsPercentageOfOptimalOnDemandPrice(maxSpotPriceAsPercentageOfOptimalOnDemandPrice: Number)

      /**
       * @param memoryGiBPerVCpu The minimum and maximum amount of memory per vCPU for an instance
       * type, in GiB.
       * Default: No minimum or maximum limits
       */
      public fun memoryGiBPerVCpu(memoryGiBPerVCpu: IResolvable)

      /**
       * @param memoryGiBPerVCpu The minimum and maximum amount of memory per vCPU for an instance
       * type, in GiB.
       * Default: No minimum or maximum limits
       */
      public fun memoryGiBPerVCpu(memoryGiBPerVCpu: MemoryGiBPerVCpuRequestProperty)

      /**
       * @param memoryGiBPerVCpu The minimum and maximum amount of memory per vCPU for an instance
       * type, in GiB.
       * Default: No minimum or maximum limits
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d55290b531e2ee1dd41118265c957a9f776060c1d7b27f944e40119ab5bc7e54")
      public
          fun memoryGiBPerVCpu(memoryGiBPerVCpu: MemoryGiBPerVCpuRequestProperty.Builder.() -> Unit)

      /**
       * @param memoryMiB The minimum and maximum instance memory size for an instance type, in MiB.
       * 
       */
      public fun memoryMiB(memoryMiB: IResolvable)

      /**
       * @param memoryMiB The minimum and maximum instance memory size for an instance type, in MiB.
       * 
       */
      public fun memoryMiB(memoryMiB: MemoryMiBRequestProperty)

      /**
       * @param memoryMiB The minimum and maximum instance memory size for an instance type, in MiB.
       * 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6ebca97333f952b321ec1462a00b68924c214d836a3916882cfbf12b221439c9")
      public fun memoryMiB(memoryMiB: MemoryMiBRequestProperty.Builder.() -> Unit)

      /**
       * @param networkBandwidthGbps The minimum and maximum amount of network bandwidth, in
       * gigabits per second (Gbps).
       * Default: No minimum or maximum limits
       */
      public fun networkBandwidthGbps(networkBandwidthGbps: IResolvable)

      /**
       * @param networkBandwidthGbps The minimum and maximum amount of network bandwidth, in
       * gigabits per second (Gbps).
       * Default: No minimum or maximum limits
       */
      public fun networkBandwidthGbps(networkBandwidthGbps: NetworkBandwidthGbpsRequestProperty)

      /**
       * @param networkBandwidthGbps The minimum and maximum amount of network bandwidth, in
       * gigabits per second (Gbps).
       * Default: No minimum or maximum limits
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6552c11e18dd37c163b404c01333428d50703b58a125a26ed1c038a32f6188e9")
      public
          fun networkBandwidthGbps(networkBandwidthGbps: NetworkBandwidthGbpsRequestProperty.Builder.() -> Unit)

      /**
       * @param networkInterfaceCount The minimum and maximum number of network interfaces for an
       * instance type.
       * Default: No minimum or maximum limits
       */
      public fun networkInterfaceCount(networkInterfaceCount: IResolvable)

      /**
       * @param networkInterfaceCount The minimum and maximum number of network interfaces for an
       * instance type.
       * Default: No minimum or maximum limits
       */
      public fun networkInterfaceCount(networkInterfaceCount: NetworkInterfaceCountRequestProperty)

      /**
       * @param networkInterfaceCount The minimum and maximum number of network interfaces for an
       * instance type.
       * Default: No minimum or maximum limits
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f5f6237141895884dc736bee2ae072d1805502b7ea88c288aa06e7ee2a2b764d")
      public
          fun networkInterfaceCount(networkInterfaceCount: NetworkInterfaceCountRequestProperty.Builder.() -> Unit)

      /**
       * @param onDemandMaxPricePercentageOverLowestPrice [Price protection] The price protection
       * threshold for On-Demand Instances, as a percentage higher than an identified On-Demand price.
       * The identified On-Demand price is the price of the lowest priced current generation C, M,
       * or R instance type with your specified attributes. If no current generation C, M, or R
       * instance type matches your attributes, then the identified price is from either the lowest
       * priced current generation instance types or, failing that, the lowest priced previous
       * generation instance types that match your attributes. When Amazon EC2 Auto Scaling selects
       * instance types with your attributes, we will exclude instance types whose price exceeds your
       * specified threshold.
       *
       * The parameter accepts an integer, which Amazon EC2 Auto Scaling interprets as a percentage.
       *
       * To turn off price protection, specify a high value, such as `999999` .
       *
       * If you set `DesiredCapacityType` to `vcpu` or `memory-mib` , the price protection threshold
       * is applied based on the per-vCPU or per-memory price instead of the per instance price.
       *
       * Default: `20`
       */
      public
          fun onDemandMaxPricePercentageOverLowestPrice(onDemandMaxPricePercentageOverLowestPrice: Number)

      /**
       * @param requireHibernateSupport Indicates whether instance types must provide On-Demand
       * Instance hibernation support.
       * Default: `false`
       */
      public fun requireHibernateSupport(requireHibernateSupport: Boolean)

      /**
       * @param requireHibernateSupport Indicates whether instance types must provide On-Demand
       * Instance hibernation support.
       * Default: `false`
       */
      public fun requireHibernateSupport(requireHibernateSupport: IResolvable)

      /**
       * @param spotMaxPricePercentageOverLowestPrice [Price protection] The price protection
       * threshold for Spot Instances, as a percentage higher than an identified Spot price.
       * The identified Spot price is the price of the lowest priced current generation C, M, or R
       * instance type with your specified attributes. If no current generation C, M, or R instance
       * type matches your attributes, then the identified price is from either the lowest priced
       * current generation instance types or, failing that, the lowest priced previous generation
       * instance types that match your attributes. When Amazon EC2 Auto Scaling selects instance types
       * with your attributes, we will exclude instance types whose price exceeds your specified
       * threshold.
       *
       * The parameter accepts an integer, which Amazon EC2 Auto Scaling interprets as a percentage.
       *
       * To turn off price protection, specify a high value, such as `999999` .
       *
       * If you set `DesiredCapacityType` to `vcpu` or `memory-mib` , the price protection threshold
       * is based on the per-vCPU or per-memory price instead of the per instance price.
       *
       *
       * Only one of `SpotMaxPricePercentageOverLowestPrice` or
       * `MaxSpotPriceAsPercentageOfOptimalOnDemandPrice` can be specified.
       *
       *
       * Default: `100`
       */
      public
          fun spotMaxPricePercentageOverLowestPrice(spotMaxPricePercentageOverLowestPrice: Number)

      /**
       * @param totalLocalStorageGb The minimum and maximum total local storage size for an instance
       * type, in GB.
       * Default: No minimum or maximum limits
       */
      public fun totalLocalStorageGb(totalLocalStorageGb: IResolvable)

      /**
       * @param totalLocalStorageGb The minimum and maximum total local storage size for an instance
       * type, in GB.
       * Default: No minimum or maximum limits
       */
      public fun totalLocalStorageGb(totalLocalStorageGb: TotalLocalStorageGBRequestProperty)

      /**
       * @param totalLocalStorageGb The minimum and maximum total local storage size for an instance
       * type, in GB.
       * Default: No minimum or maximum limits
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0d4481573ab159ffe8f7c8ac32f6180c31832cfec39436d8ca19b2adf307383e")
      public
          fun totalLocalStorageGb(totalLocalStorageGb: TotalLocalStorageGBRequestProperty.Builder.() -> Unit)

      /**
       * @param vCpuCount The minimum and maximum number of vCPUs for an instance type. 
       */
      public fun vCpuCount(vCpuCount: IResolvable)

      /**
       * @param vCpuCount The minimum and maximum number of vCPUs for an instance type. 
       */
      public fun vCpuCount(vCpuCount: VCpuCountRequestProperty)

      /**
       * @param vCpuCount The minimum and maximum number of vCPUs for an instance type. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7dee68f654f869370b7228ff7e3ee0bca7647aca23a2359d986734fb9648fa6d")
      public fun vCpuCount(vCpuCount: VCpuCountRequestProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.InstanceRequirementsProperty.Builder
          =
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.InstanceRequirementsProperty.builder()

      /**
       * @param acceleratorCount The minimum and maximum number of accelerators (GPUs, FPGAs, or AWS
       * Inferentia chips) for an instance type.
       * To exclude accelerator-enabled instance types, set `Max` to `0` .
       *
       * Default: No minimum or maximum limits
       */
      override fun acceleratorCount(acceleratorCount: IResolvable) {
        cdkBuilder.acceleratorCount(acceleratorCount.let(IResolvable::unwrap))
      }

      /**
       * @param acceleratorCount The minimum and maximum number of accelerators (GPUs, FPGAs, or AWS
       * Inferentia chips) for an instance type.
       * To exclude accelerator-enabled instance types, set `Max` to `0` .
       *
       * Default: No minimum or maximum limits
       */
      override fun acceleratorCount(acceleratorCount: AcceleratorCountRequestProperty) {
        cdkBuilder.acceleratorCount(acceleratorCount.let(AcceleratorCountRequestProperty::unwrap))
      }

      /**
       * @param acceleratorCount The minimum and maximum number of accelerators (GPUs, FPGAs, or AWS
       * Inferentia chips) for an instance type.
       * To exclude accelerator-enabled instance types, set `Max` to `0` .
       *
       * Default: No minimum or maximum limits
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("da54f95b7b9114b6e8c7e1024e8206a703bc28b5f93f2c30c33fa5caddfcbcad")
      override
          fun acceleratorCount(acceleratorCount: AcceleratorCountRequestProperty.Builder.() -> Unit):
          Unit = acceleratorCount(AcceleratorCountRequestProperty(acceleratorCount))

      /**
       * @param acceleratorManufacturers Indicates whether instance types must have accelerators by
       * specific manufacturers.
       * * For instance types with NVIDIA devices, specify `nvidia` .
       * * For instance types with AMD devices, specify `amd` .
       * * For instance types with AWS devices, specify `amazon-web-services` .
       * * For instance types with Xilinx devices, specify `xilinx` .
       *
       * Default: Any manufacturer
       */
      override fun acceleratorManufacturers(acceleratorManufacturers: List<String>) {
        cdkBuilder.acceleratorManufacturers(acceleratorManufacturers)
      }

      /**
       * @param acceleratorManufacturers Indicates whether instance types must have accelerators by
       * specific manufacturers.
       * * For instance types with NVIDIA devices, specify `nvidia` .
       * * For instance types with AMD devices, specify `amd` .
       * * For instance types with AWS devices, specify `amazon-web-services` .
       * * For instance types with Xilinx devices, specify `xilinx` .
       *
       * Default: Any manufacturer
       */
      override fun acceleratorManufacturers(vararg acceleratorManufacturers: String): Unit =
          acceleratorManufacturers(acceleratorManufacturers.toList())

      /**
       * @param acceleratorNames Lists the accelerators that must be on an instance type.
       * * For instance types with NVIDIA A100 GPUs, specify `a100` .
       * * For instance types with NVIDIA V100 GPUs, specify `v100` .
       * * For instance types with NVIDIA K80 GPUs, specify `k80` .
       * * For instance types with NVIDIA T4 GPUs, specify `t4` .
       * * For instance types with NVIDIA M60 GPUs, specify `m60` .
       * * For instance types with AMD Radeon Pro V520 GPUs, specify `radeon-pro-v520` .
       * * For instance types with Xilinx VU9P FPGAs, specify `vu9p` .
       *
       * Default: Any accelerator
       */
      override fun acceleratorNames(acceleratorNames: List<String>) {
        cdkBuilder.acceleratorNames(acceleratorNames)
      }

      /**
       * @param acceleratorNames Lists the accelerators that must be on an instance type.
       * * For instance types with NVIDIA A100 GPUs, specify `a100` .
       * * For instance types with NVIDIA V100 GPUs, specify `v100` .
       * * For instance types with NVIDIA K80 GPUs, specify `k80` .
       * * For instance types with NVIDIA T4 GPUs, specify `t4` .
       * * For instance types with NVIDIA M60 GPUs, specify `m60` .
       * * For instance types with AMD Radeon Pro V520 GPUs, specify `radeon-pro-v520` .
       * * For instance types with Xilinx VU9P FPGAs, specify `vu9p` .
       *
       * Default: Any accelerator
       */
      override fun acceleratorNames(vararg acceleratorNames: String): Unit =
          acceleratorNames(acceleratorNames.toList())

      /**
       * @param acceleratorTotalMemoryMiB The minimum and maximum total memory size for the
       * accelerators on an instance type, in MiB.
       * Default: No minimum or maximum limits
       */
      override fun acceleratorTotalMemoryMiB(acceleratorTotalMemoryMiB: IResolvable) {
        cdkBuilder.acceleratorTotalMemoryMiB(acceleratorTotalMemoryMiB.let(IResolvable::unwrap))
      }

      /**
       * @param acceleratorTotalMemoryMiB The minimum and maximum total memory size for the
       * accelerators on an instance type, in MiB.
       * Default: No minimum or maximum limits
       */
      override
          fun acceleratorTotalMemoryMiB(acceleratorTotalMemoryMiB: AcceleratorTotalMemoryMiBRequestProperty) {
        cdkBuilder.acceleratorTotalMemoryMiB(acceleratorTotalMemoryMiB.let(AcceleratorTotalMemoryMiBRequestProperty::unwrap))
      }

      /**
       * @param acceleratorTotalMemoryMiB The minimum and maximum total memory size for the
       * accelerators on an instance type, in MiB.
       * Default: No minimum or maximum limits
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ba7739b20a48dd2ab478fcc4d91c25765804a9600b7eeb1aba86f05bffe0751e")
      override
          fun acceleratorTotalMemoryMiB(acceleratorTotalMemoryMiB: AcceleratorTotalMemoryMiBRequestProperty.Builder.() -> Unit):
          Unit =
          acceleratorTotalMemoryMiB(AcceleratorTotalMemoryMiBRequestProperty(acceleratorTotalMemoryMiB))

      /**
       * @param acceleratorTypes Lists the accelerator types that must be on an instance type.
       * * For instance types with GPU accelerators, specify `gpu` .
       * * For instance types with FPGA accelerators, specify `fpga` .
       * * For instance types with inference accelerators, specify `inference` .
       *
       * Default: Any accelerator type
       */
      override fun acceleratorTypes(acceleratorTypes: List<String>) {
        cdkBuilder.acceleratorTypes(acceleratorTypes)
      }

      /**
       * @param acceleratorTypes Lists the accelerator types that must be on an instance type.
       * * For instance types with GPU accelerators, specify `gpu` .
       * * For instance types with FPGA accelerators, specify `fpga` .
       * * For instance types with inference accelerators, specify `inference` .
       *
       * Default: Any accelerator type
       */
      override fun acceleratorTypes(vararg acceleratorTypes: String): Unit =
          acceleratorTypes(acceleratorTypes.toList())

      /**
       * @param allowedInstanceTypes The instance types to apply your specified attributes against.
       * All other instance types are ignored, even if they match your specified attributes.
       *
       * You can use strings with one or more wild cards, represented by an asterisk ( `*` ), to
       * allow an instance type, size, or generation. The following are examples: `m5.8xlarge` ,
       * `c5*.*` , `m5a.*` , `r*` , `*3*` .
       *
       * For example, if you specify `c5*` , Amazon EC2 Auto Scaling will allow the entire C5
       * instance family, which includes all C5a and C5n instance types. If you specify `m5a.*` ,
       * Amazon EC2 Auto Scaling will allow all the M5a instance types, but not the M5n instance types.
       *
       *
       * If you specify `AllowedInstanceTypes` , you can't specify `ExcludedInstanceTypes` .
       *
       *
       * Default: All instance types
       */
      override fun allowedInstanceTypes(allowedInstanceTypes: List<String>) {
        cdkBuilder.allowedInstanceTypes(allowedInstanceTypes)
      }

      /**
       * @param allowedInstanceTypes The instance types to apply your specified attributes against.
       * All other instance types are ignored, even if they match your specified attributes.
       *
       * You can use strings with one or more wild cards, represented by an asterisk ( `*` ), to
       * allow an instance type, size, or generation. The following are examples: `m5.8xlarge` ,
       * `c5*.*` , `m5a.*` , `r*` , `*3*` .
       *
       * For example, if you specify `c5*` , Amazon EC2 Auto Scaling will allow the entire C5
       * instance family, which includes all C5a and C5n instance types. If you specify `m5a.*` ,
       * Amazon EC2 Auto Scaling will allow all the M5a instance types, but not the M5n instance types.
       *
       *
       * If you specify `AllowedInstanceTypes` , you can't specify `ExcludedInstanceTypes` .
       *
       *
       * Default: All instance types
       */
      override fun allowedInstanceTypes(vararg allowedInstanceTypes: String): Unit =
          allowedInstanceTypes(allowedInstanceTypes.toList())

      /**
       * @param bareMetal Indicates whether bare metal instance types are included, excluded, or
       * required.
       * Default: `excluded`
       */
      override fun bareMetal(bareMetal: String) {
        cdkBuilder.bareMetal(bareMetal)
      }

      /**
       * @param baselineEbsBandwidthMbps The minimum and maximum baseline bandwidth performance for
       * an instance type, in Mbps.
       * For more information, see [Amazon EBS–optimized
       * instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-optimized.html) in the
       * *Amazon EC2 User Guide for Linux Instances* .
       *
       * Default: No minimum or maximum limits
       */
      override fun baselineEbsBandwidthMbps(baselineEbsBandwidthMbps: IResolvable) {
        cdkBuilder.baselineEbsBandwidthMbps(baselineEbsBandwidthMbps.let(IResolvable::unwrap))
      }

      /**
       * @param baselineEbsBandwidthMbps The minimum and maximum baseline bandwidth performance for
       * an instance type, in Mbps.
       * For more information, see [Amazon EBS–optimized
       * instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-optimized.html) in the
       * *Amazon EC2 User Guide for Linux Instances* .
       *
       * Default: No minimum or maximum limits
       */
      override
          fun baselineEbsBandwidthMbps(baselineEbsBandwidthMbps: BaselineEbsBandwidthMbpsRequestProperty) {
        cdkBuilder.baselineEbsBandwidthMbps(baselineEbsBandwidthMbps.let(BaselineEbsBandwidthMbpsRequestProperty::unwrap))
      }

      /**
       * @param baselineEbsBandwidthMbps The minimum and maximum baseline bandwidth performance for
       * an instance type, in Mbps.
       * For more information, see [Amazon EBS–optimized
       * instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-optimized.html) in the
       * *Amazon EC2 User Guide for Linux Instances* .
       *
       * Default: No minimum or maximum limits
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1630feddc0146d1229586f809df8dd5224c4da3d0a2f82b7464a3ec0839fc8d4")
      override
          fun baselineEbsBandwidthMbps(baselineEbsBandwidthMbps: BaselineEbsBandwidthMbpsRequestProperty.Builder.() -> Unit):
          Unit =
          baselineEbsBandwidthMbps(BaselineEbsBandwidthMbpsRequestProperty(baselineEbsBandwidthMbps))

      /**
       * @param burstablePerformance Indicates whether burstable performance instance types are
       * included, excluded, or required.
       * For more information, see [Burstable performance
       * instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html)
       * in the *Amazon EC2 User Guide for Linux Instances* .
       *
       * Default: `excluded`
       */
      override fun burstablePerformance(burstablePerformance: String) {
        cdkBuilder.burstablePerformance(burstablePerformance)
      }

      /**
       * @param cpuManufacturers Lists which specific CPU manufacturers to include.
       * * For instance types with Intel CPUs, specify `intel` .
       * * For instance types with AMD CPUs, specify `amd` .
       * * For instance types with AWS CPUs, specify `amazon-web-services` .
       *
       *
       * Don't confuse the CPU hardware manufacturer with the CPU hardware architecture. Instances
       * will be launched with a compatible CPU architecture based on the Amazon Machine Image (AMI)
       * that you specify in your launch template.
       *
       *
       * Default: Any manufacturer
       */
      override fun cpuManufacturers(cpuManufacturers: List<String>) {
        cdkBuilder.cpuManufacturers(cpuManufacturers)
      }

      /**
       * @param cpuManufacturers Lists which specific CPU manufacturers to include.
       * * For instance types with Intel CPUs, specify `intel` .
       * * For instance types with AMD CPUs, specify `amd` .
       * * For instance types with AWS CPUs, specify `amazon-web-services` .
       *
       *
       * Don't confuse the CPU hardware manufacturer with the CPU hardware architecture. Instances
       * will be launched with a compatible CPU architecture based on the Amazon Machine Image (AMI)
       * that you specify in your launch template.
       *
       *
       * Default: Any manufacturer
       */
      override fun cpuManufacturers(vararg cpuManufacturers: String): Unit =
          cpuManufacturers(cpuManufacturers.toList())

      /**
       * @param excludedInstanceTypes The instance types to exclude.
       * You can use strings with one or more wild cards, represented by an asterisk ( `*` ), to
       * exclude an instance family, type, size, or generation. The following are examples:
       * `m5.8xlarge` , `c5*.*` , `m5a.*` , `r*` , `*3*` .
       *
       * For example, if you specify `c5*` , you are excluding the entire C5 instance family, which
       * includes all C5a and C5n instance types. If you specify `m5a.*` , Amazon EC2 Auto Scaling will
       * exclude all the M5a instance types, but not the M5n instance types.
       *
       *
       * If you specify `ExcludedInstanceTypes` , you can't specify `AllowedInstanceTypes` .
       *
       *
       * Default: No excluded instance types
       */
      override fun excludedInstanceTypes(excludedInstanceTypes: List<String>) {
        cdkBuilder.excludedInstanceTypes(excludedInstanceTypes)
      }

      /**
       * @param excludedInstanceTypes The instance types to exclude.
       * You can use strings with one or more wild cards, represented by an asterisk ( `*` ), to
       * exclude an instance family, type, size, or generation. The following are examples:
       * `m5.8xlarge` , `c5*.*` , `m5a.*` , `r*` , `*3*` .
       *
       * For example, if you specify `c5*` , you are excluding the entire C5 instance family, which
       * includes all C5a and C5n instance types. If you specify `m5a.*` , Amazon EC2 Auto Scaling will
       * exclude all the M5a instance types, but not the M5n instance types.
       *
       *
       * If you specify `ExcludedInstanceTypes` , you can't specify `AllowedInstanceTypes` .
       *
       *
       * Default: No excluded instance types
       */
      override fun excludedInstanceTypes(vararg excludedInstanceTypes: String): Unit =
          excludedInstanceTypes(excludedInstanceTypes.toList())

      /**
       * @param instanceGenerations Indicates whether current or previous generation instance types
       * are included.
       * * For current generation instance types, specify `current` . The current generation
       * includes EC2 instance types currently recommended for use. This typically includes the latest
       * two to three generations in each instance family. For more information, see [Instance
       * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html) in the *Amazon
       * EC2 User Guide for Linux Instances* .
       * * For previous generation instance types, specify `previous` .
       *
       * Default: Any current or previous generation
       */
      override fun instanceGenerations(instanceGenerations: List<String>) {
        cdkBuilder.instanceGenerations(instanceGenerations)
      }

      /**
       * @param instanceGenerations Indicates whether current or previous generation instance types
       * are included.
       * * For current generation instance types, specify `current` . The current generation
       * includes EC2 instance types currently recommended for use. This typically includes the latest
       * two to three generations in each instance family. For more information, see [Instance
       * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html) in the *Amazon
       * EC2 User Guide for Linux Instances* .
       * * For previous generation instance types, specify `previous` .
       *
       * Default: Any current or previous generation
       */
      override fun instanceGenerations(vararg instanceGenerations: String): Unit =
          instanceGenerations(instanceGenerations.toList())

      /**
       * @param localStorage Indicates whether instance types with instance store volumes are
       * included, excluded, or required.
       * For more information, see [Amazon EC2 instance
       * store](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html) in the
       * *Amazon EC2 User Guide for Linux Instances* .
       *
       * Default: `included`
       */
      override fun localStorage(localStorage: String) {
        cdkBuilder.localStorage(localStorage)
      }

      /**
       * @param localStorageTypes Indicates the type of local storage that is required.
       * * For instance types with hard disk drive (HDD) storage, specify `hdd` .
       * * For instance types with solid state drive (SSD) storage, specify `ssd` .
       *
       * Default: Any local storage type
       */
      override fun localStorageTypes(localStorageTypes: List<String>) {
        cdkBuilder.localStorageTypes(localStorageTypes)
      }

      /**
       * @param localStorageTypes Indicates the type of local storage that is required.
       * * For instance types with hard disk drive (HDD) storage, specify `hdd` .
       * * For instance types with solid state drive (SSD) storage, specify `ssd` .
       *
       * Default: Any local storage type
       */
      override fun localStorageTypes(vararg localStorageTypes: String): Unit =
          localStorageTypes(localStorageTypes.toList())

      /**
       * @param maxSpotPriceAsPercentageOfOptimalOnDemandPrice [Price protection] The price
       * protection threshold for Spot Instances, as a percentage of an identified On-Demand price.
       * The identified On-Demand price is the price of the lowest priced current generation C, M,
       * or R instance type with your specified attributes. If no current generation C, M, or R
       * instance type matches your attributes, then the identified price is from either the lowest
       * priced current generation instance types or, failing that, the lowest priced previous
       * generation instance types that match your attributes. When Amazon EC2 Auto Scaling selects
       * instance types with your attributes, we will exclude instance types whose price exceeds your
       * specified threshold.
       *
       * The parameter accepts an integer, which Amazon EC2 Auto Scaling interprets as a percentage.
       *
       * To indicate no price protection threshold, specify a high value, such as `999999` .
       *
       * If you set `DesiredCapacityType` to `vcpu` or `memory-mib` , the price protection threshold
       * is based on the per-vCPU or per-memory price instead of the per instance price.
       *
       *
       * Only one of `SpotMaxPricePercentageOverLowestPrice` or
       * `MaxSpotPriceAsPercentageOfOptimalOnDemandPrice` can be specified. If you don't specify
       * either, then `SpotMaxPricePercentageOverLowestPrice` is used and the value for that parameter
       * defaults to `100` .
       */
      override
          fun maxSpotPriceAsPercentageOfOptimalOnDemandPrice(maxSpotPriceAsPercentageOfOptimalOnDemandPrice: Number) {
        cdkBuilder.maxSpotPriceAsPercentageOfOptimalOnDemandPrice(maxSpotPriceAsPercentageOfOptimalOnDemandPrice)
      }

      /**
       * @param memoryGiBPerVCpu The minimum and maximum amount of memory per vCPU for an instance
       * type, in GiB.
       * Default: No minimum or maximum limits
       */
      override fun memoryGiBPerVCpu(memoryGiBPerVCpu: IResolvable) {
        cdkBuilder.memoryGiBPerVCpu(memoryGiBPerVCpu.let(IResolvable::unwrap))
      }

      /**
       * @param memoryGiBPerVCpu The minimum and maximum amount of memory per vCPU for an instance
       * type, in GiB.
       * Default: No minimum or maximum limits
       */
      override fun memoryGiBPerVCpu(memoryGiBPerVCpu: MemoryGiBPerVCpuRequestProperty) {
        cdkBuilder.memoryGiBPerVCpu(memoryGiBPerVCpu.let(MemoryGiBPerVCpuRequestProperty::unwrap))
      }

      /**
       * @param memoryGiBPerVCpu The minimum and maximum amount of memory per vCPU for an instance
       * type, in GiB.
       * Default: No minimum or maximum limits
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d55290b531e2ee1dd41118265c957a9f776060c1d7b27f944e40119ab5bc7e54")
      override
          fun memoryGiBPerVCpu(memoryGiBPerVCpu: MemoryGiBPerVCpuRequestProperty.Builder.() -> Unit):
          Unit = memoryGiBPerVCpu(MemoryGiBPerVCpuRequestProperty(memoryGiBPerVCpu))

      /**
       * @param memoryMiB The minimum and maximum instance memory size for an instance type, in MiB.
       * 
       */
      override fun memoryMiB(memoryMiB: IResolvable) {
        cdkBuilder.memoryMiB(memoryMiB.let(IResolvable::unwrap))
      }

      /**
       * @param memoryMiB The minimum and maximum instance memory size for an instance type, in MiB.
       * 
       */
      override fun memoryMiB(memoryMiB: MemoryMiBRequestProperty) {
        cdkBuilder.memoryMiB(memoryMiB.let(MemoryMiBRequestProperty::unwrap))
      }

      /**
       * @param memoryMiB The minimum and maximum instance memory size for an instance type, in MiB.
       * 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6ebca97333f952b321ec1462a00b68924c214d836a3916882cfbf12b221439c9")
      override fun memoryMiB(memoryMiB: MemoryMiBRequestProperty.Builder.() -> Unit): Unit =
          memoryMiB(MemoryMiBRequestProperty(memoryMiB))

      /**
       * @param networkBandwidthGbps The minimum and maximum amount of network bandwidth, in
       * gigabits per second (Gbps).
       * Default: No minimum or maximum limits
       */
      override fun networkBandwidthGbps(networkBandwidthGbps: IResolvable) {
        cdkBuilder.networkBandwidthGbps(networkBandwidthGbps.let(IResolvable::unwrap))
      }

      /**
       * @param networkBandwidthGbps The minimum and maximum amount of network bandwidth, in
       * gigabits per second (Gbps).
       * Default: No minimum or maximum limits
       */
      override fun networkBandwidthGbps(networkBandwidthGbps: NetworkBandwidthGbpsRequestProperty) {
        cdkBuilder.networkBandwidthGbps(networkBandwidthGbps.let(NetworkBandwidthGbpsRequestProperty::unwrap))
      }

      /**
       * @param networkBandwidthGbps The minimum and maximum amount of network bandwidth, in
       * gigabits per second (Gbps).
       * Default: No minimum or maximum limits
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6552c11e18dd37c163b404c01333428d50703b58a125a26ed1c038a32f6188e9")
      override
          fun networkBandwidthGbps(networkBandwidthGbps: NetworkBandwidthGbpsRequestProperty.Builder.() -> Unit):
          Unit = networkBandwidthGbps(NetworkBandwidthGbpsRequestProperty(networkBandwidthGbps))

      /**
       * @param networkInterfaceCount The minimum and maximum number of network interfaces for an
       * instance type.
       * Default: No minimum or maximum limits
       */
      override fun networkInterfaceCount(networkInterfaceCount: IResolvable) {
        cdkBuilder.networkInterfaceCount(networkInterfaceCount.let(IResolvable::unwrap))
      }

      /**
       * @param networkInterfaceCount The minimum and maximum number of network interfaces for an
       * instance type.
       * Default: No minimum or maximum limits
       */
      override
          fun networkInterfaceCount(networkInterfaceCount: NetworkInterfaceCountRequestProperty) {
        cdkBuilder.networkInterfaceCount(networkInterfaceCount.let(NetworkInterfaceCountRequestProperty::unwrap))
      }

      /**
       * @param networkInterfaceCount The minimum and maximum number of network interfaces for an
       * instance type.
       * Default: No minimum or maximum limits
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f5f6237141895884dc736bee2ae072d1805502b7ea88c288aa06e7ee2a2b764d")
      override
          fun networkInterfaceCount(networkInterfaceCount: NetworkInterfaceCountRequestProperty.Builder.() -> Unit):
          Unit = networkInterfaceCount(NetworkInterfaceCountRequestProperty(networkInterfaceCount))

      /**
       * @param onDemandMaxPricePercentageOverLowestPrice [Price protection] The price protection
       * threshold for On-Demand Instances, as a percentage higher than an identified On-Demand price.
       * The identified On-Demand price is the price of the lowest priced current generation C, M,
       * or R instance type with your specified attributes. If no current generation C, M, or R
       * instance type matches your attributes, then the identified price is from either the lowest
       * priced current generation instance types or, failing that, the lowest priced previous
       * generation instance types that match your attributes. When Amazon EC2 Auto Scaling selects
       * instance types with your attributes, we will exclude instance types whose price exceeds your
       * specified threshold.
       *
       * The parameter accepts an integer, which Amazon EC2 Auto Scaling interprets as a percentage.
       *
       * To turn off price protection, specify a high value, such as `999999` .
       *
       * If you set `DesiredCapacityType` to `vcpu` or `memory-mib` , the price protection threshold
       * is applied based on the per-vCPU or per-memory price instead of the per instance price.
       *
       * Default: `20`
       */
      override
          fun onDemandMaxPricePercentageOverLowestPrice(onDemandMaxPricePercentageOverLowestPrice: Number) {
        cdkBuilder.onDemandMaxPricePercentageOverLowestPrice(onDemandMaxPricePercentageOverLowestPrice)
      }

      /**
       * @param requireHibernateSupport Indicates whether instance types must provide On-Demand
       * Instance hibernation support.
       * Default: `false`
       */
      override fun requireHibernateSupport(requireHibernateSupport: Boolean) {
        cdkBuilder.requireHibernateSupport(requireHibernateSupport)
      }

      /**
       * @param requireHibernateSupport Indicates whether instance types must provide On-Demand
       * Instance hibernation support.
       * Default: `false`
       */
      override fun requireHibernateSupport(requireHibernateSupport: IResolvable) {
        cdkBuilder.requireHibernateSupport(requireHibernateSupport.let(IResolvable::unwrap))
      }

      /**
       * @param spotMaxPricePercentageOverLowestPrice [Price protection] The price protection
       * threshold for Spot Instances, as a percentage higher than an identified Spot price.
       * The identified Spot price is the price of the lowest priced current generation C, M, or R
       * instance type with your specified attributes. If no current generation C, M, or R instance
       * type matches your attributes, then the identified price is from either the lowest priced
       * current generation instance types or, failing that, the lowest priced previous generation
       * instance types that match your attributes. When Amazon EC2 Auto Scaling selects instance types
       * with your attributes, we will exclude instance types whose price exceeds your specified
       * threshold.
       *
       * The parameter accepts an integer, which Amazon EC2 Auto Scaling interprets as a percentage.
       *
       * To turn off price protection, specify a high value, such as `999999` .
       *
       * If you set `DesiredCapacityType` to `vcpu` or `memory-mib` , the price protection threshold
       * is based on the per-vCPU or per-memory price instead of the per instance price.
       *
       *
       * Only one of `SpotMaxPricePercentageOverLowestPrice` or
       * `MaxSpotPriceAsPercentageOfOptimalOnDemandPrice` can be specified.
       *
       *
       * Default: `100`
       */
      override
          fun spotMaxPricePercentageOverLowestPrice(spotMaxPricePercentageOverLowestPrice: Number) {
        cdkBuilder.spotMaxPricePercentageOverLowestPrice(spotMaxPricePercentageOverLowestPrice)
      }

      /**
       * @param totalLocalStorageGb The minimum and maximum total local storage size for an instance
       * type, in GB.
       * Default: No minimum or maximum limits
       */
      override fun totalLocalStorageGb(totalLocalStorageGb: IResolvable) {
        cdkBuilder.totalLocalStorageGb(totalLocalStorageGb.let(IResolvable::unwrap))
      }

      /**
       * @param totalLocalStorageGb The minimum and maximum total local storage size for an instance
       * type, in GB.
       * Default: No minimum or maximum limits
       */
      override fun totalLocalStorageGb(totalLocalStorageGb: TotalLocalStorageGBRequestProperty) {
        cdkBuilder.totalLocalStorageGb(totalLocalStorageGb.let(TotalLocalStorageGBRequestProperty::unwrap))
      }

      /**
       * @param totalLocalStorageGb The minimum and maximum total local storage size for an instance
       * type, in GB.
       * Default: No minimum or maximum limits
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0d4481573ab159ffe8f7c8ac32f6180c31832cfec39436d8ca19b2adf307383e")
      override
          fun totalLocalStorageGb(totalLocalStorageGb: TotalLocalStorageGBRequestProperty.Builder.() -> Unit):
          Unit = totalLocalStorageGb(TotalLocalStorageGBRequestProperty(totalLocalStorageGb))

      /**
       * @param vCpuCount The minimum and maximum number of vCPUs for an instance type. 
       */
      override fun vCpuCount(vCpuCount: IResolvable) {
        cdkBuilder.vCpuCount(vCpuCount.let(IResolvable::unwrap))
      }

      /**
       * @param vCpuCount The minimum and maximum number of vCPUs for an instance type. 
       */
      override fun vCpuCount(vCpuCount: VCpuCountRequestProperty) {
        cdkBuilder.vCpuCount(vCpuCount.let(VCpuCountRequestProperty::unwrap))
      }

      /**
       * @param vCpuCount The minimum and maximum number of vCPUs for an instance type. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7dee68f654f869370b7228ff7e3ee0bca7647aca23a2359d986734fb9648fa6d")
      override fun vCpuCount(vCpuCount: VCpuCountRequestProperty.Builder.() -> Unit): Unit =
          vCpuCount(VCpuCountRequestProperty(vCpuCount))

      public fun build():
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.InstanceRequirementsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.InstanceRequirementsProperty,
    ) : CdkObject(cdkObject), InstanceRequirementsProperty {
      /**
       * The minimum and maximum number of accelerators (GPUs, FPGAs, or AWS Inferentia chips) for
       * an instance type.
       *
       * To exclude accelerator-enabled instance types, set `Max` to `0` .
       *
       * Default: No minimum or maximum limits
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-instancerequirements.html#cfn-autoscaling-autoscalinggroup-instancerequirements-acceleratorcount)
       */
      override fun acceleratorCount(): Any? = unwrap(this).getAcceleratorCount()

      /**
       * Indicates whether instance types must have accelerators by specific manufacturers.
       *
       * * For instance types with NVIDIA devices, specify `nvidia` .
       * * For instance types with AMD devices, specify `amd` .
       * * For instance types with AWS devices, specify `amazon-web-services` .
       * * For instance types with Xilinx devices, specify `xilinx` .
       *
       * Default: Any manufacturer
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-instancerequirements.html#cfn-autoscaling-autoscalinggroup-instancerequirements-acceleratormanufacturers)
       */
      override fun acceleratorManufacturers(): List<String> =
          unwrap(this).getAcceleratorManufacturers() ?: emptyList()

      /**
       * Lists the accelerators that must be on an instance type.
       *
       * * For instance types with NVIDIA A100 GPUs, specify `a100` .
       * * For instance types with NVIDIA V100 GPUs, specify `v100` .
       * * For instance types with NVIDIA K80 GPUs, specify `k80` .
       * * For instance types with NVIDIA T4 GPUs, specify `t4` .
       * * For instance types with NVIDIA M60 GPUs, specify `m60` .
       * * For instance types with AMD Radeon Pro V520 GPUs, specify `radeon-pro-v520` .
       * * For instance types with Xilinx VU9P FPGAs, specify `vu9p` .
       *
       * Default: Any accelerator
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-instancerequirements.html#cfn-autoscaling-autoscalinggroup-instancerequirements-acceleratornames)
       */
      override fun acceleratorNames(): List<String> = unwrap(this).getAcceleratorNames() ?:
          emptyList()

      /**
       * The minimum and maximum total memory size for the accelerators on an instance type, in MiB.
       *
       * Default: No minimum or maximum limits
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-instancerequirements.html#cfn-autoscaling-autoscalinggroup-instancerequirements-acceleratortotalmemorymib)
       */
      override fun acceleratorTotalMemoryMiB(): Any? = unwrap(this).getAcceleratorTotalMemoryMiB()

      /**
       * Lists the accelerator types that must be on an instance type.
       *
       * * For instance types with GPU accelerators, specify `gpu` .
       * * For instance types with FPGA accelerators, specify `fpga` .
       * * For instance types with inference accelerators, specify `inference` .
       *
       * Default: Any accelerator type
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-instancerequirements.html#cfn-autoscaling-autoscalinggroup-instancerequirements-acceleratortypes)
       */
      override fun acceleratorTypes(): List<String> = unwrap(this).getAcceleratorTypes() ?:
          emptyList()

      /**
       * The instance types to apply your specified attributes against.
       *
       * All other instance types are ignored, even if they match your specified attributes.
       *
       * You can use strings with one or more wild cards, represented by an asterisk ( `*` ), to
       * allow an instance type, size, or generation. The following are examples: `m5.8xlarge` ,
       * `c5*.*` , `m5a.*` , `r*` , `*3*` .
       *
       * For example, if you specify `c5*` , Amazon EC2 Auto Scaling will allow the entire C5
       * instance family, which includes all C5a and C5n instance types. If you specify `m5a.*` ,
       * Amazon EC2 Auto Scaling will allow all the M5a instance types, but not the M5n instance types.
       *
       *
       * If you specify `AllowedInstanceTypes` , you can't specify `ExcludedInstanceTypes` .
       *
       *
       * Default: All instance types
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-instancerequirements.html#cfn-autoscaling-autoscalinggroup-instancerequirements-allowedinstancetypes)
       */
      override fun allowedInstanceTypes(): List<String> = unwrap(this).getAllowedInstanceTypes() ?:
          emptyList()

      /**
       * Indicates whether bare metal instance types are included, excluded, or required.
       *
       * Default: `excluded`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-instancerequirements.html#cfn-autoscaling-autoscalinggroup-instancerequirements-baremetal)
       */
      override fun bareMetal(): String? = unwrap(this).getBareMetal()

      /**
       * The minimum and maximum baseline bandwidth performance for an instance type, in Mbps.
       *
       * For more information, see [Amazon EBS–optimized
       * instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-optimized.html) in the
       * *Amazon EC2 User Guide for Linux Instances* .
       *
       * Default: No minimum or maximum limits
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-instancerequirements.html#cfn-autoscaling-autoscalinggroup-instancerequirements-baselineebsbandwidthmbps)
       */
      override fun baselineEbsBandwidthMbps(): Any? = unwrap(this).getBaselineEbsBandwidthMbps()

      /**
       * Indicates whether burstable performance instance types are included, excluded, or required.
       *
       * For more information, see [Burstable performance
       * instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html)
       * in the *Amazon EC2 User Guide for Linux Instances* .
       *
       * Default: `excluded`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-instancerequirements.html#cfn-autoscaling-autoscalinggroup-instancerequirements-burstableperformance)
       */
      override fun burstablePerformance(): String? = unwrap(this).getBurstablePerformance()

      /**
       * Lists which specific CPU manufacturers to include.
       *
       * * For instance types with Intel CPUs, specify `intel` .
       * * For instance types with AMD CPUs, specify `amd` .
       * * For instance types with AWS CPUs, specify `amazon-web-services` .
       *
       *
       * Don't confuse the CPU hardware manufacturer with the CPU hardware architecture. Instances
       * will be launched with a compatible CPU architecture based on the Amazon Machine Image (AMI)
       * that you specify in your launch template.
       *
       *
       * Default: Any manufacturer
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-instancerequirements.html#cfn-autoscaling-autoscalinggroup-instancerequirements-cpumanufacturers)
       */
      override fun cpuManufacturers(): List<String> = unwrap(this).getCpuManufacturers() ?:
          emptyList()

      /**
       * The instance types to exclude.
       *
       * You can use strings with one or more wild cards, represented by an asterisk ( `*` ), to
       * exclude an instance family, type, size, or generation. The following are examples:
       * `m5.8xlarge` , `c5*.*` , `m5a.*` , `r*` , `*3*` .
       *
       * For example, if you specify `c5*` , you are excluding the entire C5 instance family, which
       * includes all C5a and C5n instance types. If you specify `m5a.*` , Amazon EC2 Auto Scaling will
       * exclude all the M5a instance types, but not the M5n instance types.
       *
       *
       * If you specify `ExcludedInstanceTypes` , you can't specify `AllowedInstanceTypes` .
       *
       *
       * Default: No excluded instance types
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-instancerequirements.html#cfn-autoscaling-autoscalinggroup-instancerequirements-excludedinstancetypes)
       */
      override fun excludedInstanceTypes(): List<String> = unwrap(this).getExcludedInstanceTypes()
          ?: emptyList()

      /**
       * Indicates whether current or previous generation instance types are included.
       *
       * * For current generation instance types, specify `current` . The current generation
       * includes EC2 instance types currently recommended for use. This typically includes the latest
       * two to three generations in each instance family. For more information, see [Instance
       * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html) in the *Amazon
       * EC2 User Guide for Linux Instances* .
       * * For previous generation instance types, specify `previous` .
       *
       * Default: Any current or previous generation
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-instancerequirements.html#cfn-autoscaling-autoscalinggroup-instancerequirements-instancegenerations)
       */
      override fun instanceGenerations(): List<String> = unwrap(this).getInstanceGenerations() ?:
          emptyList()

      /**
       * Indicates whether instance types with instance store volumes are included, excluded, or
       * required.
       *
       * For more information, see [Amazon EC2 instance
       * store](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html) in the
       * *Amazon EC2 User Guide for Linux Instances* .
       *
       * Default: `included`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-instancerequirements.html#cfn-autoscaling-autoscalinggroup-instancerequirements-localstorage)
       */
      override fun localStorage(): String? = unwrap(this).getLocalStorage()

      /**
       * Indicates the type of local storage that is required.
       *
       * * For instance types with hard disk drive (HDD) storage, specify `hdd` .
       * * For instance types with solid state drive (SSD) storage, specify `ssd` .
       *
       * Default: Any local storage type
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-instancerequirements.html#cfn-autoscaling-autoscalinggroup-instancerequirements-localstoragetypes)
       */
      override fun localStorageTypes(): List<String> = unwrap(this).getLocalStorageTypes() ?:
          emptyList()

      /**
       * [Price protection] The price protection threshold for Spot Instances, as a percentage of an
       * identified On-Demand price.
       *
       * The identified On-Demand price is the price of the lowest priced current generation C, M,
       * or R instance type with your specified attributes. If no current generation C, M, or R
       * instance type matches your attributes, then the identified price is from either the lowest
       * priced current generation instance types or, failing that, the lowest priced previous
       * generation instance types that match your attributes. When Amazon EC2 Auto Scaling selects
       * instance types with your attributes, we will exclude instance types whose price exceeds your
       * specified threshold.
       *
       * The parameter accepts an integer, which Amazon EC2 Auto Scaling interprets as a percentage.
       *
       * To indicate no price protection threshold, specify a high value, such as `999999` .
       *
       * If you set `DesiredCapacityType` to `vcpu` or `memory-mib` , the price protection threshold
       * is based on the per-vCPU or per-memory price instead of the per instance price.
       *
       *
       * Only one of `SpotMaxPricePercentageOverLowestPrice` or
       * `MaxSpotPriceAsPercentageOfOptimalOnDemandPrice` can be specified. If you don't specify
       * either, then `SpotMaxPricePercentageOverLowestPrice` is used and the value for that parameter
       * defaults to `100` .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-instancerequirements.html#cfn-autoscaling-autoscalinggroup-instancerequirements-maxspotpriceaspercentageofoptimalondemandprice)
       */
      override fun maxSpotPriceAsPercentageOfOptimalOnDemandPrice(): Number? =
          unwrap(this).getMaxSpotPriceAsPercentageOfOptimalOnDemandPrice()

      /**
       * The minimum and maximum amount of memory per vCPU for an instance type, in GiB.
       *
       * Default: No minimum or maximum limits
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-instancerequirements.html#cfn-autoscaling-autoscalinggroup-instancerequirements-memorygibpervcpu)
       */
      override fun memoryGiBPerVCpu(): Any? = unwrap(this).getMemoryGiBPerVCpu()

      /**
       * The minimum and maximum instance memory size for an instance type, in MiB.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-instancerequirements.html#cfn-autoscaling-autoscalinggroup-instancerequirements-memorymib)
       */
      override fun memoryMiB(): Any = unwrap(this).getMemoryMiB()

      /**
       * The minimum and maximum amount of network bandwidth, in gigabits per second (Gbps).
       *
       * Default: No minimum or maximum limits
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-instancerequirements.html#cfn-autoscaling-autoscalinggroup-instancerequirements-networkbandwidthgbps)
       */
      override fun networkBandwidthGbps(): Any? = unwrap(this).getNetworkBandwidthGbps()

      /**
       * The minimum and maximum number of network interfaces for an instance type.
       *
       * Default: No minimum or maximum limits
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-instancerequirements.html#cfn-autoscaling-autoscalinggroup-instancerequirements-networkinterfacecount)
       */
      override fun networkInterfaceCount(): Any? = unwrap(this).getNetworkInterfaceCount()

      /**
       * [Price protection] The price protection threshold for On-Demand Instances, as a percentage
       * higher than an identified On-Demand price.
       *
       * The identified On-Demand price is the price of the lowest priced current generation C, M,
       * or R instance type with your specified attributes. If no current generation C, M, or R
       * instance type matches your attributes, then the identified price is from either the lowest
       * priced current generation instance types or, failing that, the lowest priced previous
       * generation instance types that match your attributes. When Amazon EC2 Auto Scaling selects
       * instance types with your attributes, we will exclude instance types whose price exceeds your
       * specified threshold.
       *
       * The parameter accepts an integer, which Amazon EC2 Auto Scaling interprets as a percentage.
       *
       * To turn off price protection, specify a high value, such as `999999` .
       *
       * If you set `DesiredCapacityType` to `vcpu` or `memory-mib` , the price protection threshold
       * is applied based on the per-vCPU or per-memory price instead of the per instance price.
       *
       * Default: `20`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-instancerequirements.html#cfn-autoscaling-autoscalinggroup-instancerequirements-ondemandmaxpricepercentageoverlowestprice)
       */
      override fun onDemandMaxPricePercentageOverLowestPrice(): Number? =
          unwrap(this).getOnDemandMaxPricePercentageOverLowestPrice()

      /**
       * Indicates whether instance types must provide On-Demand Instance hibernation support.
       *
       * Default: `false`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-instancerequirements.html#cfn-autoscaling-autoscalinggroup-instancerequirements-requirehibernatesupport)
       */
      override fun requireHibernateSupport(): Any? = unwrap(this).getRequireHibernateSupport()

      /**
       * [Price protection] The price protection threshold for Spot Instances, as a percentage
       * higher than an identified Spot price.
       *
       * The identified Spot price is the price of the lowest priced current generation C, M, or R
       * instance type with your specified attributes. If no current generation C, M, or R instance
       * type matches your attributes, then the identified price is from either the lowest priced
       * current generation instance types or, failing that, the lowest priced previous generation
       * instance types that match your attributes. When Amazon EC2 Auto Scaling selects instance types
       * with your attributes, we will exclude instance types whose price exceeds your specified
       * threshold.
       *
       * The parameter accepts an integer, which Amazon EC2 Auto Scaling interprets as a percentage.
       *
       * To turn off price protection, specify a high value, such as `999999` .
       *
       * If you set `DesiredCapacityType` to `vcpu` or `memory-mib` , the price protection threshold
       * is based on the per-vCPU or per-memory price instead of the per instance price.
       *
       *
       * Only one of `SpotMaxPricePercentageOverLowestPrice` or
       * `MaxSpotPriceAsPercentageOfOptimalOnDemandPrice` can be specified.
       *
       *
       * Default: `100`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-instancerequirements.html#cfn-autoscaling-autoscalinggroup-instancerequirements-spotmaxpricepercentageoverlowestprice)
       */
      override fun spotMaxPricePercentageOverLowestPrice(): Number? =
          unwrap(this).getSpotMaxPricePercentageOverLowestPrice()

      /**
       * The minimum and maximum total local storage size for an instance type, in GB.
       *
       * Default: No minimum or maximum limits
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-instancerequirements.html#cfn-autoscaling-autoscalinggroup-instancerequirements-totallocalstoragegb)
       */
      override fun totalLocalStorageGb(): Any? = unwrap(this).getTotalLocalStorageGb()

      /**
       * The minimum and maximum number of vCPUs for an instance type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-instancerequirements.html#cfn-autoscaling-autoscalinggroup-instancerequirements-vcpucount)
       */
      override fun vCpuCount(): Any = unwrap(this).getVCpuCount()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InstanceRequirementsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.InstanceRequirementsProperty):
          InstanceRequirementsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InstanceRequirementsProperty):
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.InstanceRequirementsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.InstanceRequirementsProperty
    }
  }

  public interface InstanceMaintenancePolicyProperty {
    /**
     * Specifies the upper threshold as a percentage of the desired capacity of the Auto Scaling
     * group.
     *
     * It represents the maximum percentage of the group that can be in service and healthy, or
     * pending, to support your workload when replacing instances. Value range is 100 to 200. To clear
     * a previously set value, specify a value of `-1` .
     *
     * Both `MinHealthyPercentage` and `MaxHealthyPercentage` must be specified, and the difference
     * between them cannot be greater than 100. A large range increases the number of instances that
     * can be replaced at the same time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-instancemaintenancepolicy.html#cfn-autoscaling-autoscalinggroup-instancemaintenancepolicy-maxhealthypercentage)
     */
    public fun maxHealthyPercentage(): Number? = unwrap(this).getMaxHealthyPercentage()

    /**
     * Specifies the lower threshold as a percentage of the desired capacity of the Auto Scaling
     * group.
     *
     * It represents the minimum percentage of the group to keep in service, healthy, and ready to
     * use to support your workload when replacing instances. Value range is 0 to 100. To clear a
     * previously set value, specify a value of `-1` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-instancemaintenancepolicy.html#cfn-autoscaling-autoscalinggroup-instancemaintenancepolicy-minhealthypercentage)
     */
    public fun minHealthyPercentage(): Number? = unwrap(this).getMinHealthyPercentage()

    /**
     * A builder for [InstanceMaintenancePolicyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param maxHealthyPercentage Specifies the upper threshold as a percentage of the desired
       * capacity of the Auto Scaling group.
       * It represents the maximum percentage of the group that can be in service and healthy, or
       * pending, to support your workload when replacing instances. Value range is 100 to 200. To
       * clear a previously set value, specify a value of `-1` .
       *
       * Both `MinHealthyPercentage` and `MaxHealthyPercentage` must be specified, and the
       * difference between them cannot be greater than 100. A large range increases the number of
       * instances that can be replaced at the same time.
       */
      public fun maxHealthyPercentage(maxHealthyPercentage: Number)

      /**
       * @param minHealthyPercentage Specifies the lower threshold as a percentage of the desired
       * capacity of the Auto Scaling group.
       * It represents the minimum percentage of the group to keep in service, healthy, and ready to
       * use to support your workload when replacing instances. Value range is 0 to 100. To clear a
       * previously set value, specify a value of `-1` .
       */
      public fun minHealthyPercentage(minHealthyPercentage: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.InstanceMaintenancePolicyProperty.Builder
          =
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.InstanceMaintenancePolicyProperty.builder()

      /**
       * @param maxHealthyPercentage Specifies the upper threshold as a percentage of the desired
       * capacity of the Auto Scaling group.
       * It represents the maximum percentage of the group that can be in service and healthy, or
       * pending, to support your workload when replacing instances. Value range is 100 to 200. To
       * clear a previously set value, specify a value of `-1` .
       *
       * Both `MinHealthyPercentage` and `MaxHealthyPercentage` must be specified, and the
       * difference between them cannot be greater than 100. A large range increases the number of
       * instances that can be replaced at the same time.
       */
      override fun maxHealthyPercentage(maxHealthyPercentage: Number) {
        cdkBuilder.maxHealthyPercentage(maxHealthyPercentage)
      }

      /**
       * @param minHealthyPercentage Specifies the lower threshold as a percentage of the desired
       * capacity of the Auto Scaling group.
       * It represents the minimum percentage of the group to keep in service, healthy, and ready to
       * use to support your workload when replacing instances. Value range is 0 to 100. To clear a
       * previously set value, specify a value of `-1` .
       */
      override fun minHealthyPercentage(minHealthyPercentage: Number) {
        cdkBuilder.minHealthyPercentage(minHealthyPercentage)
      }

      public fun build():
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.InstanceMaintenancePolicyProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.InstanceMaintenancePolicyProperty,
    ) : CdkObject(cdkObject), InstanceMaintenancePolicyProperty {
      /**
       * Specifies the upper threshold as a percentage of the desired capacity of the Auto Scaling
       * group.
       *
       * It represents the maximum percentage of the group that can be in service and healthy, or
       * pending, to support your workload when replacing instances. Value range is 100 to 200. To
       * clear a previously set value, specify a value of `-1` .
       *
       * Both `MinHealthyPercentage` and `MaxHealthyPercentage` must be specified, and the
       * difference between them cannot be greater than 100. A large range increases the number of
       * instances that can be replaced at the same time.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-instancemaintenancepolicy.html#cfn-autoscaling-autoscalinggroup-instancemaintenancepolicy-maxhealthypercentage)
       */
      override fun maxHealthyPercentage(): Number? = unwrap(this).getMaxHealthyPercentage()

      /**
       * Specifies the lower threshold as a percentage of the desired capacity of the Auto Scaling
       * group.
       *
       * It represents the minimum percentage of the group to keep in service, healthy, and ready to
       * use to support your workload when replacing instances. Value range is 0 to 100. To clear a
       * previously set value, specify a value of `-1` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-instancemaintenancepolicy.html#cfn-autoscaling-autoscalinggroup-instancemaintenancepolicy-minhealthypercentage)
       */
      override fun minHealthyPercentage(): Number? = unwrap(this).getMinHealthyPercentage()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          InstanceMaintenancePolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.InstanceMaintenancePolicyProperty):
          InstanceMaintenancePolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InstanceMaintenancePolicyProperty):
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.InstanceMaintenancePolicyProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.InstanceMaintenancePolicyProperty
    }
  }

  public interface BaselineEbsBandwidthMbpsRequestProperty {
    /**
     * The maximum value in Mbps.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-baselineebsbandwidthmbpsrequest.html#cfn-autoscaling-autoscalinggroup-baselineebsbandwidthmbpsrequest-max)
     */
    public fun max(): Number? = unwrap(this).getMax()

    /**
     * The minimum value in Mbps.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-baselineebsbandwidthmbpsrequest.html#cfn-autoscaling-autoscalinggroup-baselineebsbandwidthmbpsrequest-min)
     */
    public fun min(): Number? = unwrap(this).getMin()

    /**
     * A builder for [BaselineEbsBandwidthMbpsRequestProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param max The maximum value in Mbps.
       */
      public fun max(max: Number)

      /**
       * @param min The minimum value in Mbps.
       */
      public fun min(min: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.BaselineEbsBandwidthMbpsRequestProperty.Builder
          =
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.BaselineEbsBandwidthMbpsRequestProperty.builder()

      /**
       * @param max The maximum value in Mbps.
       */
      override fun max(max: Number) {
        cdkBuilder.max(max)
      }

      /**
       * @param min The minimum value in Mbps.
       */
      override fun min(min: Number) {
        cdkBuilder.min(min)
      }

      public fun build():
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.BaselineEbsBandwidthMbpsRequestProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.BaselineEbsBandwidthMbpsRequestProperty,
    ) : CdkObject(cdkObject), BaselineEbsBandwidthMbpsRequestProperty {
      /**
       * The maximum value in Mbps.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-baselineebsbandwidthmbpsrequest.html#cfn-autoscaling-autoscalinggroup-baselineebsbandwidthmbpsrequest-max)
       */
      override fun max(): Number? = unwrap(this).getMax()

      /**
       * The minimum value in Mbps.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-baselineebsbandwidthmbpsrequest.html#cfn-autoscaling-autoscalinggroup-baselineebsbandwidthmbpsrequest-min)
       */
      override fun min(): Number? = unwrap(this).getMin()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          BaselineEbsBandwidthMbpsRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.BaselineEbsBandwidthMbpsRequestProperty):
          BaselineEbsBandwidthMbpsRequestProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BaselineEbsBandwidthMbpsRequestProperty):
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.BaselineEbsBandwidthMbpsRequestProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.BaselineEbsBandwidthMbpsRequestProperty
    }
  }

  public interface LifecycleHookSpecificationProperty {
    /**
     * The action the Auto Scaling group takes when the lifecycle hook timeout elapses or if an
     * unexpected failure occurs.
     *
     * The default value is `ABANDON` .
     *
     * Valid values: `CONTINUE` | `ABANDON`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-lifecyclehookspecification.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecification-defaultresult)
     */
    public fun defaultResult(): String? = unwrap(this).getDefaultResult()

    /**
     * The maximum time, in seconds, that can elapse before the lifecycle hook times out.
     *
     * The range is from `30` to `7200` seconds. The default value is `3600` seconds (1 hour).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-lifecyclehookspecification.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecification-heartbeattimeout)
     */
    public fun heartbeatTimeout(): Number? = unwrap(this).getHeartbeatTimeout()

    /**
     * The name of the lifecycle hook.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-lifecyclehookspecification.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecification-lifecyclehookname)
     */
    public fun lifecycleHookName(): String

    /**
     * The lifecycle transition. For Auto Scaling groups, there are two major lifecycle transitions.
     *
     * * To create a lifecycle hook for scale-out events, specify
     * `autoscaling:EC2_INSTANCE_LAUNCHING` .
     * * To create a lifecycle hook for scale-in events, specify
     * `autoscaling:EC2_INSTANCE_TERMINATING` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-lifecyclehookspecification.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecification-lifecycletransition)
     */
    public fun lifecycleTransition(): String

    /**
     * Additional information that you want to include any time Amazon EC2 Auto Scaling sends a
     * message to the notification target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-lifecyclehookspecification.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecification-notificationmetadata)
     */
    public fun notificationMetadata(): String? = unwrap(this).getNotificationMetadata()

    /**
     * The Amazon Resource Name (ARN) of the notification target that Amazon EC2 Auto Scaling sends
     * notifications to when an instance is in a wait state for the lifecycle hook.
     *
     * You can specify an Amazon SNS topic or an Amazon SQS queue.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-lifecyclehookspecification.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecification-notificationtargetarn)
     */
    public fun notificationTargetArn(): String? = unwrap(this).getNotificationTargetArn()

    /**
     * The ARN of the IAM role that allows the Auto Scaling group to publish to the specified
     * notification target.
     *
     * For information about creating this role, see [Configure a notification target for a
     * lifecycle
     * hook](https://docs.aws.amazon.com/autoscaling/ec2/userguide/prepare-for-lifecycle-notifications.html#lifecycle-hook-notification-target)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * Valid only if the notification target is an Amazon SNS topic or an Amazon SQS queue.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-lifecyclehookspecification.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecification-rolearn)
     */
    public fun roleArn(): String? = unwrap(this).getRoleArn()

    /**
     * A builder for [LifecycleHookSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param defaultResult The action the Auto Scaling group takes when the lifecycle hook
       * timeout elapses or if an unexpected failure occurs.
       * The default value is `ABANDON` .
       *
       * Valid values: `CONTINUE` | `ABANDON`
       */
      public fun defaultResult(defaultResult: String)

      /**
       * @param heartbeatTimeout The maximum time, in seconds, that can elapse before the lifecycle
       * hook times out.
       * The range is from `30` to `7200` seconds. The default value is `3600` seconds (1 hour).
       */
      public fun heartbeatTimeout(heartbeatTimeout: Number)

      /**
       * @param lifecycleHookName The name of the lifecycle hook. 
       */
      public fun lifecycleHookName(lifecycleHookName: String)

      /**
       * @param lifecycleTransition The lifecycle transition. For Auto Scaling groups, there are two
       * major lifecycle transitions. 
       * * To create a lifecycle hook for scale-out events, specify
       * `autoscaling:EC2_INSTANCE_LAUNCHING` .
       * * To create a lifecycle hook for scale-in events, specify
       * `autoscaling:EC2_INSTANCE_TERMINATING` .
       */
      public fun lifecycleTransition(lifecycleTransition: String)

      /**
       * @param notificationMetadata Additional information that you want to include any time Amazon
       * EC2 Auto Scaling sends a message to the notification target.
       */
      public fun notificationMetadata(notificationMetadata: String)

      /**
       * @param notificationTargetArn The Amazon Resource Name (ARN) of the notification target that
       * Amazon EC2 Auto Scaling sends notifications to when an instance is in a wait state for the
       * lifecycle hook.
       * You can specify an Amazon SNS topic or an Amazon SQS queue.
       */
      public fun notificationTargetArn(notificationTargetArn: String)

      /**
       * @param roleArn The ARN of the IAM role that allows the Auto Scaling group to publish to the
       * specified notification target.
       * For information about creating this role, see [Configure a notification target for a
       * lifecycle
       * hook](https://docs.aws.amazon.com/autoscaling/ec2/userguide/prepare-for-lifecycle-notifications.html#lifecycle-hook-notification-target)
       * in the *Amazon EC2 Auto Scaling User Guide* .
       *
       * Valid only if the notification target is an Amazon SNS topic or an Amazon SQS queue.
       */
      public fun roleArn(roleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LifecycleHookSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LifecycleHookSpecificationProperty.builder()

      /**
       * @param defaultResult The action the Auto Scaling group takes when the lifecycle hook
       * timeout elapses or if an unexpected failure occurs.
       * The default value is `ABANDON` .
       *
       * Valid values: `CONTINUE` | `ABANDON`
       */
      override fun defaultResult(defaultResult: String) {
        cdkBuilder.defaultResult(defaultResult)
      }

      /**
       * @param heartbeatTimeout The maximum time, in seconds, that can elapse before the lifecycle
       * hook times out.
       * The range is from `30` to `7200` seconds. The default value is `3600` seconds (1 hour).
       */
      override fun heartbeatTimeout(heartbeatTimeout: Number) {
        cdkBuilder.heartbeatTimeout(heartbeatTimeout)
      }

      /**
       * @param lifecycleHookName The name of the lifecycle hook. 
       */
      override fun lifecycleHookName(lifecycleHookName: String) {
        cdkBuilder.lifecycleHookName(lifecycleHookName)
      }

      /**
       * @param lifecycleTransition The lifecycle transition. For Auto Scaling groups, there are two
       * major lifecycle transitions. 
       * * To create a lifecycle hook for scale-out events, specify
       * `autoscaling:EC2_INSTANCE_LAUNCHING` .
       * * To create a lifecycle hook for scale-in events, specify
       * `autoscaling:EC2_INSTANCE_TERMINATING` .
       */
      override fun lifecycleTransition(lifecycleTransition: String) {
        cdkBuilder.lifecycleTransition(lifecycleTransition)
      }

      /**
       * @param notificationMetadata Additional information that you want to include any time Amazon
       * EC2 Auto Scaling sends a message to the notification target.
       */
      override fun notificationMetadata(notificationMetadata: String) {
        cdkBuilder.notificationMetadata(notificationMetadata)
      }

      /**
       * @param notificationTargetArn The Amazon Resource Name (ARN) of the notification target that
       * Amazon EC2 Auto Scaling sends notifications to when an instance is in a wait state for the
       * lifecycle hook.
       * You can specify an Amazon SNS topic or an Amazon SQS queue.
       */
      override fun notificationTargetArn(notificationTargetArn: String) {
        cdkBuilder.notificationTargetArn(notificationTargetArn)
      }

      /**
       * @param roleArn The ARN of the IAM role that allows the Auto Scaling group to publish to the
       * specified notification target.
       * For information about creating this role, see [Configure a notification target for a
       * lifecycle
       * hook](https://docs.aws.amazon.com/autoscaling/ec2/userguide/prepare-for-lifecycle-notifications.html#lifecycle-hook-notification-target)
       * in the *Amazon EC2 Auto Scaling User Guide* .
       *
       * Valid only if the notification target is an Amazon SNS topic or an Amazon SQS queue.
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build():
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LifecycleHookSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LifecycleHookSpecificationProperty,
    ) : CdkObject(cdkObject), LifecycleHookSpecificationProperty {
      /**
       * The action the Auto Scaling group takes when the lifecycle hook timeout elapses or if an
       * unexpected failure occurs.
       *
       * The default value is `ABANDON` .
       *
       * Valid values: `CONTINUE` | `ABANDON`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-lifecyclehookspecification.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecification-defaultresult)
       */
      override fun defaultResult(): String? = unwrap(this).getDefaultResult()

      /**
       * The maximum time, in seconds, that can elapse before the lifecycle hook times out.
       *
       * The range is from `30` to `7200` seconds. The default value is `3600` seconds (1 hour).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-lifecyclehookspecification.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecification-heartbeattimeout)
       */
      override fun heartbeatTimeout(): Number? = unwrap(this).getHeartbeatTimeout()

      /**
       * The name of the lifecycle hook.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-lifecyclehookspecification.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecification-lifecyclehookname)
       */
      override fun lifecycleHookName(): String = unwrap(this).getLifecycleHookName()

      /**
       * The lifecycle transition. For Auto Scaling groups, there are two major lifecycle
       * transitions.
       *
       * * To create a lifecycle hook for scale-out events, specify
       * `autoscaling:EC2_INSTANCE_LAUNCHING` .
       * * To create a lifecycle hook for scale-in events, specify
       * `autoscaling:EC2_INSTANCE_TERMINATING` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-lifecyclehookspecification.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecification-lifecycletransition)
       */
      override fun lifecycleTransition(): String = unwrap(this).getLifecycleTransition()

      /**
       * Additional information that you want to include any time Amazon EC2 Auto Scaling sends a
       * message to the notification target.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-lifecyclehookspecification.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecification-notificationmetadata)
       */
      override fun notificationMetadata(): String? = unwrap(this).getNotificationMetadata()

      /**
       * The Amazon Resource Name (ARN) of the notification target that Amazon EC2 Auto Scaling
       * sends notifications to when an instance is in a wait state for the lifecycle hook.
       *
       * You can specify an Amazon SNS topic or an Amazon SQS queue.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-lifecyclehookspecification.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecification-notificationtargetarn)
       */
      override fun notificationTargetArn(): String? = unwrap(this).getNotificationTargetArn()

      /**
       * The ARN of the IAM role that allows the Auto Scaling group to publish to the specified
       * notification target.
       *
       * For information about creating this role, see [Configure a notification target for a
       * lifecycle
       * hook](https://docs.aws.amazon.com/autoscaling/ec2/userguide/prepare-for-lifecycle-notifications.html#lifecycle-hook-notification-target)
       * in the *Amazon EC2 Auto Scaling User Guide* .
       *
       * Valid only if the notification target is an Amazon SNS topic or an Amazon SQS queue.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-lifecyclehookspecification.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecification-rolearn)
       */
      override fun roleArn(): String? = unwrap(this).getRoleArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          LifecycleHookSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LifecycleHookSpecificationProperty):
          LifecycleHookSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LifecycleHookSpecificationProperty):
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LifecycleHookSpecificationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LifecycleHookSpecificationProperty
    }
  }

  public interface MixedInstancesPolicyProperty {
    /**
     * The instances distribution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-mixedinstancespolicy.html#cfn-autoscaling-autoscalinggroup-mixedinstancespolicy-instancesdistribution)
     */
    public fun instancesDistribution(): Any? = unwrap(this).getInstancesDistribution()

    /**
     * One or more launch templates and the instance types (overrides) that are used to launch EC2
     * instances to fulfill On-Demand and Spot capacities.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-mixedinstancespolicy.html#cfn-autoscaling-autoscalinggroup-mixedinstancespolicy-launchtemplate)
     */
    public fun launchTemplate(): Any

    /**
     * A builder for [MixedInstancesPolicyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param instancesDistribution The instances distribution.
       */
      public fun instancesDistribution(instancesDistribution: IResolvable)

      /**
       * @param instancesDistribution The instances distribution.
       */
      public fun instancesDistribution(instancesDistribution: InstancesDistributionProperty)

      /**
       * @param instancesDistribution The instances distribution.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e03d4866caf69019336418ba081e967544f265959db95c169dda70812c5c4544")
      public
          fun instancesDistribution(instancesDistribution: InstancesDistributionProperty.Builder.() -> Unit)

      /**
       * @param launchTemplate One or more launch templates and the instance types (overrides) that
       * are used to launch EC2 instances to fulfill On-Demand and Spot capacities. 
       */
      public fun launchTemplate(launchTemplate: IResolvable)

      /**
       * @param launchTemplate One or more launch templates and the instance types (overrides) that
       * are used to launch EC2 instances to fulfill On-Demand and Spot capacities. 
       */
      public fun launchTemplate(launchTemplate: LaunchTemplateProperty)

      /**
       * @param launchTemplate One or more launch templates and the instance types (overrides) that
       * are used to launch EC2 instances to fulfill On-Demand and Spot capacities. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8ce44d33aa3fb8b16dd87d85a8716387ee4ee1693a6889cfcfb3e7ce7ded3d33")
      public fun launchTemplate(launchTemplate: LaunchTemplateProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.MixedInstancesPolicyProperty.Builder
          =
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.MixedInstancesPolicyProperty.builder()

      /**
       * @param instancesDistribution The instances distribution.
       */
      override fun instancesDistribution(instancesDistribution: IResolvable) {
        cdkBuilder.instancesDistribution(instancesDistribution.let(IResolvable::unwrap))
      }

      /**
       * @param instancesDistribution The instances distribution.
       */
      override fun instancesDistribution(instancesDistribution: InstancesDistributionProperty) {
        cdkBuilder.instancesDistribution(instancesDistribution.let(InstancesDistributionProperty::unwrap))
      }

      /**
       * @param instancesDistribution The instances distribution.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e03d4866caf69019336418ba081e967544f265959db95c169dda70812c5c4544")
      override
          fun instancesDistribution(instancesDistribution: InstancesDistributionProperty.Builder.() -> Unit):
          Unit = instancesDistribution(InstancesDistributionProperty(instancesDistribution))

      /**
       * @param launchTemplate One or more launch templates and the instance types (overrides) that
       * are used to launch EC2 instances to fulfill On-Demand and Spot capacities. 
       */
      override fun launchTemplate(launchTemplate: IResolvable) {
        cdkBuilder.launchTemplate(launchTemplate.let(IResolvable::unwrap))
      }

      /**
       * @param launchTemplate One or more launch templates and the instance types (overrides) that
       * are used to launch EC2 instances to fulfill On-Demand and Spot capacities. 
       */
      override fun launchTemplate(launchTemplate: LaunchTemplateProperty) {
        cdkBuilder.launchTemplate(launchTemplate.let(LaunchTemplateProperty::unwrap))
      }

      /**
       * @param launchTemplate One or more launch templates and the instance types (overrides) that
       * are used to launch EC2 instances to fulfill On-Demand and Spot capacities. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8ce44d33aa3fb8b16dd87d85a8716387ee4ee1693a6889cfcfb3e7ce7ded3d33")
      override fun launchTemplate(launchTemplate: LaunchTemplateProperty.Builder.() -> Unit): Unit =
          launchTemplate(LaunchTemplateProperty(launchTemplate))

      public fun build():
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.MixedInstancesPolicyProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.MixedInstancesPolicyProperty,
    ) : CdkObject(cdkObject), MixedInstancesPolicyProperty {
      /**
       * The instances distribution.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-mixedinstancespolicy.html#cfn-autoscaling-autoscalinggroup-mixedinstancespolicy-instancesdistribution)
       */
      override fun instancesDistribution(): Any? = unwrap(this).getInstancesDistribution()

      /**
       * One or more launch templates and the instance types (overrides) that are used to launch EC2
       * instances to fulfill On-Demand and Spot capacities.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-mixedinstancespolicy.html#cfn-autoscaling-autoscalinggroup-mixedinstancespolicy-launchtemplate)
       */
      override fun launchTemplate(): Any = unwrap(this).getLaunchTemplate()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MixedInstancesPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.MixedInstancesPolicyProperty):
          MixedInstancesPolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MixedInstancesPolicyProperty):
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.MixedInstancesPolicyProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.MixedInstancesPolicyProperty
    }
  }

  public interface AcceleratorTotalMemoryMiBRequestProperty {
    /**
     * The memory maximum in MiB.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-acceleratortotalmemorymibrequest.html#cfn-autoscaling-autoscalinggroup-acceleratortotalmemorymibrequest-max)
     */
    public fun max(): Number? = unwrap(this).getMax()

    /**
     * The memory minimum in MiB.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-acceleratortotalmemorymibrequest.html#cfn-autoscaling-autoscalinggroup-acceleratortotalmemorymibrequest-min)
     */
    public fun min(): Number? = unwrap(this).getMin()

    /**
     * A builder for [AcceleratorTotalMemoryMiBRequestProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param max The memory maximum in MiB.
       */
      public fun max(max: Number)

      /**
       * @param min The memory minimum in MiB.
       */
      public fun min(min: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.AcceleratorTotalMemoryMiBRequestProperty.Builder
          =
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.AcceleratorTotalMemoryMiBRequestProperty.builder()

      /**
       * @param max The memory maximum in MiB.
       */
      override fun max(max: Number) {
        cdkBuilder.max(max)
      }

      /**
       * @param min The memory minimum in MiB.
       */
      override fun min(min: Number) {
        cdkBuilder.min(min)
      }

      public fun build():
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.AcceleratorTotalMemoryMiBRequestProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.AcceleratorTotalMemoryMiBRequestProperty,
    ) : CdkObject(cdkObject), AcceleratorTotalMemoryMiBRequestProperty {
      /**
       * The memory maximum in MiB.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-acceleratortotalmemorymibrequest.html#cfn-autoscaling-autoscalinggroup-acceleratortotalmemorymibrequest-max)
       */
      override fun max(): Number? = unwrap(this).getMax()

      /**
       * The memory minimum in MiB.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-acceleratortotalmemorymibrequest.html#cfn-autoscaling-autoscalinggroup-acceleratortotalmemorymibrequest-min)
       */
      override fun min(): Number? = unwrap(this).getMin()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AcceleratorTotalMemoryMiBRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.AcceleratorTotalMemoryMiBRequestProperty):
          AcceleratorTotalMemoryMiBRequestProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AcceleratorTotalMemoryMiBRequestProperty):
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.AcceleratorTotalMemoryMiBRequestProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.AcceleratorTotalMemoryMiBRequestProperty
    }
  }

  public interface LaunchTemplateProperty {
    /**
     * The launch template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplate.html#cfn-autoscaling-autoscalinggroup-launchtemplate-launchtemplatespecification)
     */
    public fun launchTemplateSpecification(): Any

    /**
     * Any properties that you specify override the same properties in the launch template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplate.html#cfn-autoscaling-autoscalinggroup-launchtemplate-overrides)
     */
    public fun overrides(): Any? = unwrap(this).getOverrides()

    /**
     * A builder for [LaunchTemplateProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param launchTemplateSpecification The launch template. 
       */
      public fun launchTemplateSpecification(launchTemplateSpecification: IResolvable)

      /**
       * @param launchTemplateSpecification The launch template. 
       */
      public
          fun launchTemplateSpecification(launchTemplateSpecification: LaunchTemplateSpecificationProperty)

      /**
       * @param launchTemplateSpecification The launch template. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("782d4c0c4f990e75a08265698f12ae7348b54caa42bc1d02c7f7bc986706a071")
      public
          fun launchTemplateSpecification(launchTemplateSpecification: LaunchTemplateSpecificationProperty.Builder.() -> Unit)

      /**
       * @param overrides Any properties that you specify override the same properties in the launch
       * template.
       */
      public fun overrides(overrides: IResolvable)

      /**
       * @param overrides Any properties that you specify override the same properties in the launch
       * template.
       */
      public fun overrides(overrides: List<Any>)

      /**
       * @param overrides Any properties that you specify override the same properties in the launch
       * template.
       */
      public fun overrides(vararg overrides: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LaunchTemplateProperty.Builder
          =
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LaunchTemplateProperty.builder()

      /**
       * @param launchTemplateSpecification The launch template. 
       */
      override fun launchTemplateSpecification(launchTemplateSpecification: IResolvable) {
        cdkBuilder.launchTemplateSpecification(launchTemplateSpecification.let(IResolvable::unwrap))
      }

      /**
       * @param launchTemplateSpecification The launch template. 
       */
      override
          fun launchTemplateSpecification(launchTemplateSpecification: LaunchTemplateSpecificationProperty) {
        cdkBuilder.launchTemplateSpecification(launchTemplateSpecification.let(LaunchTemplateSpecificationProperty::unwrap))
      }

      /**
       * @param launchTemplateSpecification The launch template. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("782d4c0c4f990e75a08265698f12ae7348b54caa42bc1d02c7f7bc986706a071")
      override
          fun launchTemplateSpecification(launchTemplateSpecification: LaunchTemplateSpecificationProperty.Builder.() -> Unit):
          Unit =
          launchTemplateSpecification(LaunchTemplateSpecificationProperty(launchTemplateSpecification))

      /**
       * @param overrides Any properties that you specify override the same properties in the launch
       * template.
       */
      override fun overrides(overrides: IResolvable) {
        cdkBuilder.overrides(overrides.let(IResolvable::unwrap))
      }

      /**
       * @param overrides Any properties that you specify override the same properties in the launch
       * template.
       */
      override fun overrides(overrides: List<Any>) {
        cdkBuilder.overrides(overrides)
      }

      /**
       * @param overrides Any properties that you specify override the same properties in the launch
       * template.
       */
      override fun overrides(vararg overrides: Any): Unit = overrides(overrides.toList())

      public fun build():
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LaunchTemplateProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LaunchTemplateProperty,
    ) : CdkObject(cdkObject), LaunchTemplateProperty {
      /**
       * The launch template.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplate.html#cfn-autoscaling-autoscalinggroup-launchtemplate-launchtemplatespecification)
       */
      override fun launchTemplateSpecification(): Any =
          unwrap(this).getLaunchTemplateSpecification()

      /**
       * Any properties that you specify override the same properties in the launch template.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplate.html#cfn-autoscaling-autoscalinggroup-launchtemplate-overrides)
       */
      override fun overrides(): Any? = unwrap(this).getOverrides()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LaunchTemplateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LaunchTemplateProperty):
          LaunchTemplateProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LaunchTemplateProperty):
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LaunchTemplateProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LaunchTemplateProperty
    }
  }
}
