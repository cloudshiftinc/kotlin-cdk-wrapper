@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lambda.CfnFunction

@CdkDslMarker
public class CfnFunctionTracingConfigPropertyDsl {
  private val cdkBuilder: CfnFunction.TracingConfigProperty.Builder =
      CfnFunction.TracingConfigProperty.builder()

  /**
   * @param mode The tracing mode.
   */
  public fun mode(mode: String) {
    cdkBuilder.mode(mode)
  }

  public fun build(): CfnFunction.TracingConfigProperty = cdkBuilder.build()
}
