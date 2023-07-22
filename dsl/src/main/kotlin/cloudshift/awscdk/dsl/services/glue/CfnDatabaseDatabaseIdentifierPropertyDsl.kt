@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.glue.CfnDatabase

@CdkDslMarker
public class CfnDatabaseDatabaseIdentifierPropertyDsl {
  private val cdkBuilder: CfnDatabase.DatabaseIdentifierProperty.Builder =
      CfnDatabase.DatabaseIdentifierProperty.builder()

  /**
   * @param catalogId The ID of the Data Catalog in which the database resides.
   */
  public fun catalogId(catalogId: String) {
    cdkBuilder.catalogId(catalogId)
  }

  /**
   * @param databaseName The name of the catalog database.
   */
  public fun databaseName(databaseName: String) {
    cdkBuilder.databaseName(databaseName)
  }

  public fun build(): CfnDatabase.DatabaseIdentifierProperty = cdkBuilder.build()
}
