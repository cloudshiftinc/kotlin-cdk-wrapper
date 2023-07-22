@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDataSet

@CdkDslMarker
public class CfnDataSetColumnDescriptionPropertyDsl {
  private val cdkBuilder: CfnDataSet.ColumnDescriptionProperty.Builder =
      CfnDataSet.ColumnDescriptionProperty.builder()

  /**
   * @param text The text of a description for a column.
   */
  public fun text(text: String) {
    cdkBuilder.text(text)
  }

  public fun build(): CfnDataSet.ColumnDescriptionProperty = cdkBuilder.build()
}
