@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnModel

@CdkDslMarker
public class CfnModelRepositoryAuthConfigPropertyDsl {
  private val cdkBuilder: CfnModel.RepositoryAuthConfigProperty.Builder =
      CfnModel.RepositoryAuthConfigProperty.builder()

  /**
   * @param repositoryCredentialsProviderArn The Amazon Resource Name (ARN) of an AWS Lambda
   * function that provides credentials to authenticate to the private Docker registry where your model
   * image is hosted. 
   * For information about how to create an AWS Lambda function, see [Create a Lambda function with
   * the console](https://docs.aws.amazon.com/lambda/latest/dg/getting-started-create-function.html) in
   * the *AWS Lambda Developer Guide* .
   */
  public fun repositoryCredentialsProviderArn(repositoryCredentialsProviderArn: String) {
    cdkBuilder.repositoryCredentialsProviderArn(repositoryCredentialsProviderArn)
  }

  public fun build(): CfnModel.RepositoryAuthConfigProperty = cdkBuilder.build()
}
