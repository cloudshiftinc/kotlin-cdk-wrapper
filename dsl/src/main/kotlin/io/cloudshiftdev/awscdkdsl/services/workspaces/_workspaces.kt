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

package io.cloudshiftdev.awscdkdsl.services.workspaces

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.workspaces.CfnConnectionAlias
import software.amazon.awscdk.services.workspaces.CfnConnectionAliasProps
import software.amazon.awscdk.services.workspaces.CfnWorkspace
import software.amazon.awscdk.services.workspaces.CfnWorkspaceProps
import software.constructs.Construct

public object workspaces {
    /**
     * The `AWS::WorkSpaces::ConnectionAlias` resource specifies a connection alias.
     *
     * Connection aliases are used for cross-Region redirection. For more information, see
     * [Cross-Region Redirection for Amazon WorkSpaces](https://docs.aws.amazon.com/workspaces/latest/adminguide/cross-region-redirection.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.workspaces.*;
     * CfnConnectionAlias cfnConnectionAlias = CfnConnectionAlias.Builder.create(this,
     * "MyCfnConnectionAlias")
     * .connectionString("connectionString")
     * // the properties below are optional
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-connectionalias.html)
     */
    public inline fun cfnConnectionAlias(
        scope: Construct,
        id: String,
        block: CfnConnectionAliasDsl.() -> Unit = {},
    ): CfnConnectionAlias {
        val builder = CfnConnectionAliasDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.workspaces.*;
     * ConnectionAliasAssociationProperty connectionAliasAssociationProperty =
     * ConnectionAliasAssociationProperty.builder()
     * .associatedAccountId("associatedAccountId")
     * .associationStatus("associationStatus")
     * .connectionIdentifier("connectionIdentifier")
     * .resourceId("resourceId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspaces-connectionalias-connectionaliasassociation.html)
     */
    public inline fun cfnConnectionAliasConnectionAliasAssociationProperty(
        block: CfnConnectionAliasConnectionAliasAssociationPropertyDsl.() -> Unit = {}
    ): CfnConnectionAlias.ConnectionAliasAssociationProperty {
        val builder = CfnConnectionAliasConnectionAliasAssociationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnConnectionAlias`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.workspaces.*;
     * CfnConnectionAliasProps cfnConnectionAliasProps = CfnConnectionAliasProps.builder()
     * .connectionString("connectionString")
     * // the properties below are optional
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-connectionalias.html)
     */
    public inline fun cfnConnectionAliasProps(
        block: CfnConnectionAliasPropsDsl.() -> Unit = {}
    ): CfnConnectionAliasProps {
        val builder = CfnConnectionAliasPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::WorkSpaces::Workspace` resource specifies a WorkSpace.
     *
     * Updates are not supported for the `BundleId` , `RootVolumeEncryptionEnabled` ,
     * `UserVolumeEncryptionEnabled` , or `VolumeEncryptionKey` properties. To update these
     * properties, you must also update a property that triggers a replacement, such as the
     * `UserName` property.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.workspaces.*;
     * CfnWorkspace cfnWorkspace = CfnWorkspace.Builder.create(this, "MyCfnWorkspace")
     * .bundleId("bundleId")
     * .directoryId("directoryId")
     * .userName("userName")
     * // the properties below are optional
     * .rootVolumeEncryptionEnabled(false)
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .userVolumeEncryptionEnabled(false)
     * .volumeEncryptionKey("volumeEncryptionKey")
     * .workspaceProperties(WorkspacePropertiesProperty.builder()
     * .computeTypeName("computeTypeName")
     * .rootVolumeSizeGib(123)
     * .runningMode("runningMode")
     * .runningModeAutoStopTimeoutInMinutes(123)
     * .userVolumeSizeGib(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html)
     */
    public inline fun cfnWorkspace(
        scope: Construct,
        id: String,
        block: CfnWorkspaceDsl.() -> Unit = {},
    ): CfnWorkspace {
        val builder = CfnWorkspaceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnWorkspace`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.workspaces.*;
     * CfnWorkspaceProps cfnWorkspaceProps = CfnWorkspaceProps.builder()
     * .bundleId("bundleId")
     * .directoryId("directoryId")
     * .userName("userName")
     * // the properties below are optional
     * .rootVolumeEncryptionEnabled(false)
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .userVolumeEncryptionEnabled(false)
     * .volumeEncryptionKey("volumeEncryptionKey")
     * .workspaceProperties(WorkspacePropertiesProperty.builder()
     * .computeTypeName("computeTypeName")
     * .rootVolumeSizeGib(123)
     * .runningMode("runningMode")
     * .runningModeAutoStopTimeoutInMinutes(123)
     * .userVolumeSizeGib(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html)
     */
    public inline fun cfnWorkspaceProps(
        block: CfnWorkspacePropsDsl.() -> Unit = {}
    ): CfnWorkspaceProps {
        val builder = CfnWorkspacePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about a WorkSpace.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.workspaces.*;
     * WorkspacePropertiesProperty workspacePropertiesProperty = WorkspacePropertiesProperty.builder()
     * .computeTypeName("computeTypeName")
     * .rootVolumeSizeGib(123)
     * .runningMode("runningMode")
     * .runningModeAutoStopTimeoutInMinutes(123)
     * .userVolumeSizeGib(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspaces-workspace-workspaceproperties.html)
     */
    public inline fun cfnWorkspaceWorkspacePropertiesProperty(
        block: CfnWorkspaceWorkspacePropertiesPropertyDsl.() -> Unit = {}
    ): CfnWorkspace.WorkspacePropertiesProperty {
        val builder = CfnWorkspaceWorkspacePropertiesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
