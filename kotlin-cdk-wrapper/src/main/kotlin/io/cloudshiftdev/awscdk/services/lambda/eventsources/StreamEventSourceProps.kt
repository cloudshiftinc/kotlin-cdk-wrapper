@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda.eventsources

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.lambda.IEventSourceDlq
import io.cloudshiftdev.awscdk.services.lambda.StartingPosition
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface StreamEventSourceProps : BaseStreamEventSourceProps {
  public fun bisectBatchOnError(): Boolean? = unwrap(this).getBisectBatchOnError()

  public fun filters(): List<Map<String, Any>> = unwrap(this).getFilters() ?: emptyList()

  public fun maxRecordAge(): Duration? = unwrap(this).getMaxRecordAge()?.let(Duration::wrap)

  public fun onFailure(): IEventSourceDlq? = unwrap(this).getOnFailure()?.let(IEventSourceDlq::wrap)

  public fun parallelizationFactor(): Number? = unwrap(this).getParallelizationFactor()

  public fun reportBatchItemFailures(): Boolean? = unwrap(this).getReportBatchItemFailures()

  public fun retryAttempts(): Number? = unwrap(this).getRetryAttempts()

  public fun tumblingWindow(): Duration? = unwrap(this).getTumblingWindow()?.let(Duration::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun batchSize(batchSize: Number)

    public fun bisectBatchOnError(bisectBatchOnError: Boolean)

    public fun enabled(enabled: Boolean)

    public fun filters(filters: List<Map<String, Any>>)

    public fun filters(vararg filters: Map<String, Any>)

    public fun maxBatchingWindow(maxBatchingWindow: Duration)

    public fun maxRecordAge(maxRecordAge: Duration)

    public fun onFailure(onFailure: IEventSourceDlq)

    public fun parallelizationFactor(parallelizationFactor: Number)

    public fun reportBatchItemFailures(reportBatchItemFailures: Boolean)

    public fun retryAttempts(retryAttempts: Number)

    public fun startingPosition(startingPosition: StartingPosition)

    public fun tumblingWindow(tumblingWindow: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.lambda.eventsources.StreamEventSourceProps.Builder =
        software.amazon.awscdk.services.lambda.eventsources.StreamEventSourceProps.builder()

    override fun batchSize(batchSize: Number) {
      cdkBuilder.batchSize(batchSize)
    }

    override fun bisectBatchOnError(bisectBatchOnError: Boolean) {
      cdkBuilder.bisectBatchOnError(bisectBatchOnError)
    }

    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    override fun filters(filters: List<Map<String, Any>>) {
      cdkBuilder.filters(filters)
    }

    override fun filters(vararg filters: Map<String, Any>): Unit = filters(filters.toList())

    override fun maxBatchingWindow(maxBatchingWindow: Duration) {
      cdkBuilder.maxBatchingWindow(maxBatchingWindow.let(Duration::unwrap))
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

    override fun startingPosition(startingPosition: StartingPosition) {
      cdkBuilder.startingPosition(startingPosition.let(StartingPosition::unwrap))
    }

    override fun tumblingWindow(tumblingWindow: Duration) {
      cdkBuilder.tumblingWindow(tumblingWindow.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.lambda.eventsources.StreamEventSourceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.lambda.eventsources.StreamEventSourceProps,
  ) : CdkObject(cdkObject), StreamEventSourceProps {
    override fun batchSize(): Number? = unwrap(this).getBatchSize()

    override fun bisectBatchOnError(): Boolean? = unwrap(this).getBisectBatchOnError()

    override fun enabled(): Boolean? = unwrap(this).getEnabled()

    override fun filters(): List<Map<String, Any>> = unwrap(this).getFilters() ?: emptyList()

    override fun maxBatchingWindow(): Duration? =
        unwrap(this).getMaxBatchingWindow()?.let(Duration::wrap)

    override fun maxRecordAge(): Duration? = unwrap(this).getMaxRecordAge()?.let(Duration::wrap)

    override fun onFailure(): IEventSourceDlq? =
        unwrap(this).getOnFailure()?.let(IEventSourceDlq::wrap)

    override fun parallelizationFactor(): Number? = unwrap(this).getParallelizationFactor()

    override fun reportBatchItemFailures(): Boolean? = unwrap(this).getReportBatchItemFailures()

    override fun retryAttempts(): Number? = unwrap(this).getRetryAttempts()

    override fun startingPosition(): StartingPosition =
        unwrap(this).getStartingPosition().let(StartingPosition::wrap)

    override fun tumblingWindow(): Duration? = unwrap(this).getTumblingWindow()?.let(Duration::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): StreamEventSourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.lambda.eventsources.StreamEventSourceProps):
        StreamEventSourceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: StreamEventSourceProps):
        software.amazon.awscdk.services.lambda.eventsources.StreamEventSourceProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.lambda.eventsources.StreamEventSourceProps
  }
}
