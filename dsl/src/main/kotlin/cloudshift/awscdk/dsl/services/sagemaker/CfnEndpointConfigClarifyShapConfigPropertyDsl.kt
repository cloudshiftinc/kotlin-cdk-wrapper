@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnEndpointConfig

@CdkDslMarker
public class CfnEndpointConfigClarifyShapConfigPropertyDsl {
  private val cdkBuilder: CfnEndpointConfig.ClarifyShapConfigProperty.Builder =
      CfnEndpointConfig.ClarifyShapConfigProperty.builder()

  public fun numberOfSamples(numberOfSamples: Number) {
    cdkBuilder.numberOfSamples(numberOfSamples)
  }

  public fun seed(seed: Number) {
    cdkBuilder.seed(seed)
  }

  public fun shapBaselineConfig(shapBaselineConfig: IResolvable) {
    cdkBuilder.shapBaselineConfig(shapBaselineConfig)
  }

  public
      fun shapBaselineConfig(shapBaselineConfig: CfnEndpointConfig.ClarifyShapBaselineConfigProperty) {
    cdkBuilder.shapBaselineConfig(shapBaselineConfig)
  }

  public fun textConfig(textConfig: IResolvable) {
    cdkBuilder.textConfig(textConfig)
  }

  public fun textConfig(textConfig: CfnEndpointConfig.ClarifyTextConfigProperty) {
    cdkBuilder.textConfig(textConfig)
  }

  public fun useLogit(useLogit: Boolean) {
    cdkBuilder.useLogit(useLogit)
  }

  public fun useLogit(useLogit: IResolvable) {
    cdkBuilder.useLogit(useLogit)
  }

  public fun build(): CfnEndpointConfig.ClarifyShapConfigProperty = cdkBuilder.build()
}
