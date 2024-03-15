@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda.eventsources

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.lambda.IEventSourceDlq
import io.cloudshiftdev.awscdk.services.lambda.IFunction
import io.cloudshiftdev.awscdk.services.lambda.StartingPosition
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import io.cloudshiftdev.awscdk.services.dynamodb.ITable as CloudshiftdevAwscdkServicesDynamodbITable
import software.amazon.awscdk.services.dynamodb.ITable as AmazonAwscdkServicesDynamodbITable

public open class DynamoEventSource internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.lambda.eventsources.DynamoEventSource,
) : StreamEventSource(cdkObject) {
  public override fun bind(target: IFunction) {
    unwrap(this).bind(target.let(IFunction::unwrap))
  }

  public open fun eventSourceMappingArn(): String = unwrap(this).getEventSourceMappingArn()

  public open fun eventSourceMappingId(): String = unwrap(this).getEventSourceMappingId()

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

  private class BuilderImpl(
    table: AmazonAwscdkServicesDynamodbITable,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.lambda.eventsources.DynamoEventSource.Builder =
        software.amazon.awscdk.services.lambda.eventsources.DynamoEventSource.Builder.create(table)

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

    public fun build(): software.amazon.awscdk.services.lambda.eventsources.DynamoEventSource =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(table: CloudshiftdevAwscdkServicesDynamodbITable,
        block: Builder.() -> Unit = {}): DynamoEventSource {
      val builderImpl = BuilderImpl(CloudshiftdevAwscdkServicesDynamodbITable.unwrap(table))
      return DynamoEventSource(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.lambda.eventsources.DynamoEventSource):
        DynamoEventSource = DynamoEventSource(cdkObject)

    internal fun unwrap(wrapped: DynamoEventSource):
        software.amazon.awscdk.services.lambda.eventsources.DynamoEventSource = wrapped.cdkObject
  }
}
