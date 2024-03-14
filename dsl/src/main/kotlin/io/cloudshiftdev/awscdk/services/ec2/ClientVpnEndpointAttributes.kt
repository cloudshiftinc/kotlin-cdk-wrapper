package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

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
        ClientVpnEndpointAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ClientVpnEndpointAttributes):
        software.amazon.awscdk.services.ec2.ClientVpnEndpointAttributes = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.ClientVpnEndpointAttributes
  }
}
