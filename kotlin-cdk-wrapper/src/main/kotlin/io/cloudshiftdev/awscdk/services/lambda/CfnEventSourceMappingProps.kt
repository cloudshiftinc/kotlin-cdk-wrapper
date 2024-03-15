@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnEventSourceMappingProps {
  public fun amazonManagedKafkaEventSourceConfig(): Any? =
      unwrap(this).getAmazonManagedKafkaEventSourceConfig()

  public fun batchSize(): Number? = unwrap(this).getBatchSize()

  public fun bisectBatchOnFunctionError(): Any? = unwrap(this).getBisectBatchOnFunctionError()

  public fun destinationConfig(): Any? = unwrap(this).getDestinationConfig()

  public fun documentDbEventSourceConfig(): Any? = unwrap(this).getDocumentDbEventSourceConfig()

  public fun enabled(): Any? = unwrap(this).getEnabled()

  public fun eventSourceArn(): String? = unwrap(this).getEventSourceArn()

  public fun filterCriteria(): Any? = unwrap(this).getFilterCriteria()

  public fun functionName(): String

  public fun functionResponseTypes(): List<String> = unwrap(this).getFunctionResponseTypes() ?:
      emptyList()

  public fun maximumBatchingWindowInSeconds(): Number? =
      unwrap(this).getMaximumBatchingWindowInSeconds()

  public fun maximumRecordAgeInSeconds(): Number? = unwrap(this).getMaximumRecordAgeInSeconds()

  public fun maximumRetryAttempts(): Number? = unwrap(this).getMaximumRetryAttempts()

  public fun parallelizationFactor(): Number? = unwrap(this).getParallelizationFactor()

  public fun queues(): List<String> = unwrap(this).getQueues() ?: emptyList()

  public fun scalingConfig(): Any? = unwrap(this).getScalingConfig()

  public fun selfManagedEventSource(): Any? = unwrap(this).getSelfManagedEventSource()

  public fun selfManagedKafkaEventSourceConfig(): Any? =
      unwrap(this).getSelfManagedKafkaEventSourceConfig()

  public fun sourceAccessConfigurations(): Any? = unwrap(this).getSourceAccessConfigurations()

  public fun startingPosition(): String? = unwrap(this).getStartingPosition()

  public fun startingPositionTimestamp(): Number? = unwrap(this).getStartingPositionTimestamp()

  public fun topics(): List<String> = unwrap(this).getTopics() ?: emptyList()

  public fun tumblingWindowInSeconds(): Number? = unwrap(this).getTumblingWindowInSeconds()

  @CdkDslMarker
  public interface Builder {
    public fun amazonManagedKafkaEventSourceConfig(amazonManagedKafkaEventSourceConfig: IResolvable)

    public
        fun amazonManagedKafkaEventSourceConfig(amazonManagedKafkaEventSourceConfig: CfnEventSourceMapping.AmazonManagedKafkaEventSourceConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("aee9284c4da4983caa97612e7b01c42241967f360aa7dd95373593dc8311c6aa")
    public
        fun amazonManagedKafkaEventSourceConfig(amazonManagedKafkaEventSourceConfig: CfnEventSourceMapping.AmazonManagedKafkaEventSourceConfigProperty.Builder.() -> Unit)

    public fun batchSize(batchSize: Number)

    public fun bisectBatchOnFunctionError(bisectBatchOnFunctionError: Boolean)

    public fun bisectBatchOnFunctionError(bisectBatchOnFunctionError: IResolvable)

    public fun destinationConfig(destinationConfig: IResolvable)

    public fun destinationConfig(destinationConfig: CfnEventSourceMapping.DestinationConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fb5cce258aa75796eb59a269c1fef538aacd71fcc93528503b2b03792d5f23f4")
    public
        fun destinationConfig(destinationConfig: CfnEventSourceMapping.DestinationConfigProperty.Builder.() -> Unit)

    public fun documentDbEventSourceConfig(documentDbEventSourceConfig: IResolvable)

    public
        fun documentDbEventSourceConfig(documentDbEventSourceConfig: CfnEventSourceMapping.DocumentDBEventSourceConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d09fb314ca9893c0049527cb14bf2c10d2ff9b3b75d94621775da00c0e2ba4e7")
    public
        fun documentDbEventSourceConfig(documentDbEventSourceConfig: CfnEventSourceMapping.DocumentDBEventSourceConfigProperty.Builder.() -> Unit)

    public fun enabled(enabled: Boolean)

    public fun enabled(enabled: IResolvable)

    public fun eventSourceArn(eventSourceArn: String)

    public fun filterCriteria(filterCriteria: IResolvable)

    public fun filterCriteria(filterCriteria: CfnEventSourceMapping.FilterCriteriaProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("64d63e409c55293cf7b59494387d9651b3d5c3761ad44584ecbc98ce165317b3")
    public
        fun filterCriteria(filterCriteria: CfnEventSourceMapping.FilterCriteriaProperty.Builder.() -> Unit)

    public fun functionName(functionName: String)

    public fun functionResponseTypes(functionResponseTypes: List<String>)

    public fun functionResponseTypes(vararg functionResponseTypes: String)

    public fun maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds: Number)

    public fun maximumRecordAgeInSeconds(maximumRecordAgeInSeconds: Number)

    public fun maximumRetryAttempts(maximumRetryAttempts: Number)

    public fun parallelizationFactor(parallelizationFactor: Number)

    public fun queues(queues: List<String>)

    public fun queues(vararg queues: String)

    public fun scalingConfig(scalingConfig: IResolvable)

    public fun scalingConfig(scalingConfig: CfnEventSourceMapping.ScalingConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7ac8a6eb426933fb2b88b6b01a6b43a8fc38a35b3ca922d3fffb4555c7fc2d5e")
    public
        fun scalingConfig(scalingConfig: CfnEventSourceMapping.ScalingConfigProperty.Builder.() -> Unit)

    public fun selfManagedEventSource(selfManagedEventSource: IResolvable)

    public
        fun selfManagedEventSource(selfManagedEventSource: CfnEventSourceMapping.SelfManagedEventSourceProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("feb957a59dc8c21d665025789b750dee782b2a8aa37584acb897dbc5107c9aea")
    public
        fun selfManagedEventSource(selfManagedEventSource: CfnEventSourceMapping.SelfManagedEventSourceProperty.Builder.() -> Unit)

    public fun selfManagedKafkaEventSourceConfig(selfManagedKafkaEventSourceConfig: IResolvable)

    public
        fun selfManagedKafkaEventSourceConfig(selfManagedKafkaEventSourceConfig: CfnEventSourceMapping.SelfManagedKafkaEventSourceConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fb4feb2b9834757a9de4c9819fab63badbd08a0b7d2d0f13a526f333ee91a347")
    public
        fun selfManagedKafkaEventSourceConfig(selfManagedKafkaEventSourceConfig: CfnEventSourceMapping.SelfManagedKafkaEventSourceConfigProperty.Builder.() -> Unit)

    public fun sourceAccessConfigurations(sourceAccessConfigurations: IResolvable)

    public fun sourceAccessConfigurations(sourceAccessConfigurations: List<Any>)

    public fun sourceAccessConfigurations(vararg sourceAccessConfigurations: Any)

    public fun startingPosition(startingPosition: String)

    public fun startingPositionTimestamp(startingPositionTimestamp: Number)

    public fun topics(topics: List<String>)

    public fun topics(vararg topics: String)

    public fun tumblingWindowInSeconds(tumblingWindowInSeconds: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.lambda.CfnEventSourceMappingProps.Builder =
        software.amazon.awscdk.services.lambda.CfnEventSourceMappingProps.builder()

    override
        fun amazonManagedKafkaEventSourceConfig(amazonManagedKafkaEventSourceConfig: IResolvable) {
      cdkBuilder.amazonManagedKafkaEventSourceConfig(amazonManagedKafkaEventSourceConfig.let(IResolvable::unwrap))
    }

    override
        fun amazonManagedKafkaEventSourceConfig(amazonManagedKafkaEventSourceConfig: CfnEventSourceMapping.AmazonManagedKafkaEventSourceConfigProperty) {
      cdkBuilder.amazonManagedKafkaEventSourceConfig(amazonManagedKafkaEventSourceConfig.let(CfnEventSourceMapping.AmazonManagedKafkaEventSourceConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("aee9284c4da4983caa97612e7b01c42241967f360aa7dd95373593dc8311c6aa")
    override
        fun amazonManagedKafkaEventSourceConfig(amazonManagedKafkaEventSourceConfig: CfnEventSourceMapping.AmazonManagedKafkaEventSourceConfigProperty.Builder.() -> Unit):
        Unit =
        amazonManagedKafkaEventSourceConfig(CfnEventSourceMapping.AmazonManagedKafkaEventSourceConfigProperty(amazonManagedKafkaEventSourceConfig))

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

    override
        fun destinationConfig(destinationConfig: CfnEventSourceMapping.DestinationConfigProperty) {
      cdkBuilder.destinationConfig(destinationConfig.let(CfnEventSourceMapping.DestinationConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fb5cce258aa75796eb59a269c1fef538aacd71fcc93528503b2b03792d5f23f4")
    override
        fun destinationConfig(destinationConfig: CfnEventSourceMapping.DestinationConfigProperty.Builder.() -> Unit):
        Unit = destinationConfig(CfnEventSourceMapping.DestinationConfigProperty(destinationConfig))

    override fun documentDbEventSourceConfig(documentDbEventSourceConfig: IResolvable) {
      cdkBuilder.documentDbEventSourceConfig(documentDbEventSourceConfig.let(IResolvable::unwrap))
    }

    override
        fun documentDbEventSourceConfig(documentDbEventSourceConfig: CfnEventSourceMapping.DocumentDBEventSourceConfigProperty) {
      cdkBuilder.documentDbEventSourceConfig(documentDbEventSourceConfig.let(CfnEventSourceMapping.DocumentDBEventSourceConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d09fb314ca9893c0049527cb14bf2c10d2ff9b3b75d94621775da00c0e2ba4e7")
    override
        fun documentDbEventSourceConfig(documentDbEventSourceConfig: CfnEventSourceMapping.DocumentDBEventSourceConfigProperty.Builder.() -> Unit):
        Unit =
        documentDbEventSourceConfig(CfnEventSourceMapping.DocumentDBEventSourceConfigProperty(documentDbEventSourceConfig))

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

    override fun filterCriteria(filterCriteria: CfnEventSourceMapping.FilterCriteriaProperty) {
      cdkBuilder.filterCriteria(filterCriteria.let(CfnEventSourceMapping.FilterCriteriaProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("64d63e409c55293cf7b59494387d9651b3d5c3761ad44584ecbc98ce165317b3")
    override
        fun filterCriteria(filterCriteria: CfnEventSourceMapping.FilterCriteriaProperty.Builder.() -> Unit):
        Unit = filterCriteria(CfnEventSourceMapping.FilterCriteriaProperty(filterCriteria))

    override fun functionName(functionName: String) {
      cdkBuilder.functionName(functionName)
    }

    override fun functionResponseTypes(functionResponseTypes: List<String>) {
      cdkBuilder.functionResponseTypes(functionResponseTypes)
    }

    override fun functionResponseTypes(vararg functionResponseTypes: String): Unit =
        functionResponseTypes(functionResponseTypes.toList())

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

    override fun queues(vararg queues: String): Unit = queues(queues.toList())

    override fun scalingConfig(scalingConfig: IResolvable) {
      cdkBuilder.scalingConfig(scalingConfig.let(IResolvable::unwrap))
    }

    override fun scalingConfig(scalingConfig: CfnEventSourceMapping.ScalingConfigProperty) {
      cdkBuilder.scalingConfig(scalingConfig.let(CfnEventSourceMapping.ScalingConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7ac8a6eb426933fb2b88b6b01a6b43a8fc38a35b3ca922d3fffb4555c7fc2d5e")
    override
        fun scalingConfig(scalingConfig: CfnEventSourceMapping.ScalingConfigProperty.Builder.() -> Unit):
        Unit = scalingConfig(CfnEventSourceMapping.ScalingConfigProperty(scalingConfig))

    override fun selfManagedEventSource(selfManagedEventSource: IResolvable) {
      cdkBuilder.selfManagedEventSource(selfManagedEventSource.let(IResolvable::unwrap))
    }

    override
        fun selfManagedEventSource(selfManagedEventSource: CfnEventSourceMapping.SelfManagedEventSourceProperty) {
      cdkBuilder.selfManagedEventSource(selfManagedEventSource.let(CfnEventSourceMapping.SelfManagedEventSourceProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("feb957a59dc8c21d665025789b750dee782b2a8aa37584acb897dbc5107c9aea")
    override
        fun selfManagedEventSource(selfManagedEventSource: CfnEventSourceMapping.SelfManagedEventSourceProperty.Builder.() -> Unit):
        Unit =
        selfManagedEventSource(CfnEventSourceMapping.SelfManagedEventSourceProperty(selfManagedEventSource))

    override fun selfManagedKafkaEventSourceConfig(selfManagedKafkaEventSourceConfig: IResolvable) {
      cdkBuilder.selfManagedKafkaEventSourceConfig(selfManagedKafkaEventSourceConfig.let(IResolvable::unwrap))
    }

    override
        fun selfManagedKafkaEventSourceConfig(selfManagedKafkaEventSourceConfig: CfnEventSourceMapping.SelfManagedKafkaEventSourceConfigProperty) {
      cdkBuilder.selfManagedKafkaEventSourceConfig(selfManagedKafkaEventSourceConfig.let(CfnEventSourceMapping.SelfManagedKafkaEventSourceConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fb4feb2b9834757a9de4c9819fab63badbd08a0b7d2d0f13a526f333ee91a347")
    override
        fun selfManagedKafkaEventSourceConfig(selfManagedKafkaEventSourceConfig: CfnEventSourceMapping.SelfManagedKafkaEventSourceConfigProperty.Builder.() -> Unit):
        Unit =
        selfManagedKafkaEventSourceConfig(CfnEventSourceMapping.SelfManagedKafkaEventSourceConfigProperty(selfManagedKafkaEventSourceConfig))

    override fun sourceAccessConfigurations(sourceAccessConfigurations: IResolvable) {
      cdkBuilder.sourceAccessConfigurations(sourceAccessConfigurations.let(IResolvable::unwrap))
    }

    override fun sourceAccessConfigurations(sourceAccessConfigurations: List<Any>) {
      cdkBuilder.sourceAccessConfigurations(sourceAccessConfigurations)
    }

    override fun sourceAccessConfigurations(vararg sourceAccessConfigurations: Any): Unit =
        sourceAccessConfigurations(sourceAccessConfigurations.toList())

    override fun startingPosition(startingPosition: String) {
      cdkBuilder.startingPosition(startingPosition)
    }

    override fun startingPositionTimestamp(startingPositionTimestamp: Number) {
      cdkBuilder.startingPositionTimestamp(startingPositionTimestamp)
    }

    override fun topics(topics: List<String>) {
      cdkBuilder.topics(topics)
    }

    override fun topics(vararg topics: String): Unit = topics(topics.toList())

    override fun tumblingWindowInSeconds(tumblingWindowInSeconds: Number) {
      cdkBuilder.tumblingWindowInSeconds(tumblingWindowInSeconds)
    }

    public fun build(): software.amazon.awscdk.services.lambda.CfnEventSourceMappingProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lambda.CfnEventSourceMappingProps,
  ) : CdkObject(cdkObject), CfnEventSourceMappingProps {
    override fun amazonManagedKafkaEventSourceConfig(): Any? =
        unwrap(this).getAmazonManagedKafkaEventSourceConfig()

    override fun batchSize(): Number? = unwrap(this).getBatchSize()

    override fun bisectBatchOnFunctionError(): Any? = unwrap(this).getBisectBatchOnFunctionError()

    override fun destinationConfig(): Any? = unwrap(this).getDestinationConfig()

    override fun documentDbEventSourceConfig(): Any? = unwrap(this).getDocumentDbEventSourceConfig()

    override fun enabled(): Any? = unwrap(this).getEnabled()

    override fun eventSourceArn(): String? = unwrap(this).getEventSourceArn()

    override fun filterCriteria(): Any? = unwrap(this).getFilterCriteria()

    override fun functionName(): String = unwrap(this).getFunctionName()

    override fun functionResponseTypes(): List<String> = unwrap(this).getFunctionResponseTypes() ?:
        emptyList()

    override fun maximumBatchingWindowInSeconds(): Number? =
        unwrap(this).getMaximumBatchingWindowInSeconds()

    override fun maximumRecordAgeInSeconds(): Number? = unwrap(this).getMaximumRecordAgeInSeconds()

    override fun maximumRetryAttempts(): Number? = unwrap(this).getMaximumRetryAttempts()

    override fun parallelizationFactor(): Number? = unwrap(this).getParallelizationFactor()

    override fun queues(): List<String> = unwrap(this).getQueues() ?: emptyList()

    override fun scalingConfig(): Any? = unwrap(this).getScalingConfig()

    override fun selfManagedEventSource(): Any? = unwrap(this).getSelfManagedEventSource()

    override fun selfManagedKafkaEventSourceConfig(): Any? =
        unwrap(this).getSelfManagedKafkaEventSourceConfig()

    override fun sourceAccessConfigurations(): Any? = unwrap(this).getSourceAccessConfigurations()

    override fun startingPosition(): String? = unwrap(this).getStartingPosition()

    override fun startingPositionTimestamp(): Number? = unwrap(this).getStartingPositionTimestamp()

    override fun topics(): List<String> = unwrap(this).getTopics() ?: emptyList()

    override fun tumblingWindowInSeconds(): Number? = unwrap(this).getTumblingWindowInSeconds()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEventSourceMappingProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnEventSourceMappingProps):
        CfnEventSourceMappingProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEventSourceMappingProps):
        software.amazon.awscdk.services.lambda.CfnEventSourceMappingProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.lambda.CfnEventSourceMappingProps
  }
}
