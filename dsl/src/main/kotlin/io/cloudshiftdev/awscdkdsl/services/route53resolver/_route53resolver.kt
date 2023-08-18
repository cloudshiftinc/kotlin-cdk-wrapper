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

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53resolver.CfnFirewallDomainList
import software.amazon.awscdk.services.route53resolver.CfnFirewallDomainListProps
import software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroup
import software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroupAssociation
import software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroupAssociationProps
import software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroupProps
import software.amazon.awscdk.services.route53resolver.CfnResolverConfig
import software.amazon.awscdk.services.route53resolver.CfnResolverConfigProps
import software.amazon.awscdk.services.route53resolver.CfnResolverDNSSECConfig
import software.amazon.awscdk.services.route53resolver.CfnResolverDNSSECConfigProps
import software.amazon.awscdk.services.route53resolver.CfnResolverEndpoint
import software.amazon.awscdk.services.route53resolver.CfnResolverEndpointProps
import software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfig
import software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfigAssociation
import software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfigAssociationProps
import software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfigProps
import software.amazon.awscdk.services.route53resolver.CfnResolverRule
import software.amazon.awscdk.services.route53resolver.CfnResolverRuleAssociation
import software.amazon.awscdk.services.route53resolver.CfnResolverRuleAssociationProps
import software.amazon.awscdk.services.route53resolver.CfnResolverRuleProps
import software.constructs.Construct

