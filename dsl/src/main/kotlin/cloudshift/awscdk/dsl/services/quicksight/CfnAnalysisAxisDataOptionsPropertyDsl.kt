@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisAxisDataOptionsPropertyDsl {
  private val cdkBuilder: CfnAnalysis.AxisDataOptionsProperty.Builder =
      CfnAnalysis.AxisDataOptionsProperty.builder()

  /**
   * @param dateAxisOptions The options for an axis with a date field.
   */
  public fun dateAxisOptions(dateAxisOptions: IResolvable) {
    cdkBuilder.dateAxisOptions(dateAxisOptions)
  }

  /**
   * @param dateAxisOptions The options for an axis with a date field.
   */
  public fun dateAxisOptions(dateAxisOptions: CfnAnalysis.DateAxisOptionsProperty) {
    cdkBuilder.dateAxisOptions(dateAxisOptions)
  }

  /**
   * @param numericAxisOptions The options for an axis with a numeric field.
   */
  public fun numericAxisOptions(numericAxisOptions: IResolvable) {
    cdkBuilder.numericAxisOptions(numericAxisOptions)
  }

  /**
   * @param numericAxisOptions The options for an axis with a numeric field.
   */
  public fun numericAxisOptions(numericAxisOptions: CfnAnalysis.NumericAxisOptionsProperty) {
    cdkBuilder.numericAxisOptions(numericAxisOptions)
  }

  public fun build(): CfnAnalysis.AxisDataOptionsProperty = cdkBuilder.build()
}
