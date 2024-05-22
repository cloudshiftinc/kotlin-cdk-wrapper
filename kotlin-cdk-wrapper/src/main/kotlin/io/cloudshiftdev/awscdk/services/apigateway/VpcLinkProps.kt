@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancer
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for a VpcLink.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.*;
 * Vpc vpc = new Vpc(this, "VPC");
 * NetworkLoadBalancer nlb = NetworkLoadBalancer.Builder.create(this, "NLB")
 * .vpc(vpc)
 * .build();
 * VpcLink link = VpcLink.Builder.create(this, "link")
 * .targets(List.of(nlb))
 * .build();
 * Integration integration = Integration.Builder.create()
 * .type(IntegrationType.HTTP_PROXY)
 * .integrationHttpMethod("ANY")
 * .options(IntegrationOptions.builder()
 * .connectionType(ConnectionType.VPC_LINK)
 * .vpcLink(link)
 * .build())
 * .build();
 * ```
 */
public interface VpcLinkProps {
  /**
   * The description of the VPC link.
   *
   * Default: no description
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The network load balancers of the VPC targeted by the VPC link.
   *
   * The network load balancers must be owned by the same AWS account of the API owner.
   *
   * Default: - no targets. Use `addTargets` to add targets
   */
  public fun targets(): List<INetworkLoadBalancer> =
      unwrap(this).getTargets()?.map(INetworkLoadBalancer::wrap) ?: emptyList()

  /**
   * The name used to label and identify the VPC link.
   *
   * Default: - automatically generated name
   */
  public fun vpcLinkName(): String? = unwrap(this).getVpcLinkName()

  /**
   * A builder for [VpcLinkProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description The description of the VPC link.
     */
    public fun description(description: String)

    /**
     * @param targets The network load balancers of the VPC targeted by the VPC link.
     * The network load balancers must be owned by the same AWS account of the API owner.
     */
    public fun targets(targets: List<INetworkLoadBalancer>)

    /**
     * @param targets The network load balancers of the VPC targeted by the VPC link.
     * The network load balancers must be owned by the same AWS account of the API owner.
     */
    public fun targets(vararg targets: INetworkLoadBalancer)

    /**
     * @param vpcLinkName The name used to label and identify the VPC link.
     */
    public fun vpcLinkName(vpcLinkName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.VpcLinkProps.Builder =
        software.amazon.awscdk.services.apigateway.VpcLinkProps.builder()

    /**
     * @param description The description of the VPC link.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param targets The network load balancers of the VPC targeted by the VPC link.
     * The network load balancers must be owned by the same AWS account of the API owner.
     */
    override fun targets(targets: List<INetworkLoadBalancer>) {
      cdkBuilder.targets(targets.map(INetworkLoadBalancer.Companion::unwrap))
    }

    /**
     * @param targets The network load balancers of the VPC targeted by the VPC link.
     * The network load balancers must be owned by the same AWS account of the API owner.
     */
    override fun targets(vararg targets: INetworkLoadBalancer): Unit = targets(targets.toList())

    /**
     * @param vpcLinkName The name used to label and identify the VPC link.
     */
    override fun vpcLinkName(vpcLinkName: String) {
      cdkBuilder.vpcLinkName(vpcLinkName)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.VpcLinkProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.apigateway.VpcLinkProps,
  ) : CdkObject(cdkObject), VpcLinkProps {
    /**
     * The description of the VPC link.
     *
     * Default: no description
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The network load balancers of the VPC targeted by the VPC link.
     *
     * The network load balancers must be owned by the same AWS account of the API owner.
     *
     * Default: - no targets. Use `addTargets` to add targets
     */
    override fun targets(): List<INetworkLoadBalancer> =
        unwrap(this).getTargets()?.map(INetworkLoadBalancer::wrap) ?: emptyList()

    /**
     * The name used to label and identify the VPC link.
     *
     * Default: - automatically generated name
     */
    override fun vpcLinkName(): String? = unwrap(this).getVpcLinkName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): VpcLinkProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.VpcLinkProps):
        VpcLinkProps = CdkObjectWrappers.wrap(cdkObject) as? VpcLinkProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: VpcLinkProps):
        software.amazon.awscdk.services.apigateway.VpcLinkProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.apigateway.VpcLinkProps
  }
}