public object route53resolver {
    /**
     * High-level information about a list of firewall domains for use in a
     * [AWS::Route53Resolver::FirewallRule](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53resolver-firewallrulegroup-rule.html)
     * . This is returned by
     * [GetFirewallDomainList](https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_GetFirewallDomainList.html)
     * .
     *
     * To retrieve the domains that are defined for this domain list, call
     * [ListFirewallDomains](https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_ListFirewallDomains.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.route53resolver.*;
     * CfnFirewallDomainList cfnFirewallDomainList = CfnFirewallDomainList.Builder.create(this,
     * "MyCfnFirewallDomainList")
     * .domainFileUrl("domainFileUrl")
     * .domains(List.of("domains"))
     * .name("name")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewalldomainlist.html)
     */
    public inline fun cfnFirewallDomainList(
        scope: Construct,
        id: String,
        block: CfnFirewallDomainListDsl.() -> Unit = {},
    ): CfnFirewallDomainList {
        val builder = CfnFirewallDomainListDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnFirewallDomainList`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.route53resolver.*;
     * CfnFirewallDomainListProps cfnFirewallDomainListProps = CfnFirewallDomainListProps.builder()
     * .domainFileUrl("domainFileUrl")
     * .domains(List.of("domains"))
     * .name("name")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewalldomainlist.html)
     */
    public inline fun cfnFirewallDomainListProps(
        block: CfnFirewallDomainListPropsDsl.() -> Unit = {}
    ): CfnFirewallDomainListProps {
        val builder = CfnFirewallDomainListPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * High-level information for a firewall rule group.
     *
     * A firewall rule group is a collection of rules that DNS Firewall uses to filter DNS network
     * traffic for a VPC. To retrieve the rules for the rule group, call
     * [ListFirewallRules](https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_ListFirewallRules.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.route53resolver.*;
     * CfnFirewallRuleGroup cfnFirewallRuleGroup = CfnFirewallRuleGroup.Builder.create(this,
     * "MyCfnFirewallRuleGroup")
     * .firewallRules(List.of(FirewallRuleProperty.builder()
     * .action("action")
     * .firewallDomainListId("firewallDomainListId")
     * .priority(123)
     * // the properties below are optional
     * .blockOverrideDnsType("blockOverrideDnsType")
     * .blockOverrideDomain("blockOverrideDomain")
     * .blockOverrideTtl(123)
     * .blockResponse("blockResponse")
     * .build()))
     * .name("name")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewallrulegroup.html)
     */
    public inline fun cfnFirewallRuleGroup(
        scope: Construct,
        id: String,
        block: CfnFirewallRuleGroupDsl.() -> Unit = {},
    ): CfnFirewallRuleGroup {
        val builder = CfnFirewallRuleGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * An association between a firewall rule group and a VPC, which enables DNS filtering for the
     * VPC.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.route53resolver.*;
     * CfnFirewallRuleGroupAssociation cfnFirewallRuleGroupAssociation =
     * CfnFirewallRuleGroupAssociation.Builder.create(this, "MyCfnFirewallRuleGroupAssociation")
     * .firewallRuleGroupId("firewallRuleGroupId")
     * .priority(123)
     * .vpcId("vpcId")
     * // the properties below are optional
     * .mutationProtection("mutationProtection")
     * .name("name")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewallrulegroupassociation.html)
     */
    public inline fun cfnFirewallRuleGroupAssociation(
        scope: Construct,
        id: String,
        block: CfnFirewallRuleGroupAssociationDsl.() -> Unit = {},
    ): CfnFirewallRuleGroupAssociation {
        val builder = CfnFirewallRuleGroupAssociationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnFirewallRuleGroupAssociation`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.route53resolver.*;
     * CfnFirewallRuleGroupAssociationProps cfnFirewallRuleGroupAssociationProps =
     * CfnFirewallRuleGroupAssociationProps.builder()
     * .firewallRuleGroupId("firewallRuleGroupId")
     * .priority(123)
     * .vpcId("vpcId")
     * // the properties below are optional
     * .mutationProtection("mutationProtection")
     * .name("name")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewallrulegroupassociation.html)
     */
    public inline fun cfnFirewallRuleGroupAssociationProps(
        block: CfnFirewallRuleGroupAssociationPropsDsl.() -> Unit = {}
    ): CfnFirewallRuleGroupAssociationProps {
        val builder = CfnFirewallRuleGroupAssociationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53resolver-firewallrulegroup-firewallrule.html)
     */
    public inline fun cfnFirewallRuleGroupFirewallRuleProperty(
        block: CfnFirewallRuleGroupFirewallRulePropertyDsl.() -> Unit = {}
    ): CfnFirewallRuleGroup.FirewallRuleProperty {
        val builder = CfnFirewallRuleGroupFirewallRulePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnFirewallRuleGroup`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.route53resolver.*;
     * CfnFirewallRuleGroupProps cfnFirewallRuleGroupProps = CfnFirewallRuleGroupProps.builder()
     * .firewallRules(List.of(FirewallRuleProperty.builder()
     * .action("action")
     * .firewallDomainListId("firewallDomainListId")
     * .priority(123)
     * // the properties below are optional
     * .blockOverrideDnsType("blockOverrideDnsType")
     * .blockOverrideDomain("blockOverrideDomain")
     * .blockOverrideTtl(123)
     * .blockResponse("blockResponse")
     * .build()))
     * .name("name")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewallrulegroup.html)
     */
    public inline fun cfnFirewallRuleGroupProps(
        block: CfnFirewallRuleGroupPropsDsl.() -> Unit = {}
    ): CfnFirewallRuleGroupProps {
        val builder = CfnFirewallRuleGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A complex type that contains information about a Resolver configuration for a VPC.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.route53resolver.*;
     * CfnResolverConfig cfnResolverConfig = CfnResolverConfig.Builder.create(this,
     * "MyCfnResolverConfig")
     * .autodefinedReverseFlag("autodefinedReverseFlag")
     * .resourceId("resourceId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverconfig.html)
     */
    public inline fun cfnResolverConfig(
        scope: Construct,
        id: String,
        block: CfnResolverConfigDsl.() -> Unit = {},
    ): CfnResolverConfig {
        val builder = CfnResolverConfigDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnResolverConfig`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.route53resolver.*;
     * CfnResolverConfigProps cfnResolverConfigProps = CfnResolverConfigProps.builder()
     * .autodefinedReverseFlag("autodefinedReverseFlag")
     * .resourceId("resourceId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverconfig.html)
     */
    public inline fun cfnResolverConfigProps(
        block: CfnResolverConfigPropsDsl.() -> Unit = {}
    ): CfnResolverConfigProps {
        val builder = CfnResolverConfigPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::Route53Resolver::ResolverDNSSECConfig` resource is a complex type that contains
     * information about a configuration for DNSSEC validation.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.route53resolver.*;
     * CfnResolverDNSSECConfig cfnResolverDNSSECConfig = CfnResolverDNSSECConfig.Builder.create(this,
     * "MyCfnResolverDNSSECConfig")
     * .resourceId("resourceId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverdnssecconfig.html)
     */
    public inline fun cfnResolverDNSSECConfig(
        scope: Construct,
        id: String,
        block: CfnResolverDNSSECConfigDsl.() -> Unit = {},
    ): CfnResolverDNSSECConfig {
        val builder = CfnResolverDNSSECConfigDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnResolverDNSSECConfig`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.route53resolver.*;
     * CfnResolverDNSSECConfigProps cfnResolverDNSSECConfigProps =
     * CfnResolverDNSSECConfigProps.builder()
     * .resourceId("resourceId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverdnssecconfig.html)
     */
    public inline fun cfnResolverDNSSECConfigProps(
        block: CfnResolverDNSSECConfigPropsDsl.() -> Unit = {}
    ): CfnResolverDNSSECConfigProps {
        val builder = CfnResolverDNSSECConfigPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a Resolver endpoint. There are two types of Resolver endpoints, inbound and
     * outbound:.
     * * An *inbound Resolver endpoint* forwards DNS queries to the DNS service for a VPC from your
     *   network.
     * * An *outbound Resolver endpoint* forwards DNS queries from the DNS service for a VPC to your
     *   network.
     * * You cannot update `ResolverEndpointType` and `IpAddresses` in the same request.
     * * When you update a dual-stack IP address, you must update both IP addresses. You can’t
     *   update only an IPv4 or IPv6 and keep an existing IP address.
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
    public inline fun cfnResolverEndpoint(
        scope: Construct,
        id: String,
        block: CfnResolverEndpointDsl.() -> Unit = {},
    ): CfnResolverEndpoint {
        val builder = CfnResolverEndpointDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * In a
     * [CreateResolverEndpoint](https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_CreateResolverEndpoint.html)
     * request, the IP address that DNS queries originate from (for outbound endpoints) or that you
     * forward DNS queries to (for inbound endpoints). `IpAddressRequest` also includes the ID of
     * the subnet that contains the IP address.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.route53resolver.*;
     * IpAddressRequestProperty ipAddressRequestProperty = IpAddressRequestProperty.builder()
     * .subnetId("subnetId")
     * // the properties below are optional
     * .ip("ip")
     * .ipv6("ipv6")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53resolver-resolverendpoint-ipaddressrequest.html)
     */
    public inline fun cfnResolverEndpointIpAddressRequestProperty(
        block: CfnResolverEndpointIpAddressRequestPropertyDsl.() -> Unit = {}
    ): CfnResolverEndpoint.IpAddressRequestProperty {
        val builder = CfnResolverEndpointIpAddressRequestPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

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
    public inline fun cfnResolverEndpointProps(
        block: CfnResolverEndpointPropsDsl.() -> Unit = {}
    ): CfnResolverEndpointProps {
        val builder = CfnResolverEndpointPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The AWS::Route53Resolver::ResolverQueryLoggingConfig resource is a complex type that contains
     * settings for one query logging configuration.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.route53resolver.*;
     * CfnResolverQueryLoggingConfig cfnResolverQueryLoggingConfig =
     * CfnResolverQueryLoggingConfig.Builder.create(this, "MyCfnResolverQueryLoggingConfig")
     * .destinationArn("destinationArn")
     * .name("name")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverqueryloggingconfig.html)
     */
    public inline fun cfnResolverQueryLoggingConfig(
        scope: Construct,
        id: String,
        block: CfnResolverQueryLoggingConfigDsl.() -> Unit = {},
    ): CfnResolverQueryLoggingConfig {
        val builder = CfnResolverQueryLoggingConfigDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The AWS::Route53Resolver::ResolverQueryLoggingConfigAssociation resource is a configuration
     * for DNS query logging.
     *
     * After you create a query logging configuration, Amazon Route 53 begins to publish log data to
     * an Amazon CloudWatch Logs log group.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.route53resolver.*;
     * CfnResolverQueryLoggingConfigAssociation cfnResolverQueryLoggingConfigAssociation =
     * CfnResolverQueryLoggingConfigAssociation.Builder.create(this,
     * "MyCfnResolverQueryLoggingConfigAssociation")
     * .resolverQueryLogConfigId("resolverQueryLogConfigId")
     * .resourceId("resourceId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverqueryloggingconfigassociation.html)
     */
    public inline fun cfnResolverQueryLoggingConfigAssociation(
        scope: Construct,
        id: String,
        block: CfnResolverQueryLoggingConfigAssociationDsl.() -> Unit = {},
    ): CfnResolverQueryLoggingConfigAssociation {
        val builder = CfnResolverQueryLoggingConfigAssociationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnResolverQueryLoggingConfigAssociation`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.route53resolver.*;
     * CfnResolverQueryLoggingConfigAssociationProps cfnResolverQueryLoggingConfigAssociationProps =
     * CfnResolverQueryLoggingConfigAssociationProps.builder()
     * .resolverQueryLogConfigId("resolverQueryLogConfigId")
     * .resourceId("resourceId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverqueryloggingconfigassociation.html)
     */
    public inline fun cfnResolverQueryLoggingConfigAssociationProps(
        block: CfnResolverQueryLoggingConfigAssociationPropsDsl.() -> Unit = {}
    ): CfnResolverQueryLoggingConfigAssociationProps {
        val builder = CfnResolverQueryLoggingConfigAssociationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnResolverQueryLoggingConfig`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.route53resolver.*;
     * CfnResolverQueryLoggingConfigProps cfnResolverQueryLoggingConfigProps =
     * CfnResolverQueryLoggingConfigProps.builder()
     * .destinationArn("destinationArn")
     * .name("name")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverqueryloggingconfig.html)
     */
    public inline fun cfnResolverQueryLoggingConfigProps(
        block: CfnResolverQueryLoggingConfigPropsDsl.() -> Unit = {}
    ): CfnResolverQueryLoggingConfigProps {
        val builder = CfnResolverQueryLoggingConfigPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * For DNS queries that originate in your VPCs, specifies which Resolver endpoint the queries
     * pass through, one domain name that you want to forward to your network, and the IP addresses
     * of the DNS resolvers in your network.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.route53resolver.*;
     * CfnResolverRule cfnResolverRule = CfnResolverRule.Builder.create(this, "MyCfnResolverRule")
     * .domainName("domainName")
     * .ruleType("ruleType")
     * // the properties below are optional
     * .name("name")
     * .resolverEndpointId("resolverEndpointId")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .targetIps(List.of(TargetAddressProperty.builder()
     * .ip("ip")
     * .ipv6("ipv6")
     * .port("port")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverrule.html)
     */
    public inline fun cfnResolverRule(
        scope: Construct,
        id: String,
        block: CfnResolverRuleDsl.() -> Unit = {},
    ): CfnResolverRule {
        val builder = CfnResolverRuleDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * In the response to an
     * [AssociateResolverRule](https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_AssociateResolverRule.html)
     * ,
     * [DisassociateResolverRule](https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_DisassociateResolverRule.html)
     * , or
     * [ListResolverRuleAssociations](https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_ListResolverRuleAssociations.html)
     * request, provides information about an association between a resolver rule and a VPC. The
     * association determines which DNS queries that originate in the VPC are forwarded to your
     * network.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.route53resolver.*;
     * CfnResolverRuleAssociation cfnResolverRuleAssociation =
     * CfnResolverRuleAssociation.Builder.create(this, "MyCfnResolverRuleAssociation")
     * .resolverRuleId("resolverRuleId")
     * .vpcId("vpcId")
     * // the properties below are optional
     * .name("name")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverruleassociation.html)
     */
    public inline fun cfnResolverRuleAssociation(
        scope: Construct,
        id: String,
        block: CfnResolverRuleAssociationDsl.() -> Unit = {},
    ): CfnResolverRuleAssociation {
        val builder = CfnResolverRuleAssociationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnResolverRuleAssociation`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.route53resolver.*;
     * CfnResolverRuleAssociationProps cfnResolverRuleAssociationProps =
     * CfnResolverRuleAssociationProps.builder()
     * .resolverRuleId("resolverRuleId")
     * .vpcId("vpcId")
     * // the properties below are optional
     * .name("name")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverruleassociation.html)
     */
    public inline fun cfnResolverRuleAssociationProps(
        block: CfnResolverRuleAssociationPropsDsl.() -> Unit = {}
    ): CfnResolverRuleAssociationProps {
        val builder = CfnResolverRuleAssociationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnResolverRule`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.route53resolver.*;
     * CfnResolverRuleProps cfnResolverRuleProps = CfnResolverRuleProps.builder()
     * .domainName("domainName")
     * .ruleType("ruleType")
     * // the properties below are optional
     * .name("name")
     * .resolverEndpointId("resolverEndpointId")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .targetIps(List.of(TargetAddressProperty.builder()
     * .ip("ip")
     * .ipv6("ipv6")
     * .port("port")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverrule.html)
     */
    public inline fun cfnResolverRuleProps(
        block: CfnResolverRulePropsDsl.() -> Unit = {}
    ): CfnResolverRuleProps {
        val builder = CfnResolverRulePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * In a
     * [CreateResolverRule](https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_CreateResolverRule.html)
     * request, an array of the IPs that you want to forward DNS queries to.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.route53resolver.*;
     * TargetAddressProperty targetAddressProperty = TargetAddressProperty.builder()
     * .ip("ip")
     * .ipv6("ipv6")
     * .port("port")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53resolver-resolverrule-targetaddress.html)
     */
    public inline fun cfnResolverRuleTargetAddressProperty(
        block: CfnResolverRuleTargetAddressPropertyDsl.() -> Unit = {}
    ): CfnResolverRule.TargetAddressProperty {
        val builder = CfnResolverRuleTargetAddressPropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
