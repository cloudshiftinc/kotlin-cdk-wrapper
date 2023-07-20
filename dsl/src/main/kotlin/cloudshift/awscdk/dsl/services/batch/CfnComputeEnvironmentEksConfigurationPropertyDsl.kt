@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.batch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.batch.CfnComputeEnvironment

@CdkDslMarker
public class CfnComputeEnvironmentEksConfigurationPropertyDsl {
  private val cdkBuilder: CfnComputeEnvironment.EksConfigurationProperty.Builder =
      CfnComputeEnvironment.EksConfigurationProperty.builder()

  public fun eksClusterArn(eksClusterArn: String) {
    cdkBuilder.eksClusterArn(eksClusterArn)
  }

  public fun kubernetesNamespace(kubernetesNamespace: String) {
    cdkBuilder.kubernetesNamespace(kubernetesNamespace)
  }

  public fun build(): CfnComputeEnvironment.EksConfigurationProperty = cdkBuilder.build()
}
