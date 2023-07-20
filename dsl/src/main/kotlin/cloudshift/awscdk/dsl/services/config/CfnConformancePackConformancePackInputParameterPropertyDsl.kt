@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.config

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.config.CfnConformancePack

@CdkDslMarker
public class CfnConformancePackConformancePackInputParameterPropertyDsl {
  private val cdkBuilder: CfnConformancePack.ConformancePackInputParameterProperty.Builder =
      CfnConformancePack.ConformancePackInputParameterProperty.builder()

  public fun parameterName(parameterName: String) {
    cdkBuilder.parameterName(parameterName)
  }

  public fun parameterValue(parameterValue: String) {
    cdkBuilder.parameterValue(parameterValue)
  }

  public fun build(): CfnConformancePack.ConformancePackInputParameterProperty = cdkBuilder.build()
}
