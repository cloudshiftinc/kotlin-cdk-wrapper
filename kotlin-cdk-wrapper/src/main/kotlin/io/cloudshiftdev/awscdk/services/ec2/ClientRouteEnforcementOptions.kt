@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Unit

/**
 * Options for Client Route Enforcement.
 *
 * Example:
 *
 * ```
 * ClientVpnEndpoint endpoint = vpc.addClientVpnEndpoint("Endpoint",
 * ClientVpnEndpointOptions.builder()
 * .cidr("10.100.0.0/16")
 * .serverCertificateArn("arn:aws:acm:us-east-1:123456789012:certificate/server-certificate-id")
 * .clientCertificateArn("arn:aws:acm:us-east-1:123456789012:certificate/client-certificate-id")
 * .clientRouteEnforcementOptions(ClientRouteEnforcementOptions.builder()
 * .enforced(true)
 * .build())
 * .build());
 * ```
 */
public interface ClientRouteEnforcementOptions {
  /**
   * Enable or disable Client Route Enforcement.
   *
   * The state can either be true (enabled) or false (disabled).
   */
  public fun enforced(): Boolean

  /**
   * A builder for [ClientRouteEnforcementOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param enforced Enable or disable Client Route Enforcement. 
     * The state can either be true (enabled) or false (disabled).
     */
    public fun enforced(enforced: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.ClientRouteEnforcementOptions.Builder =
        software.amazon.awscdk.services.ec2.ClientRouteEnforcementOptions.builder()

    /**
     * @param enforced Enable or disable Client Route Enforcement. 
     * The state can either be true (enabled) or false (disabled).
     */
    override fun enforced(enforced: Boolean) {
      cdkBuilder.enforced(enforced)
    }

    public fun build(): software.amazon.awscdk.services.ec2.ClientRouteEnforcementOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.ClientRouteEnforcementOptions,
  ) : CdkObject(cdkObject),
      ClientRouteEnforcementOptions {
    /**
     * Enable or disable Client Route Enforcement.
     *
     * The state can either be true (enabled) or false (disabled).
     */
    override fun enforced(): Boolean = unwrap(this).getEnforced()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ClientRouteEnforcementOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.ClientRouteEnforcementOptions):
        ClientRouteEnforcementOptions = CdkObjectWrappers.wrap(cdkObject) as?
        ClientRouteEnforcementOptions ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ClientRouteEnforcementOptions):
        software.amazon.awscdk.services.ec2.ClientRouteEnforcementOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.ClientRouteEnforcementOptions
  }
}
