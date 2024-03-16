@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for a NAT gateway.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * NatGatewayProps natGatewayProps = NatGatewayProps.builder()
 * .eipAllocationIds(List.of("eipAllocationIds"))
 * .build();
 * ```
 */
public interface NatGatewayProps {
  /**
   * EIP allocation IDs for the NAT gateways.
   *
   * Default: - No fixed EIPs allocated for the NAT gateways
   */
  public fun eipAllocationIds(): List<String> = unwrap(this).getEipAllocationIds() ?: emptyList()

  /**
   * A builder for [NatGatewayProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param eipAllocationIds EIP allocation IDs for the NAT gateways.
     */
    public fun eipAllocationIds(eipAllocationIds: List<String>)

    /**
     * @param eipAllocationIds EIP allocation IDs for the NAT gateways.
     */
    public fun eipAllocationIds(vararg eipAllocationIds: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.NatGatewayProps.Builder =
        software.amazon.awscdk.services.ec2.NatGatewayProps.builder()

    /**
     * @param eipAllocationIds EIP allocation IDs for the NAT gateways.
     */
    override fun eipAllocationIds(eipAllocationIds: List<String>) {
      cdkBuilder.eipAllocationIds(eipAllocationIds)
    }

    /**
     * @param eipAllocationIds EIP allocation IDs for the NAT gateways.
     */
    override fun eipAllocationIds(vararg eipAllocationIds: String): Unit =
        eipAllocationIds(eipAllocationIds.toList())

    public fun build(): software.amazon.awscdk.services.ec2.NatGatewayProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.NatGatewayProps,
  ) : CdkObject(cdkObject), NatGatewayProps {
    /**
     * EIP allocation IDs for the NAT gateways.
     *
     * Default: - No fixed EIPs allocated for the NAT gateways
     */
    override fun eipAllocationIds(): List<String> = unwrap(this).getEipAllocationIds() ?:
        emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): NatGatewayProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.NatGatewayProps):
        NatGatewayProps = CdkObjectWrappers.wrap(cdkObject) as NatGatewayProps

    internal fun unwrap(wrapped: NatGatewayProps):
        software.amazon.awscdk.services.ec2.NatGatewayProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.NatGatewayProps
  }
}
