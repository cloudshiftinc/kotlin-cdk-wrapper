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

package io.cloudshiftdev.awscdkdsl.services.ec2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnSecurityGroupEgress
import software.constructs.Construct

/**
 * Adds the specified outbound (egress) rule to a security group.
 *
 * An outbound rule permits instances to send traffic to the specified IPv4 or IPv6 address range,
 * the IP addresses that are specified by a prefix list, or the instances that are associated with a
 * destination security group. For more information, see
 * [Security group rules](https://docs.aws.amazon.com/vpc/latest/userguide/security-group-rules.html)
 * .
 *
 * You must specify exactly one of the following destinations: an IPv4 or IPv6 address range, a
 * prefix list, or a security group. Otherwise, the stack launches successfully but the rule is not
 * added to the security group.
 *
 * You must specify a protocol for each rule (for example, TCP). If the protocol is TCP or UDP, you
 * must also specify a port or port range. If the protocol is ICMP or ICMPv6, you must also specify
 * the ICMP/ICMPv6 type and code. To specify all types or all codes, use -1.
 *
 * Rule changes are propagated to instances associated with the security group as quickly as
 * possible. However, a small delay might occur.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnSecurityGroupEgress cfnSecurityGroupEgress = CfnSecurityGroupEgress.Builder.create(this,
 * "MyCfnSecurityGroupEgress")
 * .groupId("groupId")
 * .ipProtocol("ipProtocol")
 * // the properties below are optional
 * .cidrIp("cidrIp")
 * .cidrIpv6("cidrIpv6")
 * .description("description")
 * .destinationPrefixListId("destinationPrefixListId")
 * .destinationSecurityGroupId("destinationSecurityGroupId")
 * .fromPort(123)
 * .toPort(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupegress.html)
 */
@CdkDslMarker
public class CfnSecurityGroupEgressDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnSecurityGroupEgress.Builder =
        CfnSecurityGroupEgress.Builder.create(scope, id)

    /**
     * The IPv4 address range, in CIDR format.
     *
     * You must specify a destination security group ( `DestinationPrefixListId` or
     * `DestinationSecurityGroupId` ) or a CIDR range ( `CidrIp` or `CidrIpv6` ).
     *
     * For examples of rules that you can add to security groups for specific access scenarios, see
     * [Security group rules for different use cases](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/security-group-rules-reference.html)
     * in the *Amazon EC2 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupegress.html#cfn-ec2-securitygroupegress-cidrip)
     *
     * @param cidrIp The IPv4 address range, in CIDR format.
     */
    public fun cidrIp(cidrIp: String) {
        cdkBuilder.cidrIp(cidrIp)
    }

    /**
     * The IPv6 address range, in CIDR format.
     *
     * You must specify a destination security group ( `DestinationPrefixListId` or
     * `DestinationSecurityGroupId` ) or a CIDR range ( `CidrIp` or `CidrIpv6` ).
     *
     * For examples of rules that you can add to security groups for specific access scenarios, see
     * [Security group rules for different use cases](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/security-group-rules-reference.html)
     * in the *Amazon EC2 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupegress.html#cfn-ec2-securitygroupegress-cidripv6)
     *
     * @param cidrIpv6 The IPv6 address range, in CIDR format.
     */
    public fun cidrIpv6(cidrIpv6: String) {
        cdkBuilder.cidrIpv6(cidrIpv6)
    }

    /**
     * The description of an egress (outbound) security group rule.
     *
     * Constraints: Up to 255 characters in length. Allowed characters are a-z, A-Z, 0-9, spaces,
     * and ._-:/()#,&#64;[]+=;{}!$*
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupegress.html#cfn-ec2-securitygroupegress-description)
     *
     * @param description The description of an egress (outbound) security group rule.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The prefix list IDs for an AWS service.
     *
     * This is the AWS service that you want to access through a VPC endpoint from instances
     * associated with the security group.
     *
     * You must specify a destination security group ( `DestinationPrefixListId` or
     * `DestinationSecurityGroupId` ) or a CIDR range ( `CidrIp` or `CidrIpv6` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupegress.html#cfn-ec2-securitygroupegress-destinationprefixlistid)
     *
     * @param destinationPrefixListId The prefix list IDs for an AWS service.
     */
    public fun destinationPrefixListId(destinationPrefixListId: String) {
        cdkBuilder.destinationPrefixListId(destinationPrefixListId)
    }

    /**
     * The ID of the security group.
     *
     * You must specify a destination security group ( `DestinationPrefixListId` or
     * `DestinationSecurityGroupId` ) or a CIDR range ( `CidrIp` or `CidrIpv6` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupegress.html#cfn-ec2-securitygroupegress-destinationsecuritygroupid)
     *
     * @param destinationSecurityGroupId The ID of the security group.
     */
    public fun destinationSecurityGroupId(destinationSecurityGroupId: String) {
        cdkBuilder.destinationSecurityGroupId(destinationSecurityGroupId)
    }

    /**
     * If the protocol is TCP or UDP, this is the start of the port range.
     *
     * If the protocol is ICMP or ICMPv6, this is the ICMP type or -1 (all ICMP types).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupegress.html#cfn-ec2-securitygroupegress-fromport)
     *
     * @param fromPort If the protocol is TCP or UDP, this is the start of the port range.
     */
    public fun fromPort(fromPort: Number) {
        cdkBuilder.fromPort(fromPort)
    }

    /**
     * The ID of the security group.
     *
     * You must specify either the security group ID or the security group name in the request. For
     * security groups in a nondefault VPC, you must specify the security group ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupegress.html#cfn-ec2-securitygroupegress-groupid)
     *
     * @param groupId The ID of the security group.
     */
    public fun groupId(groupId: String) {
        cdkBuilder.groupId(groupId)
    }

    /**
     * The IP protocol name ( `tcp` , `udp` , `icmp` , `icmpv6` ) or number (see
     * [Protocol Numbers](https://docs.aws.amazon.com/http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml)
     * ).
     *
     * Use `-1` to specify all protocols. When authorizing security group rules, specifying `-1` or
     * a protocol number other than `tcp` , `udp` , `icmp` , or `icmpv6` allows traffic on all
     * ports, regardless of any port range you specify. For `tcp` , `udp` , and `icmp` , you must
     * specify a port range. For `icmpv6` , the port range is optional; if you omit the port range,
     * traffic for all types and codes is allowed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupegress.html#cfn-ec2-securitygroupegress-ipprotocol)
     *
     * @param ipProtocol The IP protocol name ( `tcp` , `udp` , `icmp` , `icmpv6` ) or number (see
     *   [Protocol Numbers](https://docs.aws.amazon.com/http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml)
     *   ).
     */
    public fun ipProtocol(ipProtocol: String) {
        cdkBuilder.ipProtocol(ipProtocol)
    }

    /**
     * If the protocol is TCP or UDP, this is the end of the port range.
     *
     * If the protocol is ICMP or ICMPv6, this is the ICMP code or -1 (all ICMP codes). If the start
     * port is -1 (all ICMP types), then the end port must be -1 (all ICMP codes).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupegress.html#cfn-ec2-securitygroupegress-toport)
     *
     * @param toPort If the protocol is TCP or UDP, this is the end of the port range.
     */
    public fun toPort(toPort: Number) {
        cdkBuilder.toPort(toPort)
    }

    public fun build(): CfnSecurityGroupEgress = cdkBuilder.build()
}
