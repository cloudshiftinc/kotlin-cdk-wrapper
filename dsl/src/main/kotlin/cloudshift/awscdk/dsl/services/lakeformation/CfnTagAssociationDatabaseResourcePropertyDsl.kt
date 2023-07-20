@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lakeformation

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lakeformation.CfnTagAssociation

@CdkDslMarker
public class CfnTagAssociationDatabaseResourcePropertyDsl {
  private val cdkBuilder: CfnTagAssociation.DatabaseResourceProperty.Builder =
      CfnTagAssociation.DatabaseResourceProperty.builder()

  public fun catalogId(catalogId: String) {
    cdkBuilder.catalogId(catalogId)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnTagAssociation.DatabaseResourceProperty = cdkBuilder.build()
}
