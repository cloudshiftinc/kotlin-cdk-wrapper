@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnEndpointConfig

@CdkDslMarker
public class CfnEndpointConfigCaptureOptionPropertyDsl {
  private val cdkBuilder: CfnEndpointConfig.CaptureOptionProperty.Builder =
      CfnEndpointConfig.CaptureOptionProperty.builder()

  public fun captureMode(captureMode: String) {
    cdkBuilder.captureMode(captureMode)
  }

  public fun build(): CfnEndpointConfig.CaptureOptionProperty = cdkBuilder.build()
}
