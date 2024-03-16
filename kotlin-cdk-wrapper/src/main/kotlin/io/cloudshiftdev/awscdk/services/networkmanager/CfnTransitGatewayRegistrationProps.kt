@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.networkmanager

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnTransitGatewayRegistration`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.networkmanager.*;
 * CfnTransitGatewayRegistrationProps cfnTransitGatewayRegistrationProps =
 * CfnTransitGatewayRegistrationProps.builder()
 * .globalNetworkId("globalNetworkId")
 * .transitGatewayArn("transitGatewayArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-transitgatewayregistration.html)
 */
public interface CfnTransitGatewayRegistrationProps {
  /**
   * The ID of the global network.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-transitgatewayregistration.html#cfn-networkmanager-transitgatewayregistration-globalnetworkid)
   */
  public fun globalNetworkId(): String

  /**
   * The Amazon Resource Name (ARN) of the transit gateway.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-transitgatewayregistration.html#cfn-networkmanager-transitgatewayregistration-transitgatewayarn)
   */
  public fun transitGatewayArn(): String

  /**
   * A builder for [CfnTransitGatewayRegistrationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param globalNetworkId The ID of the global network. 
     */
    public fun globalNetworkId(globalNetworkId: String)

    /**
     * @param transitGatewayArn The Amazon Resource Name (ARN) of the transit gateway. 
     */
    public fun transitGatewayArn(transitGatewayArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRegistrationProps.Builder =
        software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRegistrationProps.builder()

    /**
     * @param globalNetworkId The ID of the global network. 
     */
    override fun globalNetworkId(globalNetworkId: String) {
      cdkBuilder.globalNetworkId(globalNetworkId)
    }

    /**
     * @param transitGatewayArn The Amazon Resource Name (ARN) of the transit gateway. 
     */
    override fun transitGatewayArn(transitGatewayArn: String) {
      cdkBuilder.transitGatewayArn(transitGatewayArn)
    }

    public fun build():
        software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRegistrationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRegistrationProps,
  ) : CdkObject(cdkObject), CfnTransitGatewayRegistrationProps {
    /**
     * The ID of the global network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-transitgatewayregistration.html#cfn-networkmanager-transitgatewayregistration-globalnetworkid)
     */
    override fun globalNetworkId(): String = unwrap(this).getGlobalNetworkId()

    /**
     * The Amazon Resource Name (ARN) of the transit gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-transitgatewayregistration.html#cfn-networkmanager-transitgatewayregistration-transitgatewayarn)
     */
    override fun transitGatewayArn(): String = unwrap(this).getTransitGatewayArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTransitGatewayRegistrationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRegistrationProps):
        CfnTransitGatewayRegistrationProps = CdkObjectWrappers.wrap(cdkObject) as
        CfnTransitGatewayRegistrationProps

    internal fun unwrap(wrapped: CfnTransitGatewayRegistrationProps):
        software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRegistrationProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRegistrationProps
  }
}
