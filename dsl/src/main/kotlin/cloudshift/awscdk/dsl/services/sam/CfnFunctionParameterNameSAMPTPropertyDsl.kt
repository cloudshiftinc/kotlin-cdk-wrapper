@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sam.CfnFunction

@CdkDslMarker
public class CfnFunctionParameterNameSAMPTPropertyDsl {
  private val cdkBuilder: CfnFunction.ParameterNameSAMPTProperty.Builder =
      CfnFunction.ParameterNameSAMPTProperty.builder()

  public fun parameterName(parameterName: String) {
    cdkBuilder.parameterName(parameterName)
  }

  public fun build(): CfnFunction.ParameterNameSAMPTProperty = cdkBuilder.build()
}
