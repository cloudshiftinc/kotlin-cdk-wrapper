@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

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
 * .deliveryDestinationPolicy(DestinationPolicyProperty.builder()
 * .deliveryDestinationName("deliveryDestinationName")
 * .deliveryDestinationPolicy(deliveryDestinationPolicy)
 * .build())
 * .destinationResourceArn("destinationResourceArn")
 * .outputFormat("outputFormat")
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
   * An IAM policy that grants permissions to CloudWatch Logs to deliver logs cross-account to a
   * specified destination in this account.
   *
   * For examples of this policy, see
   * [Examples](https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_PutDeliveryDestinationPolicy.html#API_PutDeliveryDestinationPolicy_Examples)
   * in the CloudWatch Logs API Reference.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-deliverydestination.html#cfn-logs-deliverydestination-deliverydestinationpolicy)
   */
  public fun deliveryDestinationPolicy(): Any? = unwrap(this).getDeliveryDestinationPolicy()

  /**
   * The ARN of the AWS destination that this delivery destination represents.
   *
   * That AWS destination can be a log group in CloudWatch Logs , an Amazon S3 bucket, or a Firehose
   * stream.
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
   * The format of the logs that are sent to this delivery destination.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-deliverydestination.html#cfn-logs-deliverydestination-outputformat)
   */
  public fun outputFormat(): String? = unwrap(this).getOutputFormat()

  /**
   * An array of key-value pairs to apply to the delivery destination.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
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
     * @param deliveryDestinationPolicy An IAM policy that grants permissions to CloudWatch Logs to
     * deliver logs cross-account to a specified destination in this account.
     * For examples of this policy, see
     * [Examples](https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_PutDeliveryDestinationPolicy.html#API_PutDeliveryDestinationPolicy_Examples)
     * in the CloudWatch Logs API Reference.
     */
    public fun deliveryDestinationPolicy(deliveryDestinationPolicy: IResolvable)

    /**
     * @param deliveryDestinationPolicy An IAM policy that grants permissions to CloudWatch Logs to
     * deliver logs cross-account to a specified destination in this account.
     * For examples of this policy, see
     * [Examples](https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_PutDeliveryDestinationPolicy.html#API_PutDeliveryDestinationPolicy_Examples)
     * in the CloudWatch Logs API Reference.
     */
    public
        fun deliveryDestinationPolicy(deliveryDestinationPolicy: CfnDeliveryDestination.DestinationPolicyProperty)

    /**
     * @param deliveryDestinationPolicy An IAM policy that grants permissions to CloudWatch Logs to
     * deliver logs cross-account to a specified destination in this account.
     * For examples of this policy, see
     * [Examples](https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_PutDeliveryDestinationPolicy.html#API_PutDeliveryDestinationPolicy_Examples)
     * in the CloudWatch Logs API Reference.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b19f2f960c0ef5c1fda40083093543fb65155933f21e7d4deecf990ece4ab967")
    public
        fun deliveryDestinationPolicy(deliveryDestinationPolicy: CfnDeliveryDestination.DestinationPolicyProperty.Builder.() -> Unit)

    /**
     * @param destinationResourceArn The ARN of the AWS destination that this delivery destination
     * represents.
     * That AWS destination can be a log group in CloudWatch Logs , an Amazon S3 bucket, or a
     * Firehose stream.
     */
    public fun destinationResourceArn(destinationResourceArn: String)

    /**
     * @param name The name of this delivery destination. 
     */
    public fun name(name: String)

    /**
     * @param outputFormat The format of the logs that are sent to this delivery destination.
     */
    public fun outputFormat(outputFormat: String)

    /**
     * @param tags An array of key-value pairs to apply to the delivery destination.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to the delivery destination.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.CfnDeliveryDestinationProps.Builder
        = software.amazon.awscdk.services.logs.CfnDeliveryDestinationProps.builder()

    /**
     * @param deliveryDestinationPolicy An IAM policy that grants permissions to CloudWatch Logs to
     * deliver logs cross-account to a specified destination in this account.
     * For examples of this policy, see
     * [Examples](https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_PutDeliveryDestinationPolicy.html#API_PutDeliveryDestinationPolicy_Examples)
     * in the CloudWatch Logs API Reference.
     */
    override fun deliveryDestinationPolicy(deliveryDestinationPolicy: IResolvable) {
      cdkBuilder.deliveryDestinationPolicy(deliveryDestinationPolicy.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param deliveryDestinationPolicy An IAM policy that grants permissions to CloudWatch Logs to
     * deliver logs cross-account to a specified destination in this account.
     * For examples of this policy, see
     * [Examples](https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_PutDeliveryDestinationPolicy.html#API_PutDeliveryDestinationPolicy_Examples)
     * in the CloudWatch Logs API Reference.
     */
    override
        fun deliveryDestinationPolicy(deliveryDestinationPolicy: CfnDeliveryDestination.DestinationPolicyProperty) {
      cdkBuilder.deliveryDestinationPolicy(deliveryDestinationPolicy.let(CfnDeliveryDestination.DestinationPolicyProperty.Companion::unwrap))
    }

    /**
     * @param deliveryDestinationPolicy An IAM policy that grants permissions to CloudWatch Logs to
     * deliver logs cross-account to a specified destination in this account.
     * For examples of this policy, see
     * [Examples](https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_PutDeliveryDestinationPolicy.html#API_PutDeliveryDestinationPolicy_Examples)
     * in the CloudWatch Logs API Reference.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b19f2f960c0ef5c1fda40083093543fb65155933f21e7d4deecf990ece4ab967")
    override
        fun deliveryDestinationPolicy(deliveryDestinationPolicy: CfnDeliveryDestination.DestinationPolicyProperty.Builder.() -> Unit):
        Unit =
        deliveryDestinationPolicy(CfnDeliveryDestination.DestinationPolicyProperty(deliveryDestinationPolicy))

    /**
     * @param destinationResourceArn The ARN of the AWS destination that this delivery destination
     * represents.
     * That AWS destination can be a log group in CloudWatch Logs , an Amazon S3 bucket, or a
     * Firehose stream.
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
     * @param outputFormat The format of the logs that are sent to this delivery destination.
     */
    override fun outputFormat(outputFormat: String) {
      cdkBuilder.outputFormat(outputFormat)
    }

    /**
     * @param tags An array of key-value pairs to apply to the delivery destination.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to the delivery destination.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.logs.CfnDeliveryDestinationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.logs.CfnDeliveryDestinationProps,
  ) : CdkObject(cdkObject),
      CfnDeliveryDestinationProps {
    /**
     * An IAM policy that grants permissions to CloudWatch Logs to deliver logs cross-account to a
     * specified destination in this account.
     *
     * For examples of this policy, see
     * [Examples](https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_PutDeliveryDestinationPolicy.html#API_PutDeliveryDestinationPolicy_Examples)
     * in the CloudWatch Logs API Reference.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-deliverydestination.html#cfn-logs-deliverydestination-deliverydestinationpolicy)
     */
    override fun deliveryDestinationPolicy(): Any? = unwrap(this).getDeliveryDestinationPolicy()

    /**
     * The ARN of the AWS destination that this delivery destination represents.
     *
     * That AWS destination can be a log group in CloudWatch Logs , an Amazon S3 bucket, or a
     * Firehose stream.
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
     * The format of the logs that are sent to this delivery destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-deliverydestination.html#cfn-logs-deliverydestination-outputformat)
     */
    override fun outputFormat(): String? = unwrap(this).getOutputFormat()

    /**
     * An array of key-value pairs to apply to the delivery destination.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
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
