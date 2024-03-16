@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Attributes when importing an existing client VPN endpoint.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * SecurityGroup securityGroup;
 * ClientVpnEndpointAttributes clientVpnEndpointAttributes = ClientVpnEndpointAttributes.builder()
 * .endpointId("endpointId")
 * .securityGroups(List.of(securityGroup))
 * .build();
 * ```
 */
public interface ClientVpnEndpointAttributes {
  /**
   * The endpoint ID.
   */
  public fun endpointId(): String

  /**
   * The security groups associated with the endpoint.
   */
  public fun securityGroups(): List<ISecurityGroup>

  /**
   * A builder for [ClientVpnEndpointAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param endpointId The endpoint ID. 
     */
    public fun endpointId(endpointId: String)

    /**
     * @param securityGroups The security groups associated with the endpoint. 
     */
    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    /**
     * @param securityGroups The security groups associated with the endpoint. 
     */
    public fun securityGroups(vararg securityGroups: ISecurityGroup)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.ClientVpnEndpointAttributes.Builder
        = software.amazon.awscdk.services.ec2.ClientVpnEndpointAttributes.builder()

    /**
     * @param endpointId The endpoint ID. 
     */
    override fun endpointId(endpointId: String) {
      cdkBuilder.endpointId(endpointId)
    }

    /**
     * @param securityGroups The security groups associated with the endpoint. 
     */
    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    /**
     * @param securityGroups The security groups associated with the endpoint. 
     */
    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

    public fun build(): software.amazon.awscdk.services.ec2.ClientVpnEndpointAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.ClientVpnEndpointAttributes,
  ) : CdkObject(cdkObject), ClientVpnEndpointAttributes {
    /**
     * The endpoint ID.
     */
    override fun endpointId(): String = unwrap(this).getEndpointId()

    /**
     * The security groups associated with the endpoint.
     */
    override fun securityGroups(): List<ISecurityGroup> =
        unwrap(this).getSecurityGroups().map(ISecurityGroup::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ClientVpnEndpointAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.ClientVpnEndpointAttributes):
        ClientVpnEndpointAttributes = CdkObjectWrappers.wrap(cdkObject) as
        ClientVpnEndpointAttributes

    internal fun unwrap(wrapped: ClientVpnEndpointAttributes):
        software.amazon.awscdk.services.ec2.ClientVpnEndpointAttributes = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.ClientVpnEndpointAttributes
  }
}
