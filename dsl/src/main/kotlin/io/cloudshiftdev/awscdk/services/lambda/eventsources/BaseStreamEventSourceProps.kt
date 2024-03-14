package io.cloudshiftdev.awscdk.services.lambda.eventsources

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.lambda.StartingPosition
import kotlin.Boolean
import kotlin.Number
import kotlin.Unit

public interface BaseStreamEventSourceProps {
  /**
   * The largest number of records that AWS Lambda will retrieve from your event source at the time
   * of invoking your function.
   *
   * Your function receives an
   * event with all the retrieved records.
   *
   * Valid Range:
   *
   * * Minimum value of 1
   * * Maximum value of:
   *
   * * 1000 for `DynamoEventSource`
   * * 10000 for `KinesisEventSource`, `ManagedKafkaEventSource` and `SelfManagedKafkaEventSource`
   *
   *
   * Default: 100
   */
  public fun batchSize(): Number? = unwrap(this).getBatchSize()

  /**
   * If the stream event source mapping should be enabled.
   *
   * Default: true
   */
  public fun enabled(): Boolean? = unwrap(this).getEnabled()

  /**
   * The maximum amount of time to gather records before invoking the function.
   *
   * Maximum of Duration.minutes(5).
   *
   * Default: - Duration.seconds(0) for Kinesis, DynamoDB, and SQS event sources,
   * Duration.millis(500) for MSK, self-managed Kafka, and Amazon MQ.
   *
   * [Documentation](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventsourcemapping.html#invocation-eventsourcemapping-batching)
   */
  public fun maxBatchingWindow(): Duration? =
      unwrap(this).getMaxBatchingWindow()?.let(Duration::wrap)

  /**
   * Where to begin consuming the stream.
   */
  public fun startingPosition(): StartingPosition

  /**
   * A builder for [BaseStreamEventSourceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param batchSize The largest number of records that AWS Lambda will retrieve from your event
     * source at the time of invoking your function.
     * Your function receives an
     * event with all the retrieved records.
     *
     * Valid Range:
     *
     * * Minimum value of 1
     * * Maximum value of:
     *
     * * 1000 for `DynamoEventSource`
     * * 10000 for `KinesisEventSource`, `ManagedKafkaEventSource` and `SelfManagedKafkaEventSource`
     */
    public fun batchSize(batchSize: Number)

    /**
     * @param enabled If the stream event source mapping should be enabled.
     */
    public fun enabled(enabled: Boolean)

    /**
     * @param maxBatchingWindow The maximum amount of time to gather records before invoking the
     * function.
     * Maximum of Duration.minutes(5).
     */
    public fun maxBatchingWindow(maxBatchingWindow: Duration)

    /**
     * @param startingPosition Where to begin consuming the stream. 
     */
    public fun startingPosition(startingPosition: StartingPosition)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.lambda.eventsources.BaseStreamEventSourceProps.Builder =
        software.amazon.awscdk.services.lambda.eventsources.BaseStreamEventSourceProps.builder()

    /**
     * @param batchSize The largest number of records that AWS Lambda will retrieve from your event
     * source at the time of invoking your function.
     * Your function receives an
     * event with all the retrieved records.
     *
     * Valid Range:
     *
     * * Minimum value of 1
     * * Maximum value of:
     *
     * * 1000 for `DynamoEventSource`
     * * 10000 for `KinesisEventSource`, `ManagedKafkaEventSource` and `SelfManagedKafkaEventSource`
     */
    override fun batchSize(batchSize: Number) {
      cdkBuilder.batchSize(batchSize)
    }

    /**
     * @param enabled If the stream event source mapping should be enabled.
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * @param maxBatchingWindow The maximum amount of time to gather records before invoking the
     * function.
     * Maximum of Duration.minutes(5).
     */
    override fun maxBatchingWindow(maxBatchingWindow: Duration) {
      cdkBuilder.maxBatchingWindow(maxBatchingWindow.let(Duration::unwrap))
    }

    /**
     * @param startingPosition Where to begin consuming the stream. 
     */
    override fun startingPosition(startingPosition: StartingPosition) {
      cdkBuilder.startingPosition(startingPosition.let(StartingPosition::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.lambda.eventsources.BaseStreamEventSourceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.lambda.eventsources.BaseStreamEventSourceProps,
  ) : CdkObject(cdkObject), BaseStreamEventSourceProps {
    /**
     * The largest number of records that AWS Lambda will retrieve from your event source at the
     * time of invoking your function.
     *
     * Your function receives an
     * event with all the retrieved records.
     *
     * Valid Range:
     *
     * * Minimum value of 1
     * * Maximum value of:
     *
     * * 1000 for `DynamoEventSource`
     * * 10000 for `KinesisEventSource`, `ManagedKafkaEventSource` and `SelfManagedKafkaEventSource`
     *
     *
     * Default: 100
     */
    override fun batchSize(): Number? = unwrap(this).getBatchSize()

    /**
     * If the stream event source mapping should be enabled.
     *
     * Default: true
     */
    override fun enabled(): Boolean? = unwrap(this).getEnabled()

    /**
     * The maximum amount of time to gather records before invoking the function.
     *
     * Maximum of Duration.minutes(5).
     *
     * Default: - Duration.seconds(0) for Kinesis, DynamoDB, and SQS event sources,
     * Duration.millis(500) for MSK, self-managed Kafka, and Amazon MQ.
     *
     * [Documentation](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventsourcemapping.html#invocation-eventsourcemapping-batching)
     */
    override fun maxBatchingWindow(): Duration? =
        unwrap(this).getMaxBatchingWindow()?.let(Duration::wrap)

    /**
     * Where to begin consuming the stream.
     */
    override fun startingPosition(): StartingPosition =
        unwrap(this).getStartingPosition().let(StartingPosition::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BaseStreamEventSourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.lambda.eventsources.BaseStreamEventSourceProps):
        BaseStreamEventSourceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BaseStreamEventSourceProps):
        software.amazon.awscdk.services.lambda.eventsources.BaseStreamEventSourceProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.lambda.eventsources.BaseStreamEventSourceProps
  }
}
