@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnVPCBlockPublicAccessOptions`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnVPCBlockPublicAccessOptionsProps cfnVPCBlockPublicAccessOptionsProps =
 * CfnVPCBlockPublicAccessOptionsProps.builder()
 * .internetGatewayBlockMode("internetGatewayBlockMode")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcblockpublicaccessoptions.html)
 */
public interface CfnVPCBlockPublicAccessOptionsProps {
  /**
   * The desired VPC Block Public Access mode for internet gateways in your account.
   *
   * We do not allow you to create this resource type in an "off" mode since off is the default
   * value.
   *
   * * `block-bidirectional` : Block all traffic to and from internet gateways and egress-only
   * internet gateways in this Region (except for excluded VPCs and subnets).
   * * `block-ingress` : Block all internet traffic to the VPCs in this Region (except for VPCs or
   * subnets which are excluded). Only traffic to and from NAT gateways and egress-only internet
   * gateways is allowed because these gateways only allow outbound connections to be established.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcblockpublicaccessoptions.html#cfn-ec2-vpcblockpublicaccessoptions-internetgatewayblockmode)
   */
  public fun internetGatewayBlockMode(): String

  /**
   * A builder for [CfnVPCBlockPublicAccessOptionsProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param internetGatewayBlockMode The desired VPC Block Public Access mode for internet
     * gateways in your account. 
     * We do not allow you to create this resource type in an "off" mode since off is the default
     * value.
     *
     * * `block-bidirectional` : Block all traffic to and from internet gateways and egress-only
     * internet gateways in this Region (except for excluded VPCs and subnets).
     * * `block-ingress` : Block all internet traffic to the VPCs in this Region (except for VPCs or
     * subnets which are excluded). Only traffic to and from NAT gateways and egress-only internet
     * gateways is allowed because these gateways only allow outbound connections to be established.
     */
    public fun internetGatewayBlockMode(internetGatewayBlockMode: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnVPCBlockPublicAccessOptionsProps.Builder =
        software.amazon.awscdk.services.ec2.CfnVPCBlockPublicAccessOptionsProps.builder()

    /**
     * @param internetGatewayBlockMode The desired VPC Block Public Access mode for internet
     * gateways in your account. 
     * We do not allow you to create this resource type in an "off" mode since off is the default
     * value.
     *
     * * `block-bidirectional` : Block all traffic to and from internet gateways and egress-only
     * internet gateways in this Region (except for excluded VPCs and subnets).
     * * `block-ingress` : Block all internet traffic to the VPCs in this Region (except for VPCs or
     * subnets which are excluded). Only traffic to and from NAT gateways and egress-only internet
     * gateways is allowed because these gateways only allow outbound connections to be established.
     */
    override fun internetGatewayBlockMode(internetGatewayBlockMode: String) {
      cdkBuilder.internetGatewayBlockMode(internetGatewayBlockMode)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnVPCBlockPublicAccessOptionsProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.CfnVPCBlockPublicAccessOptionsProps,
  ) : CdkObject(cdkObject),
      CfnVPCBlockPublicAccessOptionsProps {
    /**
     * The desired VPC Block Public Access mode for internet gateways in your account.
     *
     * We do not allow you to create this resource type in an "off" mode since off is the default
     * value.
     *
     * * `block-bidirectional` : Block all traffic to and from internet gateways and egress-only
     * internet gateways in this Region (except for excluded VPCs and subnets).
     * * `block-ingress` : Block all internet traffic to the VPCs in this Region (except for VPCs or
     * subnets which are excluded). Only traffic to and from NAT gateways and egress-only internet
     * gateways is allowed because these gateways only allow outbound connections to be established.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcblockpublicaccessoptions.html#cfn-ec2-vpcblockpublicaccessoptions-internetgatewayblockmode)
     */
    override fun internetGatewayBlockMode(): String = unwrap(this).getInternetGatewayBlockMode()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnVPCBlockPublicAccessOptionsProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVPCBlockPublicAccessOptionsProps):
        CfnVPCBlockPublicAccessOptionsProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnVPCBlockPublicAccessOptionsProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnVPCBlockPublicAccessOptionsProps):
        software.amazon.awscdk.services.ec2.CfnVPCBlockPublicAccessOptionsProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.CfnVPCBlockPublicAccessOptionsProps
  }
}
