@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appsync.CfnDataSource

@CdkDslMarker
public class CfnDataSourceAuthorizationConfigPropertyDsl {
  private val cdkBuilder: CfnDataSource.AuthorizationConfigProperty.Builder =
      CfnDataSource.AuthorizationConfigProperty.builder()

  /**
   * @param authorizationType The authorization type that the HTTP endpoint requires. 
   * * *AWS_IAM* : The authorization type is Signature Version 4 (SigV4).
   */
  public fun authorizationType(authorizationType: String) {
    cdkBuilder.authorizationType(authorizationType)
  }

  /**
   * @param awsIamConfig The AWS Identity and Access Management settings.
   */
  public fun awsIamConfig(awsIamConfig: IResolvable) {
    cdkBuilder.awsIamConfig(awsIamConfig)
  }

  /**
   * @param awsIamConfig The AWS Identity and Access Management settings.
   */
  public fun awsIamConfig(awsIamConfig: CfnDataSource.AwsIamConfigProperty) {
    cdkBuilder.awsIamConfig(awsIamConfig)
  }

  public fun build(): CfnDataSource.AuthorizationConfigProperty = cdkBuilder.build()
}
