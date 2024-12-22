@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * VPC Block Public Access (BPA) enables you to block resources in VPCs and subnets that you own in
 * a Region from reaching or being reached from the internet through internet gateways and egress-only
 * internet gateways.
 *
 * To learn more about VPC BPA, see [Block public access to VPCs and
 * subnets](https://docs.aws.amazon.com/vpc/latest/userguide/security-vpc-bpa.html) in the *Amazon VPC
 * User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnVPCBlockPublicAccessOptions cfnVPCBlockPublicAccessOptions =
 * CfnVPCBlockPublicAccessOptions.Builder.create(this, "MyCfnVPCBlockPublicAccessOptions")
 * .internetGatewayBlockMode("internetGatewayBlockMode")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcblockpublicaccessoptions.html)
 */
public open class CfnVPCBlockPublicAccessOptions(
  cdkObject: software.amazon.awscdk.services.ec2.CfnVPCBlockPublicAccessOptions,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnVPCBlockPublicAccessOptionsProps,
  ) :
      this(software.amazon.awscdk.services.ec2.CfnVPCBlockPublicAccessOptions(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnVPCBlockPublicAccessOptionsProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnVPCBlockPublicAccessOptionsProps.Builder.() -> Unit,
  ) : this(scope, id, CfnVPCBlockPublicAccessOptionsProps(props)
  )

  /**
   * The ID of the AWS account.
   */
  public open fun attrAccountId(): String = unwrap(this).getAttrAccountId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The desired VPC Block Public Access mode for internet gateways in your account.
   */
  public open fun internetGatewayBlockMode(): String = unwrap(this).getInternetGatewayBlockMode()

  /**
   * The desired VPC Block Public Access mode for internet gateways in your account.
   */
  public open fun internetGatewayBlockMode(`value`: String) {
    unwrap(this).setInternetGatewayBlockMode(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnVPCBlockPublicAccessOptions].
   */
  @CdkDslMarker
  public interface Builder {
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
     * @param internetGatewayBlockMode The desired VPC Block Public Access mode for internet
     * gateways in your account. 
     */
    public fun internetGatewayBlockMode(internetGatewayBlockMode: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnVPCBlockPublicAccessOptions.Builder =
        software.amazon.awscdk.services.ec2.CfnVPCBlockPublicAccessOptions.Builder.create(scope, id)

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
     * @param internetGatewayBlockMode The desired VPC Block Public Access mode for internet
     * gateways in your account. 
     */
    override fun internetGatewayBlockMode(internetGatewayBlockMode: String) {
      cdkBuilder.internetGatewayBlockMode(internetGatewayBlockMode)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnVPCBlockPublicAccessOptions =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnVPCBlockPublicAccessOptions.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnVPCBlockPublicAccessOptions {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnVPCBlockPublicAccessOptions(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVPCBlockPublicAccessOptions):
        CfnVPCBlockPublicAccessOptions = CfnVPCBlockPublicAccessOptions(cdkObject)

    internal fun unwrap(wrapped: CfnVPCBlockPublicAccessOptions):
        software.amazon.awscdk.services.ec2.CfnVPCBlockPublicAccessOptions = wrapped.cdkObject as
        software.amazon.awscdk.services.ec2.CfnVPCBlockPublicAccessOptions
  }
}
