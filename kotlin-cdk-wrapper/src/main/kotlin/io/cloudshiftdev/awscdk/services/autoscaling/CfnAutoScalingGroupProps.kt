@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnAutoScalingGroupProps {
  public fun autoScalingGroupName(): String? = unwrap(this).getAutoScalingGroupName()

  public fun availabilityZones(): List<String> = unwrap(this).getAvailabilityZones() ?: emptyList()

  public fun capacityRebalance(): Any? = unwrap(this).getCapacityRebalance()

  public fun context(): String? = unwrap(this).getContext()

  public fun cooldown(): String? = unwrap(this).getCooldown()

  public fun defaultInstanceWarmup(): Number? = unwrap(this).getDefaultInstanceWarmup()

  public fun desiredCapacity(): String? = unwrap(this).getDesiredCapacity()

  public fun desiredCapacityType(): String? = unwrap(this).getDesiredCapacityType()

  public fun healthCheckGracePeriod(): Number? = unwrap(this).getHealthCheckGracePeriod()

  public fun healthCheckType(): String? = unwrap(this).getHealthCheckType()

  public fun instanceId(): String? = unwrap(this).getInstanceId()

  public fun instanceMaintenancePolicy(): Any? = unwrap(this).getInstanceMaintenancePolicy()

  public fun launchConfigurationName(): String? = unwrap(this).getLaunchConfigurationName()

  public fun launchTemplate(): Any? = unwrap(this).getLaunchTemplate()

  public fun lifecycleHookSpecificationList(): Any? =
      unwrap(this).getLifecycleHookSpecificationList()

  public fun loadBalancerNames(): List<String> = unwrap(this).getLoadBalancerNames() ?: emptyList()

  public fun maxInstanceLifetime(): Number? = unwrap(this).getMaxInstanceLifetime()

  public fun maxSize(): String

  public fun metricsCollection(): Any? = unwrap(this).getMetricsCollection()

  public fun minSize(): String

  public fun mixedInstancesPolicy(): Any? = unwrap(this).getMixedInstancesPolicy()

  public fun newInstancesProtectedFromScaleIn(): Any? =
      unwrap(this).getNewInstancesProtectedFromScaleIn()

  @Deprecated(message = "deprecated in CDK")
  public fun notificationConfiguration(): Any? = unwrap(this).getNotificationConfiguration()

  public fun notificationConfigurations(): Any? = unwrap(this).getNotificationConfigurations()

  public fun placementGroup(): String? = unwrap(this).getPlacementGroup()

  public fun serviceLinkedRoleArn(): String? = unwrap(this).getServiceLinkedRoleArn()

  public fun tags(): List<CfnAutoScalingGroup.TagPropertyProperty> =
      unwrap(this).getTags()?.map(CfnAutoScalingGroup.TagPropertyProperty::wrap) ?: emptyList()

  public fun targetGroupArns(): List<String> = unwrap(this).getTargetGroupArns() ?: emptyList()

  public fun terminationPolicies(): List<String> = unwrap(this).getTerminationPolicies() ?:
      emptyList()

  public fun vpcZoneIdentifier(): List<String> = unwrap(this).getVpcZoneIdentifier() ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun autoScalingGroupName(autoScalingGroupName: String)

    public fun availabilityZones(availabilityZones: List<String>)

    public fun availabilityZones(vararg availabilityZones: String)

    public fun capacityRebalance(capacityRebalance: Boolean)

    public fun capacityRebalance(capacityRebalance: IResolvable)

    public fun context(context: String)

    public fun cooldown(cooldown: String)

    public fun defaultInstanceWarmup(defaultInstanceWarmup: Number)

    public fun desiredCapacity(desiredCapacity: String)

    public fun desiredCapacityType(desiredCapacityType: String)

    public fun healthCheckGracePeriod(healthCheckGracePeriod: Number)

    public fun healthCheckType(healthCheckType: String)

    public fun instanceId(instanceId: String)

    public fun instanceMaintenancePolicy(instanceMaintenancePolicy: IResolvable)

    public
        fun instanceMaintenancePolicy(instanceMaintenancePolicy: CfnAutoScalingGroup.InstanceMaintenancePolicyProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6b0d48265785b3f0727705d28f832f9e192859ebc61568a5d298ddad632a70d8")
    public
        fun instanceMaintenancePolicy(instanceMaintenancePolicy: CfnAutoScalingGroup.InstanceMaintenancePolicyProperty.Builder.() -> Unit)

    public fun launchConfigurationName(launchConfigurationName: String)

    public fun launchTemplate(launchTemplate: IResolvable)

    public
        fun launchTemplate(launchTemplate: CfnAutoScalingGroup.LaunchTemplateSpecificationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5c0fe05a7920ecb5df98e791fda2b030651c2afa15bb42abd61e27dcefc4df1e")
    public
        fun launchTemplate(launchTemplate: CfnAutoScalingGroup.LaunchTemplateSpecificationProperty.Builder.() -> Unit)

    public fun lifecycleHookSpecificationList(lifecycleHookSpecificationList: IResolvable)

    public fun lifecycleHookSpecificationList(lifecycleHookSpecificationList: List<Any>)

    public fun lifecycleHookSpecificationList(vararg lifecycleHookSpecificationList: Any)

    public fun loadBalancerNames(loadBalancerNames: List<String>)

    public fun loadBalancerNames(vararg loadBalancerNames: String)

    public fun maxInstanceLifetime(maxInstanceLifetime: Number)

    public fun maxSize(maxSize: String)

    public fun metricsCollection(metricsCollection: IResolvable)

    public fun metricsCollection(metricsCollection: List<Any>)

    public fun metricsCollection(vararg metricsCollection: Any)

    public fun minSize(minSize: String)

    public fun mixedInstancesPolicy(mixedInstancesPolicy: IResolvable)

    public
        fun mixedInstancesPolicy(mixedInstancesPolicy: CfnAutoScalingGroup.MixedInstancesPolicyProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("76dc5d4b65ef220ec9f2a3ee86f5befdae51fcc8337b79c0cb07eb2c3d831498")
    public
        fun mixedInstancesPolicy(mixedInstancesPolicy: CfnAutoScalingGroup.MixedInstancesPolicyProperty.Builder.() -> Unit)

    public fun newInstancesProtectedFromScaleIn(newInstancesProtectedFromScaleIn: Boolean)

    public fun newInstancesProtectedFromScaleIn(newInstancesProtectedFromScaleIn: IResolvable)

    @Deprecated(message = "deprecated in CDK")
    public fun notificationConfiguration(notificationConfiguration: IResolvable)

    @Deprecated(message = "deprecated in CDK")
    public
        fun notificationConfiguration(notificationConfiguration: CfnAutoScalingGroup.NotificationConfigurationProperty)

    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3305a7c43182d0bd5a6ae4ae705e674d302f9313c1c27a174ac6a1c974061ea0")
    public
        fun notificationConfiguration(notificationConfiguration: CfnAutoScalingGroup.NotificationConfigurationProperty.Builder.() -> Unit)

    public fun notificationConfigurations(notificationConfigurations: IResolvable)

    public fun notificationConfigurations(notificationConfigurations: List<Any>)

    public fun notificationConfigurations(vararg notificationConfigurations: Any)

    public fun placementGroup(placementGroup: String)

    public fun serviceLinkedRoleArn(serviceLinkedRoleArn: String)

    public fun tags(tags: List<CfnAutoScalingGroup.TagPropertyProperty>)

    public fun tags(vararg tags: CfnAutoScalingGroup.TagPropertyProperty)

    public fun targetGroupArns(targetGroupArns: List<String>)

    public fun targetGroupArns(vararg targetGroupArns: String)

    public fun terminationPolicies(terminationPolicies: List<String>)

    public fun terminationPolicies(vararg terminationPolicies: String)

    public fun vpcZoneIdentifier(vpcZoneIdentifier: List<String>)

    public fun vpcZoneIdentifier(vararg vpcZoneIdentifier: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroupProps.Builder =
        software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroupProps.builder()

    override fun autoScalingGroupName(autoScalingGroupName: String) {
      cdkBuilder.autoScalingGroupName(autoScalingGroupName)
    }

    override fun availabilityZones(availabilityZones: List<String>) {
      cdkBuilder.availabilityZones(availabilityZones)
    }

    override fun availabilityZones(vararg availabilityZones: String): Unit =
        availabilityZones(availabilityZones.toList())

    override fun capacityRebalance(capacityRebalance: Boolean) {
      cdkBuilder.capacityRebalance(capacityRebalance)
    }

    override fun capacityRebalance(capacityRebalance: IResolvable) {
      cdkBuilder.capacityRebalance(capacityRebalance.let(IResolvable::unwrap))
    }

    override fun context(context: String) {
      cdkBuilder.context(context)
    }

    override fun cooldown(cooldown: String) {
      cdkBuilder.cooldown(cooldown)
    }

    override fun defaultInstanceWarmup(defaultInstanceWarmup: Number) {
      cdkBuilder.defaultInstanceWarmup(defaultInstanceWarmup)
    }

    override fun desiredCapacity(desiredCapacity: String) {
      cdkBuilder.desiredCapacity(desiredCapacity)
    }

    override fun desiredCapacityType(desiredCapacityType: String) {
      cdkBuilder.desiredCapacityType(desiredCapacityType)
    }

    override fun healthCheckGracePeriod(healthCheckGracePeriod: Number) {
      cdkBuilder.healthCheckGracePeriod(healthCheckGracePeriod)
    }

    override fun healthCheckType(healthCheckType: String) {
      cdkBuilder.healthCheckType(healthCheckType)
    }

    override fun instanceId(instanceId: String) {
      cdkBuilder.instanceId(instanceId)
    }

    override fun instanceMaintenancePolicy(instanceMaintenancePolicy: IResolvable) {
      cdkBuilder.instanceMaintenancePolicy(instanceMaintenancePolicy.let(IResolvable::unwrap))
    }

    override
        fun instanceMaintenancePolicy(instanceMaintenancePolicy: CfnAutoScalingGroup.InstanceMaintenancePolicyProperty) {
      cdkBuilder.instanceMaintenancePolicy(instanceMaintenancePolicy.let(CfnAutoScalingGroup.InstanceMaintenancePolicyProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6b0d48265785b3f0727705d28f832f9e192859ebc61568a5d298ddad632a70d8")
    override
        fun instanceMaintenancePolicy(instanceMaintenancePolicy: CfnAutoScalingGroup.InstanceMaintenancePolicyProperty.Builder.() -> Unit):
        Unit =
        instanceMaintenancePolicy(CfnAutoScalingGroup.InstanceMaintenancePolicyProperty(instanceMaintenancePolicy))

    override fun launchConfigurationName(launchConfigurationName: String) {
      cdkBuilder.launchConfigurationName(launchConfigurationName)
    }

    override fun launchTemplate(launchTemplate: IResolvable) {
      cdkBuilder.launchTemplate(launchTemplate.let(IResolvable::unwrap))
    }

    override
        fun launchTemplate(launchTemplate: CfnAutoScalingGroup.LaunchTemplateSpecificationProperty) {
      cdkBuilder.launchTemplate(launchTemplate.let(CfnAutoScalingGroup.LaunchTemplateSpecificationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5c0fe05a7920ecb5df98e791fda2b030651c2afa15bb42abd61e27dcefc4df1e")
    override
        fun launchTemplate(launchTemplate: CfnAutoScalingGroup.LaunchTemplateSpecificationProperty.Builder.() -> Unit):
        Unit =
        launchTemplate(CfnAutoScalingGroup.LaunchTemplateSpecificationProperty(launchTemplate))

    override fun lifecycleHookSpecificationList(lifecycleHookSpecificationList: IResolvable) {
      cdkBuilder.lifecycleHookSpecificationList(lifecycleHookSpecificationList.let(IResolvable::unwrap))
    }

    override fun lifecycleHookSpecificationList(lifecycleHookSpecificationList: List<Any>) {
      cdkBuilder.lifecycleHookSpecificationList(lifecycleHookSpecificationList)
    }

    override fun lifecycleHookSpecificationList(vararg lifecycleHookSpecificationList: Any): Unit =
        lifecycleHookSpecificationList(lifecycleHookSpecificationList.toList())

    override fun loadBalancerNames(loadBalancerNames: List<String>) {
      cdkBuilder.loadBalancerNames(loadBalancerNames)
    }

    override fun loadBalancerNames(vararg loadBalancerNames: String): Unit =
        loadBalancerNames(loadBalancerNames.toList())

    override fun maxInstanceLifetime(maxInstanceLifetime: Number) {
      cdkBuilder.maxInstanceLifetime(maxInstanceLifetime)
    }

    override fun maxSize(maxSize: String) {
      cdkBuilder.maxSize(maxSize)
    }

    override fun metricsCollection(metricsCollection: IResolvable) {
      cdkBuilder.metricsCollection(metricsCollection.let(IResolvable::unwrap))
    }

    override fun metricsCollection(metricsCollection: List<Any>) {
      cdkBuilder.metricsCollection(metricsCollection)
    }

    override fun metricsCollection(vararg metricsCollection: Any): Unit =
        metricsCollection(metricsCollection.toList())

    override fun minSize(minSize: String) {
      cdkBuilder.minSize(minSize)
    }

    override fun mixedInstancesPolicy(mixedInstancesPolicy: IResolvable) {
      cdkBuilder.mixedInstancesPolicy(mixedInstancesPolicy.let(IResolvable::unwrap))
    }

    override
        fun mixedInstancesPolicy(mixedInstancesPolicy: CfnAutoScalingGroup.MixedInstancesPolicyProperty) {
      cdkBuilder.mixedInstancesPolicy(mixedInstancesPolicy.let(CfnAutoScalingGroup.MixedInstancesPolicyProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("76dc5d4b65ef220ec9f2a3ee86f5befdae51fcc8337b79c0cb07eb2c3d831498")
    override
        fun mixedInstancesPolicy(mixedInstancesPolicy: CfnAutoScalingGroup.MixedInstancesPolicyProperty.Builder.() -> Unit):
        Unit =
        mixedInstancesPolicy(CfnAutoScalingGroup.MixedInstancesPolicyProperty(mixedInstancesPolicy))

    override fun newInstancesProtectedFromScaleIn(newInstancesProtectedFromScaleIn: Boolean) {
      cdkBuilder.newInstancesProtectedFromScaleIn(newInstancesProtectedFromScaleIn)
    }

    override fun newInstancesProtectedFromScaleIn(newInstancesProtectedFromScaleIn: IResolvable) {
      cdkBuilder.newInstancesProtectedFromScaleIn(newInstancesProtectedFromScaleIn.let(IResolvable::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    override fun notificationConfiguration(notificationConfiguration: IResolvable) {
      cdkBuilder.notificationConfiguration(notificationConfiguration.let(IResolvable::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    override
        fun notificationConfiguration(notificationConfiguration: CfnAutoScalingGroup.NotificationConfigurationProperty) {
      cdkBuilder.notificationConfiguration(notificationConfiguration.let(CfnAutoScalingGroup.NotificationConfigurationProperty::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3305a7c43182d0bd5a6ae4ae705e674d302f9313c1c27a174ac6a1c974061ea0")
    override
        fun notificationConfiguration(notificationConfiguration: CfnAutoScalingGroup.NotificationConfigurationProperty.Builder.() -> Unit):
        Unit =
        notificationConfiguration(CfnAutoScalingGroup.NotificationConfigurationProperty(notificationConfiguration))

    override fun notificationConfigurations(notificationConfigurations: IResolvable) {
      cdkBuilder.notificationConfigurations(notificationConfigurations.let(IResolvable::unwrap))
    }

    override fun notificationConfigurations(notificationConfigurations: List<Any>) {
      cdkBuilder.notificationConfigurations(notificationConfigurations)
    }

    override fun notificationConfigurations(vararg notificationConfigurations: Any): Unit =
        notificationConfigurations(notificationConfigurations.toList())

    override fun placementGroup(placementGroup: String) {
      cdkBuilder.placementGroup(placementGroup)
    }

    override fun serviceLinkedRoleArn(serviceLinkedRoleArn: String) {
      cdkBuilder.serviceLinkedRoleArn(serviceLinkedRoleArn)
    }

    override fun tags(tags: List<CfnAutoScalingGroup.TagPropertyProperty>) {
      cdkBuilder.tags(tags.map(CfnAutoScalingGroup.TagPropertyProperty::unwrap))
    }

    override fun tags(vararg tags: CfnAutoScalingGroup.TagPropertyProperty): Unit =
        tags(tags.toList())

    override fun targetGroupArns(targetGroupArns: List<String>) {
      cdkBuilder.targetGroupArns(targetGroupArns)
    }

    override fun targetGroupArns(vararg targetGroupArns: String): Unit =
        targetGroupArns(targetGroupArns.toList())

    override fun terminationPolicies(terminationPolicies: List<String>) {
      cdkBuilder.terminationPolicies(terminationPolicies)
    }

    override fun terminationPolicies(vararg terminationPolicies: String): Unit =
        terminationPolicies(terminationPolicies.toList())

    override fun vpcZoneIdentifier(vpcZoneIdentifier: List<String>) {
      cdkBuilder.vpcZoneIdentifier(vpcZoneIdentifier)
    }

    override fun vpcZoneIdentifier(vararg vpcZoneIdentifier: String): Unit =
        vpcZoneIdentifier(vpcZoneIdentifier.toList())

    public fun build(): software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroupProps,
  ) : CdkObject(cdkObject), CfnAutoScalingGroupProps {
    override fun autoScalingGroupName(): String? = unwrap(this).getAutoScalingGroupName()

    override fun availabilityZones(): List<String> = unwrap(this).getAvailabilityZones() ?:
        emptyList()

    override fun capacityRebalance(): Any? = unwrap(this).getCapacityRebalance()

    override fun context(): String? = unwrap(this).getContext()

    override fun cooldown(): String? = unwrap(this).getCooldown()

    override fun defaultInstanceWarmup(): Number? = unwrap(this).getDefaultInstanceWarmup()

    override fun desiredCapacity(): String? = unwrap(this).getDesiredCapacity()

    override fun desiredCapacityType(): String? = unwrap(this).getDesiredCapacityType()

    override fun healthCheckGracePeriod(): Number? = unwrap(this).getHealthCheckGracePeriod()

    override fun healthCheckType(): String? = unwrap(this).getHealthCheckType()

    override fun instanceId(): String? = unwrap(this).getInstanceId()

    override fun instanceMaintenancePolicy(): Any? = unwrap(this).getInstanceMaintenancePolicy()

    override fun launchConfigurationName(): String? = unwrap(this).getLaunchConfigurationName()

    override fun launchTemplate(): Any? = unwrap(this).getLaunchTemplate()

    override fun lifecycleHookSpecificationList(): Any? =
        unwrap(this).getLifecycleHookSpecificationList()

    override fun loadBalancerNames(): List<String> = unwrap(this).getLoadBalancerNames() ?:
        emptyList()

    override fun maxInstanceLifetime(): Number? = unwrap(this).getMaxInstanceLifetime()

    override fun maxSize(): String = unwrap(this).getMaxSize()

    override fun metricsCollection(): Any? = unwrap(this).getMetricsCollection()

    override fun minSize(): String = unwrap(this).getMinSize()

    override fun mixedInstancesPolicy(): Any? = unwrap(this).getMixedInstancesPolicy()

    override fun newInstancesProtectedFromScaleIn(): Any? =
        unwrap(this).getNewInstancesProtectedFromScaleIn()

    @Deprecated(message = "deprecated in CDK")
    override fun notificationConfiguration(): Any? = unwrap(this).getNotificationConfiguration()

    override fun notificationConfigurations(): Any? = unwrap(this).getNotificationConfigurations()

    override fun placementGroup(): String? = unwrap(this).getPlacementGroup()

    override fun serviceLinkedRoleArn(): String? = unwrap(this).getServiceLinkedRoleArn()

    override fun tags(): List<CfnAutoScalingGroup.TagPropertyProperty> =
        unwrap(this).getTags()?.map(CfnAutoScalingGroup.TagPropertyProperty::wrap) ?: emptyList()

    override fun targetGroupArns(): List<String> = unwrap(this).getTargetGroupArns() ?: emptyList()

    override fun terminationPolicies(): List<String> = unwrap(this).getTerminationPolicies() ?:
        emptyList()

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
        CfnAutoScalingGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAutoScalingGroupProps):
        software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroupProps
  }
}
