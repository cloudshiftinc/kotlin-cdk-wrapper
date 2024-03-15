@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53resolver

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnResolverEndpoint`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.route53resolver.*;
 * CfnResolverEndpointProps cfnResolverEndpointProps = CfnResolverEndpointProps.builder()
 * .direction("direction")
 * .ipAddresses(List.of(IpAddressRequestProperty.builder()
 * .subnetId("subnetId")
 * // the properties below are optional
 * .ip("ip")
 * .ipv6("ipv6")
 * .build()))
 * .securityGroupIds(List.of("securityGroupIds"))
 * // the properties below are optional
 * .name("name")
 * .outpostArn("outpostArn")
 * .preferredInstanceType("preferredInstanceType")
 * .protocols(List.of("protocols"))
 * .resolverEndpointType("resolverEndpointType")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverendpoint.html)
 */
public interface CfnResolverEndpointProps {
  /**
   * Indicates whether the Resolver endpoint allows inbound or outbound DNS queries:.
   *
   * * `INBOUND` : allows DNS queries to your VPC from your network
   * * `OUTBOUND` : allows DNS queries from your VPC to your network
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverendpoint.html#cfn-route53resolver-resolverendpoint-direction)
   */
  public fun direction(): String

  /**
   * The subnets and IP addresses in your VPC that DNS queries originate from (for outbound
   * endpoints) or that you forward DNS queries to (for inbound endpoints).
   *
   * The subnet ID uniquely identifies a VPC.
   *
   *
   * Even though the minimum is 1, Route 53 requires that you create at least two.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverendpoint.html#cfn-route53resolver-resolverendpoint-ipaddresses)
   */
  public fun ipAddresses(): Any

  /**
   * A friendly name that lets you easily find a configuration in the Resolver dashboard in the
   * Route 53 console.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverendpoint.html#cfn-route53resolver-resolverendpoint-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * The ARN (Amazon Resource Name) for the Outpost.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverendpoint.html#cfn-route53resolver-resolverendpoint-outpostarn)
   */
  public fun outpostArn(): String? = unwrap(this).getOutpostArn()

  /**
   * The Amazon EC2 instance type.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverendpoint.html#cfn-route53resolver-resolverendpoint-preferredinstancetype)
   */
  public fun preferredInstanceType(): String? = unwrap(this).getPreferredInstanceType()

  /**
   * Protocols used for the endpoint. DoH-FIPS is applicable for inbound endpoints only.
   *
   * For an inbound endpoint you can apply the protocols as follows:
   *
   * * Do53 and DoH in combination.
   * * Do53 and DoH-FIPS in combination.
   * * Do53 alone.
   * * DoH alone.
   * * DoH-FIPS alone.
   * * None, which is treated as Do53.
   *
   * For an outbound endpoint you can apply the protocols as follows:
   *
   * * Do53 and DoH in combination.
   * * Do53 alone.
   * * DoH alone.
   * * None, which is treated as Do53.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverendpoint.html#cfn-route53resolver-resolverendpoint-protocols)
   */
  public fun protocols(): List<String> = unwrap(this).getProtocols() ?: emptyList()

  /**
   * The Resolver endpoint IP address type.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverendpoint.html#cfn-route53resolver-resolverendpoint-resolverendpointtype)
   */
  public fun resolverEndpointType(): String? = unwrap(this).getResolverEndpointType()

  /**
   * The ID of one or more security groups that control access to this VPC.
   *
   * The security group must include one or more inbound rules (for inbound endpoints) or outbound
   * rules (for outbound endpoints). Inbound and outbound rules must allow TCP and UDP access. For
   * inbound access, open port 53. For outbound access, open the port that you're using for DNS queries
   * on your network.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverendpoint.html#cfn-route53resolver-resolverendpoint-securitygroupids)
   */
  public fun securityGroupIds(): List<String>

  /**
   * Route 53 Resolver doesn't support updating tags through CloudFormation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverendpoint.html#cfn-route53resolver-resolverendpoint-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnResolverEndpointProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param direction Indicates whether the Resolver endpoint allows inbound or outbound DNS
     * queries:. 
     * * `INBOUND` : allows DNS queries to your VPC from your network
     * * `OUTBOUND` : allows DNS queries from your VPC to your network
     */
    public fun direction(direction: String)

    /**
     * @param ipAddresses The subnets and IP addresses in your VPC that DNS queries originate from
     * (for outbound endpoints) or that you forward DNS queries to (for inbound endpoints). 
     * The subnet ID uniquely identifies a VPC.
     *
     *
     * Even though the minimum is 1, Route 53 requires that you create at least two.
     */
    public fun ipAddresses(ipAddresses: IResolvable)

    /**
     * @param ipAddresses The subnets and IP addresses in your VPC that DNS queries originate from
     * (for outbound endpoints) or that you forward DNS queries to (for inbound endpoints). 
     * The subnet ID uniquely identifies a VPC.
     *
     *
     * Even though the minimum is 1, Route 53 requires that you create at least two.
     */
    public fun ipAddresses(ipAddresses: List<Any>)

    /**
     * @param ipAddresses The subnets and IP addresses in your VPC that DNS queries originate from
     * (for outbound endpoints) or that you forward DNS queries to (for inbound endpoints). 
     * The subnet ID uniquely identifies a VPC.
     *
     *
     * Even though the minimum is 1, Route 53 requires that you create at least two.
     */
    public fun ipAddresses(vararg ipAddresses: Any)

    /**
     * @param name A friendly name that lets you easily find a configuration in the Resolver
     * dashboard in the Route 53 console.
     */
    public fun name(name: String)

    /**
     * @param outpostArn The ARN (Amazon Resource Name) for the Outpost.
     */
    public fun outpostArn(outpostArn: String)

    /**
     * @param preferredInstanceType The Amazon EC2 instance type.
     */
    public fun preferredInstanceType(preferredInstanceType: String)

    /**
     * @param protocols Protocols used for the endpoint. DoH-FIPS is applicable for inbound
     * endpoints only.
     * For an inbound endpoint you can apply the protocols as follows:
     *
     * * Do53 and DoH in combination.
     * * Do53 and DoH-FIPS in combination.
     * * Do53 alone.
     * * DoH alone.
     * * DoH-FIPS alone.
     * * None, which is treated as Do53.
     *
     * For an outbound endpoint you can apply the protocols as follows:
     *
     * * Do53 and DoH in combination.
     * * Do53 alone.
     * * DoH alone.
     * * None, which is treated as Do53.
     */
    public fun protocols(protocols: List<String>)

    /**
     * @param protocols Protocols used for the endpoint. DoH-FIPS is applicable for inbound
     * endpoints only.
     * For an inbound endpoint you can apply the protocols as follows:
     *
     * * Do53 and DoH in combination.
     * * Do53 and DoH-FIPS in combination.
     * * Do53 alone.
     * * DoH alone.
     * * DoH-FIPS alone.
     * * None, which is treated as Do53.
     *
     * For an outbound endpoint you can apply the protocols as follows:
     *
     * * Do53 and DoH in combination.
     * * Do53 alone.
     * * DoH alone.
     * * None, which is treated as Do53.
     */
    public fun protocols(vararg protocols: String)

    /**
     * @param resolverEndpointType The Resolver endpoint IP address type.
     */
    public fun resolverEndpointType(resolverEndpointType: String)

    /**
     * @param securityGroupIds The ID of one or more security groups that control access to this
     * VPC. 
     * The security group must include one or more inbound rules (for inbound endpoints) or outbound
     * rules (for outbound endpoints). Inbound and outbound rules must allow TCP and UDP access. For
     * inbound access, open port 53. For outbound access, open the port that you're using for DNS
     * queries on your network.
     */
    public fun securityGroupIds(securityGroupIds: List<String>)

    /**
     * @param securityGroupIds The ID of one or more security groups that control access to this
     * VPC. 
     * The security group must include one or more inbound rules (for inbound endpoints) or outbound
     * rules (for outbound endpoints). Inbound and outbound rules must allow TCP and UDP access. For
     * inbound access, open port 53. For outbound access, open the port that you're using for DNS
     * queries on your network.
     */
    public fun securityGroupIds(vararg securityGroupIds: String)

    /**
     * @param tags Route 53 Resolver doesn't support updating tags through CloudFormation.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Route 53 Resolver doesn't support updating tags through CloudFormation.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.route53resolver.CfnResolverEndpointProps.Builder =
        software.amazon.awscdk.services.route53resolver.CfnResolverEndpointProps.builder()

    /**
     * @param direction Indicates whether the Resolver endpoint allows inbound or outbound DNS
     * queries:. 
     * * `INBOUND` : allows DNS queries to your VPC from your network
     * * `OUTBOUND` : allows DNS queries from your VPC to your network
     */
    override fun direction(direction: String) {
      cdkBuilder.direction(direction)
    }

    /**
     * @param ipAddresses The subnets and IP addresses in your VPC that DNS queries originate from
     * (for outbound endpoints) or that you forward DNS queries to (for inbound endpoints). 
     * The subnet ID uniquely identifies a VPC.
     *
     *
     * Even though the minimum is 1, Route 53 requires that you create at least two.
     */
    override fun ipAddresses(ipAddresses: IResolvable) {
      cdkBuilder.ipAddresses(ipAddresses.let(IResolvable::unwrap))
    }

    /**
     * @param ipAddresses The subnets and IP addresses in your VPC that DNS queries originate from
     * (for outbound endpoints) or that you forward DNS queries to (for inbound endpoints). 
     * The subnet ID uniquely identifies a VPC.
     *
     *
     * Even though the minimum is 1, Route 53 requires that you create at least two.
     */
    override fun ipAddresses(ipAddresses: List<Any>) {
      cdkBuilder.ipAddresses(ipAddresses)
    }

    /**
     * @param ipAddresses The subnets and IP addresses in your VPC that DNS queries originate from
     * (for outbound endpoints) or that you forward DNS queries to (for inbound endpoints). 
     * The subnet ID uniquely identifies a VPC.
     *
     *
     * Even though the minimum is 1, Route 53 requires that you create at least two.
     */
    override fun ipAddresses(vararg ipAddresses: Any): Unit = ipAddresses(ipAddresses.toList())

    /**
     * @param name A friendly name that lets you easily find a configuration in the Resolver
     * dashboard in the Route 53 console.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param outpostArn The ARN (Amazon Resource Name) for the Outpost.
     */
    override fun outpostArn(outpostArn: String) {
      cdkBuilder.outpostArn(outpostArn)
    }

    /**
     * @param preferredInstanceType The Amazon EC2 instance type.
     */
    override fun preferredInstanceType(preferredInstanceType: String) {
      cdkBuilder.preferredInstanceType(preferredInstanceType)
    }

    /**
     * @param protocols Protocols used for the endpoint. DoH-FIPS is applicable for inbound
     * endpoints only.
     * For an inbound endpoint you can apply the protocols as follows:
     *
     * * Do53 and DoH in combination.
     * * Do53 and DoH-FIPS in combination.
     * * Do53 alone.
     * * DoH alone.
     * * DoH-FIPS alone.
     * * None, which is treated as Do53.
     *
     * For an outbound endpoint you can apply the protocols as follows:
     *
     * * Do53 and DoH in combination.
     * * Do53 alone.
     * * DoH alone.
     * * None, which is treated as Do53.
     */
    override fun protocols(protocols: List<String>) {
      cdkBuilder.protocols(protocols)
    }

    /**
     * @param protocols Protocols used for the endpoint. DoH-FIPS is applicable for inbound
     * endpoints only.
     * For an inbound endpoint you can apply the protocols as follows:
     *
     * * Do53 and DoH in combination.
     * * Do53 and DoH-FIPS in combination.
     * * Do53 alone.
     * * DoH alone.
     * * DoH-FIPS alone.
     * * None, which is treated as Do53.
     *
     * For an outbound endpoint you can apply the protocols as follows:
     *
     * * Do53 and DoH in combination.
     * * Do53 alone.
     * * DoH alone.
     * * None, which is treated as Do53.
     */
    override fun protocols(vararg protocols: String): Unit = protocols(protocols.toList())

    /**
     * @param resolverEndpointType The Resolver endpoint IP address type.
     */
    override fun resolverEndpointType(resolverEndpointType: String) {
      cdkBuilder.resolverEndpointType(resolverEndpointType)
    }

    /**
     * @param securityGroupIds The ID of one or more security groups that control access to this
     * VPC. 
     * The security group must include one or more inbound rules (for inbound endpoints) or outbound
     * rules (for outbound endpoints). Inbound and outbound rules must allow TCP and UDP access. For
     * inbound access, open port 53. For outbound access, open the port that you're using for DNS
     * queries on your network.
     */
    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    /**
     * @param securityGroupIds The ID of one or more security groups that control access to this
     * VPC. 
     * The security group must include one or more inbound rules (for inbound endpoints) or outbound
     * rules (for outbound endpoints). Inbound and outbound rules must allow TCP and UDP access. For
     * inbound access, open port 53. For outbound access, open the port that you're using for DNS
     * queries on your network.
     */
    override fun securityGroupIds(vararg securityGroupIds: String): Unit =
        securityGroupIds(securityGroupIds.toList())

    /**
     * @param tags Route 53 Resolver doesn't support updating tags through CloudFormation.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Route 53 Resolver doesn't support updating tags through CloudFormation.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.route53resolver.CfnResolverEndpointProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.route53resolver.CfnResolverEndpointProps,
  ) : CdkObject(cdkObject), CfnResolverEndpointProps {
    /**
     * Indicates whether the Resolver endpoint allows inbound or outbound DNS queries:.
     *
     * * `INBOUND` : allows DNS queries to your VPC from your network
     * * `OUTBOUND` : allows DNS queries from your VPC to your network
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverendpoint.html#cfn-route53resolver-resolverendpoint-direction)
     */
    override fun direction(): String = unwrap(this).getDirection()

    /**
     * The subnets and IP addresses in your VPC that DNS queries originate from (for outbound
     * endpoints) or that you forward DNS queries to (for inbound endpoints).
     *
     * The subnet ID uniquely identifies a VPC.
     *
     *
     * Even though the minimum is 1, Route 53 requires that you create at least two.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverendpoint.html#cfn-route53resolver-resolverendpoint-ipaddresses)
     */
    override fun ipAddresses(): Any = unwrap(this).getIpAddresses()

    /**
     * A friendly name that lets you easily find a configuration in the Resolver dashboard in the
     * Route 53 console.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverendpoint.html#cfn-route53resolver-resolverendpoint-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * The ARN (Amazon Resource Name) for the Outpost.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverendpoint.html#cfn-route53resolver-resolverendpoint-outpostarn)
     */
    override fun outpostArn(): String? = unwrap(this).getOutpostArn()

    /**
     * The Amazon EC2 instance type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverendpoint.html#cfn-route53resolver-resolverendpoint-preferredinstancetype)
     */
    override fun preferredInstanceType(): String? = unwrap(this).getPreferredInstanceType()

    /**
     * Protocols used for the endpoint. DoH-FIPS is applicable for inbound endpoints only.
     *
     * For an inbound endpoint you can apply the protocols as follows:
     *
     * * Do53 and DoH in combination.
     * * Do53 and DoH-FIPS in combination.
     * * Do53 alone.
     * * DoH alone.
     * * DoH-FIPS alone.
     * * None, which is treated as Do53.
     *
     * For an outbound endpoint you can apply the protocols as follows:
     *
     * * Do53 and DoH in combination.
     * * Do53 alone.
     * * DoH alone.
     * * None, which is treated as Do53.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverendpoint.html#cfn-route53resolver-resolverendpoint-protocols)
     */
    override fun protocols(): List<String> = unwrap(this).getProtocols() ?: emptyList()

    /**
     * The Resolver endpoint IP address type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverendpoint.html#cfn-route53resolver-resolverendpoint-resolverendpointtype)
     */
    override fun resolverEndpointType(): String? = unwrap(this).getResolverEndpointType()

    /**
     * The ID of one or more security groups that control access to this VPC.
     *
     * The security group must include one or more inbound rules (for inbound endpoints) or outbound
     * rules (for outbound endpoints). Inbound and outbound rules must allow TCP and UDP access. For
     * inbound access, open port 53. For outbound access, open the port that you're using for DNS
     * queries on your network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverendpoint.html#cfn-route53resolver-resolverendpoint-securitygroupids)
     */
    override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds()

    /**
     * Route 53 Resolver doesn't support updating tags through CloudFormation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverendpoint.html#cfn-route53resolver-resolverendpoint-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnResolverEndpointProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.route53resolver.CfnResolverEndpointProps):
        CfnResolverEndpointProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnResolverEndpointProps):
        software.amazon.awscdk.services.route53resolver.CfnResolverEndpointProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.route53resolver.CfnResolverEndpointProps
  }
}
