@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnDatabase
import software.amazon.awscdk.services.glue.CfnDatabaseProps

@CdkDslMarker
public class CfnDatabasePropsDsl {
  private val cdkBuilder: CfnDatabaseProps.Builder = CfnDatabaseProps.builder()

  public fun catalogId(catalogId: String) {
    cdkBuilder.catalogId(catalogId)
  }

  public fun databaseInput(databaseInput: IResolvable) {
    cdkBuilder.databaseInput(databaseInput)
  }

  public fun databaseInput(databaseInput: CfnDatabase.DatabaseInputProperty) {
    cdkBuilder.databaseInput(databaseInput)
  }

  public fun build(): CfnDatabaseProps = cdkBuilder.build()
}
