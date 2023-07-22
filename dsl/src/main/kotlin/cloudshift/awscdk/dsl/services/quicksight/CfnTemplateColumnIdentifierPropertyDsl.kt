@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateColumnIdentifierPropertyDsl {
  private val cdkBuilder: CfnTemplate.ColumnIdentifierProperty.Builder =
      CfnTemplate.ColumnIdentifierProperty.builder()

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

  public fun build(): CfnTemplate.ColumnIdentifierProperty = cdkBuilder.build()
}
