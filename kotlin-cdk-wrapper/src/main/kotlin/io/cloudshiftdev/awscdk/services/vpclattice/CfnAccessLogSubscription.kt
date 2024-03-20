@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.vpclattice

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Enables access logs to be sent to Amazon CloudWatch, Amazon S3, and Amazon Kinesis Data Firehose.
 *
 * The service network owner can use the access logs to audit the services in the network. The
 * service network owner can only see access logs from clients and services that are associated with
 * their service network. Access log entries represent traffic originated from VPCs associated with
 * that network. For more information, see [Access
 * logs](https://docs.aws.amazon.com/vpc-lattice/latest/ug/monitoring-access-logs.html) in the *Amazon
 * VPC Lattice User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.vpclattice.*;
 * CfnAccessLogSubscription cfnAccessLogSubscription = CfnAccessLogSubscription.Builder.create(this,
 * "MyCfnAccessLogSubscription")
 * .destinationArn("destinationArn")
 * // the properties below are optional
 * .resourceIdentifier("resourceIdentifier")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-accesslogsubscription.html)
 */
public open class CfnAccessLogSubscription internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.vpclattice.CfnAccessLogSubscription,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAccessLogSubscriptionProps,
  ) :
      this(software.amazon.awscdk.services.vpclattice.CfnAccessLogSubscription(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnAccessLogSubscriptionProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAccessLogSubscriptionProps.Builder.() -> Unit,
  ) : this(scope, id, CfnAccessLogSubscriptionProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the access log subscription.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The ID of the access log subscription.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The Amazon Resource Name (ARN) of the access log subscription.
   */
  public open fun attrResourceArn(): String = unwrap(this).getAttrResourceArn()

  /**
   * The ID of the service network or service.
   */
  public open fun attrResourceId(): String = unwrap(this).getAttrResourceId()

  /**
   * The Amazon Resource Name (ARN) of the destination.
   */
  public open fun destinationArn(): String = unwrap(this).getDestinationArn()

  /**
   * The Amazon Resource Name (ARN) of the destination.
   */
  public open fun destinationArn(`value`: String) {
    unwrap(this).setDestinationArn(`value`)
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
   * The ID or Amazon Resource Name (ARN) of the service network or service.
   */
  public open fun resourceIdentifier(): String? = unwrap(this).getResourceIdentifier()

  /**
   * The ID or Amazon Resource Name (ARN) of the service network or service.
   */
  public open fun resourceIdentifier(`value`: String) {
    unwrap(this).setResourceIdentifier(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags for the access log subscription.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags for the access log subscription.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags for the access log subscription.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.vpclattice.CfnAccessLogSubscription].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Amazon Resource Name (ARN) of the destination.
     *
     * The supported destination types are CloudWatch Log groups, Kinesis Data Firehose delivery
     * streams, and Amazon S3 buckets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-accesslogsubscription.html#cfn-vpclattice-accesslogsubscription-destinationarn)
     * @param destinationArn The Amazon Resource Name (ARN) of the destination. 
     */
    public fun destinationArn(destinationArn: String)

    /**
     * The ID or Amazon Resource Name (ARN) of the service network or service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-accesslogsubscription.html#cfn-vpclattice-accesslogsubscription-resourceidentifier)
     * @param resourceIdentifier The ID or Amazon Resource Name (ARN) of the service network or
     * service. 
     */
    public fun resourceIdentifier(resourceIdentifier: String)

    /**
     * The tags for the access log subscription.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-accesslogsubscription.html#cfn-vpclattice-accesslogsubscription-tags)
     * @param tags The tags for the access log subscription. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags for the access log subscription.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-accesslogsubscription.html#cfn-vpclattice-accesslogsubscription-tags)
     * @param tags The tags for the access log subscription. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.vpclattice.CfnAccessLogSubscription.Builder =
        software.amazon.awscdk.services.vpclattice.CfnAccessLogSubscription.Builder.create(scope,
        id)

    /**
     * The Amazon Resource Name (ARN) of the destination.
     *
     * The supported destination types are CloudWatch Log groups, Kinesis Data Firehose delivery
     * streams, and Amazon S3 buckets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-accesslogsubscription.html#cfn-vpclattice-accesslogsubscription-destinationarn)
     * @param destinationArn The Amazon Resource Name (ARN) of the destination. 
     */
    override fun destinationArn(destinationArn: String) {
      cdkBuilder.destinationArn(destinationArn)
    }

    /**
     * The ID or Amazon Resource Name (ARN) of the service network or service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-accesslogsubscription.html#cfn-vpclattice-accesslogsubscription-resourceidentifier)
     * @param resourceIdentifier The ID or Amazon Resource Name (ARN) of the service network or
     * service. 
     */
    override fun resourceIdentifier(resourceIdentifier: String) {
      cdkBuilder.resourceIdentifier(resourceIdentifier)
    }

    /**
     * The tags for the access log subscription.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-accesslogsubscription.html#cfn-vpclattice-accesslogsubscription-tags)
     * @param tags The tags for the access log subscription. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags for the access log subscription.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-accesslogsubscription.html#cfn-vpclattice-accesslogsubscription-tags)
     * @param tags The tags for the access log subscription. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.vpclattice.CfnAccessLogSubscription =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.vpclattice.CfnAccessLogSubscription.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAccessLogSubscription {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAccessLogSubscription(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.vpclattice.CfnAccessLogSubscription):
        CfnAccessLogSubscription = CfnAccessLogSubscription(cdkObject)

    internal fun unwrap(wrapped: CfnAccessLogSubscription):
        software.amazon.awscdk.services.vpclattice.CfnAccessLogSubscription = wrapped.cdkObject
  }
}
