@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kinesis

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnStreamConsumer`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.kinesis.*;
 * CfnStreamConsumerProps cfnStreamConsumerProps = CfnStreamConsumerProps.builder()
 * .consumerName("consumerName")
 * .streamArn("streamArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-streamconsumer.html)
 */
public interface CfnStreamConsumerProps {
  /**
   * The name of the consumer is something you choose when you register the consumer.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-streamconsumer.html#cfn-kinesis-streamconsumer-consumername)
   */
  public fun consumerName(): String

  /**
   * The ARN of the stream with which you registered the consumer.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-streamconsumer.html#cfn-kinesis-streamconsumer-streamarn)
   */
  public fun streamArn(): String

  /**
   * A builder for [CfnStreamConsumerProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param consumerName The name of the consumer is something you choose when you register the
     * consumer. 
     */
    public fun consumerName(consumerName: String)

    /**
     * @param streamArn The ARN of the stream with which you registered the consumer. 
     */
    public fun streamArn(streamArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.kinesis.CfnStreamConsumerProps.Builder =
        software.amazon.awscdk.services.kinesis.CfnStreamConsumerProps.builder()

    /**
     * @param consumerName The name of the consumer is something you choose when you register the
     * consumer. 
     */
    override fun consumerName(consumerName: String) {
      cdkBuilder.consumerName(consumerName)
    }

    /**
     * @param streamArn The ARN of the stream with which you registered the consumer. 
     */
    override fun streamArn(streamArn: String) {
      cdkBuilder.streamArn(streamArn)
    }

    public fun build(): software.amazon.awscdk.services.kinesis.CfnStreamConsumerProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.kinesis.CfnStreamConsumerProps,
  ) : CdkObject(cdkObject), CfnStreamConsumerProps {
    /**
     * The name of the consumer is something you choose when you register the consumer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-streamconsumer.html#cfn-kinesis-streamconsumer-consumername)
     */
    override fun consumerName(): String = unwrap(this).getConsumerName()

    /**
     * The ARN of the stream with which you registered the consumer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-streamconsumer.html#cfn-kinesis-streamconsumer-streamarn)
     */
    override fun streamArn(): String = unwrap(this).getStreamArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnStreamConsumerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.kinesis.CfnStreamConsumerProps):
        CfnStreamConsumerProps = CdkObjectWrappers.wrap(cdkObject) as? CfnStreamConsumerProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnStreamConsumerProps):
        software.amazon.awscdk.services.kinesis.CfnStreamConsumerProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.kinesis.CfnStreamConsumerProps
  }
}
