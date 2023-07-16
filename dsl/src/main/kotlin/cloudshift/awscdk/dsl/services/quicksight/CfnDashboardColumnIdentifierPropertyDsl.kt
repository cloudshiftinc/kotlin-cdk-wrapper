@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardColumnIdentifierPropertyDsl {
  private val cdkBuilder: CfnDashboard.ColumnIdentifierProperty.Builder =
      CfnDashboard.ColumnIdentifierProperty.builder()

  public fun columnName(columnName: String) {
    cdkBuilder.columnName(columnName)
  }

  public fun dataSetIdentifier(dataSetIdentifier: String) {
    cdkBuilder.dataSetIdentifier(dataSetIdentifier)
  }

  public fun build(): CfnDashboard.ColumnIdentifierProperty = cdkBuilder.build()
}
