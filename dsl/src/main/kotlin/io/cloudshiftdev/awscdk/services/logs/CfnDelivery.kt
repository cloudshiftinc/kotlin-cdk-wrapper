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

public open class CfnDelivery internal constructor(
  private val cdkObject: software.amazon.awscdk.services.logs.CfnDelivery,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  /**
   * The Amazon Resource Name (ARN) that uniquely identifies this delivery.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Displays whether the delivery destination associated with this delivery is CloudWatch Logs,
   * Amazon S3, or Firehose.
   */
  public open fun attrDeliveryDestinationType(): String =
      unwrap(this).getAttrDeliveryDestinationType()

  /**
   * The unique ID that identifies this delivery in your account.
   */
  public open fun attrDeliveryId(): String = unwrap(this).getAttrDeliveryId()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The ARN of the delivery destination that is associated with this delivery.
   */
  public open fun deliveryDestinationArn(): String = unwrap(this).getDeliveryDestinationArn()

  /**
   * The ARN of the delivery destination that is associated with this delivery.
   */
  public open fun deliveryDestinationArn(`value`: String) {
    unwrap(this).setDeliveryDestinationArn(`value`)
  }

  /**
   * The name of the delivery source that is associated with this delivery.
   */
  public open fun deliverySourceName(): String = unwrap(this).getDeliverySourceName()

  /**
   * The name of the delivery source that is associated with this delivery.
   */
  public open fun deliverySourceName(`value`: String) {
    unwrap(this).setDeliverySourceName(`value`)
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
   * The tags that have been assigned to this delivery.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The tags that have been assigned to this delivery.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags that have been assigned to this delivery.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.logs.CfnDelivery].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ARN of the delivery destination that is associated with this delivery.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-delivery.html#cfn-logs-delivery-deliverydestinationarn)
     * @param deliveryDestinationArn The ARN of the delivery destination that is associated with
     * this delivery. 
     */
    public fun deliveryDestinationArn(deliveryDestinationArn: String)

    /**
     * The name of the delivery source that is associated with this delivery.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-delivery.html#cfn-logs-delivery-deliverysourcename)
     * @param deliverySourceName The name of the delivery source that is associated with this
     * delivery. 
     */
    public fun deliverySourceName(deliverySourceName: String)

    /**
     * The tags that have been assigned to this delivery.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-delivery.html#cfn-logs-delivery-tags)
     * @param tags The tags that have been assigned to this delivery. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags that have been assigned to this delivery.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-delivery.html#cfn-logs-delivery-tags)
     * @param tags The tags that have been assigned to this delivery. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.CfnDelivery.Builder =
        software.amazon.awscdk.services.logs.CfnDelivery.Builder.create(scope, id)

    /**
     * The ARN of the delivery destination that is associated with this delivery.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-delivery.html#cfn-logs-delivery-deliverydestinationarn)
     * @param deliveryDestinationArn The ARN of the delivery destination that is associated with
     * this delivery. 
     */
    override fun deliveryDestinationArn(deliveryDestinationArn: String) {
      cdkBuilder.deliveryDestinationArn(deliveryDestinationArn)
    }

    /**
     * The name of the delivery source that is associated with this delivery.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-delivery.html#cfn-logs-delivery-deliverysourcename)
     * @param deliverySourceName The name of the delivery source that is associated with this
     * delivery. 
     */
    override fun deliverySourceName(deliverySourceName: String) {
      cdkBuilder.deliverySourceName(deliverySourceName)
    }

    /**
     * The tags that have been assigned to this delivery.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-delivery.html#cfn-logs-delivery-tags)
     * @param tags The tags that have been assigned to this delivery. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags that have been assigned to this delivery.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-delivery.html#cfn-logs-delivery-tags)
     * @param tags The tags that have been assigned to this delivery. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.logs.CfnDelivery = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDelivery {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDelivery(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnDelivery): CfnDelivery =
        CfnDelivery(cdkObject)

    internal fun unwrap(wrapped: CfnDelivery): software.amazon.awscdk.services.logs.CfnDelivery =
        wrapped.cdkObject
  }
}
