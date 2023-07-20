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

package cloudshift.awscdk.dsl.services.aps

import software.amazon.awscdk.services.aps.CfnRuleGroupsNamespace
import software.amazon.awscdk.services.aps.CfnRuleGroupsNamespaceProps
import software.amazon.awscdk.services.aps.CfnWorkspace
import software.amazon.awscdk.services.aps.CfnWorkspaceProps
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object aps {
    public inline fun cfnRuleGroupsNamespace(
        scope: Construct,
        id: String,
        block: CfnRuleGroupsNamespaceDsl.() -> Unit = {},
    ): CfnRuleGroupsNamespace {
        val builder = CfnRuleGroupsNamespaceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRuleGroupsNamespaceProps(
        block: CfnRuleGroupsNamespacePropsDsl.() -> Unit =
            {},
    ): CfnRuleGroupsNamespaceProps {
        val builder = CfnRuleGroupsNamespacePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnWorkspace(
        scope: Construct,
        id: String,
        block: CfnWorkspaceDsl.() -> Unit = {},
    ): CfnWorkspace {
        val builder = CfnWorkspaceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnWorkspaceLoggingConfigurationProperty(
        block: CfnWorkspaceLoggingConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnWorkspace.LoggingConfigurationProperty {
        val builder = CfnWorkspaceLoggingConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnWorkspaceProps(block: CfnWorkspacePropsDsl.() -> Unit = {}): CfnWorkspaceProps {
        val builder = CfnWorkspacePropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
