@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardLabelOptionsPropertyDsl {
  private val cdkBuilder: CfnDashboard.LabelOptionsProperty.Builder =
      CfnDashboard.LabelOptionsProperty.builder()

  public fun customLabel(customLabel: String) {
    cdkBuilder.customLabel(customLabel)
  }

  public fun fontConfiguration(fontConfiguration: IResolvable) {
    cdkBuilder.fontConfiguration(fontConfiguration)
  }

  public fun fontConfiguration(fontConfiguration: CfnDashboard.FontConfigurationProperty) {
    cdkBuilder.fontConfiguration(fontConfiguration)
  }

  public fun visibility(visibility: String) {
    cdkBuilder.visibility(visibility)
  }

  public fun build(): CfnDashboard.LabelOptionsProperty = cdkBuilder.build()
}
