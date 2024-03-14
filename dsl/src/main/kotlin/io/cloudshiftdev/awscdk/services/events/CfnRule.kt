package io.cloudshiftdev.awscdk.services.events

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

public open class CfnRule internal constructor(
  private val cdkObject: software.amazon.awscdk.services.events.CfnRule,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun eventBusName(): String? = unwrap(this).getEventBusName()

  public open fun eventBusName(`value`: String) {
    unwrap(this).setEventBusName(`value`)
  }

  public open fun eventPattern(): Any? = unwrap(this).getEventPattern()

  public open fun eventPattern(`value`: Any) {
    unwrap(this).setEventPattern(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun roleArn(): String? = unwrap(this).getRoleArn()

  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  public open fun scheduleExpression(): String? = unwrap(this).getScheduleExpression()

  public open fun scheduleExpression(`value`: String) {
    unwrap(this).setScheduleExpression(`value`)
  }

  public open fun state(): String? = unwrap(this).getState()

  public open fun state(`value`: String) {
    unwrap(this).setState(`value`)
  }

  public open fun targets(): Any? = unwrap(this).getTargets()

  public open fun targets(`value`: IResolvable) {
    unwrap(this).setTargets(`value`.let(IResolvable::unwrap))
  }

  public open fun targets(__idx_ac66f0: List<Any>) {
    unwrap(this).setTargets(__idx_ac66f0)
  }

  public interface Builder {
    public fun description(description: String)

    public fun eventBusName(eventBusName: String)

    public fun eventPattern(eventPattern: Any)

    public fun name(name: String)

    public fun roleArn(roleArn: String)

    public fun scheduleExpression(scheduleExpression: String)

    public fun state(state: String)

    public fun targets(targets: IResolvable)

    public fun targets(targets: List<Any>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.CfnRule.Builder =
        software.amazon.awscdk.services.events.CfnRule.Builder.create(scope, id)

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun eventBusName(eventBusName: String) {
      cdkBuilder.eventBusName(eventBusName)
    }

    override fun eventPattern(eventPattern: Any) {
      cdkBuilder.eventPattern(eventPattern)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    override fun scheduleExpression(scheduleExpression: String) {
      cdkBuilder.scheduleExpression(scheduleExpression)
    }

    override fun state(state: String) {
      cdkBuilder.state(state)
    }

    override fun targets(targets: IResolvable) {
      cdkBuilder.targets(targets.let(IResolvable::unwrap))
    }

    override fun targets(targets: List<Any>) {
      cdkBuilder.targets(targets)
    }

    public fun build(): software.amazon.awscdk.services.events.CfnRule = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRule {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRule(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnRule): CfnRule =
        CfnRule(cdkObject)

    internal fun unwrap(wrapped: CfnRule): software.amazon.awscdk.services.events.CfnRule =
        wrapped.cdkObject
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
          software.amazon.awscdk.services.events.CfnRule.PlacementStrategyProperty.Builder =
          software.amazon.awscdk.services.events.CfnRule.PlacementStrategyProperty.builder()

      override fun `field`(`field`: String) {
        cdkBuilder.`field`(`field`)
      }

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.events.CfnRule.PlacementStrategyProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.events.CfnRule.PlacementStrategyProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnRule.PlacementStrategyProperty):
          PlacementStrategyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PlacementStrategyProperty):
          software.amazon.awscdk.services.events.CfnRule.PlacementStrategyProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface TagProperty {
    public fun key(): String? = unwrap(this).getKey()

    public fun `value`(): String? = unwrap(this).getValue()

    public interface Builder {
      public fun key(key: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.events.CfnRule.TagProperty.Builder =
          software.amazon.awscdk.services.events.CfnRule.TagProperty.builder()

      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.events.CfnRule.TagProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.events.CfnRule.TagProperty,
    ) : TagProperty {
      override fun key(): String? = unwrap(this).getKey()

      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TagProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnRule.TagProperty):
          TagProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TagProperty):
          software.amazon.awscdk.services.events.CfnRule.TagProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface RedshiftDataParametersProperty {
    public fun database(): String

    public fun dbUser(): String? = unwrap(this).getDbUser()

    public fun secretManagerArn(): String? = unwrap(this).getSecretManagerArn()

    public fun sql(): String? = unwrap(this).getSql()

    public fun sqls(): List<String> = unwrap(this).getSqls() ?: emptyList()

    public fun statementName(): String? = unwrap(this).getStatementName()

    public fun withEvent(): Any? = unwrap(this).getWithEvent()

    public interface Builder {
      public fun database(database: String)

      public fun dbUser(dbUser: String)

      public fun secretManagerArn(secretManagerArn: String)

      public fun sql(sql: String)

      public fun sqls(sqls: List<String>)

      public fun statementName(statementName: String)

      public fun withEvent(withEvent: Boolean)

      public fun withEvent(withEvent: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.events.CfnRule.RedshiftDataParametersProperty.Builder =
          software.amazon.awscdk.services.events.CfnRule.RedshiftDataParametersProperty.builder()

      override fun database(database: String) {
        cdkBuilder.database(database)
      }

      override fun dbUser(dbUser: String) {
        cdkBuilder.dbUser(dbUser)
      }

      override fun secretManagerArn(secretManagerArn: String) {
        cdkBuilder.secretManagerArn(secretManagerArn)
      }

      override fun sql(sql: String) {
        cdkBuilder.sql(sql)
      }

      override fun sqls(sqls: List<String>) {
        cdkBuilder.sqls(sqls)
      }

      override fun statementName(statementName: String) {
        cdkBuilder.statementName(statementName)
      }

      override fun withEvent(withEvent: Boolean) {
        cdkBuilder.withEvent(withEvent)
      }

      override fun withEvent(withEvent: IResolvable) {
        cdkBuilder.withEvent(withEvent.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.events.CfnRule.RedshiftDataParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.events.CfnRule.RedshiftDataParametersProperty,
    ) : RedshiftDataParametersProperty {
      override fun database(): String = unwrap(this).getDatabase()

      override fun dbUser(): String? = unwrap(this).getDbUser()

      override fun secretManagerArn(): String? = unwrap(this).getSecretManagerArn()

      override fun sql(): String? = unwrap(this).getSql()

      override fun sqls(): List<String> = unwrap(this).getSqls() ?: emptyList()

      override fun statementName(): String? = unwrap(this).getStatementName()

      override fun withEvent(): Any? = unwrap(this).getWithEvent()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RedshiftDataParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnRule.RedshiftDataParametersProperty):
          RedshiftDataParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RedshiftDataParametersProperty):
          software.amazon.awscdk.services.events.CfnRule.RedshiftDataParametersProperty = (wrapped
          as Wrapper).cdkObject
    }
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
          software.amazon.awscdk.services.events.CfnRule.RetryPolicyProperty.Builder =
          software.amazon.awscdk.services.events.CfnRule.RetryPolicyProperty.builder()

      override fun maximumEventAgeInSeconds(maximumEventAgeInSeconds: Number) {
        cdkBuilder.maximumEventAgeInSeconds(maximumEventAgeInSeconds)
      }

      override fun maximumRetryAttempts(maximumRetryAttempts: Number) {
        cdkBuilder.maximumRetryAttempts(maximumRetryAttempts)
      }

      public fun build(): software.amazon.awscdk.services.events.CfnRule.RetryPolicyProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.events.CfnRule.RetryPolicyProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnRule.RetryPolicyProperty):
          RetryPolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RetryPolicyProperty):
          software.amazon.awscdk.services.events.CfnRule.RetryPolicyProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SqsParametersProperty {
    public fun messageGroupId(): String

    public interface Builder {
      public fun messageGroupId(messageGroupId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.events.CfnRule.SqsParametersProperty.Builder =
          software.amazon.awscdk.services.events.CfnRule.SqsParametersProperty.builder()

      override fun messageGroupId(messageGroupId: String) {
        cdkBuilder.messageGroupId(messageGroupId)
      }

      public fun build(): software.amazon.awscdk.services.events.CfnRule.SqsParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.events.CfnRule.SqsParametersProperty,
    ) : SqsParametersProperty {
      override fun messageGroupId(): String = unwrap(this).getMessageGroupId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SqsParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnRule.SqsParametersProperty):
          SqsParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SqsParametersProperty):
          software.amazon.awscdk.services.events.CfnRule.SqsParametersProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface InputTransformerProperty {
    public fun inputPathsMap(): Any? = unwrap(this).getInputPathsMap()

    public fun inputTemplate(): String

    public interface Builder {
      public fun inputPathsMap(inputPathsMap: IResolvable)

      public fun inputPathsMap(inputPathsMap: Map<String, String>)

      public fun inputTemplate(inputTemplate: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.events.CfnRule.InputTransformerProperty.Builder =
          software.amazon.awscdk.services.events.CfnRule.InputTransformerProperty.builder()

      override fun inputPathsMap(inputPathsMap: IResolvable) {
        cdkBuilder.inputPathsMap(inputPathsMap.let(IResolvable::unwrap))
      }

      override fun inputPathsMap(inputPathsMap: Map<String, String>) {
        cdkBuilder.inputPathsMap(inputPathsMap)
      }

      override fun inputTemplate(inputTemplate: String) {
        cdkBuilder.inputTemplate(inputTemplate)
      }

      public fun build(): software.amazon.awscdk.services.events.CfnRule.InputTransformerProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.events.CfnRule.InputTransformerProperty,
    ) : InputTransformerProperty {
      override fun inputPathsMap(): Any? = unwrap(this).getInputPathsMap()

      override fun inputTemplate(): String = unwrap(this).getInputTemplate()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): InputTransformerProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnRule.InputTransformerProperty):
          InputTransformerProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InputTransformerProperty):
          software.amazon.awscdk.services.events.CfnRule.InputTransformerProperty = (wrapped as
          Wrapper).cdkObject
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
          software.amazon.awscdk.services.events.CfnRule.PlacementConstraintProperty.Builder =
          software.amazon.awscdk.services.events.CfnRule.PlacementConstraintProperty.builder()

      override fun expression(expression: String) {
        cdkBuilder.expression(expression)
      }

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.events.CfnRule.PlacementConstraintProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.events.CfnRule.PlacementConstraintProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnRule.PlacementConstraintProperty):
          PlacementConstraintProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PlacementConstraintProperty):
          software.amazon.awscdk.services.events.CfnRule.PlacementConstraintProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface RunCommandTargetProperty {
    public fun key(): String

    public fun values(): List<String>

    public interface Builder {
      public fun key(key: String)

      public fun values(values: List<String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.events.CfnRule.RunCommandTargetProperty.Builder =
          software.amazon.awscdk.services.events.CfnRule.RunCommandTargetProperty.builder()

      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      override fun values(values: List<String>) {
        cdkBuilder.values(values)
      }

      public fun build(): software.amazon.awscdk.services.events.CfnRule.RunCommandTargetProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.events.CfnRule.RunCommandTargetProperty,
    ) : RunCommandTargetProperty {
      override fun key(): String = unwrap(this).getKey()

      override fun values(): List<String> = unwrap(this).getValues() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RunCommandTargetProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnRule.RunCommandTargetProperty):
          RunCommandTargetProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RunCommandTargetProperty):
          software.amazon.awscdk.services.events.CfnRule.RunCommandTargetProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface KinesisParametersProperty {
    public fun partitionKeyPath(): String

    public interface Builder {
      public fun partitionKeyPath(partitionKeyPath: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.events.CfnRule.KinesisParametersProperty.Builder =
          software.amazon.awscdk.services.events.CfnRule.KinesisParametersProperty.builder()

      override fun partitionKeyPath(partitionKeyPath: String) {
        cdkBuilder.partitionKeyPath(partitionKeyPath)
      }

      public fun build(): software.amazon.awscdk.services.events.CfnRule.KinesisParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.events.CfnRule.KinesisParametersProperty,
    ) : KinesisParametersProperty {
      override fun partitionKeyPath(): String = unwrap(this).getPartitionKeyPath()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): KinesisParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnRule.KinesisParametersProperty):
          KinesisParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KinesisParametersProperty):
          software.amazon.awscdk.services.events.CfnRule.KinesisParametersProperty = (wrapped as
          Wrapper).cdkObject
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
          software.amazon.awscdk.services.events.CfnRule.AwsVpcConfigurationProperty.Builder =
          software.amazon.awscdk.services.events.CfnRule.AwsVpcConfigurationProperty.builder()

      override fun assignPublicIp(assignPublicIp: String) {
        cdkBuilder.assignPublicIp(assignPublicIp)
      }

      override fun securityGroups(securityGroups: List<String>) {
        cdkBuilder.securityGroups(securityGroups)
      }

      override fun subnets(subnets: List<String>) {
        cdkBuilder.subnets(subnets)
      }

      public fun build(): software.amazon.awscdk.services.events.CfnRule.AwsVpcConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.events.CfnRule.AwsVpcConfigurationProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnRule.AwsVpcConfigurationProperty):
          AwsVpcConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AwsVpcConfigurationProperty):
          software.amazon.awscdk.services.events.CfnRule.AwsVpcConfigurationProperty = (wrapped as
          Wrapper).cdkObject
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

    public fun placementStrategies(): Any? = unwrap(this).getPlacementStrategies()

    public fun platformVersion(): String? = unwrap(this).getPlatformVersion()

    public fun propagateTags(): String? = unwrap(this).getPropagateTags()

    public fun referenceId(): String? = unwrap(this).getReferenceId()

    public fun tagList(): Any? = unwrap(this).getTagList()

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
      @JvmName("1b82fdf91945393c7d598da2a252104b7ede1400d8968abcd0818a2331d5a206")
      public
          fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty.Builder.() -> Unit)

      public fun placementConstraints(placementConstraints: IResolvable)

      public fun placementConstraints(placementConstraints: List<Any>)

      public fun placementStrategies(placementStrategies: IResolvable)

      public fun placementStrategies(placementStrategies: List<Any>)

      public fun platformVersion(platformVersion: String)

      public fun propagateTags(propagateTags: String)

      public fun referenceId(referenceId: String)

      public fun tagList(tagList: IResolvable)

      public fun tagList(tagList: List<Any>)

      public fun taskCount(taskCount: Number)

      public fun taskDefinitionArn(taskDefinitionArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.events.CfnRule.EcsParametersProperty.Builder =
          software.amazon.awscdk.services.events.CfnRule.EcsParametersProperty.builder()

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
      @JvmName("1b82fdf91945393c7d598da2a252104b7ede1400d8968abcd0818a2331d5a206")
      override
          fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty.Builder.() -> Unit):
          Unit = networkConfiguration(NetworkConfigurationProperty(networkConfiguration))

      override fun placementConstraints(placementConstraints: IResolvable) {
        cdkBuilder.placementConstraints(placementConstraints.let(IResolvable::unwrap))
      }

      override fun placementConstraints(placementConstraints: List<Any>) {
        cdkBuilder.placementConstraints(placementConstraints)
      }

      override fun placementStrategies(placementStrategies: IResolvable) {
        cdkBuilder.placementStrategies(placementStrategies.let(IResolvable::unwrap))
      }

      override fun placementStrategies(placementStrategies: List<Any>) {
        cdkBuilder.placementStrategies(placementStrategies)
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

      override fun tagList(tagList: IResolvable) {
        cdkBuilder.tagList(tagList.let(IResolvable::unwrap))
      }

      override fun tagList(tagList: List<Any>) {
        cdkBuilder.tagList(tagList)
      }

      override fun taskCount(taskCount: Number) {
        cdkBuilder.taskCount(taskCount)
      }

      override fun taskDefinitionArn(taskDefinitionArn: String) {
        cdkBuilder.taskDefinitionArn(taskDefinitionArn)
      }

      public fun build(): software.amazon.awscdk.services.events.CfnRule.EcsParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.events.CfnRule.EcsParametersProperty,
    ) : EcsParametersProperty {
      override fun capacityProviderStrategy(): Any? = unwrap(this).getCapacityProviderStrategy()

      override fun enableEcsManagedTags(): Any? = unwrap(this).getEnableEcsManagedTags()

      override fun enableExecuteCommand(): Any? = unwrap(this).getEnableExecuteCommand()

      override fun group(): String? = unwrap(this).getGroup()

      override fun launchType(): String? = unwrap(this).getLaunchType()

      override fun networkConfiguration(): Any? = unwrap(this).getNetworkConfiguration()

      override fun placementConstraints(): Any? = unwrap(this).getPlacementConstraints()

      override fun placementStrategies(): Any? = unwrap(this).getPlacementStrategies()

      override fun platformVersion(): String? = unwrap(this).getPlatformVersion()

      override fun propagateTags(): String? = unwrap(this).getPropagateTags()

      override fun referenceId(): String? = unwrap(this).getReferenceId()

      override fun tagList(): Any? = unwrap(this).getTagList()

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
          fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnRule.EcsParametersProperty):
          EcsParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EcsParametersProperty):
          software.amazon.awscdk.services.events.CfnRule.EcsParametersProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface BatchParametersProperty {
    public fun arrayProperties(): Any? = unwrap(this).getArrayProperties()

    public fun jobDefinition(): String

    public fun jobName(): String

    public fun retryStrategy(): Any? = unwrap(this).getRetryStrategy()

    public interface Builder {
      public fun arrayProperties(arrayProperties: IResolvable)

      public fun arrayProperties(arrayProperties: BatchArrayPropertiesProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e429329971427039d0e843a7a4df3f41683a0f5c699fba7b4c40cbf5a7a6ceaf")
      public fun arrayProperties(arrayProperties: BatchArrayPropertiesProperty.Builder.() -> Unit)

      public fun jobDefinition(jobDefinition: String)

      public fun jobName(jobName: String)

      public fun retryStrategy(retryStrategy: IResolvable)

      public fun retryStrategy(retryStrategy: BatchRetryStrategyProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e3d0ec99b93e657097bc00083ade70aa50728d7305df6d44525abd733e293a08")
      public fun retryStrategy(retryStrategy: BatchRetryStrategyProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.events.CfnRule.BatchParametersProperty.Builder =
          software.amazon.awscdk.services.events.CfnRule.BatchParametersProperty.builder()

      override fun arrayProperties(arrayProperties: IResolvable) {
        cdkBuilder.arrayProperties(arrayProperties.let(IResolvable::unwrap))
      }

      override fun arrayProperties(arrayProperties: BatchArrayPropertiesProperty) {
        cdkBuilder.arrayProperties(arrayProperties.let(BatchArrayPropertiesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e429329971427039d0e843a7a4df3f41683a0f5c699fba7b4c40cbf5a7a6ceaf")
      override
          fun arrayProperties(arrayProperties: BatchArrayPropertiesProperty.Builder.() -> Unit):
          Unit = arrayProperties(BatchArrayPropertiesProperty(arrayProperties))

      override fun jobDefinition(jobDefinition: String) {
        cdkBuilder.jobDefinition(jobDefinition)
      }

      override fun jobName(jobName: String) {
        cdkBuilder.jobName(jobName)
      }

      override fun retryStrategy(retryStrategy: IResolvable) {
        cdkBuilder.retryStrategy(retryStrategy.let(IResolvable::unwrap))
      }

      override fun retryStrategy(retryStrategy: BatchRetryStrategyProperty) {
        cdkBuilder.retryStrategy(retryStrategy.let(BatchRetryStrategyProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e3d0ec99b93e657097bc00083ade70aa50728d7305df6d44525abd733e293a08")
      override fun retryStrategy(retryStrategy: BatchRetryStrategyProperty.Builder.() -> Unit): Unit
          = retryStrategy(BatchRetryStrategyProperty(retryStrategy))

      public fun build(): software.amazon.awscdk.services.events.CfnRule.BatchParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.events.CfnRule.BatchParametersProperty,
    ) : BatchParametersProperty {
      override fun arrayProperties(): Any? = unwrap(this).getArrayProperties()

      override fun jobDefinition(): String = unwrap(this).getJobDefinition()

      override fun jobName(): String = unwrap(this).getJobName()

      override fun retryStrategy(): Any? = unwrap(this).getRetryStrategy()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): BatchParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnRule.BatchParametersProperty):
          BatchParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BatchParametersProperty):
          software.amazon.awscdk.services.events.CfnRule.BatchParametersProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface BatchRetryStrategyProperty {
    public fun attempts(): Number? = unwrap(this).getAttempts()

    public interface Builder {
      public fun attempts(attempts: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.events.CfnRule.BatchRetryStrategyProperty.Builder =
          software.amazon.awscdk.services.events.CfnRule.BatchRetryStrategyProperty.builder()

      override fun attempts(attempts: Number) {
        cdkBuilder.attempts(attempts)
      }

      public fun build(): software.amazon.awscdk.services.events.CfnRule.BatchRetryStrategyProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.events.CfnRule.BatchRetryStrategyProperty,
    ) : BatchRetryStrategyProperty {
      override fun attempts(): Number? = unwrap(this).getAttempts()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): BatchRetryStrategyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnRule.BatchRetryStrategyProperty):
          BatchRetryStrategyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BatchRetryStrategyProperty):
          software.amazon.awscdk.services.events.CfnRule.BatchRetryStrategyProperty = (wrapped as
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
          software.amazon.awscdk.services.events.CfnRule.DeadLetterConfigProperty.Builder =
          software.amazon.awscdk.services.events.CfnRule.DeadLetterConfigProperty.builder()

      override fun arn(arn: String) {
        cdkBuilder.arn(arn)
      }

      public fun build(): software.amazon.awscdk.services.events.CfnRule.DeadLetterConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.events.CfnRule.DeadLetterConfigProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnRule.DeadLetterConfigProperty):
          DeadLetterConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeadLetterConfigProperty):
          software.amazon.awscdk.services.events.CfnRule.DeadLetterConfigProperty = (wrapped as
          Wrapper).cdkObject
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
          software.amazon.awscdk.services.events.CfnRule.SageMakerPipelineParametersProperty.Builder
          =
          software.amazon.awscdk.services.events.CfnRule.SageMakerPipelineParametersProperty.builder()

      override fun pipelineParameterList(pipelineParameterList: IResolvable) {
        cdkBuilder.pipelineParameterList(pipelineParameterList.let(IResolvable::unwrap))
      }

      override fun pipelineParameterList(pipelineParameterList: List<Any>) {
        cdkBuilder.pipelineParameterList(pipelineParameterList)
      }

      public fun build():
          software.amazon.awscdk.services.events.CfnRule.SageMakerPipelineParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.events.CfnRule.SageMakerPipelineParametersProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnRule.SageMakerPipelineParametersProperty):
          SageMakerPipelineParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SageMakerPipelineParametersProperty):
          software.amazon.awscdk.services.events.CfnRule.SageMakerPipelineParametersProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface AppSyncParametersProperty {
    public fun graphQlOperation(): String

    public interface Builder {
      public fun graphQlOperation(graphQlOperation: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.events.CfnRule.AppSyncParametersProperty.Builder =
          software.amazon.awscdk.services.events.CfnRule.AppSyncParametersProperty.builder()

      override fun graphQlOperation(graphQlOperation: String) {
        cdkBuilder.graphQlOperation(graphQlOperation)
      }

      public fun build(): software.amazon.awscdk.services.events.CfnRule.AppSyncParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.events.CfnRule.AppSyncParametersProperty,
    ) : AppSyncParametersProperty {
      override fun graphQlOperation(): String = unwrap(this).getGraphQlOperation()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AppSyncParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnRule.AppSyncParametersProperty):
          AppSyncParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AppSyncParametersProperty):
          software.amazon.awscdk.services.events.CfnRule.AppSyncParametersProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface TargetProperty {
    public fun appSyncParameters(): Any? = unwrap(this).getAppSyncParameters()

    public fun arn(): String

    public fun batchParameters(): Any? = unwrap(this).getBatchParameters()

    public fun deadLetterConfig(): Any? = unwrap(this).getDeadLetterConfig()

    public fun ecsParameters(): Any? = unwrap(this).getEcsParameters()

    public fun httpParameters(): Any? = unwrap(this).getHttpParameters()

    public fun id(): String

    public fun input(): String? = unwrap(this).getInput()

    public fun inputPath(): String? = unwrap(this).getInputPath()

    public fun inputTransformer(): Any? = unwrap(this).getInputTransformer()

    public fun kinesisParameters(): Any? = unwrap(this).getKinesisParameters()

    public fun redshiftDataParameters(): Any? = unwrap(this).getRedshiftDataParameters()

    public fun retryPolicy(): Any? = unwrap(this).getRetryPolicy()

    public fun roleArn(): String? = unwrap(this).getRoleArn()

    public fun runCommandParameters(): Any? = unwrap(this).getRunCommandParameters()

    public fun sageMakerPipelineParameters(): Any? = unwrap(this).getSageMakerPipelineParameters()

    public fun sqsParameters(): Any? = unwrap(this).getSqsParameters()

    public interface Builder {
      public fun appSyncParameters(appSyncParameters: IResolvable)

      public fun appSyncParameters(appSyncParameters: AppSyncParametersProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a43551882193e3fe9df2b4bab16721122ca5a46b2fcc0c003a871cf84ec343db")
      public fun appSyncParameters(appSyncParameters: AppSyncParametersProperty.Builder.() -> Unit)

      public fun arn(arn: String)

      public fun batchParameters(batchParameters: IResolvable)

      public fun batchParameters(batchParameters: BatchParametersProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3982e4b35d00e3d63457bc59d29e4364e0ab5494c552421864ae6649cf21d70f")
      public fun batchParameters(batchParameters: BatchParametersProperty.Builder.() -> Unit)

      public fun deadLetterConfig(deadLetterConfig: IResolvable)

      public fun deadLetterConfig(deadLetterConfig: DeadLetterConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("711efd0854464536e7118fe500415fc3ab9cbbb07630849db5a7925c32e8e8dc")
      public fun deadLetterConfig(deadLetterConfig: DeadLetterConfigProperty.Builder.() -> Unit)

      public fun ecsParameters(ecsParameters: IResolvable)

      public fun ecsParameters(ecsParameters: EcsParametersProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4525cc9e72f77b18206f45d184df4bdf052c78b1042f8102ad34b2daed70656e")
      public fun ecsParameters(ecsParameters: EcsParametersProperty.Builder.() -> Unit)

      public fun httpParameters(httpParameters: IResolvable)

      public fun httpParameters(httpParameters: HttpParametersProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8e07d0b44263bd9d013ec8e2ae8cbf69f639c468e83999b1c5ae07e2797e0ebb")
      public fun httpParameters(httpParameters: HttpParametersProperty.Builder.() -> Unit)

      public fun id(id: String)

      public fun input(input: String)

      public fun inputPath(inputPath: String)

      public fun inputTransformer(inputTransformer: IResolvable)

      public fun inputTransformer(inputTransformer: InputTransformerProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3eed2a6ebb2309a5a6aa88a354335abed39dad9fc30881c01f50e88c5943d649")
      public fun inputTransformer(inputTransformer: InputTransformerProperty.Builder.() -> Unit)

      public fun kinesisParameters(kinesisParameters: IResolvable)

      public fun kinesisParameters(kinesisParameters: KinesisParametersProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d864eb83fe1b255a63e132ec63a47751ecc2fc95eaf9e68687868e0ef7fd4c36")
      public fun kinesisParameters(kinesisParameters: KinesisParametersProperty.Builder.() -> Unit)

      public fun redshiftDataParameters(redshiftDataParameters: IResolvable)

      public fun redshiftDataParameters(redshiftDataParameters: RedshiftDataParametersProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("160f736e012bfbd7124ceaff7dae98a94216aed8f6b29dacc68be19292ed6943")
      public
          fun redshiftDataParameters(redshiftDataParameters: RedshiftDataParametersProperty.Builder.() -> Unit)

      public fun retryPolicy(retryPolicy: IResolvable)

      public fun retryPolicy(retryPolicy: RetryPolicyProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4bca2780f3ad84539d066a093ecc5f07fbe50a541c0d9b592a7224ecf22ece1b")
      public fun retryPolicy(retryPolicy: RetryPolicyProperty.Builder.() -> Unit)

      public fun roleArn(roleArn: String)

      public fun runCommandParameters(runCommandParameters: IResolvable)

      public fun runCommandParameters(runCommandParameters: RunCommandParametersProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f2bc3e927b3e1471cb8fbcbd3d0847bd2c344a95b0dc91715c3640cbc672ffdb")
      public
          fun runCommandParameters(runCommandParameters: RunCommandParametersProperty.Builder.() -> Unit)

      public fun sageMakerPipelineParameters(sageMakerPipelineParameters: IResolvable)

      public
          fun sageMakerPipelineParameters(sageMakerPipelineParameters: SageMakerPipelineParametersProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e773de01415c981b518d93ff1e6f4f97e74194e27b2fd49706d15475ea83362e")
      public
          fun sageMakerPipelineParameters(sageMakerPipelineParameters: SageMakerPipelineParametersProperty.Builder.() -> Unit)

      public fun sqsParameters(sqsParameters: IResolvable)

      public fun sqsParameters(sqsParameters: SqsParametersProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f10ce2650743bd28f69946a61fa34c1016da897addf1454ed0ab2b78ded9b8c6")
      public fun sqsParameters(sqsParameters: SqsParametersProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.events.CfnRule.TargetProperty.Builder
          = software.amazon.awscdk.services.events.CfnRule.TargetProperty.builder()

      override fun appSyncParameters(appSyncParameters: IResolvable) {
        cdkBuilder.appSyncParameters(appSyncParameters.let(IResolvable::unwrap))
      }

      override fun appSyncParameters(appSyncParameters: AppSyncParametersProperty) {
        cdkBuilder.appSyncParameters(appSyncParameters.let(AppSyncParametersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a43551882193e3fe9df2b4bab16721122ca5a46b2fcc0c003a871cf84ec343db")
      override
          fun appSyncParameters(appSyncParameters: AppSyncParametersProperty.Builder.() -> Unit):
          Unit = appSyncParameters(AppSyncParametersProperty(appSyncParameters))

      override fun arn(arn: String) {
        cdkBuilder.arn(arn)
      }

      override fun batchParameters(batchParameters: IResolvable) {
        cdkBuilder.batchParameters(batchParameters.let(IResolvable::unwrap))
      }

      override fun batchParameters(batchParameters: BatchParametersProperty) {
        cdkBuilder.batchParameters(batchParameters.let(BatchParametersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3982e4b35d00e3d63457bc59d29e4364e0ab5494c552421864ae6649cf21d70f")
      override fun batchParameters(batchParameters: BatchParametersProperty.Builder.() -> Unit):
          Unit = batchParameters(BatchParametersProperty(batchParameters))

      override fun deadLetterConfig(deadLetterConfig: IResolvable) {
        cdkBuilder.deadLetterConfig(deadLetterConfig.let(IResolvable::unwrap))
      }

      override fun deadLetterConfig(deadLetterConfig: DeadLetterConfigProperty) {
        cdkBuilder.deadLetterConfig(deadLetterConfig.let(DeadLetterConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("711efd0854464536e7118fe500415fc3ab9cbbb07630849db5a7925c32e8e8dc")
      override fun deadLetterConfig(deadLetterConfig: DeadLetterConfigProperty.Builder.() -> Unit):
          Unit = deadLetterConfig(DeadLetterConfigProperty(deadLetterConfig))

      override fun ecsParameters(ecsParameters: IResolvable) {
        cdkBuilder.ecsParameters(ecsParameters.let(IResolvable::unwrap))
      }

      override fun ecsParameters(ecsParameters: EcsParametersProperty) {
        cdkBuilder.ecsParameters(ecsParameters.let(EcsParametersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4525cc9e72f77b18206f45d184df4bdf052c78b1042f8102ad34b2daed70656e")
      override fun ecsParameters(ecsParameters: EcsParametersProperty.Builder.() -> Unit): Unit =
          ecsParameters(EcsParametersProperty(ecsParameters))

      override fun httpParameters(httpParameters: IResolvable) {
        cdkBuilder.httpParameters(httpParameters.let(IResolvable::unwrap))
      }

      override fun httpParameters(httpParameters: HttpParametersProperty) {
        cdkBuilder.httpParameters(httpParameters.let(HttpParametersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8e07d0b44263bd9d013ec8e2ae8cbf69f639c468e83999b1c5ae07e2797e0ebb")
      override fun httpParameters(httpParameters: HttpParametersProperty.Builder.() -> Unit): Unit =
          httpParameters(HttpParametersProperty(httpParameters))

      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      override fun input(input: String) {
        cdkBuilder.input(input)
      }

      override fun inputPath(inputPath: String) {
        cdkBuilder.inputPath(inputPath)
      }

      override fun inputTransformer(inputTransformer: IResolvable) {
        cdkBuilder.inputTransformer(inputTransformer.let(IResolvable::unwrap))
      }

      override fun inputTransformer(inputTransformer: InputTransformerProperty) {
        cdkBuilder.inputTransformer(inputTransformer.let(InputTransformerProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3eed2a6ebb2309a5a6aa88a354335abed39dad9fc30881c01f50e88c5943d649")
      override fun inputTransformer(inputTransformer: InputTransformerProperty.Builder.() -> Unit):
          Unit = inputTransformer(InputTransformerProperty(inputTransformer))

      override fun kinesisParameters(kinesisParameters: IResolvable) {
        cdkBuilder.kinesisParameters(kinesisParameters.let(IResolvable::unwrap))
      }

      override fun kinesisParameters(kinesisParameters: KinesisParametersProperty) {
        cdkBuilder.kinesisParameters(kinesisParameters.let(KinesisParametersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d864eb83fe1b255a63e132ec63a47751ecc2fc95eaf9e68687868e0ef7fd4c36")
      override
          fun kinesisParameters(kinesisParameters: KinesisParametersProperty.Builder.() -> Unit):
          Unit = kinesisParameters(KinesisParametersProperty(kinesisParameters))

      override fun redshiftDataParameters(redshiftDataParameters: IResolvable) {
        cdkBuilder.redshiftDataParameters(redshiftDataParameters.let(IResolvable::unwrap))
      }

      override fun redshiftDataParameters(redshiftDataParameters: RedshiftDataParametersProperty) {
        cdkBuilder.redshiftDataParameters(redshiftDataParameters.let(RedshiftDataParametersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("160f736e012bfbd7124ceaff7dae98a94216aed8f6b29dacc68be19292ed6943")
      override
          fun redshiftDataParameters(redshiftDataParameters: RedshiftDataParametersProperty.Builder.() -> Unit):
          Unit = redshiftDataParameters(RedshiftDataParametersProperty(redshiftDataParameters))

      override fun retryPolicy(retryPolicy: IResolvable) {
        cdkBuilder.retryPolicy(retryPolicy.let(IResolvable::unwrap))
      }

      override fun retryPolicy(retryPolicy: RetryPolicyProperty) {
        cdkBuilder.retryPolicy(retryPolicy.let(RetryPolicyProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4bca2780f3ad84539d066a093ecc5f07fbe50a541c0d9b592a7224ecf22ece1b")
      override fun retryPolicy(retryPolicy: RetryPolicyProperty.Builder.() -> Unit): Unit =
          retryPolicy(RetryPolicyProperty(retryPolicy))

      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      override fun runCommandParameters(runCommandParameters: IResolvable) {
        cdkBuilder.runCommandParameters(runCommandParameters.let(IResolvable::unwrap))
      }

      override fun runCommandParameters(runCommandParameters: RunCommandParametersProperty) {
        cdkBuilder.runCommandParameters(runCommandParameters.let(RunCommandParametersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f2bc3e927b3e1471cb8fbcbd3d0847bd2c344a95b0dc91715c3640cbc672ffdb")
      override
          fun runCommandParameters(runCommandParameters: RunCommandParametersProperty.Builder.() -> Unit):
          Unit = runCommandParameters(RunCommandParametersProperty(runCommandParameters))

      override fun sageMakerPipelineParameters(sageMakerPipelineParameters: IResolvable) {
        cdkBuilder.sageMakerPipelineParameters(sageMakerPipelineParameters.let(IResolvable::unwrap))
      }

      override
          fun sageMakerPipelineParameters(sageMakerPipelineParameters: SageMakerPipelineParametersProperty) {
        cdkBuilder.sageMakerPipelineParameters(sageMakerPipelineParameters.let(SageMakerPipelineParametersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e773de01415c981b518d93ff1e6f4f97e74194e27b2fd49706d15475ea83362e")
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
      @JvmName("f10ce2650743bd28f69946a61fa34c1016da897addf1454ed0ab2b78ded9b8c6")
      override fun sqsParameters(sqsParameters: SqsParametersProperty.Builder.() -> Unit): Unit =
          sqsParameters(SqsParametersProperty(sqsParameters))

      public fun build(): software.amazon.awscdk.services.events.CfnRule.TargetProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.events.CfnRule.TargetProperty,
    ) : TargetProperty {
      override fun appSyncParameters(): Any? = unwrap(this).getAppSyncParameters()

      override fun arn(): String = unwrap(this).getArn()

      override fun batchParameters(): Any? = unwrap(this).getBatchParameters()

      override fun deadLetterConfig(): Any? = unwrap(this).getDeadLetterConfig()

      override fun ecsParameters(): Any? = unwrap(this).getEcsParameters()

      override fun httpParameters(): Any? = unwrap(this).getHttpParameters()

      override fun id(): String = unwrap(this).getId()

      override fun input(): String? = unwrap(this).getInput()

      override fun inputPath(): String? = unwrap(this).getInputPath()

      override fun inputTransformer(): Any? = unwrap(this).getInputTransformer()

      override fun kinesisParameters(): Any? = unwrap(this).getKinesisParameters()

      override fun redshiftDataParameters(): Any? = unwrap(this).getRedshiftDataParameters()

      override fun retryPolicy(): Any? = unwrap(this).getRetryPolicy()

      override fun roleArn(): String? = unwrap(this).getRoleArn()

      override fun runCommandParameters(): Any? = unwrap(this).getRunCommandParameters()

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

      internal fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnRule.TargetProperty):
          TargetProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TargetProperty):
          software.amazon.awscdk.services.events.CfnRule.TargetProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface BatchArrayPropertiesProperty {
    public fun size(): Number? = unwrap(this).getSize()

    public interface Builder {
      public fun size(size: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.events.CfnRule.BatchArrayPropertiesProperty.Builder =
          software.amazon.awscdk.services.events.CfnRule.BatchArrayPropertiesProperty.builder()

      override fun size(size: Number) {
        cdkBuilder.size(size)
      }

      public fun build():
          software.amazon.awscdk.services.events.CfnRule.BatchArrayPropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.events.CfnRule.BatchArrayPropertiesProperty,
    ) : BatchArrayPropertiesProperty {
      override fun size(): Number? = unwrap(this).getSize()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): BatchArrayPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnRule.BatchArrayPropertiesProperty):
          BatchArrayPropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BatchArrayPropertiesProperty):
          software.amazon.awscdk.services.events.CfnRule.BatchArrayPropertiesProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface RunCommandParametersProperty {
    public fun runCommandTargets(): Any

    public interface Builder {
      public fun runCommandTargets(runCommandTargets: IResolvable)

      public fun runCommandTargets(runCommandTargets: List<Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.events.CfnRule.RunCommandParametersProperty.Builder =
          software.amazon.awscdk.services.events.CfnRule.RunCommandParametersProperty.builder()

      override fun runCommandTargets(runCommandTargets: IResolvable) {
        cdkBuilder.runCommandTargets(runCommandTargets.let(IResolvable::unwrap))
      }

      override fun runCommandTargets(runCommandTargets: List<Any>) {
        cdkBuilder.runCommandTargets(runCommandTargets)
      }

      public fun build():
          software.amazon.awscdk.services.events.CfnRule.RunCommandParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.events.CfnRule.RunCommandParametersProperty,
    ) : RunCommandParametersProperty {
      override fun runCommandTargets(): Any = unwrap(this).getRunCommandTargets()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RunCommandParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnRule.RunCommandParametersProperty):
          RunCommandParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RunCommandParametersProperty):
          software.amazon.awscdk.services.events.CfnRule.RunCommandParametersProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface HttpParametersProperty {
    public fun headerParameters(): Any? = unwrap(this).getHeaderParameters()

    public fun pathParameterValues(): List<String> = unwrap(this).getPathParameterValues() ?:
        emptyList()

    public fun queryStringParameters(): Any? = unwrap(this).getQueryStringParameters()

    public interface Builder {
      public fun headerParameters(headerParameters: IResolvable)

      public fun headerParameters(headerParameters: Map<String, String>)

      public fun pathParameterValues(pathParameterValues: List<String>)

      public fun queryStringParameters(queryStringParameters: IResolvable)

      public fun queryStringParameters(queryStringParameters: Map<String, String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.events.CfnRule.HttpParametersProperty.Builder =
          software.amazon.awscdk.services.events.CfnRule.HttpParametersProperty.builder()

      override fun headerParameters(headerParameters: IResolvable) {
        cdkBuilder.headerParameters(headerParameters.let(IResolvable::unwrap))
      }

      override fun headerParameters(headerParameters: Map<String, String>) {
        cdkBuilder.headerParameters(headerParameters)
      }

      override fun pathParameterValues(pathParameterValues: List<String>) {
        cdkBuilder.pathParameterValues(pathParameterValues)
      }

      override fun queryStringParameters(queryStringParameters: IResolvable) {
        cdkBuilder.queryStringParameters(queryStringParameters.let(IResolvable::unwrap))
      }

      override fun queryStringParameters(queryStringParameters: Map<String, String>) {
        cdkBuilder.queryStringParameters(queryStringParameters)
      }

      public fun build(): software.amazon.awscdk.services.events.CfnRule.HttpParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.events.CfnRule.HttpParametersProperty,
    ) : HttpParametersProperty {
      override fun headerParameters(): Any? = unwrap(this).getHeaderParameters()

      override fun pathParameterValues(): List<String> = unwrap(this).getPathParameterValues() ?:
          emptyList()

      override fun queryStringParameters(): Any? = unwrap(this).getQueryStringParameters()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): HttpParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnRule.HttpParametersProperty):
          HttpParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HttpParametersProperty):
          software.amazon.awscdk.services.events.CfnRule.HttpParametersProperty = (wrapped as
          Wrapper).cdkObject
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
          software.amazon.awscdk.services.events.CfnRule.SageMakerPipelineParameterProperty.Builder
          =
          software.amazon.awscdk.services.events.CfnRule.SageMakerPipelineParameterProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.events.CfnRule.SageMakerPipelineParameterProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.events.CfnRule.SageMakerPipelineParameterProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnRule.SageMakerPipelineParameterProperty):
          SageMakerPipelineParameterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SageMakerPipelineParameterProperty):
          software.amazon.awscdk.services.events.CfnRule.SageMakerPipelineParameterProperty =
          (wrapped as Wrapper).cdkObject
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
          software.amazon.awscdk.services.events.CfnRule.CapacityProviderStrategyItemProperty.Builder
          =
          software.amazon.awscdk.services.events.CfnRule.CapacityProviderStrategyItemProperty.builder()

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
          software.amazon.awscdk.services.events.CfnRule.CapacityProviderStrategyItemProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.events.CfnRule.CapacityProviderStrategyItemProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnRule.CapacityProviderStrategyItemProperty):
          CapacityProviderStrategyItemProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CapacityProviderStrategyItemProperty):
          software.amazon.awscdk.services.events.CfnRule.CapacityProviderStrategyItemProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface NetworkConfigurationProperty {
    public fun awsVpcConfiguration(): Any? = unwrap(this).getAwsVpcConfiguration()

    public interface Builder {
      public fun awsVpcConfiguration(awsVpcConfiguration: IResolvable)

      public fun awsVpcConfiguration(awsVpcConfiguration: AwsVpcConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c6ea4a14f17bc1f53e0aaaea09129ec4ebd9943a3b87f85d40a3b0797c144160")
      public
          fun awsVpcConfiguration(awsVpcConfiguration: AwsVpcConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.events.CfnRule.NetworkConfigurationProperty.Builder =
          software.amazon.awscdk.services.events.CfnRule.NetworkConfigurationProperty.builder()

      override fun awsVpcConfiguration(awsVpcConfiguration: IResolvable) {
        cdkBuilder.awsVpcConfiguration(awsVpcConfiguration.let(IResolvable::unwrap))
      }

      override fun awsVpcConfiguration(awsVpcConfiguration: AwsVpcConfigurationProperty) {
        cdkBuilder.awsVpcConfiguration(awsVpcConfiguration.let(AwsVpcConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c6ea4a14f17bc1f53e0aaaea09129ec4ebd9943a3b87f85d40a3b0797c144160")
      override
          fun awsVpcConfiguration(awsVpcConfiguration: AwsVpcConfigurationProperty.Builder.() -> Unit):
          Unit = awsVpcConfiguration(AwsVpcConfigurationProperty(awsVpcConfiguration))

      public fun build():
          software.amazon.awscdk.services.events.CfnRule.NetworkConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.events.CfnRule.NetworkConfigurationProperty,
    ) : NetworkConfigurationProperty {
      override fun awsVpcConfiguration(): Any? = unwrap(this).getAwsVpcConfiguration()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): NetworkConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnRule.NetworkConfigurationProperty):
          NetworkConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NetworkConfigurationProperty):
          software.amazon.awscdk.services.events.CfnRule.NetworkConfigurationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
