@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda.eventsources

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

public interface SqsEventSourceProps {
  public fun batchSize(): Number? = unwrap(this).getBatchSize()

  public fun enabled(): Boolean? = unwrap(this).getEnabled()

  public fun filters(): List<Map<String, Any>> = unwrap(this).getFilters() ?: emptyList()

  public fun maxBatchingWindow(): Duration? =
      unwrap(this).getMaxBatchingWindow()?.let(Duration::wrap)

  public fun maxConcurrency(): Number? = unwrap(this).getMaxConcurrency()

  public fun reportBatchItemFailures(): Boolean? = unwrap(this).getReportBatchItemFailures()

  @CdkDslMarker
  public interface Builder {
    public fun batchSize(batchSize: Number)

    public fun enabled(enabled: Boolean)

    public fun filters(filters: List<Map<String, Any>>)

    public fun filters(vararg filters: Map<String, Any>)

    public fun maxBatchingWindow(maxBatchingWindow: Duration)

    public fun maxConcurrency(maxConcurrency: Number)

    public fun reportBatchItemFailures(reportBatchItemFailures: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.lambda.eventsources.SqsEventSourceProps.Builder =
        software.amazon.awscdk.services.lambda.eventsources.SqsEventSourceProps.builder()

    override fun batchSize(batchSize: Number) {
      cdkBuilder.batchSize(batchSize)
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

    override fun maxConcurrency(maxConcurrency: Number) {
      cdkBuilder.maxConcurrency(maxConcurrency)
    }

    override fun reportBatchItemFailures(reportBatchItemFailures: Boolean) {
      cdkBuilder.reportBatchItemFailures(reportBatchItemFailures)
    }

    public fun build(): software.amazon.awscdk.services.lambda.eventsources.SqsEventSourceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lambda.eventsources.SqsEventSourceProps,
  ) : CdkObject(cdkObject), SqsEventSourceProps {
    override fun batchSize(): Number? = unwrap(this).getBatchSize()

    override fun enabled(): Boolean? = unwrap(this).getEnabled()

    override fun filters(): List<Map<String, Any>> = unwrap(this).getFilters() ?: emptyList()

    override fun maxBatchingWindow(): Duration? =
        unwrap(this).getMaxBatchingWindow()?.let(Duration::wrap)

    override fun maxConcurrency(): Number? = unwrap(this).getMaxConcurrency()

    override fun reportBatchItemFailures(): Boolean? = unwrap(this).getReportBatchItemFailures()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SqsEventSourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.lambda.eventsources.SqsEventSourceProps):
        SqsEventSourceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SqsEventSourceProps):
        software.amazon.awscdk.services.lambda.eventsources.SqsEventSourceProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.lambda.eventsources.SqsEventSourceProps
  }
}
