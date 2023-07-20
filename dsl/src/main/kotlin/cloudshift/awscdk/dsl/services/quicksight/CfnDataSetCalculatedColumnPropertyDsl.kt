@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDataSet

@CdkDslMarker
public class CfnDataSetCalculatedColumnPropertyDsl {
  private val cdkBuilder: CfnDataSet.CalculatedColumnProperty.Builder =
      CfnDataSet.CalculatedColumnProperty.builder()

  public fun columnId(columnId: String) {
    cdkBuilder.columnId(columnId)
  }

  public fun columnName(columnName: String) {
    cdkBuilder.columnName(columnName)
  }

  public fun expression(expression: String) {
    cdkBuilder.expression(expression)
  }

  public fun build(): CfnDataSet.CalculatedColumnProperty = cdkBuilder.build()
}
