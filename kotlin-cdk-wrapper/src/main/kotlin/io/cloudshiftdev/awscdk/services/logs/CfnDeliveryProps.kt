@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnDelivery`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.logs.*;
 * CfnDeliveryProps cfnDeliveryProps = CfnDeliveryProps.builder()
 * .deliveryDestinationArn("deliveryDestinationArn")
 * .deliverySourceName("deliverySourceName")
 * // the properties below are optional
 * .fieldDelimiter("fieldDelimiter")
 * .recordFields(List.of("recordFields"))
 * .s3EnableHiveCompatiblePath(false)
 * .s3SuffixPath("s3SuffixPath")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-delivery.html)
 */
public interface CfnDeliveryProps {
  /**
   * The ARN of the delivery destination that is associated with this delivery.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-delivery.html#cfn-logs-delivery-deliverydestinationarn)
   */
  public fun deliveryDestinationArn(): String

  /**
   * The name of the delivery source that is associated with this delivery.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-delivery.html#cfn-logs-delivery-deliverysourcename)
   */
  public fun deliverySourceName(): String

  /**
   * The field delimiter that is used between record fields when the final output format of a
   * delivery is in `Plain` , `W3C` , or `Raw` format.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-delivery.html#cfn-logs-delivery-fielddelimiter)
   */
  public fun fieldDelimiter(): String? = unwrap(this).getFieldDelimiter()

  /**
   * The list of record fields to be delivered to the destination, in order.
   *
   * If the delivery's log source has mandatory fields, they must be included in this list.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-delivery.html#cfn-logs-delivery-recordfields)
   */
  public fun recordFields(): List<String> = unwrap(this).getRecordFields() ?: emptyList()

  /**
   * Use this parameter to cause the S3 objects that contain delivered logs to use a prefix
   * structure that allows for integration with Apache Hive.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-delivery.html#cfn-logs-delivery-s3enablehivecompatiblepath)
   */
  public fun s3EnableHiveCompatiblePath(): Any? = unwrap(this).getS3EnableHiveCompatiblePath()

  /**
   * Use this to reconfigure the S3 object prefix to contain either static or variable sections.
   *
   * The valid variables to use in the suffix path will vary by each log source. To find the values
   * supported for the suffix path for each log source, use the
   * [DescribeConfigurationTemplates](https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_DescribeConfigurationTemplates.html)
   * operation and check the `allowedSuffixPathFields` field in the response.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-delivery.html#cfn-logs-delivery-s3suffixpath)
   */
  public fun s3SuffixPath(): String? = unwrap(this).getS3SuffixPath()

  /**
   * An array of key-value pairs to apply to the delivery.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-delivery.html#cfn-logs-delivery-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnDeliveryProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param deliveryDestinationArn The ARN of the delivery destination that is associated with
     * this delivery. 
     */
    public fun deliveryDestinationArn(deliveryDestinationArn: String)

    /**
     * @param deliverySourceName The name of the delivery source that is associated with this
     * delivery. 
     */
    public fun deliverySourceName(deliverySourceName: String)

    /**
     * @param fieldDelimiter The field delimiter that is used between record fields when the final
     * output format of a delivery is in `Plain` , `W3C` , or `Raw` format.
     */
    public fun fieldDelimiter(fieldDelimiter: String)

    /**
     * @param recordFields The list of record fields to be delivered to the destination, in order.
     * If the delivery's log source has mandatory fields, they must be included in this list.
     */
    public fun recordFields(recordFields: List<String>)

    /**
     * @param recordFields The list of record fields to be delivered to the destination, in order.
     * If the delivery's log source has mandatory fields, they must be included in this list.
     */
    public fun recordFields(vararg recordFields: String)

    /**
     * @param s3EnableHiveCompatiblePath Use this parameter to cause the S3 objects that contain
     * delivered logs to use a prefix structure that allows for integration with Apache Hive.
     */
    public fun s3EnableHiveCompatiblePath(s3EnableHiveCompatiblePath: Boolean)

    /**
     * @param s3EnableHiveCompatiblePath Use this parameter to cause the S3 objects that contain
     * delivered logs to use a prefix structure that allows for integration with Apache Hive.
     */
    public fun s3EnableHiveCompatiblePath(s3EnableHiveCompatiblePath: IResolvable)

    /**
     * @param s3SuffixPath Use this to reconfigure the S3 object prefix to contain either static or
     * variable sections.
     * The valid variables to use in the suffix path will vary by each log source. To find the
     * values supported for the suffix path for each log source, use the
     * [DescribeConfigurationTemplates](https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_DescribeConfigurationTemplates.html)
     * operation and check the `allowedSuffixPathFields` field in the response.
     */
    public fun s3SuffixPath(s3SuffixPath: String)

    /**
     * @param tags An array of key-value pairs to apply to the delivery.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to the delivery.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.CfnDeliveryProps.Builder =
        software.amazon.awscdk.services.logs.CfnDeliveryProps.builder()

    /**
     * @param deliveryDestinationArn The ARN of the delivery destination that is associated with
     * this delivery. 
     */
    override fun deliveryDestinationArn(deliveryDestinationArn: String) {
      cdkBuilder.deliveryDestinationArn(deliveryDestinationArn)
    }

    /**
     * @param deliverySourceName The name of the delivery source that is associated with this
     * delivery. 
     */
    override fun deliverySourceName(deliverySourceName: String) {
      cdkBuilder.deliverySourceName(deliverySourceName)
    }

    /**
     * @param fieldDelimiter The field delimiter that is used between record fields when the final
     * output format of a delivery is in `Plain` , `W3C` , or `Raw` format.
     */
    override fun fieldDelimiter(fieldDelimiter: String) {
      cdkBuilder.fieldDelimiter(fieldDelimiter)
    }

    /**
     * @param recordFields The list of record fields to be delivered to the destination, in order.
     * If the delivery's log source has mandatory fields, they must be included in this list.
     */
    override fun recordFields(recordFields: List<String>) {
      cdkBuilder.recordFields(recordFields)
    }

    /**
     * @param recordFields The list of record fields to be delivered to the destination, in order.
     * If the delivery's log source has mandatory fields, they must be included in this list.
     */
    override fun recordFields(vararg recordFields: String): Unit =
        recordFields(recordFields.toList())

    /**
     * @param s3EnableHiveCompatiblePath Use this parameter to cause the S3 objects that contain
     * delivered logs to use a prefix structure that allows for integration with Apache Hive.
     */
    override fun s3EnableHiveCompatiblePath(s3EnableHiveCompatiblePath: Boolean) {
      cdkBuilder.s3EnableHiveCompatiblePath(s3EnableHiveCompatiblePath)
    }

    /**
     * @param s3EnableHiveCompatiblePath Use this parameter to cause the S3 objects that contain
     * delivered logs to use a prefix structure that allows for integration with Apache Hive.
     */
    override fun s3EnableHiveCompatiblePath(s3EnableHiveCompatiblePath: IResolvable) {
      cdkBuilder.s3EnableHiveCompatiblePath(s3EnableHiveCompatiblePath.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param s3SuffixPath Use this to reconfigure the S3 object prefix to contain either static or
     * variable sections.
     * The valid variables to use in the suffix path will vary by each log source. To find the
     * values supported for the suffix path for each log source, use the
     * [DescribeConfigurationTemplates](https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_DescribeConfigurationTemplates.html)
     * operation and check the `allowedSuffixPathFields` field in the response.
     */
    override fun s3SuffixPath(s3SuffixPath: String) {
      cdkBuilder.s3SuffixPath(s3SuffixPath)
    }

    /**
     * @param tags An array of key-value pairs to apply to the delivery.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to the delivery.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.logs.CfnDeliveryProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.logs.CfnDeliveryProps,
  ) : CdkObject(cdkObject),
      CfnDeliveryProps {
    /**
     * The ARN of the delivery destination that is associated with this delivery.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-delivery.html#cfn-logs-delivery-deliverydestinationarn)
     */
    override fun deliveryDestinationArn(): String = unwrap(this).getDeliveryDestinationArn()

    /**
     * The name of the delivery source that is associated with this delivery.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-delivery.html#cfn-logs-delivery-deliverysourcename)
     */
    override fun deliverySourceName(): String = unwrap(this).getDeliverySourceName()

    /**
     * The field delimiter that is used between record fields when the final output format of a
     * delivery is in `Plain` , `W3C` , or `Raw` format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-delivery.html#cfn-logs-delivery-fielddelimiter)
     */
    override fun fieldDelimiter(): String? = unwrap(this).getFieldDelimiter()

    /**
     * The list of record fields to be delivered to the destination, in order.
     *
     * If the delivery's log source has mandatory fields, they must be included in this list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-delivery.html#cfn-logs-delivery-recordfields)
     */
    override fun recordFields(): List<String> = unwrap(this).getRecordFields() ?: emptyList()

    /**
     * Use this parameter to cause the S3 objects that contain delivered logs to use a prefix
     * structure that allows for integration with Apache Hive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-delivery.html#cfn-logs-delivery-s3enablehivecompatiblepath)
     */
    override fun s3EnableHiveCompatiblePath(): Any? = unwrap(this).getS3EnableHiveCompatiblePath()

    /**
     * Use this to reconfigure the S3 object prefix to contain either static or variable sections.
     *
     * The valid variables to use in the suffix path will vary by each log source. To find the
     * values supported for the suffix path for each log source, use the
     * [DescribeConfigurationTemplates](https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_DescribeConfigurationTemplates.html)
     * operation and check the `allowedSuffixPathFields` field in the response.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-delivery.html#cfn-logs-delivery-s3suffixpath)
     */
    override fun s3SuffixPath(): String? = unwrap(this).getS3SuffixPath()

    /**
     * An array of key-value pairs to apply to the delivery.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-delivery.html#cfn-logs-delivery-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDeliveryProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnDeliveryProps):
        CfnDeliveryProps = CdkObjectWrappers.wrap(cdkObject) as? CfnDeliveryProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDeliveryProps):
        software.amazon.awscdk.services.logs.CfnDeliveryProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.logs.CfnDeliveryProps
  }
}
