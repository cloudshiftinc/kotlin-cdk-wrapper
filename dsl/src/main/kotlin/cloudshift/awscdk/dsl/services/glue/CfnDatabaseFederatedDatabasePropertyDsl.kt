@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.glue.CfnDatabase

@CdkDslMarker
public class CfnDatabaseFederatedDatabasePropertyDsl {
  private val cdkBuilder: CfnDatabase.FederatedDatabaseProperty.Builder =
      CfnDatabase.FederatedDatabaseProperty.builder()

  /**
   * @param connectionName The name of the connection to the external metastore.
   */
  public fun connectionName(connectionName: String) {
    cdkBuilder.connectionName(connectionName)
  }

  /**
   * @param identifier A unique identifier for the federated database.
   */
  public fun identifier(identifier: String) {
    cdkBuilder.identifier(identifier)
  }

  public fun build(): CfnDatabase.FederatedDatabaseProperty = cdkBuilder.build()
}
