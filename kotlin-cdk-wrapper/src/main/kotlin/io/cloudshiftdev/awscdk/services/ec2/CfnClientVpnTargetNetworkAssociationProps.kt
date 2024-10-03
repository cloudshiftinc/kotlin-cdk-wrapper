@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnClientVpnTargetNetworkAssociation`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnClientVpnTargetNetworkAssociationProps cfnClientVpnTargetNetworkAssociationProps =
 * CfnClientVpnTargetNetworkAssociationProps.builder()
 * .clientVpnEndpointId("clientVpnEndpointId")
 * .subnetId("subnetId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpntargetnetworkassociation.html)
 */
public interface CfnClientVpnTargetNetworkAssociationProps {
  /**
   * The ID of the Client VPN endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpntargetnetworkassociation.html#cfn-ec2-clientvpntargetnetworkassociation-clientvpnendpointid)
   */
  public fun clientVpnEndpointId(): String

  /**
   * The ID of the subnet to associate with the Client VPN endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpntargetnetworkassociation.html#cfn-ec2-clientvpntargetnetworkassociation-subnetid)
   */
  public fun subnetId(): String

  /**
   * A builder for [CfnClientVpnTargetNetworkAssociationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param clientVpnEndpointId The ID of the Client VPN endpoint. 
     */
    public fun clientVpnEndpointId(clientVpnEndpointId: String)

    /**
     * @param subnetId The ID of the subnet to associate with the Client VPN endpoint. 
     */
    public fun subnetId(subnetId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnClientVpnTargetNetworkAssociationProps.Builder =
        software.amazon.awscdk.services.ec2.CfnClientVpnTargetNetworkAssociationProps.builder()

    /**
     * @param clientVpnEndpointId The ID of the Client VPN endpoint. 
     */
    override fun clientVpnEndpointId(clientVpnEndpointId: String) {
      cdkBuilder.clientVpnEndpointId(clientVpnEndpointId)
    }

    /**
     * @param subnetId The ID of the subnet to associate with the Client VPN endpoint. 
     */
    override fun subnetId(subnetId: String) {
      cdkBuilder.subnetId(subnetId)
    }

    public fun build():
        software.amazon.awscdk.services.ec2.CfnClientVpnTargetNetworkAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.CfnClientVpnTargetNetworkAssociationProps,
  ) : CdkObject(cdkObject),
      CfnClientVpnTargetNetworkAssociationProps {
    /**
     * The ID of the Client VPN endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpntargetnetworkassociation.html#cfn-ec2-clientvpntargetnetworkassociation-clientvpnendpointid)
     */
    override fun clientVpnEndpointId(): String = unwrap(this).getClientVpnEndpointId()

    /**
     * The ID of the subnet to associate with the Client VPN endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpntargetnetworkassociation.html#cfn-ec2-clientvpntargetnetworkassociation-subnetid)
     */
    override fun subnetId(): String = unwrap(this).getSubnetId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnClientVpnTargetNetworkAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnClientVpnTargetNetworkAssociationProps):
        CfnClientVpnTargetNetworkAssociationProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnClientVpnTargetNetworkAssociationProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnClientVpnTargetNetworkAssociationProps):
        software.amazon.awscdk.services.ec2.CfnClientVpnTargetNetworkAssociationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.CfnClientVpnTargetNetworkAssociationProps
  }
}
