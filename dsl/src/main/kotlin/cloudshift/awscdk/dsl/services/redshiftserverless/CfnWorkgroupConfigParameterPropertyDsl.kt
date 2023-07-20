@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.redshiftserverless

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup

@CdkDslMarker
public class CfnWorkgroupConfigParameterPropertyDsl {
  private val cdkBuilder: CfnWorkgroup.ConfigParameterProperty.Builder =
      CfnWorkgroup.ConfigParameterProperty.builder()

  public fun parameterKey(parameterKey: String) {
    cdkBuilder.parameterKey(parameterKey)
  }

  public fun parameterValue(parameterValue: String) {
    cdkBuilder.parameterValue(parameterValue)
  }

  public fun build(): CfnWorkgroup.ConfigParameterProperty = cdkBuilder.build()
}
