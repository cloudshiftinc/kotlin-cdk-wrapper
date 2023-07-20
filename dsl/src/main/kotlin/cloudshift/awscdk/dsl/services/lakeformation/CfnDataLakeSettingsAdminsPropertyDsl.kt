@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lakeformation

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.lakeformation.CfnDataLakeSettings

@CdkDslMarker
public class CfnDataLakeSettingsAdminsPropertyDsl {
  private val cdkBuilder: CfnDataLakeSettings.AdminsProperty.Builder =
      CfnDataLakeSettings.AdminsProperty.builder()

  public fun build(): CfnDataLakeSettings.AdminsProperty = cdkBuilder.build()
}
