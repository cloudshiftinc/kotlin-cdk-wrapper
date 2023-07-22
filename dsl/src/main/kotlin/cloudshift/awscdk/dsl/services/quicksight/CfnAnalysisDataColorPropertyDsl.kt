@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisDataColorPropertyDsl {
  private val cdkBuilder: CfnAnalysis.DataColorProperty.Builder =
      CfnAnalysis.DataColorProperty.builder()

  /**
   * @param color The color that is applied to the data value.
   */
  public fun color(color: String) {
    cdkBuilder.color(color)
  }

  /**
   * @param dataValue The data value that the color is applied to.
   */
  public fun dataValue(dataValue: Number) {
    cdkBuilder.dataValue(dataValue)
  }

  public fun build(): CfnAnalysis.DataColorProperty = cdkBuilder.build()
}
