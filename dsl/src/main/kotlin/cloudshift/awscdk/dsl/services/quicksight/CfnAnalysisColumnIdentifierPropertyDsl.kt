@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisColumnIdentifierPropertyDsl {
  private val cdkBuilder: CfnAnalysis.ColumnIdentifierProperty.Builder =
      CfnAnalysis.ColumnIdentifierProperty.builder()

  public fun columnName(columnName: String) {
    cdkBuilder.columnName(columnName)
  }

  public fun dataSetIdentifier(dataSetIdentifier: String) {
    cdkBuilder.dataSetIdentifier(dataSetIdentifier)
  }

  public fun build(): CfnAnalysis.ColumnIdentifierProperty = cdkBuilder.build()
}
