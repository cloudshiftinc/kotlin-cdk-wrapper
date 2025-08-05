@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnVPCEndpointService`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnVPCEndpointServiceProps cfnVPCEndpointServiceProps = CfnVPCEndpointServiceProps.builder()
 * .acceptanceRequired(false)
 * .contributorInsightsEnabled(false)
 * .gatewayLoadBalancerArns(List.of("gatewayLoadBalancerArns"))
 * .networkLoadBalancerArns(List.of("networkLoadBalancerArns"))
 * .payerResponsibility("payerResponsibility")
 * .supportedIpAddressTypes(List.of("supportedIpAddressTypes"))
 * .supportedRegions(List.of("supportedRegions"))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservice.html)
 */
public interface CfnVPCEndpointServiceProps {
  /**
   * Indicates whether requests from service consumers to create an endpoint to your service must be
   * accepted.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservice.html#cfn-ec2-vpcendpointservice-acceptancerequired)
   */
  public fun acceptanceRequired(): Any? = unwrap(this).getAcceptanceRequired()

  /**
   * Indicates whether to enable the built-in Contributor Insights rules provided by AWS PrivateLink
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservice.html#cfn-ec2-vpcendpointservice-contributorinsightsenabled)
   */
  public fun contributorInsightsEnabled(): Any? = unwrap(this).getContributorInsightsEnabled()

  /**
   * The Amazon Resource Names (ARNs) of the Gateway Load Balancers.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservice.html#cfn-ec2-vpcendpointservice-gatewayloadbalancerarns)
   */
  public fun gatewayLoadBalancerArns(): List<String> = unwrap(this).getGatewayLoadBalancerArns() ?:
      emptyList()

  /**
   * The Amazon Resource Names (ARNs) of the Network Load Balancers.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservice.html#cfn-ec2-vpcendpointservice-networkloadbalancerarns)
   */
  public fun networkLoadBalancerArns(): List<String> = unwrap(this).getNetworkLoadBalancerArns() ?:
      emptyList()

  /**
   * The entity that is responsible for the endpoint costs.
   *
   * The default is the endpoint owner. If you set the payer responsibility to the service owner,
   * you cannot set it back to the endpoint owner.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservice.html#cfn-ec2-vpcendpointservice-payerresponsibility)
   */
  public fun payerResponsibility(): String? = unwrap(this).getPayerResponsibility()

  /**
   * The supported IP address types.
   *
   * The possible values are `ipv4` and `ipv6` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservice.html#cfn-ec2-vpcendpointservice-supportedipaddresstypes)
   */
  public fun supportedIpAddressTypes(): List<String> = unwrap(this).getSupportedIpAddressTypes() ?:
      emptyList()

  /**
   * The Regions from which service consumers can access the service.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservice.html#cfn-ec2-vpcendpointservice-supportedregions)
   */
  public fun supportedRegions(): List<String> = unwrap(this).getSupportedRegions() ?: emptyList()

  /**
   * The tags to associate with the service.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservice.html#cfn-ec2-vpcendpointservice-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnVPCEndpointServiceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param acceptanceRequired Indicates whether requests from service consumers to create an
     * endpoint to your service must be accepted.
     */
    public fun acceptanceRequired(acceptanceRequired: Boolean)

    /**
     * @param acceptanceRequired Indicates whether requests from service consumers to create an
     * endpoint to your service must be accepted.
     */
    public fun acceptanceRequired(acceptanceRequired: IResolvable)

    /**
     * @param contributorInsightsEnabled Indicates whether to enable the built-in Contributor
     * Insights rules provided by AWS PrivateLink .
     */
    public fun contributorInsightsEnabled(contributorInsightsEnabled: Boolean)

    /**
     * @param contributorInsightsEnabled Indicates whether to enable the built-in Contributor
     * Insights rules provided by AWS PrivateLink .
     */
    public fun contributorInsightsEnabled(contributorInsightsEnabled: IResolvable)

    /**
     * @param gatewayLoadBalancerArns The Amazon Resource Names (ARNs) of the Gateway Load
     * Balancers.
     */
    public fun gatewayLoadBalancerArns(gatewayLoadBalancerArns: List<String>)

    /**
     * @param gatewayLoadBalancerArns The Amazon Resource Names (ARNs) of the Gateway Load
     * Balancers.
     */
    public fun gatewayLoadBalancerArns(vararg gatewayLoadBalancerArns: String)

    /**
     * @param networkLoadBalancerArns The Amazon Resource Names (ARNs) of the Network Load
     * Balancers.
     */
    public fun networkLoadBalancerArns(networkLoadBalancerArns: List<String>)

    /**
     * @param networkLoadBalancerArns The Amazon Resource Names (ARNs) of the Network Load
     * Balancers.
     */
    public fun networkLoadBalancerArns(vararg networkLoadBalancerArns: String)

    /**
     * @param payerResponsibility The entity that is responsible for the endpoint costs.
     * The default is the endpoint owner. If you set the payer responsibility to the service owner,
     * you cannot set it back to the endpoint owner.
     */
    public fun payerResponsibility(payerResponsibility: String)

    /**
     * @param supportedIpAddressTypes The supported IP address types.
     * The possible values are `ipv4` and `ipv6` .
     */
    public fun supportedIpAddressTypes(supportedIpAddressTypes: List<String>)

    /**
     * @param supportedIpAddressTypes The supported IP address types.
     * The possible values are `ipv4` and `ipv6` .
     */
    public fun supportedIpAddressTypes(vararg supportedIpAddressTypes: String)

    /**
     * @param supportedRegions The Regions from which service consumers can access the service.
     */
    public fun supportedRegions(supportedRegions: List<String>)

    /**
     * @param supportedRegions The Regions from which service consumers can access the service.
     */
    public fun supportedRegions(vararg supportedRegions: String)

    /**
     * @param tags The tags to associate with the service.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags to associate with the service.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnVPCEndpointServiceProps.Builder =
        software.amazon.awscdk.services.ec2.CfnVPCEndpointServiceProps.builder()

    /**
     * @param acceptanceRequired Indicates whether requests from service consumers to create an
     * endpoint to your service must be accepted.
     */
    override fun acceptanceRequired(acceptanceRequired: Boolean) {
      cdkBuilder.acceptanceRequired(acceptanceRequired)
    }

    /**
     * @param acceptanceRequired Indicates whether requests from service consumers to create an
     * endpoint to your service must be accepted.
     */
    override fun acceptanceRequired(acceptanceRequired: IResolvable) {
      cdkBuilder.acceptanceRequired(acceptanceRequired.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param contributorInsightsEnabled Indicates whether to enable the built-in Contributor
     * Insights rules provided by AWS PrivateLink .
     */
    override fun contributorInsightsEnabled(contributorInsightsEnabled: Boolean) {
      cdkBuilder.contributorInsightsEnabled(contributorInsightsEnabled)
    }

    /**
     * @param contributorInsightsEnabled Indicates whether to enable the built-in Contributor
     * Insights rules provided by AWS PrivateLink .
     */
    override fun contributorInsightsEnabled(contributorInsightsEnabled: IResolvable) {
      cdkBuilder.contributorInsightsEnabled(contributorInsightsEnabled.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param gatewayLoadBalancerArns The Amazon Resource Names (ARNs) of the Gateway Load
     * Balancers.
     */
    override fun gatewayLoadBalancerArns(gatewayLoadBalancerArns: List<String>) {
      cdkBuilder.gatewayLoadBalancerArns(gatewayLoadBalancerArns)
    }

    /**
     * @param gatewayLoadBalancerArns The Amazon Resource Names (ARNs) of the Gateway Load
     * Balancers.
     */
    override fun gatewayLoadBalancerArns(vararg gatewayLoadBalancerArns: String): Unit =
        gatewayLoadBalancerArns(gatewayLoadBalancerArns.toList())

    /**
     * @param networkLoadBalancerArns The Amazon Resource Names (ARNs) of the Network Load
     * Balancers.
     */
    override fun networkLoadBalancerArns(networkLoadBalancerArns: List<String>) {
      cdkBuilder.networkLoadBalancerArns(networkLoadBalancerArns)
    }

    /**
     * @param networkLoadBalancerArns The Amazon Resource Names (ARNs) of the Network Load
     * Balancers.
     */
    override fun networkLoadBalancerArns(vararg networkLoadBalancerArns: String): Unit =
        networkLoadBalancerArns(networkLoadBalancerArns.toList())

    /**
     * @param payerResponsibility The entity that is responsible for the endpoint costs.
     * The default is the endpoint owner. If you set the payer responsibility to the service owner,
     * you cannot set it back to the endpoint owner.
     */
    override fun payerResponsibility(payerResponsibility: String) {
      cdkBuilder.payerResponsibility(payerResponsibility)
    }

    /**
     * @param supportedIpAddressTypes The supported IP address types.
     * The possible values are `ipv4` and `ipv6` .
     */
    override fun supportedIpAddressTypes(supportedIpAddressTypes: List<String>) {
      cdkBuilder.supportedIpAddressTypes(supportedIpAddressTypes)
    }

    /**
     * @param supportedIpAddressTypes The supported IP address types.
     * The possible values are `ipv4` and `ipv6` .
     */
    override fun supportedIpAddressTypes(vararg supportedIpAddressTypes: String): Unit =
        supportedIpAddressTypes(supportedIpAddressTypes.toList())

    /**
     * @param supportedRegions The Regions from which service consumers can access the service.
     */
    override fun supportedRegions(supportedRegions: List<String>) {
      cdkBuilder.supportedRegions(supportedRegions)
    }

    /**
     * @param supportedRegions The Regions from which service consumers can access the service.
     */
    override fun supportedRegions(vararg supportedRegions: String): Unit =
        supportedRegions(supportedRegions.toList())

    /**
     * @param tags The tags to associate with the service.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The tags to associate with the service.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ec2.CfnVPCEndpointServiceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.CfnVPCEndpointServiceProps,
  ) : CdkObject(cdkObject),
      CfnVPCEndpointServiceProps {
    /**
     * Indicates whether requests from service consumers to create an endpoint to your service must
     * be accepted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservice.html#cfn-ec2-vpcendpointservice-acceptancerequired)
     */
    override fun acceptanceRequired(): Any? = unwrap(this).getAcceptanceRequired()

    /**
     * Indicates whether to enable the built-in Contributor Insights rules provided by AWS
     * PrivateLink .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservice.html#cfn-ec2-vpcendpointservice-contributorinsightsenabled)
     */
    override fun contributorInsightsEnabled(): Any? = unwrap(this).getContributorInsightsEnabled()

    /**
     * The Amazon Resource Names (ARNs) of the Gateway Load Balancers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservice.html#cfn-ec2-vpcendpointservice-gatewayloadbalancerarns)
     */
    override fun gatewayLoadBalancerArns(): List<String> = unwrap(this).getGatewayLoadBalancerArns()
        ?: emptyList()

    /**
     * The Amazon Resource Names (ARNs) of the Network Load Balancers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservice.html#cfn-ec2-vpcendpointservice-networkloadbalancerarns)
     */
    override fun networkLoadBalancerArns(): List<String> = unwrap(this).getNetworkLoadBalancerArns()
        ?: emptyList()

    /**
     * The entity that is responsible for the endpoint costs.
     *
     * The default is the endpoint owner. If you set the payer responsibility to the service owner,
     * you cannot set it back to the endpoint owner.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservice.html#cfn-ec2-vpcendpointservice-payerresponsibility)
     */
    override fun payerResponsibility(): String? = unwrap(this).getPayerResponsibility()

    /**
     * The supported IP address types.
     *
     * The possible values are `ipv4` and `ipv6` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservice.html#cfn-ec2-vpcendpointservice-supportedipaddresstypes)
     */
    override fun supportedIpAddressTypes(): List<String> = unwrap(this).getSupportedIpAddressTypes()
        ?: emptyList()

    /**
     * The Regions from which service consumers can access the service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservice.html#cfn-ec2-vpcendpointservice-supportedregions)
     */
    override fun supportedRegions(): List<String> = unwrap(this).getSupportedRegions() ?:
        emptyList()

    /**
     * The tags to associate with the service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservice.html#cfn-ec2-vpcendpointservice-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnVPCEndpointServiceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVPCEndpointServiceProps):
        CfnVPCEndpointServiceProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnVPCEndpointServiceProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnVPCEndpointServiceProps):
        software.amazon.awscdk.services.ec2.CfnVPCEndpointServiceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnVPCEndpointServiceProps
  }
}
