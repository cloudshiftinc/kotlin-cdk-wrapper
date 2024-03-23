@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnDeliveryDestination`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.logs.*;
 * Object deliveryDestinationPolicy;
 * CfnDeliveryDestinationProps cfnDeliveryDestinationProps = CfnDeliveryDestinationProps.builder()
 * .name("name")
 * // the properties below are optional
 * .deliveryDestinationPolicy(deliveryDestinationPolicy)
 * .destinationResourceArn("destinationResourceArn")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-deliverydestination.html)
 */
public interface CfnDeliveryDestinationProps {
  /**
   * A structure that contains information about one delivery destination policy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-deliverydestination.html#cfn-logs-deliverydestination-deliverydestinationpolicy)
   */
  public fun deliveryDestinationPolicy(): Any? = unwrap(this).getDeliveryDestinationPolicy()

  /**
   * The ARN of the AWS destination that this delivery destination represents.
   *
   * That AWS destination can be a log group in CloudWatch Logs, an Amazon S3 bucket, or a delivery
   * stream in Firehose.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-deliverydestination.html#cfn-logs-deliverydestination-destinationresourcearn)
   */
  public fun destinationResourceArn(): String? = unwrap(this).getDestinationResourceArn()

  /**
   * The name of this delivery destination.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-deliverydestination.html#cfn-logs-deliverydestination-name)
   */
  public fun name(): String

  /**
   * The tags that have been assigned to this delivery destination.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-deliverydestination.html#cfn-logs-deliverydestination-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnDeliveryDestinationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param deliveryDestinationPolicy A structure that contains information about one delivery
     * destination policy.
     */
    public fun deliveryDestinationPolicy(deliveryDestinationPolicy: Any)

    /**
     * @param destinationResourceArn The ARN of the AWS destination that this delivery destination
     * represents.
     * That AWS destination can be a log group in CloudWatch Logs, an Amazon S3 bucket, or a
     * delivery stream in Firehose.
     */
    public fun destinationResourceArn(destinationResourceArn: String)

    /**
     * @param name The name of this delivery destination. 
     */
    public fun name(name: String)

    /**
     * @param tags The tags that have been assigned to this delivery destination.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags that have been assigned to this delivery destination.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.CfnDeliveryDestinationProps.Builder
        = software.amazon.awscdk.services.logs.CfnDeliveryDestinationProps.builder()

    /**
     * @param deliveryDestinationPolicy A structure that contains information about one delivery
     * destination policy.
     */
    override fun deliveryDestinationPolicy(deliveryDestinationPolicy: Any) {
      cdkBuilder.deliveryDestinationPolicy(deliveryDestinationPolicy)
    }

    /**
     * @param destinationResourceArn The ARN of the AWS destination that this delivery destination
     * represents.
     * That AWS destination can be a log group in CloudWatch Logs, an Amazon S3 bucket, or a
     * delivery stream in Firehose.
     */
    override fun destinationResourceArn(destinationResourceArn: String) {
      cdkBuilder.destinationResourceArn(destinationResourceArn)
    }

    /**
     * @param name The name of this delivery destination. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags The tags that have been assigned to this delivery destination.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags that have been assigned to this delivery destination.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.logs.CfnDeliveryDestinationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.logs.CfnDeliveryDestinationProps,
  ) : CdkObject(cdkObject), CfnDeliveryDestinationProps {
    /**
     * A structure that contains information about one delivery destination policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-deliverydestination.html#cfn-logs-deliverydestination-deliverydestinationpolicy)
     */
    override fun deliveryDestinationPolicy(): Any? = unwrap(this).getDeliveryDestinationPolicy()

    /**
     * The ARN of the AWS destination that this delivery destination represents.
     *
     * That AWS destination can be a log group in CloudWatch Logs, an Amazon S3 bucket, or a
     * delivery stream in Firehose.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-deliverydestination.html#cfn-logs-deliverydestination-destinationresourcearn)
     */
    override fun destinationResourceArn(): String? = unwrap(this).getDestinationResourceArn()

    /**
     * The name of this delivery destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-deliverydestination.html#cfn-logs-deliverydestination-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The tags that have been assigned to this delivery destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-deliverydestination.html#cfn-logs-deliverydestination-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDeliveryDestinationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnDeliveryDestinationProps):
        CfnDeliveryDestinationProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnDeliveryDestinationProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDeliveryDestinationProps):
        software.amazon.awscdk.services.logs.CfnDeliveryDestinationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.logs.CfnDeliveryDestinationProps
  }
}
