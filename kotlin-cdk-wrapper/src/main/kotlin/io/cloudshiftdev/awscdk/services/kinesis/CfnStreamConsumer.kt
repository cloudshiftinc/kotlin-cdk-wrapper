@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kinesis

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Use the AWS CloudFormation `AWS::Kinesis::StreamConsumer` resource to register a consumer with a
 * Kinesis data stream.
 *
 * The consumer you register can then call
 * [SubscribeToShard](https://docs.aws.amazon.com/kinesis/latest/APIReference/API_SubscribeToShard.html)
 * to receive data from the stream using enhanced fan-out, at a rate of up to 2 MiB per second for
 * every shard you subscribe to. This rate is unaffected by the total number of consumers that read
 * from the same stream.
 *
 * You can register up to five consumers per stream. However, you can request a limit increase using
 * the [Kinesis Data Streams limits form](https://docs.aws.amazon.com/support/v1?#/) . A given consumer
 * can only be registered with one stream at a time.
 *
 * For more information, see [Using Consumers with Enhanced
 * Fan-Out](https://docs.aws.amazon.com/streams/latest/dev/introduction-to-enhanced-consumers.html) .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.kinesis.*;
 * CfnStreamConsumer cfnStreamConsumer = CfnStreamConsumer.Builder.create(this,
 * "MyCfnStreamConsumer")
 * .consumerName("consumerName")
 * .streamArn("streamArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-streamconsumer.html)
 */
public open class CfnStreamConsumer(
  cdkObject: software.amazon.awscdk.services.kinesis.CfnStreamConsumer,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnStreamConsumerProps,
  ) :
      this(software.amazon.awscdk.services.kinesis.CfnStreamConsumer(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnStreamConsumerProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnStreamConsumerProps.Builder.() -> Unit,
  ) : this(scope, id, CfnStreamConsumerProps(props)
  )

  /**
   * When you register a consumer, Kinesis Data Streams generates an ARN for it.
   *
   * You need this ARN to be able to call
   * [SubscribeToShard](https://docs.aws.amazon.com/kinesis/latest/APIReference/API_SubscribeToShard.html)
   * .
   *
   * If you delete a consumer and then create a new one with the same name, it won't have the same
   * ARN. That's because consumer ARNs contain the creation timestamp. This is important to keep in
   * mind if you have IAM policies that reference consumer ARNs.
   */
  public open fun attrConsumerArn(): String = unwrap(this).getAttrConsumerArn()

  /**
   * The time at which the consumer was created.
   */
  public open fun attrConsumerCreationTimestamp(): String =
      unwrap(this).getAttrConsumerCreationTimestamp()

  /**
   * The name you gave the consumer when you registered it.
   */
  public open fun attrConsumerName(): String = unwrap(this).getAttrConsumerName()

  /**
   * A consumer can't read data while in the `CREATING` or `DELETING` states.
   */
  public open fun attrConsumerStatus(): String = unwrap(this).getAttrConsumerStatus()

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The ARN of the data stream with which the consumer is registered.
   */
  public open fun attrStreamArn(): String = unwrap(this).getAttrStreamArn()

  /**
   * The name of the consumer is something you choose when you register the consumer.
   */
  public open fun consumerName(): String = unwrap(this).getConsumerName()

  /**
   * The name of the consumer is something you choose when you register the consumer.
   */
  public open fun consumerName(`value`: String) {
    unwrap(this).setConsumerName(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The ARN of the stream with which you registered the consumer.
   */
  public open fun streamArn(): String = unwrap(this).getStreamArn()

  /**
   * The ARN of the stream with which you registered the consumer.
   */
  public open fun streamArn(`value`: String) {
    unwrap(this).setStreamArn(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.kinesis.CfnStreamConsumer].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the consumer is something you choose when you register the consumer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-streamconsumer.html#cfn-kinesis-streamconsumer-consumername)
     * @param consumerName The name of the consumer is something you choose when you register the
     * consumer. 
     */
    public fun consumerName(consumerName: String)

    /**
     * The ARN of the stream with which you registered the consumer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-streamconsumer.html#cfn-kinesis-streamconsumer-streamarn)
     * @param streamArn The ARN of the stream with which you registered the consumer. 
     */
    public fun streamArn(streamArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.kinesis.CfnStreamConsumer.Builder =
        software.amazon.awscdk.services.kinesis.CfnStreamConsumer.Builder.create(scope, id)

    /**
     * The name of the consumer is something you choose when you register the consumer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-streamconsumer.html#cfn-kinesis-streamconsumer-consumername)
     * @param consumerName The name of the consumer is something you choose when you register the
     * consumer. 
     */
    override fun consumerName(consumerName: String) {
      cdkBuilder.consumerName(consumerName)
    }

    /**
     * The ARN of the stream with which you registered the consumer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-streamconsumer.html#cfn-kinesis-streamconsumer-streamarn)
     * @param streamArn The ARN of the stream with which you registered the consumer. 
     */
    override fun streamArn(streamArn: String) {
      cdkBuilder.streamArn(streamArn)
    }

    public fun build(): software.amazon.awscdk.services.kinesis.CfnStreamConsumer =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.kinesis.CfnStreamConsumer.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnStreamConsumer {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnStreamConsumer(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.kinesis.CfnStreamConsumer):
        CfnStreamConsumer = CfnStreamConsumer(cdkObject)

    internal fun unwrap(wrapped: CfnStreamConsumer):
        software.amazon.awscdk.services.kinesis.CfnStreamConsumer = wrapped.cdkObject as
        software.amazon.awscdk.services.kinesis.CfnStreamConsumer
  }
}
