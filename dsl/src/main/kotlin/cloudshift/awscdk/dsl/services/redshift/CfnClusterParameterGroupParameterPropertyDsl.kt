@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.redshift

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.redshift.CfnClusterParameterGroup

@CdkDslMarker
public class CfnClusterParameterGroupParameterPropertyDsl {
  private val cdkBuilder: CfnClusterParameterGroup.ParameterProperty.Builder =
      CfnClusterParameterGroup.ParameterProperty.builder()

  /**
   * @param parameterName The name of the parameter. 
   */
  public fun parameterName(parameterName: String) {
    cdkBuilder.parameterName(parameterName)
  }

  /**
   * @param parameterValue The value of the parameter. 
   * If `ParameterName` is `wlm_json_configuration` , then the maximum size of `ParameterValue` is
   * 8000 characters.
   */
  public fun parameterValue(parameterValue: String) {
    cdkBuilder.parameterValue(parameterValue)
  }

  public fun build(): CfnClusterParameterGroup.ParameterProperty = cdkBuilder.build()
}
