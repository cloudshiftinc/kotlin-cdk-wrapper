@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lambda.CfnEventInvokeConfig

@CdkDslMarker
public class CfnEventInvokeConfigOnSuccessPropertyDsl {
  private val cdkBuilder: CfnEventInvokeConfig.OnSuccessProperty.Builder =
      CfnEventInvokeConfig.OnSuccessProperty.builder()

  public fun destination(destination: String) {
    cdkBuilder.destination(destination)
  }

  public fun build(): CfnEventInvokeConfig.OnSuccessProperty = cdkBuilder.build()
}
