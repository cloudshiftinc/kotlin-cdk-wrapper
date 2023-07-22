@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardCalculatedFieldPropertyDsl {
  private val cdkBuilder: CfnDashboard.CalculatedFieldProperty.Builder =
      CfnDashboard.CalculatedFieldProperty.builder()

  /**
   * @param dataSetIdentifier The data set that is used in this calculated field. 
   */
  public fun dataSetIdentifier(dataSetIdentifier: String) {
    cdkBuilder.dataSetIdentifier(dataSetIdentifier)
  }

  /**
   * @param expression The expression of the calculated field. 
   */
  public fun expression(expression: String) {
    cdkBuilder.expression(expression)
  }

  /**
   * @param name The name of the calculated field. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnDashboard.CalculatedFieldProperty = cdkBuilder.build()
}
