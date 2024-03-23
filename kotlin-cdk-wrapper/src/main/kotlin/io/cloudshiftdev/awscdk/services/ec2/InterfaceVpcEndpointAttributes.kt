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
 * Construction properties for an ImportedInterfaceVpcEndpoint.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * SecurityGroup securityGroup;
 * InterfaceVpcEndpointAttributes interfaceVpcEndpointAttributes =
 * InterfaceVpcEndpointAttributes.builder()
 * .port(123)
 * .vpcEndpointId("vpcEndpointId")
 * // the properties below are optional
 * .securityGroups(List.of(securityGroup))
 * .build();
 * ```
 */
public interface InterfaceVpcEndpointAttributes {
  /**
   * The port of the service of the interface VPC endpoint.
   */
  public fun port(): Number

  /**
   * The security groups associated with the interface VPC endpoint.
   *
   * If you wish to manage the network connections associated with this endpoint,
   * you will need to specify its security groups.
   */
  public fun securityGroups(): List<ISecurityGroup> =
      unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

  /**
   * The interface VPC endpoint identifier.
   */
  public fun vpcEndpointId(): String

  /**
   * A builder for [InterfaceVpcEndpointAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param port The port of the service of the interface VPC endpoint. 
     */
    public fun port(port: Number)

    /**
     * @param securityGroups The security groups associated with the interface VPC endpoint.
     * If you wish to manage the network connections associated with this endpoint,
     * you will need to specify its security groups.
     */
    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    /**
     * @param securityGroups The security groups associated with the interface VPC endpoint.
     * If you wish to manage the network connections associated with this endpoint,
     * you will need to specify its security groups.
     */
    public fun securityGroups(vararg securityGroups: ISecurityGroup)

    /**
     * @param vpcEndpointId The interface VPC endpoint identifier. 
     */
    public fun vpcEndpointId(vpcEndpointId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAttributes.Builder =
        software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAttributes.builder()

    /**
     * @param port The port of the service of the interface VPC endpoint. 
     */
    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    /**
     * @param securityGroups The security groups associated with the interface VPC endpoint.
     * If you wish to manage the network connections associated with this endpoint,
     * you will need to specify its security groups.
     */
    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    /**
     * @param securityGroups The security groups associated with the interface VPC endpoint.
     * If you wish to manage the network connections associated with this endpoint,
     * you will need to specify its security groups.
     */
    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

    /**
     * @param vpcEndpointId The interface VPC endpoint identifier. 
     */
    override fun vpcEndpointId(vpcEndpointId: String) {
      cdkBuilder.vpcEndpointId(vpcEndpointId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAttributes,
  ) : CdkObject(cdkObject), InterfaceVpcEndpointAttributes {
    /**
     * The port of the service of the interface VPC endpoint.
     */
    override fun port(): Number = unwrap(this).getPort()

    /**
     * The security groups associated with the interface VPC endpoint.
     *
     * If you wish to manage the network connections associated with this endpoint,
     * you will need to specify its security groups.
     */
    override fun securityGroups(): List<ISecurityGroup> =
        unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

    /**
     * The interface VPC endpoint identifier.
     */
    override fun vpcEndpointId(): String = unwrap(this).getVpcEndpointId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): InterfaceVpcEndpointAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAttributes):
        InterfaceVpcEndpointAttributes = CdkObjectWrappers.wrap(cdkObject) as?
        InterfaceVpcEndpointAttributes ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: InterfaceVpcEndpointAttributes):
        software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAttributes = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAttributes
  }
}
