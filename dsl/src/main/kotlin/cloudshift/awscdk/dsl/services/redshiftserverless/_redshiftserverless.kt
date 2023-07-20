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

package cloudshift.awscdk.dsl.services.redshiftserverless

import software.amazon.awscdk.services.redshiftserverless.CfnNamespace
import software.amazon.awscdk.services.redshiftserverless.CfnNamespaceProps
import software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup
import software.amazon.awscdk.services.redshiftserverless.CfnWorkgroupProps
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object redshiftserverless {
    public inline fun cfnNamespace(
        scope: Construct,
        id: String,
        block: CfnNamespaceDsl.() -> Unit = {},
    ): CfnNamespace {
        val builder = CfnNamespaceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnNamespaceNamespaceProperty(
        block: CfnNamespaceNamespacePropertyDsl.() -> Unit =
            {},
    ): CfnNamespace.NamespaceProperty {
        val builder = CfnNamespaceNamespacePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnNamespaceProps(block: CfnNamespacePropsDsl.() -> Unit = {}): CfnNamespaceProps {
        val builder = CfnNamespacePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnWorkgroup(
        scope: Construct,
        id: String,
        block: CfnWorkgroupDsl.() -> Unit = {},
    ): CfnWorkgroup {
        val builder = CfnWorkgroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnWorkgroupConfigParameterProperty(
        block: CfnWorkgroupConfigParameterPropertyDsl.() -> Unit =
            {},
    ): CfnWorkgroup.ConfigParameterProperty {
        val builder = CfnWorkgroupConfigParameterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnWorkgroupEndpointProperty(
        block: CfnWorkgroupEndpointPropertyDsl.() -> Unit =
            {},
    ): CfnWorkgroup.EndpointProperty {
        val builder = CfnWorkgroupEndpointPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnWorkgroupNetworkInterfaceProperty(
        block: CfnWorkgroupNetworkInterfacePropertyDsl.() -> Unit =
            {},
    ): CfnWorkgroup.NetworkInterfaceProperty {
        val builder = CfnWorkgroupNetworkInterfacePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnWorkgroupProps(block: CfnWorkgroupPropsDsl.() -> Unit = {}): CfnWorkgroupProps {
        val builder = CfnWorkgroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnWorkgroupVpcEndpointProperty(
        block: CfnWorkgroupVpcEndpointPropertyDsl.() -> Unit =
            {},
    ): CfnWorkgroup.VpcEndpointProperty {
        val builder = CfnWorkgroupVpcEndpointPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnWorkgroupWorkgroupProperty(
        block: CfnWorkgroupWorkgroupPropertyDsl.() -> Unit =
            {},
    ): CfnWorkgroup.WorkgroupProperty {
        val builder = CfnWorkgroupWorkgroupPropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
