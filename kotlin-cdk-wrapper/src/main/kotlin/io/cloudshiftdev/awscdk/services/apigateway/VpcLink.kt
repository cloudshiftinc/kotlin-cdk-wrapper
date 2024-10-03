@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancer as CloudshiftdevAwscdkServicesElasticloadbalancingv2INetworkLoadBalancer
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.amazon.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancer as AmazonAwscdkServicesElasticloadbalancingv2INetworkLoadBalancer
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Define a new VPC Link Specifies an API Gateway VPC link for a RestApi to access resources in an
 * Amazon Virtual Private Cloud (VPC).
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
public open class VpcLink(
  cdkObject: software.amazon.awscdk.services.apigateway.VpcLink,
) : Resource(cdkObject),
    IVpcLink {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.apigateway.VpcLink(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: VpcLinkProps,
  ) :
      this(software.amazon.awscdk.services.apigateway.VpcLink(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(VpcLinkProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: VpcLinkProps.Builder.() -> Unit,
  ) : this(scope, id, VpcLinkProps(props)
  )

  /**
   * @param targets 
   */
  public open fun addTargets(vararg
      targets: CloudshiftdevAwscdkServicesElasticloadbalancingv2INetworkLoadBalancer) {
    unwrap(this).addTargets(*targets.map{CdkObjectWrappers.unwrap(it) as
        AmazonAwscdkServicesElasticloadbalancingv2INetworkLoadBalancer}.toTypedArray())
  }

  /**
   * Physical ID of the VpcLink resource.
   */
  public override fun vpcLinkId(): String = unwrap(this).getVpcLinkId()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.apigateway.VpcLink].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The description of the VPC link.
     *
     * Default: no description
     *
     * @param description The description of the VPC link. 
     */
    public fun description(description: String)

    /**
     * The network load balancers of the VPC targeted by the VPC link.
     *
     * The network load balancers must be owned by the same AWS account of the API owner.
     *
     * Default: - no targets. Use `addTargets` to add targets
     *
     * @param targets The network load balancers of the VPC targeted by the VPC link. 
     */
    public
        fun targets(targets: List<CloudshiftdevAwscdkServicesElasticloadbalancingv2INetworkLoadBalancer>)

    /**
     * The network load balancers of the VPC targeted by the VPC link.
     *
     * The network load balancers must be owned by the same AWS account of the API owner.
     *
     * Default: - no targets. Use `addTargets` to add targets
     *
     * @param targets The network load balancers of the VPC targeted by the VPC link. 
     */
    public fun targets(vararg
        targets: CloudshiftdevAwscdkServicesElasticloadbalancingv2INetworkLoadBalancer)

    /**
     * The name used to label and identify the VPC link.
     *
     * Default: - automatically generated name
     *
     * @param vpcLinkName The name used to label and identify the VPC link. 
     */
    public fun vpcLinkName(vpcLinkName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.VpcLink.Builder =
        software.amazon.awscdk.services.apigateway.VpcLink.Builder.create(scope, id)

    /**
     * The description of the VPC link.
     *
     * Default: no description
     *
     * @param description The description of the VPC link. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The network load balancers of the VPC targeted by the VPC link.
     *
     * The network load balancers must be owned by the same AWS account of the API owner.
     *
     * Default: - no targets. Use `addTargets` to add targets
     *
     * @param targets The network load balancers of the VPC targeted by the VPC link. 
     */
    override
        fun targets(targets: List<CloudshiftdevAwscdkServicesElasticloadbalancingv2INetworkLoadBalancer>) {
      cdkBuilder.targets(targets.map(CloudshiftdevAwscdkServicesElasticloadbalancingv2INetworkLoadBalancer.Companion::unwrap))
    }

    /**
     * The network load balancers of the VPC targeted by the VPC link.
     *
     * The network load balancers must be owned by the same AWS account of the API owner.
     *
     * Default: - no targets. Use `addTargets` to add targets
     *
     * @param targets The network load balancers of the VPC targeted by the VPC link. 
     */
    override fun targets(vararg
        targets: CloudshiftdevAwscdkServicesElasticloadbalancingv2INetworkLoadBalancer): Unit =
        targets(targets.toList())

    /**
     * The name used to label and identify the VPC link.
     *
     * Default: - automatically generated name
     *
     * @param vpcLinkName The name used to label and identify the VPC link. 
     */
    override fun vpcLinkName(vpcLinkName: String) {
      cdkBuilder.vpcLinkName(vpcLinkName)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.VpcLink = cdkBuilder.build()
  }

  public companion object {
    public fun fromVpcLinkId(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      vpcLinkId: String,
    ): IVpcLink =
        software.amazon.awscdk.services.apigateway.VpcLink.fromVpcLinkId(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, vpcLinkId).let(IVpcLink::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): VpcLink {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return VpcLink(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.VpcLink): VpcLink =
        VpcLink(cdkObject)

    internal fun unwrap(wrapped: VpcLink): software.amazon.awscdk.services.apigateway.VpcLink =
        wrapped.cdkObject as software.amazon.awscdk.services.apigateway.VpcLink
  }
}
