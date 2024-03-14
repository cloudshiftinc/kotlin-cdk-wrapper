package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
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
  private val cdkObject: software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun autoScalingGroupName(): String? = unwrap(this).getAutoScalingGroupName()

  public open fun autoScalingGroupName(`value`: String) {
    unwrap(this).setAutoScalingGroupName(`value`)
  }

  public open fun availabilityZones(): List<String> = unwrap(this).getAvailabilityZones() ?:
      emptyList()

  public open fun availabilityZones(`value`: List<String>) {
    unwrap(this).setAvailabilityZones(`value`)
  }

  public open fun capacityRebalance(): Any? = unwrap(this).getCapacityRebalance()

  public open fun capacityRebalance(`value`: Boolean) {
    unwrap(this).setCapacityRebalance(`value`)
  }

  public open fun capacityRebalance(`value`: IResolvable) {
    unwrap(this).setCapacityRebalance(`value`.let(IResolvable::unwrap))
  }

  public open fun context(): String? = unwrap(this).getContext()

  public open fun context(`value`: String) {
    unwrap(this).setContext(`value`)
  }

  public open fun cooldown(): String? = unwrap(this).getCooldown()

  public open fun cooldown(`value`: String) {
    unwrap(this).setCooldown(`value`)
  }

  public open fun defaultInstanceWarmup(): Number? = unwrap(this).getDefaultInstanceWarmup()

  public open fun defaultInstanceWarmup(`value`: Number) {
    unwrap(this).setDefaultInstanceWarmup(`value`)
  }

  public open fun desiredCapacity(): String? = unwrap(this).getDesiredCapacity()

  public open fun desiredCapacity(`value`: String) {
    unwrap(this).setDesiredCapacity(`value`)
  }

  public open fun desiredCapacityType(): String? = unwrap(this).getDesiredCapacityType()

  public open fun desiredCapacityType(`value`: String) {
    unwrap(this).setDesiredCapacityType(`value`)
  }

  public open fun healthCheckGracePeriod(): Number? = unwrap(this).getHealthCheckGracePeriod()

  public open fun healthCheckGracePeriod(`value`: Number) {
    unwrap(this).setHealthCheckGracePeriod(`value`)
  }

  public open fun healthCheckType(): String? = unwrap(this).getHealthCheckType()

  public open fun healthCheckType(`value`: String) {
    unwrap(this).setHealthCheckType(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun instanceId(): String? = unwrap(this).getInstanceId()

  public open fun instanceId(`value`: String) {
    unwrap(this).setInstanceId(`value`)
  }

  public open fun instanceMaintenancePolicy(): Any? = unwrap(this).getInstanceMaintenancePolicy()

  public open fun instanceMaintenancePolicy(`value`: IResolvable) {
    unwrap(this).setInstanceMaintenancePolicy(`value`.let(IResolvable::unwrap))
  }

  public open fun instanceMaintenancePolicy(`value`: InstanceMaintenancePolicyProperty) {
    unwrap(this).setInstanceMaintenancePolicy(`value`.let(InstanceMaintenancePolicyProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f5589b948c6edc939d9b439b9912d34e4ae4c3d6ccafb514dc9cd40139931f49")
  public open
      fun instanceMaintenancePolicy(`value`: InstanceMaintenancePolicyProperty.Builder.() -> Unit):
      Unit = instanceMaintenancePolicy(InstanceMaintenancePolicyProperty(`value`))

  public open fun launchConfigurationName(): String? = unwrap(this).getLaunchConfigurationName()

  public open fun launchConfigurationName(`value`: String) {
    unwrap(this).setLaunchConfigurationName(`value`)
  }

  public open fun launchTemplate(): Any? = unwrap(this).getLaunchTemplate()

  public open fun launchTemplate(`value`: IResolvable) {
    unwrap(this).setLaunchTemplate(`value`.let(IResolvable::unwrap))
  }

  public open fun launchTemplate(`value`: LaunchTemplateSpecificationProperty) {
    unwrap(this).setLaunchTemplate(`value`.let(LaunchTemplateSpecificationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d8b91fdeaaeeb0873592358f964a1306a1abf7472d4f22a9721bd95e480a7b88")
  public open fun launchTemplate(`value`: LaunchTemplateSpecificationProperty.Builder.() -> Unit):
      Unit = launchTemplate(LaunchTemplateSpecificationProperty(`value`))

  public open fun lifecycleHookSpecificationList(): Any? =
      unwrap(this).getLifecycleHookSpecificationList()

  public open fun lifecycleHookSpecificationList(`value`: IResolvable) {
    unwrap(this).setLifecycleHookSpecificationList(`value`.let(IResolvable::unwrap))
  }

  public open fun lifecycleHookSpecificationList(__idx_ac66f0: List<Any>) {
    unwrap(this).setLifecycleHookSpecificationList(__idx_ac66f0)
  }

  public open fun loadBalancerNames(): List<String> = unwrap(this).getLoadBalancerNames() ?:
      emptyList()

  public open fun loadBalancerNames(`value`: List<String>) {
    unwrap(this).setLoadBalancerNames(`value`)
  }

  public open fun maxInstanceLifetime(): Number? = unwrap(this).getMaxInstanceLifetime()

  public open fun maxInstanceLifetime(`value`: Number) {
    unwrap(this).setMaxInstanceLifetime(`value`)
  }

  public open fun maxSize(): String = unwrap(this).getMaxSize()

  public open fun maxSize(`value`: String) {
    unwrap(this).setMaxSize(`value`)
  }

  public open fun metricsCollection(): Any? = unwrap(this).getMetricsCollection()

  public open fun metricsCollection(`value`: IResolvable) {
    unwrap(this).setMetricsCollection(`value`.let(IResolvable::unwrap))
  }

  public open fun metricsCollection(__idx_ac66f0: List<Any>) {
    unwrap(this).setMetricsCollection(__idx_ac66f0)
  }

  public open fun minSize(): String = unwrap(this).getMinSize()

  public open fun minSize(`value`: String) {
    unwrap(this).setMinSize(`value`)
  }

  public open fun mixedInstancesPolicy(): Any? = unwrap(this).getMixedInstancesPolicy()

  public open fun mixedInstancesPolicy(`value`: IResolvable) {
    unwrap(this).setMixedInstancesPolicy(`value`.let(IResolvable::unwrap))
  }

  public open fun mixedInstancesPolicy(`value`: MixedInstancesPolicyProperty) {
    unwrap(this).setMixedInstancesPolicy(`value`.let(MixedInstancesPolicyProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0ab6466be8cd85bf09fdb079a845df267673eb353c6cb64f674d8cc6a9e910c5")
  public open fun mixedInstancesPolicy(`value`: MixedInstancesPolicyProperty.Builder.() -> Unit):
      Unit = mixedInstancesPolicy(MixedInstancesPolicyProperty(`value`))

  public open fun newInstancesProtectedFromScaleIn(): Any? =
      unwrap(this).getNewInstancesProtectedFromScaleIn()

  public open fun newInstancesProtectedFromScaleIn(`value`: Boolean) {
    unwrap(this).setNewInstancesProtectedFromScaleIn(`value`)
  }

  public open fun newInstancesProtectedFromScaleIn(`value`: IResolvable) {
    unwrap(this).setNewInstancesProtectedFromScaleIn(`value`.let(IResolvable::unwrap))
  }

  @Deprecated(message = "deprecated in CDK")
  public open fun notificationConfiguration(): Any? = unwrap(this).getNotificationConfiguration()

  @Deprecated(message = "deprecated in CDK")
  public open fun notificationConfiguration(`value`: IResolvable) {
    unwrap(this).setNotificationConfiguration(`value`.let(IResolvable::unwrap))
  }

  @Deprecated(message = "deprecated in CDK")
  public open fun notificationConfiguration(`value`: NotificationConfigurationProperty) {
    unwrap(this).setNotificationConfiguration(`value`.let(NotificationConfigurationProperty::unwrap))
  }

  @Deprecated(message = "deprecated in CDK")
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d407dd344718eb317427d393e4a69e16a701c43800c71bc614f4437883d40586")
  public open
      fun notificationConfiguration(`value`: NotificationConfigurationProperty.Builder.() -> Unit):
      Unit = notificationConfiguration(NotificationConfigurationProperty(`value`))

  public open fun notificationConfigurations(): Any? = unwrap(this).getNotificationConfigurations()

  public open fun notificationConfigurations(`value`: IResolvable) {
    unwrap(this).setNotificationConfigurations(`value`.let(IResolvable::unwrap))
  }

  public open fun notificationConfigurations(__idx_ac66f0: List<Any>) {
    unwrap(this).setNotificationConfigurations(__idx_ac66f0)
  }

  public open fun placementGroup(): String? = unwrap(this).getPlacementGroup()

  public open fun placementGroup(`value`: String) {
    unwrap(this).setPlacementGroup(`value`)
  }

  public open fun serviceLinkedRoleArn(): String? = unwrap(this).getServiceLinkedRoleArn()

  public open fun serviceLinkedRoleArn(`value`: String) {
    unwrap(this).setServiceLinkedRoleArn(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<TagPropertyProperty> =
      unwrap(this).getTagsRaw()?.map(TagPropertyProperty::wrap) ?: emptyList()

  public open fun tagsRaw(`value`: List<TagPropertyProperty>) {
    unwrap(this).setTagsRaw(`value`.map(TagPropertyProperty::unwrap))
  }

  public open fun targetGroupArns(): List<String> = unwrap(this).getTargetGroupArns() ?: emptyList()

  public open fun targetGroupArns(`value`: List<String>) {
    unwrap(this).setTargetGroupArns(`value`)
  }

  public open fun terminationPolicies(): List<String> = unwrap(this).getTerminationPolicies() ?:
      emptyList()

  public open fun terminationPolicies(`value`: List<String>) {
    unwrap(this).setTerminationPolicies(`value`)
  }

  public open fun vpcZoneIdentifier(): List<String> = unwrap(this).getVpcZoneIdentifier() ?:
      emptyList()

  public open fun vpcZoneIdentifier(`value`: List<String>) {
    unwrap(this).setVpcZoneIdentifier(`value`)
  }

  public interface Builder {
    public fun autoScalingGroupName(autoScalingGroupName: String) {
    }

    public fun availabilityZones(availabilityZones: List<String>) {
    }

    public fun capacityRebalance(capacityRebalance: Boolean) {
    }

    public fun capacityRebalance(capacityRebalance: IResolvable) {
    }

    public fun context(context: String) {
    }

    public fun cooldown(cooldown: String) {
    }

    public fun defaultInstanceWarmup(defaultInstanceWarmup: Number) {
    }

    public fun desiredCapacity(desiredCapacity: String) {
    }

    public fun desiredCapacityType(desiredCapacityType: String) {
    }

    public fun healthCheckGracePeriod(healthCheckGracePeriod: Number) {
    }

    public fun healthCheckType(healthCheckType: String) {
    }

    public fun instanceId(instanceId: String) {
    }

    public fun instanceMaintenancePolicy(instanceMaintenancePolicy: IResolvable) {
    }

    public
        fun instanceMaintenancePolicy(instanceMaintenancePolicy: InstanceMaintenancePolicyProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1b31a935f878d6378f68b18f226cb9517d4642a7e37455a7770205f6bb21c964")
    public
        fun instanceMaintenancePolicy(instanceMaintenancePolicy: InstanceMaintenancePolicyProperty.Builder.() -> Unit) {
    }

    public fun launchConfigurationName(launchConfigurationName: String) {
    }

    public fun launchTemplate(launchTemplate: IResolvable) {
    }

    public fun launchTemplate(launchTemplate: LaunchTemplateSpecificationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4400d81b41005748e36414987dda265ab35efce6e88dfd5d285d0fd08dab830f")
    public
        fun launchTemplate(launchTemplate: LaunchTemplateSpecificationProperty.Builder.() -> Unit) {
    }

    public fun lifecycleHookSpecificationList(lifecycleHookSpecificationList: IResolvable) {
    }

    public fun lifecycleHookSpecificationList(lifecycleHookSpecificationList: List<Any>) {
    }

    public fun loadBalancerNames(loadBalancerNames: List<String>) {
    }

    public fun maxInstanceLifetime(maxInstanceLifetime: Number) {
    }

    public fun maxSize(maxSize: String) {
    }

    public fun metricsCollection(metricsCollection: IResolvable) {
    }

    public fun metricsCollection(metricsCollection: List<Any>) {
    }

    public fun minSize(minSize: String) {
    }

    public fun mixedInstancesPolicy(mixedInstancesPolicy: IResolvable) {
    }

    public fun mixedInstancesPolicy(mixedInstancesPolicy: MixedInstancesPolicyProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("225b9b144c2f54944bd28485b6bb3492a765f1d00ca05604123531373cae2a81")
    public
        fun mixedInstancesPolicy(mixedInstancesPolicy: MixedInstancesPolicyProperty.Builder.() -> Unit) {
    }

    public fun newInstancesProtectedFromScaleIn(newInstancesProtectedFromScaleIn: Boolean) {
    }

    public fun newInstancesProtectedFromScaleIn(newInstancesProtectedFromScaleIn: IResolvable) {
    }

    @Deprecated(message = "deprecated in CDK")
    public fun notificationConfiguration(notificationConfiguration: IResolvable) {
    }

    @Deprecated(message = "deprecated in CDK")
    public
        fun notificationConfiguration(notificationConfiguration: NotificationConfigurationProperty) {
    }

    @Deprecated(message = "deprecated in CDK")
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8a4b1af8972202b84a7387964643523d0d39173add845a86f803ad0c280243a9")
    public
        fun notificationConfiguration(notificationConfiguration: NotificationConfigurationProperty.Builder.() -> Unit) {
    }

    public fun notificationConfigurations(notificationConfigurations: IResolvable) {
    }

    public fun notificationConfigurations(notificationConfigurations: List<Any>) {
    }

    public fun placementGroup(placementGroup: String) {
    }

    public fun serviceLinkedRoleArn(serviceLinkedRoleArn: String) {
    }

    public fun tags(tags: List<TagPropertyProperty>) {
    }

    public fun targetGroupArns(targetGroupArns: List<String>) {
    }

    public fun terminationPolicies(terminationPolicies: List<String>) {
    }

    public fun vpcZoneIdentifier(vpcZoneIdentifier: List<String>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.Builder
        = software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.Builder.create(scope, id)

    public override fun autoScalingGroupName(autoScalingGroupName: String) {
      cdkBuilder.autoScalingGroupName(autoScalingGroupName)
    }

    public override fun availabilityZones(availabilityZones: List<String>) {
      cdkBuilder.availabilityZones(availabilityZones)
    }

    public override fun capacityRebalance(capacityRebalance: Boolean) {
      cdkBuilder.capacityRebalance(capacityRebalance)
    }

    public override fun capacityRebalance(capacityRebalance: IResolvable) {
      cdkBuilder.capacityRebalance(capacityRebalance.let(IResolvable::unwrap))
    }

    public override fun context(context: String) {
      cdkBuilder.context(context)
    }

    public override fun cooldown(cooldown: String) {
      cdkBuilder.cooldown(cooldown)
    }

    public override fun defaultInstanceWarmup(defaultInstanceWarmup: Number) {
      cdkBuilder.defaultInstanceWarmup(defaultInstanceWarmup)
    }

    public override fun desiredCapacity(desiredCapacity: String) {
      cdkBuilder.desiredCapacity(desiredCapacity)
    }

    public override fun desiredCapacityType(desiredCapacityType: String) {
      cdkBuilder.desiredCapacityType(desiredCapacityType)
    }

    public override fun healthCheckGracePeriod(healthCheckGracePeriod: Number) {
      cdkBuilder.healthCheckGracePeriod(healthCheckGracePeriod)
    }

    public override fun healthCheckType(healthCheckType: String) {
      cdkBuilder.healthCheckType(healthCheckType)
    }

    public override fun instanceId(instanceId: String) {
      cdkBuilder.instanceId(instanceId)
    }

    public override fun instanceMaintenancePolicy(instanceMaintenancePolicy: IResolvable) {
      cdkBuilder.instanceMaintenancePolicy(instanceMaintenancePolicy.let(IResolvable::unwrap))
    }

    public override
        fun instanceMaintenancePolicy(instanceMaintenancePolicy: InstanceMaintenancePolicyProperty) {
      cdkBuilder.instanceMaintenancePolicy(instanceMaintenancePolicy.let(InstanceMaintenancePolicyProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1b31a935f878d6378f68b18f226cb9517d4642a7e37455a7770205f6bb21c964")
    public override
        fun instanceMaintenancePolicy(instanceMaintenancePolicy: InstanceMaintenancePolicyProperty.Builder.() -> Unit):
        Unit =
        instanceMaintenancePolicy(InstanceMaintenancePolicyProperty(instanceMaintenancePolicy))

    public override fun launchConfigurationName(launchConfigurationName: String) {
      cdkBuilder.launchConfigurationName(launchConfigurationName)
    }

    public override fun launchTemplate(launchTemplate: IResolvable) {
      cdkBuilder.launchTemplate(launchTemplate.let(IResolvable::unwrap))
    }

    public override fun launchTemplate(launchTemplate: LaunchTemplateSpecificationProperty) {
      cdkBuilder.launchTemplate(launchTemplate.let(LaunchTemplateSpecificationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4400d81b41005748e36414987dda265ab35efce6e88dfd5d285d0fd08dab830f")
    public override
        fun launchTemplate(launchTemplate: LaunchTemplateSpecificationProperty.Builder.() -> Unit):
        Unit = launchTemplate(LaunchTemplateSpecificationProperty(launchTemplate))

    public override
        fun lifecycleHookSpecificationList(lifecycleHookSpecificationList: IResolvable) {
      cdkBuilder.lifecycleHookSpecificationList(lifecycleHookSpecificationList.let(IResolvable::unwrap))
    }

    public override fun lifecycleHookSpecificationList(lifecycleHookSpecificationList: List<Any>) {
      cdkBuilder.lifecycleHookSpecificationList(lifecycleHookSpecificationList)
    }

    public override fun loadBalancerNames(loadBalancerNames: List<String>) {
      cdkBuilder.loadBalancerNames(loadBalancerNames)
    }

    public override fun maxInstanceLifetime(maxInstanceLifetime: Number) {
      cdkBuilder.maxInstanceLifetime(maxInstanceLifetime)
    }

    public override fun maxSize(maxSize: String) {
      cdkBuilder.maxSize(maxSize)
    }

    public override fun metricsCollection(metricsCollection: IResolvable) {
      cdkBuilder.metricsCollection(metricsCollection.let(IResolvable::unwrap))
    }

    public override fun metricsCollection(metricsCollection: List<Any>) {
      cdkBuilder.metricsCollection(metricsCollection)
    }

    public override fun minSize(minSize: String) {
      cdkBuilder.minSize(minSize)
    }

    public override fun mixedInstancesPolicy(mixedInstancesPolicy: IResolvable) {
      cdkBuilder.mixedInstancesPolicy(mixedInstancesPolicy.let(IResolvable::unwrap))
    }

    public override fun mixedInstancesPolicy(mixedInstancesPolicy: MixedInstancesPolicyProperty) {
      cdkBuilder.mixedInstancesPolicy(mixedInstancesPolicy.let(MixedInstancesPolicyProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("225b9b144c2f54944bd28485b6bb3492a765f1d00ca05604123531373cae2a81")
    public override
        fun mixedInstancesPolicy(mixedInstancesPolicy: MixedInstancesPolicyProperty.Builder.() -> Unit):
        Unit = mixedInstancesPolicy(MixedInstancesPolicyProperty(mixedInstancesPolicy))

    public override
        fun newInstancesProtectedFromScaleIn(newInstancesProtectedFromScaleIn: Boolean) {
      cdkBuilder.newInstancesProtectedFromScaleIn(newInstancesProtectedFromScaleIn)
    }

    public override
        fun newInstancesProtectedFromScaleIn(newInstancesProtectedFromScaleIn: IResolvable) {
      cdkBuilder.newInstancesProtectedFromScaleIn(newInstancesProtectedFromScaleIn.let(IResolvable::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    public override fun notificationConfiguration(notificationConfiguration: IResolvable) {
      cdkBuilder.notificationConfiguration(notificationConfiguration.let(IResolvable::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    public override
        fun notificationConfiguration(notificationConfiguration: NotificationConfigurationProperty) {
      cdkBuilder.notificationConfiguration(notificationConfiguration.let(NotificationConfigurationProperty::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8a4b1af8972202b84a7387964643523d0d39173add845a86f803ad0c280243a9")
    public override
        fun notificationConfiguration(notificationConfiguration: NotificationConfigurationProperty.Builder.() -> Unit):
        Unit =
        notificationConfiguration(NotificationConfigurationProperty(notificationConfiguration))

    public override fun notificationConfigurations(notificationConfigurations: IResolvable) {
      cdkBuilder.notificationConfigurations(notificationConfigurations.let(IResolvable::unwrap))
    }

    public override fun notificationConfigurations(notificationConfigurations: List<Any>) {
      cdkBuilder.notificationConfigurations(notificationConfigurations)
    }

    public override fun placementGroup(placementGroup: String) {
      cdkBuilder.placementGroup(placementGroup)
    }

    public override fun serviceLinkedRoleArn(serviceLinkedRoleArn: String) {
      cdkBuilder.serviceLinkedRoleArn(serviceLinkedRoleArn)
    }

    public override fun tags(tags: List<TagPropertyProperty>) {
      cdkBuilder.tags(tags.map(TagPropertyProperty::unwrap))
    }

    public override fun targetGroupArns(targetGroupArns: List<String>) {
      cdkBuilder.targetGroupArns(targetGroupArns)
    }

    public override fun terminationPolicies(terminationPolicies: List<String>) {
      cdkBuilder.terminationPolicies(terminationPolicies)
    }

    public override fun vpcZoneIdentifier(vpcZoneIdentifier: List<String>) {
      cdkBuilder.vpcZoneIdentifier(vpcZoneIdentifier)
    }

    public fun build(): software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

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
    public fun max(): Number? = unwrap(this).getMax()

    public fun min(): Number? = unwrap(this).getMin()

    public interface Builder {
      public fun max(max: Number) {
      }

      public fun min(min: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.MemoryMiBRequestProperty.Builder
          =
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.MemoryMiBRequestProperty.builder()

      public override fun max(max: Number) {
        cdkBuilder.max(max)
      }

      public override fun min(min: Number) {
        cdkBuilder.min(min)
      }

      public fun build():
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.MemoryMiBRequestProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.MemoryMiBRequestProperty,
    ) : MemoryMiBRequestProperty {
      public override fun max(): Number? = unwrap(this).getMax()

      public override fun min(): Number? = unwrap(this).getMin()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MemoryMiBRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.MemoryMiBRequestProperty):
          MemoryMiBRequestProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MemoryMiBRequestProperty):
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.MemoryMiBRequestProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface TotalLocalStorageGBRequestProperty {
    public fun max(): Number? = unwrap(this).getMax()

    public fun min(): Number? = unwrap(this).getMin()

    public interface Builder {
      public fun max(max: Number) {
      }

      public fun min(min: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.TotalLocalStorageGBRequestProperty.Builder
          =
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.TotalLocalStorageGBRequestProperty.builder()

      public override fun max(max: Number) {
        cdkBuilder.max(max)
      }

      public override fun min(min: Number) {
        cdkBuilder.min(min)
      }

      public fun build():
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.TotalLocalStorageGBRequestProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.TotalLocalStorageGBRequestProperty,
    ) : TotalLocalStorageGBRequestProperty {
      public override fun max(): Number? = unwrap(this).getMax()

      public override fun min(): Number? = unwrap(this).getMin()
    }

    public companion object {
      init {

      }

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
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface LaunchTemplateSpecificationProperty {
    public fun launchTemplateId(): String? = unwrap(this).getLaunchTemplateId()

    public fun launchTemplateName(): String? = unwrap(this).getLaunchTemplateName()

    public fun version(): String

    public interface Builder {
      public fun launchTemplateId(launchTemplateId: String) {
      }

      public fun launchTemplateName(launchTemplateName: String) {
      }

      public fun version(version: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LaunchTemplateSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LaunchTemplateSpecificationProperty.builder()

      public override fun launchTemplateId(launchTemplateId: String) {
        cdkBuilder.launchTemplateId(launchTemplateId)
      }

      public override fun launchTemplateName(launchTemplateName: String) {
        cdkBuilder.launchTemplateName(launchTemplateName)
      }

      public override fun version(version: String) {
        cdkBuilder.version(version)
      }

      public fun build():
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LaunchTemplateSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LaunchTemplateSpecificationProperty,
    ) : LaunchTemplateSpecificationProperty {
      public override fun launchTemplateId(): String? = unwrap(this).getLaunchTemplateId()

      public override fun launchTemplateName(): String? = unwrap(this).getLaunchTemplateName()

      public override fun version(): String = unwrap(this).getVersion()
    }

    public companion object {
      init {

      }

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
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface NetworkInterfaceCountRequestProperty {
    public fun max(): Number? = unwrap(this).getMax()

    public fun min(): Number? = unwrap(this).getMin()

    public interface Builder {
      public fun max(max: Number) {
      }

      public fun min(min: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.NetworkInterfaceCountRequestProperty.Builder
          =
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.NetworkInterfaceCountRequestProperty.builder()

      public override fun max(max: Number) {
        cdkBuilder.max(max)
      }

      public override fun min(min: Number) {
        cdkBuilder.min(min)
      }

      public fun build():
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.NetworkInterfaceCountRequestProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.NetworkInterfaceCountRequestProperty,
    ) : NetworkInterfaceCountRequestProperty {
      public override fun max(): Number? = unwrap(this).getMax()

      public override fun min(): Number? = unwrap(this).getMin()
    }

    public companion object {
      init {

      }

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
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface TagPropertyProperty {
    public fun key(): String

    public fun propagateAtLaunch(): Any

    public fun `value`(): String

    public interface Builder {
      public fun key(key: String) {
      }

      public fun propagateAtLaunch(propagateAtLaunch: Boolean) {
      }

      public fun propagateAtLaunch(propagateAtLaunch: IResolvable) {
      }

      public fun `value`(`value`: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.TagPropertyProperty.Builder
          =
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.TagPropertyProperty.builder()

      public override fun key(key: String) {
        cdkBuilder.key(key)
      }

      public override fun propagateAtLaunch(propagateAtLaunch: Boolean) {
        cdkBuilder.propagateAtLaunch(propagateAtLaunch)
      }

      public override fun propagateAtLaunch(propagateAtLaunch: IResolvable) {
        cdkBuilder.propagateAtLaunch(propagateAtLaunch.let(IResolvable::unwrap))
      }

      public override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.TagPropertyProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.TagPropertyProperty,
    ) : TagPropertyProperty {
      public override fun key(): String = unwrap(this).getKey()

      public override fun propagateAtLaunch(): Any = unwrap(this).getPropagateAtLaunch()

      public override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TagPropertyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.TagPropertyProperty):
          TagPropertyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TagPropertyProperty):
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.TagPropertyProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface NetworkBandwidthGbpsRequestProperty {
    public fun max(): Number? = unwrap(this).getMax()

    public fun min(): Number? = unwrap(this).getMin()

    public interface Builder {
      public fun max(max: Number) {
      }

      public fun min(min: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.NetworkBandwidthGbpsRequestProperty.Builder
          =
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.NetworkBandwidthGbpsRequestProperty.builder()

      public override fun max(max: Number) {
        cdkBuilder.max(max)
      }

      public override fun min(min: Number) {
        cdkBuilder.min(min)
      }

      public fun build():
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.NetworkBandwidthGbpsRequestProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.NetworkBandwidthGbpsRequestProperty,
    ) : NetworkBandwidthGbpsRequestProperty {
      public override fun max(): Number? = unwrap(this).getMax()

      public override fun min(): Number? = unwrap(this).getMin()
    }

    public companion object {
      init {

      }

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
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface VCpuCountRequestProperty {
    public fun max(): Number? = unwrap(this).getMax()

    public fun min(): Number? = unwrap(this).getMin()

    public interface Builder {
      public fun max(max: Number) {
      }

      public fun min(min: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.VCpuCountRequestProperty.Builder
          =
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.VCpuCountRequestProperty.builder()

      public override fun max(max: Number) {
        cdkBuilder.max(max)
      }

      public override fun min(min: Number) {
        cdkBuilder.min(min)
      }

      public fun build():
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.VCpuCountRequestProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.VCpuCountRequestProperty,
    ) : VCpuCountRequestProperty {
      public override fun max(): Number? = unwrap(this).getMax()

      public override fun min(): Number? = unwrap(this).getMin()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): VCpuCountRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.VCpuCountRequestProperty):
          VCpuCountRequestProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VCpuCountRequestProperty):
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.VCpuCountRequestProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface AcceleratorCountRequestProperty {
    public fun max(): Number? = unwrap(this).getMax()

    public fun min(): Number? = unwrap(this).getMin()

    public interface Builder {
      public fun max(max: Number) {
      }

      public fun min(min: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.AcceleratorCountRequestProperty.Builder
          =
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.AcceleratorCountRequestProperty.builder()

      public override fun max(max: Number) {
        cdkBuilder.max(max)
      }

      public override fun min(min: Number) {
        cdkBuilder.min(min)
      }

      public fun build():
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.AcceleratorCountRequestProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.AcceleratorCountRequestProperty,
    ) : AcceleratorCountRequestProperty {
      public override fun max(): Number? = unwrap(this).getMax()

      public override fun min(): Number? = unwrap(this).getMin()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AcceleratorCountRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.AcceleratorCountRequestProperty):
          AcceleratorCountRequestProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AcceleratorCountRequestProperty):
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.AcceleratorCountRequestProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface MemoryGiBPerVCpuRequestProperty {
    public fun max(): Number? = unwrap(this).getMax()

    public fun min(): Number? = unwrap(this).getMin()

    public interface Builder {
      public fun max(max: Number) {
      }

      public fun min(min: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.MemoryGiBPerVCpuRequestProperty.Builder
          =
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.MemoryGiBPerVCpuRequestProperty.builder()

      public override fun max(max: Number) {
        cdkBuilder.max(max)
      }

      public override fun min(min: Number) {
        cdkBuilder.min(min)
      }

      public fun build():
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.MemoryGiBPerVCpuRequestProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.MemoryGiBPerVCpuRequestProperty,
    ) : MemoryGiBPerVCpuRequestProperty {
      public override fun max(): Number? = unwrap(this).getMax()

      public override fun min(): Number? = unwrap(this).getMin()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MemoryGiBPerVCpuRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.MemoryGiBPerVCpuRequestProperty):
          MemoryGiBPerVCpuRequestProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MemoryGiBPerVCpuRequestProperty):
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.MemoryGiBPerVCpuRequestProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface LaunchTemplateOverridesProperty {
    public fun instanceRequirements(): Any? = unwrap(this).getInstanceRequirements()

    public fun instanceType(): String? = unwrap(this).getInstanceType()

    public fun launchTemplateSpecification(): Any? = unwrap(this).getLaunchTemplateSpecification()

    public fun weightedCapacity(): String? = unwrap(this).getWeightedCapacity()

    public interface Builder {
      public fun instanceRequirements(instanceRequirements: IResolvable) {
      }

      public fun instanceRequirements(instanceRequirements: InstanceRequirementsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("94f4ea0c74ec4495738121b8d42fa540ee0b3090a922cc85121645d3598842f2")
      public
          fun instanceRequirements(instanceRequirements: InstanceRequirementsProperty.Builder.() -> Unit) {
      }

      public fun instanceType(instanceType: String) {
      }

      public fun launchTemplateSpecification(launchTemplateSpecification: IResolvable) {
      }

      public
          fun launchTemplateSpecification(launchTemplateSpecification: LaunchTemplateSpecificationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bfadd002dc80530ce8daf12a2dd7485c3550a7438eb96f083b1fd2313b9aa4a2")
      public
          fun launchTemplateSpecification(launchTemplateSpecification: LaunchTemplateSpecificationProperty.Builder.() -> Unit) {
      }

      public fun weightedCapacity(weightedCapacity: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LaunchTemplateOverridesProperty.Builder
          =
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LaunchTemplateOverridesProperty.builder()

      public override fun instanceRequirements(instanceRequirements: IResolvable) {
        cdkBuilder.instanceRequirements(instanceRequirements.let(IResolvable::unwrap))
      }

      public override fun instanceRequirements(instanceRequirements: InstanceRequirementsProperty) {
        cdkBuilder.instanceRequirements(instanceRequirements.let(InstanceRequirementsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("94f4ea0c74ec4495738121b8d42fa540ee0b3090a922cc85121645d3598842f2")
      public override
          fun instanceRequirements(instanceRequirements: InstanceRequirementsProperty.Builder.() -> Unit):
          Unit = instanceRequirements(InstanceRequirementsProperty(instanceRequirements))

      public override fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
      }

      public override fun launchTemplateSpecification(launchTemplateSpecification: IResolvable) {
        cdkBuilder.launchTemplateSpecification(launchTemplateSpecification.let(IResolvable::unwrap))
      }

      public override
          fun launchTemplateSpecification(launchTemplateSpecification: LaunchTemplateSpecificationProperty) {
        cdkBuilder.launchTemplateSpecification(launchTemplateSpecification.let(LaunchTemplateSpecificationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bfadd002dc80530ce8daf12a2dd7485c3550a7438eb96f083b1fd2313b9aa4a2")
      public override
          fun launchTemplateSpecification(launchTemplateSpecification: LaunchTemplateSpecificationProperty.Builder.() -> Unit):
          Unit =
          launchTemplateSpecification(LaunchTemplateSpecificationProperty(launchTemplateSpecification))

      public override fun weightedCapacity(weightedCapacity: String) {
        cdkBuilder.weightedCapacity(weightedCapacity)
      }

      public fun build():
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LaunchTemplateOverridesProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LaunchTemplateOverridesProperty,
    ) : LaunchTemplateOverridesProperty {
      public override fun instanceRequirements(): Any? = unwrap(this).getInstanceRequirements()

      public override fun instanceType(): String? = unwrap(this).getInstanceType()

      public override fun launchTemplateSpecification(): Any? =
          unwrap(this).getLaunchTemplateSpecification()

      public override fun weightedCapacity(): String? = unwrap(this).getWeightedCapacity()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LaunchTemplateOverridesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LaunchTemplateOverridesProperty):
          LaunchTemplateOverridesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LaunchTemplateOverridesProperty):
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LaunchTemplateOverridesProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface InstancesDistributionProperty {
    public fun onDemandAllocationStrategy(): String? = unwrap(this).getOnDemandAllocationStrategy()

    public fun onDemandBaseCapacity(): Number? = unwrap(this).getOnDemandBaseCapacity()

    public fun onDemandPercentageAboveBaseCapacity(): Number? =
        unwrap(this).getOnDemandPercentageAboveBaseCapacity()

    public fun spotAllocationStrategy(): String? = unwrap(this).getSpotAllocationStrategy()

    public fun spotInstancePools(): Number? = unwrap(this).getSpotInstancePools()

    public fun spotMaxPrice(): String? = unwrap(this).getSpotMaxPrice()

    public interface Builder {
      public fun onDemandAllocationStrategy(onDemandAllocationStrategy: String) {
      }

      public fun onDemandBaseCapacity(onDemandBaseCapacity: Number) {
      }

      public fun onDemandPercentageAboveBaseCapacity(onDemandPercentageAboveBaseCapacity: Number) {
      }

      public fun spotAllocationStrategy(spotAllocationStrategy: String) {
      }

      public fun spotInstancePools(spotInstancePools: Number) {
      }

      public fun spotMaxPrice(spotMaxPrice: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.InstancesDistributionProperty.Builder
          =
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.InstancesDistributionProperty.builder()

      public override fun onDemandAllocationStrategy(onDemandAllocationStrategy: String) {
        cdkBuilder.onDemandAllocationStrategy(onDemandAllocationStrategy)
      }

      public override fun onDemandBaseCapacity(onDemandBaseCapacity: Number) {
        cdkBuilder.onDemandBaseCapacity(onDemandBaseCapacity)
      }

      public override
          fun onDemandPercentageAboveBaseCapacity(onDemandPercentageAboveBaseCapacity: Number) {
        cdkBuilder.onDemandPercentageAboveBaseCapacity(onDemandPercentageAboveBaseCapacity)
      }

      public override fun spotAllocationStrategy(spotAllocationStrategy: String) {
        cdkBuilder.spotAllocationStrategy(spotAllocationStrategy)
      }

      public override fun spotInstancePools(spotInstancePools: Number) {
        cdkBuilder.spotInstancePools(spotInstancePools)
      }

      public override fun spotMaxPrice(spotMaxPrice: String) {
        cdkBuilder.spotMaxPrice(spotMaxPrice)
      }

      public fun build():
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.InstancesDistributionProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.InstancesDistributionProperty,
    ) : InstancesDistributionProperty {
      public override fun onDemandAllocationStrategy(): String? =
          unwrap(this).getOnDemandAllocationStrategy()

      public override fun onDemandBaseCapacity(): Number? = unwrap(this).getOnDemandBaseCapacity()

      public override fun onDemandPercentageAboveBaseCapacity(): Number? =
          unwrap(this).getOnDemandPercentageAboveBaseCapacity()

      public override fun spotAllocationStrategy(): String? =
          unwrap(this).getSpotAllocationStrategy()

      public override fun spotInstancePools(): Number? = unwrap(this).getSpotInstancePools()

      public override fun spotMaxPrice(): String? = unwrap(this).getSpotMaxPrice()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): InstancesDistributionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.InstancesDistributionProperty):
          InstancesDistributionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InstancesDistributionProperty):
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.InstancesDistributionProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface NotificationConfigurationProperty {
    public fun notificationTypes(): List<String> = unwrap(this).getNotificationTypes() ?:
        emptyList()

    public fun topicArn(): String

    public interface Builder {
      public fun notificationTypes(notificationTypes: List<String>) {
      }

      public fun topicArn(topicArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.NotificationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.NotificationConfigurationProperty.builder()

      public override fun notificationTypes(notificationTypes: List<String>) {
        cdkBuilder.notificationTypes(notificationTypes)
      }

      public override fun topicArn(topicArn: String) {
        cdkBuilder.topicArn(topicArn)
      }

      public fun build():
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.NotificationConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.NotificationConfigurationProperty,
    ) : NotificationConfigurationProperty {
      public override fun notificationTypes(): List<String> = unwrap(this).getNotificationTypes() ?:
          emptyList()

      public override fun topicArn(): String = unwrap(this).getTopicArn()
    }

    public companion object {
      init {

      }

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
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface MetricsCollectionProperty {
    public fun granularity(): String

    public fun metrics(): List<String> = unwrap(this).getMetrics() ?: emptyList()

    public interface Builder {
      public fun granularity(granularity: String) {
      }

      public fun metrics(metrics: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.MetricsCollectionProperty.Builder
          =
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.MetricsCollectionProperty.builder()

      public override fun granularity(granularity: String) {
        cdkBuilder.granularity(granularity)
      }

      public override fun metrics(metrics: List<String>) {
        cdkBuilder.metrics(metrics)
      }

      public fun build():
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.MetricsCollectionProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.MetricsCollectionProperty,
    ) : MetricsCollectionProperty {
      public override fun granularity(): String = unwrap(this).getGranularity()

      public override fun metrics(): List<String> = unwrap(this).getMetrics() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MetricsCollectionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.MetricsCollectionProperty):
          MetricsCollectionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetricsCollectionProperty):
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.MetricsCollectionProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface InstanceRequirementsProperty {
    public fun acceleratorCount(): Any? = unwrap(this).getAcceleratorCount()

    public fun acceleratorManufacturers(): List<String> = unwrap(this).getAcceleratorManufacturers()
        ?: emptyList()

    public fun acceleratorNames(): List<String> = unwrap(this).getAcceleratorNames() ?: emptyList()

    public fun acceleratorTotalMemoryMiB(): Any? = unwrap(this).getAcceleratorTotalMemoryMiB()

    public fun acceleratorTypes(): List<String> = unwrap(this).getAcceleratorTypes() ?: emptyList()

    public fun allowedInstanceTypes(): List<String> = unwrap(this).getAllowedInstanceTypes() ?:
        emptyList()

    public fun bareMetal(): String? = unwrap(this).getBareMetal()

    public fun baselineEbsBandwidthMbps(): Any? = unwrap(this).getBaselineEbsBandwidthMbps()

    public fun burstablePerformance(): String? = unwrap(this).getBurstablePerformance()

    public fun cpuManufacturers(): List<String> = unwrap(this).getCpuManufacturers() ?: emptyList()

    public fun excludedInstanceTypes(): List<String> = unwrap(this).getExcludedInstanceTypes() ?:
        emptyList()

    public fun instanceGenerations(): List<String> = unwrap(this).getInstanceGenerations() ?:
        emptyList()

    public fun localStorage(): String? = unwrap(this).getLocalStorage()

    public fun localStorageTypes(): List<String> = unwrap(this).getLocalStorageTypes() ?:
        emptyList()

    public fun maxSpotPriceAsPercentageOfOptimalOnDemandPrice(): Number? =
        unwrap(this).getMaxSpotPriceAsPercentageOfOptimalOnDemandPrice()

    public fun memoryGiBPerVCpu(): Any? = unwrap(this).getMemoryGiBPerVCpu()

    public fun memoryMiB(): Any

    public fun networkBandwidthGbps(): Any? = unwrap(this).getNetworkBandwidthGbps()

    public fun networkInterfaceCount(): Any? = unwrap(this).getNetworkInterfaceCount()

    public fun onDemandMaxPricePercentageOverLowestPrice(): Number? =
        unwrap(this).getOnDemandMaxPricePercentageOverLowestPrice()

    public fun requireHibernateSupport(): Any? = unwrap(this).getRequireHibernateSupport()

    public fun spotMaxPricePercentageOverLowestPrice(): Number? =
        unwrap(this).getSpotMaxPricePercentageOverLowestPrice()

    public fun totalLocalStorageGb(): Any? = unwrap(this).getTotalLocalStorageGb()

    public fun vCpuCount(): Any

    public interface Builder {
      public fun acceleratorCount(acceleratorCount: IResolvable) {
      }

      public fun acceleratorCount(acceleratorCount: AcceleratorCountRequestProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("da54f95b7b9114b6e8c7e1024e8206a703bc28b5f93f2c30c33fa5caddfcbcad")
      public
          fun acceleratorCount(acceleratorCount: AcceleratorCountRequestProperty.Builder.() -> Unit) {
      }

      public fun acceleratorManufacturers(acceleratorManufacturers: List<String>) {
      }

      public fun acceleratorNames(acceleratorNames: List<String>) {
      }

      public fun acceleratorTotalMemoryMiB(acceleratorTotalMemoryMiB: IResolvable) {
      }

      public
          fun acceleratorTotalMemoryMiB(acceleratorTotalMemoryMiB: AcceleratorTotalMemoryMiBRequestProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ba7739b20a48dd2ab478fcc4d91c25765804a9600b7eeb1aba86f05bffe0751e")
      public
          fun acceleratorTotalMemoryMiB(acceleratorTotalMemoryMiB: AcceleratorTotalMemoryMiBRequestProperty.Builder.() -> Unit) {
      }

      public fun acceleratorTypes(acceleratorTypes: List<String>) {
      }

      public fun allowedInstanceTypes(allowedInstanceTypes: List<String>) {
      }

      public fun bareMetal(bareMetal: String) {
      }

      public fun baselineEbsBandwidthMbps(baselineEbsBandwidthMbps: IResolvable) {
      }

      public
          fun baselineEbsBandwidthMbps(baselineEbsBandwidthMbps: BaselineEbsBandwidthMbpsRequestProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1630feddc0146d1229586f809df8dd5224c4da3d0a2f82b7464a3ec0839fc8d4")
      public
          fun baselineEbsBandwidthMbps(baselineEbsBandwidthMbps: BaselineEbsBandwidthMbpsRequestProperty.Builder.() -> Unit) {
      }

      public fun burstablePerformance(burstablePerformance: String) {
      }

      public fun cpuManufacturers(cpuManufacturers: List<String>) {
      }

      public fun excludedInstanceTypes(excludedInstanceTypes: List<String>) {
      }

      public fun instanceGenerations(instanceGenerations: List<String>) {
      }

      public fun localStorage(localStorage: String) {
      }

      public fun localStorageTypes(localStorageTypes: List<String>) {
      }

      public
          fun maxSpotPriceAsPercentageOfOptimalOnDemandPrice(maxSpotPriceAsPercentageOfOptimalOnDemandPrice: Number) {
      }

      public fun memoryGiBPerVCpu(memoryGiBPerVCpu: IResolvable) {
      }

      public fun memoryGiBPerVCpu(memoryGiBPerVCpu: MemoryGiBPerVCpuRequestProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d55290b531e2ee1dd41118265c957a9f776060c1d7b27f944e40119ab5bc7e54")
      public
          fun memoryGiBPerVCpu(memoryGiBPerVCpu: MemoryGiBPerVCpuRequestProperty.Builder.() -> Unit) {
      }

      public fun memoryMiB(memoryMiB: IResolvable) {
      }

      public fun memoryMiB(memoryMiB: MemoryMiBRequestProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6ebca97333f952b321ec1462a00b68924c214d836a3916882cfbf12b221439c9")
      public fun memoryMiB(memoryMiB: MemoryMiBRequestProperty.Builder.() -> Unit) {
      }

      public fun networkBandwidthGbps(networkBandwidthGbps: IResolvable) {
      }

      public fun networkBandwidthGbps(networkBandwidthGbps: NetworkBandwidthGbpsRequestProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6552c11e18dd37c163b404c01333428d50703b58a125a26ed1c038a32f6188e9")
      public
          fun networkBandwidthGbps(networkBandwidthGbps: NetworkBandwidthGbpsRequestProperty.Builder.() -> Unit) {
      }

      public fun networkInterfaceCount(networkInterfaceCount: IResolvable) {
      }

      public
          fun networkInterfaceCount(networkInterfaceCount: NetworkInterfaceCountRequestProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f5f6237141895884dc736bee2ae072d1805502b7ea88c288aa06e7ee2a2b764d")
      public
          fun networkInterfaceCount(networkInterfaceCount: NetworkInterfaceCountRequestProperty.Builder.() -> Unit) {
      }

      public
          fun onDemandMaxPricePercentageOverLowestPrice(onDemandMaxPricePercentageOverLowestPrice: Number) {
      }

      public fun requireHibernateSupport(requireHibernateSupport: Boolean) {
      }

      public fun requireHibernateSupport(requireHibernateSupport: IResolvable) {
      }

      public
          fun spotMaxPricePercentageOverLowestPrice(spotMaxPricePercentageOverLowestPrice: Number) {
      }

      public fun totalLocalStorageGb(totalLocalStorageGb: IResolvable) {
      }

      public fun totalLocalStorageGb(totalLocalStorageGb: TotalLocalStorageGBRequestProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0d4481573ab159ffe8f7c8ac32f6180c31832cfec39436d8ca19b2adf307383e")
      public
          fun totalLocalStorageGb(totalLocalStorageGb: TotalLocalStorageGBRequestProperty.Builder.() -> Unit) {
      }

      public fun vCpuCount(vCpuCount: IResolvable) {
      }

      public fun vCpuCount(vCpuCount: VCpuCountRequestProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7dee68f654f869370b7228ff7e3ee0bca7647aca23a2359d986734fb9648fa6d")
      public fun vCpuCount(vCpuCount: VCpuCountRequestProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.InstanceRequirementsProperty.Builder
          =
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.InstanceRequirementsProperty.builder()

      public override fun acceleratorCount(acceleratorCount: IResolvable) {
        cdkBuilder.acceleratorCount(acceleratorCount.let(IResolvable::unwrap))
      }

      public override fun acceleratorCount(acceleratorCount: AcceleratorCountRequestProperty) {
        cdkBuilder.acceleratorCount(acceleratorCount.let(AcceleratorCountRequestProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("da54f95b7b9114b6e8c7e1024e8206a703bc28b5f93f2c30c33fa5caddfcbcad")
      public override
          fun acceleratorCount(acceleratorCount: AcceleratorCountRequestProperty.Builder.() -> Unit):
          Unit = acceleratorCount(AcceleratorCountRequestProperty(acceleratorCount))

      public override fun acceleratorManufacturers(acceleratorManufacturers: List<String>) {
        cdkBuilder.acceleratorManufacturers(acceleratorManufacturers)
      }

      public override fun acceleratorNames(acceleratorNames: List<String>) {
        cdkBuilder.acceleratorNames(acceleratorNames)
      }

      public override fun acceleratorTotalMemoryMiB(acceleratorTotalMemoryMiB: IResolvable) {
        cdkBuilder.acceleratorTotalMemoryMiB(acceleratorTotalMemoryMiB.let(IResolvable::unwrap))
      }

      public override
          fun acceleratorTotalMemoryMiB(acceleratorTotalMemoryMiB: AcceleratorTotalMemoryMiBRequestProperty) {
        cdkBuilder.acceleratorTotalMemoryMiB(acceleratorTotalMemoryMiB.let(AcceleratorTotalMemoryMiBRequestProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ba7739b20a48dd2ab478fcc4d91c25765804a9600b7eeb1aba86f05bffe0751e")
      public override
          fun acceleratorTotalMemoryMiB(acceleratorTotalMemoryMiB: AcceleratorTotalMemoryMiBRequestProperty.Builder.() -> Unit):
          Unit =
          acceleratorTotalMemoryMiB(AcceleratorTotalMemoryMiBRequestProperty(acceleratorTotalMemoryMiB))

      public override fun acceleratorTypes(acceleratorTypes: List<String>) {
        cdkBuilder.acceleratorTypes(acceleratorTypes)
      }

      public override fun allowedInstanceTypes(allowedInstanceTypes: List<String>) {
        cdkBuilder.allowedInstanceTypes(allowedInstanceTypes)
      }

      public override fun bareMetal(bareMetal: String) {
        cdkBuilder.bareMetal(bareMetal)
      }

      public override fun baselineEbsBandwidthMbps(baselineEbsBandwidthMbps: IResolvable) {
        cdkBuilder.baselineEbsBandwidthMbps(baselineEbsBandwidthMbps.let(IResolvable::unwrap))
      }

      public override
          fun baselineEbsBandwidthMbps(baselineEbsBandwidthMbps: BaselineEbsBandwidthMbpsRequestProperty) {
        cdkBuilder.baselineEbsBandwidthMbps(baselineEbsBandwidthMbps.let(BaselineEbsBandwidthMbpsRequestProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1630feddc0146d1229586f809df8dd5224c4da3d0a2f82b7464a3ec0839fc8d4")
      public override
          fun baselineEbsBandwidthMbps(baselineEbsBandwidthMbps: BaselineEbsBandwidthMbpsRequestProperty.Builder.() -> Unit):
          Unit =
          baselineEbsBandwidthMbps(BaselineEbsBandwidthMbpsRequestProperty(baselineEbsBandwidthMbps))

      public override fun burstablePerformance(burstablePerformance: String) {
        cdkBuilder.burstablePerformance(burstablePerformance)
      }

      public override fun cpuManufacturers(cpuManufacturers: List<String>) {
        cdkBuilder.cpuManufacturers(cpuManufacturers)
      }

      public override fun excludedInstanceTypes(excludedInstanceTypes: List<String>) {
        cdkBuilder.excludedInstanceTypes(excludedInstanceTypes)
      }

      public override fun instanceGenerations(instanceGenerations: List<String>) {
        cdkBuilder.instanceGenerations(instanceGenerations)
      }

      public override fun localStorage(localStorage: String) {
        cdkBuilder.localStorage(localStorage)
      }

      public override fun localStorageTypes(localStorageTypes: List<String>) {
        cdkBuilder.localStorageTypes(localStorageTypes)
      }

      public override
          fun maxSpotPriceAsPercentageOfOptimalOnDemandPrice(maxSpotPriceAsPercentageOfOptimalOnDemandPrice: Number) {
        cdkBuilder.maxSpotPriceAsPercentageOfOptimalOnDemandPrice(maxSpotPriceAsPercentageOfOptimalOnDemandPrice)
      }

      public override fun memoryGiBPerVCpu(memoryGiBPerVCpu: IResolvable) {
        cdkBuilder.memoryGiBPerVCpu(memoryGiBPerVCpu.let(IResolvable::unwrap))
      }

      public override fun memoryGiBPerVCpu(memoryGiBPerVCpu: MemoryGiBPerVCpuRequestProperty) {
        cdkBuilder.memoryGiBPerVCpu(memoryGiBPerVCpu.let(MemoryGiBPerVCpuRequestProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d55290b531e2ee1dd41118265c957a9f776060c1d7b27f944e40119ab5bc7e54")
      public override
          fun memoryGiBPerVCpu(memoryGiBPerVCpu: MemoryGiBPerVCpuRequestProperty.Builder.() -> Unit):
          Unit = memoryGiBPerVCpu(MemoryGiBPerVCpuRequestProperty(memoryGiBPerVCpu))

      public override fun memoryMiB(memoryMiB: IResolvable) {
        cdkBuilder.memoryMiB(memoryMiB.let(IResolvable::unwrap))
      }

      public override fun memoryMiB(memoryMiB: MemoryMiBRequestProperty) {
        cdkBuilder.memoryMiB(memoryMiB.let(MemoryMiBRequestProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6ebca97333f952b321ec1462a00b68924c214d836a3916882cfbf12b221439c9")
      public override fun memoryMiB(memoryMiB: MemoryMiBRequestProperty.Builder.() -> Unit): Unit =
          memoryMiB(MemoryMiBRequestProperty(memoryMiB))

      public override fun networkBandwidthGbps(networkBandwidthGbps: IResolvable) {
        cdkBuilder.networkBandwidthGbps(networkBandwidthGbps.let(IResolvable::unwrap))
      }

      public override
          fun networkBandwidthGbps(networkBandwidthGbps: NetworkBandwidthGbpsRequestProperty) {
        cdkBuilder.networkBandwidthGbps(networkBandwidthGbps.let(NetworkBandwidthGbpsRequestProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6552c11e18dd37c163b404c01333428d50703b58a125a26ed1c038a32f6188e9")
      public override
          fun networkBandwidthGbps(networkBandwidthGbps: NetworkBandwidthGbpsRequestProperty.Builder.() -> Unit):
          Unit = networkBandwidthGbps(NetworkBandwidthGbpsRequestProperty(networkBandwidthGbps))

      public override fun networkInterfaceCount(networkInterfaceCount: IResolvable) {
        cdkBuilder.networkInterfaceCount(networkInterfaceCount.let(IResolvable::unwrap))
      }

      public override
          fun networkInterfaceCount(networkInterfaceCount: NetworkInterfaceCountRequestProperty) {
        cdkBuilder.networkInterfaceCount(networkInterfaceCount.let(NetworkInterfaceCountRequestProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f5f6237141895884dc736bee2ae072d1805502b7ea88c288aa06e7ee2a2b764d")
      public override
          fun networkInterfaceCount(networkInterfaceCount: NetworkInterfaceCountRequestProperty.Builder.() -> Unit):
          Unit = networkInterfaceCount(NetworkInterfaceCountRequestProperty(networkInterfaceCount))

      public override
          fun onDemandMaxPricePercentageOverLowestPrice(onDemandMaxPricePercentageOverLowestPrice: Number) {
        cdkBuilder.onDemandMaxPricePercentageOverLowestPrice(onDemandMaxPricePercentageOverLowestPrice)
      }

      public override fun requireHibernateSupport(requireHibernateSupport: Boolean) {
        cdkBuilder.requireHibernateSupport(requireHibernateSupport)
      }

      public override fun requireHibernateSupport(requireHibernateSupport: IResolvable) {
        cdkBuilder.requireHibernateSupport(requireHibernateSupport.let(IResolvable::unwrap))
      }

      public override
          fun spotMaxPricePercentageOverLowestPrice(spotMaxPricePercentageOverLowestPrice: Number) {
        cdkBuilder.spotMaxPricePercentageOverLowestPrice(spotMaxPricePercentageOverLowestPrice)
      }

      public override fun totalLocalStorageGb(totalLocalStorageGb: IResolvable) {
        cdkBuilder.totalLocalStorageGb(totalLocalStorageGb.let(IResolvable::unwrap))
      }

      public override
          fun totalLocalStorageGb(totalLocalStorageGb: TotalLocalStorageGBRequestProperty) {
        cdkBuilder.totalLocalStorageGb(totalLocalStorageGb.let(TotalLocalStorageGBRequestProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0d4481573ab159ffe8f7c8ac32f6180c31832cfec39436d8ca19b2adf307383e")
      public override
          fun totalLocalStorageGb(totalLocalStorageGb: TotalLocalStorageGBRequestProperty.Builder.() -> Unit):
          Unit = totalLocalStorageGb(TotalLocalStorageGBRequestProperty(totalLocalStorageGb))

      public override fun vCpuCount(vCpuCount: IResolvable) {
        cdkBuilder.vCpuCount(vCpuCount.let(IResolvable::unwrap))
      }

      public override fun vCpuCount(vCpuCount: VCpuCountRequestProperty) {
        cdkBuilder.vCpuCount(vCpuCount.let(VCpuCountRequestProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7dee68f654f869370b7228ff7e3ee0bca7647aca23a2359d986734fb9648fa6d")
      public override fun vCpuCount(vCpuCount: VCpuCountRequestProperty.Builder.() -> Unit): Unit =
          vCpuCount(VCpuCountRequestProperty(vCpuCount))

      public fun build():
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.InstanceRequirementsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.InstanceRequirementsProperty,
    ) : InstanceRequirementsProperty {
      public override fun acceleratorCount(): Any? = unwrap(this).getAcceleratorCount()

      public override fun acceleratorManufacturers(): List<String> =
          unwrap(this).getAcceleratorManufacturers() ?: emptyList()

      public override fun acceleratorNames(): List<String> = unwrap(this).getAcceleratorNames() ?:
          emptyList()

      public override fun acceleratorTotalMemoryMiB(): Any? =
          unwrap(this).getAcceleratorTotalMemoryMiB()

      public override fun acceleratorTypes(): List<String> = unwrap(this).getAcceleratorTypes() ?:
          emptyList()

      public override fun allowedInstanceTypes(): List<String> =
          unwrap(this).getAllowedInstanceTypes() ?: emptyList()

      public override fun bareMetal(): String? = unwrap(this).getBareMetal()

      public override fun baselineEbsBandwidthMbps(): Any? =
          unwrap(this).getBaselineEbsBandwidthMbps()

      public override fun burstablePerformance(): String? = unwrap(this).getBurstablePerformance()

      public override fun cpuManufacturers(): List<String> = unwrap(this).getCpuManufacturers() ?:
          emptyList()

      public override fun excludedInstanceTypes(): List<String> =
          unwrap(this).getExcludedInstanceTypes() ?: emptyList()

      public override fun instanceGenerations(): List<String> =
          unwrap(this).getInstanceGenerations() ?: emptyList()

      public override fun localStorage(): String? = unwrap(this).getLocalStorage()

      public override fun localStorageTypes(): List<String> = unwrap(this).getLocalStorageTypes() ?:
          emptyList()

      public override fun maxSpotPriceAsPercentageOfOptimalOnDemandPrice(): Number? =
          unwrap(this).getMaxSpotPriceAsPercentageOfOptimalOnDemandPrice()

      public override fun memoryGiBPerVCpu(): Any? = unwrap(this).getMemoryGiBPerVCpu()

      public override fun memoryMiB(): Any = unwrap(this).getMemoryMiB()

      public override fun networkBandwidthGbps(): Any? = unwrap(this).getNetworkBandwidthGbps()

      public override fun networkInterfaceCount(): Any? = unwrap(this).getNetworkInterfaceCount()

      public override fun onDemandMaxPricePercentageOverLowestPrice(): Number? =
          unwrap(this).getOnDemandMaxPricePercentageOverLowestPrice()

      public override fun requireHibernateSupport(): Any? =
          unwrap(this).getRequireHibernateSupport()

      public override fun spotMaxPricePercentageOverLowestPrice(): Number? =
          unwrap(this).getSpotMaxPricePercentageOverLowestPrice()

      public override fun totalLocalStorageGb(): Any? = unwrap(this).getTotalLocalStorageGb()

      public override fun vCpuCount(): Any = unwrap(this).getVCpuCount()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): InstanceRequirementsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.InstanceRequirementsProperty):
          InstanceRequirementsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InstanceRequirementsProperty):
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.InstanceRequirementsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface InstanceMaintenancePolicyProperty {
    public fun maxHealthyPercentage(): Number? = unwrap(this).getMaxHealthyPercentage()

    public fun minHealthyPercentage(): Number? = unwrap(this).getMinHealthyPercentage()

    public interface Builder {
      public fun maxHealthyPercentage(maxHealthyPercentage: Number) {
      }

      public fun minHealthyPercentage(minHealthyPercentage: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.InstanceMaintenancePolicyProperty.Builder
          =
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.InstanceMaintenancePolicyProperty.builder()

      public override fun maxHealthyPercentage(maxHealthyPercentage: Number) {
        cdkBuilder.maxHealthyPercentage(maxHealthyPercentage)
      }

      public override fun minHealthyPercentage(minHealthyPercentage: Number) {
        cdkBuilder.minHealthyPercentage(minHealthyPercentage)
      }

      public fun build():
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.InstanceMaintenancePolicyProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.InstanceMaintenancePolicyProperty,
    ) : InstanceMaintenancePolicyProperty {
      public override fun maxHealthyPercentage(): Number? = unwrap(this).getMaxHealthyPercentage()

      public override fun minHealthyPercentage(): Number? = unwrap(this).getMinHealthyPercentage()
    }

    public companion object {
      init {

      }

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
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface BaselineEbsBandwidthMbpsRequestProperty {
    public fun max(): Number? = unwrap(this).getMax()

    public fun min(): Number? = unwrap(this).getMin()

    public interface Builder {
      public fun max(max: Number) {
      }

      public fun min(min: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.BaselineEbsBandwidthMbpsRequestProperty.Builder
          =
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.BaselineEbsBandwidthMbpsRequestProperty.builder()

      public override fun max(max: Number) {
        cdkBuilder.max(max)
      }

      public override fun min(min: Number) {
        cdkBuilder.min(min)
      }

      public fun build():
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.BaselineEbsBandwidthMbpsRequestProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.BaselineEbsBandwidthMbpsRequestProperty,
    ) : BaselineEbsBandwidthMbpsRequestProperty {
      public override fun max(): Number? = unwrap(this).getMax()

      public override fun min(): Number? = unwrap(this).getMin()
    }

    public companion object {
      init {

      }

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
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface LifecycleHookSpecificationProperty {
    public fun defaultResult(): String? = unwrap(this).getDefaultResult()

    public fun heartbeatTimeout(): Number? = unwrap(this).getHeartbeatTimeout()

    public fun lifecycleHookName(): String

    public fun lifecycleTransition(): String

    public fun notificationMetadata(): String? = unwrap(this).getNotificationMetadata()

    public fun notificationTargetArn(): String? = unwrap(this).getNotificationTargetArn()

    public fun roleArn(): String? = unwrap(this).getRoleArn()

    public interface Builder {
      public fun defaultResult(defaultResult: String) {
      }

      public fun heartbeatTimeout(heartbeatTimeout: Number) {
      }

      public fun lifecycleHookName(lifecycleHookName: String) {
      }

      public fun lifecycleTransition(lifecycleTransition: String) {
      }

      public fun notificationMetadata(notificationMetadata: String) {
      }

      public fun notificationTargetArn(notificationTargetArn: String) {
      }

      public fun roleArn(roleArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LifecycleHookSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LifecycleHookSpecificationProperty.builder()

      public override fun defaultResult(defaultResult: String) {
        cdkBuilder.defaultResult(defaultResult)
      }

      public override fun heartbeatTimeout(heartbeatTimeout: Number) {
        cdkBuilder.heartbeatTimeout(heartbeatTimeout)
      }

      public override fun lifecycleHookName(lifecycleHookName: String) {
        cdkBuilder.lifecycleHookName(lifecycleHookName)
      }

      public override fun lifecycleTransition(lifecycleTransition: String) {
        cdkBuilder.lifecycleTransition(lifecycleTransition)
      }

      public override fun notificationMetadata(notificationMetadata: String) {
        cdkBuilder.notificationMetadata(notificationMetadata)
      }

      public override fun notificationTargetArn(notificationTargetArn: String) {
        cdkBuilder.notificationTargetArn(notificationTargetArn)
      }

      public override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build():
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LifecycleHookSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LifecycleHookSpecificationProperty,
    ) : LifecycleHookSpecificationProperty {
      public override fun defaultResult(): String? = unwrap(this).getDefaultResult()

      public override fun heartbeatTimeout(): Number? = unwrap(this).getHeartbeatTimeout()

      public override fun lifecycleHookName(): String = unwrap(this).getLifecycleHookName()

      public override fun lifecycleTransition(): String = unwrap(this).getLifecycleTransition()

      public override fun notificationMetadata(): String? = unwrap(this).getNotificationMetadata()

      public override fun notificationTargetArn(): String? = unwrap(this).getNotificationTargetArn()

      public override fun roleArn(): String? = unwrap(this).getRoleArn()
    }

    public companion object {
      init {

      }

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
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface MixedInstancesPolicyProperty {
    public fun instancesDistribution(): Any? = unwrap(this).getInstancesDistribution()

    public fun launchTemplate(): Any

    public interface Builder {
      public fun instancesDistribution(instancesDistribution: IResolvable) {
      }

      public fun instancesDistribution(instancesDistribution: InstancesDistributionProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e03d4866caf69019336418ba081e967544f265959db95c169dda70812c5c4544")
      public
          fun instancesDistribution(instancesDistribution: InstancesDistributionProperty.Builder.() -> Unit) {
      }

      public fun launchTemplate(launchTemplate: IResolvable) {
      }

      public fun launchTemplate(launchTemplate: LaunchTemplateProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8ce44d33aa3fb8b16dd87d85a8716387ee4ee1693a6889cfcfb3e7ce7ded3d33")
      public fun launchTemplate(launchTemplate: LaunchTemplateProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.MixedInstancesPolicyProperty.Builder
          =
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.MixedInstancesPolicyProperty.builder()

      public override fun instancesDistribution(instancesDistribution: IResolvable) {
        cdkBuilder.instancesDistribution(instancesDistribution.let(IResolvable::unwrap))
      }

      public override
          fun instancesDistribution(instancesDistribution: InstancesDistributionProperty) {
        cdkBuilder.instancesDistribution(instancesDistribution.let(InstancesDistributionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e03d4866caf69019336418ba081e967544f265959db95c169dda70812c5c4544")
      public override
          fun instancesDistribution(instancesDistribution: InstancesDistributionProperty.Builder.() -> Unit):
          Unit = instancesDistribution(InstancesDistributionProperty(instancesDistribution))

      public override fun launchTemplate(launchTemplate: IResolvable) {
        cdkBuilder.launchTemplate(launchTemplate.let(IResolvable::unwrap))
      }

      public override fun launchTemplate(launchTemplate: LaunchTemplateProperty) {
        cdkBuilder.launchTemplate(launchTemplate.let(LaunchTemplateProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8ce44d33aa3fb8b16dd87d85a8716387ee4ee1693a6889cfcfb3e7ce7ded3d33")
      public override fun launchTemplate(launchTemplate: LaunchTemplateProperty.Builder.() -> Unit):
          Unit = launchTemplate(LaunchTemplateProperty(launchTemplate))

      public fun build():
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.MixedInstancesPolicyProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.MixedInstancesPolicyProperty,
    ) : MixedInstancesPolicyProperty {
      public override fun instancesDistribution(): Any? = unwrap(this).getInstancesDistribution()

      public override fun launchTemplate(): Any = unwrap(this).getLaunchTemplate()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MixedInstancesPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.MixedInstancesPolicyProperty):
          MixedInstancesPolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MixedInstancesPolicyProperty):
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.MixedInstancesPolicyProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface AcceleratorTotalMemoryMiBRequestProperty {
    public fun max(): Number? = unwrap(this).getMax()

    public fun min(): Number? = unwrap(this).getMin()

    public interface Builder {
      public fun max(max: Number) {
      }

      public fun min(min: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.AcceleratorTotalMemoryMiBRequestProperty.Builder
          =
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.AcceleratorTotalMemoryMiBRequestProperty.builder()

      public override fun max(max: Number) {
        cdkBuilder.max(max)
      }

      public override fun min(min: Number) {
        cdkBuilder.min(min)
      }

      public fun build():
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.AcceleratorTotalMemoryMiBRequestProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.AcceleratorTotalMemoryMiBRequestProperty,
    ) : AcceleratorTotalMemoryMiBRequestProperty {
      public override fun max(): Number? = unwrap(this).getMax()

      public override fun min(): Number? = unwrap(this).getMin()
    }

    public companion object {
      init {

      }

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
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface LaunchTemplateProperty {
    public fun launchTemplateSpecification(): Any

    public fun overrides(): Any? = unwrap(this).getOverrides()

    public interface Builder {
      public fun launchTemplateSpecification(launchTemplateSpecification: IResolvable) {
      }

      public
          fun launchTemplateSpecification(launchTemplateSpecification: LaunchTemplateSpecificationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("782d4c0c4f990e75a08265698f12ae7348b54caa42bc1d02c7f7bc986706a071")
      public
          fun launchTemplateSpecification(launchTemplateSpecification: LaunchTemplateSpecificationProperty.Builder.() -> Unit) {
      }

      public fun overrides(overrides: IResolvable) {
      }

      public fun overrides(overrides: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LaunchTemplateProperty.Builder
          =
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LaunchTemplateProperty.builder()

      public override fun launchTemplateSpecification(launchTemplateSpecification: IResolvable) {
        cdkBuilder.launchTemplateSpecification(launchTemplateSpecification.let(IResolvable::unwrap))
      }

      public override
          fun launchTemplateSpecification(launchTemplateSpecification: LaunchTemplateSpecificationProperty) {
        cdkBuilder.launchTemplateSpecification(launchTemplateSpecification.let(LaunchTemplateSpecificationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("782d4c0c4f990e75a08265698f12ae7348b54caa42bc1d02c7f7bc986706a071")
      public override
          fun launchTemplateSpecification(launchTemplateSpecification: LaunchTemplateSpecificationProperty.Builder.() -> Unit):
          Unit =
          launchTemplateSpecification(LaunchTemplateSpecificationProperty(launchTemplateSpecification))

      public override fun overrides(overrides: IResolvable) {
        cdkBuilder.overrides(overrides.let(IResolvable::unwrap))
      }

      public override fun overrides(overrides: List<Any>) {
        cdkBuilder.overrides(overrides)
      }

      public fun build():
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LaunchTemplateProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LaunchTemplateProperty,
    ) : LaunchTemplateProperty {
      public override fun launchTemplateSpecification(): Any =
          unwrap(this).getLaunchTemplateSpecification()

      public override fun overrides(): Any? = unwrap(this).getOverrides()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LaunchTemplateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LaunchTemplateProperty):
          LaunchTemplateProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LaunchTemplateProperty):
          software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LaunchTemplateProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
