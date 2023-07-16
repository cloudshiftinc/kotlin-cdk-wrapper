@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appsync.CfnFunctionConfiguration

@CdkDslMarker
public class CfnFunctionConfigurationLambdaConflictHandlerConfigPropertyDsl {
  private val cdkBuilder: CfnFunctionConfiguration.LambdaConflictHandlerConfigProperty.Builder =
      CfnFunctionConfiguration.LambdaConflictHandlerConfigProperty.builder()

  public fun lambdaConflictHandlerArn(lambdaConflictHandlerArn: String) {
    cdkBuilder.lambdaConflictHandlerArn(lambdaConflictHandlerArn)
  }

  public fun build(): CfnFunctionConfiguration.LambdaConflictHandlerConfigProperty =
      cdkBuilder.build()
}
