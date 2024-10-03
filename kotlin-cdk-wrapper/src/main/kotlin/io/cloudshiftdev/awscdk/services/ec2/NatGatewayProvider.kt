@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Provider for NAT Gateways.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * NatGatewayProvider natGatewayProvider = NatGatewayProvider.Builder.create()
 * .eipAllocationIds(List.of("eipAllocationIds"))
 * .build();
 * ```
 */
public open class NatGatewayProvider(
  cdkObject: software.amazon.awscdk.services.ec2.NatGatewayProvider,
) : NatProvider(cdkObject) {
  public constructor() : this(software.amazon.awscdk.services.ec2.NatGatewayProvider()
  )

  public constructor(props: NatGatewayProps) :
      this(software.amazon.awscdk.services.ec2.NatGatewayProvider(props.let(NatGatewayProps.Companion::unwrap))
  )

  public constructor(props: NatGatewayProps.Builder.() -> Unit) : this(NatGatewayProps(props)
  )

  /**
   * Called by the VPC to configure NAT.
   *
   * Don't call this directly, the VPC will call it automatically.
   *
   * @param options 
   */
  public override fun configureNat(options: ConfigureNatOptions) {
    unwrap(this).configureNat(options.let(ConfigureNatOptions.Companion::unwrap))
  }

  /**
   * Called by the VPC to configure NAT.
   *
   * Don't call this directly, the VPC will call it automatically.
   *
   * @param options 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("dd4e1c7dc445ecccb0628de1d2dc0402a07b93c21145f259b74eb40763acacfd")
  public override fun configureNat(options: ConfigureNatOptions.Builder.() -> Unit): Unit =
      configureNat(ConfigureNatOptions(options))

  /**
   * Configures subnet with the gateway.
   *
   * Don't call this directly, the VPC will call it automatically.
   *
   * @param subnet 
   */
  public override fun configureSubnet(subnet: PrivateSubnet) {
    unwrap(this).configureSubnet(subnet.let(PrivateSubnet.Companion::unwrap))
  }

  /**
   * Return list of gateways spawned by the provider.
   */
  public override fun configuredGateways(): List<GatewayConfig> =
      unwrap(this).getConfiguredGateways().map(GatewayConfig::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.NatGatewayProvider].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * EIP allocation IDs for the NAT gateways.
     *
     * Default: - No fixed EIPs allocated for the NAT gateways
     *
     * @param eipAllocationIds EIP allocation IDs for the NAT gateways. 
     */
    public fun eipAllocationIds(eipAllocationIds: List<String>)

    /**
     * EIP allocation IDs for the NAT gateways.
     *
     * Default: - No fixed EIPs allocated for the NAT gateways
     *
     * @param eipAllocationIds EIP allocation IDs for the NAT gateways. 
     */
    public fun eipAllocationIds(vararg eipAllocationIds: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.NatGatewayProvider.Builder =
        software.amazon.awscdk.services.ec2.NatGatewayProvider.Builder.create()

    /**
     * EIP allocation IDs for the NAT gateways.
     *
     * Default: - No fixed EIPs allocated for the NAT gateways
     *
     * @param eipAllocationIds EIP allocation IDs for the NAT gateways. 
     */
    override fun eipAllocationIds(eipAllocationIds: List<String>) {
      cdkBuilder.eipAllocationIds(eipAllocationIds)
    }

    /**
     * EIP allocation IDs for the NAT gateways.
     *
     * Default: - No fixed EIPs allocated for the NAT gateways
     *
     * @param eipAllocationIds EIP allocation IDs for the NAT gateways. 
     */
    override fun eipAllocationIds(vararg eipAllocationIds: String): Unit =
        eipAllocationIds(eipAllocationIds.toList())

    public fun build(): software.amazon.awscdk.services.ec2.NatGatewayProvider = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): NatGatewayProvider {
      val builderImpl = BuilderImpl()
      return NatGatewayProvider(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.NatGatewayProvider):
        NatGatewayProvider = NatGatewayProvider(cdkObject)

    internal fun unwrap(wrapped: NatGatewayProvider):
        software.amazon.awscdk.services.ec2.NatGatewayProvider = wrapped.cdkObject as
        software.amazon.awscdk.services.ec2.NatGatewayProvider
  }
}
