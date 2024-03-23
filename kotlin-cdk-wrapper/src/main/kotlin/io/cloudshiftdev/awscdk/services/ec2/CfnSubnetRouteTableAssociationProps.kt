@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnSubnetRouteTableAssociation`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnSubnetRouteTableAssociationProps cfnSubnetRouteTableAssociationProps =
 * CfnSubnetRouteTableAssociationProps.builder()
 * .routeTableId("routeTableId")
 * .subnetId("subnetId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnetroutetableassociation.html)
 */
public interface CfnSubnetRouteTableAssociationProps {
  /**
   * The ID of the route table.
   *
   * The physical ID changes when the route table ID is changed.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnetroutetableassociation.html#cfn-ec2-subnetroutetableassociation-routetableid)
   */
  public fun routeTableId(): String

  /**
   * The ID of the subnet.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnetroutetableassociation.html#cfn-ec2-subnetroutetableassociation-subnetid)
   */
  public fun subnetId(): String

  /**
   * A builder for [CfnSubnetRouteTableAssociationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param routeTableId The ID of the route table. 
     * The physical ID changes when the route table ID is changed.
     */
    public fun routeTableId(routeTableId: String)

    /**
     * @param subnetId The ID of the subnet. 
     */
    public fun subnetId(subnetId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnSubnetRouteTableAssociationProps.Builder =
        software.amazon.awscdk.services.ec2.CfnSubnetRouteTableAssociationProps.builder()

    /**
     * @param routeTableId The ID of the route table. 
     * The physical ID changes when the route table ID is changed.
     */
    override fun routeTableId(routeTableId: String) {
      cdkBuilder.routeTableId(routeTableId)
    }

    /**
     * @param subnetId The ID of the subnet. 
     */
    override fun subnetId(subnetId: String) {
      cdkBuilder.subnetId(subnetId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnSubnetRouteTableAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.CfnSubnetRouteTableAssociationProps,
  ) : CdkObject(cdkObject), CfnSubnetRouteTableAssociationProps {
    /**
     * The ID of the route table.
     *
     * The physical ID changes when the route table ID is changed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnetroutetableassociation.html#cfn-ec2-subnetroutetableassociation-routetableid)
     */
    override fun routeTableId(): String = unwrap(this).getRouteTableId()

    /**
     * The ID of the subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnetroutetableassociation.html#cfn-ec2-subnetroutetableassociation-subnetid)
     */
    override fun subnetId(): String = unwrap(this).getSubnetId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnSubnetRouteTableAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSubnetRouteTableAssociationProps):
        CfnSubnetRouteTableAssociationProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnSubnetRouteTableAssociationProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSubnetRouteTableAssociationProps):
        software.amazon.awscdk.services.ec2.CfnSubnetRouteTableAssociationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.CfnSubnetRouteTableAssociationProps
  }
}
