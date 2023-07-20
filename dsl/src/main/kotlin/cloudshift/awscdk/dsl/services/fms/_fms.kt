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

package cloudshift.awscdk.dsl.services.fms

import software.amazon.awscdk.services.fms.CfnNotificationChannel
import software.amazon.awscdk.services.fms.CfnNotificationChannelProps
import software.amazon.awscdk.services.fms.CfnPolicy
import software.amazon.awscdk.services.fms.CfnPolicyProps
import software.amazon.awscdk.services.fms.CfnResourceSet
import software.amazon.awscdk.services.fms.CfnResourceSetProps
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object fms {
    public inline fun cfnNotificationChannel(
        scope: Construct,
        id: String,
        block: CfnNotificationChannelDsl.() -> Unit = {},
    ): CfnNotificationChannel {
        val builder = CfnNotificationChannelDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnNotificationChannelProps(
        block: CfnNotificationChannelPropsDsl.() -> Unit =
            {},
    ): CfnNotificationChannelProps {
        val builder = CfnNotificationChannelPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPolicy(
        scope: Construct,
        id: String,
        block: CfnPolicyDsl.() -> Unit = {},
    ): CfnPolicy {
        val builder = CfnPolicyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPolicyIEMapProperty(block: CfnPolicyIEMapPropertyDsl.() -> Unit = {}): CfnPolicy.IEMapProperty {
        val builder = CfnPolicyIEMapPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPolicyNetworkFirewallPolicyProperty(
        block: CfnPolicyNetworkFirewallPolicyPropertyDsl.() -> Unit =
            {},
    ): CfnPolicy.NetworkFirewallPolicyProperty {
        val builder = CfnPolicyNetworkFirewallPolicyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPolicyPolicyOptionProperty(
        block: CfnPolicyPolicyOptionPropertyDsl.() -> Unit =
            {},
    ): CfnPolicy.PolicyOptionProperty {
        val builder = CfnPolicyPolicyOptionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPolicyPolicyTagProperty(
        block: CfnPolicyPolicyTagPropertyDsl.() -> Unit =
            {},
    ): CfnPolicy.PolicyTagProperty {
        val builder = CfnPolicyPolicyTagPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPolicyProps(block: CfnPolicyPropsDsl.() -> Unit = {}): CfnPolicyProps {
        val builder = CfnPolicyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPolicyResourceTagProperty(
        block: CfnPolicyResourceTagPropertyDsl.() -> Unit =
            {},
    ): CfnPolicy.ResourceTagProperty {
        val builder = CfnPolicyResourceTagPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPolicySecurityServicePolicyDataProperty(
        block: CfnPolicySecurityServicePolicyDataPropertyDsl.() -> Unit =
            {},
    ): CfnPolicy.SecurityServicePolicyDataProperty {
        val builder = CfnPolicySecurityServicePolicyDataPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPolicyThirdPartyFirewallPolicyProperty(
        block: CfnPolicyThirdPartyFirewallPolicyPropertyDsl.() -> Unit =
            {},
    ): CfnPolicy.ThirdPartyFirewallPolicyProperty {
        val builder = CfnPolicyThirdPartyFirewallPolicyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnResourceSet(
        scope: Construct,
        id: String,
        block: CfnResourceSetDsl.() -> Unit = {},
    ): CfnResourceSet {
        val builder = CfnResourceSetDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnResourceSetProps(block: CfnResourceSetPropsDsl.() -> Unit = {}): CfnResourceSetProps {
        val builder = CfnResourceSetPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
