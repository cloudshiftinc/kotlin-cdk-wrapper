@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardReferenceLineValueLabelConfigurationPropertyDsl {
  private val cdkBuilder: CfnDashboard.ReferenceLineValueLabelConfigurationProperty.Builder =
      CfnDashboard.ReferenceLineValueLabelConfigurationProperty.builder()

  public fun formatConfiguration(formatConfiguration: IResolvable) {
    cdkBuilder.formatConfiguration(formatConfiguration)
  }

  public
      fun formatConfiguration(formatConfiguration: CfnDashboard.NumericFormatConfigurationProperty) {
    cdkBuilder.formatConfiguration(formatConfiguration)
  }

  public fun relativePosition(relativePosition: String) {
    cdkBuilder.relativePosition(relativePosition)
  }

  public fun build(): CfnDashboard.ReferenceLineValueLabelConfigurationProperty = cdkBuilder.build()
}
