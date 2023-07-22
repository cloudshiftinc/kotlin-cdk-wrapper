@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalytics.CfnApplication

@CdkDslMarker
public class CfnApplicationInputProcessingConfigurationPropertyDsl {
  private val cdkBuilder: CfnApplication.InputProcessingConfigurationProperty.Builder =
      CfnApplication.InputProcessingConfigurationProperty.builder()

  /**
   * @param inputLambdaProcessor The
   * [InputLambdaProcessor](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputlambdaprocessor.html)
   * that is used to preprocess the records in the stream before being processed by your application
   * code.
   */
  public fun inputLambdaProcessor(inputLambdaProcessor: IResolvable) {
    cdkBuilder.inputLambdaProcessor(inputLambdaProcessor)
  }

  /**
   * @param inputLambdaProcessor The
   * [InputLambdaProcessor](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputlambdaprocessor.html)
   * that is used to preprocess the records in the stream before being processed by your application
   * code.
   */
  public
      fun inputLambdaProcessor(inputLambdaProcessor: CfnApplication.InputLambdaProcessorProperty) {
    cdkBuilder.inputLambdaProcessor(inputLambdaProcessor)
  }

  public fun build(): CfnApplication.InputProcessingConfigurationProperty = cdkBuilder.build()
}
