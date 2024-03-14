package io.cloudshiftdev.awscdk.services.events.targets

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.events.RuleTargetInput
import kotlin.Unit

public interface KinesisFirehoseStreamProps {
  /**
   * The message to send to the stream.
   *
   * Must be a valid JSON text passed to the target stream.
   *
   * Default: - the entire Event Bridge event
   */
  public fun message(): RuleTargetInput? = unwrap(this).getMessage()?.let(RuleTargetInput::wrap)

  /**
   * A builder for [KinesisFirehoseStreamProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param message The message to send to the stream.
     * Must be a valid JSON text passed to the target stream.
     */
    public fun message(message: RuleTargetInput)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.events.targets.KinesisFirehoseStreamProps.Builder =
        software.amazon.awscdk.services.events.targets.KinesisFirehoseStreamProps.builder()

    /**
     * @param message The message to send to the stream.
     * Must be a valid JSON text passed to the target stream.
     */
    override fun message(message: RuleTargetInput) {
      cdkBuilder.message(message.let(RuleTargetInput::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.events.targets.KinesisFirehoseStreamProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.events.targets.KinesisFirehoseStreamProps,
  ) : CdkObject(cdkObject), KinesisFirehoseStreamProps {
    /**
     * The message to send to the stream.
     *
     * Must be a valid JSON text passed to the target stream.
     *
     * Default: - the entire Event Bridge event
     */
    override fun message(): RuleTargetInput? = unwrap(this).getMessage()?.let(RuleTargetInput::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): KinesisFirehoseStreamProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.events.targets.KinesisFirehoseStreamProps):
        KinesisFirehoseStreamProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: KinesisFirehoseStreamProps):
        software.amazon.awscdk.services.events.targets.KinesisFirehoseStreamProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.events.targets.KinesisFirehoseStreamProps
  }
}
