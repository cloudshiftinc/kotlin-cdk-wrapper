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
 * Creates or updates one *delivery source* in your account.
 *
 * A delivery source is an AWS resource that sends logs to an AWS destination. The destination can
 * be CloudWatch Logs , Amazon S3 , or Firehose .
 *
 * Only some AWS services support being configured as a delivery source. These services are listed
 * as *Supported [V2 Permissions]* in the table at [Enabling logging from AWS
 * services.](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/AWS-logs-and-resource-policy.html)
 *
 * To configure logs delivery between a supported AWS service and a destination, you must do the
 * following:
 *
 * * Create a delivery source, which is a logical object that represents the resource that is
 * actually sending the logs.
 * * Create a *delivery destination* , which is a logical object that represents the actual delivery
 * destination. For more information, see
 * [AWS::Logs::DeliveryDestination](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-deliverydestination.html)
 * or
 * [PutDeliveryDestination](https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_PutDeliveryDestination.html)
 * .
 * * Create a *delivery* by pairing exactly one delivery source and one delivery destination. For
 * more information, see
 * [AWS::Logs::Delivery](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-delivery.html)
 * or
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
public open class CfnDeliverySource(
  cdkObject: software.amazon.awscdk.services.logs.CfnDeliverySource,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDeliverySourceProps,
  ) :
      this(software.amazon.awscdk.services.logs.CfnDeliverySource(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnDeliverySourceProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDeliverySourceProps.Builder.() -> Unit,
  ) : this(scope, id, CfnDeliverySourceProps(props)
  )

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
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
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
   * The ARN of the AWS resource that is generating and sending logs.
   */
  public open fun resourceArn(): String? = unwrap(this).getResourceArn()

  /**
   * The ARN of the AWS resource that is generating and sending logs.
   */
  public open fun resourceArn(`value`: String) {
    unwrap(this).setResourceArn(`value`)
  }

  /**
   * An array of key-value pairs to apply to the delivery source.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * An array of key-value pairs to apply to the delivery source.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * An array of key-value pairs to apply to the delivery source.
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
     * The ARN of the AWS resource that is generating and sending logs.
     *
     * For example,
     * `arn:aws:workmail:us-east-1:123456789012:organization/m-1234EXAMPLEabcd1234abcd1234abcd1234`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-deliverysource.html#cfn-logs-deliverysource-resourcearn)
     * @param resourceArn The ARN of the AWS resource that is generating and sending logs. 
     */
    public fun resourceArn(resourceArn: String)

    /**
     * An array of key-value pairs to apply to the delivery source.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-deliverysource.html#cfn-logs-deliverysource-tags)
     * @param tags An array of key-value pairs to apply to the delivery source. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to the delivery source.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-deliverysource.html#cfn-logs-deliverysource-tags)
     * @param tags An array of key-value pairs to apply to the delivery source. 
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
     * The ARN of the AWS resource that is generating and sending logs.
     *
     * For example,
     * `arn:aws:workmail:us-east-1:123456789012:organization/m-1234EXAMPLEabcd1234abcd1234abcd1234`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-deliverysource.html#cfn-logs-deliverysource-resourcearn)
     * @param resourceArn The ARN of the AWS resource that is generating and sending logs. 
     */
    override fun resourceArn(resourceArn: String) {
      cdkBuilder.resourceArn(resourceArn)
    }

    /**
     * An array of key-value pairs to apply to the delivery source.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-deliverysource.html#cfn-logs-deliverysource-tags)
     * @param tags An array of key-value pairs to apply to the delivery source. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * An array of key-value pairs to apply to the delivery source.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-deliverysource.html#cfn-logs-deliverysource-tags)
     * @param tags An array of key-value pairs to apply to the delivery source. 
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
        software.amazon.awscdk.services.logs.CfnDeliverySource = wrapped.cdkObject as
        software.amazon.awscdk.services.logs.CfnDeliverySource
  }
}
