@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnRouteServerAssociation`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnRouteServerAssociationProps cfnRouteServerAssociationProps =
 * CfnRouteServerAssociationProps.builder()
 * .routeServerId("routeServerId")
 * .vpcId("vpcId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routeserverassociation.html)
 */
public interface CfnRouteServerAssociationProps {
  /**
   * The ID of the associated route server.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routeserverassociation.html#cfn-ec2-routeserverassociation-routeserverid)
   */
  public fun routeServerId(): String

  /**
   * The ID of the associated VPC.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routeserverassociation.html#cfn-ec2-routeserverassociation-vpcid)
   */
  public fun vpcId(): String

  /**
   * A builder for [CfnRouteServerAssociationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param routeServerId The ID of the associated route server. 
     */
    public fun routeServerId(routeServerId: String)

    /**
     * @param vpcId The ID of the associated VPC. 
     */
    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnRouteServerAssociationProps.Builder =
        software.amazon.awscdk.services.ec2.CfnRouteServerAssociationProps.builder()

    /**
     * @param routeServerId The ID of the associated route server. 
     */
    override fun routeServerId(routeServerId: String) {
      cdkBuilder.routeServerId(routeServerId)
    }

    /**
     * @param vpcId The ID of the associated VPC. 
     */
    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnRouteServerAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.CfnRouteServerAssociationProps,
  ) : CdkObject(cdkObject),
      CfnRouteServerAssociationProps {
    /**
     * The ID of the associated route server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routeserverassociation.html#cfn-ec2-routeserverassociation-routeserverid)
     */
    override fun routeServerId(): String = unwrap(this).getRouteServerId()

    /**
     * The ID of the associated VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routeserverassociation.html#cfn-ec2-routeserverassociation-vpcid)
     */
    override fun vpcId(): String = unwrap(this).getVpcId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRouteServerAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnRouteServerAssociationProps):
        CfnRouteServerAssociationProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnRouteServerAssociationProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRouteServerAssociationProps):
        software.amazon.awscdk.services.ec2.CfnRouteServerAssociationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnRouteServerAssociationProps
  }
}
