@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.route53resolver

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
import kotlin.String
import kotlin.Unit

public object route53resolver {
    public inline fun cfnFirewallDomainList(
        scope: Construct,
        id: String,
        block: CfnFirewallDomainListDsl.() -> Unit = {},
    ): CfnFirewallDomainList {
        val builder = CfnFirewallDomainListDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnFirewallDomainListProps(
        block: CfnFirewallDomainListPropsDsl.() -> Unit =
            {},
    ): CfnFirewallDomainListProps {
        val builder = CfnFirewallDomainListPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnFirewallRuleGroup(
        scope: Construct,
        id: String,
        block: CfnFirewallRuleGroupDsl.() -> Unit = {},
    ): CfnFirewallRuleGroup {
        val builder = CfnFirewallRuleGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnFirewallRuleGroupAssociation(
        scope: Construct,
        id: String,
        block: CfnFirewallRuleGroupAssociationDsl.() -> Unit = {},
    ): CfnFirewallRuleGroupAssociation {
        val builder = CfnFirewallRuleGroupAssociationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnFirewallRuleGroupAssociationProps(
        block: CfnFirewallRuleGroupAssociationPropsDsl.() -> Unit =
            {},
    ): CfnFirewallRuleGroupAssociationProps {
        val builder = CfnFirewallRuleGroupAssociationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnFirewallRuleGroupFirewallRuleProperty(
        block: CfnFirewallRuleGroupFirewallRulePropertyDsl.() -> Unit =
            {},
    ): CfnFirewallRuleGroup.FirewallRuleProperty {
        val builder = CfnFirewallRuleGroupFirewallRulePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnFirewallRuleGroupProps(block: CfnFirewallRuleGroupPropsDsl.() -> Unit = {}): CfnFirewallRuleGroupProps {
        val builder = CfnFirewallRuleGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnResolverConfig(
        scope: Construct,
        id: String,
        block: CfnResolverConfigDsl.() -> Unit = {},
    ): CfnResolverConfig {
        val builder = CfnResolverConfigDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnResolverConfigProps(block: CfnResolverConfigPropsDsl.() -> Unit = {}): CfnResolverConfigProps {
        val builder = CfnResolverConfigPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnResolverDNSSECConfig(
        scope: Construct,
        id: String,
        block: CfnResolverDNSSECConfigDsl.() -> Unit = {},
    ): CfnResolverDNSSECConfig {
        val builder = CfnResolverDNSSECConfigDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnResolverDNSSECConfigProps(
        block: CfnResolverDNSSECConfigPropsDsl.() -> Unit =
            {},
    ): CfnResolverDNSSECConfigProps {
        val builder = CfnResolverDNSSECConfigPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnResolverEndpoint(
        scope: Construct,
        id: String,
        block: CfnResolverEndpointDsl.() -> Unit = {},
    ): CfnResolverEndpoint {
        val builder = CfnResolverEndpointDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnResolverEndpointIpAddressRequestProperty(
        block: CfnResolverEndpointIpAddressRequestPropertyDsl.() -> Unit =
            {},
    ): CfnResolverEndpoint.IpAddressRequestProperty {
        val builder = CfnResolverEndpointIpAddressRequestPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnResolverEndpointProps(block: CfnResolverEndpointPropsDsl.() -> Unit = {}): CfnResolverEndpointProps {
        val builder = CfnResolverEndpointPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnResolverQueryLoggingConfig(
        scope: Construct,
        id: String,
        block: CfnResolverQueryLoggingConfigDsl.() -> Unit = {},
    ): CfnResolverQueryLoggingConfig {
        val builder = CfnResolverQueryLoggingConfigDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnResolverQueryLoggingConfigAssociation(
        scope: Construct,
        id: String,
        block: CfnResolverQueryLoggingConfigAssociationDsl.() -> Unit = {},
    ): CfnResolverQueryLoggingConfigAssociation {
        val builder = CfnResolverQueryLoggingConfigAssociationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnResolverQueryLoggingConfigAssociationProps(
        block: CfnResolverQueryLoggingConfigAssociationPropsDsl.() -> Unit =
            {},
    ): CfnResolverQueryLoggingConfigAssociationProps {
        val builder = CfnResolverQueryLoggingConfigAssociationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnResolverQueryLoggingConfigProps(
        block: CfnResolverQueryLoggingConfigPropsDsl.() -> Unit =
            {},
    ): CfnResolverQueryLoggingConfigProps {
        val builder = CfnResolverQueryLoggingConfigPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnResolverRule(
        scope: Construct,
        id: String,
        block: CfnResolverRuleDsl.() -> Unit = {},
    ): CfnResolverRule {
        val builder = CfnResolverRuleDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnResolverRuleAssociation(
        scope: Construct,
        id: String,
        block: CfnResolverRuleAssociationDsl.() -> Unit = {},
    ): CfnResolverRuleAssociation {
        val builder = CfnResolverRuleAssociationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnResolverRuleAssociationProps(
        block: CfnResolverRuleAssociationPropsDsl.() -> Unit =
            {},
    ): CfnResolverRuleAssociationProps {
        val builder = CfnResolverRuleAssociationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnResolverRuleProps(block: CfnResolverRulePropsDsl.() -> Unit = {}): CfnResolverRuleProps {
        val builder = CfnResolverRulePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnResolverRuleTargetAddressProperty(
        block: CfnResolverRuleTargetAddressPropertyDsl.() -> Unit =
            {},
    ): CfnResolverRule.TargetAddressProperty {
        val builder = CfnResolverRuleTargetAddressPropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
