@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.redshift

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.redshift.CfnClusterParameterGroup

@CdkDslMarker
public class CfnClusterParameterGroupParameterPropertyDsl {
  private val cdkBuilder: CfnClusterParameterGroup.ParameterProperty.Builder =
      CfnClusterParameterGroup.ParameterProperty.builder()

  public fun parameterName(parameterName: String) {
    cdkBuilder.parameterName(parameterName)
  }

  public fun parameterValue(parameterValue: String) {
    cdkBuilder.parameterValue(parameterValue)
  }

  public fun build(): CfnClusterParameterGroup.ParameterProperty = cdkBuilder.build()
}
