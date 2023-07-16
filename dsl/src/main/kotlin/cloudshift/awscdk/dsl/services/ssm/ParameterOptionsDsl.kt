@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ssm

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.ssm.ParameterOptions
import software.amazon.awscdk.services.ssm.ParameterTier

@CdkDslMarker
public class ParameterOptionsDsl {
  private val cdkBuilder: ParameterOptions.Builder = ParameterOptions.builder()

  public fun allowedPattern(allowedPattern: String) {
    cdkBuilder.allowedPattern(allowedPattern)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun parameterName(parameterName: String) {
    cdkBuilder.parameterName(parameterName)
  }

  public fun simpleName(simpleName: Boolean) {
    cdkBuilder.simpleName(simpleName)
  }

  public fun tier(tier: ParameterTier) {
    cdkBuilder.tier(tier)
  }

  public fun build(): ParameterOptions = cdkBuilder.build()
}
