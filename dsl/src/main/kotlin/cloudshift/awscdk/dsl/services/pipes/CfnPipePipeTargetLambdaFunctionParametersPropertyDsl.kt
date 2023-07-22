@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pipes

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.pipes.CfnPipe

/**
 * The parameters for using a Lambda function as a target.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pipes.*;
 * PipeTargetLambdaFunctionParametersProperty pipeTargetLambdaFunctionParametersProperty =
 * PipeTargetLambdaFunctionParametersProperty.builder()
 * .invocationType("invocationType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetlambdafunctionparameters.html)
 */
@CdkDslMarker
public class CfnPipePipeTargetLambdaFunctionParametersPropertyDsl {
  private val cdkBuilder: CfnPipe.PipeTargetLambdaFunctionParametersProperty.Builder =
      CfnPipe.PipeTargetLambdaFunctionParametersProperty.builder()

  /**
   * @param invocationType Specify whether to invoke the function synchronously or asynchronously.
   * * `REQUEST_RESPONSE` (default) - Invoke synchronously. This corresponds to the
   * `RequestResponse` option in the `InvocationType` parameter for the Lambda
   * [Invoke](https://docs.aws.amazon.com/lambda/latest/dg/API_Invoke.html#API_Invoke_RequestSyntax)
   * API.
   * * `FIRE_AND_FORGET` - Invoke asynchronously. This corresponds to the `Event` option in the
   * `InvocationType` parameter for the Lambda
   * [Invoke](https://docs.aws.amazon.com/lambda/latest/dg/API_Invoke.html#API_Invoke_RequestSyntax)
   * API.
   *
   * For more information, see [Invocation
   * types](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes.html#pipes-invocation) in
   * the *Amazon EventBridge User Guide* .
   */
  public fun invocationType(invocationType: String) {
    cdkBuilder.invocationType(invocationType)
  }

  public fun build(): CfnPipe.PipeTargetLambdaFunctionParametersProperty = cdkBuilder.build()
}
