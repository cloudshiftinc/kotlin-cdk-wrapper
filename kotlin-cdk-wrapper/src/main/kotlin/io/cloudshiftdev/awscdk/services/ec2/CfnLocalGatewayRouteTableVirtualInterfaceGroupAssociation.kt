@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

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
 * Describes an association between a local gateway route table and a virtual interface group.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociation
 * cfnLocalGatewayRouteTableVirtualInterfaceGroupAssociation =
 * CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociation.Builder.create(this,
 * "MyCfnLocalGatewayRouteTableVirtualInterfaceGroupAssociation")
 * .localGatewayRouteTableId("localGatewayRouteTableId")
 * .localGatewayVirtualInterfaceGroupId("localGatewayVirtualInterfaceGroupId")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroutetablevirtualinterfacegroupassociation.html)
 */
public open class CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociation internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociation,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociationProps,
  ) :
      this(software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociation(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociationProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociationProps(props)
  )

  /**
   * The ID of the local gateway.
   */
  public open fun attrLocalGatewayId(): String = unwrap(this).getAttrLocalGatewayId()

  /**
   * The Amazon Resource Name (ARN) of the local gateway route table for the virtual interface
   * group.
   */
  public open fun attrLocalGatewayRouteTableArn(): String =
      unwrap(this).getAttrLocalGatewayRouteTableArn()

  /**
   * The ID of the association.
   */
  public open fun attrLocalGatewayRouteTableVirtualInterfaceGroupAssociationId(): String =
      unwrap(this).getAttrLocalGatewayRouteTableVirtualInterfaceGroupAssociationId()

  /**
   * The ID of the AWS account that owns the local gateway virtual interface group association.
   */
  public open fun attrOwnerId(): String = unwrap(this).getAttrOwnerId()

  /**
   * The state of the association.
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
   * The ID of the local gateway route table.
   */
  public open fun localGatewayRouteTableId(): String = unwrap(this).getLocalGatewayRouteTableId()

  /**
   * The ID of the local gateway route table.
   */
  public open fun localGatewayRouteTableId(`value`: String) {
    unwrap(this).setLocalGatewayRouteTableId(`value`)
  }

  /**
   * The ID of the virtual interface group.
   */
  public open fun localGatewayVirtualInterfaceGroupId(): String =
      unwrap(this).getLocalGatewayVirtualInterfaceGroupId()

  /**
   * The ID of the virtual interface group.
   */
  public open fun localGatewayVirtualInterfaceGroupId(`value`: String) {
    unwrap(this).setLocalGatewayVirtualInterfaceGroupId(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags assigned to the association.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags assigned to the association.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags assigned to the association.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.ec2.CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociation].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ID of the local gateway route table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroutetablevirtualinterfacegroupassociation.html#cfn-ec2-localgatewayroutetablevirtualinterfacegroupassociation-localgatewayroutetableid)
     * @param localGatewayRouteTableId The ID of the local gateway route table. 
     */
    public fun localGatewayRouteTableId(localGatewayRouteTableId: String)

    /**
     * The ID of the virtual interface group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroutetablevirtualinterfacegroupassociation.html#cfn-ec2-localgatewayroutetablevirtualinterfacegroupassociation-localgatewayvirtualinterfacegroupid)
     * @param localGatewayVirtualInterfaceGroupId The ID of the virtual interface group. 
     */
    public fun localGatewayVirtualInterfaceGroupId(localGatewayVirtualInterfaceGroupId: String)

    /**
     * The tags assigned to the association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroutetablevirtualinterfacegroupassociation.html#cfn-ec2-localgatewayroutetablevirtualinterfacegroupassociation-tags)
     * @param tags The tags assigned to the association. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags assigned to the association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroutetablevirtualinterfacegroupassociation.html#cfn-ec2-localgatewayroutetablevirtualinterfacegroupassociation-tags)
     * @param tags The tags assigned to the association. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociation.Builder
        =
        software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociation.Builder.create(scope,
        id)

    /**
     * The ID of the local gateway route table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroutetablevirtualinterfacegroupassociation.html#cfn-ec2-localgatewayroutetablevirtualinterfacegroupassociation-localgatewayroutetableid)
     * @param localGatewayRouteTableId The ID of the local gateway route table. 
     */
    override fun localGatewayRouteTableId(localGatewayRouteTableId: String) {
      cdkBuilder.localGatewayRouteTableId(localGatewayRouteTableId)
    }

    /**
     * The ID of the virtual interface group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroutetablevirtualinterfacegroupassociation.html#cfn-ec2-localgatewayroutetablevirtualinterfacegroupassociation-localgatewayvirtualinterfacegroupid)
     * @param localGatewayVirtualInterfaceGroupId The ID of the virtual interface group. 
     */
    override fun localGatewayVirtualInterfaceGroupId(localGatewayVirtualInterfaceGroupId: String) {
      cdkBuilder.localGatewayVirtualInterfaceGroupId(localGatewayVirtualInterfaceGroupId)
    }

    /**
     * The tags assigned to the association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroutetablevirtualinterfacegroupassociation.html#cfn-ec2-localgatewayroutetablevirtualinterfacegroupassociation-tags)
     * @param tags The tags assigned to the association. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags assigned to the association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroutetablevirtualinterfacegroupassociation.html#cfn-ec2-localgatewayroutetablevirtualinterfacegroupassociation-tags)
     * @param tags The tags assigned to the association. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build():
        software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociation
        = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociation.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociation(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociation):
        CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociation =
        CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociation(cdkObject)

    internal fun unwrap(wrapped: CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociation):
        software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociation
        = wrapped.cdkObject
  }
}
