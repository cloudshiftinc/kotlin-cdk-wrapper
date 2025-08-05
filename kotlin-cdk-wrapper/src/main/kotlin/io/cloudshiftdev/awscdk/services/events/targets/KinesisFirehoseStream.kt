@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events.targets

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.events.IRule
import io.cloudshiftdev.awscdk.services.events.IRuleTarget
import io.cloudshiftdev.awscdk.services.events.RuleTargetConfig
import io.cloudshiftdev.awscdk.services.events.RuleTargetInput
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.awscdk.services.kinesisfirehose.CfnDeliveryStream as CloudshiftdevAwscdkServicesKinesisfirehoseCfnDeliveryStream
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream as AmazonAwscdkServicesKinesisfirehoseCfnDeliveryStream

/**
 * (deprecated) Customize the Amazon Data Firehose Stream Event Target.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.events.*;
 * import io.cloudshiftdev.awscdk.services.events.targets.*;
 * import io.cloudshiftdev.awscdk.services.kinesisfirehose.*;
 * CfnDeliveryStream cfnDeliveryStream;
 * RuleTargetInput ruleTargetInput;
 * KinesisFirehoseStream kinesisFirehoseStream =
 * KinesisFirehoseStream.Builder.create(cfnDeliveryStream)
 * .message(ruleTargetInput)
 * .build();
 * ```
 *
 * @deprecated Use KinesisFirehoseStreamV2
 */
public open class KinesisFirehoseStream(
  cdkObject: software.amazon.awscdk.services.events.targets.KinesisFirehoseStream,
) : CdkObject(cdkObject),
    IRuleTarget {
  @Deprecated(message = "deprecated in CDK")
  public constructor(stream: CloudshiftdevAwscdkServicesKinesisfirehoseCfnDeliveryStream) :
      this(software.amazon.awscdk.services.events.targets.KinesisFirehoseStream(stream.let(CloudshiftdevAwscdkServicesKinesisfirehoseCfnDeliveryStream.Companion::unwrap))
  )

  @Deprecated(message = "deprecated in CDK")
  public constructor(stream: CloudshiftdevAwscdkServicesKinesisfirehoseCfnDeliveryStream,
      props: KinesisFirehoseStreamProps) :
      this(software.amazon.awscdk.services.events.targets.KinesisFirehoseStream(stream.let(CloudshiftdevAwscdkServicesKinesisfirehoseCfnDeliveryStream.Companion::unwrap),
      props.let(KinesisFirehoseStreamProps.Companion::unwrap))
  )

  @Deprecated(message = "deprecated in CDK")
  public constructor(stream: CloudshiftdevAwscdkServicesKinesisfirehoseCfnDeliveryStream,
      props: KinesisFirehoseStreamProps.Builder.() -> Unit) : this(stream,
      KinesisFirehoseStreamProps(props)
  )

  /**
   * (deprecated) Returns a RuleTarget that can be used to trigger this Firehose Stream as a result
   * from a Event Bridge event.
   *
   * @param _rule 
   * @param _id
   */
  @Deprecated(message = "deprecated in CDK")
  public override fun bind(rule: IRule): RuleTargetConfig =
      unwrap(this).bind(rule.let(IRule.Companion::unwrap)).let(RuleTargetConfig::wrap)

  /**
   * (deprecated) Returns a RuleTarget that can be used to trigger this Firehose Stream as a result
   * from a Event Bridge event.
   *
   * @param _rule 
   * @param _id
   */
  @Deprecated(message = "deprecated in CDK")
  public override fun bind(rule: IRule, id: String): RuleTargetConfig =
      unwrap(this).bind(rule.let(IRule.Companion::unwrap), id).let(RuleTargetConfig::wrap)

  /**
   * (deprecated) A fluent builder for
   * [io.cloudshiftdev.awscdk.services.events.targets.KinesisFirehoseStream].
   */
  @CdkDslMarker
  @Deprecated(message = "deprecated in CDK")
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
    stream: AmazonAwscdkServicesKinesisfirehoseCfnDeliveryStream,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.events.targets.KinesisFirehoseStream.Builder =
        software.amazon.awscdk.services.events.targets.KinesisFirehoseStream.Builder.create(stream)

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

    public fun build(): software.amazon.awscdk.services.events.targets.KinesisFirehoseStream =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(stream: CloudshiftdevAwscdkServicesKinesisfirehoseCfnDeliveryStream,
        block: Builder.() -> Unit = {}): KinesisFirehoseStream {
      val builderImpl =
          BuilderImpl(CloudshiftdevAwscdkServicesKinesisfirehoseCfnDeliveryStream.unwrap(stream))
      return KinesisFirehoseStream(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.events.targets.KinesisFirehoseStream):
        KinesisFirehoseStream = KinesisFirehoseStream(cdkObject)

    internal fun unwrap(wrapped: KinesisFirehoseStream):
        software.amazon.awscdk.services.events.targets.KinesisFirehoseStream = wrapped.cdkObject as
        software.amazon.awscdk.services.events.targets.KinesisFirehoseStream
  }
}
