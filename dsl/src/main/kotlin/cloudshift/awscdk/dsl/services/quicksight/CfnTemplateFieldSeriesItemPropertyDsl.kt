@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateFieldSeriesItemPropertyDsl {
  private val cdkBuilder: CfnTemplate.FieldSeriesItemProperty.Builder =
      CfnTemplate.FieldSeriesItemProperty.builder()

  public fun axisBinding(axisBinding: String) {
    cdkBuilder.axisBinding(axisBinding)
  }

  public fun fieldId(fieldId: String) {
    cdkBuilder.fieldId(fieldId)
  }

  public fun settings(settings: IResolvable) {
    cdkBuilder.settings(settings)
  }

  public fun settings(settings: CfnTemplate.LineChartSeriesSettingsProperty) {
    cdkBuilder.settings(settings)
  }

  public fun build(): CfnTemplate.FieldSeriesItemProperty = cdkBuilder.build()
}
