@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * This structure contains information about one *delivery destination* in your account.
 *
 * A delivery destination is an AWS resource that represents an AWS service that logs can be sent
 * to. CloudWatch Logs, Amazon S3, are supported as Firehose delivery destinations.
 *
 * To configure logs delivery between a supported AWS service and a destination, you must do the
 * following:
 *
 * * Create a delivery source, which is a logical object that represents the resource that is
 * actually sending the logs. For more information, see
 * [PutDeliverySource](https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_PutDeliverySource.html)
 * .
 * * Create a *delivery destination* , which is a logical object that represents the actual delivery
 * destination.
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
 * Object deliveryDestinationPolicy;
 * CfnDeliveryDestination cfnDeliveryDestination = CfnDeliveryDestination.Builder.create(this,
 * "MyCfnDeliveryDestination")
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
public open class CfnDeliveryDestination internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.logs.CfnDeliveryDestination,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDeliveryDestinationProps,
  ) :
      this(software.amazon.awscdk.services.logs.CfnDeliveryDestination(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnDeliveryDestinationProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDeliveryDestinationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnDeliveryDestinationProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) that uniquely identifies this delivery destination.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Displays whether this delivery destination is CloudWatch Logs, Amazon S3, or Firehose.
   */
  public open fun attrDeliveryDestinationType(): String =
      unwrap(this).getAttrDeliveryDestinationType()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * A structure that contains information about one delivery destination policy.
   */
  public open fun deliveryDestinationPolicy(): Any? = unwrap(this).getDeliveryDestinationPolicy()

  /**
   * A structure that contains information about one delivery destination policy.
   */
  public open fun deliveryDestinationPolicy(`value`: Any) {
    unwrap(this).setDeliveryDestinationPolicy(`value`)
  }

  /**
   * The ARN of the AWS destination that this delivery destination represents.
   */
  public open fun destinationResourceArn(): String? = unwrap(this).getDestinationResourceArn()

  /**
   * The ARN of the AWS destination that this delivery destination represents.
   */
  public open fun destinationResourceArn(`value`: String) {
    unwrap(this).setDestinationResourceArn(`value`)
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
   * The name of this delivery destination.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of this delivery destination.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The tags that have been assigned to this delivery destination.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The tags that have been assigned to this delivery destination.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags that have been assigned to this delivery destination.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.logs.CfnDeliveryDestination].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A structure that contains information about one delivery destination policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-deliverydestination.html#cfn-logs-deliverydestination-deliverydestinationpolicy)
     * @param deliveryDestinationPolicy A structure that contains information about one delivery
     * destination policy. 
     */
    public fun deliveryDestinationPolicy(deliveryDestinationPolicy: Any)

    /**
     * The ARN of the AWS destination that this delivery destination represents.
     *
     * That AWS destination can be a log group in CloudWatch Logs, an Amazon S3 bucket, or a
     * delivery stream in Firehose.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-deliverydestination.html#cfn-logs-deliverydestination-destinationresourcearn)
     * @param destinationResourceArn The ARN of the AWS destination that this delivery destination
     * represents. 
     */
    public fun destinationResourceArn(destinationResourceArn: String)

    /**
     * The name of this delivery destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-deliverydestination.html#cfn-logs-deliverydestination-name)
     * @param name The name of this delivery destination. 
     */
    public fun name(name: String)

    /**
     * The tags that have been assigned to this delivery destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-deliverydestination.html#cfn-logs-deliverydestination-tags)
     * @param tags The tags that have been assigned to this delivery destination. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags that have been assigned to this delivery destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-deliverydestination.html#cfn-logs-deliverydestination-tags)
     * @param tags The tags that have been assigned to this delivery destination. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.CfnDeliveryDestination.Builder =
        software.amazon.awscdk.services.logs.CfnDeliveryDestination.Builder.create(scope, id)

    /**
     * A structure that contains information about one delivery destination policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-deliverydestination.html#cfn-logs-deliverydestination-deliverydestinationpolicy)
     * @param deliveryDestinationPolicy A structure that contains information about one delivery
     * destination policy. 
     */
    override fun deliveryDestinationPolicy(deliveryDestinationPolicy: Any) {
      cdkBuilder.deliveryDestinationPolicy(deliveryDestinationPolicy)
    }

    /**
     * The ARN of the AWS destination that this delivery destination represents.
     *
     * That AWS destination can be a log group in CloudWatch Logs, an Amazon S3 bucket, or a
     * delivery stream in Firehose.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-deliverydestination.html#cfn-logs-deliverydestination-destinationresourcearn)
     * @param destinationResourceArn The ARN of the AWS destination that this delivery destination
     * represents. 
     */
    override fun destinationResourceArn(destinationResourceArn: String) {
      cdkBuilder.destinationResourceArn(destinationResourceArn)
    }

    /**
     * The name of this delivery destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-deliverydestination.html#cfn-logs-deliverydestination-name)
     * @param name The name of this delivery destination. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The tags that have been assigned to this delivery destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-deliverydestination.html#cfn-logs-deliverydestination-tags)
     * @param tags The tags that have been assigned to this delivery destination. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags that have been assigned to this delivery destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-deliverydestination.html#cfn-logs-deliverydestination-tags)
     * @param tags The tags that have been assigned to this delivery destination. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.logs.CfnDeliveryDestination =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.logs.CfnDeliveryDestination.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDeliveryDestination {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDeliveryDestination(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnDeliveryDestination):
        CfnDeliveryDestination = CfnDeliveryDestination(cdkObject)

    internal fun unwrap(wrapped: CfnDeliveryDestination):
        software.amazon.awscdk.services.logs.CfnDeliveryDestination = wrapped.cdkObject
  }
}
