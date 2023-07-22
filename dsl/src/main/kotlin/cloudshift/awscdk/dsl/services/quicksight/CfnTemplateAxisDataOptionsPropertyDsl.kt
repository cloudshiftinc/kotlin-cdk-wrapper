@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateAxisDataOptionsPropertyDsl {
  private val cdkBuilder: CfnTemplate.AxisDataOptionsProperty.Builder =
      CfnTemplate.AxisDataOptionsProperty.builder()

  /**
   * @param dateAxisOptions The options for an axis with a date field.
   */
  public fun dateAxisOptions(dateAxisOptions: IResolvable) {
    cdkBuilder.dateAxisOptions(dateAxisOptions)
  }

  /**
   * @param dateAxisOptions The options for an axis with a date field.
   */
  public fun dateAxisOptions(dateAxisOptions: CfnTemplate.DateAxisOptionsProperty) {
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
  public fun numericAxisOptions(numericAxisOptions: CfnTemplate.NumericAxisOptionsProperty) {
    cdkBuilder.numericAxisOptions(numericAxisOptions)
  }

  public fun build(): CfnTemplate.AxisDataOptionsProperty = cdkBuilder.build()
}
