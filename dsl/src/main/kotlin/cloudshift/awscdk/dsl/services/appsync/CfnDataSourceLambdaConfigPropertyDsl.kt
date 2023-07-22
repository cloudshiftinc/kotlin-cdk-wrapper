@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appsync.CfnDataSource

@CdkDslMarker
public class CfnDataSourceLambdaConfigPropertyDsl {
  private val cdkBuilder: CfnDataSource.LambdaConfigProperty.Builder =
      CfnDataSource.LambdaConfigProperty.builder()

  /**
   * @param lambdaFunctionArn The ARN for the Lambda function. 
   */
  public fun lambdaFunctionArn(lambdaFunctionArn: String) {
    cdkBuilder.lambdaFunctionArn(lambdaFunctionArn)
  }

  public fun build(): CfnDataSource.LambdaConfigProperty = cdkBuilder.build()
}
