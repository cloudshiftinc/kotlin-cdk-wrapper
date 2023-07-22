@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.iotanalytics.CfnPipeline

@CdkDslMarker
public class CfnPipelineLambdaPropertyDsl {
  private val cdkBuilder: CfnPipeline.LambdaProperty.Builder = CfnPipeline.LambdaProperty.builder()

  /**
   * @param batchSize The number of messages passed to the Lambda function for processing. 
   * The AWS Lambda function must be able to process all of these messages within five minutes,
   * which is the maximum timeout duration for Lambda functions.
   */
  public fun batchSize(batchSize: Number) {
    cdkBuilder.batchSize(batchSize)
  }

  /**
   * @param lambdaName The name of the Lambda function that is run on the message. 
   */
  public fun lambdaName(lambdaName: String) {
    cdkBuilder.lambdaName(lambdaName)
  }

  /**
   * @param name The name of the 'lambda' activity. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param next The next activity in the pipeline.
   */
  public fun next(next: String) {
    cdkBuilder.next(next)
  }

  public fun build(): CfnPipeline.LambdaProperty = cdkBuilder.build()
}
