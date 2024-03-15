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

/**
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.lambda.eventsources.SqsEventSource;
 * Function fn;
 * Queue queue = Queue.Builder.create(this, "MyQueue")
 * .visibilityTimeout(Duration.seconds(30))
 * .build();
 * fn.addEventSource(SqsEventSource.Builder.create(queue)
 * .batchSize(10) // default
 * .maxBatchingWindow(Duration.minutes(5))
 * .reportBatchItemFailures(true)
 * .build());
 * ```
 */
public interface SqsEventSourceProps {
  /**
   * The largest number of records that AWS Lambda will retrieve from your event source at the time
   * of invoking your function.
   *
   * Your function receives an
   * event with all the retrieved records.
   *
   * Valid Range: Minimum value of 1. Maximum value of 10.
   * If `maxBatchingWindow` is configured, this value can go up to 10,000.
   *
   * Default: 10
   */
  public fun batchSize(): Number? = unwrap(this).getBatchSize()

  /**
   * If the SQS event source mapping should be enabled.
   *
   * Default: true
   */
  public fun enabled(): Boolean? = unwrap(this).getEnabled()

  /**
   * Add filter criteria option.
   *
   * Default: - None
   */
  public fun filters(): List<Map<String, Any>> = unwrap(this).getFilters() ?: emptyList()

  /**
   * The maximum amount of time to gather records before invoking the function.
   *
   * Valid Range: Minimum value of 0 minutes. Maximum value of 5 minutes.
   *
   * Default: - no batching window. The lambda function will be invoked immediately with the records
   * that are available.
   */
  public fun maxBatchingWindow(): Duration? =
      unwrap(this).getMaxBatchingWindow()?.let(Duration::wrap)

  /**
   * The maximum concurrency setting limits the number of concurrent instances of the function that
   * an Amazon SQS event source can invoke.
   *
   * Default: - No specific limit.
   *
   * @see <a
   * href="https://docs.aws.amazon.com/lambda/latest/dg/with-sqs.html#events-sqs-max-concurrency
   * Valid Range: Minimum value of 2. Maximum value of
   * 1000.">https://docs.aws.amazon.com/lambda/latest/dg/with-sqs.html#events-sqs-max-concurrency
   * Valid Range: Minimum value of 2. Maximum value of 1000.</a>
   */
  public fun maxConcurrency(): Number? = unwrap(this).getMaxConcurrency()

  /**
   * Allow functions to return partially successful responses for a batch of records.
   *
   * Default: false
   *
   * [Documentation](https://docs.aws.amazon.com/lambda/latest/dg/with-sqs.html#services-sqs-batchfailurereporting)
   */
  public fun reportBatchItemFailures(): Boolean? = unwrap(this).getReportBatchItemFailures()

  /**
   * A builder for [SqsEventSourceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param batchSize The largest number of records that AWS Lambda will retrieve from your event
     * source at the time of invoking your function.
     * Your function receives an
     * event with all the retrieved records.
     *
     * Valid Range: Minimum value of 1. Maximum value of 10.
     * If `maxBatchingWindow` is configured, this value can go up to 10,000.
     */
    public fun batchSize(batchSize: Number)

    /**
     * @param enabled If the SQS event source mapping should be enabled.
     */
    public fun enabled(enabled: Boolean)

    /**
     * @param filters Add filter criteria option.
     */
    public fun filters(filters: List<Map<String, Any>>)

    /**
     * @param filters Add filter criteria option.
     */
    public fun filters(vararg filters: Map<String, Any>)

    /**
     * @param maxBatchingWindow The maximum amount of time to gather records before invoking the
     * function.
     * Valid Range: Minimum value of 0 minutes. Maximum value of 5 minutes.
     */
    public fun maxBatchingWindow(maxBatchingWindow: Duration)

    /**
     * @param maxConcurrency The maximum concurrency setting limits the number of concurrent
     * instances of the function that an Amazon SQS event source can invoke.
     */
    public fun maxConcurrency(maxConcurrency: Number)

    /**
     * @param reportBatchItemFailures Allow functions to return partially successful responses for a
     * batch of records.
     */
    public fun reportBatchItemFailures(reportBatchItemFailures: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.lambda.eventsources.SqsEventSourceProps.Builder =
        software.amazon.awscdk.services.lambda.eventsources.SqsEventSourceProps.builder()

    /**
     * @param batchSize The largest number of records that AWS Lambda will retrieve from your event
     * source at the time of invoking your function.
     * Your function receives an
     * event with all the retrieved records.
     *
     * Valid Range: Minimum value of 1. Maximum value of 10.
     * If `maxBatchingWindow` is configured, this value can go up to 10,000.
     */
    override fun batchSize(batchSize: Number) {
      cdkBuilder.batchSize(batchSize)
    }

    /**
     * @param enabled If the SQS event source mapping should be enabled.
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * @param filters Add filter criteria option.
     */
    override fun filters(filters: List<Map<String, Any>>) {
      cdkBuilder.filters(filters)
    }

    /**
     * @param filters Add filter criteria option.
     */
    override fun filters(vararg filters: Map<String, Any>): Unit = filters(filters.toList())

    /**
     * @param maxBatchingWindow The maximum amount of time to gather records before invoking the
     * function.
     * Valid Range: Minimum value of 0 minutes. Maximum value of 5 minutes.
     */
    override fun maxBatchingWindow(maxBatchingWindow: Duration) {
      cdkBuilder.maxBatchingWindow(maxBatchingWindow.let(Duration::unwrap))
    }

    /**
     * @param maxConcurrency The maximum concurrency setting limits the number of concurrent
     * instances of the function that an Amazon SQS event source can invoke.
     */
    override fun maxConcurrency(maxConcurrency: Number) {
      cdkBuilder.maxConcurrency(maxConcurrency)
    }

    /**
     * @param reportBatchItemFailures Allow functions to return partially successful responses for a
     * batch of records.
     */
    override fun reportBatchItemFailures(reportBatchItemFailures: Boolean) {
      cdkBuilder.reportBatchItemFailures(reportBatchItemFailures)
    }

    public fun build(): software.amazon.awscdk.services.lambda.eventsources.SqsEventSourceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lambda.eventsources.SqsEventSourceProps,
  ) : CdkObject(cdkObject), SqsEventSourceProps {
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
     */
    override fun batchSize(): Number? = unwrap(this).getBatchSize()

    /**
     * If the SQS event source mapping should be enabled.
     *
     * Default: true
     */
    override fun enabled(): Boolean? = unwrap(this).getEnabled()

    /**
     * Add filter criteria option.
     *
     * Default: - None
     */
    override fun filters(): List<Map<String, Any>> = unwrap(this).getFilters() ?: emptyList()

    /**
     * The maximum amount of time to gather records before invoking the function.
     *
     * Valid Range: Minimum value of 0 minutes. Maximum value of 5 minutes.
     *
     * Default: - no batching window. The lambda function will be invoked immediately with the
     * records that are available.
     */
    override fun maxBatchingWindow(): Duration? =
        unwrap(this).getMaxBatchingWindow()?.let(Duration::wrap)

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
     */
    override fun maxConcurrency(): Number? = unwrap(this).getMaxConcurrency()

    /**
     * Allow functions to return partially successful responses for a batch of records.
     *
     * Default: false
     *
     * [Documentation](https://docs.aws.amazon.com/lambda/latest/dg/with-sqs.html#services-sqs-batchfailurereporting)
     */
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
