@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.ArnPrincipal
import kotlin.Boolean
import kotlin.Unit
import kotlin.collections.List

/**
 * Construction properties for a VpcEndpointService.
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
public interface VpcEndpointServiceProps {
  /**
   * Whether requests from service consumers to connect to the service through an endpoint must be
   * accepted.
   *
   * Default: true
   */
  public fun acceptanceRequired(): Boolean? = unwrap(this).getAcceptanceRequired()

  /**
   * IAM users, IAM roles, or AWS accounts to allow inbound connections from.
   *
   * These principals can connect to your service using VPC endpoints. Takes a
   * list of one or more ArnPrincipal.
   *
   * Default: - no principals
   */
  public fun allowedPrincipals(): List<ArnPrincipal> =
      unwrap(this).getAllowedPrincipals()?.map(ArnPrincipal::wrap) ?: emptyList()

  /**
   * Indicates whether to enable the built-in Contributor Insights rules provided by AWS
   * PrivateLink.
   *
   * Default: false
   */
  public fun contributorInsights(): Boolean? = unwrap(this).getContributorInsights()

  /**
   * One or more load balancers to host the VPC Endpoint Service.
   */
  public fun vpcEndpointServiceLoadBalancers(): List<IVpcEndpointServiceLoadBalancer>

  /**
   * A builder for [VpcEndpointServiceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param acceptanceRequired Whether requests from service consumers to connect to the service
     * through an endpoint must be accepted.
     */
    public fun acceptanceRequired(acceptanceRequired: Boolean)

    /**
     * @param allowedPrincipals IAM users, IAM roles, or AWS accounts to allow inbound connections
     * from.
     * These principals can connect to your service using VPC endpoints. Takes a
     * list of one or more ArnPrincipal.
     */
    public fun allowedPrincipals(allowedPrincipals: List<ArnPrincipal>)

    /**
     * @param allowedPrincipals IAM users, IAM roles, or AWS accounts to allow inbound connections
     * from.
     * These principals can connect to your service using VPC endpoints. Takes a
     * list of one or more ArnPrincipal.
     */
    public fun allowedPrincipals(vararg allowedPrincipals: ArnPrincipal)

    /**
     * @param contributorInsights Indicates whether to enable the built-in Contributor Insights
     * rules provided by AWS PrivateLink.
     */
    public fun contributorInsights(contributorInsights: Boolean)

    /**
     * @param vpcEndpointServiceLoadBalancers One or more load balancers to host the VPC Endpoint
     * Service. 
     */
    public
        fun vpcEndpointServiceLoadBalancers(vpcEndpointServiceLoadBalancers: List<IVpcEndpointServiceLoadBalancer>)

    /**
     * @param vpcEndpointServiceLoadBalancers One or more load balancers to host the VPC Endpoint
     * Service. 
     */
    public fun vpcEndpointServiceLoadBalancers(vararg
        vpcEndpointServiceLoadBalancers: IVpcEndpointServiceLoadBalancer)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.VpcEndpointServiceProps.Builder =
        software.amazon.awscdk.services.ec2.VpcEndpointServiceProps.builder()

    /**
     * @param acceptanceRequired Whether requests from service consumers to connect to the service
     * through an endpoint must be accepted.
     */
    override fun acceptanceRequired(acceptanceRequired: Boolean) {
      cdkBuilder.acceptanceRequired(acceptanceRequired)
    }

    /**
     * @param allowedPrincipals IAM users, IAM roles, or AWS accounts to allow inbound connections
     * from.
     * These principals can connect to your service using VPC endpoints. Takes a
     * list of one or more ArnPrincipal.
     */
    override fun allowedPrincipals(allowedPrincipals: List<ArnPrincipal>) {
      cdkBuilder.allowedPrincipals(allowedPrincipals.map(ArnPrincipal.Companion::unwrap))
    }

    /**
     * @param allowedPrincipals IAM users, IAM roles, or AWS accounts to allow inbound connections
     * from.
     * These principals can connect to your service using VPC endpoints. Takes a
     * list of one or more ArnPrincipal.
     */
    override fun allowedPrincipals(vararg allowedPrincipals: ArnPrincipal): Unit =
        allowedPrincipals(allowedPrincipals.toList())

    /**
     * @param contributorInsights Indicates whether to enable the built-in Contributor Insights
     * rules provided by AWS PrivateLink.
     */
    override fun contributorInsights(contributorInsights: Boolean) {
      cdkBuilder.contributorInsights(contributorInsights)
    }

    /**
     * @param vpcEndpointServiceLoadBalancers One or more load balancers to host the VPC Endpoint
     * Service. 
     */
    override
        fun vpcEndpointServiceLoadBalancers(vpcEndpointServiceLoadBalancers: List<IVpcEndpointServiceLoadBalancer>) {
      cdkBuilder.vpcEndpointServiceLoadBalancers(vpcEndpointServiceLoadBalancers.map(IVpcEndpointServiceLoadBalancer.Companion::unwrap))
    }

    /**
     * @param vpcEndpointServiceLoadBalancers One or more load balancers to host the VPC Endpoint
     * Service. 
     */
    override fun vpcEndpointServiceLoadBalancers(vararg
        vpcEndpointServiceLoadBalancers: IVpcEndpointServiceLoadBalancer): Unit =
        vpcEndpointServiceLoadBalancers(vpcEndpointServiceLoadBalancers.toList())

    public fun build(): software.amazon.awscdk.services.ec2.VpcEndpointServiceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.VpcEndpointServiceProps,
  ) : CdkObject(cdkObject), VpcEndpointServiceProps {
    /**
     * Whether requests from service consumers to connect to the service through an endpoint must be
     * accepted.
     *
     * Default: true
     */
    override fun acceptanceRequired(): Boolean? = unwrap(this).getAcceptanceRequired()

    /**
     * IAM users, IAM roles, or AWS accounts to allow inbound connections from.
     *
     * These principals can connect to your service using VPC endpoints. Takes a
     * list of one or more ArnPrincipal.
     *
     * Default: - no principals
     */
    override fun allowedPrincipals(): List<ArnPrincipal> =
        unwrap(this).getAllowedPrincipals()?.map(ArnPrincipal::wrap) ?: emptyList()

    /**
     * Indicates whether to enable the built-in Contributor Insights rules provided by AWS
     * PrivateLink.
     *
     * Default: false
     */
    override fun contributorInsights(): Boolean? = unwrap(this).getContributorInsights()

    /**
     * One or more load balancers to host the VPC Endpoint Service.
     */
    override fun vpcEndpointServiceLoadBalancers(): List<IVpcEndpointServiceLoadBalancer> =
        unwrap(this).getVpcEndpointServiceLoadBalancers().map(IVpcEndpointServiceLoadBalancer::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): VpcEndpointServiceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.VpcEndpointServiceProps):
        VpcEndpointServiceProps = CdkObjectWrappers.wrap(cdkObject) as? VpcEndpointServiceProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: VpcEndpointServiceProps):
        software.amazon.awscdk.services.ec2.VpcEndpointServiceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.VpcEndpointServiceProps
  }
}
