@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.pinpoint

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnEventStream`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.pinpoint.*;
 * CfnEventStreamProps cfnEventStreamProps = CfnEventStreamProps.builder()
 * .applicationId("applicationId")
 * .destinationStreamArn("destinationStreamArn")
 * .roleArn("roleArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-eventstream.html)
 */
public interface CfnEventStreamProps {
  /**
   * The unique identifier for the Amazon Pinpoint application that you want to export data from.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-eventstream.html#cfn-pinpoint-eventstream-applicationid)
   */
  public fun applicationId(): String

  /**
   * The Amazon Resource Name (ARN) of the Amazon Kinesis Data Stream or Amazon Data Firehose
   * delivery stream that you want to publish event data to.
   *
   * For a Kinesis Data Stream, the ARN format is: `arn:aws:kinesis: region : account-id :stream/
   * stream_name`
   *
   * For a Firehose delivery stream, the ARN format is: `arn:aws:firehose: region : account-id
   * :deliverystream/ stream_name`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-eventstream.html#cfn-pinpoint-eventstream-destinationstreamarn)
   */
  public fun destinationStreamArn(): String

  /**
   * The AWS Identity and Access Management (IAM) role that authorizes Amazon Pinpoint to publish
   * event data to the stream in your AWS account.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-eventstream.html#cfn-pinpoint-eventstream-rolearn)
   */
  public fun roleArn(): String

  /**
   * A builder for [CfnEventStreamProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param applicationId The unique identifier for the Amazon Pinpoint application that you want
     * to export data from. 
     */
    public fun applicationId(applicationId: String)

    /**
     * @param destinationStreamArn The Amazon Resource Name (ARN) of the Amazon Kinesis Data Stream
     * or Amazon Data Firehose delivery stream that you want to publish event data to. 
     * For a Kinesis Data Stream, the ARN format is: `arn:aws:kinesis: region : account-id :stream/
     * stream_name`
     *
     * For a Firehose delivery stream, the ARN format is: `arn:aws:firehose: region : account-id
     * :deliverystream/ stream_name`
     */
    public fun destinationStreamArn(destinationStreamArn: String)

    /**
     * @param roleArn The AWS Identity and Access Management (IAM) role that authorizes Amazon
     * Pinpoint to publish event data to the stream in your AWS account. 
     */
    public fun roleArn(roleArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.pinpoint.CfnEventStreamProps.Builder =
        software.amazon.awscdk.services.pinpoint.CfnEventStreamProps.builder()

    /**
     * @param applicationId The unique identifier for the Amazon Pinpoint application that you want
     * to export data from. 
     */
    override fun applicationId(applicationId: String) {
      cdkBuilder.applicationId(applicationId)
    }

    /**
     * @param destinationStreamArn The Amazon Resource Name (ARN) of the Amazon Kinesis Data Stream
     * or Amazon Data Firehose delivery stream that you want to publish event data to. 
     * For a Kinesis Data Stream, the ARN format is: `arn:aws:kinesis: region : account-id :stream/
     * stream_name`
     *
     * For a Firehose delivery stream, the ARN format is: `arn:aws:firehose: region : account-id
     * :deliverystream/ stream_name`
     */
    override fun destinationStreamArn(destinationStreamArn: String) {
      cdkBuilder.destinationStreamArn(destinationStreamArn)
    }

    /**
     * @param roleArn The AWS Identity and Access Management (IAM) role that authorizes Amazon
     * Pinpoint to publish event data to the stream in your AWS account. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    public fun build(): software.amazon.awscdk.services.pinpoint.CfnEventStreamProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.pinpoint.CfnEventStreamProps,
  ) : CdkObject(cdkObject), CfnEventStreamProps {
    /**
     * The unique identifier for the Amazon Pinpoint application that you want to export data from.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-eventstream.html#cfn-pinpoint-eventstream-applicationid)
     */
    override fun applicationId(): String = unwrap(this).getApplicationId()

    /**
     * The Amazon Resource Name (ARN) of the Amazon Kinesis Data Stream or Amazon Data Firehose
     * delivery stream that you want to publish event data to.
     *
     * For a Kinesis Data Stream, the ARN format is: `arn:aws:kinesis: region : account-id :stream/
     * stream_name`
     *
     * For a Firehose delivery stream, the ARN format is: `arn:aws:firehose: region : account-id
     * :deliverystream/ stream_name`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-eventstream.html#cfn-pinpoint-eventstream-destinationstreamarn)
     */
    override fun destinationStreamArn(): String = unwrap(this).getDestinationStreamArn()

    /**
     * The AWS Identity and Access Management (IAM) role that authorizes Amazon Pinpoint to publish
     * event data to the stream in your AWS account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-eventstream.html#cfn-pinpoint-eventstream-rolearn)
     */
    override fun roleArn(): String = unwrap(this).getRoleArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEventStreamProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnEventStreamProps):
        CfnEventStreamProps = CdkObjectWrappers.wrap(cdkObject) as? CfnEventStreamProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEventStreamProps):
        software.amazon.awscdk.services.pinpoint.CfnEventStreamProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.pinpoint.CfnEventStreamProps
  }
}
