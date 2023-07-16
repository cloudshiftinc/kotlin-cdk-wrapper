@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnModel

@CdkDslMarker
public class CfnModelRepositoryAuthConfigPropertyDsl {
  private val cdkBuilder: CfnModel.RepositoryAuthConfigProperty.Builder =
      CfnModel.RepositoryAuthConfigProperty.builder()

  public fun repositoryCredentialsProviderArn(repositoryCredentialsProviderArn: String) {
    cdkBuilder.repositoryCredentialsProviderArn(repositoryCredentialsProviderArn)
  }

  public fun build(): CfnModel.RepositoryAuthConfigProperty = cdkBuilder.build()
}
