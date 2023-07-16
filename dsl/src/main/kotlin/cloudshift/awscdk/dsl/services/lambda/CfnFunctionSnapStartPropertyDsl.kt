@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lambda.CfnFunction

@CdkDslMarker
public class CfnFunctionSnapStartPropertyDsl {
  private val cdkBuilder: CfnFunction.SnapStartProperty.Builder =
      CfnFunction.SnapStartProperty.builder()

  public fun applyOn(applyOn: String) {
    cdkBuilder.applyOn(applyOn)
  }

  public fun build(): CfnFunction.SnapStartProperty = cdkBuilder.build()
}
