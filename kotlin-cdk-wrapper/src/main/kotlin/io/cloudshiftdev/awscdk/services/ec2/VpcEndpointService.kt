@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.ArnPrincipal
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A VPC endpoint service.
 *
 * Example:
 *
 * ```
 * NetworkLoadBalancer networkLoadBalancer1;
 * NetworkLoadBalancer networkLoadBalancer2;
 * VpcEndpointService.Builder.create(this, "EndpointService")
 * .vpcEndpointServiceLoadBalancers(List.of(networkLoadBalancer1, networkLoadBalancer2))
 * .acceptanceRequired(true)
 * .allowedPrincipals(List.of(new ArnPrincipal("arn:aws:iam::123456789012:root")))
 * .contributorInsights(true)
 * .build();
 * ```
 */
public open class VpcEndpointService(
  cdkObject: software.amazon.awscdk.services.ec2.VpcEndpointService,
) : Resource(cdkObject), IVpcEndpointService {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: VpcEndpointServiceProps,
  ) :
      this(software.amazon.awscdk.services.ec2.VpcEndpointService(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(VpcEndpointServiceProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: VpcEndpointServiceProps.Builder.() -> Unit,
  ) : this(scope, id, VpcEndpointServiceProps(props)
  )

  /**
   * Whether to require manual acceptance of new connections to the service.
   */
  public open fun acceptanceRequired(): Boolean = unwrap(this).getAcceptanceRequired()

  /**
   * One or more Principal ARNs to allow inbound connections to.
   */
  public open fun allowedPrincipals(): List<ArnPrincipal> =
      unwrap(this).getAllowedPrincipals().map(ArnPrincipal::wrap)

  /**
   * Whether to enable the built-in Contributor Insights rules provided by AWS PrivateLink.
   */
  public open fun contributorInsightsEnabled(): Boolean? =
      unwrap(this).getContributorInsightsEnabled()

  /**
   * The id of the VPC Endpoint Service, like vpce-svc-xxxxxxxxxxxxxxxx.
   */
  public override fun vpcEndpointServiceId(): String = unwrap(this).getVpcEndpointServiceId()

  /**
   * One or more network load balancers to host the service.
   */
  public open fun vpcEndpointServiceLoadBalancers(): List<IVpcEndpointServiceLoadBalancer> =
      unwrap(this).getVpcEndpointServiceLoadBalancers().map(IVpcEndpointServiceLoadBalancer::wrap)

  /**
   * The service name of the VPC Endpoint Service that clients use to connect to, like
   * com.amazonaws.vpce.<region>.vpce-svc-xxxxxxxxxxxxxxxx.
   */
  public override fun vpcEndpointServiceName(): String = unwrap(this).getVpcEndpointServiceName()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.VpcEndpointService].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Whether requests from service consumers to connect to the service through an endpoint must be
     * accepted.
     *
     * Default: true
     *
     * @param acceptanceRequired Whether requests from service consumers to connect to the service
     * through an endpoint must be accepted. 
     */
    public fun acceptanceRequired(acceptanceRequired: Boolean)

    /**
     * IAM users, IAM roles, or AWS accounts to allow inbound connections from.
     *
     * These principals can connect to your service using VPC endpoints. Takes a
     * list of one or more ArnPrincipal.
     *
     * Default: - no principals
     *
     * @param allowedPrincipals IAM users, IAM roles, or AWS accounts to allow inbound connections
     * from. 
     */
    public fun allowedPrincipals(allowedPrincipals: List<ArnPrincipal>)

    /**
     * IAM users, IAM roles, or AWS accounts to allow inbound connections from.
     *
     * These principals can connect to your service using VPC endpoints. Takes a
     * list of one or more ArnPrincipal.
     *
     * Default: - no principals
     *
     * @param allowedPrincipals IAM users, IAM roles, or AWS accounts to allow inbound connections
     * from. 
     */
    public fun allowedPrincipals(vararg allowedPrincipals: ArnPrincipal)

    /**
     * Indicates whether to enable the built-in Contributor Insights rules provided by AWS
     * PrivateLink.
     *
     * Default: false
     *
     * @param contributorInsights Indicates whether to enable the built-in Contributor Insights
     * rules provided by AWS PrivateLink. 
     */
    public fun contributorInsights(contributorInsights: Boolean)

    /**
     * One or more load balancers to host the VPC Endpoint Service.
     *
     * @param vpcEndpointServiceLoadBalancers One or more load balancers to host the VPC Endpoint
     * Service. 
     */
    public
        fun vpcEndpointServiceLoadBalancers(vpcEndpointServiceLoadBalancers: List<IVpcEndpointServiceLoadBalancer>)

    /**
     * One or more load balancers to host the VPC Endpoint Service.
     *
     * @param vpcEndpointServiceLoadBalancers One or more load balancers to host the VPC Endpoint
     * Service. 
     */
    public fun vpcEndpointServiceLoadBalancers(vararg
        vpcEndpointServiceLoadBalancers: IVpcEndpointServiceLoadBalancer)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.VpcEndpointService.Builder =
        software.amazon.awscdk.services.ec2.VpcEndpointService.Builder.create(scope, id)

    /**
     * Whether requests from service consumers to connect to the service through an endpoint must be
     * accepted.
     *
     * Default: true
     *
     * @param acceptanceRequired Whether requests from service consumers to connect to the service
     * through an endpoint must be accepted. 
     */
    override fun acceptanceRequired(acceptanceRequired: Boolean) {
      cdkBuilder.acceptanceRequired(acceptanceRequired)
    }

    /**
     * IAM users, IAM roles, or AWS accounts to allow inbound connections from.
     *
     * These principals can connect to your service using VPC endpoints. Takes a
     * list of one or more ArnPrincipal.
     *
     * Default: - no principals
     *
     * @param allowedPrincipals IAM users, IAM roles, or AWS accounts to allow inbound connections
     * from. 
     */
    override fun allowedPrincipals(allowedPrincipals: List<ArnPrincipal>) {
      cdkBuilder.allowedPrincipals(allowedPrincipals.map(ArnPrincipal::unwrap))
    }

    /**
     * IAM users, IAM roles, or AWS accounts to allow inbound connections from.
     *
     * These principals can connect to your service using VPC endpoints. Takes a
     * list of one or more ArnPrincipal.
     *
     * Default: - no principals
     *
     * @param allowedPrincipals IAM users, IAM roles, or AWS accounts to allow inbound connections
     * from. 
     */
    override fun allowedPrincipals(vararg allowedPrincipals: ArnPrincipal): Unit =
        allowedPrincipals(allowedPrincipals.toList())

    /**
     * Indicates whether to enable the built-in Contributor Insights rules provided by AWS
     * PrivateLink.
     *
     * Default: false
     *
     * @param contributorInsights Indicates whether to enable the built-in Contributor Insights
     * rules provided by AWS PrivateLink. 
     */
    override fun contributorInsights(contributorInsights: Boolean) {
      cdkBuilder.contributorInsights(contributorInsights)
    }

    /**
     * One or more load balancers to host the VPC Endpoint Service.
     *
     * @param vpcEndpointServiceLoadBalancers One or more load balancers to host the VPC Endpoint
     * Service. 
     */
    override
        fun vpcEndpointServiceLoadBalancers(vpcEndpointServiceLoadBalancers: List<IVpcEndpointServiceLoadBalancer>) {
      cdkBuilder.vpcEndpointServiceLoadBalancers(vpcEndpointServiceLoadBalancers.map(IVpcEndpointServiceLoadBalancer::unwrap))
    }

    /**
     * One or more load balancers to host the VPC Endpoint Service.
     *
     * @param vpcEndpointServiceLoadBalancers One or more load balancers to host the VPC Endpoint
     * Service. 
     */
    override fun vpcEndpointServiceLoadBalancers(vararg
        vpcEndpointServiceLoadBalancers: IVpcEndpointServiceLoadBalancer): Unit =
        vpcEndpointServiceLoadBalancers(vpcEndpointServiceLoadBalancers.toList())

    public fun build(): software.amazon.awscdk.services.ec2.VpcEndpointService = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): VpcEndpointService {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return VpcEndpointService(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.VpcEndpointService):
        VpcEndpointService = VpcEndpointService(cdkObject)

    internal fun unwrap(wrapped: VpcEndpointService):
        software.amazon.awscdk.services.ec2.VpcEndpointService = wrapped.cdkObject as
        software.amazon.awscdk.services.ec2.VpcEndpointService
  }
}
