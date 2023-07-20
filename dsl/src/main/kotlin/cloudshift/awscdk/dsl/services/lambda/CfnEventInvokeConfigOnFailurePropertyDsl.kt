@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lambda.CfnEventInvokeConfig

@CdkDslMarker
public class CfnEventInvokeConfigOnFailurePropertyDsl {
  private val cdkBuilder: CfnEventInvokeConfig.OnFailureProperty.Builder =
      CfnEventInvokeConfig.OnFailureProperty.builder()

  public fun destination(destination: String) {
    cdkBuilder.destination(destination)
  }

  public fun build(): CfnEventInvokeConfig.OnFailureProperty = cdkBuilder.build()
}
