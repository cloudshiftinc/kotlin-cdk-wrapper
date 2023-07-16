@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardSetParameterValueConfigurationPropertyDsl {
  private val cdkBuilder: CfnDashboard.SetParameterValueConfigurationProperty.Builder =
      CfnDashboard.SetParameterValueConfigurationProperty.builder()

  public fun destinationParameterName(destinationParameterName: String) {
    cdkBuilder.destinationParameterName(destinationParameterName)
  }

  public fun `value`(`value`: IResolvable) {
    cdkBuilder.`value`(`value`)
  }

  public fun `value`(`value`: CfnDashboard.DestinationParameterValueConfigurationProperty) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnDashboard.SetParameterValueConfigurationProperty = cdkBuilder.build()
}
