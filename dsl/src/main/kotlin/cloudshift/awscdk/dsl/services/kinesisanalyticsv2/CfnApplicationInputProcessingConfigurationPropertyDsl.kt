@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalyticsv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication

@CdkDslMarker
public class CfnApplicationInputProcessingConfigurationPropertyDsl {
  private val cdkBuilder: CfnApplication.InputProcessingConfigurationProperty.Builder =
      CfnApplication.InputProcessingConfigurationProperty.builder()

  public fun inputLambdaProcessor(inputLambdaProcessor: IResolvable) {
    cdkBuilder.inputLambdaProcessor(inputLambdaProcessor)
  }

  public
      fun inputLambdaProcessor(inputLambdaProcessor: CfnApplication.InputLambdaProcessorProperty) {
    cdkBuilder.inputLambdaProcessor(inputLambdaProcessor)
  }

  public fun build(): CfnApplication.InputProcessingConfigurationProperty = cdkBuilder.build()
}
