@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lambda.CfnFunction

@CdkDslMarker
public class CfnFunctionSnapStartResponsePropertyDsl {
  private val cdkBuilder: CfnFunction.SnapStartResponseProperty.Builder =
      CfnFunction.SnapStartResponseProperty.builder()

  public fun applyOn(applyOn: String) {
    cdkBuilder.applyOn(applyOn)
  }

  public fun optimizationStatus(optimizationStatus: String) {
    cdkBuilder.optimizationStatus(optimizationStatus)
  }

  public fun build(): CfnFunction.SnapStartResponseProperty = cdkBuilder.build()
}
