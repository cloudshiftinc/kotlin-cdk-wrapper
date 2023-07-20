@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModel

@CdkDslMarker
public class CfnModelImageConfigPropertyDsl {
  private val cdkBuilder: CfnModel.ImageConfigProperty.Builder =
      CfnModel.ImageConfigProperty.builder()

  public fun repositoryAccessMode(repositoryAccessMode: String) {
    cdkBuilder.repositoryAccessMode(repositoryAccessMode)
  }

  public fun repositoryAuthConfig(repositoryAuthConfig: IResolvable) {
    cdkBuilder.repositoryAuthConfig(repositoryAuthConfig)
  }

  public fun repositoryAuthConfig(repositoryAuthConfig: CfnModel.RepositoryAuthConfigProperty) {
    cdkBuilder.repositoryAuthConfig(repositoryAuthConfig)
  }

  public fun build(): CfnModel.ImageConfigProperty = cdkBuilder.build()
}
