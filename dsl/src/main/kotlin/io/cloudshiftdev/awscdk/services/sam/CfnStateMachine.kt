package io.cloudshiftdev.awscdk.services.sam

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
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

public open class CfnStateMachine internal constructor(
  private val cdkObject: software.amazon.awscdk.services.sam.CfnStateMachine,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun definition(): Any? = unwrap(this).getDefinition()

  public open fun definition(`value`: Any) {
    unwrap(this).setDefinition(`value`)
  }

  public open fun definitionSubstitutions(): Any? = unwrap(this).getDefinitionSubstitutions()

  public open fun definitionSubstitutions(`value`: IResolvable) {
    unwrap(this).setDefinitionSubstitutions(`value`.let(IResolvable::unwrap))
  }

  public open fun definitionSubstitutions(`value`: Map<String, String>) {
    unwrap(this).setDefinitionSubstitutions(`value`)
  }

  public open fun definitionUri(): Any? = unwrap(this).getDefinitionUri()

  public open fun definitionUri(`value`: String) {
    unwrap(this).setDefinitionUri(`value`)
  }

  public open fun definitionUri(`value`: IResolvable) {
    unwrap(this).setDefinitionUri(`value`.let(IResolvable::unwrap))
  }

  public open fun definitionUri(`value`: S3LocationProperty) {
    unwrap(this).setDefinitionUri(`value`.let(S3LocationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("538bd1f27a856560c52c1fbdaa13b864fa5cf2ba25fcc07acdde72a24e402ab7")
  public open fun definitionUri(`value`: S3LocationProperty.Builder.() -> Unit): Unit =
      definitionUri(S3LocationProperty(`value`))

  public open fun events(): Any? = unwrap(this).getEvents()

  public open fun events(`value`: IResolvable) {
    unwrap(this).setEvents(`value`.let(IResolvable::unwrap))
  }

  public open fun events(__item_ac66f0: Map<String, Any>) {
    unwrap(this).setEvents(__item_ac66f0)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun logging(): Any? = unwrap(this).getLogging()

  public open fun logging(`value`: IResolvable) {
    unwrap(this).setLogging(`value`.let(IResolvable::unwrap))
  }

  public open fun logging(`value`: LoggingConfigurationProperty) {
    unwrap(this).setLogging(`value`.let(LoggingConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6cfa7123f6f45b2b9c3b05526b981ee87ee46e72617926629f517218c5d4eee0")
  public open fun logging(`value`: LoggingConfigurationProperty.Builder.() -> Unit): Unit =
      logging(LoggingConfigurationProperty(`value`))

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun permissionsBoundaries(): String? = unwrap(this).getPermissionsBoundaries()

  public open fun permissionsBoundaries(`value`: String) {
    unwrap(this).setPermissionsBoundaries(`value`)
  }

  public open fun policies(): Any? = unwrap(this).getPolicies()

  public open fun policies(`value`: String) {
    unwrap(this).setPolicies(`value`)
  }

  public open fun policies(`value`: IResolvable) {
    unwrap(this).setPolicies(`value`.let(IResolvable::unwrap))
  }

  public open fun policies(`value`: IAMPolicyDocumentProperty) {
    unwrap(this).setPolicies(`value`.let(IAMPolicyDocumentProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("76f676d0bff7ed7d4243d3eac6f0acd2f16f3ec7baf817a8e3fefd2b34d33e28")
  public open fun policies(`value`: IAMPolicyDocumentProperty.Builder.() -> Unit): Unit =
      policies(IAMPolicyDocumentProperty(`value`))

  public open fun policies(__idx_ac66f0: List<Any>) {
    unwrap(this).setPolicies(__idx_ac66f0)
  }

  public open fun policies(vararg __idx_ac66f0: Any): Unit = policies(__idx_ac66f0.toList())

  public open fun role(): String? = unwrap(this).getRole()

  public open fun role(`value`: String) {
    unwrap(this).setRole(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  public open fun tracing(): Any? = unwrap(this).getTracing()

  public open fun tracing(`value`: IResolvable) {
    unwrap(this).setTracing(`value`.let(IResolvable::unwrap))
  }

  public open fun tracing(`value`: TracingConfigurationProperty) {
    unwrap(this).setTracing(`value`.let(TracingConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fbd220bcedb06d13533ca9c9893e7967cd89030e550aae3263876c8a5b428bd4")
  public open fun tracing(`value`: TracingConfigurationProperty.Builder.() -> Unit): Unit =
      tracing(TracingConfigurationProperty(`value`))

  public open fun type(): String? = unwrap(this).getType()

  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  public interface Builder {
    public fun definition(definition: Any)

    public fun definitionSubstitutions(definitionSubstitutions: IResolvable)

    public fun definitionSubstitutions(definitionSubstitutions: Map<String, String>)

    public fun definitionUri(definitionUri: String)

    public fun definitionUri(definitionUri: IResolvable)

    public fun definitionUri(definitionUri: S3LocationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8a532502e4fbc84645af1b420bb905f7f1873c88666cee86d3dad2e72ac85afd")
    public fun definitionUri(definitionUri: S3LocationProperty.Builder.() -> Unit)

    public fun events(events: IResolvable)

    public fun events(events: Map<String, Any>)

    public fun logging(logging: IResolvable)

    public fun logging(logging: LoggingConfigurationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c7719052ff5353e0deff2c165a4afac2a81f5377b9e7fc7f42422d2dc1237f85")
    public fun logging(logging: LoggingConfigurationProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun permissionsBoundaries(permissionsBoundaries: String)

    public fun policies(policies: String)

    public fun policies(policies: IResolvable)

    public fun policies(policies: IAMPolicyDocumentProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("04350778c69af704c65a0ea592c6db8970b0ce1dcd87467c70834cb71f4fb556")
    public fun policies(policies: IAMPolicyDocumentProperty.Builder.() -> Unit)

    public fun policies(policies: List<Any>)

    public fun policies(vararg policies: Any)

    public fun role(role: String)

    public fun tags(tags: Map<String, String>)

    public fun tracing(tracing: IResolvable)

    public fun tracing(tracing: TracingConfigurationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fc51d5fd3e985f3caac005295a64817537cb98ccf25459eb8a7d555b77af6cd7")
    public fun tracing(tracing: TracingConfigurationProperty.Builder.() -> Unit)

    public fun type(type: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sam.CfnStateMachine.Builder =
        software.amazon.awscdk.services.sam.CfnStateMachine.Builder.create(scope, id)

    override fun definition(definition: Any) {
      cdkBuilder.definition(definition)
    }

    override fun definitionSubstitutions(definitionSubstitutions: IResolvable) {
      cdkBuilder.definitionSubstitutions(definitionSubstitutions.let(IResolvable::unwrap))
    }

    override fun definitionSubstitutions(definitionSubstitutions: Map<String, String>) {
      cdkBuilder.definitionSubstitutions(definitionSubstitutions)
    }

    override fun definitionUri(definitionUri: String) {
      cdkBuilder.definitionUri(definitionUri)
    }

    override fun definitionUri(definitionUri: IResolvable) {
      cdkBuilder.definitionUri(definitionUri.let(IResolvable::unwrap))
    }

    override fun definitionUri(definitionUri: S3LocationProperty) {
      cdkBuilder.definitionUri(definitionUri.let(S3LocationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8a532502e4fbc84645af1b420bb905f7f1873c88666cee86d3dad2e72ac85afd")
    override fun definitionUri(definitionUri: S3LocationProperty.Builder.() -> Unit): Unit =
        definitionUri(S3LocationProperty(definitionUri))

    override fun events(events: IResolvable) {
      cdkBuilder.events(events.let(IResolvable::unwrap))
    }

    override fun events(events: Map<String, Any>) {
      cdkBuilder.events(events)
    }

    override fun logging(logging: IResolvable) {
      cdkBuilder.logging(logging.let(IResolvable::unwrap))
    }

    override fun logging(logging: LoggingConfigurationProperty) {
      cdkBuilder.logging(logging.let(LoggingConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c7719052ff5353e0deff2c165a4afac2a81f5377b9e7fc7f42422d2dc1237f85")
    override fun logging(logging: LoggingConfigurationProperty.Builder.() -> Unit): Unit =
        logging(LoggingConfigurationProperty(logging))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun permissionsBoundaries(permissionsBoundaries: String) {
      cdkBuilder.permissionsBoundaries(permissionsBoundaries)
    }

    override fun policies(policies: String) {
      cdkBuilder.policies(policies)
    }

    override fun policies(policies: IResolvable) {
      cdkBuilder.policies(policies.let(IResolvable::unwrap))
    }

    override fun policies(policies: IAMPolicyDocumentProperty) {
      cdkBuilder.policies(policies.let(IAMPolicyDocumentProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("04350778c69af704c65a0ea592c6db8970b0ce1dcd87467c70834cb71f4fb556")
    override fun policies(policies: IAMPolicyDocumentProperty.Builder.() -> Unit): Unit =
        policies(IAMPolicyDocumentProperty(policies))

    override fun policies(policies: List<Any>) {
      cdkBuilder.policies(policies)
    }

    override fun policies(vararg policies: Any): Unit = policies(policies.toList())

    override fun role(role: String) {
      cdkBuilder.role(role)
    }

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    override fun tracing(tracing: IResolvable) {
      cdkBuilder.tracing(tracing.let(IResolvable::unwrap))
    }

    override fun tracing(tracing: TracingConfigurationProperty) {
      cdkBuilder.tracing(tracing.let(TracingConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fc51d5fd3e985f3caac005295a64817537cb98ccf25459eb8a7d555b77af6cd7")
    override fun tracing(tracing: TracingConfigurationProperty.Builder.() -> Unit): Unit =
        tracing(TracingConfigurationProperty(tracing))

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.sam.CfnStateMachine = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnStateMachine {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnStateMachine(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnStateMachine):
        CfnStateMachine = CfnStateMachine(cdkObject)

    internal fun unwrap(wrapped: CfnStateMachine):
        software.amazon.awscdk.services.sam.CfnStateMachine = wrapped.cdkObject
  }

  public interface StateMachineSAMPTProperty {
    public fun stateMachineName(): String

    public interface Builder {
      public fun stateMachineName(stateMachineName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnStateMachine.StateMachineSAMPTProperty.Builder =
          software.amazon.awscdk.services.sam.CfnStateMachine.StateMachineSAMPTProperty.builder()

      override fun stateMachineName(stateMachineName: String) {
        cdkBuilder.stateMachineName(stateMachineName)
      }

      public fun build():
          software.amazon.awscdk.services.sam.CfnStateMachine.StateMachineSAMPTProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sam.CfnStateMachine.StateMachineSAMPTProperty,
    ) : StateMachineSAMPTProperty {
      override fun stateMachineName(): String = unwrap(this).getStateMachineName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): StateMachineSAMPTProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnStateMachine.StateMachineSAMPTProperty):
          StateMachineSAMPTProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StateMachineSAMPTProperty):
          software.amazon.awscdk.services.sam.CfnStateMachine.StateMachineSAMPTProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface EventBridgeRuleEventProperty {
    public fun eventBusName(): String? = unwrap(this).getEventBusName()

    public fun input(): String? = unwrap(this).getInput()

    public fun inputPath(): String? = unwrap(this).getInputPath()

    public fun pattern(): Any

    public interface Builder {
      public fun eventBusName(eventBusName: String)

      public fun input(input: String)

      public fun inputPath(inputPath: String)

      public fun pattern(pattern: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnStateMachine.EventBridgeRuleEventProperty.Builder =
          software.amazon.awscdk.services.sam.CfnStateMachine.EventBridgeRuleEventProperty.builder()

      override fun eventBusName(eventBusName: String) {
        cdkBuilder.eventBusName(eventBusName)
      }

      override fun input(input: String) {
        cdkBuilder.input(input)
      }

      override fun inputPath(inputPath: String) {
        cdkBuilder.inputPath(inputPath)
      }

      override fun pattern(pattern: Any) {
        cdkBuilder.pattern(pattern)
      }

      public fun build():
          software.amazon.awscdk.services.sam.CfnStateMachine.EventBridgeRuleEventProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sam.CfnStateMachine.EventBridgeRuleEventProperty,
    ) : EventBridgeRuleEventProperty {
      override fun eventBusName(): String? = unwrap(this).getEventBusName()

      override fun input(): String? = unwrap(this).getInput()

      override fun inputPath(): String? = unwrap(this).getInputPath()

      override fun pattern(): Any = unwrap(this).getPattern()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EventBridgeRuleEventProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnStateMachine.EventBridgeRuleEventProperty):
          EventBridgeRuleEventProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EventBridgeRuleEventProperty):
          software.amazon.awscdk.services.sam.CfnStateMachine.EventBridgeRuleEventProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface CloudWatchEventEventProperty {
    public fun eventBusName(): String? = unwrap(this).getEventBusName()

    public fun input(): String? = unwrap(this).getInput()

    public fun inputPath(): String? = unwrap(this).getInputPath()

    public fun pattern(): Any

    public interface Builder {
      public fun eventBusName(eventBusName: String)

      public fun input(input: String)

      public fun inputPath(inputPath: String)

      public fun pattern(pattern: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnStateMachine.CloudWatchEventEventProperty.Builder =
          software.amazon.awscdk.services.sam.CfnStateMachine.CloudWatchEventEventProperty.builder()

      override fun eventBusName(eventBusName: String) {
        cdkBuilder.eventBusName(eventBusName)
      }

      override fun input(input: String) {
        cdkBuilder.input(input)
      }

      override fun inputPath(inputPath: String) {
        cdkBuilder.inputPath(inputPath)
      }

      override fun pattern(pattern: Any) {
        cdkBuilder.pattern(pattern)
      }

      public fun build():
          software.amazon.awscdk.services.sam.CfnStateMachine.CloudWatchEventEventProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sam.CfnStateMachine.CloudWatchEventEventProperty,
    ) : CloudWatchEventEventProperty {
      override fun eventBusName(): String? = unwrap(this).getEventBusName()

      override fun input(): String? = unwrap(this).getInput()

      override fun inputPath(): String? = unwrap(this).getInputPath()

      override fun pattern(): Any = unwrap(this).getPattern()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CloudWatchEventEventProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnStateMachine.CloudWatchEventEventProperty):
          CloudWatchEventEventProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CloudWatchEventEventProperty):
          software.amazon.awscdk.services.sam.CfnStateMachine.CloudWatchEventEventProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface LoggingConfigurationProperty {
    public fun destinations(): Any

    public fun includeExecutionData(): Any

    public fun level(): String

    public interface Builder {
      public fun destinations(destinations: IResolvable)

      public fun destinations(destinations: List<Any>)

      public fun destinations(vararg destinations: Any)

      public fun includeExecutionData(includeExecutionData: Boolean)

      public fun includeExecutionData(includeExecutionData: IResolvable)

      public fun level(level: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnStateMachine.LoggingConfigurationProperty.Builder =
          software.amazon.awscdk.services.sam.CfnStateMachine.LoggingConfigurationProperty.builder()

      override fun destinations(destinations: IResolvable) {
        cdkBuilder.destinations(destinations.let(IResolvable::unwrap))
      }

      override fun destinations(destinations: List<Any>) {
        cdkBuilder.destinations(destinations)
      }

      override fun destinations(vararg destinations: Any): Unit =
          destinations(destinations.toList())

      override fun includeExecutionData(includeExecutionData: Boolean) {
        cdkBuilder.includeExecutionData(includeExecutionData)
      }

      override fun includeExecutionData(includeExecutionData: IResolvable) {
        cdkBuilder.includeExecutionData(includeExecutionData.let(IResolvable::unwrap))
      }

      override fun level(level: String) {
        cdkBuilder.level(level)
      }

      public fun build():
          software.amazon.awscdk.services.sam.CfnStateMachine.LoggingConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sam.CfnStateMachine.LoggingConfigurationProperty,
    ) : LoggingConfigurationProperty {
      override fun destinations(): Any = unwrap(this).getDestinations()

      override fun includeExecutionData(): Any = unwrap(this).getIncludeExecutionData()

      override fun level(): String = unwrap(this).getLevel()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LoggingConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnStateMachine.LoggingConfigurationProperty):
          LoggingConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoggingConfigurationProperty):
          software.amazon.awscdk.services.sam.CfnStateMachine.LoggingConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface S3LocationProperty {
    public fun bucket(): String

    public fun key(): String

    public fun version(): Number? = unwrap(this).getVersion()

    public interface Builder {
      public fun bucket(bucket: String)

      public fun key(key: String)

      public fun version(version: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnStateMachine.S3LocationProperty.Builder =
          software.amazon.awscdk.services.sam.CfnStateMachine.S3LocationProperty.builder()

      override fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
      }

      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      override fun version(version: Number) {
        cdkBuilder.version(version)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnStateMachine.S3LocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sam.CfnStateMachine.S3LocationProperty,
    ) : S3LocationProperty {
      override fun bucket(): String = unwrap(this).getBucket()

      override fun key(): String = unwrap(this).getKey()

      override fun version(): Number? = unwrap(this).getVersion()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): S3LocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnStateMachine.S3LocationProperty):
          S3LocationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3LocationProperty):
          software.amazon.awscdk.services.sam.CfnStateMachine.S3LocationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface LogDestinationProperty {
    public fun cloudWatchLogsLogGroup(): Any

    public interface Builder {
      public fun cloudWatchLogsLogGroup(cloudWatchLogsLogGroup: IResolvable)

      public fun cloudWatchLogsLogGroup(cloudWatchLogsLogGroup: CloudWatchLogsLogGroupProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0ac7753aad5c0b8baf4a728c093bbd62ef4d34db391fc69a6b081de72c8a4f85")
      public
          fun cloudWatchLogsLogGroup(cloudWatchLogsLogGroup: CloudWatchLogsLogGroupProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnStateMachine.LogDestinationProperty.Builder =
          software.amazon.awscdk.services.sam.CfnStateMachine.LogDestinationProperty.builder()

      override fun cloudWatchLogsLogGroup(cloudWatchLogsLogGroup: IResolvable) {
        cdkBuilder.cloudWatchLogsLogGroup(cloudWatchLogsLogGroup.let(IResolvable::unwrap))
      }

      override fun cloudWatchLogsLogGroup(cloudWatchLogsLogGroup: CloudWatchLogsLogGroupProperty) {
        cdkBuilder.cloudWatchLogsLogGroup(cloudWatchLogsLogGroup.let(CloudWatchLogsLogGroupProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0ac7753aad5c0b8baf4a728c093bbd62ef4d34db391fc69a6b081de72c8a4f85")
      override
          fun cloudWatchLogsLogGroup(cloudWatchLogsLogGroup: CloudWatchLogsLogGroupProperty.Builder.() -> Unit):
          Unit = cloudWatchLogsLogGroup(CloudWatchLogsLogGroupProperty(cloudWatchLogsLogGroup))

      public fun build(): software.amazon.awscdk.services.sam.CfnStateMachine.LogDestinationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sam.CfnStateMachine.LogDestinationProperty,
    ) : LogDestinationProperty {
      override fun cloudWatchLogsLogGroup(): Any = unwrap(this).getCloudWatchLogsLogGroup()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LogDestinationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnStateMachine.LogDestinationProperty):
          LogDestinationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LogDestinationProperty):
          software.amazon.awscdk.services.sam.CfnStateMachine.LogDestinationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface FunctionSAMPTProperty {
    public fun functionName(): String

    public interface Builder {
      public fun functionName(functionName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnStateMachine.FunctionSAMPTProperty.Builder =
          software.amazon.awscdk.services.sam.CfnStateMachine.FunctionSAMPTProperty.builder()

      override fun functionName(functionName: String) {
        cdkBuilder.functionName(functionName)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnStateMachine.FunctionSAMPTProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sam.CfnStateMachine.FunctionSAMPTProperty,
    ) : FunctionSAMPTProperty {
      override fun functionName(): String = unwrap(this).getFunctionName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FunctionSAMPTProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnStateMachine.FunctionSAMPTProperty):
          FunctionSAMPTProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FunctionSAMPTProperty):
          software.amazon.awscdk.services.sam.CfnStateMachine.FunctionSAMPTProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SAMPolicyTemplateProperty {
    public fun lambdaInvokePolicy(): Any? = unwrap(this).getLambdaInvokePolicy()

    public fun stepFunctionsExecutionPolicy(): Any? = unwrap(this).getStepFunctionsExecutionPolicy()

    public interface Builder {
      public fun lambdaInvokePolicy(lambdaInvokePolicy: IResolvable)

      public fun lambdaInvokePolicy(lambdaInvokePolicy: FunctionSAMPTProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4f529e6ecbe7d5aeaaa28c4384f2b4b9f68b2a390c9fd1df10d5e7254aaa7c4e")
      public fun lambdaInvokePolicy(lambdaInvokePolicy: FunctionSAMPTProperty.Builder.() -> Unit)

      public fun stepFunctionsExecutionPolicy(stepFunctionsExecutionPolicy: IResolvable)

      public
          fun stepFunctionsExecutionPolicy(stepFunctionsExecutionPolicy: StateMachineSAMPTProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("55aab9b20aeefe7e5d5552a6e39b132f58bd2eabc422d596e90a12a5cef6acd6")
      public
          fun stepFunctionsExecutionPolicy(stepFunctionsExecutionPolicy: StateMachineSAMPTProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnStateMachine.SAMPolicyTemplateProperty.Builder =
          software.amazon.awscdk.services.sam.CfnStateMachine.SAMPolicyTemplateProperty.builder()

      override fun lambdaInvokePolicy(lambdaInvokePolicy: IResolvable) {
        cdkBuilder.lambdaInvokePolicy(lambdaInvokePolicy.let(IResolvable::unwrap))
      }

      override fun lambdaInvokePolicy(lambdaInvokePolicy: FunctionSAMPTProperty) {
        cdkBuilder.lambdaInvokePolicy(lambdaInvokePolicy.let(FunctionSAMPTProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4f529e6ecbe7d5aeaaa28c4384f2b4b9f68b2a390c9fd1df10d5e7254aaa7c4e")
      override fun lambdaInvokePolicy(lambdaInvokePolicy: FunctionSAMPTProperty.Builder.() -> Unit):
          Unit = lambdaInvokePolicy(FunctionSAMPTProperty(lambdaInvokePolicy))

      override fun stepFunctionsExecutionPolicy(stepFunctionsExecutionPolicy: IResolvable) {
        cdkBuilder.stepFunctionsExecutionPolicy(stepFunctionsExecutionPolicy.let(IResolvable::unwrap))
      }

      override
          fun stepFunctionsExecutionPolicy(stepFunctionsExecutionPolicy: StateMachineSAMPTProperty) {
        cdkBuilder.stepFunctionsExecutionPolicy(stepFunctionsExecutionPolicy.let(StateMachineSAMPTProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("55aab9b20aeefe7e5d5552a6e39b132f58bd2eabc422d596e90a12a5cef6acd6")
      override
          fun stepFunctionsExecutionPolicy(stepFunctionsExecutionPolicy: StateMachineSAMPTProperty.Builder.() -> Unit):
          Unit =
          stepFunctionsExecutionPolicy(StateMachineSAMPTProperty(stepFunctionsExecutionPolicy))

      public fun build():
          software.amazon.awscdk.services.sam.CfnStateMachine.SAMPolicyTemplateProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sam.CfnStateMachine.SAMPolicyTemplateProperty,
    ) : SAMPolicyTemplateProperty {
      override fun lambdaInvokePolicy(): Any? = unwrap(this).getLambdaInvokePolicy()

      override fun stepFunctionsExecutionPolicy(): Any? =
          unwrap(this).getStepFunctionsExecutionPolicy()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SAMPolicyTemplateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnStateMachine.SAMPolicyTemplateProperty):
          SAMPolicyTemplateProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SAMPolicyTemplateProperty):
          software.amazon.awscdk.services.sam.CfnStateMachine.SAMPolicyTemplateProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface ScheduleEventProperty {
    public fun input(): String? = unwrap(this).getInput()

    public fun schedule(): String

    public interface Builder {
      public fun input(input: String)

      public fun schedule(schedule: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnStateMachine.ScheduleEventProperty.Builder =
          software.amazon.awscdk.services.sam.CfnStateMachine.ScheduleEventProperty.builder()

      override fun input(input: String) {
        cdkBuilder.input(input)
      }

      override fun schedule(schedule: String) {
        cdkBuilder.schedule(schedule)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnStateMachine.ScheduleEventProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sam.CfnStateMachine.ScheduleEventProperty,
    ) : ScheduleEventProperty {
      override fun input(): String? = unwrap(this).getInput()

      override fun schedule(): String = unwrap(this).getSchedule()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ScheduleEventProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnStateMachine.ScheduleEventProperty):
          ScheduleEventProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScheduleEventProperty):
          software.amazon.awscdk.services.sam.CfnStateMachine.ScheduleEventProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface CloudWatchLogsLogGroupProperty {
    public fun logGroupArn(): String

    public interface Builder {
      public fun logGroupArn(logGroupArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnStateMachine.CloudWatchLogsLogGroupProperty.Builder
          =
          software.amazon.awscdk.services.sam.CfnStateMachine.CloudWatchLogsLogGroupProperty.builder()

      override fun logGroupArn(logGroupArn: String) {
        cdkBuilder.logGroupArn(logGroupArn)
      }

      public fun build():
          software.amazon.awscdk.services.sam.CfnStateMachine.CloudWatchLogsLogGroupProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sam.CfnStateMachine.CloudWatchLogsLogGroupProperty,
    ) : CloudWatchLogsLogGroupProperty {
      override fun logGroupArn(): String = unwrap(this).getLogGroupArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CloudWatchLogsLogGroupProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnStateMachine.CloudWatchLogsLogGroupProperty):
          CloudWatchLogsLogGroupProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CloudWatchLogsLogGroupProperty):
          software.amazon.awscdk.services.sam.CfnStateMachine.CloudWatchLogsLogGroupProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface TracingConfigurationProperty {
    public fun enabled(): Any? = unwrap(this).getEnabled()

    public interface Builder {
      public fun enabled(enabled: Boolean)

      public fun enabled(enabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnStateMachine.TracingConfigurationProperty.Builder =
          software.amazon.awscdk.services.sam.CfnStateMachine.TracingConfigurationProperty.builder()

      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.sam.CfnStateMachine.TracingConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sam.CfnStateMachine.TracingConfigurationProperty,
    ) : TracingConfigurationProperty {
      override fun enabled(): Any? = unwrap(this).getEnabled()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TracingConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnStateMachine.TracingConfigurationProperty):
          TracingConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TracingConfigurationProperty):
          software.amazon.awscdk.services.sam.CfnStateMachine.TracingConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface EventSourceProperty {
    public fun properties(): Any

    public fun type(): String

    public interface Builder {
      public fun properties(properties: IResolvable)

      public fun properties(properties: ApiEventProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("40e79479ca1fe3df64b7aafeedb6c40fa3d2d53993be4ba2a5d1daec72831ea1")
      public fun properties(properties: ApiEventProperty.Builder.() -> Unit)

      public fun properties(properties: CloudWatchEventEventProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3e05cbdb421d6a3f300c28f5c4d41a4bb4a147ef563c23289793f11c465fa3b0")
      public fun properties(properties: CloudWatchEventEventProperty.Builder.() -> Unit)

      public fun properties(properties: EventBridgeRuleEventProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("33a29f15107863a2f15d8a7b6575885d8bc6f17fd60f76e71047c3b115623532")
      public fun properties(properties: EventBridgeRuleEventProperty.Builder.() -> Unit)

      public fun properties(properties: ScheduleEventProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ea07d398ece309f929e477bdd3715abb5bb855bb108e225dc59923fd888dca52")
      public fun properties(properties: ScheduleEventProperty.Builder.() -> Unit)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnStateMachine.EventSourceProperty.Builder =
          software.amazon.awscdk.services.sam.CfnStateMachine.EventSourceProperty.builder()

      override fun properties(properties: IResolvable) {
        cdkBuilder.properties(properties.let(IResolvable::unwrap))
      }

      override fun properties(properties: ApiEventProperty) {
        cdkBuilder.properties(properties.let(ApiEventProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("40e79479ca1fe3df64b7aafeedb6c40fa3d2d53993be4ba2a5d1daec72831ea1")
      override fun properties(properties: ApiEventProperty.Builder.() -> Unit): Unit =
          properties(ApiEventProperty(properties))

      override fun properties(properties: CloudWatchEventEventProperty) {
        cdkBuilder.properties(properties.let(CloudWatchEventEventProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3e05cbdb421d6a3f300c28f5c4d41a4bb4a147ef563c23289793f11c465fa3b0")
      override fun properties(properties: CloudWatchEventEventProperty.Builder.() -> Unit): Unit =
          properties(CloudWatchEventEventProperty(properties))

      override fun properties(properties: EventBridgeRuleEventProperty) {
        cdkBuilder.properties(properties.let(EventBridgeRuleEventProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("33a29f15107863a2f15d8a7b6575885d8bc6f17fd60f76e71047c3b115623532")
      override fun properties(properties: EventBridgeRuleEventProperty.Builder.() -> Unit): Unit =
          properties(EventBridgeRuleEventProperty(properties))

      override fun properties(properties: ScheduleEventProperty) {
        cdkBuilder.properties(properties.let(ScheduleEventProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ea07d398ece309f929e477bdd3715abb5bb855bb108e225dc59923fd888dca52")
      override fun properties(properties: ScheduleEventProperty.Builder.() -> Unit): Unit =
          properties(ScheduleEventProperty(properties))

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnStateMachine.EventSourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sam.CfnStateMachine.EventSourceProperty,
    ) : EventSourceProperty {
      override fun properties(): Any = unwrap(this).getProperties()

      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EventSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnStateMachine.EventSourceProperty):
          EventSourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EventSourceProperty):
          software.amazon.awscdk.services.sam.CfnStateMachine.EventSourceProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface IAMPolicyDocumentProperty {
    public fun statement(): Any

    public fun version(): String

    public interface Builder {
      public fun statement(statement: Any)

      public fun version(version: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnStateMachine.IAMPolicyDocumentProperty.Builder =
          software.amazon.awscdk.services.sam.CfnStateMachine.IAMPolicyDocumentProperty.builder()

      override fun statement(statement: Any) {
        cdkBuilder.statement(statement)
      }

      override fun version(version: String) {
        cdkBuilder.version(version)
      }

      public fun build():
          software.amazon.awscdk.services.sam.CfnStateMachine.IAMPolicyDocumentProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sam.CfnStateMachine.IAMPolicyDocumentProperty,
    ) : IAMPolicyDocumentProperty {
      override fun statement(): Any = unwrap(this).getStatement()

      override fun version(): String = unwrap(this).getVersion()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): IAMPolicyDocumentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnStateMachine.IAMPolicyDocumentProperty):
          IAMPolicyDocumentProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IAMPolicyDocumentProperty):
          software.amazon.awscdk.services.sam.CfnStateMachine.IAMPolicyDocumentProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface ApiEventProperty {
    public fun method(): String

    public fun path(): String

    public fun restApiId(): String? = unwrap(this).getRestApiId()

    public interface Builder {
      public fun method(method: String)

      public fun path(path: String)

      public fun restApiId(restApiId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnStateMachine.ApiEventProperty.Builder =
          software.amazon.awscdk.services.sam.CfnStateMachine.ApiEventProperty.builder()

      override fun method(method: String) {
        cdkBuilder.method(method)
      }

      override fun path(path: String) {
        cdkBuilder.path(path)
      }

      override fun restApiId(restApiId: String) {
        cdkBuilder.restApiId(restApiId)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnStateMachine.ApiEventProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.sam.CfnStateMachine.ApiEventProperty,
    ) : ApiEventProperty {
      override fun method(): String = unwrap(this).getMethod()

      override fun path(): String = unwrap(this).getPath()

      override fun restApiId(): String? = unwrap(this).getRestApiId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ApiEventProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnStateMachine.ApiEventProperty):
          ApiEventProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ApiEventProperty):
          software.amazon.awscdk.services.sam.CfnStateMachine.ApiEventProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
