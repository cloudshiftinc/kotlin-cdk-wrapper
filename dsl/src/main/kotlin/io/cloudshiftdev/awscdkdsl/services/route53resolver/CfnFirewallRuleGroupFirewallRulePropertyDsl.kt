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

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroup

/**
 * A single firewall rule in a rule group.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.route53resolver.*;
 * FirewallRuleProperty firewallRuleProperty = FirewallRuleProperty.builder()
 * .action("action")
 * .firewallDomainListId("firewallDomainListId")
 * .priority(123)
 * // the properties below are optional
 * .blockOverrideDnsType("blockOverrideDnsType")
 * .blockOverrideDomain("blockOverrideDomain")
 * .blockOverrideTtl(123)
 * .blockResponse("blockResponse")
 * .qtype("qtype")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53resolver-firewallrulegroup-firewallrule.html)
 */
@CdkDslMarker
public class CfnFirewallRuleGroupFirewallRulePropertyDsl {
    private val cdkBuilder: CfnFirewallRuleGroup.FirewallRuleProperty.Builder =
        CfnFirewallRuleGroup.FirewallRuleProperty.builder()

    /**
     * @param action The action that DNS Firewall should take on a DNS query when it matches one of
     *   the domains in the rule's domain list: - `ALLOW` - Permit the request to go through.
     * * `ALERT` - Permit the request to go through but send an alert to the logs.
     * * `BLOCK` - Disallow the request. If this is specified,then `BlockResponse` must also be
     *   specified.
     *
     * if `BlockResponse` is `OVERRIDE` , then all of the following `OVERRIDE` attributes must be
     * specified:
     * * `BlockOverrideDnsType`
     * * `BlockOverrideDomain`
     * * `BlockOverrideTtl`
     */
    public fun action(action: String) {
        cdkBuilder.action(action)
    }

    /**
     * @param blockOverrideDnsType The DNS record's type. This determines the format of the record
     *   value that you provided in `BlockOverrideDomain` . Used for the rule action `BLOCK` with a
     *   `BlockResponse` setting of `OVERRIDE` .
     */
    public fun blockOverrideDnsType(blockOverrideDnsType: String) {
        cdkBuilder.blockOverrideDnsType(blockOverrideDnsType)
    }

    /**
     * @param blockOverrideDomain The custom DNS record to send back in response to the query. Used
     *   for the rule action `BLOCK` with a `BlockResponse` setting of `OVERRIDE` .
     */
    public fun blockOverrideDomain(blockOverrideDomain: String) {
        cdkBuilder.blockOverrideDomain(blockOverrideDomain)
    }

    /**
     * @param blockOverrideTtl The recommended amount of time, in seconds, for the DNS resolver or
     *   web browser to cache the provided override record. Used for the rule action `BLOCK` with a
     *   `BlockResponse` setting of `OVERRIDE` .
     */
    public fun blockOverrideTtl(blockOverrideTtl: Number) {
        cdkBuilder.blockOverrideTtl(blockOverrideTtl)
    }

    /**
     * @param blockResponse The way that you want DNS Firewall to block the request. Used for the
     *   rule action setting `BLOCK` .
     * * `NODATA` - Respond indicating that the query was successful, but no response is available
     *   for it.
     * * `NXDOMAIN` - Respond indicating that the domain name that's in the query doesn't exist.
     * * `OVERRIDE` - Provide a custom override in the response. This option requires custom
     *   handling details in the rule's `BlockOverride*` settings.
     */
    public fun blockResponse(blockResponse: String) {
        cdkBuilder.blockResponse(blockResponse)
    }

    /** @param firewallDomainListId The ID of the domain list that's used in the rule. */
    public fun firewallDomainListId(firewallDomainListId: String) {
        cdkBuilder.firewallDomainListId(firewallDomainListId)
    }

    /**
     * @param priority The priority of the rule in the rule group. This value must be unique within
     *   the rule group. DNS Firewall processes the rules in a rule group by order of priority,
     *   starting from the lowest setting.
     */
    public fun priority(priority: Number) {
        cdkBuilder.priority(priority)
    }

    /**
     * @param qtype The DNS query type you want the rule to evaluate. Allowed values are;.
     * * A: Returns an IPv4 address.
     * * AAAA: Returns an Ipv6 address.
     * * CAA: Restricts CAs that can create SSL/TLS certifications for the domain.
     * * CNAME: Returns another domain name.
     * * DS: Record that identifies the DNSSEC signing key of a delegated zone.
     * * MX: Specifies mail servers.
     * * NAPTR: Regular-expression-based rewriting of domain names.
     * * NS: Authoritative name servers.
     * * PTR: Maps an IP address to a domain name.
     * * SOA: Start of authority record for the zone.
     * * SPF: Lists the servers authorized to send emails from a domain.
     * * SRV: Application specific values that identify servers.
     * * TXT: Verifies email senders and application-specific values.
     * * A query type you define by using the DNS type ID, for example 28 for AAAA. The values must
     *   be defined as TYPE NUMBER , where the NUMBER can be 1-65334, for example, TYPE28. For more
     *   information, see
     *   [List of DNS record types](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/List_of_DNS_record_types)
     *   .
     */
    public fun qtype(qtype: String) {
        cdkBuilder.qtype(qtype)
    }

    public fun build(): CfnFirewallRuleGroup.FirewallRuleProperty = cdkBuilder.build()
}
