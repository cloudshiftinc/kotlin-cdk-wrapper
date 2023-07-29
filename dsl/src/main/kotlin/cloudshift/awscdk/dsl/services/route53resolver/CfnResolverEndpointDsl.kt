@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.route53resolver

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.route53resolver.CfnResolverEndpoint
import software.constructs.Construct

/**
 * Creates a Resolver endpoint. There are two types of Resolver endpoints, inbound and outbound:.
 * * An *inbound Resolver endpoint* forwards DNS queries to the DNS service for a VPC from your
 *   network.
 * * An *outbound Resolver endpoint* forwards DNS queries from the DNS service for a VPC to your
 *   network.
 * * You cannot update `ResolverEndpointType` and `IpAddresses` in the same request.
 * * When you update a dual-stack IP address, you must update both IP addresses. You can’t update
 *   only an IPv4 or IPv6 and keep an existing IP address.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.route53resolver.*;
 * CfnResolverEndpoint cfnResolverEndpoint = CfnResolverEndpoint.Builder.create(this,
 * "MyCfnResolverEndpoint")
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
@CdkDslMarker
public class CfnResolverEndpointDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnResolverEndpoint.Builder =
        CfnResolverEndpoint.Builder.create(scope, id)

    private val _ipAddresses: MutableList<Any> = mutableListOf()

    private val _securityGroupIds: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * Indicates whether the Resolver endpoint allows inbound or outbound DNS queries:.
     * * `INBOUND` : allows DNS queries to your VPC from your network
     * * `OUTBOUND` : allows DNS queries from your VPC to your network
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverendpoint.html#cfn-route53resolver-resolverendpoint-direction)
     *
     * @param direction Indicates whether the Resolver endpoint allows inbound or outbound DNS
     *   queries:.
     */
    public fun direction(direction: String) {
        cdkBuilder.direction(direction)
    }

    /**
     * The subnets and IP addresses in your VPC that DNS queries originate from (for outbound
     * endpoints) or that you forward DNS queries to (for inbound endpoints).
     *
     * The subnet ID uniquely identifies a VPC.
     *
     * Even though the minimum is 1, Route 53 requires that you create at least two.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverendpoint.html#cfn-route53resolver-resolverendpoint-ipaddresses)
     *
     * @param ipAddresses The subnets and IP addresses in your VPC that DNS queries originate from
     *   (for outbound endpoints) or that you forward DNS queries to (for inbound endpoints).
     */
    public fun ipAddresses(vararg ipAddresses: Any) {
        _ipAddresses.addAll(listOf(*ipAddresses))
    }

    /**
     * The subnets and IP addresses in your VPC that DNS queries originate from (for outbound
     * endpoints) or that you forward DNS queries to (for inbound endpoints).
     *
     * The subnet ID uniquely identifies a VPC.
     *
     * Even though the minimum is 1, Route 53 requires that you create at least two.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverendpoint.html#cfn-route53resolver-resolverendpoint-ipaddresses)
     *
     * @param ipAddresses The subnets and IP addresses in your VPC that DNS queries originate from
     *   (for outbound endpoints) or that you forward DNS queries to (for inbound endpoints).
     */
    public fun ipAddresses(ipAddresses: Collection<Any>) {
        _ipAddresses.addAll(ipAddresses)
    }

    /**
     * The subnets and IP addresses in your VPC that DNS queries originate from (for outbound
     * endpoints) or that you forward DNS queries to (for inbound endpoints).
     *
     * The subnet ID uniquely identifies a VPC.
     *
     * Even though the minimum is 1, Route 53 requires that you create at least two.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverendpoint.html#cfn-route53resolver-resolverendpoint-ipaddresses)
     *
     * @param ipAddresses The subnets and IP addresses in your VPC that DNS queries originate from
     *   (for outbound endpoints) or that you forward DNS queries to (for inbound endpoints).
     */
    public fun ipAddresses(ipAddresses: IResolvable) {
        cdkBuilder.ipAddresses(ipAddresses)
    }

    /**
     * A friendly name that lets you easily find a configuration in the Resolver dashboard in the
     * Route 53 console.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverendpoint.html#cfn-route53resolver-resolverendpoint-name)
     *
     * @param name A friendly name that lets you easily find a configuration in the Resolver
     *   dashboard in the Route 53 console.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverendpoint.html#cfn-route53resolver-resolverendpoint-outpostarn)
     *
     * @param outpostArn
     */
    public fun outpostArn(outpostArn: String) {
        cdkBuilder.outpostArn(outpostArn)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverendpoint.html#cfn-route53resolver-resolverendpoint-preferredinstancetype)
     *
     * @param preferredInstanceType
     */
    public fun preferredInstanceType(preferredInstanceType: String) {
        cdkBuilder.preferredInstanceType(preferredInstanceType)
    }

    /**
     * The Resolver endpoint IP address type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverendpoint.html#cfn-route53resolver-resolverendpoint-resolverendpointtype)
     *
     * @param resolverEndpointType The Resolver endpoint IP address type.
     */
    public fun resolverEndpointType(resolverEndpointType: String) {
        cdkBuilder.resolverEndpointType(resolverEndpointType)
    }

    /**
     * The ID of one or more security groups that control access to this VPC.
     *
     * The security group must include one or more inbound rules (for inbound endpoints) or outbound
     * rules (for outbound endpoints). Inbound and outbound rules must allow TCP and UDP access. For
     * inbound access, open port 53. For outbound access, open the port that you're using for DNS
     * queries on your network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverendpoint.html#cfn-route53resolver-resolverendpoint-securitygroupids)
     *
     * @param securityGroupIds The ID of one or more security groups that control access to this
     *   VPC.
     */
    public fun securityGroupIds(vararg securityGroupIds: String) {
        _securityGroupIds.addAll(listOf(*securityGroupIds))
    }

    /**
     * The ID of one or more security groups that control access to this VPC.
     *
     * The security group must include one or more inbound rules (for inbound endpoints) or outbound
     * rules (for outbound endpoints). Inbound and outbound rules must allow TCP and UDP access. For
     * inbound access, open port 53. For outbound access, open the port that you're using for DNS
     * queries on your network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverendpoint.html#cfn-route53resolver-resolverendpoint-securitygroupids)
     *
     * @param securityGroupIds The ID of one or more security groups that control access to this
     *   VPC.
     */
    public fun securityGroupIds(securityGroupIds: Collection<String>) {
        _securityGroupIds.addAll(securityGroupIds)
    }

    /**
     * Route 53 Resolver doesn't support updating tags through CloudFormation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverendpoint.html#cfn-route53resolver-resolverendpoint-tags)
     *
     * @param tags Route 53 Resolver doesn't support updating tags through CloudFormation.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * Route 53 Resolver doesn't support updating tags through CloudFormation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverendpoint.html#cfn-route53resolver-resolverendpoint-tags)
     *
     * @param tags Route 53 Resolver doesn't support updating tags through CloudFormation.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnResolverEndpoint {
        if (_ipAddresses.isNotEmpty()) cdkBuilder.ipAddresses(_ipAddresses)
        if (_securityGroupIds.isNotEmpty()) cdkBuilder.securityGroupIds(_securityGroupIds)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
