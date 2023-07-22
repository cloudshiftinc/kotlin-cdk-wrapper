@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lakeformation

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lakeformation.CfnTagAssociation

@CdkDslMarker
public class CfnTagAssociationDatabaseResourcePropertyDsl {
  private val cdkBuilder: CfnTagAssociation.DatabaseResourceProperty.Builder =
      CfnTagAssociation.DatabaseResourceProperty.builder()

  /**
   * @param catalogId The identifier for the Data Catalog . 
   * By default, it should be the account ID of the caller.
   */
  public fun catalogId(catalogId: String) {
    cdkBuilder.catalogId(catalogId)
  }

  /**
   * @param name The name of the database resource. 
   * Unique to the Data Catalog.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnTagAssociation.DatabaseResourceProperty = cdkBuilder.build()
}
