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

    /** @param associatedAccountId the value to be set. */
    public fun associatedAccountId(associatedAccountId: String) {
        cdkBuilder.associatedAccountId(associatedAccountId)
    }

    /** @param associationStatus the value to be set. */
    public fun associationStatus(associationStatus: String) {
        cdkBuilder.associationStatus(associationStatus)
    }

    /** @param connectionIdentifier the value to be set. */
    public fun connectionIdentifier(connectionIdentifier: String) {
        cdkBuilder.connectionIdentifier(connectionIdentifier)
    }

    /** @param resourceId the value to be set. */
    public fun resourceId(resourceId: String) {
        cdkBuilder.resourceId(resourceId)
    }

    public fun build(): CfnConnectionAlias.ConnectionAliasAssociationProperty = cdkBuilder.build()
}
