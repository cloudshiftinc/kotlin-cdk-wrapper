package io.cloudshiftdev.awscdk.services.lambda

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

public open class CfnEventSourceMapping internal constructor(
  private val cdkObject: software.amazon.awscdk.services.lambda.CfnEventSourceMapping,
) : CfnResource(cdkObject), IInspectable {
  public open fun amazonManagedKafkaEventSourceConfig(): Any? =
      unwrap(this).getAmazonManagedKafkaEventSourceConfig()

  public open fun amazonManagedKafkaEventSourceConfig(`value`: IResolvable) {
    unwrap(this).setAmazonManagedKafkaEventSourceConfig(`value`.let(IResolvable::unwrap))
  }

  public open
      fun amazonManagedKafkaEventSourceConfig(`value`: AmazonManagedKafkaEventSourceConfigProperty) {
    unwrap(this).setAmazonManagedKafkaEventSourceConfig(`value`.let(AmazonManagedKafkaEventSourceConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0546eaf5ec0de25dc1ef0f4eff69e33135c5ee55d069c75ed61f58ff872041ff")
  public open
      fun amazonManagedKafkaEventSourceConfig(`value`: AmazonManagedKafkaEventSourceConfigProperty.Builder.() -> Unit):
      Unit =
      amazonManagedKafkaEventSourceConfig(AmazonManagedKafkaEventSourceConfigProperty(`value`))

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun batchSize(): Number? = unwrap(this).getBatchSize()

  public open fun batchSize(`value`: Number) {
    unwrap(this).setBatchSize(`value`)
  }

  public open fun bisectBatchOnFunctionError(): Any? = unwrap(this).getBisectBatchOnFunctionError()

  public open fun bisectBatchOnFunctionError(`value`: Boolean) {
    unwrap(this).setBisectBatchOnFunctionError(`value`)
  }

  public open fun bisectBatchOnFunctionError(`value`: IResolvable) {
    unwrap(this).setBisectBatchOnFunctionError(`value`.let(IResolvable::unwrap))
  }

  public open fun destinationConfig(): Any? = unwrap(this).getDestinationConfig()

  public open fun destinationConfig(`value`: IResolvable) {
    unwrap(this).setDestinationConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun destinationConfig(`value`: DestinationConfigProperty) {
    unwrap(this).setDestinationConfig(`value`.let(DestinationConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e0727d1f2ac82afd02c9afa0002bf881a9e6a16e5e752856fc1a751310a91530")
  public open fun destinationConfig(`value`: DestinationConfigProperty.Builder.() -> Unit): Unit =
      destinationConfig(DestinationConfigProperty(`value`))

  public open fun documentDbEventSourceConfig(): Any? =
      unwrap(this).getDocumentDbEventSourceConfig()

  public open fun documentDbEventSourceConfig(`value`: IResolvable) {
    unwrap(this).setDocumentDbEventSourceConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun documentDbEventSourceConfig(`value`: DocumentDBEventSourceConfigProperty) {
    unwrap(this).setDocumentDbEventSourceConfig(`value`.let(DocumentDBEventSourceConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9b5d7540aaff5f4c337bd3e3c466ea3553153047b3199251b7d4dc6152d421f8")
  public open
      fun documentDbEventSourceConfig(`value`: DocumentDBEventSourceConfigProperty.Builder.() -> Unit):
      Unit = documentDbEventSourceConfig(DocumentDBEventSourceConfigProperty(`value`))

  public open fun enabled(): Any? = unwrap(this).getEnabled()

  public open fun enabled(`value`: Boolean) {
    unwrap(this).setEnabled(`value`)
  }

  public open fun enabled(`value`: IResolvable) {
    unwrap(this).setEnabled(`value`.let(IResolvable::unwrap))
  }

  public open fun eventSourceArn(): String? = unwrap(this).getEventSourceArn()

  public open fun eventSourceArn(`value`: String) {
    unwrap(this).setEventSourceArn(`value`)
  }

  public open fun filterCriteria(): Any? = unwrap(this).getFilterCriteria()

  public open fun filterCriteria(`value`: IResolvable) {
    unwrap(this).setFilterCriteria(`value`.let(IResolvable::unwrap))
  }

  public open fun filterCriteria(`value`: FilterCriteriaProperty) {
    unwrap(this).setFilterCriteria(`value`.let(FilterCriteriaProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bc31923467be09d3b1d86cf808a6a14758970152c4f89da54949ef9fb9cf1dd8")
  public open fun filterCriteria(`value`: FilterCriteriaProperty.Builder.() -> Unit): Unit =
      filterCriteria(FilterCriteriaProperty(`value`))

  public open fun functionName(): String = unwrap(this).getFunctionName()

  public open fun functionName(`value`: String) {
    unwrap(this).setFunctionName(`value`)
  }

  public open fun functionResponseTypes(): List<String> = unwrap(this).getFunctionResponseTypes() ?:
      emptyList()

  public open fun functionResponseTypes(`value`: List<String>) {
    unwrap(this).setFunctionResponseTypes(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun maximumBatchingWindowInSeconds(): Number? =
      unwrap(this).getMaximumBatchingWindowInSeconds()

  public open fun maximumBatchingWindowInSeconds(`value`: Number) {
    unwrap(this).setMaximumBatchingWindowInSeconds(`value`)
  }

  public open fun maximumRecordAgeInSeconds(): Number? = unwrap(this).getMaximumRecordAgeInSeconds()

  public open fun maximumRecordAgeInSeconds(`value`: Number) {
    unwrap(this).setMaximumRecordAgeInSeconds(`value`)
  }

  public open fun maximumRetryAttempts(): Number? = unwrap(this).getMaximumRetryAttempts()

  public open fun maximumRetryAttempts(`value`: Number) {
    unwrap(this).setMaximumRetryAttempts(`value`)
  }

  public open fun parallelizationFactor(): Number? = unwrap(this).getParallelizationFactor()

  public open fun parallelizationFactor(`value`: Number) {
    unwrap(this).setParallelizationFactor(`value`)
  }

  public open fun queues(): List<String> = unwrap(this).getQueues() ?: emptyList()

  public open fun queues(`value`: List<String>) {
    unwrap(this).setQueues(`value`)
  }

  public open fun scalingConfig(): Any? = unwrap(this).getScalingConfig()

  public open fun scalingConfig(`value`: IResolvable) {
    unwrap(this).setScalingConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun scalingConfig(`value`: ScalingConfigProperty) {
    unwrap(this).setScalingConfig(`value`.let(ScalingConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c7f38e41aa1e31160bdb25d297001323779fbc20a75f265e5d9d84a5dde4abf8")
  public open fun scalingConfig(`value`: ScalingConfigProperty.Builder.() -> Unit): Unit =
      scalingConfig(ScalingConfigProperty(`value`))

  public open fun selfManagedEventSource(): Any? = unwrap(this).getSelfManagedEventSource()

  public open fun selfManagedEventSource(`value`: IResolvable) {
    unwrap(this).setSelfManagedEventSource(`value`.let(IResolvable::unwrap))
  }

  public open fun selfManagedEventSource(`value`: SelfManagedEventSourceProperty) {
    unwrap(this).setSelfManagedEventSource(`value`.let(SelfManagedEventSourceProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ded22c9cf40efe353eb906200eb2e3d2b16224de530e6e175fb9f5582fbcd80a")
  public open
      fun selfManagedEventSource(`value`: SelfManagedEventSourceProperty.Builder.() -> Unit): Unit =
      selfManagedEventSource(SelfManagedEventSourceProperty(`value`))

  public open fun selfManagedKafkaEventSourceConfig(): Any? =
      unwrap(this).getSelfManagedKafkaEventSourceConfig()

  public open fun selfManagedKafkaEventSourceConfig(`value`: IResolvable) {
    unwrap(this).setSelfManagedKafkaEventSourceConfig(`value`.let(IResolvable::unwrap))
  }

  public open
      fun selfManagedKafkaEventSourceConfig(`value`: SelfManagedKafkaEventSourceConfigProperty) {
    unwrap(this).setSelfManagedKafkaEventSourceConfig(`value`.let(SelfManagedKafkaEventSourceConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4a57a37ea1790f9844a931862b87c174d0128222ac406a0c5f427e774c75f2e6")
  public open
      fun selfManagedKafkaEventSourceConfig(`value`: SelfManagedKafkaEventSourceConfigProperty.Builder.() -> Unit):
      Unit = selfManagedKafkaEventSourceConfig(SelfManagedKafkaEventSourceConfigProperty(`value`))

  public open fun sourceAccessConfigurations(): Any? = unwrap(this).getSourceAccessConfigurations()

  public open fun sourceAccessConfigurations(`value`: IResolvable) {
    unwrap(this).setSourceAccessConfigurations(`value`.let(IResolvable::unwrap))
  }

  public open fun sourceAccessConfigurations(__idx_ac66f0: List<Any>) {
    unwrap(this).setSourceAccessConfigurations(__idx_ac66f0)
  }

  public open fun startingPosition(): String? = unwrap(this).getStartingPosition()

  public open fun startingPosition(`value`: String) {
    unwrap(this).setStartingPosition(`value`)
  }

  public open fun startingPositionTimestamp(): Number? = unwrap(this).getStartingPositionTimestamp()

  public open fun startingPositionTimestamp(`value`: Number) {
    unwrap(this).setStartingPositionTimestamp(`value`)
  }

  public open fun topics(): List<String> = unwrap(this).getTopics() ?: emptyList()

  public open fun topics(`value`: List<String>) {
    unwrap(this).setTopics(`value`)
  }

  public open fun tumblingWindowInSeconds(): Number? = unwrap(this).getTumblingWindowInSeconds()

  public open fun tumblingWindowInSeconds(`value`: Number) {
    unwrap(this).setTumblingWindowInSeconds(`value`)
  }

  public interface Builder {
    public fun amazonManagedKafkaEventSourceConfig(amazonManagedKafkaEventSourceConfig: IResolvable)

    public
        fun amazonManagedKafkaEventSourceConfig(amazonManagedKafkaEventSourceConfig: AmazonManagedKafkaEventSourceConfigProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9a18729a436a40c6ab3d5a14bf28967743c4f06ebf58a4c3399a07176c1be7fa")
    public
        fun amazonManagedKafkaEventSourceConfig(amazonManagedKafkaEventSourceConfig: AmazonManagedKafkaEventSourceConfigProperty.Builder.() -> Unit)

    public fun batchSize(batchSize: Number)

    public fun bisectBatchOnFunctionError(bisectBatchOnFunctionError: Boolean)

    public fun bisectBatchOnFunctionError(bisectBatchOnFunctionError: IResolvable)

    public fun destinationConfig(destinationConfig: IResolvable)

    public fun destinationConfig(destinationConfig: DestinationConfigProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cf1365091f9febe46c1e47ec28c4a9206a26547b34731f5baf261a0af4eaa6b6")
    public fun destinationConfig(destinationConfig: DestinationConfigProperty.Builder.() -> Unit)

    public fun documentDbEventSourceConfig(documentDbEventSourceConfig: IResolvable)

    public
        fun documentDbEventSourceConfig(documentDbEventSourceConfig: DocumentDBEventSourceConfigProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d3b3fe70f00ec954d7ece91179c11a46159eb84371098c41dbdad143a0d405a0")
    public
        fun documentDbEventSourceConfig(documentDbEventSourceConfig: DocumentDBEventSourceConfigProperty.Builder.() -> Unit)

    public fun enabled(enabled: Boolean)

    public fun enabled(enabled: IResolvable)

    public fun eventSourceArn(eventSourceArn: String)

    public fun filterCriteria(filterCriteria: IResolvable)

    public fun filterCriteria(filterCriteria: FilterCriteriaProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("916dc1790836cb4d0d61fbac02ff601607532a144ed6fba129679e6bf27e1e3c")
    public fun filterCriteria(filterCriteria: FilterCriteriaProperty.Builder.() -> Unit)

    public fun functionName(functionName: String)

    public fun functionResponseTypes(functionResponseTypes: List<String>)

    public fun maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds: Number)

    public fun maximumRecordAgeInSeconds(maximumRecordAgeInSeconds: Number)

    public fun maximumRetryAttempts(maximumRetryAttempts: Number)

    public fun parallelizationFactor(parallelizationFactor: Number)

    public fun queues(queues: List<String>)

    public fun scalingConfig(scalingConfig: IResolvable)

    public fun scalingConfig(scalingConfig: ScalingConfigProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1ef3b9f703fbf78497da8a3697e58d20913edff366643d85f736a432c376080e")
    public fun scalingConfig(scalingConfig: ScalingConfigProperty.Builder.() -> Unit)

    public fun selfManagedEventSource(selfManagedEventSource: IResolvable)

    public fun selfManagedEventSource(selfManagedEventSource: SelfManagedEventSourceProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("338dd05b1ecb9f9b6cac5db40b22f8a8756113fd3faf8ec5704f4aa12283dda4")
    public
        fun selfManagedEventSource(selfManagedEventSource: SelfManagedEventSourceProperty.Builder.() -> Unit)

    public fun selfManagedKafkaEventSourceConfig(selfManagedKafkaEventSourceConfig: IResolvable)

    public
        fun selfManagedKafkaEventSourceConfig(selfManagedKafkaEventSourceConfig: SelfManagedKafkaEventSourceConfigProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("98f5b4474f72c44225b79c9d86688eedd8ec8f540ead775e215a15e7562423d3")
    public
        fun selfManagedKafkaEventSourceConfig(selfManagedKafkaEventSourceConfig: SelfManagedKafkaEventSourceConfigProperty.Builder.() -> Unit)

    public fun sourceAccessConfigurations(sourceAccessConfigurations: IResolvable)

    public fun sourceAccessConfigurations(sourceAccessConfigurations: List<Any>)

    public fun startingPosition(startingPosition: String)

    public fun startingPositionTimestamp(startingPositionTimestamp: Number)

    public fun topics(topics: List<String>)

    public fun tumblingWindowInSeconds(tumblingWindowInSeconds: Number)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.CfnEventSourceMapping.Builder =
        software.amazon.awscdk.services.lambda.CfnEventSourceMapping.Builder.create(scope, id)

    override
        fun amazonManagedKafkaEventSourceConfig(amazonManagedKafkaEventSourceConfig: IResolvable) {
      cdkBuilder.amazonManagedKafkaEventSourceConfig(amazonManagedKafkaEventSourceConfig.let(IResolvable::unwrap))
    }

    override
        fun amazonManagedKafkaEventSourceConfig(amazonManagedKafkaEventSourceConfig: AmazonManagedKafkaEventSourceConfigProperty) {
      cdkBuilder.amazonManagedKafkaEventSourceConfig(amazonManagedKafkaEventSourceConfig.let(AmazonManagedKafkaEventSourceConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9a18729a436a40c6ab3d5a14bf28967743c4f06ebf58a4c3399a07176c1be7fa")
    override
        fun amazonManagedKafkaEventSourceConfig(amazonManagedKafkaEventSourceConfig: AmazonManagedKafkaEventSourceConfigProperty.Builder.() -> Unit):
        Unit =
        amazonManagedKafkaEventSourceConfig(AmazonManagedKafkaEventSourceConfigProperty(amazonManagedKafkaEventSourceConfig))

    override fun batchSize(batchSize: Number) {
      cdkBuilder.batchSize(batchSize)
    }

    override fun bisectBatchOnFunctionError(bisectBatchOnFunctionError: Boolean) {
      cdkBuilder.bisectBatchOnFunctionError(bisectBatchOnFunctionError)
    }

    override fun bisectBatchOnFunctionError(bisectBatchOnFunctionError: IResolvable) {
      cdkBuilder.bisectBatchOnFunctionError(bisectBatchOnFunctionError.let(IResolvable::unwrap))
    }

    override fun destinationConfig(destinationConfig: IResolvable) {
      cdkBuilder.destinationConfig(destinationConfig.let(IResolvable::unwrap))
    }

    override fun destinationConfig(destinationConfig: DestinationConfigProperty) {
      cdkBuilder.destinationConfig(destinationConfig.let(DestinationConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cf1365091f9febe46c1e47ec28c4a9206a26547b34731f5baf261a0af4eaa6b6")
    override fun destinationConfig(destinationConfig: DestinationConfigProperty.Builder.() -> Unit):
        Unit = destinationConfig(DestinationConfigProperty(destinationConfig))

    override fun documentDbEventSourceConfig(documentDbEventSourceConfig: IResolvable) {
      cdkBuilder.documentDbEventSourceConfig(documentDbEventSourceConfig.let(IResolvable::unwrap))
    }

    override
        fun documentDbEventSourceConfig(documentDbEventSourceConfig: DocumentDBEventSourceConfigProperty) {
      cdkBuilder.documentDbEventSourceConfig(documentDbEventSourceConfig.let(DocumentDBEventSourceConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d3b3fe70f00ec954d7ece91179c11a46159eb84371098c41dbdad143a0d405a0")
    override
        fun documentDbEventSourceConfig(documentDbEventSourceConfig: DocumentDBEventSourceConfigProperty.Builder.() -> Unit):
        Unit =
        documentDbEventSourceConfig(DocumentDBEventSourceConfigProperty(documentDbEventSourceConfig))

    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    override fun enabled(enabled: IResolvable) {
      cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
    }

    override fun eventSourceArn(eventSourceArn: String) {
      cdkBuilder.eventSourceArn(eventSourceArn)
    }

    override fun filterCriteria(filterCriteria: IResolvable) {
      cdkBuilder.filterCriteria(filterCriteria.let(IResolvable::unwrap))
    }

    override fun filterCriteria(filterCriteria: FilterCriteriaProperty) {
      cdkBuilder.filterCriteria(filterCriteria.let(FilterCriteriaProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("916dc1790836cb4d0d61fbac02ff601607532a144ed6fba129679e6bf27e1e3c")
    override fun filterCriteria(filterCriteria: FilterCriteriaProperty.Builder.() -> Unit): Unit =
        filterCriteria(FilterCriteriaProperty(filterCriteria))

    override fun functionName(functionName: String) {
      cdkBuilder.functionName(functionName)
    }

    override fun functionResponseTypes(functionResponseTypes: List<String>) {
      cdkBuilder.functionResponseTypes(functionResponseTypes)
    }

    override fun maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds: Number) {
      cdkBuilder.maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds)
    }

    override fun maximumRecordAgeInSeconds(maximumRecordAgeInSeconds: Number) {
      cdkBuilder.maximumRecordAgeInSeconds(maximumRecordAgeInSeconds)
    }

    override fun maximumRetryAttempts(maximumRetryAttempts: Number) {
      cdkBuilder.maximumRetryAttempts(maximumRetryAttempts)
    }

    override fun parallelizationFactor(parallelizationFactor: Number) {
      cdkBuilder.parallelizationFactor(parallelizationFactor)
    }

    override fun queues(queues: List<String>) {
      cdkBuilder.queues(queues)
    }

    override fun scalingConfig(scalingConfig: IResolvable) {
      cdkBuilder.scalingConfig(scalingConfig.let(IResolvable::unwrap))
    }

    override fun scalingConfig(scalingConfig: ScalingConfigProperty) {
      cdkBuilder.scalingConfig(scalingConfig.let(ScalingConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1ef3b9f703fbf78497da8a3697e58d20913edff366643d85f736a432c376080e")
    override fun scalingConfig(scalingConfig: ScalingConfigProperty.Builder.() -> Unit): Unit =
        scalingConfig(ScalingConfigProperty(scalingConfig))

    override fun selfManagedEventSource(selfManagedEventSource: IResolvable) {
      cdkBuilder.selfManagedEventSource(selfManagedEventSource.let(IResolvable::unwrap))
    }

    override fun selfManagedEventSource(selfManagedEventSource: SelfManagedEventSourceProperty) {
      cdkBuilder.selfManagedEventSource(selfManagedEventSource.let(SelfManagedEventSourceProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("338dd05b1ecb9f9b6cac5db40b22f8a8756113fd3faf8ec5704f4aa12283dda4")
    override
        fun selfManagedEventSource(selfManagedEventSource: SelfManagedEventSourceProperty.Builder.() -> Unit):
        Unit = selfManagedEventSource(SelfManagedEventSourceProperty(selfManagedEventSource))

    override fun selfManagedKafkaEventSourceConfig(selfManagedKafkaEventSourceConfig: IResolvable) {
      cdkBuilder.selfManagedKafkaEventSourceConfig(selfManagedKafkaEventSourceConfig.let(IResolvable::unwrap))
    }

    override
        fun selfManagedKafkaEventSourceConfig(selfManagedKafkaEventSourceConfig: SelfManagedKafkaEventSourceConfigProperty) {
      cdkBuilder.selfManagedKafkaEventSourceConfig(selfManagedKafkaEventSourceConfig.let(SelfManagedKafkaEventSourceConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("98f5b4474f72c44225b79c9d86688eedd8ec8f540ead775e215a15e7562423d3")
    override
        fun selfManagedKafkaEventSourceConfig(selfManagedKafkaEventSourceConfig: SelfManagedKafkaEventSourceConfigProperty.Builder.() -> Unit):
        Unit =
        selfManagedKafkaEventSourceConfig(SelfManagedKafkaEventSourceConfigProperty(selfManagedKafkaEventSourceConfig))

    override fun sourceAccessConfigurations(sourceAccessConfigurations: IResolvable) {
      cdkBuilder.sourceAccessConfigurations(sourceAccessConfigurations.let(IResolvable::unwrap))
    }

    override fun sourceAccessConfigurations(sourceAccessConfigurations: List<Any>) {
      cdkBuilder.sourceAccessConfigurations(sourceAccessConfigurations)
    }

    override fun startingPosition(startingPosition: String) {
      cdkBuilder.startingPosition(startingPosition)
    }

    override fun startingPositionTimestamp(startingPositionTimestamp: Number) {
      cdkBuilder.startingPositionTimestamp(startingPositionTimestamp)
    }

    override fun topics(topics: List<String>) {
      cdkBuilder.topics(topics)
    }

    override fun tumblingWindowInSeconds(tumblingWindowInSeconds: Number) {
      cdkBuilder.tumblingWindowInSeconds(tumblingWindowInSeconds)
    }

    public fun build(): software.amazon.awscdk.services.lambda.CfnEventSourceMapping =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEventSourceMapping {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEventSourceMapping(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnEventSourceMapping):
        CfnEventSourceMapping = CfnEventSourceMapping(cdkObject)

    internal fun unwrap(wrapped: CfnEventSourceMapping):
        software.amazon.awscdk.services.lambda.CfnEventSourceMapping = wrapped.cdkObject
  }

  public interface SelfManagedKafkaEventSourceConfigProperty {
    public fun consumerGroupId(): String? = unwrap(this).getConsumerGroupId()

    public interface Builder {
      public fun consumerGroupId(consumerGroupId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.SelfManagedKafkaEventSourceConfigProperty.Builder
          =
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.SelfManagedKafkaEventSourceConfigProperty.builder()

      override fun consumerGroupId(consumerGroupId: String) {
        cdkBuilder.consumerGroupId(consumerGroupId)
      }

      public fun build():
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.SelfManagedKafkaEventSourceConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.SelfManagedKafkaEventSourceConfigProperty,
    ) : SelfManagedKafkaEventSourceConfigProperty {
      override fun consumerGroupId(): String? = unwrap(this).getConsumerGroupId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          SelfManagedKafkaEventSourceConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnEventSourceMapping.SelfManagedKafkaEventSourceConfigProperty):
          SelfManagedKafkaEventSourceConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SelfManagedKafkaEventSourceConfigProperty):
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.SelfManagedKafkaEventSourceConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface FilterProperty {
    public fun pattern(): String? = unwrap(this).getPattern()

    public interface Builder {
      public fun pattern(pattern: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.FilterProperty.Builder =
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.FilterProperty.builder()

      override fun pattern(pattern: String) {
        cdkBuilder.pattern(pattern)
      }

      public fun build():
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.FilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.FilterProperty,
    ) : FilterProperty {
      override fun pattern(): String? = unwrap(this).getPattern()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnEventSourceMapping.FilterProperty):
          FilterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FilterProperty):
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.FilterProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SelfManagedEventSourceProperty {
    public fun endpoints(): Any? = unwrap(this).getEndpoints()

    public interface Builder {
      public fun endpoints(endpoints: IResolvable)

      public fun endpoints(endpoints: EndpointsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5e698f9f1f113c096b2840307c27cfc7d5cb23bd03b30dc2ed0d25276ace3f91")
      public fun endpoints(endpoints: EndpointsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.SelfManagedEventSourceProperty.Builder
          =
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.SelfManagedEventSourceProperty.builder()

      override fun endpoints(endpoints: IResolvable) {
        cdkBuilder.endpoints(endpoints.let(IResolvable::unwrap))
      }

      override fun endpoints(endpoints: EndpointsProperty) {
        cdkBuilder.endpoints(endpoints.let(EndpointsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5e698f9f1f113c096b2840307c27cfc7d5cb23bd03b30dc2ed0d25276ace3f91")
      override fun endpoints(endpoints: EndpointsProperty.Builder.() -> Unit): Unit =
          endpoints(EndpointsProperty(endpoints))

      public fun build():
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.SelfManagedEventSourceProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.SelfManagedEventSourceProperty,
    ) : SelfManagedEventSourceProperty {
      override fun endpoints(): Any? = unwrap(this).getEndpoints()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SelfManagedEventSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnEventSourceMapping.SelfManagedEventSourceProperty):
          SelfManagedEventSourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SelfManagedEventSourceProperty):
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.SelfManagedEventSourceProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface AmazonManagedKafkaEventSourceConfigProperty {
    public fun consumerGroupId(): String? = unwrap(this).getConsumerGroupId()

    public interface Builder {
      public fun consumerGroupId(consumerGroupId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.AmazonManagedKafkaEventSourceConfigProperty.Builder
          =
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.AmazonManagedKafkaEventSourceConfigProperty.builder()

      override fun consumerGroupId(consumerGroupId: String) {
        cdkBuilder.consumerGroupId(consumerGroupId)
      }

      public fun build():
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.AmazonManagedKafkaEventSourceConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.AmazonManagedKafkaEventSourceConfigProperty,
    ) : AmazonManagedKafkaEventSourceConfigProperty {
      override fun consumerGroupId(): String? = unwrap(this).getConsumerGroupId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          AmazonManagedKafkaEventSourceConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnEventSourceMapping.AmazonManagedKafkaEventSourceConfigProperty):
          AmazonManagedKafkaEventSourceConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AmazonManagedKafkaEventSourceConfigProperty):
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.AmazonManagedKafkaEventSourceConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface FilterCriteriaProperty {
    public fun filters(): Any? = unwrap(this).getFilters()

    public interface Builder {
      public fun filters(filters: IResolvable)

      public fun filters(filters: List<Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.FilterCriteriaProperty.Builder
          =
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.FilterCriteriaProperty.builder()

      override fun filters(filters: IResolvable) {
        cdkBuilder.filters(filters.let(IResolvable::unwrap))
      }

      override fun filters(filters: List<Any>) {
        cdkBuilder.filters(filters)
      }

      public fun build():
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.FilterCriteriaProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.FilterCriteriaProperty,
    ) : FilterCriteriaProperty {
      override fun filters(): Any? = unwrap(this).getFilters()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FilterCriteriaProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnEventSourceMapping.FilterCriteriaProperty):
          FilterCriteriaProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FilterCriteriaProperty):
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.FilterCriteriaProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface OnFailureProperty {
    public fun destination(): String? = unwrap(this).getDestination()

    public interface Builder {
      public fun destination(destination: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.OnFailureProperty.Builder =
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.OnFailureProperty.builder()

      override fun destination(destination: String) {
        cdkBuilder.destination(destination)
      }

      public fun build():
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.OnFailureProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.OnFailureProperty,
    ) : OnFailureProperty {
      override fun destination(): String? = unwrap(this).getDestination()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): OnFailureProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnEventSourceMapping.OnFailureProperty):
          OnFailureProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OnFailureProperty):
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.OnFailureProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface DestinationConfigProperty {
    public fun onFailure(): Any? = unwrap(this).getOnFailure()

    public interface Builder {
      public fun onFailure(onFailure: IResolvable)

      public fun onFailure(onFailure: OnFailureProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("284a94b85ae136287cec3526f52f06be29bceaf51b2211a83f73e8de76313ce2")
      public fun onFailure(onFailure: OnFailureProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.DestinationConfigProperty.Builder
          =
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.DestinationConfigProperty.builder()

      override fun onFailure(onFailure: IResolvable) {
        cdkBuilder.onFailure(onFailure.let(IResolvable::unwrap))
      }

      override fun onFailure(onFailure: OnFailureProperty) {
        cdkBuilder.onFailure(onFailure.let(OnFailureProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("284a94b85ae136287cec3526f52f06be29bceaf51b2211a83f73e8de76313ce2")
      override fun onFailure(onFailure: OnFailureProperty.Builder.() -> Unit): Unit =
          onFailure(OnFailureProperty(onFailure))

      public fun build():
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.DestinationConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.DestinationConfigProperty,
    ) : DestinationConfigProperty {
      override fun onFailure(): Any? = unwrap(this).getOnFailure()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DestinationConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnEventSourceMapping.DestinationConfigProperty):
          DestinationConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DestinationConfigProperty):
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.DestinationConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface SourceAccessConfigurationProperty {
    public fun type(): String? = unwrap(this).getType()

    public fun uri(): String? = unwrap(this).getUri()

    public interface Builder {
      public fun type(type: String)

      public fun uri(uri: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.SourceAccessConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.SourceAccessConfigurationProperty.builder()

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      override fun uri(uri: String) {
        cdkBuilder.uri(uri)
      }

      public fun build():
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.SourceAccessConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.SourceAccessConfigurationProperty,
    ) : SourceAccessConfigurationProperty {
      override fun type(): String? = unwrap(this).getType()

      override fun uri(): String? = unwrap(this).getUri()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          SourceAccessConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnEventSourceMapping.SourceAccessConfigurationProperty):
          SourceAccessConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SourceAccessConfigurationProperty):
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.SourceAccessConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ScalingConfigProperty {
    public fun maximumConcurrency(): Number? = unwrap(this).getMaximumConcurrency()

    public interface Builder {
      public fun maximumConcurrency(maximumConcurrency: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.ScalingConfigProperty.Builder
          =
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.ScalingConfigProperty.builder()

      override fun maximumConcurrency(maximumConcurrency: Number) {
        cdkBuilder.maximumConcurrency(maximumConcurrency)
      }

      public fun build():
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.ScalingConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.ScalingConfigProperty,
    ) : ScalingConfigProperty {
      override fun maximumConcurrency(): Number? = unwrap(this).getMaximumConcurrency()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ScalingConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnEventSourceMapping.ScalingConfigProperty):
          ScalingConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScalingConfigProperty):
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.ScalingConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface DocumentDBEventSourceConfigProperty {
    public fun collectionName(): String? = unwrap(this).getCollectionName()

    public fun databaseName(): String? = unwrap(this).getDatabaseName()

    public fun fullDocument(): String? = unwrap(this).getFullDocument()

    public interface Builder {
      public fun collectionName(collectionName: String)

      public fun databaseName(databaseName: String)

      public fun fullDocument(fullDocument: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.DocumentDBEventSourceConfigProperty.Builder
          =
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.DocumentDBEventSourceConfigProperty.builder()

      override fun collectionName(collectionName: String) {
        cdkBuilder.collectionName(collectionName)
      }

      override fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
      }

      override fun fullDocument(fullDocument: String) {
        cdkBuilder.fullDocument(fullDocument)
      }

      public fun build():
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.DocumentDBEventSourceConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.DocumentDBEventSourceConfigProperty,
    ) : DocumentDBEventSourceConfigProperty {
      override fun collectionName(): String? = unwrap(this).getCollectionName()

      override fun databaseName(): String? = unwrap(this).getDatabaseName()

      override fun fullDocument(): String? = unwrap(this).getFullDocument()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          DocumentDBEventSourceConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnEventSourceMapping.DocumentDBEventSourceConfigProperty):
          DocumentDBEventSourceConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DocumentDBEventSourceConfigProperty):
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.DocumentDBEventSourceConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface EndpointsProperty {
    public fun kafkaBootstrapServers(): List<String> = unwrap(this).getKafkaBootstrapServers() ?:
        emptyList()

    public interface Builder {
      public fun kafkaBootstrapServers(kafkaBootstrapServers: List<String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.EndpointsProperty.Builder =
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.EndpointsProperty.builder()

      override fun kafkaBootstrapServers(kafkaBootstrapServers: List<String>) {
        cdkBuilder.kafkaBootstrapServers(kafkaBootstrapServers)
      }

      public fun build():
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.EndpointsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.EndpointsProperty,
    ) : EndpointsProperty {
      override fun kafkaBootstrapServers(): List<String> = unwrap(this).getKafkaBootstrapServers()
          ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EndpointsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnEventSourceMapping.EndpointsProperty):
          EndpointsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EndpointsProperty):
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.EndpointsProperty = (wrapped
          as Wrapper).cdkObject
    }
  }
}
