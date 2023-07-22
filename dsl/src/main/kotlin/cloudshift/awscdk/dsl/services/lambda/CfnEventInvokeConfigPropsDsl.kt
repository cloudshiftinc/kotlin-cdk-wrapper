@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lambda.CfnEventInvokeConfig
import software.amazon.awscdk.services.lambda.CfnEventInvokeConfigProps

@CdkDslMarker
public class CfnEventInvokeConfigPropsDsl {
  private val cdkBuilder: CfnEventInvokeConfigProps.Builder = CfnEventInvokeConfigProps.builder()

  /**
   * @param destinationConfig A destination for events after they have been sent to a function for
   * processing.
   * **Destinations** - *Function* - The Amazon Resource Name (ARN) of a Lambda function.
   *
   * * *Queue* - The ARN of a standard SQS queue.
   * * *Topic* - The ARN of a standard SNS topic.
   * * *Event Bus* - The ARN of an Amazon EventBridge event bus.
   */
  public fun destinationConfig(destinationConfig: IResolvable) {
    cdkBuilder.destinationConfig(destinationConfig)
  }

  /**
   * @param destinationConfig A destination for events after they have been sent to a function for
   * processing.
   * **Destinations** - *Function* - The Amazon Resource Name (ARN) of a Lambda function.
   *
   * * *Queue* - The ARN of a standard SQS queue.
   * * *Topic* - The ARN of a standard SNS topic.
   * * *Event Bus* - The ARN of an Amazon EventBridge event bus.
   */
  public fun destinationConfig(destinationConfig: CfnEventInvokeConfig.DestinationConfigProperty) {
    cdkBuilder.destinationConfig(destinationConfig)
  }

  /**
   * @param functionName The name of the Lambda function. 
   * *Minimum* : `1`
   *
   * *Maximum* : `64`
   *
   * *Pattern* : `([a-zA-Z0-9-_]+)`
   */
  public fun functionName(functionName: String) {
    cdkBuilder.functionName(functionName)
  }

  /**
   * @param maximumEventAgeInSeconds The maximum age of a request that Lambda sends to a function
   * for processing.
   */
  public fun maximumEventAgeInSeconds(maximumEventAgeInSeconds: Number) {
    cdkBuilder.maximumEventAgeInSeconds(maximumEventAgeInSeconds)
  }

  /**
   * @param maximumRetryAttempts The maximum number of times to retry when the function returns an
   * error.
   */
  public fun maximumRetryAttempts(maximumRetryAttempts: Number) {
    cdkBuilder.maximumRetryAttempts(maximumRetryAttempts)
  }

  /**
   * @param qualifier The identifier of a version or alias. 
   * * *Version* - A version number.
   * * *Alias* - An alias name.
   * * *Latest* - To specify the unpublished version, use `$LATEST` .
   */
  public fun qualifier(qualifier: String) {
    cdkBuilder.qualifier(qualifier)
  }

  public fun build(): CfnEventInvokeConfigProps = cdkBuilder.build()
}
