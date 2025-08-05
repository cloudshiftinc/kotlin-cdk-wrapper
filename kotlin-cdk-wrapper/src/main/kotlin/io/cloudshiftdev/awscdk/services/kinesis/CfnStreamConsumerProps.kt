@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kinesis

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

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
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
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
   * An array of tags to be added to a specified Kinesis resource.
   *
   * A tag consists of a required key and an optional value. You can specify up to 50 tag key-value
   * pairs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-streamconsumer.html#cfn-kinesis-streamconsumer-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

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

    /**
     * @param tags An array of tags to be added to a specified Kinesis resource.
     * A tag consists of a required key and an optional value. You can specify up to 50 tag
     * key-value pairs.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of tags to be added to a specified Kinesis resource.
     * A tag consists of a required key and an optional value. You can specify up to 50 tag
     * key-value pairs.
     */
    public fun tags(vararg tags: CfnTag)
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

    /**
     * @param tags An array of tags to be added to a specified Kinesis resource.
     * A tag consists of a required key and an optional value. You can specify up to 50 tag
     * key-value pairs.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags An array of tags to be added to a specified Kinesis resource.
     * A tag consists of a required key and an optional value. You can specify up to 50 tag
     * key-value pairs.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.kinesis.CfnStreamConsumerProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.kinesis.CfnStreamConsumerProps,
  ) : CdkObject(cdkObject),
      CfnStreamConsumerProps {
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

    /**
     * An array of tags to be added to a specified Kinesis resource.
     *
     * A tag consists of a required key and an optional value. You can specify up to 50 tag
     * key-value pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-streamconsumer.html#cfn-kinesis-streamconsumer-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
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
