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

package io.cloudshiftdev.awscdkdsl.services.route53resolver

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.route53resolver.CfnResolverEndpointProps

/**
 * Properties for defining a `CfnResolverEndpoint`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.route53resolver.*;
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
public class CfnResolverEndpointPropsDsl {
    private val cdkBuilder: CfnResolverEndpointProps.Builder = CfnResolverEndpointProps.builder()

    private val _ipAddresses: MutableList<Any> = mutableListOf()

    private val _securityGroupIds: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param direction Indicates whether the Resolver endpoint allows inbound or outbound DNS
     *   queries:.
     * * `INBOUND` : allows DNS queries to your VPC from your network
     * * `OUTBOUND` : allows DNS queries from your VPC to your network
     */
    public fun direction(direction: String) {
        cdkBuilder.direction(direction)
    }

    /**
     * @param ipAddresses The subnets and IP addresses in your VPC that DNS queries originate from
     *   (for outbound endpoints) or that you forward DNS queries to (for inbound endpoints). The
     *   subnet ID uniquely identifies a VPC.
     *
     * Even though the minimum is 1, Route 53 requires that you create at least two.
     */
    public fun ipAddresses(vararg ipAddresses: Any) {
        _ipAddresses.addAll(listOf(*ipAddresses))
    }

    /**
     * @param ipAddresses The subnets and IP addresses in your VPC that DNS queries originate from
     *   (for outbound endpoints) or that you forward DNS queries to (for inbound endpoints). The
     *   subnet ID uniquely identifies a VPC.
     *
     * Even though the minimum is 1, Route 53 requires that you create at least two.
     */
    public fun ipAddresses(ipAddresses: Collection<Any>) {
        _ipAddresses.addAll(ipAddresses)
    }

    /**
     * @param ipAddresses The subnets and IP addresses in your VPC that DNS queries originate from
     *   (for outbound endpoints) or that you forward DNS queries to (for inbound endpoints). The
     *   subnet ID uniquely identifies a VPC.
     *
     * Even though the minimum is 1, Route 53 requires that you create at least two.
     */
    public fun ipAddresses(ipAddresses: IResolvable) {
        cdkBuilder.ipAddresses(ipAddresses)
    }

    /**
     * @param name A friendly name that lets you easily find a configuration in the Resolver
     *   dashboard in the Route 53 console.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param outpostArn the value to be set. */
    public fun outpostArn(outpostArn: String) {
        cdkBuilder.outpostArn(outpostArn)
    }

    /** @param preferredInstanceType the value to be set. */
    public fun preferredInstanceType(preferredInstanceType: String) {
        cdkBuilder.preferredInstanceType(preferredInstanceType)
    }

    /** @param resolverEndpointType The Resolver endpoint IP address type. */
    public fun resolverEndpointType(resolverEndpointType: String) {
        cdkBuilder.resolverEndpointType(resolverEndpointType)
    }

    /**
     * @param securityGroupIds The ID of one or more security groups that control access to this
     *   VPC. The security group must include one or more inbound rules (for inbound endpoints) or
     *   outbound rules (for outbound endpoints). Inbound and outbound rules must allow TCP and UDP
     *   access. For inbound access, open port 53. For outbound access, open the port that you're
     *   using for DNS queries on your network.
     */
    public fun securityGroupIds(vararg securityGroupIds: String) {
        _securityGroupIds.addAll(listOf(*securityGroupIds))
    }

    /**
     * @param securityGroupIds The ID of one or more security groups that control access to this
     *   VPC. The security group must include one or more inbound rules (for inbound endpoints) or
     *   outbound rules (for outbound endpoints). Inbound and outbound rules must allow TCP and UDP
     *   access. For inbound access, open port 53. For outbound access, open the port that you're
     *   using for DNS queries on your network.
     */
    public fun securityGroupIds(securityGroupIds: Collection<String>) {
        _securityGroupIds.addAll(securityGroupIds)
    }

    /** @param tags Route 53 Resolver doesn't support updating tags through CloudFormation. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags Route 53 Resolver doesn't support updating tags through CloudFormation. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnResolverEndpointProps {
        if (_ipAddresses.isNotEmpty()) cdkBuilder.ipAddresses(_ipAddresses)
        if (_securityGroupIds.isNotEmpty()) cdkBuilder.securityGroupIds(_securityGroupIds)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
