@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lambda.CfnFunction

/**
 * The [dead-letter queue](https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html#dlq)
 * for failed asynchronous invocations.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lambda.*;
 * DeadLetterConfigProperty deadLetterConfigProperty = DeadLetterConfigProperty.builder()
 * .targetArn("targetArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-deadletterconfig.html)
 */
@CdkDslMarker
public class CfnFunctionDeadLetterConfigPropertyDsl {
  private val cdkBuilder: CfnFunction.DeadLetterConfigProperty.Builder =
      CfnFunction.DeadLetterConfigProperty.builder()

  /**
   * @param targetArn The Amazon Resource Name (ARN) of an Amazon SQS queue or Amazon SNS topic.
   */
  public fun targetArn(targetArn: String) {
    cdkBuilder.targetArn(targetArn)
  }

  public fun build(): CfnFunction.DeadLetterConfigProperty = cdkBuilder.build()
}
