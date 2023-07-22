@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2

@CdkDslMarker
public class CfnApplicationV2InputProcessingConfigurationPropertyDsl {
  private val cdkBuilder: CfnApplicationV2.InputProcessingConfigurationProperty.Builder =
      CfnApplicationV2.InputProcessingConfigurationProperty.builder()

  /**
   * @param inputLambdaProcessor The
   * [InputLambdaProcessor](https://docs.aws.amazon.com/kinesisanalytics/latest/apiv2/API_InputLambdaProcessor.html)
   * that is used to preprocess the records in the stream before being processed by your application
   * code.
   */
  public fun inputLambdaProcessor(inputLambdaProcessor: IResolvable) {
    cdkBuilder.inputLambdaProcessor(inputLambdaProcessor)
  }

  /**
   * @param inputLambdaProcessor The
   * [InputLambdaProcessor](https://docs.aws.amazon.com/kinesisanalytics/latest/apiv2/API_InputLambdaProcessor.html)
   * that is used to preprocess the records in the stream before being processed by your application
   * code.
   */
  public
      fun inputLambdaProcessor(inputLambdaProcessor: CfnApplicationV2.InputLambdaProcessorProperty) {
    cdkBuilder.inputLambdaProcessor(inputLambdaProcessor)
  }

  public fun build(): CfnApplicationV2.InputProcessingConfigurationProperty = cdkBuilder.build()
}
