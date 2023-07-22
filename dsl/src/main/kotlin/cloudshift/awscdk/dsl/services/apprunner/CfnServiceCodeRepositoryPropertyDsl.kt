@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apprunner

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apprunner.CfnService

@CdkDslMarker
public class CfnServiceCodeRepositoryPropertyDsl {
  private val cdkBuilder: CfnService.CodeRepositoryProperty.Builder =
      CfnService.CodeRepositoryProperty.builder()

  /**
   * @param codeConfiguration Configuration for building and running the service from a source code
   * repository.
   *
   * `CodeConfiguration` is required only for `CreateService` request.
   */
  public fun codeConfiguration(codeConfiguration: IResolvable) {
    cdkBuilder.codeConfiguration(codeConfiguration)
  }

  /**
   * @param codeConfiguration Configuration for building and running the service from a source code
   * repository.
   *
   * `CodeConfiguration` is required only for `CreateService` request.
   */
  public fun codeConfiguration(codeConfiguration: CfnService.CodeConfigurationProperty) {
    cdkBuilder.codeConfiguration(codeConfiguration)
  }

  /**
   * @param repositoryUrl The location of the repository that contains the source code. 
   */
  public fun repositoryUrl(repositoryUrl: String) {
    cdkBuilder.repositoryUrl(repositoryUrl)
  }

  /**
   * @param sourceCodeVersion The version that should be used within the source code repository. 
   */
  public fun sourceCodeVersion(sourceCodeVersion: IResolvable) {
    cdkBuilder.sourceCodeVersion(sourceCodeVersion)
  }

  /**
   * @param sourceCodeVersion The version that should be used within the source code repository. 
   */
  public fun sourceCodeVersion(sourceCodeVersion: CfnService.SourceCodeVersionProperty) {
    cdkBuilder.sourceCodeVersion(sourceCodeVersion)
  }

  public fun build(): CfnService.CodeRepositoryProperty = cdkBuilder.build()
}
