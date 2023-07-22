@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisColumnIdentifierPropertyDsl {
  private val cdkBuilder: CfnAnalysis.ColumnIdentifierProperty.Builder =
      CfnAnalysis.ColumnIdentifierProperty.builder()

  /**
   * @param columnName The name of the column. 
   */
  public fun columnName(columnName: String) {
    cdkBuilder.columnName(columnName)
  }

  /**
   * @param dataSetIdentifier The data set that the column belongs to. 
   */
  public fun dataSetIdentifier(dataSetIdentifier: String) {
    cdkBuilder.dataSetIdentifier(dataSetIdentifier)
  }

  public fun build(): CfnAnalysis.ColumnIdentifierProperty = cdkBuilder.build()
}
