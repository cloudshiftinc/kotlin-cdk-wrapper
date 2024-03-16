@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Construction properties for an InterfaceVpcEndpoint.
 *
 * Example:
 *
 * ```
 * Vpc vpc;
 * InterfaceVpcEndpoint.Builder.create(this, "VPC Endpoint")
 * .vpc(vpc)
 * .service(new
 * InterfaceVpcEndpointService("com.amazonaws.vpce.us-east-1.vpce-svc-uuddlrlrbastrtsvc", 443))
 * // Choose which availability zones to place the VPC endpoint in, based on
 * // available AZs
 * .subnets(SubnetSelection.builder()
 * .availabilityZones(List.of("us-east-1a", "us-east-1c"))
 * .build())
 * .build();
 * ```
 */
public interface InterfaceVpcEndpointProps : InterfaceVpcEndpointOptions {
  /**
   * The VPC network in which the interface endpoint will be used.
   */
  public fun vpc(): IVpc

  /**
   * A builder for [InterfaceVpcEndpointProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param lookupSupportedAzs Limit to only those availability zones where the endpoint service
     * can be created.
     * Setting this to 'true' requires a lookup to be performed at synthesis time. Account
     * and region must be set on the containing stack for this to work.
     */
    public fun lookupSupportedAzs(lookupSupportedAzs: Boolean)

    /**
     * @param open Whether to automatically allow VPC traffic to the endpoint.
     * If enabled, all traffic to the endpoint from within the VPC will be
     * automatically allowed. This is done based on the VPC's CIDR range.
     */
    public fun `open`(`open`: Boolean)

    /**
     * @param privateDnsEnabled Whether to associate a private hosted zone with the specified VPC.
     * This
     * allows you to make requests to the service using its default DNS hostname.
     */
    public fun privateDnsEnabled(privateDnsEnabled: Boolean)

    /**
     * @param securityGroups The security groups to associate with this interface VPC endpoint.
     */
    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    /**
     * @param securityGroups The security groups to associate with this interface VPC endpoint.
     */
    public fun securityGroups(vararg securityGroups: ISecurityGroup)

    /**
     * @param service The service to use for this interface VPC endpoint. 
     */
    public fun service(service: IInterfaceVpcEndpointService)

    /**
     * @param subnets The subnets in which to create an endpoint network interface.
     * At most one
     * per availability zone.
     */
    public fun subnets(subnets: SubnetSelection)

    /**
     * @param subnets The subnets in which to create an endpoint network interface.
     * At most one
     * per availability zone.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("43192c1fc7bb99217fd4042402557726fdd13e9ba719af6c44404f7d12caa7d4")
    public fun subnets(subnets: SubnetSelection.Builder.() -> Unit)

    /**
     * @param vpc The VPC network in which the interface endpoint will be used. 
     */
    public fun vpc(vpc: IVpc)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.InterfaceVpcEndpointProps.Builder =
        software.amazon.awscdk.services.ec2.InterfaceVpcEndpointProps.builder()

    /**
     * @param lookupSupportedAzs Limit to only those availability zones where the endpoint service
     * can be created.
     * Setting this to 'true' requires a lookup to be performed at synthesis time. Account
     * and region must be set on the containing stack for this to work.
     */
    override fun lookupSupportedAzs(lookupSupportedAzs: Boolean) {
      cdkBuilder.lookupSupportedAzs(lookupSupportedAzs)
    }

    /**
     * @param open Whether to automatically allow VPC traffic to the endpoint.
     * If enabled, all traffic to the endpoint from within the VPC will be
     * automatically allowed. This is done based on the VPC's CIDR range.
     */
    override fun `open`(`open`: Boolean) {
      cdkBuilder.`open`(`open`)
    }

    /**
     * @param privateDnsEnabled Whether to associate a private hosted zone with the specified VPC.
     * This
     * allows you to make requests to the service using its default DNS hostname.
     */
    override fun privateDnsEnabled(privateDnsEnabled: Boolean) {
      cdkBuilder.privateDnsEnabled(privateDnsEnabled)
    }

    /**
     * @param securityGroups The security groups to associate with this interface VPC endpoint.
     */
    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    /**
     * @param securityGroups The security groups to associate with this interface VPC endpoint.
     */
    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

    /**
     * @param service The service to use for this interface VPC endpoint. 
     */
    override fun service(service: IInterfaceVpcEndpointService) {
      cdkBuilder.service(service.let(IInterfaceVpcEndpointService::unwrap))
    }

    /**
     * @param subnets The subnets in which to create an endpoint network interface.
     * At most one
     * per availability zone.
     */
    override fun subnets(subnets: SubnetSelection) {
      cdkBuilder.subnets(subnets.let(SubnetSelection::unwrap))
    }

    /**
     * @param subnets The subnets in which to create an endpoint network interface.
     * At most one
     * per availability zone.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("43192c1fc7bb99217fd4042402557726fdd13e9ba719af6c44404f7d12caa7d4")
    override fun subnets(subnets: SubnetSelection.Builder.() -> Unit): Unit =
        subnets(SubnetSelection(subnets))

    /**
     * @param vpc The VPC network in which the interface endpoint will be used. 
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.InterfaceVpcEndpointProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.InterfaceVpcEndpointProps,
  ) : CdkObject(cdkObject), InterfaceVpcEndpointProps {
    /**
     * Limit to only those availability zones where the endpoint service can be created.
     *
     * Setting this to 'true' requires a lookup to be performed at synthesis time. Account
     * and region must be set on the containing stack for this to work.
     *
     * Default: false
     */
    override fun lookupSupportedAzs(): Boolean? = unwrap(this).getLookupSupportedAzs()

    /**
     * Whether to automatically allow VPC traffic to the endpoint.
     *
     * If enabled, all traffic to the endpoint from within the VPC will be
     * automatically allowed. This is done based on the VPC's CIDR range.
     *
     * Default: true
     */
    override fun `open`(): Boolean? = unwrap(this).getOpen()

    /**
     * Whether to associate a private hosted zone with the specified VPC.
     *
     * This
     * allows you to make requests to the service using its default DNS hostname.
     *
     * Default: set by the instance of IInterfaceVpcEndpointService, or true if
     * not defined by the instance of IInterfaceVpcEndpointService
     */
    override fun privateDnsEnabled(): Boolean? = unwrap(this).getPrivateDnsEnabled()

    /**
     * The security groups to associate with this interface VPC endpoint.
     *
     * Default: - a new security group is created
     */
    override fun securityGroups(): List<ISecurityGroup> =
        unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

    /**
     * The service to use for this interface VPC endpoint.
     */
    override fun service(): IInterfaceVpcEndpointService =
        unwrap(this).getService().let(IInterfaceVpcEndpointService::wrap)

    /**
     * The subnets in which to create an endpoint network interface.
     *
     * At most one
     * per availability zone.
     *
     * Default: - private subnets
     */
    override fun subnets(): SubnetSelection? = unwrap(this).getSubnets()?.let(SubnetSelection::wrap)

    /**
     * The VPC network in which the interface endpoint will be used.
     */
    override fun vpc(): IVpc = unwrap(this).getVpc().let(IVpc::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): InterfaceVpcEndpointProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.InterfaceVpcEndpointProps):
        InterfaceVpcEndpointProps = CdkObjectWrappers.wrap(cdkObject) as InterfaceVpcEndpointProps

    internal fun unwrap(wrapped: InterfaceVpcEndpointProps):
        software.amazon.awscdk.services.ec2.InterfaceVpcEndpointProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.InterfaceVpcEndpointProps
  }
}
