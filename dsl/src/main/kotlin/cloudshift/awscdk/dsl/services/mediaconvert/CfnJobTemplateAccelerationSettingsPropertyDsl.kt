@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediaconvert

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.mediaconvert.CfnJobTemplate

@CdkDslMarker
public class CfnJobTemplateAccelerationSettingsPropertyDsl {
  private val cdkBuilder: CfnJobTemplate.AccelerationSettingsProperty.Builder =
      CfnJobTemplate.AccelerationSettingsProperty.builder()

  public fun mode(mode: String) {
    cdkBuilder.mode(mode)
  }

  public fun build(): CfnJobTemplate.AccelerationSettingsProperty = cdkBuilder.build()
}
