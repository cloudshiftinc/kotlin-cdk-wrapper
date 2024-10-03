@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Pair represents a gateway created by NAT Provider.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * GatewayConfig gatewayConfig = GatewayConfig.builder()
 * .az("az")
 * .gatewayId("gatewayId")
 * .build();
 * ```
 */
public interface GatewayConfig {
  /**
   * Availability Zone.
   */
  public fun az(): String

  /**
   * Identity of gateway spawned by the provider.
   */
  public fun gatewayId(): String

  /**
   * A builder for [GatewayConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param az Availability Zone. 
     */
    public fun az(az: String)

    /**
     * @param gatewayId Identity of gateway spawned by the provider. 
     */
    public fun gatewayId(gatewayId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.GatewayConfig.Builder =
        software.amazon.awscdk.services.ec2.GatewayConfig.builder()

    /**
     * @param az Availability Zone. 
     */
    override fun az(az: String) {
      cdkBuilder.az(az)
    }

    /**
     * @param gatewayId Identity of gateway spawned by the provider. 
     */
    override fun gatewayId(gatewayId: String) {
      cdkBuilder.gatewayId(gatewayId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.GatewayConfig = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.GatewayConfig,
  ) : CdkObject(cdkObject),
      GatewayConfig {
    /**
     * Availability Zone.
     */
    override fun az(): String = unwrap(this).getAz()

    /**
     * Identity of gateway spawned by the provider.
     */
    override fun gatewayId(): String = unwrap(this).getGatewayId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): GatewayConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.GatewayConfig): GatewayConfig =
        CdkObjectWrappers.wrap(cdkObject) as? GatewayConfig ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: GatewayConfig): software.amazon.awscdk.services.ec2.GatewayConfig =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.GatewayConfig
  }
}
