@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.workspaces

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.workspaces.CfnConnectionAlias

@CdkDslMarker
public class CfnConnectionAliasConnectionAliasAssociationPropertyDsl {
  private val cdkBuilder: CfnConnectionAlias.ConnectionAliasAssociationProperty.Builder =
      CfnConnectionAlias.ConnectionAliasAssociationProperty.builder()

  /**
   * @param associatedAccountId the value to be set.
   */
  public fun associatedAccountId(associatedAccountId: String) {
    cdkBuilder.associatedAccountId(associatedAccountId)
  }

  /**
   * @param associationStatus the value to be set.
   */
  public fun associationStatus(associationStatus: String) {
    cdkBuilder.associationStatus(associationStatus)
  }

  /**
   * @param connectionIdentifier the value to be set.
   */
  public fun connectionIdentifier(connectionIdentifier: String) {
    cdkBuilder.connectionIdentifier(connectionIdentifier)
  }

  /**
   * @param resourceId the value to be set.
   */
  public fun resourceId(resourceId: String) {
    cdkBuilder.resourceId(resourceId)
  }

  public fun build(): CfnConnectionAlias.ConnectionAliasAssociationProperty = cdkBuilder.build()
}
