@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.imagebuilder

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration

@CdkDslMarker
public class CfnDistributionConfigurationTargetContainerRepositoryPropertyDsl {
  private val cdkBuilder: CfnDistributionConfiguration.TargetContainerRepositoryProperty.Builder =
      CfnDistributionConfiguration.TargetContainerRepositoryProperty.builder()

  public fun repositoryName(repositoryName: String) {
    cdkBuilder.repositoryName(repositoryName)
  }

  public fun service(service: String) {
    cdkBuilder.service(service)
  }

  public fun build(): CfnDistributionConfiguration.TargetContainerRepositoryProperty =
      cdkBuilder.build()
}
