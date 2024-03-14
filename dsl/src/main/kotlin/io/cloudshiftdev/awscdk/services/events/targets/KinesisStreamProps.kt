package io.cloudshiftdev.awscdk.services.events.targets

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.events.RuleTargetInput
import kotlin.String
import kotlin.Unit

public interface KinesisStreamProps {
  /**
   * The message to send to the stream.
   *
   * Must be a valid JSON text passed to the target stream.
   *
   * Default: - the entire CloudWatch event
   */
  public fun message(): RuleTargetInput? = unwrap(this).getMessage()?.let(RuleTargetInput::wrap)

  /**
   * Partition Key Path for records sent to this stream.
   *
   * Default: - eventId as the partition key
   */
  public fun partitionKeyPath(): String? = unwrap(this).getPartitionKeyPath()

  /**
   * A builder for [KinesisStreamProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param message The message to send to the stream.
     * Must be a valid JSON text passed to the target stream.
     */
    public fun message(message: RuleTargetInput)

    /**
     * @param partitionKeyPath Partition Key Path for records sent to this stream.
     */
    public fun partitionKeyPath(partitionKeyPath: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.events.targets.KinesisStreamProps.Builder =
        software.amazon.awscdk.services.events.targets.KinesisStreamProps.builder()

    /**
     * @param message The message to send to the stream.
     * Must be a valid JSON text passed to the target stream.
     */
    override fun message(message: RuleTargetInput) {
      cdkBuilder.message(message.let(RuleTargetInput::unwrap))
    }

    /**
     * @param partitionKeyPath Partition Key Path for records sent to this stream.
     */
    override fun partitionKeyPath(partitionKeyPath: String) {
      cdkBuilder.partitionKeyPath(partitionKeyPath)
    }

    public fun build(): software.amazon.awscdk.services.events.targets.KinesisStreamProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.events.targets.KinesisStreamProps,
  ) : CdkObject(cdkObject), KinesisStreamProps {
    /**
     * The message to send to the stream.
     *
     * Must be a valid JSON text passed to the target stream.
     *
     * Default: - the entire CloudWatch event
     */
    override fun message(): RuleTargetInput? = unwrap(this).getMessage()?.let(RuleTargetInput::wrap)

    /**
     * Partition Key Path for records sent to this stream.
     *
     * Default: - eventId as the partition key
     */
    override fun partitionKeyPath(): String? = unwrap(this).getPartitionKeyPath()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): KinesisStreamProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.targets.KinesisStreamProps):
        KinesisStreamProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: KinesisStreamProps):
        software.amazon.awscdk.services.events.targets.KinesisStreamProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.events.targets.KinesisStreamProps
  }
}
