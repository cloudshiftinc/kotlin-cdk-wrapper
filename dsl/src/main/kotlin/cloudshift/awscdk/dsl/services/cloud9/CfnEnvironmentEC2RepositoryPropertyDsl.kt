@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloud9

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2

@CdkDslMarker
public class CfnEnvironmentEC2RepositoryPropertyDsl {
  private val cdkBuilder: CfnEnvironmentEC2.RepositoryProperty.Builder =
      CfnEnvironmentEC2.RepositoryProperty.builder()

  /**
   * @param pathComponent The path within the development environment's default file system location
   * to clone the AWS CodeCommit repository into. 
   * For example, `/REPOSITORY_NAME` would clone the repository into the
   * `/home/USER_NAME/environment/REPOSITORY_NAME` directory in the environment.
   */
  public fun pathComponent(pathComponent: String) {
    cdkBuilder.pathComponent(pathComponent)
  }

  /**
   * @param repositoryUrl The clone URL of the AWS CodeCommit repository to be cloned. 
   * For example, for an AWS CodeCommit repository this might be
   * `https://git-codecommit.us-east-2.amazonaws.com/v1/repos/REPOSITORY_NAME` .
   */
  public fun repositoryUrl(repositoryUrl: String) {
    cdkBuilder.repositoryUrl(repositoryUrl)
  }

  public fun build(): CfnEnvironmentEC2.RepositoryProperty = cdkBuilder.build()
}
