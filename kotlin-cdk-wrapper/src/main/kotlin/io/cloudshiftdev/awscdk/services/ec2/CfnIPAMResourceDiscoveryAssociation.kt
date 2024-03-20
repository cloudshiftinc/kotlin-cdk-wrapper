@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
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
 * An IPAM resource discovery association.
 *
 * An associated resource discovery is a resource discovery that has been associated with an IPAM.
 * IPAM aggregates the resource CIDRs discovered by the associated resource discovery.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnIPAMResourceDiscoveryAssociation cfnIPAMResourceDiscoveryAssociation =
 * CfnIPAMResourceDiscoveryAssociation.Builder.create(this, "MyCfnIPAMResourceDiscoveryAssociation")
 * .ipamId("ipamId")
 * .ipamResourceDiscoveryId("ipamResourceDiscoveryId")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipamresourcediscoveryassociation.html)
 */
public open class CfnIPAMResourceDiscoveryAssociation internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscoveryAssociation,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnIPAMResourceDiscoveryAssociationProps,
  ) :
      this(software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscoveryAssociation(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnIPAMResourceDiscoveryAssociationProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnIPAMResourceDiscoveryAssociationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnIPAMResourceDiscoveryAssociationProps(props)
  )

  /**
   * The IPAM ARN.
   */
  public open fun attrIpamArn(): String = unwrap(this).getAttrIpamArn()

  /**
   * The IPAM home Region.
   */
  public open fun attrIpamRegion(): String = unwrap(this).getAttrIpamRegion()

  /**
   * The resource discovery association ARN.
   */
  public open fun attrIpamResourceDiscoveryAssociationArn(): String =
      unwrap(this).getAttrIpamResourceDiscoveryAssociationArn()

  /**
   * The resource discovery association ID.
   */
  public open fun attrIpamResourceDiscoveryAssociationId(): String =
      unwrap(this).getAttrIpamResourceDiscoveryAssociationId()

  /**
   * Defines if the resource discovery is the default.
   *
   * When you create an IPAM, a default resource discovery is created for your IPAM and it's
   * associated with your IPAM.
   */
  public open fun attrIsDefault(): IResolvable =
      unwrap(this).getAttrIsDefault().let(IResolvable::wrap)

  /**
   * The owner ID.
   */
  public open fun attrOwnerId(): String = unwrap(this).getAttrOwnerId()

  /**
   * The resource discovery status.
   *
   * * `active` - Connection or permissions required to read the results of the resource discovery
   * are intact.
   * * `not-found` - Connection or permissions required to read the results of the resource
   * discovery are broken. This may happen if the owner of the resource discovery stopped sharing it or
   * deleted the resource discovery. Verify the resource discovery still exists and the AWS RAM
   * resource share is still intact.
   */
  public open fun attrResourceDiscoveryStatus(): String =
      unwrap(this).getAttrResourceDiscoveryStatus()

  /**
   * The lifecycle state of the association when you associate or disassociate a resource discovery.
   *
   * * `associate-in-progress` - Resource discovery is being associated.
   * * `associate-complete` - Resource discovery association is complete.
   * * `associate-failed` - Resource discovery association has failed.
   * * `disassociate-in-progress` - Resource discovery is being disassociated.
   * * `disassociate-complete` - Resource discovery disassociation is complete.
   * * `disassociate-failed` - Resource discovery disassociation has failed.
   * * `isolate-in-progress` - AWS account that created the resource discovery association has been
   * removed and the resource discovery associatation is being isolated.
   * * `isolate-complete` - Resource discovery isolation is complete..
   * * `restore-in-progress` - Resource discovery is being restored.
   */
  public open fun attrState(): String = unwrap(this).getAttrState()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The IPAM ID.
   */
  public open fun ipamId(): String = unwrap(this).getIpamId()

  /**
   * The IPAM ID.
   */
  public open fun ipamId(`value`: String) {
    unwrap(this).setIpamId(`value`)
  }

  /**
   * The resource discovery ID.
   */
  public open fun ipamResourceDiscoveryId(): String = unwrap(this).getIpamResourceDiscoveryId()

  /**
   * The resource discovery ID.
   */
  public open fun ipamResourceDiscoveryId(`value`: String) {
    unwrap(this).setIpamResourceDiscoveryId(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * A tag is a label that you assign to an AWS resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * A tag is a label that you assign to an AWS resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * A tag is a label that you assign to an AWS resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.ec2.CfnIPAMResourceDiscoveryAssociation].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The IPAM ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipamresourcediscoveryassociation.html#cfn-ec2-ipamresourcediscoveryassociation-ipamid)
     * @param ipamId The IPAM ID. 
     */
    public fun ipamId(ipamId: String)

    /**
     * The resource discovery ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipamresourcediscoveryassociation.html#cfn-ec2-ipamresourcediscoveryassociation-ipamresourcediscoveryid)
     * @param ipamResourceDiscoveryId The resource discovery ID. 
     */
    public fun ipamResourceDiscoveryId(ipamResourceDiscoveryId: String)

    /**
     * A tag is a label that you assign to an AWS resource.
     *
     * Each tag consists of a key and an optional value. You can use tags to search and filter your
     * resources or track your AWS costs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipamresourcediscoveryassociation.html#cfn-ec2-ipamresourcediscoveryassociation-tags)
     * @param tags A tag is a label that you assign to an AWS resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A tag is a label that you assign to an AWS resource.
     *
     * Each tag consists of a key and an optional value. You can use tags to search and filter your
     * resources or track your AWS costs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipamresourcediscoveryassociation.html#cfn-ec2-ipamresourcediscoveryassociation-tags)
     * @param tags A tag is a label that you assign to an AWS resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscoveryAssociation.Builder =
        software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscoveryAssociation.Builder.create(scope,
        id)

    /**
     * The IPAM ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipamresourcediscoveryassociation.html#cfn-ec2-ipamresourcediscoveryassociation-ipamid)
     * @param ipamId The IPAM ID. 
     */
    override fun ipamId(ipamId: String) {
      cdkBuilder.ipamId(ipamId)
    }

    /**
     * The resource discovery ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipamresourcediscoveryassociation.html#cfn-ec2-ipamresourcediscoveryassociation-ipamresourcediscoveryid)
     * @param ipamResourceDiscoveryId The resource discovery ID. 
     */
    override fun ipamResourceDiscoveryId(ipamResourceDiscoveryId: String) {
      cdkBuilder.ipamResourceDiscoveryId(ipamResourceDiscoveryId)
    }

    /**
     * A tag is a label that you assign to an AWS resource.
     *
     * Each tag consists of a key and an optional value. You can use tags to search and filter your
     * resources or track your AWS costs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipamresourcediscoveryassociation.html#cfn-ec2-ipamresourcediscoveryassociation-tags)
     * @param tags A tag is a label that you assign to an AWS resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * A tag is a label that you assign to an AWS resource.
     *
     * Each tag consists of a key and an optional value. You can use tags to search and filter your
     * resources or track your AWS costs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipamresourcediscoveryassociation.html#cfn-ec2-ipamresourcediscoveryassociation-tags)
     * @param tags A tag is a label that you assign to an AWS resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscoveryAssociation =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscoveryAssociation.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnIPAMResourceDiscoveryAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnIPAMResourceDiscoveryAssociation(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscoveryAssociation):
        CfnIPAMResourceDiscoveryAssociation = CfnIPAMResourceDiscoveryAssociation(cdkObject)

    internal fun unwrap(wrapped: CfnIPAMResourceDiscoveryAssociation):
        software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscoveryAssociation = wrapped.cdkObject
  }
}
