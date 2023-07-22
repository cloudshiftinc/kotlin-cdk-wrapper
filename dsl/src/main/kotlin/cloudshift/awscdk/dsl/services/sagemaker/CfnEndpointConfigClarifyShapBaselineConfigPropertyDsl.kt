@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnEndpointConfig

@CdkDslMarker
public class CfnEndpointConfigClarifyShapBaselineConfigPropertyDsl {
  private val cdkBuilder: CfnEndpointConfig.ClarifyShapBaselineConfigProperty.Builder =
      CfnEndpointConfig.ClarifyShapBaselineConfigProperty.builder()

  /**
   * @param mimeType the value to be set.
   */
  public fun mimeType(mimeType: String) {
    cdkBuilder.mimeType(mimeType)
  }

  /**
   * @param shapBaseline the value to be set.
   */
  public fun shapBaseline(shapBaseline: String) {
    cdkBuilder.shapBaseline(shapBaseline)
  }

  /**
   * @param shapBaselineUri the value to be set.
   */
  public fun shapBaselineUri(shapBaselineUri: String) {
    cdkBuilder.shapBaselineUri(shapBaselineUri)
  }

  public fun build(): CfnEndpointConfig.ClarifyShapBaselineConfigProperty = cdkBuilder.build()
}
