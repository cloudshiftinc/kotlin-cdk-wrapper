@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * This structure contains information about one *delivery source* in your account.
 *
 * A delivery source is an AWS resource that sends logs to an AWS destination. The destination can
 * be CloudWatch Logs, Amazon S3, or Firehose.
 *
 * Only some AWS services support being configured as a delivery source. These services are listed
 * as *Supported [V2 Permissions]* in the table at [Enabling logging from AWS
 * services.](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/AWS-logs-and-resource-policy.html)
 *
 * To configure logs delivery between a supported AWS service and a destination, you must do the
 * following:
 *
 * * Create a delivery source, which is a logical object that represents the resource that is
 * actually sending the logs. For more information, see
 * [PutDeliverySource](https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_PutDeliverySource.html)
 * .
 * * Create a *delivery destination* , which is a logical object that represents the actual delivery
 * destination. For more information, see
 * [PutDeliveryDestination](https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_PutDeliveryDestination.html)
 * .
 * * If you are delivering logs cross-account, you must use
 * [PutDeliveryDestinationPolicy](https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_PutDeliveryDestinationPolicy.html)
 * in the destination account to assign an IAM policy to the destination. This policy allows delivery
 * to that destination.
 * * Create a *delivery* by pairing exactly one delivery source and one delivery destination. For
 * more information, see
 * [CreateDelivery](https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_CreateDelivery.html)
 * .
 *
 * You can configure a single delivery source to send logs to multiple destinations by creating
 * multiple deliveries. You can also create multiple deliveries to configure multiple delivery sources
 * to send logs to the same delivery destination.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.logs.*;
 * CfnDeliverySource cfnDeliverySource = CfnDeliverySource.Builder.create(this,
 * "MyCfnDeliverySource")
 * .name("name")
 * // the properties below are optional
 * .logType("logType")
 * .resourceArn("resourceArn")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-deliverysource.html)
 */
public open class CfnDeliverySource internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.logs.CfnDeliverySource,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  /**
   * The Amazon Resource Name (ARN) that uniquely identifies this delivery source.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * This array contains the ARN of the AWS resource that sends logs and is represented by this
   * delivery source.
   *
   * Currently, only one ARN can be in the array.
   */
  public open fun attrResourceArns(): List<String> = unwrap(this).getAttrResourceArns()

  /**
   * The AWS service that is sending logs.
   */
  public open fun attrService(): String = unwrap(this).getAttrService()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The type of log that the source is sending.
   */
  public open fun logType(): String? = unwrap(this).getLogType()

  /**
   * The type of log that the source is sending.
   */
  public open fun logType(`value`: String) {
    unwrap(this).setLogType(`value`)
  }

  /**
   * The unique name of the delivery source.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The unique name of the delivery source.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) that uniquely identifies this delivery source.
   */
  public open fun resourceArn(): String? = unwrap(this).getResourceArn()

  /**
   * The Amazon Resource Name (ARN) that uniquely identifies this delivery source.
   */
  public open fun resourceArn(`value`: String) {
    unwrap(this).setResourceArn(`value`)
  }

  /**
   * The tags that have been assigned to this delivery source.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The tags that have been assigned to this delivery source.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags that have been assigned to this delivery source.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.logs.CfnDeliverySource].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The type of log that the source is sending.
     *
     * For valid values for this parameter, see the documentation for the source service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-deliverysource.html#cfn-logs-deliverysource-logtype)
     * @param logType The type of log that the source is sending. 
     */
    public fun logType(logType: String)

    /**
     * The unique name of the delivery source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-deliverysource.html#cfn-logs-deliverysource-name)
     * @param name The unique name of the delivery source. 
     */
    public fun name(name: String)

    /**
     * The Amazon Resource Name (ARN) that uniquely identifies this delivery source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-deliverysource.html#cfn-logs-deliverysource-resourcearn)
     * @param resourceArn The Amazon Resource Name (ARN) that uniquely identifies this delivery
     * source. 
     */
    public fun resourceArn(resourceArn: String)

    /**
     * The tags that have been assigned to this delivery source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-deliverysource.html#cfn-logs-deliverysource-tags)
     * @param tags The tags that have been assigned to this delivery source. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags that have been assigned to this delivery source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-deliverysource.html#cfn-logs-deliverysource-tags)
     * @param tags The tags that have been assigned to this delivery source. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.CfnDeliverySource.Builder =
        software.amazon.awscdk.services.logs.CfnDeliverySource.Builder.create(scope, id)

    /**
     * The type of log that the source is sending.
     *
     * For valid values for this parameter, see the documentation for the source service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-deliverysource.html#cfn-logs-deliverysource-logtype)
     * @param logType The type of log that the source is sending. 
     */
    override fun logType(logType: String) {
      cdkBuilder.logType(logType)
    }

    /**
     * The unique name of the delivery source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-deliverysource.html#cfn-logs-deliverysource-name)
     * @param name The unique name of the delivery source. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The Amazon Resource Name (ARN) that uniquely identifies this delivery source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-deliverysource.html#cfn-logs-deliverysource-resourcearn)
     * @param resourceArn The Amazon Resource Name (ARN) that uniquely identifies this delivery
     * source. 
     */
    override fun resourceArn(resourceArn: String) {
      cdkBuilder.resourceArn(resourceArn)
    }

    /**
     * The tags that have been assigned to this delivery source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-deliverysource.html#cfn-logs-deliverysource-tags)
     * @param tags The tags that have been assigned to this delivery source. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags that have been assigned to this delivery source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-deliverysource.html#cfn-logs-deliverysource-tags)
     * @param tags The tags that have been assigned to this delivery source. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.logs.CfnDeliverySource = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.logs.CfnDeliverySource.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDeliverySource {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDeliverySource(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnDeliverySource):
        CfnDeliverySource = CfnDeliverySource(cdkObject)

    internal fun unwrap(wrapped: CfnDeliverySource):
        software.amazon.awscdk.services.logs.CfnDeliverySource = wrapped.cdkObject
  }
}
