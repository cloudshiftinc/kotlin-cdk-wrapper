@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardRelativeDateTimeControlDisplayOptionsPropertyDsl {
  private val cdkBuilder: CfnDashboard.RelativeDateTimeControlDisplayOptionsProperty.Builder =
      CfnDashboard.RelativeDateTimeControlDisplayOptionsProperty.builder()

  public fun dateTimeFormat(dateTimeFormat: String) {
    cdkBuilder.dateTimeFormat(dateTimeFormat)
  }

  public fun titleOptions(titleOptions: IResolvable) {
    cdkBuilder.titleOptions(titleOptions)
  }

  public fun titleOptions(titleOptions: CfnDashboard.LabelOptionsProperty) {
    cdkBuilder.titleOptions(titleOptions)
  }

  public fun build(): CfnDashboard.RelativeDateTimeControlDisplayOptionsProperty =
      cdkBuilder.build()
}
