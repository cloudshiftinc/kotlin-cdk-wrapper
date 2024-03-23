@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Attributes of an imported VpnConnection.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * VpnConnectionAttributes vpnConnectionAttributes = VpnConnectionAttributes.builder()
 * .customerGatewayAsn(123)
 * .customerGatewayId("customerGatewayId")
 * .customerGatewayIp("customerGatewayIp")
 * .vpnId("vpnId")
 * .build();
 * ```
 */
public interface VpnConnectionAttributes {
  /**
   * The ASN of the customer gateway.
   */
  public fun customerGatewayAsn(): Number

  /**
   * The id of the customer gateway.
   */
  public fun customerGatewayId(): String

  /**
   * The ip address of the customer gateway.
   */
  public fun customerGatewayIp(): String

  /**
   * The id of the VPN connection.
   */
  public fun vpnId(): String

  /**
   * A builder for [VpnConnectionAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param customerGatewayAsn The ASN of the customer gateway. 
     */
    public fun customerGatewayAsn(customerGatewayAsn: Number)

    /**
     * @param customerGatewayId The id of the customer gateway. 
     */
    public fun customerGatewayId(customerGatewayId: String)

    /**
     * @param customerGatewayIp The ip address of the customer gateway. 
     */
    public fun customerGatewayIp(customerGatewayIp: String)

    /**
     * @param vpnId The id of the VPN connection. 
     */
    public fun vpnId(vpnId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.VpnConnectionAttributes.Builder =
        software.amazon.awscdk.services.ec2.VpnConnectionAttributes.builder()

    /**
     * @param customerGatewayAsn The ASN of the customer gateway. 
     */
    override fun customerGatewayAsn(customerGatewayAsn: Number) {
      cdkBuilder.customerGatewayAsn(customerGatewayAsn)
    }

    /**
     * @param customerGatewayId The id of the customer gateway. 
     */
    override fun customerGatewayId(customerGatewayId: String) {
      cdkBuilder.customerGatewayId(customerGatewayId)
    }

    /**
     * @param customerGatewayIp The ip address of the customer gateway. 
     */
    override fun customerGatewayIp(customerGatewayIp: String) {
      cdkBuilder.customerGatewayIp(customerGatewayIp)
    }

    /**
     * @param vpnId The id of the VPN connection. 
     */
    override fun vpnId(vpnId: String) {
      cdkBuilder.vpnId(vpnId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.VpnConnectionAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.VpnConnectionAttributes,
  ) : CdkObject(cdkObject), VpnConnectionAttributes {
    /**
     * The ASN of the customer gateway.
     */
    override fun customerGatewayAsn(): Number = unwrap(this).getCustomerGatewayAsn()

    /**
     * The id of the customer gateway.
     */
    override fun customerGatewayId(): String = unwrap(this).getCustomerGatewayId()

    /**
     * The ip address of the customer gateway.
     */
    override fun customerGatewayIp(): String = unwrap(this).getCustomerGatewayIp()

    /**
     * The id of the VPN connection.
     */
    override fun vpnId(): String = unwrap(this).getVpnId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): VpnConnectionAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.VpnConnectionAttributes):
        VpnConnectionAttributes = CdkObjectWrappers.wrap(cdkObject) as? VpnConnectionAttributes ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: VpnConnectionAttributes):
        software.amazon.awscdk.services.ec2.VpnConnectionAttributes = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.VpnConnectionAttributes
  }
}
