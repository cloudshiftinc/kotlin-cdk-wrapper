@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface EventSourceMappingOptions {
  public fun batchSize(): Number? = unwrap(this).getBatchSize()

  public fun bisectBatchOnError(): Boolean? = unwrap(this).getBisectBatchOnError()

  public fun enabled(): Boolean? = unwrap(this).getEnabled()

  public fun eventSourceArn(): String? = unwrap(this).getEventSourceArn()

  public fun filters(): List<Map<String, Any>> = unwrap(this).getFilters() ?: emptyList()

  public fun kafkaBootstrapServers(): List<String> = unwrap(this).getKafkaBootstrapServers() ?:
      emptyList()

  public fun kafkaConsumerGroupId(): String? = unwrap(this).getKafkaConsumerGroupId()

  public fun kafkaTopic(): String? = unwrap(this).getKafkaTopic()

  public fun maxBatchingWindow(): Duration? =
      unwrap(this).getMaxBatchingWindow()?.let(Duration::wrap)

  public fun maxConcurrency(): Number? = unwrap(this).getMaxConcurrency()

  public fun maxRecordAge(): Duration? = unwrap(this).getMaxRecordAge()?.let(Duration::wrap)

  public fun onFailure(): IEventSourceDlq? = unwrap(this).getOnFailure()?.let(IEventSourceDlq::wrap)

  public fun parallelizationFactor(): Number? = unwrap(this).getParallelizationFactor()

  public fun reportBatchItemFailures(): Boolean? = unwrap(this).getReportBatchItemFailures()

  public fun retryAttempts(): Number? = unwrap(this).getRetryAttempts()

  public fun sourceAccessConfigurations(): List<SourceAccessConfiguration> =
      unwrap(this).getSourceAccessConfigurations()?.map(SourceAccessConfiguration::wrap) ?:
      emptyList()

  public fun startingPosition(): StartingPosition? =
      unwrap(this).getStartingPosition()?.let(StartingPosition::wrap)

  public fun startingPositionTimestamp(): Number? = unwrap(this).getStartingPositionTimestamp()

  public fun supportS3OnFailureDestination(): Boolean? =
      unwrap(this).getSupportS3OnFailureDestination()

  public fun tumblingWindow(): Duration? = unwrap(this).getTumblingWindow()?.let(Duration::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun batchSize(batchSize: Number)

    public fun bisectBatchOnError(bisectBatchOnError: Boolean)

    public fun enabled(enabled: Boolean)

    public fun eventSourceArn(eventSourceArn: String)

    public fun filters(filters: List<Map<String, Any>>)

    public fun filters(vararg filters: Map<String, Any>)

    public fun kafkaBootstrapServers(kafkaBootstrapServers: List<String>)

    public fun kafkaBootstrapServers(vararg kafkaBootstrapServers: String)

    public fun kafkaConsumerGroupId(kafkaConsumerGroupId: String)

    public fun kafkaTopic(kafkaTopic: String)

    public fun maxBatchingWindow(maxBatchingWindow: Duration)

    public fun maxConcurrency(maxConcurrency: Number)

    public fun maxRecordAge(maxRecordAge: Duration)

    public fun onFailure(onFailure: IEventSourceDlq)

    public fun parallelizationFactor(parallelizationFactor: Number)

    public fun reportBatchItemFailures(reportBatchItemFailures: Boolean)

    public fun retryAttempts(retryAttempts: Number)

    public
        fun sourceAccessConfigurations(sourceAccessConfigurations: List<SourceAccessConfiguration>)

    public fun sourceAccessConfigurations(vararg
        sourceAccessConfigurations: SourceAccessConfiguration)

    public fun startingPosition(startingPosition: StartingPosition)

    public fun startingPositionTimestamp(startingPositionTimestamp: Number)

    public fun supportS3OnFailureDestination(supportS3OnFailureDestination: Boolean)

    public fun tumblingWindow(tumblingWindow: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.EventSourceMappingOptions.Builder
        = software.amazon.awscdk.services.lambda.EventSourceMappingOptions.builder()

    override fun batchSize(batchSize: Number) {
      cdkBuilder.batchSize(batchSize)
    }

    override fun bisectBatchOnError(bisectBatchOnError: Boolean) {
      cdkBuilder.bisectBatchOnError(bisectBatchOnError)
    }

    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    override fun eventSourceArn(eventSourceArn: String) {
      cdkBuilder.eventSourceArn(eventSourceArn)
    }

    override fun filters(filters: List<Map<String, Any>>) {
      cdkBuilder.filters(filters)
    }

    override fun filters(vararg filters: Map<String, Any>): Unit = filters(filters.toList())

    override fun kafkaBootstrapServers(kafkaBootstrapServers: List<String>) {
      cdkBuilder.kafkaBootstrapServers(kafkaBootstrapServers)
    }

    override fun kafkaBootstrapServers(vararg kafkaBootstrapServers: String): Unit =
        kafkaBootstrapServers(kafkaBootstrapServers.toList())

    override fun kafkaConsumerGroupId(kafkaConsumerGroupId: String) {
      cdkBuilder.kafkaConsumerGroupId(kafkaConsumerGroupId)
    }

    override fun kafkaTopic(kafkaTopic: String) {
      cdkBuilder.kafkaTopic(kafkaTopic)
    }

    override fun maxBatchingWindow(maxBatchingWindow: Duration) {
      cdkBuilder.maxBatchingWindow(maxBatchingWindow.let(Duration::unwrap))
    }

    override fun maxConcurrency(maxConcurrency: Number) {
      cdkBuilder.maxConcurrency(maxConcurrency)
    }

    override fun maxRecordAge(maxRecordAge: Duration) {
      cdkBuilder.maxRecordAge(maxRecordAge.let(Duration::unwrap))
    }

    override fun onFailure(onFailure: IEventSourceDlq) {
      cdkBuilder.onFailure(onFailure.let(IEventSourceDlq::unwrap))
    }

    override fun parallelizationFactor(parallelizationFactor: Number) {
      cdkBuilder.parallelizationFactor(parallelizationFactor)
    }

    override fun reportBatchItemFailures(reportBatchItemFailures: Boolean) {
      cdkBuilder.reportBatchItemFailures(reportBatchItemFailures)
    }

    override fun retryAttempts(retryAttempts: Number) {
      cdkBuilder.retryAttempts(retryAttempts)
    }

    override
        fun sourceAccessConfigurations(sourceAccessConfigurations: List<SourceAccessConfiguration>) {
      cdkBuilder.sourceAccessConfigurations(sourceAccessConfigurations.map(SourceAccessConfiguration::unwrap))
    }

    override fun sourceAccessConfigurations(vararg
        sourceAccessConfigurations: SourceAccessConfiguration): Unit =
        sourceAccessConfigurations(sourceAccessConfigurations.toList())

    override fun startingPosition(startingPosition: StartingPosition) {
      cdkBuilder.startingPosition(startingPosition.let(StartingPosition::unwrap))
    }

    override fun startingPositionTimestamp(startingPositionTimestamp: Number) {
      cdkBuilder.startingPositionTimestamp(startingPositionTimestamp)
    }

    override fun supportS3OnFailureDestination(supportS3OnFailureDestination: Boolean) {
      cdkBuilder.supportS3OnFailureDestination(supportS3OnFailureDestination)
    }

    override fun tumblingWindow(tumblingWindow: Duration) {
      cdkBuilder.tumblingWindow(tumblingWindow.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.lambda.EventSourceMappingOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lambda.EventSourceMappingOptions,
  ) : CdkObject(cdkObject), EventSourceMappingOptions {
    override fun batchSize(): Number? = unwrap(this).getBatchSize()

    override fun bisectBatchOnError(): Boolean? = unwrap(this).getBisectBatchOnError()

    override fun enabled(): Boolean? = unwrap(this).getEnabled()

    override fun eventSourceArn(): String? = unwrap(this).getEventSourceArn()

    override fun filters(): List<Map<String, Any>> = unwrap(this).getFilters() ?: emptyList()

    override fun kafkaBootstrapServers(): List<String> = unwrap(this).getKafkaBootstrapServers() ?:
        emptyList()

    override fun kafkaConsumerGroupId(): String? = unwrap(this).getKafkaConsumerGroupId()

    override fun kafkaTopic(): String? = unwrap(this).getKafkaTopic()

    override fun maxBatchingWindow(): Duration? =
        unwrap(this).getMaxBatchingWindow()?.let(Duration::wrap)

    override fun maxConcurrency(): Number? = unwrap(this).getMaxConcurrency()

    override fun maxRecordAge(): Duration? = unwrap(this).getMaxRecordAge()?.let(Duration::wrap)

    override fun onFailure(): IEventSourceDlq? =
        unwrap(this).getOnFailure()?.let(IEventSourceDlq::wrap)

    override fun parallelizationFactor(): Number? = unwrap(this).getParallelizationFactor()

    override fun reportBatchItemFailures(): Boolean? = unwrap(this).getReportBatchItemFailures()

    override fun retryAttempts(): Number? = unwrap(this).getRetryAttempts()

    override fun sourceAccessConfigurations(): List<SourceAccessConfiguration> =
        unwrap(this).getSourceAccessConfigurations()?.map(SourceAccessConfiguration::wrap) ?:
        emptyList()

    override fun startingPosition(): StartingPosition? =
        unwrap(this).getStartingPosition()?.let(StartingPosition::wrap)

    override fun startingPositionTimestamp(): Number? = unwrap(this).getStartingPositionTimestamp()

    override fun supportS3OnFailureDestination(): Boolean? =
        unwrap(this).getSupportS3OnFailureDestination()

    override fun tumblingWindow(): Duration? = unwrap(this).getTumblingWindow()?.let(Duration::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EventSourceMappingOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.EventSourceMappingOptions):
        EventSourceMappingOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EventSourceMappingOptions):
        software.amazon.awscdk.services.lambda.EventSourceMappingOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.lambda.EventSourceMappingOptions
  }
}
