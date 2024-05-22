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
import io.cloudshiftdev.awscdk.services.kinesis.IStream as CloudshiftdevAwscdkServicesKinesisIStream
import software.amazon.awscdk.services.kinesis.IStream as AmazonAwscdkServicesKinesisIStream

/**
 * Use a Kinesis Stream as a target for AWS CloudWatch event rules.
 *
 * Example:
 *
 * ```
 * // put to a Kinesis stream every time code is committed
 * // to a CodeCommit repository
 * repository.onCommit("onCommit", OnCommitOptions.builder().target(new
 * KinesisStream(stream)).build());
 * ```
 */
public open class KinesisStream(
  cdkObject: software.amazon.awscdk.services.events.targets.KinesisStream,
) : CdkObject(cdkObject), IRuleTarget {
  public constructor(stream: CloudshiftdevAwscdkServicesKinesisIStream) :
      this(software.amazon.awscdk.services.events.targets.KinesisStream(stream.let(CloudshiftdevAwscdkServicesKinesisIStream.Companion::unwrap))
  )

  public constructor(stream: CloudshiftdevAwscdkServicesKinesisIStream, props: KinesisStreamProps) :
      this(software.amazon.awscdk.services.events.targets.KinesisStream(stream.let(CloudshiftdevAwscdkServicesKinesisIStream.Companion::unwrap),
      props.let(KinesisStreamProps.Companion::unwrap))
  )

  public constructor(stream: CloudshiftdevAwscdkServicesKinesisIStream,
      props: KinesisStreamProps.Builder.() -> Unit) : this(stream, KinesisStreamProps(props)
  )

  /**
   * Returns a RuleTarget that can be used to trigger this Kinesis Stream as a result from a
   * CloudWatch event.
   *
   * @param _rule 
   * @param _id
   */
  public override fun bind(rule: IRule): RuleTargetConfig =
      unwrap(this).bind(rule.let(IRule.Companion::unwrap)).let(RuleTargetConfig::wrap)

  /**
   * Returns a RuleTarget that can be used to trigger this Kinesis Stream as a result from a
   * CloudWatch event.
   *
   * @param _rule 
   * @param _id
   */
  public override fun bind(rule: IRule, id: String): RuleTargetConfig =
      unwrap(this).bind(rule.let(IRule.Companion::unwrap), id).let(RuleTargetConfig::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.events.targets.KinesisStream].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The message to send to the stream.
     *
     * Must be a valid JSON text passed to the target stream.
     *
     * Default: - the entire CloudWatch event
     *
     * @param message The message to send to the stream. 
     */
    public fun message(message: RuleTargetInput)

    /**
     * Partition Key Path for records sent to this stream.
     *
     * Default: - eventId as the partition key
     *
     * @param partitionKeyPath Partition Key Path for records sent to this stream. 
     */
    public fun partitionKeyPath(partitionKeyPath: String)
  }

  private class BuilderImpl(
    stream: AmazonAwscdkServicesKinesisIStream,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.targets.KinesisStream.Builder =
        software.amazon.awscdk.services.events.targets.KinesisStream.Builder.create(stream)

    /**
     * The message to send to the stream.
     *
     * Must be a valid JSON text passed to the target stream.
     *
     * Default: - the entire CloudWatch event
     *
     * @param message The message to send to the stream. 
     */
    override fun message(message: RuleTargetInput) {
      cdkBuilder.message(message.let(RuleTargetInput.Companion::unwrap))
    }

    /**
     * Partition Key Path for records sent to this stream.
     *
     * Default: - eventId as the partition key
     *
     * @param partitionKeyPath Partition Key Path for records sent to this stream. 
     */
    override fun partitionKeyPath(partitionKeyPath: String) {
      cdkBuilder.partitionKeyPath(partitionKeyPath)
    }

    public fun build(): software.amazon.awscdk.services.events.targets.KinesisStream =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(stream: CloudshiftdevAwscdkServicesKinesisIStream,
        block: Builder.() -> Unit = {}): KinesisStream {
      val builderImpl = BuilderImpl(CloudshiftdevAwscdkServicesKinesisIStream.unwrap(stream))
      return KinesisStream(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.targets.KinesisStream):
        KinesisStream = KinesisStream(cdkObject)

    internal fun unwrap(wrapped: KinesisStream):
        software.amazon.awscdk.services.events.targets.KinesisStream = wrapped.cdkObject as
        software.amazon.awscdk.services.events.targets.KinesisStream
  }
}
