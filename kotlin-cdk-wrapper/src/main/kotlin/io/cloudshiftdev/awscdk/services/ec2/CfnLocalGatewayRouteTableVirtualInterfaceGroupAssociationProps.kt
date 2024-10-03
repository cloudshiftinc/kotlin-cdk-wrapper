@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociation`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociationProps
 * cfnLocalGatewayRouteTableVirtualInterfaceGroupAssociationProps =
 * CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociationProps.builder()
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
public interface CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociationProps {
  /**
   * The ID of the local gateway route table.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroutetablevirtualinterfacegroupassociation.html#cfn-ec2-localgatewayroutetablevirtualinterfacegroupassociation-localgatewayroutetableid)
   */
  public fun localGatewayRouteTableId(): String

  /**
   * The ID of the virtual interface group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroutetablevirtualinterfacegroupassociation.html#cfn-ec2-localgatewayroutetablevirtualinterfacegroupassociation-localgatewayvirtualinterfacegroupid)
   */
  public fun localGatewayVirtualInterfaceGroupId(): String

  /**
   * The tags assigned to the association.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroutetablevirtualinterfacegroupassociation.html#cfn-ec2-localgatewayroutetablevirtualinterfacegroupassociation-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param localGatewayRouteTableId The ID of the local gateway route table. 
     */
    public fun localGatewayRouteTableId(localGatewayRouteTableId: String)

    /**
     * @param localGatewayVirtualInterfaceGroupId The ID of the virtual interface group. 
     */
    public fun localGatewayVirtualInterfaceGroupId(localGatewayVirtualInterfaceGroupId: String)

    /**
     * @param tags The tags assigned to the association.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags assigned to the association.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociationProps.Builder
        =
        software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociationProps.builder()

    /**
     * @param localGatewayRouteTableId The ID of the local gateway route table. 
     */
    override fun localGatewayRouteTableId(localGatewayRouteTableId: String) {
      cdkBuilder.localGatewayRouteTableId(localGatewayRouteTableId)
    }

    /**
     * @param localGatewayVirtualInterfaceGroupId The ID of the virtual interface group. 
     */
    override fun localGatewayVirtualInterfaceGroupId(localGatewayVirtualInterfaceGroupId: String) {
      cdkBuilder.localGatewayVirtualInterfaceGroupId(localGatewayVirtualInterfaceGroupId)
    }

    /**
     * @param tags The tags assigned to the association.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The tags assigned to the association.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build():
        software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociationProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociationProps,
  ) : CdkObject(cdkObject),
      CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociationProps {
    /**
     * The ID of the local gateway route table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroutetablevirtualinterfacegroupassociation.html#cfn-ec2-localgatewayroutetablevirtualinterfacegroupassociation-localgatewayroutetableid)
     */
    override fun localGatewayRouteTableId(): String = unwrap(this).getLocalGatewayRouteTableId()

    /**
     * The ID of the virtual interface group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroutetablevirtualinterfacegroupassociation.html#cfn-ec2-localgatewayroutetablevirtualinterfacegroupassociation-localgatewayvirtualinterfacegroupid)
     */
    override fun localGatewayVirtualInterfaceGroupId(): String =
        unwrap(this).getLocalGatewayVirtualInterfaceGroupId()

    /**
     * The tags assigned to the association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroutetablevirtualinterfacegroupassociation.html#cfn-ec2-localgatewayroutetablevirtualinterfacegroupassociation-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociationProps):
        CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociationProps =
        CdkObjectWrappers.wrap(cdkObject) as?
        CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociationProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociationProps):
        software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociationProps
        = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociationProps
  }
}
