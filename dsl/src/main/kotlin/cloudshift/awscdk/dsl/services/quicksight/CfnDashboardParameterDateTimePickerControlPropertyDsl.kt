@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardParameterDateTimePickerControlPropertyDsl {
  private val cdkBuilder: CfnDashboard.ParameterDateTimePickerControlProperty.Builder =
      CfnDashboard.ParameterDateTimePickerControlProperty.builder()

  public fun displayOptions(displayOptions: IResolvable) {
    cdkBuilder.displayOptions(displayOptions)
  }

  public
      fun displayOptions(displayOptions: CfnDashboard.DateTimePickerControlDisplayOptionsProperty) {
    cdkBuilder.displayOptions(displayOptions)
  }

  public fun parameterControlId(parameterControlId: String) {
    cdkBuilder.parameterControlId(parameterControlId)
  }

  public fun sourceParameterName(sourceParameterName: String) {
    cdkBuilder.sourceParameterName(sourceParameterName)
  }

  public fun title(title: String) {
    cdkBuilder.title(title)
  }

  public fun build(): CfnDashboard.ParameterDateTimePickerControlProperty = cdkBuilder.build()
}
