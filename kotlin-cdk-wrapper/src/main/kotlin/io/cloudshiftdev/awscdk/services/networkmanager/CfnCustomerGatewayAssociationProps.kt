@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.networkmanager

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnCustomerGatewayAssociation`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.networkmanager.*;
 * CfnCustomerGatewayAssociationProps cfnCustomerGatewayAssociationProps =
 * CfnCustomerGatewayAssociationProps.builder()
 * .customerGatewayArn("customerGatewayArn")
 * .deviceId("deviceId")
 * .globalNetworkId("globalNetworkId")
 * // the properties below are optional
 * .linkId("linkId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-customergatewayassociation.html)
 */
public interface CfnCustomerGatewayAssociationProps {
  /**
   * The Amazon Resource Name (ARN) of the customer gateway.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-customergatewayassociation.html#cfn-networkmanager-customergatewayassociation-customergatewayarn)
   */
  public fun customerGatewayArn(): String

  /**
   * The ID of the device.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-customergatewayassociation.html#cfn-networkmanager-customergatewayassociation-deviceid)
   */
  public fun deviceId(): String

  /**
   * The ID of the global network.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-customergatewayassociation.html#cfn-networkmanager-customergatewayassociation-globalnetworkid)
   */
  public fun globalNetworkId(): String

  /**
   * The ID of the link.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-customergatewayassociation.html#cfn-networkmanager-customergatewayassociation-linkid)
   */
  public fun linkId(): String? = unwrap(this).getLinkId()

  /**
   * A builder for [CfnCustomerGatewayAssociationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param customerGatewayArn The Amazon Resource Name (ARN) of the customer gateway. 
     */
    public fun customerGatewayArn(customerGatewayArn: String)

    /**
     * @param deviceId The ID of the device. 
     */
    public fun deviceId(deviceId: String)

    /**
     * @param globalNetworkId The ID of the global network. 
     */
    public fun globalNetworkId(globalNetworkId: String)

    /**
     * @param linkId The ID of the link.
     */
    public fun linkId(linkId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.networkmanager.CfnCustomerGatewayAssociationProps.Builder =
        software.amazon.awscdk.services.networkmanager.CfnCustomerGatewayAssociationProps.builder()

    /**
     * @param customerGatewayArn The Amazon Resource Name (ARN) of the customer gateway. 
     */
    override fun customerGatewayArn(customerGatewayArn: String) {
      cdkBuilder.customerGatewayArn(customerGatewayArn)
    }

    /**
     * @param deviceId The ID of the device. 
     */
    override fun deviceId(deviceId: String) {
      cdkBuilder.deviceId(deviceId)
    }

    /**
     * @param globalNetworkId The ID of the global network. 
     */
    override fun globalNetworkId(globalNetworkId: String) {
      cdkBuilder.globalNetworkId(globalNetworkId)
    }

    /**
     * @param linkId The ID of the link.
     */
    override fun linkId(linkId: String) {
      cdkBuilder.linkId(linkId)
    }

    public fun build():
        software.amazon.awscdk.services.networkmanager.CfnCustomerGatewayAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.networkmanager.CfnCustomerGatewayAssociationProps,
  ) : CdkObject(cdkObject), CfnCustomerGatewayAssociationProps {
    /**
     * The Amazon Resource Name (ARN) of the customer gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-customergatewayassociation.html#cfn-networkmanager-customergatewayassociation-customergatewayarn)
     */
    override fun customerGatewayArn(): String = unwrap(this).getCustomerGatewayArn()

    /**
     * The ID of the device.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-customergatewayassociation.html#cfn-networkmanager-customergatewayassociation-deviceid)
     */
    override fun deviceId(): String = unwrap(this).getDeviceId()

    /**
     * The ID of the global network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-customergatewayassociation.html#cfn-networkmanager-customergatewayassociation-globalnetworkid)
     */
    override fun globalNetworkId(): String = unwrap(this).getGlobalNetworkId()

    /**
     * The ID of the link.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-customergatewayassociation.html#cfn-networkmanager-customergatewayassociation-linkid)
     */
    override fun linkId(): String? = unwrap(this).getLinkId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCustomerGatewayAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnCustomerGatewayAssociationProps):
        CfnCustomerGatewayAssociationProps = CdkObjectWrappers.wrap(cdkObject) as
        CfnCustomerGatewayAssociationProps

    internal fun unwrap(wrapped: CfnCustomerGatewayAssociationProps):
        software.amazon.awscdk.services.networkmanager.CfnCustomerGatewayAssociationProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.networkmanager.CfnCustomerGatewayAssociationProps
  }
}
