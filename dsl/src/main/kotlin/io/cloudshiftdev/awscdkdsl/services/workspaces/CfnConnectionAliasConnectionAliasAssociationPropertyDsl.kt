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

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.workspaces.CfnConnectionAlias

/**
 * Describes a connection alias association that is used for cross-Region redirection.
 *
 * For more information, see
 * [Cross-Region Redirection for Amazon WorkSpaces](https://docs.aws.amazon.com/workspaces/latest/adminguide/cross-region-redirection.html)
 * .
 *
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
@CdkDslMarker
public class CfnConnectionAliasConnectionAliasAssociationPropertyDsl {
    private val cdkBuilder: CfnConnectionAlias.ConnectionAliasAssociationProperty.Builder =
        CfnConnectionAlias.ConnectionAliasAssociationProperty.builder()

    /**
     * @param associatedAccountId The identifier of the AWS account that associated the connection
     *   alias with a directory.
     */
    public fun associatedAccountId(associatedAccountId: String) {
        cdkBuilder.associatedAccountId(associatedAccountId)
    }

    /** @param associationStatus The association status of the connection alias. */
    public fun associationStatus(associationStatus: String) {
        cdkBuilder.associationStatus(associationStatus)
    }

    /**
     * @param connectionIdentifier The identifier of the connection alias association. You use the
     *   connection identifier in the DNS TXT record when you're configuring your DNS routing
     *   policies.
     */
    public fun connectionIdentifier(connectionIdentifier: String) {
        cdkBuilder.connectionIdentifier(connectionIdentifier)
    }

    /** @param resourceId The identifier of the directory associated with a connection alias. */
    public fun resourceId(resourceId: String) {
        cdkBuilder.resourceId(resourceId)
    }

    public fun build(): CfnConnectionAlias.ConnectionAliasAssociationProperty = cdkBuilder.build()
}
