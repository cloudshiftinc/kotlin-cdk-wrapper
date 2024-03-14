package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnEC2Fleet internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.CfnEC2Fleet,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrFleetId(): String = unwrap(this).getAttrFleetId()

  public open fun context(): String? = unwrap(this).getContext()

  public open fun context(`value`: String) {
    unwrap(this).setContext(`value`)
  }

  public open fun excessCapacityTerminationPolicy(): String? =
      unwrap(this).getExcessCapacityTerminationPolicy()

  public open fun excessCapacityTerminationPolicy(`value`: String) {
    unwrap(this).setExcessCapacityTerminationPolicy(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun launchTemplateConfigs(): Any = unwrap(this).getLaunchTemplateConfigs()

  public open fun launchTemplateConfigs(`value`: IResolvable) {
    unwrap(this).setLaunchTemplateConfigs(`value`.let(IResolvable::unwrap))
  }

  public open fun launchTemplateConfigs(__idx_ac66f0: List<Any>) {
    unwrap(this).setLaunchTemplateConfigs(__idx_ac66f0)
  }

  public open fun launchTemplateConfigs(vararg __idx_ac66f0: Any): Unit =
      launchTemplateConfigs(__idx_ac66f0.toList())

  public open fun onDemandOptions(): Any? = unwrap(this).getOnDemandOptions()

  public open fun onDemandOptions(`value`: IResolvable) {
    unwrap(this).setOnDemandOptions(`value`.let(IResolvable::unwrap))
  }

  public open fun onDemandOptions(`value`: OnDemandOptionsRequestProperty) {
    unwrap(this).setOnDemandOptions(`value`.let(OnDemandOptionsRequestProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fa2dfda2abe9c01c64a6a12cff8cc21d844e72e641d359a0035d4d3e0958753a")
  public open fun onDemandOptions(`value`: OnDemandOptionsRequestProperty.Builder.() -> Unit): Unit
      = onDemandOptions(OnDemandOptionsRequestProperty(`value`))

  public open fun replaceUnhealthyInstances(): Any? = unwrap(this).getReplaceUnhealthyInstances()

  public open fun replaceUnhealthyInstances(`value`: Boolean) {
    unwrap(this).setReplaceUnhealthyInstances(`value`)
  }

  public open fun replaceUnhealthyInstances(`value`: IResolvable) {
    unwrap(this).setReplaceUnhealthyInstances(`value`.let(IResolvable::unwrap))
  }

  public open fun spotOptions(): Any? = unwrap(this).getSpotOptions()

  public open fun spotOptions(`value`: IResolvable) {
    unwrap(this).setSpotOptions(`value`.let(IResolvable::unwrap))
  }

  public open fun spotOptions(`value`: SpotOptionsRequestProperty) {
    unwrap(this).setSpotOptions(`value`.let(SpotOptionsRequestProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5a0964b879cd5370e795221ca2d73ead1348dc08d9dcd14b21c16f57df95ec6f")
  public open fun spotOptions(`value`: SpotOptionsRequestProperty.Builder.() -> Unit): Unit =
      spotOptions(SpotOptionsRequestProperty(`value`))

  public open fun tagSpecifications(): Any? = unwrap(this).getTagSpecifications()

  public open fun tagSpecifications(`value`: IResolvable) {
    unwrap(this).setTagSpecifications(`value`.let(IResolvable::unwrap))
  }

  public open fun tagSpecifications(__idx_ac66f0: List<Any>) {
    unwrap(this).setTagSpecifications(__idx_ac66f0)
  }

  public open fun tagSpecifications(vararg __idx_ac66f0: Any): Unit =
      tagSpecifications(__idx_ac66f0.toList())

  public open fun targetCapacitySpecification(): Any = unwrap(this).getTargetCapacitySpecification()

  public open fun targetCapacitySpecification(`value`: IResolvable) {
    unwrap(this).setTargetCapacitySpecification(`value`.let(IResolvable::unwrap))
  }

  public open fun targetCapacitySpecification(`value`: TargetCapacitySpecificationRequestProperty) {
    unwrap(this).setTargetCapacitySpecification(`value`.let(TargetCapacitySpecificationRequestProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("82e634fca018886fa633356bdc133a07b389a5e9da55081aed53368d52ecbf20")
  public open
      fun targetCapacitySpecification(`value`: TargetCapacitySpecificationRequestProperty.Builder.() -> Unit):
      Unit = targetCapacitySpecification(TargetCapacitySpecificationRequestProperty(`value`))

  public open fun terminateInstancesWithExpiration(): Any? =
      unwrap(this).getTerminateInstancesWithExpiration()

  public open fun terminateInstancesWithExpiration(`value`: Boolean) {
    unwrap(this).setTerminateInstancesWithExpiration(`value`)
  }

  public open fun terminateInstancesWithExpiration(`value`: IResolvable) {
    unwrap(this).setTerminateInstancesWithExpiration(`value`.let(IResolvable::unwrap))
  }

  public open fun type(): String? = unwrap(this).getType()

  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  public open fun validFrom(): String? = unwrap(this).getValidFrom()

  public open fun validFrom(`value`: String) {
    unwrap(this).setValidFrom(`value`)
  }

  public open fun validUntil(): String? = unwrap(this).getValidUntil()

  public open fun validUntil(`value`: String) {
    unwrap(this).setValidUntil(`value`)
  }

  public interface Builder {
    public fun context(context: String)

    public fun excessCapacityTerminationPolicy(excessCapacityTerminationPolicy: String)

    public fun launchTemplateConfigs(launchTemplateConfigs: IResolvable)

    public fun launchTemplateConfigs(launchTemplateConfigs: List<Any>)

    public fun launchTemplateConfigs(vararg launchTemplateConfigs: Any)

    public fun onDemandOptions(onDemandOptions: IResolvable)

    public fun onDemandOptions(onDemandOptions: OnDemandOptionsRequestProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6685d56f0e1de435cdbe8fcee9802e7b365e56c0f39b379f5904ed1415e96303")
    public fun onDemandOptions(onDemandOptions: OnDemandOptionsRequestProperty.Builder.() -> Unit)

    public fun replaceUnhealthyInstances(replaceUnhealthyInstances: Boolean)

    public fun replaceUnhealthyInstances(replaceUnhealthyInstances: IResolvable)

    public fun spotOptions(spotOptions: IResolvable)

    public fun spotOptions(spotOptions: SpotOptionsRequestProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1ebd98aa70c64aeb4662d1d346071a23aa61765a886bfc40a56f4c0036b5375a")
    public fun spotOptions(spotOptions: SpotOptionsRequestProperty.Builder.() -> Unit)

    public fun tagSpecifications(tagSpecifications: IResolvable)

    public fun tagSpecifications(tagSpecifications: List<Any>)

    public fun tagSpecifications(vararg tagSpecifications: Any)

    public fun targetCapacitySpecification(targetCapacitySpecification: IResolvable)

    public
        fun targetCapacitySpecification(targetCapacitySpecification: TargetCapacitySpecificationRequestProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ee757ffc0432fc2249e84757321dd9bdd60a27a1b6dd7c8f1c58ef26587184b7")
    public
        fun targetCapacitySpecification(targetCapacitySpecification: TargetCapacitySpecificationRequestProperty.Builder.() -> Unit)

    public fun terminateInstancesWithExpiration(terminateInstancesWithExpiration: Boolean)

    public fun terminateInstancesWithExpiration(terminateInstancesWithExpiration: IResolvable)

    public fun type(type: String)

    public fun validFrom(validFrom: String)

    public fun validUntil(validUntil: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnEC2Fleet.Builder =
        software.amazon.awscdk.services.ec2.CfnEC2Fleet.Builder.create(scope, id)

    override fun context(context: String) {
      cdkBuilder.context(context)
    }

    override fun excessCapacityTerminationPolicy(excessCapacityTerminationPolicy: String) {
      cdkBuilder.excessCapacityTerminationPolicy(excessCapacityTerminationPolicy)
    }

    override fun launchTemplateConfigs(launchTemplateConfigs: IResolvable) {
      cdkBuilder.launchTemplateConfigs(launchTemplateConfigs.let(IResolvable::unwrap))
    }

    override fun launchTemplateConfigs(launchTemplateConfigs: List<Any>) {
      cdkBuilder.launchTemplateConfigs(launchTemplateConfigs)
    }

    override fun launchTemplateConfigs(vararg launchTemplateConfigs: Any): Unit =
        launchTemplateConfigs(launchTemplateConfigs.toList())

    override fun onDemandOptions(onDemandOptions: IResolvable) {
      cdkBuilder.onDemandOptions(onDemandOptions.let(IResolvable::unwrap))
    }

    override fun onDemandOptions(onDemandOptions: OnDemandOptionsRequestProperty) {
      cdkBuilder.onDemandOptions(onDemandOptions.let(OnDemandOptionsRequestProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6685d56f0e1de435cdbe8fcee9802e7b365e56c0f39b379f5904ed1415e96303")
    override
        fun onDemandOptions(onDemandOptions: OnDemandOptionsRequestProperty.Builder.() -> Unit):
        Unit = onDemandOptions(OnDemandOptionsRequestProperty(onDemandOptions))

    override fun replaceUnhealthyInstances(replaceUnhealthyInstances: Boolean) {
      cdkBuilder.replaceUnhealthyInstances(replaceUnhealthyInstances)
    }

    override fun replaceUnhealthyInstances(replaceUnhealthyInstances: IResolvable) {
      cdkBuilder.replaceUnhealthyInstances(replaceUnhealthyInstances.let(IResolvable::unwrap))
    }

    override fun spotOptions(spotOptions: IResolvable) {
      cdkBuilder.spotOptions(spotOptions.let(IResolvable::unwrap))
    }

    override fun spotOptions(spotOptions: SpotOptionsRequestProperty) {
      cdkBuilder.spotOptions(spotOptions.let(SpotOptionsRequestProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1ebd98aa70c64aeb4662d1d346071a23aa61765a886bfc40a56f4c0036b5375a")
    override fun spotOptions(spotOptions: SpotOptionsRequestProperty.Builder.() -> Unit): Unit =
        spotOptions(SpotOptionsRequestProperty(spotOptions))

    override fun tagSpecifications(tagSpecifications: IResolvable) {
      cdkBuilder.tagSpecifications(tagSpecifications.let(IResolvable::unwrap))
    }

    override fun tagSpecifications(tagSpecifications: List<Any>) {
      cdkBuilder.tagSpecifications(tagSpecifications)
    }

    override fun tagSpecifications(vararg tagSpecifications: Any): Unit =
        tagSpecifications(tagSpecifications.toList())

    override fun targetCapacitySpecification(targetCapacitySpecification: IResolvable) {
      cdkBuilder.targetCapacitySpecification(targetCapacitySpecification.let(IResolvable::unwrap))
    }

    override
        fun targetCapacitySpecification(targetCapacitySpecification: TargetCapacitySpecificationRequestProperty) {
      cdkBuilder.targetCapacitySpecification(targetCapacitySpecification.let(TargetCapacitySpecificationRequestProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ee757ffc0432fc2249e84757321dd9bdd60a27a1b6dd7c8f1c58ef26587184b7")
    override
        fun targetCapacitySpecification(targetCapacitySpecification: TargetCapacitySpecificationRequestProperty.Builder.() -> Unit):
        Unit =
        targetCapacitySpecification(TargetCapacitySpecificationRequestProperty(targetCapacitySpecification))

    override fun terminateInstancesWithExpiration(terminateInstancesWithExpiration: Boolean) {
      cdkBuilder.terminateInstancesWithExpiration(terminateInstancesWithExpiration)
    }

    override fun terminateInstancesWithExpiration(terminateInstancesWithExpiration: IResolvable) {
      cdkBuilder.terminateInstancesWithExpiration(terminateInstancesWithExpiration.let(IResolvable::unwrap))
    }

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    override fun validFrom(validFrom: String) {
      cdkBuilder.validFrom(validFrom)
    }

    override fun validUntil(validUntil: String) {
      cdkBuilder.validUntil(validUntil)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnEC2Fleet = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEC2Fleet {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEC2Fleet(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnEC2Fleet): CfnEC2Fleet =
        CfnEC2Fleet(cdkObject)

    internal fun unwrap(wrapped: CfnEC2Fleet): software.amazon.awscdk.services.ec2.CfnEC2Fleet =
        wrapped.cdkObject
  }

  public interface TargetCapacitySpecificationRequestProperty {
    public fun defaultTargetCapacityType(): String? = unwrap(this).getDefaultTargetCapacityType()

    public fun onDemandTargetCapacity(): Number? = unwrap(this).getOnDemandTargetCapacity()

    public fun spotTargetCapacity(): Number? = unwrap(this).getSpotTargetCapacity()

    public fun targetCapacityUnitType(): String? = unwrap(this).getTargetCapacityUnitType()

    public fun totalTargetCapacity(): Number

    public interface Builder {
      public fun defaultTargetCapacityType(defaultTargetCapacityType: String)

      public fun onDemandTargetCapacity(onDemandTargetCapacity: Number)

      public fun spotTargetCapacity(spotTargetCapacity: Number)

      public fun targetCapacityUnitType(targetCapacityUnitType: String)

      public fun totalTargetCapacity(totalTargetCapacity: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.TargetCapacitySpecificationRequestProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.TargetCapacitySpecificationRequestProperty.builder()

      override fun defaultTargetCapacityType(defaultTargetCapacityType: String) {
        cdkBuilder.defaultTargetCapacityType(defaultTargetCapacityType)
      }

      override fun onDemandTargetCapacity(onDemandTargetCapacity: Number) {
        cdkBuilder.onDemandTargetCapacity(onDemandTargetCapacity)
      }

      override fun spotTargetCapacity(spotTargetCapacity: Number) {
        cdkBuilder.spotTargetCapacity(spotTargetCapacity)
      }

      override fun targetCapacityUnitType(targetCapacityUnitType: String) {
        cdkBuilder.targetCapacityUnitType(targetCapacityUnitType)
      }

      override fun totalTargetCapacity(totalTargetCapacity: Number) {
        cdkBuilder.totalTargetCapacity(totalTargetCapacity)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.TargetCapacitySpecificationRequestProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.TargetCapacitySpecificationRequestProperty,
    ) : TargetCapacitySpecificationRequestProperty {
      override fun defaultTargetCapacityType(): String? =
          unwrap(this).getDefaultTargetCapacityType()

      override fun onDemandTargetCapacity(): Number? = unwrap(this).getOnDemandTargetCapacity()

      override fun spotTargetCapacity(): Number? = unwrap(this).getSpotTargetCapacity()

      override fun targetCapacityUnitType(): String? = unwrap(this).getTargetCapacityUnitType()

      override fun totalTargetCapacity(): Number = unwrap(this).getTotalTargetCapacity()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          TargetCapacitySpecificationRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnEC2Fleet.TargetCapacitySpecificationRequestProperty):
          TargetCapacitySpecificationRequestProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TargetCapacitySpecificationRequestProperty):
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.TargetCapacitySpecificationRequestProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface AcceleratorCountRequestProperty {
    public fun max(): Number? = unwrap(this).getMax()

    public fun min(): Number? = unwrap(this).getMin()

    public interface Builder {
      public fun max(max: Number)

      public fun min(min: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.AcceleratorCountRequestProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.AcceleratorCountRequestProperty.builder()

      override fun max(max: Number) {
        cdkBuilder.max(max)
      }

      override fun min(min: Number) {
        cdkBuilder.min(min)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.AcceleratorCountRequestProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.AcceleratorCountRequestProperty,
    ) : AcceleratorCountRequestProperty {
      override fun max(): Number? = unwrap(this).getMax()

      override fun min(): Number? = unwrap(this).getMin()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AcceleratorCountRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnEC2Fleet.AcceleratorCountRequestProperty):
          AcceleratorCountRequestProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AcceleratorCountRequestProperty):
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.AcceleratorCountRequestProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface TagSpecificationProperty {
    public fun resourceType(): String? = unwrap(this).getResourceType()

    public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    public interface Builder {
      public fun resourceType(resourceType: String)

      public fun tags(tags: List<CfnTag>)

      public fun tags(vararg tags: CfnTag)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.TagSpecificationProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.TagSpecificationProperty.builder()

      override fun resourceType(resourceType: String) {
        cdkBuilder.resourceType(resourceType)
      }

      override fun tags(tags: List<CfnTag>) {
        cdkBuilder.tags(tags.map(CfnTag::unwrap))
      }

      override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

      public fun build(): software.amazon.awscdk.services.ec2.CfnEC2Fleet.TagSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.TagSpecificationProperty,
    ) : TagSpecificationProperty {
      override fun resourceType(): String? = unwrap(this).getResourceType()

      override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TagSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnEC2Fleet.TagSpecificationProperty):
          TagSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TagSpecificationProperty):
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.TagSpecificationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface FleetLaunchTemplateOverridesRequestProperty {
    public fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

    public fun instanceRequirements(): Any? = unwrap(this).getInstanceRequirements()

    public fun instanceType(): String? = unwrap(this).getInstanceType()

    public fun maxPrice(): String? = unwrap(this).getMaxPrice()

    public fun placement(): Any? = unwrap(this).getPlacement()

    public fun priority(): Number? = unwrap(this).getPriority()

    public fun subnetId(): String? = unwrap(this).getSubnetId()

    public fun weightedCapacity(): Number? = unwrap(this).getWeightedCapacity()

    public interface Builder {
      public fun availabilityZone(availabilityZone: String)

      public fun instanceRequirements(instanceRequirements: IResolvable)

      public fun instanceRequirements(instanceRequirements: InstanceRequirementsRequestProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("99a0b1cb554d9f79e3533a2feeae208040c090771703fe72d9e217cdb3371d2f")
      public
          fun instanceRequirements(instanceRequirements: InstanceRequirementsRequestProperty.Builder.() -> Unit)

      public fun instanceType(instanceType: String)

      public fun maxPrice(maxPrice: String)

      public fun placement(placement: IResolvable)

      public fun placement(placement: PlacementProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cf9152d63c4d2134d1a71fc402152824819c952050ebe311f8e289c81397631e")
      public fun placement(placement: PlacementProperty.Builder.() -> Unit)

      public fun priority(priority: Number)

      public fun subnetId(subnetId: String)

      public fun weightedCapacity(weightedCapacity: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.FleetLaunchTemplateOverridesRequestProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.FleetLaunchTemplateOverridesRequestProperty.builder()

      override fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
      }

      override fun instanceRequirements(instanceRequirements: IResolvable) {
        cdkBuilder.instanceRequirements(instanceRequirements.let(IResolvable::unwrap))
      }

      override fun instanceRequirements(instanceRequirements: InstanceRequirementsRequestProperty) {
        cdkBuilder.instanceRequirements(instanceRequirements.let(InstanceRequirementsRequestProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("99a0b1cb554d9f79e3533a2feeae208040c090771703fe72d9e217cdb3371d2f")
      override
          fun instanceRequirements(instanceRequirements: InstanceRequirementsRequestProperty.Builder.() -> Unit):
          Unit = instanceRequirements(InstanceRequirementsRequestProperty(instanceRequirements))

      override fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
      }

      override fun maxPrice(maxPrice: String) {
        cdkBuilder.maxPrice(maxPrice)
      }

      override fun placement(placement: IResolvable) {
        cdkBuilder.placement(placement.let(IResolvable::unwrap))
      }

      override fun placement(placement: PlacementProperty) {
        cdkBuilder.placement(placement.let(PlacementProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cf9152d63c4d2134d1a71fc402152824819c952050ebe311f8e289c81397631e")
      override fun placement(placement: PlacementProperty.Builder.() -> Unit): Unit =
          placement(PlacementProperty(placement))

      override fun priority(priority: Number) {
        cdkBuilder.priority(priority)
      }

      override fun subnetId(subnetId: String) {
        cdkBuilder.subnetId(subnetId)
      }

      override fun weightedCapacity(weightedCapacity: Number) {
        cdkBuilder.weightedCapacity(weightedCapacity)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.FleetLaunchTemplateOverridesRequestProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.FleetLaunchTemplateOverridesRequestProperty,
    ) : FleetLaunchTemplateOverridesRequestProperty {
      override fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

      override fun instanceRequirements(): Any? = unwrap(this).getInstanceRequirements()

      override fun instanceType(): String? = unwrap(this).getInstanceType()

      override fun maxPrice(): String? = unwrap(this).getMaxPrice()

      override fun placement(): Any? = unwrap(this).getPlacement()

      override fun priority(): Number? = unwrap(this).getPriority()

      override fun subnetId(): String? = unwrap(this).getSubnetId()

      override fun weightedCapacity(): Number? = unwrap(this).getWeightedCapacity()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          FleetLaunchTemplateOverridesRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnEC2Fleet.FleetLaunchTemplateOverridesRequestProperty):
          FleetLaunchTemplateOverridesRequestProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FleetLaunchTemplateOverridesRequestProperty):
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.FleetLaunchTemplateOverridesRequestProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface SpotOptionsRequestProperty {
    public fun allocationStrategy(): String? = unwrap(this).getAllocationStrategy()

    public fun instanceInterruptionBehavior(): String? =
        unwrap(this).getInstanceInterruptionBehavior()

    public fun instancePoolsToUseCount(): Number? = unwrap(this).getInstancePoolsToUseCount()

    public fun maintenanceStrategies(): Any? = unwrap(this).getMaintenanceStrategies()

    public fun maxTotalPrice(): String? = unwrap(this).getMaxTotalPrice()

    public fun minTargetCapacity(): Number? = unwrap(this).getMinTargetCapacity()

    public fun singleAvailabilityZone(): Any? = unwrap(this).getSingleAvailabilityZone()

    public fun singleInstanceType(): Any? = unwrap(this).getSingleInstanceType()

    public interface Builder {
      public fun allocationStrategy(allocationStrategy: String)

      public fun instanceInterruptionBehavior(instanceInterruptionBehavior: String)

      public fun instancePoolsToUseCount(instancePoolsToUseCount: Number)

      public fun maintenanceStrategies(maintenanceStrategies: IResolvable)

      public fun maintenanceStrategies(maintenanceStrategies: MaintenanceStrategiesProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("500ef6316a62131118ebc42fa82a07abcb3210ee9a5942fa639e876b95154539")
      public
          fun maintenanceStrategies(maintenanceStrategies: MaintenanceStrategiesProperty.Builder.() -> Unit)

      public fun maxTotalPrice(maxTotalPrice: String)

      public fun minTargetCapacity(minTargetCapacity: Number)

      public fun singleAvailabilityZone(singleAvailabilityZone: Boolean)

      public fun singleAvailabilityZone(singleAvailabilityZone: IResolvable)

      public fun singleInstanceType(singleInstanceType: Boolean)

      public fun singleInstanceType(singleInstanceType: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.SpotOptionsRequestProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.SpotOptionsRequestProperty.builder()

      override fun allocationStrategy(allocationStrategy: String) {
        cdkBuilder.allocationStrategy(allocationStrategy)
      }

      override fun instanceInterruptionBehavior(instanceInterruptionBehavior: String) {
        cdkBuilder.instanceInterruptionBehavior(instanceInterruptionBehavior)
      }

      override fun instancePoolsToUseCount(instancePoolsToUseCount: Number) {
        cdkBuilder.instancePoolsToUseCount(instancePoolsToUseCount)
      }

      override fun maintenanceStrategies(maintenanceStrategies: IResolvable) {
        cdkBuilder.maintenanceStrategies(maintenanceStrategies.let(IResolvable::unwrap))
      }

      override fun maintenanceStrategies(maintenanceStrategies: MaintenanceStrategiesProperty) {
        cdkBuilder.maintenanceStrategies(maintenanceStrategies.let(MaintenanceStrategiesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("500ef6316a62131118ebc42fa82a07abcb3210ee9a5942fa639e876b95154539")
      override
          fun maintenanceStrategies(maintenanceStrategies: MaintenanceStrategiesProperty.Builder.() -> Unit):
          Unit = maintenanceStrategies(MaintenanceStrategiesProperty(maintenanceStrategies))

      override fun maxTotalPrice(maxTotalPrice: String) {
        cdkBuilder.maxTotalPrice(maxTotalPrice)
      }

      override fun minTargetCapacity(minTargetCapacity: Number) {
        cdkBuilder.minTargetCapacity(minTargetCapacity)
      }

      override fun singleAvailabilityZone(singleAvailabilityZone: Boolean) {
        cdkBuilder.singleAvailabilityZone(singleAvailabilityZone)
      }

      override fun singleAvailabilityZone(singleAvailabilityZone: IResolvable) {
        cdkBuilder.singleAvailabilityZone(singleAvailabilityZone.let(IResolvable::unwrap))
      }

      override fun singleInstanceType(singleInstanceType: Boolean) {
        cdkBuilder.singleInstanceType(singleInstanceType)
      }

      override fun singleInstanceType(singleInstanceType: IResolvable) {
        cdkBuilder.singleInstanceType(singleInstanceType.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.ec2.CfnEC2Fleet.SpotOptionsRequestProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.SpotOptionsRequestProperty,
    ) : SpotOptionsRequestProperty {
      override fun allocationStrategy(): String? = unwrap(this).getAllocationStrategy()

      override fun instanceInterruptionBehavior(): String? =
          unwrap(this).getInstanceInterruptionBehavior()

      override fun instancePoolsToUseCount(): Number? = unwrap(this).getInstancePoolsToUseCount()

      override fun maintenanceStrategies(): Any? = unwrap(this).getMaintenanceStrategies()

      override fun maxTotalPrice(): String? = unwrap(this).getMaxTotalPrice()

      override fun minTargetCapacity(): Number? = unwrap(this).getMinTargetCapacity()

      override fun singleAvailabilityZone(): Any? = unwrap(this).getSingleAvailabilityZone()

      override fun singleInstanceType(): Any? = unwrap(this).getSingleInstanceType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SpotOptionsRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnEC2Fleet.SpotOptionsRequestProperty):
          SpotOptionsRequestProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SpotOptionsRequestProperty):
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.SpotOptionsRequestProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface InstanceRequirementsRequestProperty {
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

    public fun memoryMiB(): Any? = unwrap(this).getMemoryMiB()

    public fun networkBandwidthGbps(): Any? = unwrap(this).getNetworkBandwidthGbps()

    public fun networkInterfaceCount(): Any? = unwrap(this).getNetworkInterfaceCount()

    public fun onDemandMaxPricePercentageOverLowestPrice(): Number? =
        unwrap(this).getOnDemandMaxPricePercentageOverLowestPrice()

    public fun requireHibernateSupport(): Any? = unwrap(this).getRequireHibernateSupport()

    public fun spotMaxPricePercentageOverLowestPrice(): Number? =
        unwrap(this).getSpotMaxPricePercentageOverLowestPrice()

    public fun totalLocalStorageGb(): Any? = unwrap(this).getTotalLocalStorageGb()

    public fun vCpuCount(): Any? = unwrap(this).getVCpuCount()

    public interface Builder {
      public fun acceleratorCount(acceleratorCount: IResolvable)

      public fun acceleratorCount(acceleratorCount: AcceleratorCountRequestProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c47fa8de885dd5f9da410cc792099d6bd7508c1bad277ab38dc9f08d30b15464")
      public
          fun acceleratorCount(acceleratorCount: AcceleratorCountRequestProperty.Builder.() -> Unit)

      public fun acceleratorManufacturers(acceleratorManufacturers: List<String>)

      public fun acceleratorManufacturers(vararg acceleratorManufacturers: String)

      public fun acceleratorNames(acceleratorNames: List<String>)

      public fun acceleratorNames(vararg acceleratorNames: String)

      public fun acceleratorTotalMemoryMiB(acceleratorTotalMemoryMiB: IResolvable)

      public
          fun acceleratorTotalMemoryMiB(acceleratorTotalMemoryMiB: AcceleratorTotalMemoryMiBRequestProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f5c35e2c62e850e2f7d24ad83562bca18776cd4f981238d0067d86625b16db72")
      public
          fun acceleratorTotalMemoryMiB(acceleratorTotalMemoryMiB: AcceleratorTotalMemoryMiBRequestProperty.Builder.() -> Unit)

      public fun acceleratorTypes(acceleratorTypes: List<String>)

      public fun acceleratorTypes(vararg acceleratorTypes: String)

      public fun allowedInstanceTypes(allowedInstanceTypes: List<String>)

      public fun allowedInstanceTypes(vararg allowedInstanceTypes: String)

      public fun bareMetal(bareMetal: String)

      public fun baselineEbsBandwidthMbps(baselineEbsBandwidthMbps: IResolvable)

      public
          fun baselineEbsBandwidthMbps(baselineEbsBandwidthMbps: BaselineEbsBandwidthMbpsRequestProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("19534bbb047387c09ab85613a207af1e0cb22e91d8d0f22ccc3db25943079ad9")
      public
          fun baselineEbsBandwidthMbps(baselineEbsBandwidthMbps: BaselineEbsBandwidthMbpsRequestProperty.Builder.() -> Unit)

      public fun burstablePerformance(burstablePerformance: String)

      public fun cpuManufacturers(cpuManufacturers: List<String>)

      public fun cpuManufacturers(vararg cpuManufacturers: String)

      public fun excludedInstanceTypes(excludedInstanceTypes: List<String>)

      public fun excludedInstanceTypes(vararg excludedInstanceTypes: String)

      public fun instanceGenerations(instanceGenerations: List<String>)

      public fun instanceGenerations(vararg instanceGenerations: String)

      public fun localStorage(localStorage: String)

      public fun localStorageTypes(localStorageTypes: List<String>)

      public fun localStorageTypes(vararg localStorageTypes: String)

      public
          fun maxSpotPriceAsPercentageOfOptimalOnDemandPrice(maxSpotPriceAsPercentageOfOptimalOnDemandPrice: Number)

      public fun memoryGiBPerVCpu(memoryGiBPerVCpu: IResolvable)

      public fun memoryGiBPerVCpu(memoryGiBPerVCpu: MemoryGiBPerVCpuRequestProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cb4c1ca6587add1b9116c99aa6e4498c7a2e58bedad71f3a4ce2313e9308a0d6")
      public
          fun memoryGiBPerVCpu(memoryGiBPerVCpu: MemoryGiBPerVCpuRequestProperty.Builder.() -> Unit)

      public fun memoryMiB(memoryMiB: IResolvable)

      public fun memoryMiB(memoryMiB: MemoryMiBRequestProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("89b393de1edce629abce74c6b91f90af952d8bfb5bce71299af2514e2e31971b")
      public fun memoryMiB(memoryMiB: MemoryMiBRequestProperty.Builder.() -> Unit)

      public fun networkBandwidthGbps(networkBandwidthGbps: IResolvable)

      public fun networkBandwidthGbps(networkBandwidthGbps: NetworkBandwidthGbpsRequestProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fbc305de9dfcfa46ed17753b3731d42835e2ce5d3e13ae3e75930d3ebd273b71")
      public
          fun networkBandwidthGbps(networkBandwidthGbps: NetworkBandwidthGbpsRequestProperty.Builder.() -> Unit)

      public fun networkInterfaceCount(networkInterfaceCount: IResolvable)

      public fun networkInterfaceCount(networkInterfaceCount: NetworkInterfaceCountRequestProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0aefd44432d942bf8fa655fc41a78c488cb4c89021a7f2f5304ca9da56f3bedd")
      public
          fun networkInterfaceCount(networkInterfaceCount: NetworkInterfaceCountRequestProperty.Builder.() -> Unit)

      public
          fun onDemandMaxPricePercentageOverLowestPrice(onDemandMaxPricePercentageOverLowestPrice: Number)

      public fun requireHibernateSupport(requireHibernateSupport: Boolean)

      public fun requireHibernateSupport(requireHibernateSupport: IResolvable)

      public
          fun spotMaxPricePercentageOverLowestPrice(spotMaxPricePercentageOverLowestPrice: Number)

      public fun totalLocalStorageGb(totalLocalStorageGb: IResolvable)

      public fun totalLocalStorageGb(totalLocalStorageGb: TotalLocalStorageGBRequestProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("274e6344f3d3b68b13e415c9ff2f989ecd9efba4807de0eb82b31b302f5ae7e5")
      public
          fun totalLocalStorageGb(totalLocalStorageGb: TotalLocalStorageGBRequestProperty.Builder.() -> Unit)

      public fun vCpuCount(vCpuCount: IResolvable)

      public fun vCpuCount(vCpuCount: VCpuCountRangeRequestProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("068e0d31b8c48e26793c4cd21945d06f96fec0418b4b3b216f4c7a91d92cf0e9")
      public fun vCpuCount(vCpuCount: VCpuCountRangeRequestProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.InstanceRequirementsRequestProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.InstanceRequirementsRequestProperty.builder()

      override fun acceleratorCount(acceleratorCount: IResolvable) {
        cdkBuilder.acceleratorCount(acceleratorCount.let(IResolvable::unwrap))
      }

      override fun acceleratorCount(acceleratorCount: AcceleratorCountRequestProperty) {
        cdkBuilder.acceleratorCount(acceleratorCount.let(AcceleratorCountRequestProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c47fa8de885dd5f9da410cc792099d6bd7508c1bad277ab38dc9f08d30b15464")
      override
          fun acceleratorCount(acceleratorCount: AcceleratorCountRequestProperty.Builder.() -> Unit):
          Unit = acceleratorCount(AcceleratorCountRequestProperty(acceleratorCount))

      override fun acceleratorManufacturers(acceleratorManufacturers: List<String>) {
        cdkBuilder.acceleratorManufacturers(acceleratorManufacturers)
      }

      override fun acceleratorManufacturers(vararg acceleratorManufacturers: String): Unit =
          acceleratorManufacturers(acceleratorManufacturers.toList())

      override fun acceleratorNames(acceleratorNames: List<String>) {
        cdkBuilder.acceleratorNames(acceleratorNames)
      }

      override fun acceleratorNames(vararg acceleratorNames: String): Unit =
          acceleratorNames(acceleratorNames.toList())

      override fun acceleratorTotalMemoryMiB(acceleratorTotalMemoryMiB: IResolvable) {
        cdkBuilder.acceleratorTotalMemoryMiB(acceleratorTotalMemoryMiB.let(IResolvable::unwrap))
      }

      override
          fun acceleratorTotalMemoryMiB(acceleratorTotalMemoryMiB: AcceleratorTotalMemoryMiBRequestProperty) {
        cdkBuilder.acceleratorTotalMemoryMiB(acceleratorTotalMemoryMiB.let(AcceleratorTotalMemoryMiBRequestProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f5c35e2c62e850e2f7d24ad83562bca18776cd4f981238d0067d86625b16db72")
      override
          fun acceleratorTotalMemoryMiB(acceleratorTotalMemoryMiB: AcceleratorTotalMemoryMiBRequestProperty.Builder.() -> Unit):
          Unit =
          acceleratorTotalMemoryMiB(AcceleratorTotalMemoryMiBRequestProperty(acceleratorTotalMemoryMiB))

      override fun acceleratorTypes(acceleratorTypes: List<String>) {
        cdkBuilder.acceleratorTypes(acceleratorTypes)
      }

      override fun acceleratorTypes(vararg acceleratorTypes: String): Unit =
          acceleratorTypes(acceleratorTypes.toList())

      override fun allowedInstanceTypes(allowedInstanceTypes: List<String>) {
        cdkBuilder.allowedInstanceTypes(allowedInstanceTypes)
      }

      override fun allowedInstanceTypes(vararg allowedInstanceTypes: String): Unit =
          allowedInstanceTypes(allowedInstanceTypes.toList())

      override fun bareMetal(bareMetal: String) {
        cdkBuilder.bareMetal(bareMetal)
      }

      override fun baselineEbsBandwidthMbps(baselineEbsBandwidthMbps: IResolvable) {
        cdkBuilder.baselineEbsBandwidthMbps(baselineEbsBandwidthMbps.let(IResolvable::unwrap))
      }

      override
          fun baselineEbsBandwidthMbps(baselineEbsBandwidthMbps: BaselineEbsBandwidthMbpsRequestProperty) {
        cdkBuilder.baselineEbsBandwidthMbps(baselineEbsBandwidthMbps.let(BaselineEbsBandwidthMbpsRequestProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("19534bbb047387c09ab85613a207af1e0cb22e91d8d0f22ccc3db25943079ad9")
      override
          fun baselineEbsBandwidthMbps(baselineEbsBandwidthMbps: BaselineEbsBandwidthMbpsRequestProperty.Builder.() -> Unit):
          Unit =
          baselineEbsBandwidthMbps(BaselineEbsBandwidthMbpsRequestProperty(baselineEbsBandwidthMbps))

      override fun burstablePerformance(burstablePerformance: String) {
        cdkBuilder.burstablePerformance(burstablePerformance)
      }

      override fun cpuManufacturers(cpuManufacturers: List<String>) {
        cdkBuilder.cpuManufacturers(cpuManufacturers)
      }

      override fun cpuManufacturers(vararg cpuManufacturers: String): Unit =
          cpuManufacturers(cpuManufacturers.toList())

      override fun excludedInstanceTypes(excludedInstanceTypes: List<String>) {
        cdkBuilder.excludedInstanceTypes(excludedInstanceTypes)
      }

      override fun excludedInstanceTypes(vararg excludedInstanceTypes: String): Unit =
          excludedInstanceTypes(excludedInstanceTypes.toList())

      override fun instanceGenerations(instanceGenerations: List<String>) {
        cdkBuilder.instanceGenerations(instanceGenerations)
      }

      override fun instanceGenerations(vararg instanceGenerations: String): Unit =
          instanceGenerations(instanceGenerations.toList())

      override fun localStorage(localStorage: String) {
        cdkBuilder.localStorage(localStorage)
      }

      override fun localStorageTypes(localStorageTypes: List<String>) {
        cdkBuilder.localStorageTypes(localStorageTypes)
      }

      override fun localStorageTypes(vararg localStorageTypes: String): Unit =
          localStorageTypes(localStorageTypes.toList())

      override
          fun maxSpotPriceAsPercentageOfOptimalOnDemandPrice(maxSpotPriceAsPercentageOfOptimalOnDemandPrice: Number) {
        cdkBuilder.maxSpotPriceAsPercentageOfOptimalOnDemandPrice(maxSpotPriceAsPercentageOfOptimalOnDemandPrice)
      }

      override fun memoryGiBPerVCpu(memoryGiBPerVCpu: IResolvable) {
        cdkBuilder.memoryGiBPerVCpu(memoryGiBPerVCpu.let(IResolvable::unwrap))
      }

      override fun memoryGiBPerVCpu(memoryGiBPerVCpu: MemoryGiBPerVCpuRequestProperty) {
        cdkBuilder.memoryGiBPerVCpu(memoryGiBPerVCpu.let(MemoryGiBPerVCpuRequestProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cb4c1ca6587add1b9116c99aa6e4498c7a2e58bedad71f3a4ce2313e9308a0d6")
      override
          fun memoryGiBPerVCpu(memoryGiBPerVCpu: MemoryGiBPerVCpuRequestProperty.Builder.() -> Unit):
          Unit = memoryGiBPerVCpu(MemoryGiBPerVCpuRequestProperty(memoryGiBPerVCpu))

      override fun memoryMiB(memoryMiB: IResolvable) {
        cdkBuilder.memoryMiB(memoryMiB.let(IResolvable::unwrap))
      }

      override fun memoryMiB(memoryMiB: MemoryMiBRequestProperty) {
        cdkBuilder.memoryMiB(memoryMiB.let(MemoryMiBRequestProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("89b393de1edce629abce74c6b91f90af952d8bfb5bce71299af2514e2e31971b")
      override fun memoryMiB(memoryMiB: MemoryMiBRequestProperty.Builder.() -> Unit): Unit =
          memoryMiB(MemoryMiBRequestProperty(memoryMiB))

      override fun networkBandwidthGbps(networkBandwidthGbps: IResolvable) {
        cdkBuilder.networkBandwidthGbps(networkBandwidthGbps.let(IResolvable::unwrap))
      }

      override fun networkBandwidthGbps(networkBandwidthGbps: NetworkBandwidthGbpsRequestProperty) {
        cdkBuilder.networkBandwidthGbps(networkBandwidthGbps.let(NetworkBandwidthGbpsRequestProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fbc305de9dfcfa46ed17753b3731d42835e2ce5d3e13ae3e75930d3ebd273b71")
      override
          fun networkBandwidthGbps(networkBandwidthGbps: NetworkBandwidthGbpsRequestProperty.Builder.() -> Unit):
          Unit = networkBandwidthGbps(NetworkBandwidthGbpsRequestProperty(networkBandwidthGbps))

      override fun networkInterfaceCount(networkInterfaceCount: IResolvable) {
        cdkBuilder.networkInterfaceCount(networkInterfaceCount.let(IResolvable::unwrap))
      }

      override
          fun networkInterfaceCount(networkInterfaceCount: NetworkInterfaceCountRequestProperty) {
        cdkBuilder.networkInterfaceCount(networkInterfaceCount.let(NetworkInterfaceCountRequestProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0aefd44432d942bf8fa655fc41a78c488cb4c89021a7f2f5304ca9da56f3bedd")
      override
          fun networkInterfaceCount(networkInterfaceCount: NetworkInterfaceCountRequestProperty.Builder.() -> Unit):
          Unit = networkInterfaceCount(NetworkInterfaceCountRequestProperty(networkInterfaceCount))

      override
          fun onDemandMaxPricePercentageOverLowestPrice(onDemandMaxPricePercentageOverLowestPrice: Number) {
        cdkBuilder.onDemandMaxPricePercentageOverLowestPrice(onDemandMaxPricePercentageOverLowestPrice)
      }

      override fun requireHibernateSupport(requireHibernateSupport: Boolean) {
        cdkBuilder.requireHibernateSupport(requireHibernateSupport)
      }

      override fun requireHibernateSupport(requireHibernateSupport: IResolvable) {
        cdkBuilder.requireHibernateSupport(requireHibernateSupport.let(IResolvable::unwrap))
      }

      override
          fun spotMaxPricePercentageOverLowestPrice(spotMaxPricePercentageOverLowestPrice: Number) {
        cdkBuilder.spotMaxPricePercentageOverLowestPrice(spotMaxPricePercentageOverLowestPrice)
      }

      override fun totalLocalStorageGb(totalLocalStorageGb: IResolvable) {
        cdkBuilder.totalLocalStorageGb(totalLocalStorageGb.let(IResolvable::unwrap))
      }

      override fun totalLocalStorageGb(totalLocalStorageGb: TotalLocalStorageGBRequestProperty) {
        cdkBuilder.totalLocalStorageGb(totalLocalStorageGb.let(TotalLocalStorageGBRequestProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("274e6344f3d3b68b13e415c9ff2f989ecd9efba4807de0eb82b31b302f5ae7e5")
      override
          fun totalLocalStorageGb(totalLocalStorageGb: TotalLocalStorageGBRequestProperty.Builder.() -> Unit):
          Unit = totalLocalStorageGb(TotalLocalStorageGBRequestProperty(totalLocalStorageGb))

      override fun vCpuCount(vCpuCount: IResolvable) {
        cdkBuilder.vCpuCount(vCpuCount.let(IResolvable::unwrap))
      }

      override fun vCpuCount(vCpuCount: VCpuCountRangeRequestProperty) {
        cdkBuilder.vCpuCount(vCpuCount.let(VCpuCountRangeRequestProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("068e0d31b8c48e26793c4cd21945d06f96fec0418b4b3b216f4c7a91d92cf0e9")
      override fun vCpuCount(vCpuCount: VCpuCountRangeRequestProperty.Builder.() -> Unit): Unit =
          vCpuCount(VCpuCountRangeRequestProperty(vCpuCount))

      public fun build():
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.InstanceRequirementsRequestProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.InstanceRequirementsRequestProperty,
    ) : InstanceRequirementsRequestProperty {
      override fun acceleratorCount(): Any? = unwrap(this).getAcceleratorCount()

      override fun acceleratorManufacturers(): List<String> =
          unwrap(this).getAcceleratorManufacturers() ?: emptyList()

      override fun acceleratorNames(): List<String> = unwrap(this).getAcceleratorNames() ?:
          emptyList()

      override fun acceleratorTotalMemoryMiB(): Any? = unwrap(this).getAcceleratorTotalMemoryMiB()

      override fun acceleratorTypes(): List<String> = unwrap(this).getAcceleratorTypes() ?:
          emptyList()

      override fun allowedInstanceTypes(): List<String> = unwrap(this).getAllowedInstanceTypes() ?:
          emptyList()

      override fun bareMetal(): String? = unwrap(this).getBareMetal()

      override fun baselineEbsBandwidthMbps(): Any? = unwrap(this).getBaselineEbsBandwidthMbps()

      override fun burstablePerformance(): String? = unwrap(this).getBurstablePerformance()

      override fun cpuManufacturers(): List<String> = unwrap(this).getCpuManufacturers() ?:
          emptyList()

      override fun excludedInstanceTypes(): List<String> = unwrap(this).getExcludedInstanceTypes()
          ?: emptyList()

      override fun instanceGenerations(): List<String> = unwrap(this).getInstanceGenerations() ?:
          emptyList()

      override fun localStorage(): String? = unwrap(this).getLocalStorage()

      override fun localStorageTypes(): List<String> = unwrap(this).getLocalStorageTypes() ?:
          emptyList()

      override fun maxSpotPriceAsPercentageOfOptimalOnDemandPrice(): Number? =
          unwrap(this).getMaxSpotPriceAsPercentageOfOptimalOnDemandPrice()

      override fun memoryGiBPerVCpu(): Any? = unwrap(this).getMemoryGiBPerVCpu()

      override fun memoryMiB(): Any? = unwrap(this).getMemoryMiB()

      override fun networkBandwidthGbps(): Any? = unwrap(this).getNetworkBandwidthGbps()

      override fun networkInterfaceCount(): Any? = unwrap(this).getNetworkInterfaceCount()

      override fun onDemandMaxPricePercentageOverLowestPrice(): Number? =
          unwrap(this).getOnDemandMaxPricePercentageOverLowestPrice()

      override fun requireHibernateSupport(): Any? = unwrap(this).getRequireHibernateSupport()

      override fun spotMaxPricePercentageOverLowestPrice(): Number? =
          unwrap(this).getSpotMaxPricePercentageOverLowestPrice()

      override fun totalLocalStorageGb(): Any? = unwrap(this).getTotalLocalStorageGb()

      override fun vCpuCount(): Any? = unwrap(this).getVCpuCount()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          InstanceRequirementsRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnEC2Fleet.InstanceRequirementsRequestProperty):
          InstanceRequirementsRequestProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InstanceRequirementsRequestProperty):
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.InstanceRequirementsRequestProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface MaintenanceStrategiesProperty {
    public fun capacityRebalance(): Any? = unwrap(this).getCapacityRebalance()

    public interface Builder {
      public fun capacityRebalance(capacityRebalance: IResolvable)

      public fun capacityRebalance(capacityRebalance: CapacityRebalanceProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4b367b1646207064ec7fe580a92bcaa435e03ca7f5ef4af6d271da161412cbe2")
      public fun capacityRebalance(capacityRebalance: CapacityRebalanceProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.MaintenanceStrategiesProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.MaintenanceStrategiesProperty.builder()

      override fun capacityRebalance(capacityRebalance: IResolvable) {
        cdkBuilder.capacityRebalance(capacityRebalance.let(IResolvable::unwrap))
      }

      override fun capacityRebalance(capacityRebalance: CapacityRebalanceProperty) {
        cdkBuilder.capacityRebalance(capacityRebalance.let(CapacityRebalanceProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4b367b1646207064ec7fe580a92bcaa435e03ca7f5ef4af6d271da161412cbe2")
      override
          fun capacityRebalance(capacityRebalance: CapacityRebalanceProperty.Builder.() -> Unit):
          Unit = capacityRebalance(CapacityRebalanceProperty(capacityRebalance))

      public fun build():
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.MaintenanceStrategiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.MaintenanceStrategiesProperty,
    ) : MaintenanceStrategiesProperty {
      override fun capacityRebalance(): Any? = unwrap(this).getCapacityRebalance()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MaintenanceStrategiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnEC2Fleet.MaintenanceStrategiesProperty):
          MaintenanceStrategiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MaintenanceStrategiesProperty):
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.MaintenanceStrategiesProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface CapacityRebalanceProperty {
    public fun replacementStrategy(): String? = unwrap(this).getReplacementStrategy()

    public fun terminationDelay(): Number? = unwrap(this).getTerminationDelay()

    public interface Builder {
      public fun replacementStrategy(replacementStrategy: String)

      public fun terminationDelay(terminationDelay: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.CapacityRebalanceProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.CapacityRebalanceProperty.builder()

      override fun replacementStrategy(replacementStrategy: String) {
        cdkBuilder.replacementStrategy(replacementStrategy)
      }

      override fun terminationDelay(terminationDelay: Number) {
        cdkBuilder.terminationDelay(terminationDelay)
      }

      public fun build(): software.amazon.awscdk.services.ec2.CfnEC2Fleet.CapacityRebalanceProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.CapacityRebalanceProperty,
    ) : CapacityRebalanceProperty {
      override fun replacementStrategy(): String? = unwrap(this).getReplacementStrategy()

      override fun terminationDelay(): Number? = unwrap(this).getTerminationDelay()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CapacityRebalanceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnEC2Fleet.CapacityRebalanceProperty):
          CapacityRebalanceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CapacityRebalanceProperty):
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.CapacityRebalanceProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface NetworkInterfaceCountRequestProperty {
    public fun max(): Number? = unwrap(this).getMax()

    public fun min(): Number? = unwrap(this).getMin()

    public interface Builder {
      public fun max(max: Number)

      public fun min(min: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.NetworkInterfaceCountRequestProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.NetworkInterfaceCountRequestProperty.builder()

      override fun max(max: Number) {
        cdkBuilder.max(max)
      }

      override fun min(min: Number) {
        cdkBuilder.min(min)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.NetworkInterfaceCountRequestProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.NetworkInterfaceCountRequestProperty,
    ) : NetworkInterfaceCountRequestProperty {
      override fun max(): Number? = unwrap(this).getMax()

      override fun min(): Number? = unwrap(this).getMin()
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
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnEC2Fleet.NetworkInterfaceCountRequestProperty):
          NetworkInterfaceCountRequestProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NetworkInterfaceCountRequestProperty):
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.NetworkInterfaceCountRequestProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface PlacementProperty {
    public fun affinity(): String? = unwrap(this).getAffinity()

    public fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

    public fun groupName(): String? = unwrap(this).getGroupName()

    public fun hostId(): String? = unwrap(this).getHostId()

    public fun hostResourceGroupArn(): String? = unwrap(this).getHostResourceGroupArn()

    public fun partitionNumber(): Number? = unwrap(this).getPartitionNumber()

    public fun spreadDomain(): String? = unwrap(this).getSpreadDomain()

    public fun tenancy(): String? = unwrap(this).getTenancy()

    public interface Builder {
      public fun affinity(affinity: String)

      public fun availabilityZone(availabilityZone: String)

      public fun groupName(groupName: String)

      public fun hostId(hostId: String)

      public fun hostResourceGroupArn(hostResourceGroupArn: String)

      public fun partitionNumber(partitionNumber: Number)

      public fun spreadDomain(spreadDomain: String)

      public fun tenancy(tenancy: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.PlacementProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.PlacementProperty.builder()

      override fun affinity(affinity: String) {
        cdkBuilder.affinity(affinity)
      }

      override fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
      }

      override fun groupName(groupName: String) {
        cdkBuilder.groupName(groupName)
      }

      override fun hostId(hostId: String) {
        cdkBuilder.hostId(hostId)
      }

      override fun hostResourceGroupArn(hostResourceGroupArn: String) {
        cdkBuilder.hostResourceGroupArn(hostResourceGroupArn)
      }

      override fun partitionNumber(partitionNumber: Number) {
        cdkBuilder.partitionNumber(partitionNumber)
      }

      override fun spreadDomain(spreadDomain: String) {
        cdkBuilder.spreadDomain(spreadDomain)
      }

      override fun tenancy(tenancy: String) {
        cdkBuilder.tenancy(tenancy)
      }

      public fun build(): software.amazon.awscdk.services.ec2.CfnEC2Fleet.PlacementProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.ec2.CfnEC2Fleet.PlacementProperty,
    ) : PlacementProperty {
      override fun affinity(): String? = unwrap(this).getAffinity()

      override fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

      override fun groupName(): String? = unwrap(this).getGroupName()

      override fun hostId(): String? = unwrap(this).getHostId()

      override fun hostResourceGroupArn(): String? = unwrap(this).getHostResourceGroupArn()

      override fun partitionNumber(): Number? = unwrap(this).getPartitionNumber()

      override fun spreadDomain(): String? = unwrap(this).getSpreadDomain()

      override fun tenancy(): String? = unwrap(this).getTenancy()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PlacementProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnEC2Fleet.PlacementProperty):
          PlacementProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PlacementProperty):
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.PlacementProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface NetworkBandwidthGbpsRequestProperty {
    public fun max(): Number? = unwrap(this).getMax()

    public fun min(): Number? = unwrap(this).getMin()

    public interface Builder {
      public fun max(max: Number)

      public fun min(min: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.NetworkBandwidthGbpsRequestProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.NetworkBandwidthGbpsRequestProperty.builder()

      override fun max(max: Number) {
        cdkBuilder.max(max)
      }

      override fun min(min: Number) {
        cdkBuilder.min(min)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.NetworkBandwidthGbpsRequestProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.NetworkBandwidthGbpsRequestProperty,
    ) : NetworkBandwidthGbpsRequestProperty {
      override fun max(): Number? = unwrap(this).getMax()

      override fun min(): Number? = unwrap(this).getMin()
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
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnEC2Fleet.NetworkBandwidthGbpsRequestProperty):
          NetworkBandwidthGbpsRequestProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NetworkBandwidthGbpsRequestProperty):
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.NetworkBandwidthGbpsRequestProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface BaselineEbsBandwidthMbpsRequestProperty {
    public fun max(): Number? = unwrap(this).getMax()

    public fun min(): Number? = unwrap(this).getMin()

    public interface Builder {
      public fun max(max: Number)

      public fun min(min: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.BaselineEbsBandwidthMbpsRequestProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.BaselineEbsBandwidthMbpsRequestProperty.builder()

      override fun max(max: Number) {
        cdkBuilder.max(max)
      }

      override fun min(min: Number) {
        cdkBuilder.min(min)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.BaselineEbsBandwidthMbpsRequestProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.BaselineEbsBandwidthMbpsRequestProperty,
    ) : BaselineEbsBandwidthMbpsRequestProperty {
      override fun max(): Number? = unwrap(this).getMax()

      override fun min(): Number? = unwrap(this).getMin()
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
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnEC2Fleet.BaselineEbsBandwidthMbpsRequestProperty):
          BaselineEbsBandwidthMbpsRequestProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BaselineEbsBandwidthMbpsRequestProperty):
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.BaselineEbsBandwidthMbpsRequestProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface OnDemandOptionsRequestProperty {
    public fun allocationStrategy(): String? = unwrap(this).getAllocationStrategy()

    public fun capacityReservationOptions(): Any? = unwrap(this).getCapacityReservationOptions()

    public fun maxTotalPrice(): String? = unwrap(this).getMaxTotalPrice()

    public fun minTargetCapacity(): Number? = unwrap(this).getMinTargetCapacity()

    public fun singleAvailabilityZone(): Any? = unwrap(this).getSingleAvailabilityZone()

    public fun singleInstanceType(): Any? = unwrap(this).getSingleInstanceType()

    public interface Builder {
      public fun allocationStrategy(allocationStrategy: String)

      public fun capacityReservationOptions(capacityReservationOptions: IResolvable)

      public
          fun capacityReservationOptions(capacityReservationOptions: CapacityReservationOptionsRequestProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("44d65a255e2e8408608684ca96aa0805cfc82a089a45a7af1a9f1688b6b173ae")
      public
          fun capacityReservationOptions(capacityReservationOptions: CapacityReservationOptionsRequestProperty.Builder.() -> Unit)

      public fun maxTotalPrice(maxTotalPrice: String)

      public fun minTargetCapacity(minTargetCapacity: Number)

      public fun singleAvailabilityZone(singleAvailabilityZone: Boolean)

      public fun singleAvailabilityZone(singleAvailabilityZone: IResolvable)

      public fun singleInstanceType(singleInstanceType: Boolean)

      public fun singleInstanceType(singleInstanceType: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.OnDemandOptionsRequestProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.OnDemandOptionsRequestProperty.builder()

      override fun allocationStrategy(allocationStrategy: String) {
        cdkBuilder.allocationStrategy(allocationStrategy)
      }

      override fun capacityReservationOptions(capacityReservationOptions: IResolvable) {
        cdkBuilder.capacityReservationOptions(capacityReservationOptions.let(IResolvable::unwrap))
      }

      override
          fun capacityReservationOptions(capacityReservationOptions: CapacityReservationOptionsRequestProperty) {
        cdkBuilder.capacityReservationOptions(capacityReservationOptions.let(CapacityReservationOptionsRequestProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("44d65a255e2e8408608684ca96aa0805cfc82a089a45a7af1a9f1688b6b173ae")
      override
          fun capacityReservationOptions(capacityReservationOptions: CapacityReservationOptionsRequestProperty.Builder.() -> Unit):
          Unit =
          capacityReservationOptions(CapacityReservationOptionsRequestProperty(capacityReservationOptions))

      override fun maxTotalPrice(maxTotalPrice: String) {
        cdkBuilder.maxTotalPrice(maxTotalPrice)
      }

      override fun minTargetCapacity(minTargetCapacity: Number) {
        cdkBuilder.minTargetCapacity(minTargetCapacity)
      }

      override fun singleAvailabilityZone(singleAvailabilityZone: Boolean) {
        cdkBuilder.singleAvailabilityZone(singleAvailabilityZone)
      }

      override fun singleAvailabilityZone(singleAvailabilityZone: IResolvable) {
        cdkBuilder.singleAvailabilityZone(singleAvailabilityZone.let(IResolvable::unwrap))
      }

      override fun singleInstanceType(singleInstanceType: Boolean) {
        cdkBuilder.singleInstanceType(singleInstanceType)
      }

      override fun singleInstanceType(singleInstanceType: IResolvable) {
        cdkBuilder.singleInstanceType(singleInstanceType.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.OnDemandOptionsRequestProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.OnDemandOptionsRequestProperty,
    ) : OnDemandOptionsRequestProperty {
      override fun allocationStrategy(): String? = unwrap(this).getAllocationStrategy()

      override fun capacityReservationOptions(): Any? = unwrap(this).getCapacityReservationOptions()

      override fun maxTotalPrice(): String? = unwrap(this).getMaxTotalPrice()

      override fun minTargetCapacity(): Number? = unwrap(this).getMinTargetCapacity()

      override fun singleAvailabilityZone(): Any? = unwrap(this).getSingleAvailabilityZone()

      override fun singleInstanceType(): Any? = unwrap(this).getSingleInstanceType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): OnDemandOptionsRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnEC2Fleet.OnDemandOptionsRequestProperty):
          OnDemandOptionsRequestProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OnDemandOptionsRequestProperty):
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.OnDemandOptionsRequestProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface FleetLaunchTemplateSpecificationRequestProperty {
    public fun launchTemplateId(): String? = unwrap(this).getLaunchTemplateId()

    public fun launchTemplateName(): String? = unwrap(this).getLaunchTemplateName()

    public fun version(): String

    public interface Builder {
      public fun launchTemplateId(launchTemplateId: String)

      public fun launchTemplateName(launchTemplateName: String)

      public fun version(version: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.FleetLaunchTemplateSpecificationRequestProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.FleetLaunchTemplateSpecificationRequestProperty.builder()

      override fun launchTemplateId(launchTemplateId: String) {
        cdkBuilder.launchTemplateId(launchTemplateId)
      }

      override fun launchTemplateName(launchTemplateName: String) {
        cdkBuilder.launchTemplateName(launchTemplateName)
      }

      override fun version(version: String) {
        cdkBuilder.version(version)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.FleetLaunchTemplateSpecificationRequestProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.FleetLaunchTemplateSpecificationRequestProperty,
    ) : FleetLaunchTemplateSpecificationRequestProperty {
      override fun launchTemplateId(): String? = unwrap(this).getLaunchTemplateId()

      override fun launchTemplateName(): String? = unwrap(this).getLaunchTemplateName()

      override fun version(): String = unwrap(this).getVersion()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          FleetLaunchTemplateSpecificationRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnEC2Fleet.FleetLaunchTemplateSpecificationRequestProperty):
          FleetLaunchTemplateSpecificationRequestProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FleetLaunchTemplateSpecificationRequestProperty):
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.FleetLaunchTemplateSpecificationRequestProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface MemoryMiBRequestProperty {
    public fun max(): Number? = unwrap(this).getMax()

    public fun min(): Number? = unwrap(this).getMin()

    public interface Builder {
      public fun max(max: Number)

      public fun min(min: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.MemoryMiBRequestProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.MemoryMiBRequestProperty.builder()

      override fun max(max: Number) {
        cdkBuilder.max(max)
      }

      override fun min(min: Number) {
        cdkBuilder.min(min)
      }

      public fun build(): software.amazon.awscdk.services.ec2.CfnEC2Fleet.MemoryMiBRequestProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.MemoryMiBRequestProperty,
    ) : MemoryMiBRequestProperty {
      override fun max(): Number? = unwrap(this).getMax()

      override fun min(): Number? = unwrap(this).getMin()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MemoryMiBRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnEC2Fleet.MemoryMiBRequestProperty):
          MemoryMiBRequestProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MemoryMiBRequestProperty):
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.MemoryMiBRequestProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface VCpuCountRangeRequestProperty {
    public fun max(): Number? = unwrap(this).getMax()

    public fun min(): Number? = unwrap(this).getMin()

    public interface Builder {
      public fun max(max: Number)

      public fun min(min: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.VCpuCountRangeRequestProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.VCpuCountRangeRequestProperty.builder()

      override fun max(max: Number) {
        cdkBuilder.max(max)
      }

      override fun min(min: Number) {
        cdkBuilder.min(min)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.VCpuCountRangeRequestProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.VCpuCountRangeRequestProperty,
    ) : VCpuCountRangeRequestProperty {
      override fun max(): Number? = unwrap(this).getMax()

      override fun min(): Number? = unwrap(this).getMin()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): VCpuCountRangeRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnEC2Fleet.VCpuCountRangeRequestProperty):
          VCpuCountRangeRequestProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VCpuCountRangeRequestProperty):
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.VCpuCountRangeRequestProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface AcceleratorTotalMemoryMiBRequestProperty {
    public fun max(): Number? = unwrap(this).getMax()

    public fun min(): Number? = unwrap(this).getMin()

    public interface Builder {
      public fun max(max: Number)

      public fun min(min: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.AcceleratorTotalMemoryMiBRequestProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.AcceleratorTotalMemoryMiBRequestProperty.builder()

      override fun max(max: Number) {
        cdkBuilder.max(max)
      }

      override fun min(min: Number) {
        cdkBuilder.min(min)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.AcceleratorTotalMemoryMiBRequestProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.AcceleratorTotalMemoryMiBRequestProperty,
    ) : AcceleratorTotalMemoryMiBRequestProperty {
      override fun max(): Number? = unwrap(this).getMax()

      override fun min(): Number? = unwrap(this).getMin()
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
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnEC2Fleet.AcceleratorTotalMemoryMiBRequestProperty):
          AcceleratorTotalMemoryMiBRequestProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AcceleratorTotalMemoryMiBRequestProperty):
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.AcceleratorTotalMemoryMiBRequestProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface CapacityReservationOptionsRequestProperty {
    public fun usageStrategy(): String? = unwrap(this).getUsageStrategy()

    public interface Builder {
      public fun usageStrategy(usageStrategy: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.CapacityReservationOptionsRequestProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.CapacityReservationOptionsRequestProperty.builder()

      override fun usageStrategy(usageStrategy: String) {
        cdkBuilder.usageStrategy(usageStrategy)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.CapacityReservationOptionsRequestProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.CapacityReservationOptionsRequestProperty,
    ) : CapacityReservationOptionsRequestProperty {
      override fun usageStrategy(): String? = unwrap(this).getUsageStrategy()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          CapacityReservationOptionsRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnEC2Fleet.CapacityReservationOptionsRequestProperty):
          CapacityReservationOptionsRequestProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CapacityReservationOptionsRequestProperty):
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.CapacityReservationOptionsRequestProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface FleetLaunchTemplateConfigRequestProperty {
    public fun launchTemplateSpecification(): Any? = unwrap(this).getLaunchTemplateSpecification()

    public fun overrides(): Any? = unwrap(this).getOverrides()

    public interface Builder {
      public fun launchTemplateSpecification(launchTemplateSpecification: IResolvable)

      public
          fun launchTemplateSpecification(launchTemplateSpecification: FleetLaunchTemplateSpecificationRequestProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b0ec4cc1dc1142399b7f1cacbbd347beb1f9bba7e97e957a3dca7cc4b86b049e")
      public
          fun launchTemplateSpecification(launchTemplateSpecification: FleetLaunchTemplateSpecificationRequestProperty.Builder.() -> Unit)

      public fun overrides(overrides: IResolvable)

      public fun overrides(overrides: List<Any>)

      public fun overrides(vararg overrides: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.FleetLaunchTemplateConfigRequestProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.FleetLaunchTemplateConfigRequestProperty.builder()

      override fun launchTemplateSpecification(launchTemplateSpecification: IResolvable) {
        cdkBuilder.launchTemplateSpecification(launchTemplateSpecification.let(IResolvable::unwrap))
      }

      override
          fun launchTemplateSpecification(launchTemplateSpecification: FleetLaunchTemplateSpecificationRequestProperty) {
        cdkBuilder.launchTemplateSpecification(launchTemplateSpecification.let(FleetLaunchTemplateSpecificationRequestProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b0ec4cc1dc1142399b7f1cacbbd347beb1f9bba7e97e957a3dca7cc4b86b049e")
      override
          fun launchTemplateSpecification(launchTemplateSpecification: FleetLaunchTemplateSpecificationRequestProperty.Builder.() -> Unit):
          Unit =
          launchTemplateSpecification(FleetLaunchTemplateSpecificationRequestProperty(launchTemplateSpecification))

      override fun overrides(overrides: IResolvable) {
        cdkBuilder.overrides(overrides.let(IResolvable::unwrap))
      }

      override fun overrides(overrides: List<Any>) {
        cdkBuilder.overrides(overrides)
      }

      override fun overrides(vararg overrides: Any): Unit = overrides(overrides.toList())

      public fun build():
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.FleetLaunchTemplateConfigRequestProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.FleetLaunchTemplateConfigRequestProperty,
    ) : FleetLaunchTemplateConfigRequestProperty {
      override fun launchTemplateSpecification(): Any? =
          unwrap(this).getLaunchTemplateSpecification()

      override fun overrides(): Any? = unwrap(this).getOverrides()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          FleetLaunchTemplateConfigRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnEC2Fleet.FleetLaunchTemplateConfigRequestProperty):
          FleetLaunchTemplateConfigRequestProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FleetLaunchTemplateConfigRequestProperty):
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.FleetLaunchTemplateConfigRequestProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface MemoryGiBPerVCpuRequestProperty {
    public fun max(): Number? = unwrap(this).getMax()

    public fun min(): Number? = unwrap(this).getMin()

    public interface Builder {
      public fun max(max: Number)

      public fun min(min: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.MemoryGiBPerVCpuRequestProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.MemoryGiBPerVCpuRequestProperty.builder()

      override fun max(max: Number) {
        cdkBuilder.max(max)
      }

      override fun min(min: Number) {
        cdkBuilder.min(min)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.MemoryGiBPerVCpuRequestProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.MemoryGiBPerVCpuRequestProperty,
    ) : MemoryGiBPerVCpuRequestProperty {
      override fun max(): Number? = unwrap(this).getMax()

      override fun min(): Number? = unwrap(this).getMin()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MemoryGiBPerVCpuRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnEC2Fleet.MemoryGiBPerVCpuRequestProperty):
          MemoryGiBPerVCpuRequestProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MemoryGiBPerVCpuRequestProperty):
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.MemoryGiBPerVCpuRequestProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface TotalLocalStorageGBRequestProperty {
    public fun max(): Number? = unwrap(this).getMax()

    public fun min(): Number? = unwrap(this).getMin()

    public interface Builder {
      public fun max(max: Number)

      public fun min(min: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.TotalLocalStorageGBRequestProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.TotalLocalStorageGBRequestProperty.builder()

      override fun max(max: Number) {
        cdkBuilder.max(max)
      }

      override fun min(min: Number) {
        cdkBuilder.min(min)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.TotalLocalStorageGBRequestProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.TotalLocalStorageGBRequestProperty,
    ) : TotalLocalStorageGBRequestProperty {
      override fun max(): Number? = unwrap(this).getMax()

      override fun min(): Number? = unwrap(this).getMin()
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
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnEC2Fleet.TotalLocalStorageGBRequestProperty):
          TotalLocalStorageGBRequestProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TotalLocalStorageGBRequestProperty):
          software.amazon.awscdk.services.ec2.CfnEC2Fleet.TotalLocalStorageGBRequestProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
