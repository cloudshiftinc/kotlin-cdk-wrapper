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
import software.amazon.awscdk.services.ec2.AclCidr
import software.amazon.awscdk.services.ec2.AclTraffic
import software.amazon.awscdk.services.ec2.Action
import software.amazon.awscdk.services.ec2.CommonNetworkAclEntryOptions
import software.amazon.awscdk.services.ec2.TrafficDirection

/**
 * Basic NetworkACL entry props.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * AclCidr aclCidr;
 * AclTraffic aclTraffic;
 * CommonNetworkAclEntryOptions commonNetworkAclEntryOptions =
 * CommonNetworkAclEntryOptions.builder()
 * .cidr(aclCidr)
 * .ruleNumber(123)
 * .traffic(aclTraffic)
 * // the properties below are optional
 * .direction(TrafficDirection.EGRESS)
 * .networkAclEntryName("networkAclEntryName")
 * .ruleAction(Action.ALLOW)
 * .build();
 * ```
 */
@CdkDslMarker
public class CommonNetworkAclEntryOptionsDsl {
    private val cdkBuilder: CommonNetworkAclEntryOptions.Builder =
        CommonNetworkAclEntryOptions.builder()

    /** @param cidr The CIDR range to allow or deny. */
    public fun cidr(cidr: AclCidr) {
        cdkBuilder.cidr(cidr)
    }

    /** @param direction Traffic direction, with respect to the subnet, this rule applies to. */
    public fun direction(direction: TrafficDirection) {
        cdkBuilder.direction(direction)
    }

    /**
     * @param networkAclEntryName The name of the NetworkAclEntry. It is not recommended to use an
     *   explicit group name.
     */
    public fun networkAclEntryName(networkAclEntryName: String) {
        cdkBuilder.networkAclEntryName(networkAclEntryName)
    }

    /**
     * @param ruleAction Whether to allow or deny traffic that matches the rule; valid values are
     *   "allow" or "deny". Any traffic that is not explicitly allowed is automatically denied in a
     *   custom ACL, all traffic is automatically allowed in a default ACL.
     */
    public fun ruleAction(ruleAction: Action) {
        cdkBuilder.ruleAction(ruleAction)
    }

    /**
     * @param ruleNumber Rule number to assign to the entry, such as 100. ACL entries are processed
     *   in ascending order by rule number. Entries can't use the same rule number unless one is an
     *   egress rule and the other is an ingress rule.
     */
    public fun ruleNumber(ruleNumber: Number) {
        cdkBuilder.ruleNumber(ruleNumber)
    }

    /** @param traffic What kind of traffic this ACL rule applies to. */
    public fun traffic(traffic: AclTraffic) {
        cdkBuilder.traffic(traffic)
    }

    public fun build(): CommonNetworkAclEntryOptions = cdkBuilder.build()
}
