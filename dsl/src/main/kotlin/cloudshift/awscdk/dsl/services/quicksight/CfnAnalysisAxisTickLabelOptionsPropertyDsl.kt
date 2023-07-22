@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisAxisTickLabelOptionsPropertyDsl {
  private val cdkBuilder: CfnAnalysis.AxisTickLabelOptionsProperty.Builder =
      CfnAnalysis.AxisTickLabelOptionsProperty.builder()

  /**
   * @param labelOptions Determines whether or not the axis ticks are visible.
   */
  public fun labelOptions(labelOptions: IResolvable) {
    cdkBuilder.labelOptions(labelOptions)
  }

  /**
   * @param labelOptions Determines whether or not the axis ticks are visible.
   */
  public fun labelOptions(labelOptions: CfnAnalysis.LabelOptionsProperty) {
    cdkBuilder.labelOptions(labelOptions)
  }

  /**
   * @param rotationAngle The rotation angle of the axis tick labels.
   */
  public fun rotationAngle(rotationAngle: Number) {
    cdkBuilder.rotationAngle(rotationAngle)
  }

  public fun build(): CfnAnalysis.AxisTickLabelOptionsProperty = cdkBuilder.build()
}
