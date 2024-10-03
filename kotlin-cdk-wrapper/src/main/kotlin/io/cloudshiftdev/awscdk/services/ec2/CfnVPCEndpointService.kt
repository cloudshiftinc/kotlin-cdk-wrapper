@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a VPC endpoint service configuration to which service consumers ( AWS accounts, users,
 * and IAM roles) can connect.
 *
 * To create an endpoint service configuration, you must first create one of the following for your
 * service:
 *
 * * A [Network Load
 * Balancer](https://docs.aws.amazon.com/elasticloadbalancing/latest/network/introduction.html) .
 * Service consumers connect to your service using an interface endpoint.
 * * A [Gateway Load
 * Balancer](https://docs.aws.amazon.com/elasticloadbalancing/latest/gateway/introduction.html) .
 * Service consumers connect to your service using a Gateway Load Balancer endpoint.
 *
 * For more information, see the [AWS PrivateLink User
 * Guide](https://docs.aws.amazon.com/vpc/latest/privatelink/) .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnVPCEndpointService cfnVPCEndpointService = CfnVPCEndpointService.Builder.create(this,
 * "MyCfnVPCEndpointService")
 * .acceptanceRequired(false)
 * .contributorInsightsEnabled(false)
 * .gatewayLoadBalancerArns(List.of("gatewayLoadBalancerArns"))
 * .networkLoadBalancerArns(List.of("networkLoadBalancerArns"))
 * .payerResponsibility("payerResponsibility")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservice.html)
 */
public open class CfnVPCEndpointService(
  cdkObject: software.amazon.awscdk.services.ec2.CfnVPCEndpointService,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.ec2.CfnVPCEndpointService(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnVPCEndpointServiceProps,
  ) :
      this(software.amazon.awscdk.services.ec2.CfnVPCEndpointService(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnVPCEndpointServiceProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnVPCEndpointServiceProps.Builder.() -> Unit,
  ) : this(scope, id, CfnVPCEndpointServiceProps(props)
  )

  /**
   * Indicates whether requests from service consumers to create an endpoint to your service must be
   * accepted.
   */
  public open fun acceptanceRequired(): Any? = unwrap(this).getAcceptanceRequired()

  /**
   * Indicates whether requests from service consumers to create an endpoint to your service must be
   * accepted.
   */
  public open fun acceptanceRequired(`value`: Boolean) {
    unwrap(this).setAcceptanceRequired(`value`)
  }

  /**
   * Indicates whether requests from service consumers to create an endpoint to your service must be
   * accepted.
   */
  public open fun acceptanceRequired(`value`: IResolvable) {
    unwrap(this).setAcceptanceRequired(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The ID of the endpoint service.
   */
  public open fun attrServiceId(): String = unwrap(this).getAttrServiceId()

  /**
   * Indicates whether to enable the built-in Contributor Insights rules provided by AWS PrivateLink
   * .
   */
  public open fun contributorInsightsEnabled(): Any? = unwrap(this).getContributorInsightsEnabled()

  /**
   * Indicates whether to enable the built-in Contributor Insights rules provided by AWS PrivateLink
   * .
   */
  public open fun contributorInsightsEnabled(`value`: Boolean) {
    unwrap(this).setContributorInsightsEnabled(`value`)
  }

  /**
   * Indicates whether to enable the built-in Contributor Insights rules provided by AWS PrivateLink
   * .
   */
  public open fun contributorInsightsEnabled(`value`: IResolvable) {
    unwrap(this).setContributorInsightsEnabled(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The Amazon Resource Names (ARNs) of the Gateway Load Balancers.
   */
  public open fun gatewayLoadBalancerArns(): List<String> =
      unwrap(this).getGatewayLoadBalancerArns() ?: emptyList()

  /**
   * The Amazon Resource Names (ARNs) of the Gateway Load Balancers.
   */
  public open fun gatewayLoadBalancerArns(`value`: List<String>) {
    unwrap(this).setGatewayLoadBalancerArns(`value`)
  }

  /**
   * The Amazon Resource Names (ARNs) of the Gateway Load Balancers.
   */
  public open fun gatewayLoadBalancerArns(vararg `value`: String): Unit =
      gatewayLoadBalancerArns(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The Amazon Resource Names (ARNs) of the Network Load Balancers.
   */
  public open fun networkLoadBalancerArns(): List<String> =
      unwrap(this).getNetworkLoadBalancerArns() ?: emptyList()

  /**
   * The Amazon Resource Names (ARNs) of the Network Load Balancers.
   */
  public open fun networkLoadBalancerArns(`value`: List<String>) {
    unwrap(this).setNetworkLoadBalancerArns(`value`)
  }

  /**
   * The Amazon Resource Names (ARNs) of the Network Load Balancers.
   */
  public open fun networkLoadBalancerArns(vararg `value`: String): Unit =
      networkLoadBalancerArns(`value`.toList())

  /**
   * The entity that is responsible for the endpoint costs.
   */
  public open fun payerResponsibility(): String? = unwrap(this).getPayerResponsibility()

  /**
   * The entity that is responsible for the endpoint costs.
   */
  public open fun payerResponsibility(`value`: String) {
    unwrap(this).setPayerResponsibility(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnVPCEndpointService].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Indicates whether requests from service consumers to create an endpoint to your service must
     * be accepted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservice.html#cfn-ec2-vpcendpointservice-acceptancerequired)
     * @param acceptanceRequired Indicates whether requests from service consumers to create an
     * endpoint to your service must be accepted. 
     */
    public fun acceptanceRequired(acceptanceRequired: Boolean)

    /**
     * Indicates whether requests from service consumers to create an endpoint to your service must
     * be accepted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservice.html#cfn-ec2-vpcendpointservice-acceptancerequired)
     * @param acceptanceRequired Indicates whether requests from service consumers to create an
     * endpoint to your service must be accepted. 
     */
    public fun acceptanceRequired(acceptanceRequired: IResolvable)

    /**
     * Indicates whether to enable the built-in Contributor Insights rules provided by AWS
     * PrivateLink .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservice.html#cfn-ec2-vpcendpointservice-contributorinsightsenabled)
     * @param contributorInsightsEnabled Indicates whether to enable the built-in Contributor
     * Insights rules provided by AWS PrivateLink . 
     */
    public fun contributorInsightsEnabled(contributorInsightsEnabled: Boolean)

    /**
     * Indicates whether to enable the built-in Contributor Insights rules provided by AWS
     * PrivateLink .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservice.html#cfn-ec2-vpcendpointservice-contributorinsightsenabled)
     * @param contributorInsightsEnabled Indicates whether to enable the built-in Contributor
     * Insights rules provided by AWS PrivateLink . 
     */
    public fun contributorInsightsEnabled(contributorInsightsEnabled: IResolvable)

    /**
     * The Amazon Resource Names (ARNs) of the Gateway Load Balancers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservice.html#cfn-ec2-vpcendpointservice-gatewayloadbalancerarns)
     * @param gatewayLoadBalancerArns The Amazon Resource Names (ARNs) of the Gateway Load
     * Balancers. 
     */
    public fun gatewayLoadBalancerArns(gatewayLoadBalancerArns: List<String>)

    /**
     * The Amazon Resource Names (ARNs) of the Gateway Load Balancers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservice.html#cfn-ec2-vpcendpointservice-gatewayloadbalancerarns)
     * @param gatewayLoadBalancerArns The Amazon Resource Names (ARNs) of the Gateway Load
     * Balancers. 
     */
    public fun gatewayLoadBalancerArns(vararg gatewayLoadBalancerArns: String)

    /**
     * The Amazon Resource Names (ARNs) of the Network Load Balancers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservice.html#cfn-ec2-vpcendpointservice-networkloadbalancerarns)
     * @param networkLoadBalancerArns The Amazon Resource Names (ARNs) of the Network Load
     * Balancers. 
     */
    public fun networkLoadBalancerArns(networkLoadBalancerArns: List<String>)

    /**
     * The Amazon Resource Names (ARNs) of the Network Load Balancers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservice.html#cfn-ec2-vpcendpointservice-networkloadbalancerarns)
     * @param networkLoadBalancerArns The Amazon Resource Names (ARNs) of the Network Load
     * Balancers. 
     */
    public fun networkLoadBalancerArns(vararg networkLoadBalancerArns: String)

    /**
     * The entity that is responsible for the endpoint costs.
     *
     * The default is the endpoint owner. If you set the payer responsibility to the service owner,
     * you cannot set it back to the endpoint owner.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservice.html#cfn-ec2-vpcendpointservice-payerresponsibility)
     * @param payerResponsibility The entity that is responsible for the endpoint costs. 
     */
    public fun payerResponsibility(payerResponsibility: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnVPCEndpointService.Builder =
        software.amazon.awscdk.services.ec2.CfnVPCEndpointService.Builder.create(scope, id)

    /**
     * Indicates whether requests from service consumers to create an endpoint to your service must
     * be accepted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservice.html#cfn-ec2-vpcendpointservice-acceptancerequired)
     * @param acceptanceRequired Indicates whether requests from service consumers to create an
     * endpoint to your service must be accepted. 
     */
    override fun acceptanceRequired(acceptanceRequired: Boolean) {
      cdkBuilder.acceptanceRequired(acceptanceRequired)
    }

    /**
     * Indicates whether requests from service consumers to create an endpoint to your service must
     * be accepted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservice.html#cfn-ec2-vpcendpointservice-acceptancerequired)
     * @param acceptanceRequired Indicates whether requests from service consumers to create an
     * endpoint to your service must be accepted. 
     */
    override fun acceptanceRequired(acceptanceRequired: IResolvable) {
      cdkBuilder.acceptanceRequired(acceptanceRequired.let(IResolvable.Companion::unwrap))
    }

    /**
     * Indicates whether to enable the built-in Contributor Insights rules provided by AWS
     * PrivateLink .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservice.html#cfn-ec2-vpcendpointservice-contributorinsightsenabled)
     * @param contributorInsightsEnabled Indicates whether to enable the built-in Contributor
     * Insights rules provided by AWS PrivateLink . 
     */
    override fun contributorInsightsEnabled(contributorInsightsEnabled: Boolean) {
      cdkBuilder.contributorInsightsEnabled(contributorInsightsEnabled)
    }

    /**
     * Indicates whether to enable the built-in Contributor Insights rules provided by AWS
     * PrivateLink .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservice.html#cfn-ec2-vpcendpointservice-contributorinsightsenabled)
     * @param contributorInsightsEnabled Indicates whether to enable the built-in Contributor
     * Insights rules provided by AWS PrivateLink . 
     */
    override fun contributorInsightsEnabled(contributorInsightsEnabled: IResolvable) {
      cdkBuilder.contributorInsightsEnabled(contributorInsightsEnabled.let(IResolvable.Companion::unwrap))
    }

    /**
     * The Amazon Resource Names (ARNs) of the Gateway Load Balancers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservice.html#cfn-ec2-vpcendpointservice-gatewayloadbalancerarns)
     * @param gatewayLoadBalancerArns The Amazon Resource Names (ARNs) of the Gateway Load
     * Balancers. 
     */
    override fun gatewayLoadBalancerArns(gatewayLoadBalancerArns: List<String>) {
      cdkBuilder.gatewayLoadBalancerArns(gatewayLoadBalancerArns)
    }

    /**
     * The Amazon Resource Names (ARNs) of the Gateway Load Balancers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservice.html#cfn-ec2-vpcendpointservice-gatewayloadbalancerarns)
     * @param gatewayLoadBalancerArns The Amazon Resource Names (ARNs) of the Gateway Load
     * Balancers. 
     */
    override fun gatewayLoadBalancerArns(vararg gatewayLoadBalancerArns: String): Unit =
        gatewayLoadBalancerArns(gatewayLoadBalancerArns.toList())

    /**
     * The Amazon Resource Names (ARNs) of the Network Load Balancers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservice.html#cfn-ec2-vpcendpointservice-networkloadbalancerarns)
     * @param networkLoadBalancerArns The Amazon Resource Names (ARNs) of the Network Load
     * Balancers. 
     */
    override fun networkLoadBalancerArns(networkLoadBalancerArns: List<String>) {
      cdkBuilder.networkLoadBalancerArns(networkLoadBalancerArns)
    }

    /**
     * The Amazon Resource Names (ARNs) of the Network Load Balancers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservice.html#cfn-ec2-vpcendpointservice-networkloadbalancerarns)
     * @param networkLoadBalancerArns The Amazon Resource Names (ARNs) of the Network Load
     * Balancers. 
     */
    override fun networkLoadBalancerArns(vararg networkLoadBalancerArns: String): Unit =
        networkLoadBalancerArns(networkLoadBalancerArns.toList())

    /**
     * The entity that is responsible for the endpoint costs.
     *
     * The default is the endpoint owner. If you set the payer responsibility to the service owner,
     * you cannot set it back to the endpoint owner.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservice.html#cfn-ec2-vpcendpointservice-payerresponsibility)
     * @param payerResponsibility The entity that is responsible for the endpoint costs. 
     */
    override fun payerResponsibility(payerResponsibility: String) {
      cdkBuilder.payerResponsibility(payerResponsibility)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnVPCEndpointService =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnVPCEndpointService.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnVPCEndpointService {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnVPCEndpointService(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVPCEndpointService):
        CfnVPCEndpointService = CfnVPCEndpointService(cdkObject)

    internal fun unwrap(wrapped: CfnVPCEndpointService):
        software.amazon.awscdk.services.ec2.CfnVPCEndpointService = wrapped.cdkObject as
        software.amazon.awscdk.services.ec2.CfnVPCEndpointService
  }
}
