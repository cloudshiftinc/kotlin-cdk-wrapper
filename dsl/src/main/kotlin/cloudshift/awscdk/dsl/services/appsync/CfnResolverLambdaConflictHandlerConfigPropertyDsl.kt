@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appsync.CfnResolver

/**
 * The `LambdaConflictHandlerConfig` when configuring LAMBDA as the Conflict Handler.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appsync.*;
 * LambdaConflictHandlerConfigProperty lambdaConflictHandlerConfigProperty =
 * LambdaConflictHandlerConfigProperty.builder()
 * .lambdaConflictHandlerArn("lambdaConflictHandlerArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-resolver-lambdaconflicthandlerconfig.html)
 */
@CdkDslMarker
public class CfnResolverLambdaConflictHandlerConfigPropertyDsl {
  private val cdkBuilder: CfnResolver.LambdaConflictHandlerConfigProperty.Builder =
      CfnResolver.LambdaConflictHandlerConfigProperty.builder()

  /**
   * @param lambdaConflictHandlerArn The Amazon Resource Name (ARN) for the Lambda function to use
   * as the Conflict Handler.
   */
  public fun lambdaConflictHandlerArn(lambdaConflictHandlerArn: String) {
    cdkBuilder.lambdaConflictHandlerArn(lambdaConflictHandlerArn)
  }

  public fun build(): CfnResolver.LambdaConflictHandlerConfigProperty = cdkBuilder.build()
}
