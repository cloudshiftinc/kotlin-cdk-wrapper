@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardNullValueFormatConfigurationPropertyDsl {
  private val cdkBuilder: CfnDashboard.NullValueFormatConfigurationProperty.Builder =
      CfnDashboard.NullValueFormatConfigurationProperty.builder()

  public fun nullString(nullString: String) {
    cdkBuilder.nullString(nullString)
  }

  public fun build(): CfnDashboard.NullValueFormatConfigurationProperty = cdkBuilder.build()
}
