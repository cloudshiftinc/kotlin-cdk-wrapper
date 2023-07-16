@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnTable
import software.constructs.Construct

@CdkDslMarker
public class CfnTableDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnTable.Builder = CfnTable.Builder.create(scope, id)

  public fun catalogId(catalogId: String) {
    cdkBuilder.catalogId(catalogId)
  }

  public fun databaseName(databaseName: String) {
    cdkBuilder.databaseName(databaseName)
  }

  public fun tableInput(tableInput: IResolvable) {
    cdkBuilder.tableInput(tableInput)
  }

  public fun tableInput(tableInput: CfnTable.TableInputProperty) {
    cdkBuilder.tableInput(tableInput)
  }

  public fun build(): CfnTable = cdkBuilder.build()
}
