@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnEgressOnlyInternetGateway`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnEgressOnlyInternetGatewayProps cfnEgressOnlyInternetGatewayProps =
 * CfnEgressOnlyInternetGatewayProps.builder()
 * .vpcId("vpcId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-egressonlyinternetgateway.html)
 */
public interface CfnEgressOnlyInternetGatewayProps {
  /**
   * The ID of the VPC for which to create the egress-only internet gateway.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-egressonlyinternetgateway.html#cfn-ec2-egressonlyinternetgateway-vpcid)
   */
  public fun vpcId(): String

  /**
   * A builder for [CfnEgressOnlyInternetGatewayProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param vpcId The ID of the VPC for which to create the egress-only internet gateway. 
     */
    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnEgressOnlyInternetGatewayProps.Builder =
        software.amazon.awscdk.services.ec2.CfnEgressOnlyInternetGatewayProps.builder()

    /**
     * @param vpcId The ID of the VPC for which to create the egress-only internet gateway. 
     */
    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnEgressOnlyInternetGatewayProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnEgressOnlyInternetGatewayProps,
  ) : CdkObject(cdkObject), CfnEgressOnlyInternetGatewayProps {
    /**
     * The ID of the VPC for which to create the egress-only internet gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-egressonlyinternetgateway.html#cfn-ec2-egressonlyinternetgateway-vpcid)
     */
    override fun vpcId(): String = unwrap(this).getVpcId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEgressOnlyInternetGatewayProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnEgressOnlyInternetGatewayProps):
        CfnEgressOnlyInternetGatewayProps = CdkObjectWrappers.wrap(cdkObject) as
        CfnEgressOnlyInternetGatewayProps

    internal fun unwrap(wrapped: CfnEgressOnlyInternetGatewayProps):
        software.amazon.awscdk.services.ec2.CfnEgressOnlyInternetGatewayProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.CfnEgressOnlyInternetGatewayProps
  }
}
