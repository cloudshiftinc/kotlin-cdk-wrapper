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

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.workspaces.CfnConnectionAlias
import kotlin.String

@CdkDslMarker
public class CfnConnectionAliasConnectionAliasAssociationPropertyDsl {
    private val cdkBuilder: CfnConnectionAlias.ConnectionAliasAssociationProperty.Builder =
        CfnConnectionAlias.ConnectionAliasAssociationProperty.builder()

    public fun associatedAccountId(associatedAccountId: String) {
        cdkBuilder.associatedAccountId(associatedAccountId)
    }

    public fun associationStatus(associationStatus: String) {
        cdkBuilder.associationStatus(associationStatus)
    }

    public fun connectionIdentifier(connectionIdentifier: String) {
        cdkBuilder.connectionIdentifier(connectionIdentifier)
    }

    public fun resourceId(resourceId: String) {
        cdkBuilder.resourceId(resourceId)
    }

    public fun build(): CfnConnectionAlias.ConnectionAliasAssociationProperty = cdkBuilder.build()
}
