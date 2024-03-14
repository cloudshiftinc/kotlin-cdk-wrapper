package io.cloudshiftdev.awscdk.services.kinesis

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnStreamConsumer internal constructor(
  private val cdkObject: software.amazon.awscdk.services.kinesis.CfnStreamConsumer,
) : CfnResource(cdkObject), IInspectable {
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
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
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
    init {

    }

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
        software.amazon.awscdk.services.kinesis.CfnStreamConsumer = wrapped.cdkObject
  }
}
