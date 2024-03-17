@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events.targets

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.events.RuleTargetInput
import kotlin.Unit

/**
 * Customize the Firehose Stream Event Target.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.events.*;
 * import io.cloudshiftdev.awscdk.services.events.targets.*;
 * RuleTargetInput ruleTargetInput;
 * KinesisFirehoseStreamProps kinesisFirehoseStreamProps = KinesisFirehoseStreamProps.builder()
 * .message(ruleTargetInput)
 * .build();
 * ```
 */
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
        KinesisFirehoseStreamProps = CdkObjectWrappers.wrap(cdkObject) as?
        KinesisFirehoseStreamProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: KinesisFirehoseStreamProps):
        software.amazon.awscdk.services.events.targets.KinesisFirehoseStreamProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.events.targets.KinesisFirehoseStreamProps
  }
}
