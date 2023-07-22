@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.imagebuilder

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration

/**
 * The container repository where the output container image is stored.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.imagebuilder.*;
 * TargetContainerRepositoryProperty targetContainerRepositoryProperty =
 * TargetContainerRepositoryProperty.builder()
 * .repositoryName("repositoryName")
 * .service("service")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-targetcontainerrepository.html)
 */
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
