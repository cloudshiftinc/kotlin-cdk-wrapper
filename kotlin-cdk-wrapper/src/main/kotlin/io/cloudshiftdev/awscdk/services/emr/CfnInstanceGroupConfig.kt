@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.emr

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnInstanceGroupConfig internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.emr.CfnInstanceGroupConfig,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun autoScalingPolicy(): Any? = unwrap(this).getAutoScalingPolicy()

  public open fun autoScalingPolicy(`value`: IResolvable) {
    unwrap(this).setAutoScalingPolicy(`value`.let(IResolvable::unwrap))
  }

  public open fun autoScalingPolicy(`value`: AutoScalingPolicyProperty) {
    unwrap(this).setAutoScalingPolicy(`value`.let(AutoScalingPolicyProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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

  public open fun configurations(vararg __idx_ac66f0: Any): Unit =
      configurations(__idx_ac66f0.toList())

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

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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

  @CdkDslMarker
  public interface Builder {
    public fun autoScalingPolicy(autoScalingPolicy: IResolvable)

    public fun autoScalingPolicy(autoScalingPolicy: AutoScalingPolicyProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bd88ae6c4f06f17baab5b23770cd6888d70dabae31bd89baad6c5babd94ffa21")
    public fun autoScalingPolicy(autoScalingPolicy: AutoScalingPolicyProperty.Builder.() -> Unit)

    public fun bidPrice(bidPrice: String)

    public fun configurations(configurations: IResolvable)

    public fun configurations(configurations: List<Any>)

    public fun configurations(vararg configurations: Any)

    public fun customAmiId(customAmiId: String)

    public fun ebsConfiguration(ebsConfiguration: IResolvable)

    public fun ebsConfiguration(ebsConfiguration: EbsConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("10da914fab90d1dd604ab7d79e6cf336e54f95c0ebfdc9e325f2bf8429e83cb0")
    public fun ebsConfiguration(ebsConfiguration: EbsConfigurationProperty.Builder.() -> Unit)

    public fun instanceCount(instanceCount: Number)

    public fun instanceRole(instanceRole: String)

    public fun instanceType(instanceType: String)

    public fun jobFlowId(jobFlowId: String)

    public fun market(market: String)

    public fun name(name: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.Builder =
        software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.Builder.create(scope, id)

    override fun autoScalingPolicy(autoScalingPolicy: IResolvable) {
      cdkBuilder.autoScalingPolicy(autoScalingPolicy.let(IResolvable::unwrap))
    }

    override fun autoScalingPolicy(autoScalingPolicy: AutoScalingPolicyProperty) {
      cdkBuilder.autoScalingPolicy(autoScalingPolicy.let(AutoScalingPolicyProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bd88ae6c4f06f17baab5b23770cd6888d70dabae31bd89baad6c5babd94ffa21")
    override fun autoScalingPolicy(autoScalingPolicy: AutoScalingPolicyProperty.Builder.() -> Unit):
        Unit = autoScalingPolicy(AutoScalingPolicyProperty(autoScalingPolicy))

    override fun bidPrice(bidPrice: String) {
      cdkBuilder.bidPrice(bidPrice)
    }

    override fun configurations(configurations: IResolvable) {
      cdkBuilder.configurations(configurations.let(IResolvable::unwrap))
    }

    override fun configurations(configurations: List<Any>) {
      cdkBuilder.configurations(configurations)
    }

    override fun configurations(vararg configurations: Any): Unit =
        configurations(configurations.toList())

    override fun customAmiId(customAmiId: String) {
      cdkBuilder.customAmiId(customAmiId)
    }

    override fun ebsConfiguration(ebsConfiguration: IResolvable) {
      cdkBuilder.ebsConfiguration(ebsConfiguration.let(IResolvable::unwrap))
    }

    override fun ebsConfiguration(ebsConfiguration: EbsConfigurationProperty) {
      cdkBuilder.ebsConfiguration(ebsConfiguration.let(EbsConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("10da914fab90d1dd604ab7d79e6cf336e54f95c0ebfdc9e325f2bf8429e83cb0")
    override fun ebsConfiguration(ebsConfiguration: EbsConfigurationProperty.Builder.() -> Unit):
        Unit = ebsConfiguration(EbsConfigurationProperty(ebsConfiguration))

    override fun instanceCount(instanceCount: Number) {
      cdkBuilder.instanceCount(instanceCount)
    }

    override fun instanceRole(instanceRole: String) {
      cdkBuilder.instanceRole(instanceRole)
    }

    override fun instanceType(instanceType: String) {
      cdkBuilder.instanceType(instanceType)
    }

    override fun jobFlowId(jobFlowId: String) {
      cdkBuilder.jobFlowId(jobFlowId)
    }

    override fun market(market: String) {
      cdkBuilder.market(market)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.emr.CfnInstanceGroupConfig =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.CFN_RESOURCE_TYPE_NAME

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

    @CdkDslMarker
    public interface Builder {
      public fun adjustmentType(adjustmentType: String)

      public fun coolDown(coolDown: Number)

      public fun scalingAdjustment(scalingAdjustment: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.SimpleScalingPolicyConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.SimpleScalingPolicyConfigurationProperty.builder()

      override fun adjustmentType(adjustmentType: String) {
        cdkBuilder.adjustmentType(adjustmentType)
      }

      override fun coolDown(coolDown: Number) {
        cdkBuilder.coolDown(coolDown)
      }

      override fun scalingAdjustment(scalingAdjustment: Number) {
        cdkBuilder.scalingAdjustment(scalingAdjustment)
      }

      public fun build():
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.SimpleScalingPolicyConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.SimpleScalingPolicyConfigurationProperty,
    ) : CdkObject(cdkObject), SimpleScalingPolicyConfigurationProperty {
      override fun adjustmentType(): String? = unwrap(this).getAdjustmentType()

      override fun coolDown(): Number? = unwrap(this).getCoolDown()

      override fun scalingAdjustment(): Number = unwrap(this).getScalingAdjustment()
    }

    public companion object {
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
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.SimpleScalingPolicyConfigurationProperty
    }
  }

  public interface ScalingConstraintsProperty {
    public fun maxCapacity(): Number

    public fun minCapacity(): Number

    @CdkDslMarker
    public interface Builder {
      public fun maxCapacity(maxCapacity: Number)

      public fun minCapacity(minCapacity: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingConstraintsProperty.Builder
          =
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingConstraintsProperty.builder()

      override fun maxCapacity(maxCapacity: Number) {
        cdkBuilder.maxCapacity(maxCapacity)
      }

      override fun minCapacity(minCapacity: Number) {
        cdkBuilder.minCapacity(minCapacity)
      }

      public fun build():
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingConstraintsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingConstraintsProperty,
    ) : CdkObject(cdkObject), ScalingConstraintsProperty {
      override fun maxCapacity(): Number = unwrap(this).getMaxCapacity()

      override fun minCapacity(): Number = unwrap(this).getMinCapacity()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ScalingConstraintsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingConstraintsProperty):
          ScalingConstraintsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScalingConstraintsProperty):
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingConstraintsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingConstraintsProperty
    }
  }

  public interface EbsBlockDeviceConfigProperty {
    public fun volumeSpecification(): Any

    public fun volumesPerInstance(): Number? = unwrap(this).getVolumesPerInstance()

    @CdkDslMarker
    public interface Builder {
      public fun volumeSpecification(volumeSpecification: IResolvable)

      public fun volumeSpecification(volumeSpecification: VolumeSpecificationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8399936429f874eedde1fb8ebf36c6005862947edb9047af93bba4e2933689f6")
      public
          fun volumeSpecification(volumeSpecification: VolumeSpecificationProperty.Builder.() -> Unit)

      public fun volumesPerInstance(volumesPerInstance: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.EbsBlockDeviceConfigProperty.Builder
          =
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.EbsBlockDeviceConfigProperty.builder()

      override fun volumeSpecification(volumeSpecification: IResolvable) {
        cdkBuilder.volumeSpecification(volumeSpecification.let(IResolvable::unwrap))
      }

      override fun volumeSpecification(volumeSpecification: VolumeSpecificationProperty) {
        cdkBuilder.volumeSpecification(volumeSpecification.let(VolumeSpecificationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8399936429f874eedde1fb8ebf36c6005862947edb9047af93bba4e2933689f6")
      override
          fun volumeSpecification(volumeSpecification: VolumeSpecificationProperty.Builder.() -> Unit):
          Unit = volumeSpecification(VolumeSpecificationProperty(volumeSpecification))

      override fun volumesPerInstance(volumesPerInstance: Number) {
        cdkBuilder.volumesPerInstance(volumesPerInstance)
      }

      public fun build():
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.EbsBlockDeviceConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.EbsBlockDeviceConfigProperty,
    ) : CdkObject(cdkObject), EbsBlockDeviceConfigProperty {
      override fun volumeSpecification(): Any = unwrap(this).getVolumeSpecification()

      override fun volumesPerInstance(): Number? = unwrap(this).getVolumesPerInstance()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EbsBlockDeviceConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.EbsBlockDeviceConfigProperty):
          EbsBlockDeviceConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EbsBlockDeviceConfigProperty):
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.EbsBlockDeviceConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.EbsBlockDeviceConfigProperty
    }
  }

  public interface ScalingTriggerProperty {
    public fun cloudWatchAlarmDefinition(): Any

    @CdkDslMarker
    public interface Builder {
      public fun cloudWatchAlarmDefinition(cloudWatchAlarmDefinition: IResolvable)

      public
          fun cloudWatchAlarmDefinition(cloudWatchAlarmDefinition: CloudWatchAlarmDefinitionProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("92cd633a19dd947577f74d812aa0c1d86eb6eeff63302bf3443be123681c8c74")
      public
          fun cloudWatchAlarmDefinition(cloudWatchAlarmDefinition: CloudWatchAlarmDefinitionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingTriggerProperty.Builder
          =
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingTriggerProperty.builder()

      override fun cloudWatchAlarmDefinition(cloudWatchAlarmDefinition: IResolvable) {
        cdkBuilder.cloudWatchAlarmDefinition(cloudWatchAlarmDefinition.let(IResolvable::unwrap))
      }

      override
          fun cloudWatchAlarmDefinition(cloudWatchAlarmDefinition: CloudWatchAlarmDefinitionProperty) {
        cdkBuilder.cloudWatchAlarmDefinition(cloudWatchAlarmDefinition.let(CloudWatchAlarmDefinitionProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("92cd633a19dd947577f74d812aa0c1d86eb6eeff63302bf3443be123681c8c74")
      override
          fun cloudWatchAlarmDefinition(cloudWatchAlarmDefinition: CloudWatchAlarmDefinitionProperty.Builder.() -> Unit):
          Unit =
          cloudWatchAlarmDefinition(CloudWatchAlarmDefinitionProperty(cloudWatchAlarmDefinition))

      public fun build():
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingTriggerProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingTriggerProperty,
    ) : CdkObject(cdkObject), ScalingTriggerProperty {
      override fun cloudWatchAlarmDefinition(): Any = unwrap(this).getCloudWatchAlarmDefinition()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ScalingTriggerProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingTriggerProperty):
          ScalingTriggerProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScalingTriggerProperty):
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingTriggerProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingTriggerProperty
    }
  }

  public interface ScalingRuleProperty {
    public fun action(): Any

    public fun description(): String? = unwrap(this).getDescription()

    public fun name(): String

    public fun trigger(): Any

    @CdkDslMarker
    public interface Builder {
      public fun action(action: IResolvable)

      public fun action(action: ScalingActionProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5be4adc4ad3b93edcb0dade3bf50215d364d7cebb6acaf9cb97a0ca0925400b5")
      public fun action(action: ScalingActionProperty.Builder.() -> Unit)

      public fun description(description: String)

      public fun name(name: String)

      public fun trigger(trigger: IResolvable)

      public fun trigger(trigger: ScalingTriggerProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e4d96ac0cbfebcef3807e3b8d913b449a32564081bed6cf769acd7a5902dc643")
      public fun trigger(trigger: ScalingTriggerProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingRuleProperty.Builder =
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingRuleProperty.builder()

      override fun action(action: IResolvable) {
        cdkBuilder.action(action.let(IResolvable::unwrap))
      }

      override fun action(action: ScalingActionProperty) {
        cdkBuilder.action(action.let(ScalingActionProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5be4adc4ad3b93edcb0dade3bf50215d364d7cebb6acaf9cb97a0ca0925400b5")
      override fun action(action: ScalingActionProperty.Builder.() -> Unit): Unit =
          action(ScalingActionProperty(action))

      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun trigger(trigger: IResolvable) {
        cdkBuilder.trigger(trigger.let(IResolvable::unwrap))
      }

      override fun trigger(trigger: ScalingTriggerProperty) {
        cdkBuilder.trigger(trigger.let(ScalingTriggerProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e4d96ac0cbfebcef3807e3b8d913b449a32564081bed6cf769acd7a5902dc643")
      override fun trigger(trigger: ScalingTriggerProperty.Builder.() -> Unit): Unit =
          trigger(ScalingTriggerProperty(trigger))

      public fun build():
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingRuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingRuleProperty,
    ) : CdkObject(cdkObject), ScalingRuleProperty {
      override fun action(): Any = unwrap(this).getAction()

      override fun description(): String? = unwrap(this).getDescription()

      override fun name(): String = unwrap(this).getName()

      override fun trigger(): Any = unwrap(this).getTrigger()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ScalingRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingRuleProperty):
          ScalingRuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScalingRuleProperty):
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingRuleProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingRuleProperty
    }
  }

  public interface VolumeSpecificationProperty {
    public fun iops(): Number? = unwrap(this).getIops()

    public fun sizeInGb(): Number

    public fun throughput(): Number? = unwrap(this).getThroughput()

    public fun volumeType(): String

    @CdkDslMarker
    public interface Builder {
      public fun iops(iops: Number)

      public fun sizeInGb(sizeInGb: Number)

      public fun throughput(throughput: Number)

      public fun volumeType(volumeType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.VolumeSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.VolumeSpecificationProperty.builder()

      override fun iops(iops: Number) {
        cdkBuilder.iops(iops)
      }

      override fun sizeInGb(sizeInGb: Number) {
        cdkBuilder.sizeInGb(sizeInGb)
      }

      override fun throughput(throughput: Number) {
        cdkBuilder.throughput(throughput)
      }

      override fun volumeType(volumeType: String) {
        cdkBuilder.volumeType(volumeType)
      }

      public fun build():
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.VolumeSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.VolumeSpecificationProperty,
    ) : CdkObject(cdkObject), VolumeSpecificationProperty {
      override fun iops(): Number? = unwrap(this).getIops()

      override fun sizeInGb(): Number = unwrap(this).getSizeInGb()

      override fun throughput(): Number? = unwrap(this).getThroughput()

      override fun volumeType(): String = unwrap(this).getVolumeType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VolumeSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.VolumeSpecificationProperty):
          VolumeSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VolumeSpecificationProperty):
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.VolumeSpecificationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.VolumeSpecificationProperty
    }
  }

  public interface MetricDimensionProperty {
    public fun key(): String

    public fun `value`(): String

    @CdkDslMarker
    public interface Builder {
      public fun key(key: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.MetricDimensionProperty.Builder
          =
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.MetricDimensionProperty.builder()

      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.MetricDimensionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.MetricDimensionProperty,
    ) : CdkObject(cdkObject), MetricDimensionProperty {
      override fun key(): String = unwrap(this).getKey()

      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MetricDimensionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.MetricDimensionProperty):
          MetricDimensionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetricDimensionProperty):
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.MetricDimensionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.MetricDimensionProperty
    }
  }

  public interface AutoScalingPolicyProperty {
    public fun constraints(): Any

    public fun rules(): Any

    @CdkDslMarker
    public interface Builder {
      public fun constraints(constraints: IResolvable)

      public fun constraints(constraints: ScalingConstraintsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("01406679afd1c42bc4036bdc27379e34d686b0628cb2ae42b0b0ae00bd22e65d")
      public fun constraints(constraints: ScalingConstraintsProperty.Builder.() -> Unit)

      public fun rules(rules: IResolvable)

      public fun rules(rules: List<Any>)

      public fun rules(vararg rules: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.AutoScalingPolicyProperty.Builder
          =
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.AutoScalingPolicyProperty.builder()

      override fun constraints(constraints: IResolvable) {
        cdkBuilder.constraints(constraints.let(IResolvable::unwrap))
      }

      override fun constraints(constraints: ScalingConstraintsProperty) {
        cdkBuilder.constraints(constraints.let(ScalingConstraintsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("01406679afd1c42bc4036bdc27379e34d686b0628cb2ae42b0b0ae00bd22e65d")
      override fun constraints(constraints: ScalingConstraintsProperty.Builder.() -> Unit): Unit =
          constraints(ScalingConstraintsProperty(constraints))

      override fun rules(rules: IResolvable) {
        cdkBuilder.rules(rules.let(IResolvable::unwrap))
      }

      override fun rules(rules: List<Any>) {
        cdkBuilder.rules(rules)
      }

      override fun rules(vararg rules: Any): Unit = rules(rules.toList())

      public fun build():
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.AutoScalingPolicyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.AutoScalingPolicyProperty,
    ) : CdkObject(cdkObject), AutoScalingPolicyProperty {
      override fun constraints(): Any = unwrap(this).getConstraints()

      override fun rules(): Any = unwrap(this).getRules()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AutoScalingPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.AutoScalingPolicyProperty):
          AutoScalingPolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AutoScalingPolicyProperty):
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.AutoScalingPolicyProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.AutoScalingPolicyProperty
    }
  }

  public interface ConfigurationProperty {
    public fun classification(): String? = unwrap(this).getClassification()

    public fun configurationProperties(): Any? = unwrap(this).getConfigurationProperties()

    public fun configurations(): Any? = unwrap(this).getConfigurations()

    @CdkDslMarker
    public interface Builder {
      public fun classification(classification: String)

      public fun configurationProperties(configurationProperties: IResolvable)

      public fun configurationProperties(configurationProperties: Map<String, String>)

      public fun configurations(configurations: IResolvable)

      public fun configurations(configurations: List<Any>)

      public fun configurations(vararg configurations: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ConfigurationProperty.Builder =
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ConfigurationProperty.builder()

      override fun classification(classification: String) {
        cdkBuilder.classification(classification)
      }

      override fun configurationProperties(configurationProperties: IResolvable) {
        cdkBuilder.configurationProperties(configurationProperties.let(IResolvable::unwrap))
      }

      override fun configurationProperties(configurationProperties: Map<String, String>) {
        cdkBuilder.configurationProperties(configurationProperties)
      }

      override fun configurations(configurations: IResolvable) {
        cdkBuilder.configurations(configurations.let(IResolvable::unwrap))
      }

      override fun configurations(configurations: List<Any>) {
        cdkBuilder.configurations(configurations)
      }

      override fun configurations(vararg configurations: Any): Unit =
          configurations(configurations.toList())

      public fun build():
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ConfigurationProperty,
    ) : CdkObject(cdkObject), ConfigurationProperty {
      override fun classification(): String? = unwrap(this).getClassification()

      override fun configurationProperties(): Any? = unwrap(this).getConfigurationProperties()

      override fun configurations(): Any? = unwrap(this).getConfigurations()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ConfigurationProperty):
          ConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConfigurationProperty):
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ConfigurationProperty
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

    @CdkDslMarker
    public interface Builder {
      public fun comparisonOperator(comparisonOperator: String)

      public fun dimensions(dimensions: IResolvable)

      public fun dimensions(dimensions: List<Any>)

      public fun dimensions(vararg dimensions: Any)

      public fun evaluationPeriods(evaluationPeriods: Number)

      public fun metricName(metricName: String)

      public fun namespace(namespace: String)

      public fun period(period: Number)

      public fun statistic(statistic: String)

      public fun threshold(threshold: Number)

      public fun unit(unit: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.CloudWatchAlarmDefinitionProperty.Builder
          =
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.CloudWatchAlarmDefinitionProperty.builder()

      override fun comparisonOperator(comparisonOperator: String) {
        cdkBuilder.comparisonOperator(comparisonOperator)
      }

      override fun dimensions(dimensions: IResolvable) {
        cdkBuilder.dimensions(dimensions.let(IResolvable::unwrap))
      }

      override fun dimensions(dimensions: List<Any>) {
        cdkBuilder.dimensions(dimensions)
      }

      override fun dimensions(vararg dimensions: Any): Unit = dimensions(dimensions.toList())

      override fun evaluationPeriods(evaluationPeriods: Number) {
        cdkBuilder.evaluationPeriods(evaluationPeriods)
      }

      override fun metricName(metricName: String) {
        cdkBuilder.metricName(metricName)
      }

      override fun namespace(namespace: String) {
        cdkBuilder.namespace(namespace)
      }

      override fun period(period: Number) {
        cdkBuilder.period(period)
      }

      override fun statistic(statistic: String) {
        cdkBuilder.statistic(statistic)
      }

      override fun threshold(threshold: Number) {
        cdkBuilder.threshold(threshold)
      }

      override fun unit(unit: String) {
        cdkBuilder.unit(unit)
      }

      public fun build():
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.CloudWatchAlarmDefinitionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.CloudWatchAlarmDefinitionProperty,
    ) : CdkObject(cdkObject), CloudWatchAlarmDefinitionProperty {
      override fun comparisonOperator(): String = unwrap(this).getComparisonOperator()

      override fun dimensions(): Any? = unwrap(this).getDimensions()

      override fun evaluationPeriods(): Number? = unwrap(this).getEvaluationPeriods()

      override fun metricName(): String = unwrap(this).getMetricName()

      override fun namespace(): String? = unwrap(this).getNamespace()

      override fun period(): Number = unwrap(this).getPeriod()

      override fun statistic(): String? = unwrap(this).getStatistic()

      override fun threshold(): Number = unwrap(this).getThreshold()

      override fun unit(): String? = unwrap(this).getUnit()
    }

    public companion object {
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
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.CloudWatchAlarmDefinitionProperty
    }
  }

  public interface ScalingActionProperty {
    public fun market(): String? = unwrap(this).getMarket()

    public fun simpleScalingPolicyConfiguration(): Any

    @CdkDslMarker
    public interface Builder {
      public fun market(market: String)

      public fun simpleScalingPolicyConfiguration(simpleScalingPolicyConfiguration: IResolvable)

      public
          fun simpleScalingPolicyConfiguration(simpleScalingPolicyConfiguration: SimpleScalingPolicyConfigurationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1b4e742cbe99e2be6df8555644d40367564190d0d7e0bbad9cb163fa5a0c378c")
      public
          fun simpleScalingPolicyConfiguration(simpleScalingPolicyConfiguration: SimpleScalingPolicyConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingActionProperty.Builder =
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingActionProperty.builder()

      override fun market(market: String) {
        cdkBuilder.market(market)
      }

      override fun simpleScalingPolicyConfiguration(simpleScalingPolicyConfiguration: IResolvable) {
        cdkBuilder.simpleScalingPolicyConfiguration(simpleScalingPolicyConfiguration.let(IResolvable::unwrap))
      }

      override
          fun simpleScalingPolicyConfiguration(simpleScalingPolicyConfiguration: SimpleScalingPolicyConfigurationProperty) {
        cdkBuilder.simpleScalingPolicyConfiguration(simpleScalingPolicyConfiguration.let(SimpleScalingPolicyConfigurationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1b4e742cbe99e2be6df8555644d40367564190d0d7e0bbad9cb163fa5a0c378c")
      override
          fun simpleScalingPolicyConfiguration(simpleScalingPolicyConfiguration: SimpleScalingPolicyConfigurationProperty.Builder.() -> Unit):
          Unit =
          simpleScalingPolicyConfiguration(SimpleScalingPolicyConfigurationProperty(simpleScalingPolicyConfiguration))

      public fun build():
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingActionProperty,
    ) : CdkObject(cdkObject), ScalingActionProperty {
      override fun market(): String? = unwrap(this).getMarket()

      override fun simpleScalingPolicyConfiguration(): Any =
          unwrap(this).getSimpleScalingPolicyConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ScalingActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingActionProperty):
          ScalingActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScalingActionProperty):
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingActionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingActionProperty
    }
  }

  public interface EbsConfigurationProperty {
    public fun ebsBlockDeviceConfigs(): Any? = unwrap(this).getEbsBlockDeviceConfigs()

    public fun ebsOptimized(): Any? = unwrap(this).getEbsOptimized()

    @CdkDslMarker
    public interface Builder {
      public fun ebsBlockDeviceConfigs(ebsBlockDeviceConfigs: IResolvable)

      public fun ebsBlockDeviceConfigs(ebsBlockDeviceConfigs: List<Any>)

      public fun ebsBlockDeviceConfigs(vararg ebsBlockDeviceConfigs: Any)

      public fun ebsOptimized(ebsOptimized: Boolean)

      public fun ebsOptimized(ebsOptimized: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.EbsConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.EbsConfigurationProperty.builder()

      override fun ebsBlockDeviceConfigs(ebsBlockDeviceConfigs: IResolvable) {
        cdkBuilder.ebsBlockDeviceConfigs(ebsBlockDeviceConfigs.let(IResolvable::unwrap))
      }

      override fun ebsBlockDeviceConfigs(ebsBlockDeviceConfigs: List<Any>) {
        cdkBuilder.ebsBlockDeviceConfigs(ebsBlockDeviceConfigs)
      }

      override fun ebsBlockDeviceConfigs(vararg ebsBlockDeviceConfigs: Any): Unit =
          ebsBlockDeviceConfigs(ebsBlockDeviceConfigs.toList())

      override fun ebsOptimized(ebsOptimized: Boolean) {
        cdkBuilder.ebsOptimized(ebsOptimized)
      }

      override fun ebsOptimized(ebsOptimized: IResolvable) {
        cdkBuilder.ebsOptimized(ebsOptimized.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.EbsConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.EbsConfigurationProperty,
    ) : CdkObject(cdkObject), EbsConfigurationProperty {
      override fun ebsBlockDeviceConfigs(): Any? = unwrap(this).getEbsBlockDeviceConfigs()

      override fun ebsOptimized(): Any? = unwrap(this).getEbsOptimized()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EbsConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.EbsConfigurationProperty):
          EbsConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EbsConfigurationProperty):
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.EbsConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.EbsConfigurationProperty
    }
  }
}
