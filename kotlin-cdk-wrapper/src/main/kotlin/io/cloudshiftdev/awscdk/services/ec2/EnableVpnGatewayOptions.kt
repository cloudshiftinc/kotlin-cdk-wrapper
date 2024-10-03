@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Options for the Vpc.enableVpnGateway() method.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * Subnet subnet;
 * SubnetFilter subnetFilter;
 * EnableVpnGatewayOptions enableVpnGatewayOptions = EnableVpnGatewayOptions.builder()
 * .type("type")
 * // the properties below are optional
 * .amazonSideAsn(123)
 * .vpnRoutePropagation(List.of(SubnetSelection.builder()
 * .availabilityZones(List.of("availabilityZones"))
 * .onePerAz(false)
 * .subnetFilters(List.of(subnetFilter))
 * .subnetGroupName("subnetGroupName")
 * .subnets(List.of(subnet))
 * .subnetType(SubnetType.PRIVATE_ISOLATED)
 * .build()))
 * .build();
 * ```
 */
public interface EnableVpnGatewayOptions : VpnGatewayProps {
  /**
   * Provide an array of subnets where the route propagation should be added.
   *
   * Default: noPropagation
   */
  public fun vpnRoutePropagation(): List<SubnetSelection> =
      unwrap(this).getVpnRoutePropagation()?.map(SubnetSelection::wrap) ?: emptyList()

  /**
   * A builder for [EnableVpnGatewayOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param amazonSideAsn Explicitly specify an Asn or let aws pick an Asn for you.
     */
    public fun amazonSideAsn(amazonSideAsn: Number)

    /**
     * @param type Default type ipsec.1. 
     */
    public fun type(type: String)

    /**
     * @param vpnRoutePropagation Provide an array of subnets where the route propagation should be
     * added.
     */
    public fun vpnRoutePropagation(vpnRoutePropagation: List<SubnetSelection>)

    /**
     * @param vpnRoutePropagation Provide an array of subnets where the route propagation should be
     * added.
     */
    public fun vpnRoutePropagation(vararg vpnRoutePropagation: SubnetSelection)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.EnableVpnGatewayOptions.Builder =
        software.amazon.awscdk.services.ec2.EnableVpnGatewayOptions.builder()

    /**
     * @param amazonSideAsn Explicitly specify an Asn or let aws pick an Asn for you.
     */
    override fun amazonSideAsn(amazonSideAsn: Number) {
      cdkBuilder.amazonSideAsn(amazonSideAsn)
    }

    /**
     * @param type Default type ipsec.1. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    /**
     * @param vpnRoutePropagation Provide an array of subnets where the route propagation should be
     * added.
     */
    override fun vpnRoutePropagation(vpnRoutePropagation: List<SubnetSelection>) {
      cdkBuilder.vpnRoutePropagation(vpnRoutePropagation.map(SubnetSelection.Companion::unwrap))
    }

    /**
     * @param vpnRoutePropagation Provide an array of subnets where the route propagation should be
     * added.
     */
    override fun vpnRoutePropagation(vararg vpnRoutePropagation: SubnetSelection): Unit =
        vpnRoutePropagation(vpnRoutePropagation.toList())

    public fun build(): software.amazon.awscdk.services.ec2.EnableVpnGatewayOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.EnableVpnGatewayOptions,
  ) : CdkObject(cdkObject),
      EnableVpnGatewayOptions {
    /**
     * Explicitly specify an Asn or let aws pick an Asn for you.
     *
     * Default: 65000
     */
    override fun amazonSideAsn(): Number? = unwrap(this).getAmazonSideAsn()

    /**
     * Default type ipsec.1.
     */
    override fun type(): String = unwrap(this).getType()

    /**
     * Provide an array of subnets where the route propagation should be added.
     *
     * Default: noPropagation
     */
    override fun vpnRoutePropagation(): List<SubnetSelection> =
        unwrap(this).getVpnRoutePropagation()?.map(SubnetSelection::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EnableVpnGatewayOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.EnableVpnGatewayOptions):
        EnableVpnGatewayOptions = CdkObjectWrappers.wrap(cdkObject) as? EnableVpnGatewayOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: EnableVpnGatewayOptions):
        software.amazon.awscdk.services.ec2.EnableVpnGatewayOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.EnableVpnGatewayOptions
  }
}
