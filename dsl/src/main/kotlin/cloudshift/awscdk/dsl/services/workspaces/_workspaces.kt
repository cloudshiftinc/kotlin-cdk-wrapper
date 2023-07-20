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

package cloudshift.awscdk.dsl.services.workspaces

import software.amazon.awscdk.services.workspaces.CfnConnectionAlias
import software.amazon.awscdk.services.workspaces.CfnConnectionAliasProps
import software.amazon.awscdk.services.workspaces.CfnWorkspace
import software.amazon.awscdk.services.workspaces.CfnWorkspaceProps
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object workspaces {
    public inline fun cfnConnectionAlias(
        scope: Construct,
        id: String,
        block: CfnConnectionAliasDsl.() -> Unit = {},
    ): CfnConnectionAlias {
        val builder = CfnConnectionAliasDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnConnectionAliasConnectionAliasAssociationProperty(
        block: CfnConnectionAliasConnectionAliasAssociationPropertyDsl.() -> Unit =
            {},
    ): CfnConnectionAlias.ConnectionAliasAssociationProperty {
        val builder = CfnConnectionAliasConnectionAliasAssociationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnConnectionAliasProps(block: CfnConnectionAliasPropsDsl.() -> Unit = {}): CfnConnectionAliasProps {
        val builder = CfnConnectionAliasPropsDsl()
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

    public inline fun cfnWorkspaceProps(block: CfnWorkspacePropsDsl.() -> Unit = {}): CfnWorkspaceProps {
        val builder = CfnWorkspacePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnWorkspaceWorkspacePropertiesProperty(
        block: CfnWorkspaceWorkspacePropertiesPropertyDsl.() -> Unit =
            {},
    ): CfnWorkspace.WorkspacePropertiesProperty {
        val builder = CfnWorkspaceWorkspacePropertiesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
