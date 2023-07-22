@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.imagebuilder

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration

@CdkDslMarker
public class CfnDistributionConfigurationTargetContainerRepositoryPropertyDsl {
  private val cdkBuilder: CfnDistributionConfiguration.TargetContainerRepositoryProperty.Builder =
      CfnDistributionConfiguration.TargetContainerRepositoryProperty.builder()

  /**
   * @param repositoryName The name of the container repository where the output container image is
   * stored.
   * This name is prefixed by the repository location.
   */
  public fun repositoryName(repositoryName: String) {
    cdkBuilder.repositoryName(repositoryName)
  }

  /**
   * @param service Specifies the service in which this image was registered.
   */
  public fun service(service: String) {
    cdkBuilder.service(service)
  }

  public fun build(): CfnDistributionConfiguration.TargetContainerRepositoryProperty =
      cdkBuilder.build()
}
