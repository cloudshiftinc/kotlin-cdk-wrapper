package io.cloudshiftdev.awscdk.services.scheduler

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
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnSchedule internal constructor(
  private val cdkObject: software.amazon.awscdk.services.scheduler.CfnSchedule,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun endDate(): String? = unwrap(this).getEndDate()

  public open fun endDate(`value`: String) {
    unwrap(this).setEndDate(`value`)
  }

  public open fun flexibleTimeWindow(): Any = unwrap(this).getFlexibleTimeWindow()

  public open fun flexibleTimeWindow(`value`: IResolvable) {
    unwrap(this).setFlexibleTimeWindow(`value`.let(IResolvable::unwrap))
  }

  public open fun flexibleTimeWindow(`value`: FlexibleTimeWindowProperty) {
    unwrap(this).setFlexibleTimeWindow(`value`.let(FlexibleTimeWindowProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a74e38d6499dd4332fee4201b0ad1d330123fd38ab840b580d2d65e82e1ed46d")
  public open fun flexibleTimeWindow(`value`: FlexibleTimeWindowProperty.Builder.() -> Unit): Unit =
      flexibleTimeWindow(FlexibleTimeWindowProperty(`value`))

  public open fun groupName(): String? = unwrap(this).getGroupName()

  public open fun groupName(`value`: String) {
    unwrap(this).setGroupName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

  public open fun kmsKeyArn(`value`: String) {
    unwrap(this).setKmsKeyArn(`value`)
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun scheduleExpression(): String = unwrap(this).getScheduleExpression()

  public open fun scheduleExpression(`value`: String) {
    unwrap(this).setScheduleExpression(`value`)
  }

  public open fun scheduleExpressionTimezone(): String? =
      unwrap(this).getScheduleExpressionTimezone()

  public open fun scheduleExpressionTimezone(`value`: String) {
    unwrap(this).setScheduleExpressionTimezone(`value`)
  }

  public open fun startDate(): String? = unwrap(this).getStartDate()

  public open fun startDate(`value`: String) {
    unwrap(this).setStartDate(`value`)
  }

  public open fun state(): String? = unwrap(this).getState()

  public open fun state(`value`: String) {
    unwrap(this).setState(`value`)
  }

  public open fun target(): Any = unwrap(this).getTarget()

  public open fun target(`value`: IResolvable) {
    unwrap(this).setTarget(`value`.let(IResolvable::unwrap))
  }

  public open fun target(`value`: TargetProperty) {
    unwrap(this).setTarget(`value`.let(TargetProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2d3452854ece16a1d97ca5444195ab36fb99e00089cd5c34bb33f14eae440853")
  public open fun target(`value`: TargetProperty.Builder.() -> Unit): Unit =
      target(TargetProperty(`value`))

  public interface Builder {
    public fun description(description: String)

    public fun endDate(endDate: String)

    public fun flexibleTimeWindow(flexibleTimeWindow: IResolvable)

    public fun flexibleTimeWindow(flexibleTimeWindow: FlexibleTimeWindowProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("11bec8a2b49d8714c23848c634547529347f21a2f1958a89005e036f46821ac6")
    public fun flexibleTimeWindow(flexibleTimeWindow: FlexibleTimeWindowProperty.Builder.() -> Unit)

    public fun groupName(groupName: String)

    public fun kmsKeyArn(kmsKeyArn: String)

    public fun name(name: String)

    public fun scheduleExpression(scheduleExpression: String)

    public fun scheduleExpressionTimezone(scheduleExpressionTimezone: String)

    public fun startDate(startDate: String)

    public fun state(state: String)

    public fun target(target: IResolvable)

    public fun target(target: TargetProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("62c1f19a6420e6c4c5c89ce0edf3314101637861a18f150713bbf4dab90395d7")
    public fun target(target: TargetProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.scheduler.CfnSchedule.Builder =
        software.amazon.awscdk.services.scheduler.CfnSchedule.Builder.create(scope, id)

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun endDate(endDate: String) {
      cdkBuilder.endDate(endDate)
    }

    override fun flexibleTimeWindow(flexibleTimeWindow: IResolvable) {
      cdkBuilder.flexibleTimeWindow(flexibleTimeWindow.let(IResolvable::unwrap))
    }

    override fun flexibleTimeWindow(flexibleTimeWindow: FlexibleTimeWindowProperty) {
      cdkBuilder.flexibleTimeWindow(flexibleTimeWindow.let(FlexibleTimeWindowProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("11bec8a2b49d8714c23848c634547529347f21a2f1958a89005e036f46821ac6")
    override
        fun flexibleTimeWindow(flexibleTimeWindow: FlexibleTimeWindowProperty.Builder.() -> Unit):
        Unit = flexibleTimeWindow(FlexibleTimeWindowProperty(flexibleTimeWindow))

    override fun groupName(groupName: String) {
      cdkBuilder.groupName(groupName)
    }

    override fun kmsKeyArn(kmsKeyArn: String) {
      cdkBuilder.kmsKeyArn(kmsKeyArn)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun scheduleExpression(scheduleExpression: String) {
      cdkBuilder.scheduleExpression(scheduleExpression)
    }

    override fun scheduleExpressionTimezone(scheduleExpressionTimezone: String) {
      cdkBuilder.scheduleExpressionTimezone(scheduleExpressionTimezone)
    }

    override fun startDate(startDate: String) {
      cdkBuilder.startDate(startDate)
    }

    override fun state(state: String) {
      cdkBuilder.state(state)
    }

    override fun target(target: IResolvable) {
      cdkBuilder.target(target.let(IResolvable::unwrap))
    }

    override fun target(target: TargetProperty) {
      cdkBuilder.target(target.let(TargetProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("62c1f19a6420e6c4c5c89ce0edf3314101637861a18f150713bbf4dab90395d7")
    override fun target(target: TargetProperty.Builder.() -> Unit): Unit =
        target(TargetProperty(target))

    public fun build(): software.amazon.awscdk.services.scheduler.CfnSchedule = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSchedule {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSchedule(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.scheduler.CfnSchedule): CfnSchedule
        = CfnSchedule(cdkObject)

    internal fun unwrap(wrapped: CfnSchedule): software.amazon.awscdk.services.scheduler.CfnSchedule
        = wrapped.cdkObject
  }

  public interface RetryPolicyProperty {
    public fun maximumEventAgeInSeconds(): Number? = unwrap(this).getMaximumEventAgeInSeconds()

    public fun maximumRetryAttempts(): Number? = unwrap(this).getMaximumRetryAttempts()

    public interface Builder {
      public fun maximumEventAgeInSeconds(maximumEventAgeInSeconds: Number)

      public fun maximumRetryAttempts(maximumRetryAttempts: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.scheduler.CfnSchedule.RetryPolicyProperty.Builder =
          software.amazon.awscdk.services.scheduler.CfnSchedule.RetryPolicyProperty.builder()

      override fun maximumEventAgeInSeconds(maximumEventAgeInSeconds: Number) {
        cdkBuilder.maximumEventAgeInSeconds(maximumEventAgeInSeconds)
      }

      override fun maximumRetryAttempts(maximumRetryAttempts: Number) {
        cdkBuilder.maximumRetryAttempts(maximumRetryAttempts)
      }

      public fun build(): software.amazon.awscdk.services.scheduler.CfnSchedule.RetryPolicyProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.scheduler.CfnSchedule.RetryPolicyProperty,
    ) : RetryPolicyProperty {
      override fun maximumEventAgeInSeconds(): Number? = unwrap(this).getMaximumEventAgeInSeconds()

      override fun maximumRetryAttempts(): Number? = unwrap(this).getMaximumRetryAttempts()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RetryPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.scheduler.CfnSchedule.RetryPolicyProperty):
          RetryPolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RetryPolicyProperty):
          software.amazon.awscdk.services.scheduler.CfnSchedule.RetryPolicyProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SqsParametersProperty {
    public fun messageGroupId(): String? = unwrap(this).getMessageGroupId()

    public interface Builder {
      public fun messageGroupId(messageGroupId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.scheduler.CfnSchedule.SqsParametersProperty.Builder =
          software.amazon.awscdk.services.scheduler.CfnSchedule.SqsParametersProperty.builder()

      override fun messageGroupId(messageGroupId: String) {
        cdkBuilder.messageGroupId(messageGroupId)
      }

      public fun build():
          software.amazon.awscdk.services.scheduler.CfnSchedule.SqsParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.scheduler.CfnSchedule.SqsParametersProperty,
    ) : SqsParametersProperty {
      override fun messageGroupId(): String? = unwrap(this).getMessageGroupId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SqsParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.scheduler.CfnSchedule.SqsParametersProperty):
          SqsParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SqsParametersProperty):
          software.amazon.awscdk.services.scheduler.CfnSchedule.SqsParametersProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface CapacityProviderStrategyItemProperty {
    public fun base(): Number? = unwrap(this).getBase()

    public fun capacityProvider(): String

    public fun weight(): Number? = unwrap(this).getWeight()

    public interface Builder {
      public fun base(base: Number)

      public fun capacityProvider(capacityProvider: String)

      public fun weight(weight: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.scheduler.CfnSchedule.CapacityProviderStrategyItemProperty.Builder
          =
          software.amazon.awscdk.services.scheduler.CfnSchedule.CapacityProviderStrategyItemProperty.builder()

      override fun base(base: Number) {
        cdkBuilder.base(base)
      }

      override fun capacityProvider(capacityProvider: String) {
        cdkBuilder.capacityProvider(capacityProvider)
      }

      override fun weight(weight: Number) {
        cdkBuilder.weight(weight)
      }

      public fun build():
          software.amazon.awscdk.services.scheduler.CfnSchedule.CapacityProviderStrategyItemProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.scheduler.CfnSchedule.CapacityProviderStrategyItemProperty,
    ) : CapacityProviderStrategyItemProperty {
      override fun base(): Number? = unwrap(this).getBase()

      override fun capacityProvider(): String = unwrap(this).getCapacityProvider()

      override fun weight(): Number? = unwrap(this).getWeight()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          CapacityProviderStrategyItemProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.scheduler.CfnSchedule.CapacityProviderStrategyItemProperty):
          CapacityProviderStrategyItemProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CapacityProviderStrategyItemProperty):
          software.amazon.awscdk.services.scheduler.CfnSchedule.CapacityProviderStrategyItemProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface FlexibleTimeWindowProperty {
    public fun maximumWindowInMinutes(): Number? = unwrap(this).getMaximumWindowInMinutes()

    public fun mode(): String

    public interface Builder {
      public fun maximumWindowInMinutes(maximumWindowInMinutes: Number)

      public fun mode(mode: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.scheduler.CfnSchedule.FlexibleTimeWindowProperty.Builder =
          software.amazon.awscdk.services.scheduler.CfnSchedule.FlexibleTimeWindowProperty.builder()

      override fun maximumWindowInMinutes(maximumWindowInMinutes: Number) {
        cdkBuilder.maximumWindowInMinutes(maximumWindowInMinutes)
      }

      override fun mode(mode: String) {
        cdkBuilder.mode(mode)
      }

      public fun build():
          software.amazon.awscdk.services.scheduler.CfnSchedule.FlexibleTimeWindowProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.scheduler.CfnSchedule.FlexibleTimeWindowProperty,
    ) : FlexibleTimeWindowProperty {
      override fun maximumWindowInMinutes(): Number? = unwrap(this).getMaximumWindowInMinutes()

      override fun mode(): String = unwrap(this).getMode()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FlexibleTimeWindowProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.scheduler.CfnSchedule.FlexibleTimeWindowProperty):
          FlexibleTimeWindowProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FlexibleTimeWindowProperty):
          software.amazon.awscdk.services.scheduler.CfnSchedule.FlexibleTimeWindowProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface EventBridgeParametersProperty {
    public fun detailType(): String

    public fun source(): String

    public interface Builder {
      public fun detailType(detailType: String)

      public fun source(source: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.scheduler.CfnSchedule.EventBridgeParametersProperty.Builder
          =
          software.amazon.awscdk.services.scheduler.CfnSchedule.EventBridgeParametersProperty.builder()

      override fun detailType(detailType: String) {
        cdkBuilder.detailType(detailType)
      }

      override fun source(source: String) {
        cdkBuilder.source(source)
      }

      public fun build():
          software.amazon.awscdk.services.scheduler.CfnSchedule.EventBridgeParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.scheduler.CfnSchedule.EventBridgeParametersProperty,
    ) : EventBridgeParametersProperty {
      override fun detailType(): String = unwrap(this).getDetailType()

      override fun source(): String = unwrap(this).getSource()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EventBridgeParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.scheduler.CfnSchedule.EventBridgeParametersProperty):
          EventBridgeParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EventBridgeParametersProperty):
          software.amazon.awscdk.services.scheduler.CfnSchedule.EventBridgeParametersProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface PlacementStrategyProperty {
    public fun `field`(): String? = unwrap(this).getField()

    public fun type(): String? = unwrap(this).getType()

    public interface Builder {
      public fun `field`(`field`: String)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.scheduler.CfnSchedule.PlacementStrategyProperty.Builder =
          software.amazon.awscdk.services.scheduler.CfnSchedule.PlacementStrategyProperty.builder()

      override fun `field`(`field`: String) {
        cdkBuilder.`field`(`field`)
      }

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.scheduler.CfnSchedule.PlacementStrategyProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.scheduler.CfnSchedule.PlacementStrategyProperty,
    ) : PlacementStrategyProperty {
      override fun `field`(): String? = unwrap(this).getField()

      override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PlacementStrategyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.scheduler.CfnSchedule.PlacementStrategyProperty):
          PlacementStrategyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PlacementStrategyProperty):
          software.amazon.awscdk.services.scheduler.CfnSchedule.PlacementStrategyProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface AwsVpcConfigurationProperty {
    public fun assignPublicIp(): String? = unwrap(this).getAssignPublicIp()

    public fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()

    public fun subnets(): List<String>

    public interface Builder {
      public fun assignPublicIp(assignPublicIp: String)

      public fun securityGroups(securityGroups: List<String>)

      public fun subnets(subnets: List<String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.scheduler.CfnSchedule.AwsVpcConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.scheduler.CfnSchedule.AwsVpcConfigurationProperty.builder()

      override fun assignPublicIp(assignPublicIp: String) {
        cdkBuilder.assignPublicIp(assignPublicIp)
      }

      override fun securityGroups(securityGroups: List<String>) {
        cdkBuilder.securityGroups(securityGroups)
      }

      override fun subnets(subnets: List<String>) {
        cdkBuilder.subnets(subnets)
      }

      public fun build():
          software.amazon.awscdk.services.scheduler.CfnSchedule.AwsVpcConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.scheduler.CfnSchedule.AwsVpcConfigurationProperty,
    ) : AwsVpcConfigurationProperty {
      override fun assignPublicIp(): String? = unwrap(this).getAssignPublicIp()

      override fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()

      override fun subnets(): List<String> = unwrap(this).getSubnets() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AwsVpcConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.scheduler.CfnSchedule.AwsVpcConfigurationProperty):
          AwsVpcConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AwsVpcConfigurationProperty):
          software.amazon.awscdk.services.scheduler.CfnSchedule.AwsVpcConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface EcsParametersProperty {
    public fun capacityProviderStrategy(): Any? = unwrap(this).getCapacityProviderStrategy()

    public fun enableEcsManagedTags(): Any? = unwrap(this).getEnableEcsManagedTags()

    public fun enableExecuteCommand(): Any? = unwrap(this).getEnableExecuteCommand()

    public fun group(): String? = unwrap(this).getGroup()

    public fun launchType(): String? = unwrap(this).getLaunchType()

    public fun networkConfiguration(): Any? = unwrap(this).getNetworkConfiguration()

    public fun placementConstraints(): Any? = unwrap(this).getPlacementConstraints()

    public fun placementStrategy(): Any? = unwrap(this).getPlacementStrategy()

    public fun platformVersion(): String? = unwrap(this).getPlatformVersion()

    public fun propagateTags(): String? = unwrap(this).getPropagateTags()

    public fun referenceId(): String? = unwrap(this).getReferenceId()

    public fun tags(): Any? = unwrap(this).getTags()

    public fun taskCount(): Number? = unwrap(this).getTaskCount()

    public fun taskDefinitionArn(): String

    public interface Builder {
      public fun capacityProviderStrategy(capacityProviderStrategy: IResolvable)

      public fun capacityProviderStrategy(capacityProviderStrategy: List<Any>)

      public fun enableEcsManagedTags(enableEcsManagedTags: Boolean)

      public fun enableEcsManagedTags(enableEcsManagedTags: IResolvable)

      public fun enableExecuteCommand(enableExecuteCommand: Boolean)

      public fun enableExecuteCommand(enableExecuteCommand: IResolvable)

      public fun group(group: String)

      public fun launchType(launchType: String)

      public fun networkConfiguration(networkConfiguration: IResolvable)

      public fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("85312879eacab7cb787886bb005f56473e2093bcad24168c6da44a76e67c3ac4")
      public
          fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty.Builder.() -> Unit)

      public fun placementConstraints(placementConstraints: IResolvable)

      public fun placementConstraints(placementConstraints: List<Any>)

      public fun placementStrategy(placementStrategy: IResolvable)

      public fun placementStrategy(placementStrategy: List<Any>)

      public fun platformVersion(platformVersion: String)

      public fun propagateTags(propagateTags: String)

      public fun referenceId(referenceId: String)

      public fun tags(tags: Any)

      public fun taskCount(taskCount: Number)

      public fun taskDefinitionArn(taskDefinitionArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.scheduler.CfnSchedule.EcsParametersProperty.Builder =
          software.amazon.awscdk.services.scheduler.CfnSchedule.EcsParametersProperty.builder()

      override fun capacityProviderStrategy(capacityProviderStrategy: IResolvable) {
        cdkBuilder.capacityProviderStrategy(capacityProviderStrategy.let(IResolvable::unwrap))
      }

      override fun capacityProviderStrategy(capacityProviderStrategy: List<Any>) {
        cdkBuilder.capacityProviderStrategy(capacityProviderStrategy)
      }

      override fun enableEcsManagedTags(enableEcsManagedTags: Boolean) {
        cdkBuilder.enableEcsManagedTags(enableEcsManagedTags)
      }

      override fun enableEcsManagedTags(enableEcsManagedTags: IResolvable) {
        cdkBuilder.enableEcsManagedTags(enableEcsManagedTags.let(IResolvable::unwrap))
      }

      override fun enableExecuteCommand(enableExecuteCommand: Boolean) {
        cdkBuilder.enableExecuteCommand(enableExecuteCommand)
      }

      override fun enableExecuteCommand(enableExecuteCommand: IResolvable) {
        cdkBuilder.enableExecuteCommand(enableExecuteCommand.let(IResolvable::unwrap))
      }

      override fun group(group: String) {
        cdkBuilder.group(group)
      }

      override fun launchType(launchType: String) {
        cdkBuilder.launchType(launchType)
      }

      override fun networkConfiguration(networkConfiguration: IResolvable) {
        cdkBuilder.networkConfiguration(networkConfiguration.let(IResolvable::unwrap))
      }

      override fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty) {
        cdkBuilder.networkConfiguration(networkConfiguration.let(NetworkConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("85312879eacab7cb787886bb005f56473e2093bcad24168c6da44a76e67c3ac4")
      override
          fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty.Builder.() -> Unit):
          Unit = networkConfiguration(NetworkConfigurationProperty(networkConfiguration))

      override fun placementConstraints(placementConstraints: IResolvable) {
        cdkBuilder.placementConstraints(placementConstraints.let(IResolvable::unwrap))
      }

      override fun placementConstraints(placementConstraints: List<Any>) {
        cdkBuilder.placementConstraints(placementConstraints)
      }

      override fun placementStrategy(placementStrategy: IResolvable) {
        cdkBuilder.placementStrategy(placementStrategy.let(IResolvable::unwrap))
      }

      override fun placementStrategy(placementStrategy: List<Any>) {
        cdkBuilder.placementStrategy(placementStrategy)
      }

      override fun platformVersion(platformVersion: String) {
        cdkBuilder.platformVersion(platformVersion)
      }

      override fun propagateTags(propagateTags: String) {
        cdkBuilder.propagateTags(propagateTags)
      }

      override fun referenceId(referenceId: String) {
        cdkBuilder.referenceId(referenceId)
      }

      override fun tags(tags: Any) {
        cdkBuilder.tags(tags)
      }

      override fun taskCount(taskCount: Number) {
        cdkBuilder.taskCount(taskCount)
      }

      override fun taskDefinitionArn(taskDefinitionArn: String) {
        cdkBuilder.taskDefinitionArn(taskDefinitionArn)
      }

      public fun build():
          software.amazon.awscdk.services.scheduler.CfnSchedule.EcsParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.scheduler.CfnSchedule.EcsParametersProperty,
    ) : EcsParametersProperty {
      override fun capacityProviderStrategy(): Any? = unwrap(this).getCapacityProviderStrategy()

      override fun enableEcsManagedTags(): Any? = unwrap(this).getEnableEcsManagedTags()

      override fun enableExecuteCommand(): Any? = unwrap(this).getEnableExecuteCommand()

      override fun group(): String? = unwrap(this).getGroup()

      override fun launchType(): String? = unwrap(this).getLaunchType()

      override fun networkConfiguration(): Any? = unwrap(this).getNetworkConfiguration()

      override fun placementConstraints(): Any? = unwrap(this).getPlacementConstraints()

      override fun placementStrategy(): Any? = unwrap(this).getPlacementStrategy()

      override fun platformVersion(): String? = unwrap(this).getPlatformVersion()

      override fun propagateTags(): String? = unwrap(this).getPropagateTags()

      override fun referenceId(): String? = unwrap(this).getReferenceId()

      override fun tags(): Any? = unwrap(this).getTags()

      override fun taskCount(): Number? = unwrap(this).getTaskCount()

      override fun taskDefinitionArn(): String = unwrap(this).getTaskDefinitionArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EcsParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.scheduler.CfnSchedule.EcsParametersProperty):
          EcsParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EcsParametersProperty):
          software.amazon.awscdk.services.scheduler.CfnSchedule.EcsParametersProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface NetworkConfigurationProperty {
    public fun awsvpcConfiguration(): Any? = unwrap(this).getAwsvpcConfiguration()

    public interface Builder {
      public fun awsvpcConfiguration(awsvpcConfiguration: IResolvable)

      public fun awsvpcConfiguration(awsvpcConfiguration: AwsVpcConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("04060809f9c1959bebda48faabac1ca5fdf8baed4d13ecc17eaf06ccbf42270a")
      public
          fun awsvpcConfiguration(awsvpcConfiguration: AwsVpcConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.scheduler.CfnSchedule.NetworkConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.scheduler.CfnSchedule.NetworkConfigurationProperty.builder()

      override fun awsvpcConfiguration(awsvpcConfiguration: IResolvable) {
        cdkBuilder.awsvpcConfiguration(awsvpcConfiguration.let(IResolvable::unwrap))
      }

      override fun awsvpcConfiguration(awsvpcConfiguration: AwsVpcConfigurationProperty) {
        cdkBuilder.awsvpcConfiguration(awsvpcConfiguration.let(AwsVpcConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("04060809f9c1959bebda48faabac1ca5fdf8baed4d13ecc17eaf06ccbf42270a")
      override
          fun awsvpcConfiguration(awsvpcConfiguration: AwsVpcConfigurationProperty.Builder.() -> Unit):
          Unit = awsvpcConfiguration(AwsVpcConfigurationProperty(awsvpcConfiguration))

      public fun build():
          software.amazon.awscdk.services.scheduler.CfnSchedule.NetworkConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.scheduler.CfnSchedule.NetworkConfigurationProperty,
    ) : NetworkConfigurationProperty {
      override fun awsvpcConfiguration(): Any? = unwrap(this).getAwsvpcConfiguration()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): NetworkConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.scheduler.CfnSchedule.NetworkConfigurationProperty):
          NetworkConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NetworkConfigurationProperty):
          software.amazon.awscdk.services.scheduler.CfnSchedule.NetworkConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface SageMakerPipelineParameterProperty {
    public fun name(): String

    public fun `value`(): String

    public interface Builder {
      public fun name(name: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.scheduler.CfnSchedule.SageMakerPipelineParameterProperty.Builder
          =
          software.amazon.awscdk.services.scheduler.CfnSchedule.SageMakerPipelineParameterProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.scheduler.CfnSchedule.SageMakerPipelineParameterProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.scheduler.CfnSchedule.SageMakerPipelineParameterProperty,
    ) : SageMakerPipelineParameterProperty {
      override fun name(): String = unwrap(this).getName()

      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          SageMakerPipelineParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.scheduler.CfnSchedule.SageMakerPipelineParameterProperty):
          SageMakerPipelineParameterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SageMakerPipelineParameterProperty):
          software.amazon.awscdk.services.scheduler.CfnSchedule.SageMakerPipelineParameterProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface TargetProperty {
    public fun arn(): String

    public fun deadLetterConfig(): Any? = unwrap(this).getDeadLetterConfig()

    public fun ecsParameters(): Any? = unwrap(this).getEcsParameters()

    public fun eventBridgeParameters(): Any? = unwrap(this).getEventBridgeParameters()

    public fun input(): String? = unwrap(this).getInput()

    public fun kinesisParameters(): Any? = unwrap(this).getKinesisParameters()

    public fun retryPolicy(): Any? = unwrap(this).getRetryPolicy()

    public fun roleArn(): String

    public fun sageMakerPipelineParameters(): Any? = unwrap(this).getSageMakerPipelineParameters()

    public fun sqsParameters(): Any? = unwrap(this).getSqsParameters()

    public interface Builder {
      public fun arn(arn: String)

      public fun deadLetterConfig(deadLetterConfig: IResolvable)

      public fun deadLetterConfig(deadLetterConfig: DeadLetterConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("678b1b6e4c8abb7d37742f06ab8e75b8927b5925e871c0db1a6f25b5830bc1a6")
      public fun deadLetterConfig(deadLetterConfig: DeadLetterConfigProperty.Builder.() -> Unit)

      public fun ecsParameters(ecsParameters: IResolvable)

      public fun ecsParameters(ecsParameters: EcsParametersProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("42efab9de5b2a42fa3800150ad80ad2a5e6af52d9b2a1abe90a31d7a4de09091")
      public fun ecsParameters(ecsParameters: EcsParametersProperty.Builder.() -> Unit)

      public fun eventBridgeParameters(eventBridgeParameters: IResolvable)

      public fun eventBridgeParameters(eventBridgeParameters: EventBridgeParametersProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c8dc7021d0d8dad51f9e7fd3ed7eff45c5257077ea5c72412c8b2367ed03fc00")
      public
          fun eventBridgeParameters(eventBridgeParameters: EventBridgeParametersProperty.Builder.() -> Unit)

      public fun input(input: String)

      public fun kinesisParameters(kinesisParameters: IResolvable)

      public fun kinesisParameters(kinesisParameters: KinesisParametersProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9c98b52af61e5e7d28642a0e18e6d158ca79515a608d6ae740f68d6e21efe6f6")
      public fun kinesisParameters(kinesisParameters: KinesisParametersProperty.Builder.() -> Unit)

      public fun retryPolicy(retryPolicy: IResolvable)

      public fun retryPolicy(retryPolicy: RetryPolicyProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4ef94c64773bf2d1846e72841097ccc999a30443539e54c32707d6748ffcc766")
      public fun retryPolicy(retryPolicy: RetryPolicyProperty.Builder.() -> Unit)

      public fun roleArn(roleArn: String)

      public fun sageMakerPipelineParameters(sageMakerPipelineParameters: IResolvable)

      public
          fun sageMakerPipelineParameters(sageMakerPipelineParameters: SageMakerPipelineParametersProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c7c2f060bbdd051dfc0f3b6cc34e03f93ed8684d1b1ba4fb6f48478304c67e0f")
      public
          fun sageMakerPipelineParameters(sageMakerPipelineParameters: SageMakerPipelineParametersProperty.Builder.() -> Unit)

      public fun sqsParameters(sqsParameters: IResolvable)

      public fun sqsParameters(sqsParameters: SqsParametersProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4b03d5a5df57542717b168a26ad0f0bc9650a6fb5977cacfb1b3573557f277c5")
      public fun sqsParameters(sqsParameters: SqsParametersProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.scheduler.CfnSchedule.TargetProperty.Builder =
          software.amazon.awscdk.services.scheduler.CfnSchedule.TargetProperty.builder()

      override fun arn(arn: String) {
        cdkBuilder.arn(arn)
      }

      override fun deadLetterConfig(deadLetterConfig: IResolvable) {
        cdkBuilder.deadLetterConfig(deadLetterConfig.let(IResolvable::unwrap))
      }

      override fun deadLetterConfig(deadLetterConfig: DeadLetterConfigProperty) {
        cdkBuilder.deadLetterConfig(deadLetterConfig.let(DeadLetterConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("678b1b6e4c8abb7d37742f06ab8e75b8927b5925e871c0db1a6f25b5830bc1a6")
      override fun deadLetterConfig(deadLetterConfig: DeadLetterConfigProperty.Builder.() -> Unit):
          Unit = deadLetterConfig(DeadLetterConfigProperty(deadLetterConfig))

      override fun ecsParameters(ecsParameters: IResolvable) {
        cdkBuilder.ecsParameters(ecsParameters.let(IResolvable::unwrap))
      }

      override fun ecsParameters(ecsParameters: EcsParametersProperty) {
        cdkBuilder.ecsParameters(ecsParameters.let(EcsParametersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("42efab9de5b2a42fa3800150ad80ad2a5e6af52d9b2a1abe90a31d7a4de09091")
      override fun ecsParameters(ecsParameters: EcsParametersProperty.Builder.() -> Unit): Unit =
          ecsParameters(EcsParametersProperty(ecsParameters))

      override fun eventBridgeParameters(eventBridgeParameters: IResolvable) {
        cdkBuilder.eventBridgeParameters(eventBridgeParameters.let(IResolvable::unwrap))
      }

      override fun eventBridgeParameters(eventBridgeParameters: EventBridgeParametersProperty) {
        cdkBuilder.eventBridgeParameters(eventBridgeParameters.let(EventBridgeParametersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c8dc7021d0d8dad51f9e7fd3ed7eff45c5257077ea5c72412c8b2367ed03fc00")
      override
          fun eventBridgeParameters(eventBridgeParameters: EventBridgeParametersProperty.Builder.() -> Unit):
          Unit = eventBridgeParameters(EventBridgeParametersProperty(eventBridgeParameters))

      override fun input(input: String) {
        cdkBuilder.input(input)
      }

      override fun kinesisParameters(kinesisParameters: IResolvable) {
        cdkBuilder.kinesisParameters(kinesisParameters.let(IResolvable::unwrap))
      }

      override fun kinesisParameters(kinesisParameters: KinesisParametersProperty) {
        cdkBuilder.kinesisParameters(kinesisParameters.let(KinesisParametersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9c98b52af61e5e7d28642a0e18e6d158ca79515a608d6ae740f68d6e21efe6f6")
      override
          fun kinesisParameters(kinesisParameters: KinesisParametersProperty.Builder.() -> Unit):
          Unit = kinesisParameters(KinesisParametersProperty(kinesisParameters))

      override fun retryPolicy(retryPolicy: IResolvable) {
        cdkBuilder.retryPolicy(retryPolicy.let(IResolvable::unwrap))
      }

      override fun retryPolicy(retryPolicy: RetryPolicyProperty) {
        cdkBuilder.retryPolicy(retryPolicy.let(RetryPolicyProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4ef94c64773bf2d1846e72841097ccc999a30443539e54c32707d6748ffcc766")
      override fun retryPolicy(retryPolicy: RetryPolicyProperty.Builder.() -> Unit): Unit =
          retryPolicy(RetryPolicyProperty(retryPolicy))

      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      override fun sageMakerPipelineParameters(sageMakerPipelineParameters: IResolvable) {
        cdkBuilder.sageMakerPipelineParameters(sageMakerPipelineParameters.let(IResolvable::unwrap))
      }

      override
          fun sageMakerPipelineParameters(sageMakerPipelineParameters: SageMakerPipelineParametersProperty) {
        cdkBuilder.sageMakerPipelineParameters(sageMakerPipelineParameters.let(SageMakerPipelineParametersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c7c2f060bbdd051dfc0f3b6cc34e03f93ed8684d1b1ba4fb6f48478304c67e0f")
      override
          fun sageMakerPipelineParameters(sageMakerPipelineParameters: SageMakerPipelineParametersProperty.Builder.() -> Unit):
          Unit =
          sageMakerPipelineParameters(SageMakerPipelineParametersProperty(sageMakerPipelineParameters))

      override fun sqsParameters(sqsParameters: IResolvable) {
        cdkBuilder.sqsParameters(sqsParameters.let(IResolvable::unwrap))
      }

      override fun sqsParameters(sqsParameters: SqsParametersProperty) {
        cdkBuilder.sqsParameters(sqsParameters.let(SqsParametersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4b03d5a5df57542717b168a26ad0f0bc9650a6fb5977cacfb1b3573557f277c5")
      override fun sqsParameters(sqsParameters: SqsParametersProperty.Builder.() -> Unit): Unit =
          sqsParameters(SqsParametersProperty(sqsParameters))

      public fun build(): software.amazon.awscdk.services.scheduler.CfnSchedule.TargetProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.scheduler.CfnSchedule.TargetProperty,
    ) : TargetProperty {
      override fun arn(): String = unwrap(this).getArn()

      override fun deadLetterConfig(): Any? = unwrap(this).getDeadLetterConfig()

      override fun ecsParameters(): Any? = unwrap(this).getEcsParameters()

      override fun eventBridgeParameters(): Any? = unwrap(this).getEventBridgeParameters()

      override fun input(): String? = unwrap(this).getInput()

      override fun kinesisParameters(): Any? = unwrap(this).getKinesisParameters()

      override fun retryPolicy(): Any? = unwrap(this).getRetryPolicy()

      override fun roleArn(): String = unwrap(this).getRoleArn()

      override fun sageMakerPipelineParameters(): Any? =
          unwrap(this).getSageMakerPipelineParameters()

      override fun sqsParameters(): Any? = unwrap(this).getSqsParameters()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TargetProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.scheduler.CfnSchedule.TargetProperty):
          TargetProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TargetProperty):
          software.amazon.awscdk.services.scheduler.CfnSchedule.TargetProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface DeadLetterConfigProperty {
    public fun arn(): String? = unwrap(this).getArn()

    public interface Builder {
      public fun arn(arn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.scheduler.CfnSchedule.DeadLetterConfigProperty.Builder =
          software.amazon.awscdk.services.scheduler.CfnSchedule.DeadLetterConfigProperty.builder()

      override fun arn(arn: String) {
        cdkBuilder.arn(arn)
      }

      public fun build():
          software.amazon.awscdk.services.scheduler.CfnSchedule.DeadLetterConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.scheduler.CfnSchedule.DeadLetterConfigProperty,
    ) : DeadLetterConfigProperty {
      override fun arn(): String? = unwrap(this).getArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DeadLetterConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.scheduler.CfnSchedule.DeadLetterConfigProperty):
          DeadLetterConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeadLetterConfigProperty):
          software.amazon.awscdk.services.scheduler.CfnSchedule.DeadLetterConfigProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface KinesisParametersProperty {
    public fun partitionKey(): String

    public interface Builder {
      public fun partitionKey(partitionKey: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.scheduler.CfnSchedule.KinesisParametersProperty.Builder =
          software.amazon.awscdk.services.scheduler.CfnSchedule.KinesisParametersProperty.builder()

      override fun partitionKey(partitionKey: String) {
        cdkBuilder.partitionKey(partitionKey)
      }

      public fun build():
          software.amazon.awscdk.services.scheduler.CfnSchedule.KinesisParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.scheduler.CfnSchedule.KinesisParametersProperty,
    ) : KinesisParametersProperty {
      override fun partitionKey(): String = unwrap(this).getPartitionKey()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): KinesisParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.scheduler.CfnSchedule.KinesisParametersProperty):
          KinesisParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KinesisParametersProperty):
          software.amazon.awscdk.services.scheduler.CfnSchedule.KinesisParametersProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface PlacementConstraintProperty {
    public fun expression(): String? = unwrap(this).getExpression()

    public fun type(): String? = unwrap(this).getType()

    public interface Builder {
      public fun expression(expression: String)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.scheduler.CfnSchedule.PlacementConstraintProperty.Builder
          =
          software.amazon.awscdk.services.scheduler.CfnSchedule.PlacementConstraintProperty.builder()

      override fun expression(expression: String) {
        cdkBuilder.expression(expression)
      }

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.scheduler.CfnSchedule.PlacementConstraintProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.scheduler.CfnSchedule.PlacementConstraintProperty,
    ) : PlacementConstraintProperty {
      override fun expression(): String? = unwrap(this).getExpression()

      override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PlacementConstraintProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.scheduler.CfnSchedule.PlacementConstraintProperty):
          PlacementConstraintProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PlacementConstraintProperty):
          software.amazon.awscdk.services.scheduler.CfnSchedule.PlacementConstraintProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface SageMakerPipelineParametersProperty {
    public fun pipelineParameterList(): Any? = unwrap(this).getPipelineParameterList()

    public interface Builder {
      public fun pipelineParameterList(pipelineParameterList: IResolvable)

      public fun pipelineParameterList(pipelineParameterList: List<Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.scheduler.CfnSchedule.SageMakerPipelineParametersProperty.Builder
          =
          software.amazon.awscdk.services.scheduler.CfnSchedule.SageMakerPipelineParametersProperty.builder()

      override fun pipelineParameterList(pipelineParameterList: IResolvable) {
        cdkBuilder.pipelineParameterList(pipelineParameterList.let(IResolvable::unwrap))
      }

      override fun pipelineParameterList(pipelineParameterList: List<Any>) {
        cdkBuilder.pipelineParameterList(pipelineParameterList)
      }

      public fun build():
          software.amazon.awscdk.services.scheduler.CfnSchedule.SageMakerPipelineParametersProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.scheduler.CfnSchedule.SageMakerPipelineParametersProperty,
    ) : SageMakerPipelineParametersProperty {
      override fun pipelineParameterList(): Any? = unwrap(this).getPipelineParameterList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          SageMakerPipelineParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.scheduler.CfnSchedule.SageMakerPipelineParametersProperty):
          SageMakerPipelineParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SageMakerPipelineParametersProperty):
          software.amazon.awscdk.services.scheduler.CfnSchedule.SageMakerPipelineParametersProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
