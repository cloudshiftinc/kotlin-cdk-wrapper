@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateAxisDataOptionsPropertyDsl {
  private val cdkBuilder: CfnTemplate.AxisDataOptionsProperty.Builder =
      CfnTemplate.AxisDataOptionsProperty.builder()

  public fun dateAxisOptions(dateAxisOptions: IResolvable) {
    cdkBuilder.dateAxisOptions(dateAxisOptions)
  }

  public fun dateAxisOptions(dateAxisOptions: CfnTemplate.DateAxisOptionsProperty) {
    cdkBuilder.dateAxisOptions(dateAxisOptions)
  }

  public fun numericAxisOptions(numericAxisOptions: IResolvable) {
    cdkBuilder.numericAxisOptions(numericAxisOptions)
  }

  public fun numericAxisOptions(numericAxisOptions: CfnTemplate.NumericAxisOptionsProperty) {
    cdkBuilder.numericAxisOptions(numericAxisOptions)
  }

  public fun build(): CfnTemplate.AxisDataOptionsProperty = cdkBuilder.build()
}
