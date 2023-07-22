@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appsync.CfnFunctionConfiguration

@CdkDslMarker
public class CfnFunctionConfigurationLambdaConflictHandlerConfigPropertyDsl {
  private val cdkBuilder: CfnFunctionConfiguration.LambdaConflictHandlerConfigProperty.Builder =
      CfnFunctionConfiguration.LambdaConflictHandlerConfigProperty.builder()

  /**
   * @param lambdaConflictHandlerArn The Amazon Resource Name (ARN) for the Lambda function to use
   * as the Conflict Handler.
   */
  public fun lambdaConflictHandlerArn(lambdaConflictHandlerArn: String) {
    cdkBuilder.lambdaConflictHandlerArn(lambdaConflictHandlerArn)
  }

  public fun build(): CfnFunctionConfiguration.LambdaConflictHandlerConfigProperty =
      cdkBuilder.build()
}
