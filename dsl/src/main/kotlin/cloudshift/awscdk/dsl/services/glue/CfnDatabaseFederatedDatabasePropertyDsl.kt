@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.glue.CfnDatabase

/**
 * A `FederatedDatabase` structure that references an entity outside the AWS Glue Data Catalog .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.glue.*;
 * FederatedDatabaseProperty federatedDatabaseProperty = FederatedDatabaseProperty.builder()
 * .connectionName("connectionName")
 * .identifier("identifier")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-database-federateddatabase.html)
 */
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
