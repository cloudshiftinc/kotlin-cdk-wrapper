@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cassandra

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cassandra.CfnTable

@CdkDslMarker
public class CfnTableColumnPropertyDsl {
  private val cdkBuilder: CfnTable.ColumnProperty.Builder = CfnTable.ColumnProperty.builder()

  public fun columnName(columnName: String) {
    cdkBuilder.columnName(columnName)
  }

  public fun columnType(columnType: String) {
    cdkBuilder.columnType(columnType)
  }

  public fun build(): CfnTable.ColumnProperty = cdkBuilder.build()
}
