@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.batch

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.batch.CfnJobDefinition

@CdkDslMarker
public class CfnJobDefinitionEksPropertiesPropertyDsl {
  private val cdkBuilder: CfnJobDefinition.EksPropertiesProperty.Builder =
      CfnJobDefinition.EksPropertiesProperty.builder()

  /**
   * @param podProperties The properties for the Kubernetes pod resources of a job.
   */
  public fun podProperties(podProperties: IResolvable) {
    cdkBuilder.podProperties(podProperties)
  }

  /**
   * @param podProperties The properties for the Kubernetes pod resources of a job.
   */
  public fun podProperties(podProperties: CfnJobDefinition.PodPropertiesProperty) {
    cdkBuilder.podProperties(podProperties)
  }

  public fun build(): CfnJobDefinition.EksPropertiesProperty = cdkBuilder.build()
}
