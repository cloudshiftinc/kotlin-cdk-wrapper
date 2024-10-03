@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda.eventsources

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.awscdk.services.lambda.IEventSource
import io.cloudshiftdev.awscdk.services.lambda.IFunction
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import io.cloudshiftdev.awscdk.services.sqs.IQueue as CloudshiftdevAwscdkServicesSqsIQueue
import software.amazon.awscdk.services.sqs.IQueue as AmazonAwscdkServicesSqsIQueue

/**
 * Use an Amazon SQS queue as an event source for AWS Lambda.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.lambda.eventsources.*;
 * import io.cloudshiftdev.awscdk.services.sqs.*;
 * Function fn;
 * Queue queue = new Queue(this, "Queue");
 * fn.addEventSource(new SqsEventSource(queue));
 * ```
 */
public open class SqsEventSource(
  cdkObject: software.amazon.awscdk.services.lambda.eventsources.SqsEventSource,
) : CdkObject(cdkObject),
    IEventSource {
  public constructor(queue: CloudshiftdevAwscdkServicesSqsIQueue) :
      this(software.amazon.awscdk.services.lambda.eventsources.SqsEventSource(queue.let(CloudshiftdevAwscdkServicesSqsIQueue.Companion::unwrap))
  )

  public constructor(queue: CloudshiftdevAwscdkServicesSqsIQueue, props: SqsEventSourceProps) :
      this(software.amazon.awscdk.services.lambda.eventsources.SqsEventSource(queue.let(CloudshiftdevAwscdkServicesSqsIQueue.Companion::unwrap),
      props.let(SqsEventSourceProps.Companion::unwrap))
  )

  public constructor(queue: CloudshiftdevAwscdkServicesSqsIQueue,
      props: SqsEventSourceProps.Builder.() -> Unit) : this(queue, SqsEventSourceProps(props)
  )

  /**
   * Called by `lambda.addEventSource` to allow the event source to bind to this function.
   *
   * @param target 
   */
  public override fun bind(target: IFunction) {
    unwrap(this).bind(target.let(IFunction.Companion::unwrap))
  }

  /**
   * The ARN for this EventSourceMapping.
   */
  public open fun eventSourceMappingArn(): String = unwrap(this).getEventSourceMappingArn()

  /**
   * The identifier for this EventSourceMapping.
   */
  public open fun eventSourceMappingId(): String = unwrap(this).getEventSourceMappingId()

  /**
   *
   */
  public open fun queue(): CloudshiftdevAwscdkServicesSqsIQueue =
      unwrap(this).getQueue().let(CloudshiftdevAwscdkServicesSqsIQueue::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.lambda.eventsources.SqsEventSource].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The largest number of records that AWS Lambda will retrieve from your event source at the
     * time of invoking your function.
     *
     * Your function receives an
     * event with all the retrieved records.
     *
     * Valid Range: Minimum value of 1. Maximum value of 10.
     * If `maxBatchingWindow` is configured, this value can go up to 10,000.
     *
     * Default: 10
     *
     * @param batchSize The largest number of records that AWS Lambda will retrieve from your event
     * source at the time of invoking your function. 
     */
    public fun batchSize(batchSize: Number)

    /**
     * If the SQS event source mapping should be enabled.
     *
     * Default: true
     *
     * @param enabled If the SQS event source mapping should be enabled. 
     */
    public fun enabled(enabled: Boolean)

    /**
     * Add Customer managed KMS key to encrypt Filter Criteria.
     *
     * Default: - none
     *
     * [Documentation](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-managed-cmk)
     * @param filterEncryption Add Customer managed KMS key to encrypt Filter Criteria. 
     */
    public fun filterEncryption(filterEncryption: IKey)

    /**
     * Add filter criteria option.
     *
     * Default: - None
     *
     * @param filters Add filter criteria option. 
     */
    public fun filters(filters: List<Map<String, Any>>)

    /**
     * Add filter criteria option.
     *
     * Default: - None
     *
     * @param filters Add filter criteria option. 
     */
    public fun filters(vararg filters: Map<String, Any>)

    /**
     * The maximum amount of time to gather records before invoking the function.
     *
     * Valid Range: Minimum value of 0 minutes. Maximum value of 5 minutes.
     *
     * Default: - no batching window. The lambda function will be invoked immediately with the
     * records that are available.
     *
     * @param maxBatchingWindow The maximum amount of time to gather records before invoking the
     * function. 
     */
    public fun maxBatchingWindow(maxBatchingWindow: Duration)

    /**
     * The maximum concurrency setting limits the number of concurrent instances of the function
     * that an Amazon SQS event source can invoke.
     *
     * Default: - No specific limit.
     *
     * @see <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/with-sqs.html#events-sqs-max-concurrency
     * Valid Range: Minimum value of 2. Maximum value of
     * 1000.">https://docs.aws.amazon.com/lambda/latest/dg/with-sqs.html#events-sqs-max-concurrency
     * Valid Range: Minimum value of 2. Maximum value of 1000.</a>
     * @param maxConcurrency The maximum concurrency setting limits the number of concurrent
     * instances of the function that an Amazon SQS event source can invoke. 
     */
    public fun maxConcurrency(maxConcurrency: Number)

    /**
     * Allow functions to return partially successful responses for a batch of records.
     *
     * Default: false
     *
     * [Documentation](https://docs.aws.amazon.com/lambda/latest/dg/with-sqs.html#services-sqs-batchfailurereporting)
     * @param reportBatchItemFailures Allow functions to return partially successful responses for a
     * batch of records. 
     */
    public fun reportBatchItemFailures(reportBatchItemFailures: Boolean)
  }

  private class BuilderImpl(
    queue: AmazonAwscdkServicesSqsIQueue,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.lambda.eventsources.SqsEventSource.Builder =
        software.amazon.awscdk.services.lambda.eventsources.SqsEventSource.Builder.create(queue)

    /**
     * The largest number of records that AWS Lambda will retrieve from your event source at the
     * time of invoking your function.
     *
     * Your function receives an
     * event with all the retrieved records.
     *
     * Valid Range: Minimum value of 1. Maximum value of 10.
     * If `maxBatchingWindow` is configured, this value can go up to 10,000.
     *
     * Default: 10
     *
     * @param batchSize The largest number of records that AWS Lambda will retrieve from your event
     * source at the time of invoking your function. 
     */
    override fun batchSize(batchSize: Number) {
      cdkBuilder.batchSize(batchSize)
    }

    /**
     * If the SQS event source mapping should be enabled.
     *
     * Default: true
     *
     * @param enabled If the SQS event source mapping should be enabled. 
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * Add Customer managed KMS key to encrypt Filter Criteria.
     *
     * Default: - none
     *
     * [Documentation](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-managed-cmk)
     * @param filterEncryption Add Customer managed KMS key to encrypt Filter Criteria. 
     */
    override fun filterEncryption(filterEncryption: IKey) {
      cdkBuilder.filterEncryption(filterEncryption.let(IKey.Companion::unwrap))
    }

    /**
     * Add filter criteria option.
     *
     * Default: - None
     *
     * @param filters Add filter criteria option. 
     */
    override fun filters(filters: List<Map<String, Any>>) {
      cdkBuilder.filters(filters)
    }

    /**
     * Add filter criteria option.
     *
     * Default: - None
     *
     * @param filters Add filter criteria option. 
     */
    override fun filters(vararg filters: Map<String, Any>): Unit = filters(filters.toList())

    /**
     * The maximum amount of time to gather records before invoking the function.
     *
     * Valid Range: Minimum value of 0 minutes. Maximum value of 5 minutes.
     *
     * Default: - no batching window. The lambda function will be invoked immediately with the
     * records that are available.
     *
     * @param maxBatchingWindow The maximum amount of time to gather records before invoking the
     * function. 
     */
    override fun maxBatchingWindow(maxBatchingWindow: Duration) {
      cdkBuilder.maxBatchingWindow(maxBatchingWindow.let(Duration.Companion::unwrap))
    }

    /**
     * The maximum concurrency setting limits the number of concurrent instances of the function
     * that an Amazon SQS event source can invoke.
     *
     * Default: - No specific limit.
     *
     * @see <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/with-sqs.html#events-sqs-max-concurrency
     * Valid Range: Minimum value of 2. Maximum value of
     * 1000.">https://docs.aws.amazon.com/lambda/latest/dg/with-sqs.html#events-sqs-max-concurrency
     * Valid Range: Minimum value of 2. Maximum value of 1000.</a>
     * @param maxConcurrency The maximum concurrency setting limits the number of concurrent
     * instances of the function that an Amazon SQS event source can invoke. 
     */
    override fun maxConcurrency(maxConcurrency: Number) {
      cdkBuilder.maxConcurrency(maxConcurrency)
    }

    /**
     * Allow functions to return partially successful responses for a batch of records.
     *
     * Default: false
     *
     * [Documentation](https://docs.aws.amazon.com/lambda/latest/dg/with-sqs.html#services-sqs-batchfailurereporting)
     * @param reportBatchItemFailures Allow functions to return partially successful responses for a
     * batch of records. 
     */
    override fun reportBatchItemFailures(reportBatchItemFailures: Boolean) {
      cdkBuilder.reportBatchItemFailures(reportBatchItemFailures)
    }

    public fun build(): software.amazon.awscdk.services.lambda.eventsources.SqsEventSource =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(queue: CloudshiftdevAwscdkServicesSqsIQueue,
        block: Builder.() -> Unit = {}): SqsEventSource {
      val builderImpl = BuilderImpl(CloudshiftdevAwscdkServicesSqsIQueue.unwrap(queue))
      return SqsEventSource(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.lambda.eventsources.SqsEventSource):
        SqsEventSource = SqsEventSource(cdkObject)

    internal fun unwrap(wrapped: SqsEventSource):
        software.amazon.awscdk.services.lambda.eventsources.SqsEventSource = wrapped.cdkObject as
        software.amazon.awscdk.services.lambda.eventsources.SqsEventSource
  }
}
