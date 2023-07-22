@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.config

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.config.CfnOrganizationConformancePack

@CdkDslMarker
public class CfnOrganizationConformancePackConformancePackInputParameterPropertyDsl {
  private val cdkBuilder:
      CfnOrganizationConformancePack.ConformancePackInputParameterProperty.Builder =
      CfnOrganizationConformancePack.ConformancePackInputParameterProperty.builder()

  /**
   * @param parameterName One part of a key-value pair. 
   */
  public fun parameterName(parameterName: String) {
    cdkBuilder.parameterName(parameterName)
  }

  /**
   * @param parameterValue One part of a key-value pair. 
   */
  public fun parameterValue(parameterValue: String) {
    cdkBuilder.parameterValue(parameterValue)
  }

  public fun build(): CfnOrganizationConformancePack.ConformancePackInputParameterProperty =
      cdkBuilder.build()
}
