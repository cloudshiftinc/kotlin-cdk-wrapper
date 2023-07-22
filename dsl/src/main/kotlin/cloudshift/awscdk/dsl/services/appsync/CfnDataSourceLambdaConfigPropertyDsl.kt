@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appsync.CfnDataSource

/**
 * The `LambdaConfig` property type specifies the Lambda function ARN for an AWS AppSync data
 * source.
 *
 * `LambdaConfig` is a property of the
 * [AWS::AppSync::DataSource](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html)
 * property type.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appsync.*;
 * LambdaConfigProperty lambdaConfigProperty = LambdaConfigProperty.builder()
 * .lambdaFunctionArn("lambdaFunctionArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-lambdaconfig.html)
 */
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
