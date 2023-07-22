@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardReferenceLineStaticDataConfigurationPropertyDsl {
  private val cdkBuilder: CfnDashboard.ReferenceLineStaticDataConfigurationProperty.Builder =
      CfnDashboard.ReferenceLineStaticDataConfigurationProperty.builder()

  /**
   * @param value The double input of the static data. 
   */
  public fun `value`(`value`: Number) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnDashboard.ReferenceLineStaticDataConfigurationProperty = cdkBuilder.build()
}
