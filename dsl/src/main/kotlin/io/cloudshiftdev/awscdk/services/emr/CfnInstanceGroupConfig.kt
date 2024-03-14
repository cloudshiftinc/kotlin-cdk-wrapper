package io.cloudshiftdev.awscdk.services.emr

import io.cloudshiftdev.awscdk.CfnResource
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
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnInstanceGroupConfig internal constructor(
  private val cdkObject: software.amazon.awscdk.services.emr.CfnInstanceGroupConfig,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun autoScalingPolicy(): Any? = unwrap(this).getAutoScalingPolicy()

  public open fun autoScalingPolicy(`value`: IResolvable) {
    unwrap(this).setAutoScalingPolicy(`value`.let(IResolvable::unwrap))
  }

  public open fun autoScalingPolicy(`value`: AutoScalingPolicyProperty) {
    unwrap(this).setAutoScalingPolicy(`value`.let(AutoScalingPolicyProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d3b20186e04388a4cc0fc1d79c58701e008033b44a48b712553e6c0d4661999c")
  public open fun autoScalingPolicy(`value`: AutoScalingPolicyProperty.Builder.() -> Unit): Unit =
      autoScalingPolicy(AutoScalingPolicyProperty(`value`))

  public open fun bidPrice(): String? = unwrap(this).getBidPrice()

  public open fun bidPrice(`value`: String) {
    unwrap(this).setBidPrice(`value`)
  }

  public open fun configurations(): Any? = unwrap(this).getConfigurations()

  public open fun configurations(`value`: IResolvable) {
    unwrap(this).setConfigurations(`value`.let(IResolvable::unwrap))
  }

  public open fun configurations(__idx_ac66f0: List<Any>) {
    unwrap(this).setConfigurations(__idx_ac66f0)
  }

  public open fun customAmiId(): String? = unwrap(this).getCustomAmiId()

  public open fun customAmiId(`value`: String) {
    unwrap(this).setCustomAmiId(`value`)
  }

  public open fun ebsConfiguration(): Any? = unwrap(this).getEbsConfiguration()

  public open fun ebsConfiguration(`value`: IResolvable) {
    unwrap(this).setEbsConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun ebsConfiguration(`value`: EbsConfigurationProperty) {
    unwrap(this).setEbsConfiguration(`value`.let(EbsConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e1fd9233911cbdd87f366aed768a80386f049d0dad92a434b624452198e8d8ab")
  public open fun ebsConfiguration(`value`: EbsConfigurationProperty.Builder.() -> Unit): Unit =
      ebsConfiguration(EbsConfigurationProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun instanceCount(): Number = unwrap(this).getInstanceCount()

  public open fun instanceCount(`value`: Number) {
    unwrap(this).setInstanceCount(`value`)
  }

  public open fun instanceRole(): String = unwrap(this).getInstanceRole()

  public open fun instanceRole(`value`: String) {
    unwrap(this).setInstanceRole(`value`)
  }

  public open fun instanceType(): String = unwrap(this).getInstanceType()

  public open fun instanceType(`value`: String) {
    unwrap(this).setInstanceType(`value`)
  }

  public open fun jobFlowId(): String = unwrap(this).getJobFlowId()

  public open fun jobFlowId(`value`: String) {
    unwrap(this).setJobFlowId(`value`)
  }

  public open fun market(): String? = unwrap(this).getMarket()

  public open fun market(`value`: String) {
    unwrap(this).setMarket(`value`)
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public interface Builder {
    public fun autoScalingPolicy(autoScalingPolicy: IResolvable) {
    }

    public fun autoScalingPolicy(autoScalingPolicy: AutoScalingPolicyProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bd88ae6c4f06f17baab5b23770cd6888d70dabae31bd89baad6c5babd94ffa21")
    public fun autoScalingPolicy(autoScalingPolicy: AutoScalingPolicyProperty.Builder.() -> Unit) {
    }

    public fun bidPrice(bidPrice: String) {
    }

    public fun configurations(configurations: IResolvable) {
    }

    public fun configurations(configurations: List<Any>) {
    }

    public fun customAmiId(customAmiId: String) {
    }

    public fun ebsConfiguration(ebsConfiguration: IResolvable) {
    }

    public fun ebsConfiguration(ebsConfiguration: EbsConfigurationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("10da914fab90d1dd604ab7d79e6cf336e54f95c0ebfdc9e325f2bf8429e83cb0")
    public fun ebsConfiguration(ebsConfiguration: EbsConfigurationProperty.Builder.() -> Unit) {
    }

    public fun instanceCount(instanceCount: Number) {
    }

    public fun instanceRole(instanceRole: String) {
    }

    public fun instanceType(instanceType: String) {
    }

    public fun jobFlowId(jobFlowId: String) {
    }

    public fun market(market: String) {
    }

    public fun name(name: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.Builder =
        software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.Builder.create(scope, id)

    public override fun autoScalingPolicy(autoScalingPolicy: IResolvable) {
      cdkBuilder.autoScalingPolicy(autoScalingPolicy.let(IResolvable::unwrap))
    }

    public override fun autoScalingPolicy(autoScalingPolicy: AutoScalingPolicyProperty) {
      cdkBuilder.autoScalingPolicy(autoScalingPolicy.let(AutoScalingPolicyProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bd88ae6c4f06f17baab5b23770cd6888d70dabae31bd89baad6c5babd94ffa21")
    public override
        fun autoScalingPolicy(autoScalingPolicy: AutoScalingPolicyProperty.Builder.() -> Unit): Unit
        = autoScalingPolicy(AutoScalingPolicyProperty(autoScalingPolicy))

    public override fun bidPrice(bidPrice: String) {
      cdkBuilder.bidPrice(bidPrice)
    }

    public override fun configurations(configurations: IResolvable) {
      cdkBuilder.configurations(configurations.let(IResolvable::unwrap))
    }

    public override fun configurations(configurations: List<Any>) {
      cdkBuilder.configurations(configurations)
    }

    public override fun customAmiId(customAmiId: String) {
      cdkBuilder.customAmiId(customAmiId)
    }

    public override fun ebsConfiguration(ebsConfiguration: IResolvable) {
      cdkBuilder.ebsConfiguration(ebsConfiguration.let(IResolvable::unwrap))
    }

    public override fun ebsConfiguration(ebsConfiguration: EbsConfigurationProperty) {
      cdkBuilder.ebsConfiguration(ebsConfiguration.let(EbsConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("10da914fab90d1dd604ab7d79e6cf336e54f95c0ebfdc9e325f2bf8429e83cb0")
    public override
        fun ebsConfiguration(ebsConfiguration: EbsConfigurationProperty.Builder.() -> Unit): Unit =
        ebsConfiguration(EbsConfigurationProperty(ebsConfiguration))

    public override fun instanceCount(instanceCount: Number) {
      cdkBuilder.instanceCount(instanceCount)
    }

    public override fun instanceRole(instanceRole: String) {
      cdkBuilder.instanceRole(instanceRole)
    }

    public override fun instanceType(instanceType: String) {
      cdkBuilder.instanceType(instanceType)
    }

    public override fun jobFlowId(jobFlowId: String) {
      cdkBuilder.jobFlowId(jobFlowId)
    }

    public override fun market(market: String) {
      cdkBuilder.market(market)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.emr.CfnInstanceGroupConfig =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnInstanceGroupConfig {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnInstanceGroupConfig(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnInstanceGroupConfig):
        CfnInstanceGroupConfig = CfnInstanceGroupConfig(cdkObject)

    internal fun unwrap(wrapped: CfnInstanceGroupConfig):
        software.amazon.awscdk.services.emr.CfnInstanceGroupConfig = wrapped.cdkObject
  }

  public interface SimpleScalingPolicyConfigurationProperty {
    public fun adjustmentType(): String? = unwrap(this).getAdjustmentType()

    public fun coolDown(): Number? = unwrap(this).getCoolDown()

    public fun scalingAdjustment(): Number

    public interface Builder {
      public fun adjustmentType(adjustmentType: String) {
      }

      public fun coolDown(coolDown: Number) {
      }

      public fun scalingAdjustment(scalingAdjustment: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.SimpleScalingPolicyConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.SimpleScalingPolicyConfigurationProperty.builder()

      public override fun adjustmentType(adjustmentType: String) {
        cdkBuilder.adjustmentType(adjustmentType)
      }

      public override fun coolDown(coolDown: Number) {
        cdkBuilder.coolDown(coolDown)
      }

      public override fun scalingAdjustment(scalingAdjustment: Number) {
        cdkBuilder.scalingAdjustment(scalingAdjustment)
      }

      public fun build():
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.SimpleScalingPolicyConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.SimpleScalingPolicyConfigurationProperty,
    ) : SimpleScalingPolicyConfigurationProperty {
      public override fun adjustmentType(): String? = unwrap(this).getAdjustmentType()

      public override fun coolDown(): Number? = unwrap(this).getCoolDown()

      public override fun scalingAdjustment(): Number = unwrap(this).getScalingAdjustment()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          SimpleScalingPolicyConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.SimpleScalingPolicyConfigurationProperty):
          SimpleScalingPolicyConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SimpleScalingPolicyConfigurationProperty):
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.SimpleScalingPolicyConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ScalingConstraintsProperty {
    public fun maxCapacity(): Number

    public fun minCapacity(): Number

    public interface Builder {
      public fun maxCapacity(maxCapacity: Number) {
      }

      public fun minCapacity(minCapacity: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingConstraintsProperty.Builder
          =
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingConstraintsProperty.builder()

      public override fun maxCapacity(maxCapacity: Number) {
        cdkBuilder.maxCapacity(maxCapacity)
      }

      public override fun minCapacity(minCapacity: Number) {
        cdkBuilder.minCapacity(minCapacity)
      }

      public fun build():
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingConstraintsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingConstraintsProperty,
    ) : ScalingConstraintsProperty {
      public override fun maxCapacity(): Number = unwrap(this).getMaxCapacity()

      public override fun minCapacity(): Number = unwrap(this).getMinCapacity()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ScalingConstraintsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingConstraintsProperty):
          ScalingConstraintsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScalingConstraintsProperty):
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingConstraintsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface EbsBlockDeviceConfigProperty {
    public fun volumeSpecification(): Any

    public fun volumesPerInstance(): Number? = unwrap(this).getVolumesPerInstance()

    public interface Builder {
      public fun volumeSpecification(volumeSpecification: IResolvable) {
      }

      public fun volumeSpecification(volumeSpecification: VolumeSpecificationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8399936429f874eedde1fb8ebf36c6005862947edb9047af93bba4e2933689f6")
      public
          fun volumeSpecification(volumeSpecification: VolumeSpecificationProperty.Builder.() -> Unit) {
      }

      public fun volumesPerInstance(volumesPerInstance: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.EbsBlockDeviceConfigProperty.Builder
          =
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.EbsBlockDeviceConfigProperty.builder()

      public override fun volumeSpecification(volumeSpecification: IResolvable) {
        cdkBuilder.volumeSpecification(volumeSpecification.let(IResolvable::unwrap))
      }

      public override fun volumeSpecification(volumeSpecification: VolumeSpecificationProperty) {
        cdkBuilder.volumeSpecification(volumeSpecification.let(VolumeSpecificationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8399936429f874eedde1fb8ebf36c6005862947edb9047af93bba4e2933689f6")
      public override
          fun volumeSpecification(volumeSpecification: VolumeSpecificationProperty.Builder.() -> Unit):
          Unit = volumeSpecification(VolumeSpecificationProperty(volumeSpecification))

      public override fun volumesPerInstance(volumesPerInstance: Number) {
        cdkBuilder.volumesPerInstance(volumesPerInstance)
      }

      public fun build():
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.EbsBlockDeviceConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.EbsBlockDeviceConfigProperty,
    ) : EbsBlockDeviceConfigProperty {
      public override fun volumeSpecification(): Any = unwrap(this).getVolumeSpecification()

      public override fun volumesPerInstance(): Number? = unwrap(this).getVolumesPerInstance()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EbsBlockDeviceConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.EbsBlockDeviceConfigProperty):
          EbsBlockDeviceConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EbsBlockDeviceConfigProperty):
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.EbsBlockDeviceConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ScalingTriggerProperty {
    public fun cloudWatchAlarmDefinition(): Any

    public interface Builder {
      public fun cloudWatchAlarmDefinition(cloudWatchAlarmDefinition: IResolvable) {
      }

      public
          fun cloudWatchAlarmDefinition(cloudWatchAlarmDefinition: CloudWatchAlarmDefinitionProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("92cd633a19dd947577f74d812aa0c1d86eb6eeff63302bf3443be123681c8c74")
      public
          fun cloudWatchAlarmDefinition(cloudWatchAlarmDefinition: CloudWatchAlarmDefinitionProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingTriggerProperty.Builder
          =
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingTriggerProperty.builder()

      public override fun cloudWatchAlarmDefinition(cloudWatchAlarmDefinition: IResolvable) {
        cdkBuilder.cloudWatchAlarmDefinition(cloudWatchAlarmDefinition.let(IResolvable::unwrap))
      }

      public override
          fun cloudWatchAlarmDefinition(cloudWatchAlarmDefinition: CloudWatchAlarmDefinitionProperty) {
        cdkBuilder.cloudWatchAlarmDefinition(cloudWatchAlarmDefinition.let(CloudWatchAlarmDefinitionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("92cd633a19dd947577f74d812aa0c1d86eb6eeff63302bf3443be123681c8c74")
      public override
          fun cloudWatchAlarmDefinition(cloudWatchAlarmDefinition: CloudWatchAlarmDefinitionProperty.Builder.() -> Unit):
          Unit =
          cloudWatchAlarmDefinition(CloudWatchAlarmDefinitionProperty(cloudWatchAlarmDefinition))

      public fun build():
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingTriggerProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingTriggerProperty,
    ) : ScalingTriggerProperty {
      public override fun cloudWatchAlarmDefinition(): Any =
          unwrap(this).getCloudWatchAlarmDefinition()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ScalingTriggerProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingTriggerProperty):
          ScalingTriggerProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScalingTriggerProperty):
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingTriggerProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ScalingRuleProperty {
    public fun action(): Any

    public fun description(): String? = unwrap(this).getDescription()

    public fun name(): String

    public fun trigger(): Any

    public interface Builder {
      public fun action(action: IResolvable) {
      }

      public fun action(action: ScalingActionProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5be4adc4ad3b93edcb0dade3bf50215d364d7cebb6acaf9cb97a0ca0925400b5")
      public fun action(action: ScalingActionProperty.Builder.() -> Unit) {
      }

      public fun description(description: String) {
      }

      public fun name(name: String) {
      }

      public fun trigger(trigger: IResolvable) {
      }

      public fun trigger(trigger: ScalingTriggerProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e4d96ac0cbfebcef3807e3b8d913b449a32564081bed6cf769acd7a5902dc643")
      public fun trigger(trigger: ScalingTriggerProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingRuleProperty.Builder =
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingRuleProperty.builder()

      public override fun action(action: IResolvable) {
        cdkBuilder.action(action.let(IResolvable::unwrap))
      }

      public override fun action(action: ScalingActionProperty) {
        cdkBuilder.action(action.let(ScalingActionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5be4adc4ad3b93edcb0dade3bf50215d364d7cebb6acaf9cb97a0ca0925400b5")
      public override fun action(action: ScalingActionProperty.Builder.() -> Unit): Unit =
          action(ScalingActionProperty(action))

      public override fun description(description: String) {
        cdkBuilder.description(description)
      }

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override fun trigger(trigger: IResolvable) {
        cdkBuilder.trigger(trigger.let(IResolvable::unwrap))
      }

      public override fun trigger(trigger: ScalingTriggerProperty) {
        cdkBuilder.trigger(trigger.let(ScalingTriggerProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e4d96ac0cbfebcef3807e3b8d913b449a32564081bed6cf769acd7a5902dc643")
      public override fun trigger(trigger: ScalingTriggerProperty.Builder.() -> Unit): Unit =
          trigger(ScalingTriggerProperty(trigger))

      public fun build():
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingRuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingRuleProperty,
    ) : ScalingRuleProperty {
      public override fun action(): Any = unwrap(this).getAction()

      public override fun description(): String? = unwrap(this).getDescription()

      public override fun name(): String = unwrap(this).getName()

      public override fun trigger(): Any = unwrap(this).getTrigger()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ScalingRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingRuleProperty):
          ScalingRuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScalingRuleProperty):
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingRuleProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface VolumeSpecificationProperty {
    public fun iops(): Number? = unwrap(this).getIops()

    public fun sizeInGb(): Number

    public fun throughput(): Number? = unwrap(this).getThroughput()

    public fun volumeType(): String

    public interface Builder {
      public fun iops(iops: Number) {
      }

      public fun sizeInGb(sizeInGb: Number) {
      }

      public fun throughput(throughput: Number) {
      }

      public fun volumeType(volumeType: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.VolumeSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.VolumeSpecificationProperty.builder()

      public override fun iops(iops: Number) {
        cdkBuilder.iops(iops)
      }

      public override fun sizeInGb(sizeInGb: Number) {
        cdkBuilder.sizeInGb(sizeInGb)
      }

      public override fun throughput(throughput: Number) {
        cdkBuilder.throughput(throughput)
      }

      public override fun volumeType(volumeType: String) {
        cdkBuilder.volumeType(volumeType)
      }

      public fun build():
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.VolumeSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.VolumeSpecificationProperty,
    ) : VolumeSpecificationProperty {
      public override fun iops(): Number? = unwrap(this).getIops()

      public override fun sizeInGb(): Number = unwrap(this).getSizeInGb()

      public override fun throughput(): Number? = unwrap(this).getThroughput()

      public override fun volumeType(): String = unwrap(this).getVolumeType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): VolumeSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.VolumeSpecificationProperty):
          VolumeSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VolumeSpecificationProperty):
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.VolumeSpecificationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface MetricDimensionProperty {
    public fun key(): String

    public fun `value`(): String

    public interface Builder {
      public fun key(key: String) {
      }

      public fun `value`(`value`: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.MetricDimensionProperty.Builder
          =
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.MetricDimensionProperty.builder()

      public override fun key(key: String) {
        cdkBuilder.key(key)
      }

      public override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.MetricDimensionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.MetricDimensionProperty,
    ) : MetricDimensionProperty {
      public override fun key(): String = unwrap(this).getKey()

      public override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MetricDimensionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.MetricDimensionProperty):
          MetricDimensionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetricDimensionProperty):
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.MetricDimensionProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface AutoScalingPolicyProperty {
    public fun constraints(): Any

    public fun rules(): Any

    public interface Builder {
      public fun constraints(constraints: IResolvable) {
      }

      public fun constraints(constraints: ScalingConstraintsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("01406679afd1c42bc4036bdc27379e34d686b0628cb2ae42b0b0ae00bd22e65d")
      public fun constraints(constraints: ScalingConstraintsProperty.Builder.() -> Unit) {
      }

      public fun rules(rules: IResolvable) {
      }

      public fun rules(rules: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.AutoScalingPolicyProperty.Builder
          =
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.AutoScalingPolicyProperty.builder()

      public override fun constraints(constraints: IResolvable) {
        cdkBuilder.constraints(constraints.let(IResolvable::unwrap))
      }

      public override fun constraints(constraints: ScalingConstraintsProperty) {
        cdkBuilder.constraints(constraints.let(ScalingConstraintsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("01406679afd1c42bc4036bdc27379e34d686b0628cb2ae42b0b0ae00bd22e65d")
      public override fun constraints(constraints: ScalingConstraintsProperty.Builder.() -> Unit):
          Unit = constraints(ScalingConstraintsProperty(constraints))

      public override fun rules(rules: IResolvable) {
        cdkBuilder.rules(rules.let(IResolvable::unwrap))
      }

      public override fun rules(rules: List<Any>) {
        cdkBuilder.rules(rules)
      }

      public fun build():
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.AutoScalingPolicyProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.AutoScalingPolicyProperty,
    ) : AutoScalingPolicyProperty {
      public override fun constraints(): Any = unwrap(this).getConstraints()

      public override fun rules(): Any = unwrap(this).getRules()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AutoScalingPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.AutoScalingPolicyProperty):
          AutoScalingPolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AutoScalingPolicyProperty):
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.AutoScalingPolicyProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ConfigurationProperty {
    public fun classification(): String? = unwrap(this).getClassification()

    public fun configurationProperties(): Any? = unwrap(this).getConfigurationProperties()

    public fun configurations(): Any? = unwrap(this).getConfigurations()

    public interface Builder {
      public fun classification(classification: String) {
      }

      public fun configurationProperties(configurationProperties: IResolvable) {
      }

      public fun configurationProperties(configurationProperties: Map<String, String>) {
      }

      public fun configurations(configurations: IResolvable) {
      }

      public fun configurations(configurations: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ConfigurationProperty.Builder =
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ConfigurationProperty.builder()

      public override fun classification(classification: String) {
        cdkBuilder.classification(classification)
      }

      public override fun configurationProperties(configurationProperties: IResolvable) {
        cdkBuilder.configurationProperties(configurationProperties.let(IResolvable::unwrap))
      }

      public override fun configurationProperties(configurationProperties: Map<String, String>) {
        cdkBuilder.configurationProperties(configurationProperties)
      }

      public override fun configurations(configurations: IResolvable) {
        cdkBuilder.configurations(configurations.let(IResolvable::unwrap))
      }

      public override fun configurations(configurations: List<Any>) {
        cdkBuilder.configurations(configurations)
      }

      public fun build():
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ConfigurationProperty,
    ) : ConfigurationProperty {
      public override fun classification(): String? = unwrap(this).getClassification()

      public override fun configurationProperties(): Any? =
          unwrap(this).getConfigurationProperties()

      public override fun configurations(): Any? = unwrap(this).getConfigurations()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ConfigurationProperty):
          ConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConfigurationProperty):
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface CloudWatchAlarmDefinitionProperty {
    public fun comparisonOperator(): String

    public fun dimensions(): Any? = unwrap(this).getDimensions()

    public fun evaluationPeriods(): Number? = unwrap(this).getEvaluationPeriods()

    public fun metricName(): String

    public fun namespace(): String? = unwrap(this).getNamespace()

    public fun period(): Number

    public fun statistic(): String? = unwrap(this).getStatistic()

    public fun threshold(): Number

    public fun unit(): String? = unwrap(this).getUnit()

    public interface Builder {
      public fun comparisonOperator(comparisonOperator: String) {
      }

      public fun dimensions(dimensions: IResolvable) {
      }

      public fun dimensions(dimensions: List<Any>) {
      }

      public fun evaluationPeriods(evaluationPeriods: Number) {
      }

      public fun metricName(metricName: String) {
      }

      public fun namespace(namespace: String) {
      }

      public fun period(period: Number) {
      }

      public fun statistic(statistic: String) {
      }

      public fun threshold(threshold: Number) {
      }

      public fun unit(unit: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.CloudWatchAlarmDefinitionProperty.Builder
          =
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.CloudWatchAlarmDefinitionProperty.builder()

      public override fun comparisonOperator(comparisonOperator: String) {
        cdkBuilder.comparisonOperator(comparisonOperator)
      }

      public override fun dimensions(dimensions: IResolvable) {
        cdkBuilder.dimensions(dimensions.let(IResolvable::unwrap))
      }

      public override fun dimensions(dimensions: List<Any>) {
        cdkBuilder.dimensions(dimensions)
      }

      public override fun evaluationPeriods(evaluationPeriods: Number) {
        cdkBuilder.evaluationPeriods(evaluationPeriods)
      }

      public override fun metricName(metricName: String) {
        cdkBuilder.metricName(metricName)
      }

      public override fun namespace(namespace: String) {
        cdkBuilder.namespace(namespace)
      }

      public override fun period(period: Number) {
        cdkBuilder.period(period)
      }

      public override fun statistic(statistic: String) {
        cdkBuilder.statistic(statistic)
      }

      public override fun threshold(threshold: Number) {
        cdkBuilder.threshold(threshold)
      }

      public override fun unit(unit: String) {
        cdkBuilder.unit(unit)
      }

      public fun build():
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.CloudWatchAlarmDefinitionProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.CloudWatchAlarmDefinitionProperty,
    ) : CloudWatchAlarmDefinitionProperty {
      public override fun comparisonOperator(): String = unwrap(this).getComparisonOperator()

      public override fun dimensions(): Any? = unwrap(this).getDimensions()

      public override fun evaluationPeriods(): Number? = unwrap(this).getEvaluationPeriods()

      public override fun metricName(): String = unwrap(this).getMetricName()

      public override fun namespace(): String? = unwrap(this).getNamespace()

      public override fun period(): Number = unwrap(this).getPeriod()

      public override fun statistic(): String? = unwrap(this).getStatistic()

      public override fun threshold(): Number = unwrap(this).getThreshold()

      public override fun unit(): String? = unwrap(this).getUnit()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          CloudWatchAlarmDefinitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.CloudWatchAlarmDefinitionProperty):
          CloudWatchAlarmDefinitionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CloudWatchAlarmDefinitionProperty):
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.CloudWatchAlarmDefinitionProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ScalingActionProperty {
    public fun market(): String? = unwrap(this).getMarket()

    public fun simpleScalingPolicyConfiguration(): Any

    public interface Builder {
      public fun market(market: String) {
      }

      public fun simpleScalingPolicyConfiguration(simpleScalingPolicyConfiguration: IResolvable) {
      }

      public
          fun simpleScalingPolicyConfiguration(simpleScalingPolicyConfiguration: SimpleScalingPolicyConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1b4e742cbe99e2be6df8555644d40367564190d0d7e0bbad9cb163fa5a0c378c")
      public
          fun simpleScalingPolicyConfiguration(simpleScalingPolicyConfiguration: SimpleScalingPolicyConfigurationProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingActionProperty.Builder =
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingActionProperty.builder()

      public override fun market(market: String) {
        cdkBuilder.market(market)
      }

      public override
          fun simpleScalingPolicyConfiguration(simpleScalingPolicyConfiguration: IResolvable) {
        cdkBuilder.simpleScalingPolicyConfiguration(simpleScalingPolicyConfiguration.let(IResolvable::unwrap))
      }

      public override
          fun simpleScalingPolicyConfiguration(simpleScalingPolicyConfiguration: SimpleScalingPolicyConfigurationProperty) {
        cdkBuilder.simpleScalingPolicyConfiguration(simpleScalingPolicyConfiguration.let(SimpleScalingPolicyConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1b4e742cbe99e2be6df8555644d40367564190d0d7e0bbad9cb163fa5a0c378c")
      public override
          fun simpleScalingPolicyConfiguration(simpleScalingPolicyConfiguration: SimpleScalingPolicyConfigurationProperty.Builder.() -> Unit):
          Unit =
          simpleScalingPolicyConfiguration(SimpleScalingPolicyConfigurationProperty(simpleScalingPolicyConfiguration))

      public fun build():
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingActionProperty,
    ) : ScalingActionProperty {
      public override fun market(): String? = unwrap(this).getMarket()

      public override fun simpleScalingPolicyConfiguration(): Any =
          unwrap(this).getSimpleScalingPolicyConfiguration()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ScalingActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingActionProperty):
          ScalingActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScalingActionProperty):
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingActionProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface EbsConfigurationProperty {
    public fun ebsBlockDeviceConfigs(): Any? = unwrap(this).getEbsBlockDeviceConfigs()

    public fun ebsOptimized(): Any? = unwrap(this).getEbsOptimized()

    public interface Builder {
      public fun ebsBlockDeviceConfigs(ebsBlockDeviceConfigs: IResolvable) {
      }

      public fun ebsBlockDeviceConfigs(ebsBlockDeviceConfigs: List<Any>) {
      }

      public fun ebsOptimized(ebsOptimized: Boolean) {
      }

      public fun ebsOptimized(ebsOptimized: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.EbsConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.EbsConfigurationProperty.builder()

      public override fun ebsBlockDeviceConfigs(ebsBlockDeviceConfigs: IResolvable) {
        cdkBuilder.ebsBlockDeviceConfigs(ebsBlockDeviceConfigs.let(IResolvable::unwrap))
      }

      public override fun ebsBlockDeviceConfigs(ebsBlockDeviceConfigs: List<Any>) {
        cdkBuilder.ebsBlockDeviceConfigs(ebsBlockDeviceConfigs)
      }

      public override fun ebsOptimized(ebsOptimized: Boolean) {
        cdkBuilder.ebsOptimized(ebsOptimized)
      }

      public override fun ebsOptimized(ebsOptimized: IResolvable) {
        cdkBuilder.ebsOptimized(ebsOptimized.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.EbsConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.EbsConfigurationProperty,
    ) : EbsConfigurationProperty {
      public override fun ebsBlockDeviceConfigs(): Any? = unwrap(this).getEbsBlockDeviceConfigs()

      public override fun ebsOptimized(): Any? = unwrap(this).getEbsOptimized()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EbsConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.EbsConfigurationProperty):
          EbsConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EbsConfigurationProperty):
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.EbsConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
