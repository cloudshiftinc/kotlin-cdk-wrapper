@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events.targets

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.events.IRule
import io.cloudshiftdev.awscdk.services.events.IRuleTarget
import io.cloudshiftdev.awscdk.services.events.RuleTargetConfig
import io.cloudshiftdev.awscdk.services.events.RuleTargetInput
import kotlin.String
import kotlin.Unit

/**
 * Customize the Firehose Stream Event Target V2 to support L2 Kinesis Delivery Stream instead of L1
 * Cfn Kinesis Delivery Stream.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.events.*;
 * import io.cloudshiftdev.awscdk.services.events.targets.*;
 * IDeliveryStream deliveryStream;
 * RuleTargetInput ruleTargetInput;
 * KinesisFirehoseStreamV2 kinesisFirehoseStreamV2 =
 * KinesisFirehoseStreamV2.Builder.create(deliveryStream)
 * .message(ruleTargetInput)
 * .build();
 * ```
 */
public open class KinesisFirehoseStreamV2(
  cdkObject: software.amazon.awscdk.services.events.targets.KinesisFirehoseStreamV2,
) : CdkObject(cdkObject),
    IRuleTarget {
  public constructor(stream: IDeliveryStream) :
      this(software.amazon.awscdk.services.events.targets.KinesisFirehoseStreamV2(stream.let(IDeliveryStream.Companion::unwrap))
  )

  public constructor(stream: IDeliveryStream, props: KinesisFirehoseStreamProps) :
      this(software.amazon.awscdk.services.events.targets.KinesisFirehoseStreamV2(stream.let(IDeliveryStream.Companion::unwrap),
      props.let(KinesisFirehoseStreamProps.Companion::unwrap))
  )

  public constructor(stream: IDeliveryStream, props: KinesisFirehoseStreamProps.Builder.() -> Unit)
      : this(stream, KinesisFirehoseStreamProps(props)
  )

  /**
   * Returns a RuleTarget that can be used to trigger this Firehose Stream as a result from a Event
   * Bridge event.
   *
   * @param _rule 
   * @param _id
   */
  public override fun bind(rule: IRule): RuleTargetConfig =
      unwrap(this).bind(rule.let(IRule.Companion::unwrap)).let(RuleTargetConfig::wrap)

  /**
   * Returns a RuleTarget that can be used to trigger this Firehose Stream as a result from a Event
   * Bridge event.
   *
   * @param _rule 
   * @param _id
   */
  public override fun bind(rule: IRule, id: String): RuleTargetConfig =
      unwrap(this).bind(rule.let(IRule.Companion::unwrap), id).let(RuleTargetConfig::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.events.targets.KinesisFirehoseStreamV2].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The message to send to the stream.
     *
     * Must be a valid JSON text passed to the target stream.
     *
     * Default: - the entire Event Bridge event
     *
     * @param message The message to send to the stream. 
     */
    public fun message(message: RuleTargetInput)
  }

  private class BuilderImpl(
    stream: software.amazon.awscdk.services.events.targets.IDeliveryStream,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.events.targets.KinesisFirehoseStreamV2.Builder =
        software.amazon.awscdk.services.events.targets.KinesisFirehoseStreamV2.Builder.create(stream)

    /**
     * The message to send to the stream.
     *
     * Must be a valid JSON text passed to the target stream.
     *
     * Default: - the entire Event Bridge event
     *
     * @param message The message to send to the stream. 
     */
    override fun message(message: RuleTargetInput) {
      cdkBuilder.message(message.let(RuleTargetInput.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.events.targets.KinesisFirehoseStreamV2 =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(stream: IDeliveryStream, block: Builder.() -> Unit = {}):
        KinesisFirehoseStreamV2 {
      val builderImpl = BuilderImpl(IDeliveryStream.unwrap(stream))
      return KinesisFirehoseStreamV2(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.events.targets.KinesisFirehoseStreamV2):
        KinesisFirehoseStreamV2 = KinesisFirehoseStreamV2(cdkObject)

    internal fun unwrap(wrapped: KinesisFirehoseStreamV2):
        software.amazon.awscdk.services.events.targets.KinesisFirehoseStreamV2 = wrapped.cdkObject
        as software.amazon.awscdk.services.events.targets.KinesisFirehoseStreamV2
  }
}
