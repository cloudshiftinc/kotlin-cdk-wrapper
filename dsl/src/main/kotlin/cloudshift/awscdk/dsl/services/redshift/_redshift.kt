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

package cloudshift.awscdk.dsl.services.redshift

import software.amazon.awscdk.services.redshift.CfnCluster
import software.amazon.awscdk.services.redshift.CfnClusterParameterGroup
import software.amazon.awscdk.services.redshift.CfnClusterParameterGroupProps
import software.amazon.awscdk.services.redshift.CfnClusterProps
import software.amazon.awscdk.services.redshift.CfnClusterSecurityGroup
import software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupIngress
import software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupIngressProps
import software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupProps
import software.amazon.awscdk.services.redshift.CfnClusterSubnetGroup
import software.amazon.awscdk.services.redshift.CfnClusterSubnetGroupProps
import software.amazon.awscdk.services.redshift.CfnEndpointAccess
import software.amazon.awscdk.services.redshift.CfnEndpointAccessProps
import software.amazon.awscdk.services.redshift.CfnEndpointAuthorization
import software.amazon.awscdk.services.redshift.CfnEndpointAuthorizationProps
import software.amazon.awscdk.services.redshift.CfnEventSubscription
import software.amazon.awscdk.services.redshift.CfnEventSubscriptionProps
import software.amazon.awscdk.services.redshift.CfnScheduledAction
import software.amazon.awscdk.services.redshift.CfnScheduledActionProps
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object redshift {
    public inline fun cfnCluster(
        scope: Construct,
        id: String,
        block: CfnClusterDsl.() -> Unit = {},
    ): CfnCluster {
        val builder = CfnClusterDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterEndpointProperty(
        block: CfnClusterEndpointPropertyDsl.() -> Unit =
            {},
    ): CfnCluster.EndpointProperty {
        val builder = CfnClusterEndpointPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterLoggingPropertiesProperty(
        block: CfnClusterLoggingPropertiesPropertyDsl.() -> Unit =
            {},
    ): CfnCluster.LoggingPropertiesProperty {
        val builder = CfnClusterLoggingPropertiesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterParameterGroup(
        scope: Construct,
        id: String,
        block: CfnClusterParameterGroupDsl.() -> Unit = {},
    ): CfnClusterParameterGroup {
        val builder = CfnClusterParameterGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterParameterGroupParameterProperty(
        block: CfnClusterParameterGroupParameterPropertyDsl.() -> Unit =
            {},
    ): CfnClusterParameterGroup.ParameterProperty {
        val builder = CfnClusterParameterGroupParameterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterParameterGroupProps(
        block: CfnClusterParameterGroupPropsDsl.() -> Unit =
            {},
    ): CfnClusterParameterGroupProps {
        val builder = CfnClusterParameterGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterProps(block: CfnClusterPropsDsl.() -> Unit = {}): CfnClusterProps {
        val builder = CfnClusterPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterSecurityGroup(
        scope: Construct,
        id: String,
        block: CfnClusterSecurityGroupDsl.() -> Unit = {},
    ): CfnClusterSecurityGroup {
        val builder = CfnClusterSecurityGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterSecurityGroupIngress(
        scope: Construct,
        id: String,
        block: CfnClusterSecurityGroupIngressDsl.() -> Unit = {},
    ): CfnClusterSecurityGroupIngress {
        val builder = CfnClusterSecurityGroupIngressDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterSecurityGroupIngressProps(
        block: CfnClusterSecurityGroupIngressPropsDsl.() -> Unit =
            {},
    ): CfnClusterSecurityGroupIngressProps {
        val builder = CfnClusterSecurityGroupIngressPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterSecurityGroupProps(
        block: CfnClusterSecurityGroupPropsDsl.() -> Unit =
            {},
    ): CfnClusterSecurityGroupProps {
        val builder = CfnClusterSecurityGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterSubnetGroup(
        scope: Construct,
        id: String,
        block: CfnClusterSubnetGroupDsl.() -> Unit = {},
    ): CfnClusterSubnetGroup {
        val builder = CfnClusterSubnetGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterSubnetGroupProps(
        block: CfnClusterSubnetGroupPropsDsl.() -> Unit =
            {},
    ): CfnClusterSubnetGroupProps {
        val builder = CfnClusterSubnetGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnEndpointAccess(
        scope: Construct,
        id: String,
        block: CfnEndpointAccessDsl.() -> Unit = {},
    ): CfnEndpointAccess {
        val builder = CfnEndpointAccessDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnEndpointAccessNetworkInterfaceProperty(
        block: CfnEndpointAccessNetworkInterfacePropertyDsl.() -> Unit =
            {},
    ): CfnEndpointAccess.NetworkInterfaceProperty {
        val builder = CfnEndpointAccessNetworkInterfacePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnEndpointAccessProps(block: CfnEndpointAccessPropsDsl.() -> Unit = {}): CfnEndpointAccessProps {
        val builder = CfnEndpointAccessPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnEndpointAccessVpcEndpointProperty(
        block: CfnEndpointAccessVpcEndpointPropertyDsl.() -> Unit =
            {},
    ): CfnEndpointAccess.VpcEndpointProperty {
        val builder = CfnEndpointAccessVpcEndpointPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnEndpointAccessVpcSecurityGroupProperty(
        block: CfnEndpointAccessVpcSecurityGroupPropertyDsl.() -> Unit =
            {},
    ): CfnEndpointAccess.VpcSecurityGroupProperty {
        val builder = CfnEndpointAccessVpcSecurityGroupPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnEndpointAuthorization(
        scope: Construct,
        id: String,
        block: CfnEndpointAuthorizationDsl.() -> Unit = {},
    ): CfnEndpointAuthorization {
        val builder = CfnEndpointAuthorizationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnEndpointAuthorizationProps(
        block: CfnEndpointAuthorizationPropsDsl.() -> Unit =
            {},
    ): CfnEndpointAuthorizationProps {
        val builder = CfnEndpointAuthorizationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnEventSubscription(
        scope: Construct,
        id: String,
        block: CfnEventSubscriptionDsl.() -> Unit = {},
    ): CfnEventSubscription {
        val builder = CfnEventSubscriptionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnEventSubscriptionProps(block: CfnEventSubscriptionPropsDsl.() -> Unit = {}): CfnEventSubscriptionProps {
        val builder = CfnEventSubscriptionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnScheduledAction(
        scope: Construct,
        id: String,
        block: CfnScheduledActionDsl.() -> Unit = {},
    ): CfnScheduledAction {
        val builder = CfnScheduledActionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnScheduledActionPauseClusterMessageProperty(
        block: CfnScheduledActionPauseClusterMessagePropertyDsl.() -> Unit =
            {},
    ): CfnScheduledAction.PauseClusterMessageProperty {
        val builder = CfnScheduledActionPauseClusterMessagePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnScheduledActionProps(block: CfnScheduledActionPropsDsl.() -> Unit = {}): CfnScheduledActionProps {
        val builder = CfnScheduledActionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnScheduledActionResizeClusterMessageProperty(
        block: CfnScheduledActionResizeClusterMessagePropertyDsl.() -> Unit =
            {},
    ): CfnScheduledAction.ResizeClusterMessageProperty {
        val builder = CfnScheduledActionResizeClusterMessagePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnScheduledActionResumeClusterMessageProperty(
        block: CfnScheduledActionResumeClusterMessagePropertyDsl.() -> Unit =
            {},
    ): CfnScheduledAction.ResumeClusterMessageProperty {
        val builder = CfnScheduledActionResumeClusterMessagePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnScheduledActionScheduledActionTypeProperty(
        block: CfnScheduledActionScheduledActionTypePropertyDsl.() -> Unit =
            {},
    ): CfnScheduledAction.ScheduledActionTypeProperty {
        val builder = CfnScheduledActionScheduledActionTypePropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
