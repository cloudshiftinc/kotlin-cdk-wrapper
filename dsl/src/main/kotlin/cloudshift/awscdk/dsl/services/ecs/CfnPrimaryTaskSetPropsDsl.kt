@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ecs.CfnPrimaryTaskSetProps

@CdkDslMarker
public class CfnPrimaryTaskSetPropsDsl {
  private val cdkBuilder: CfnPrimaryTaskSetProps.Builder = CfnPrimaryTaskSetProps.builder()

  /**
   * @param cluster The short name or full Amazon Resource Name (ARN) of the cluster that hosts the
   * service that the task set exists in. 
   */
  public fun cluster(cluster: String) {
    cdkBuilder.cluster(cluster)
  }

  /**
   * @param service The short name or full Amazon Resource Name (ARN) of the service that the task
   * set exists in. 
   */
  public fun service(service: String) {
    cdkBuilder.service(service)
  }

  /**
   * @param taskSetId The short name or full Amazon Resource Name (ARN) of the task set to set as
   * the primary task set in the deployment. 
   */
  public fun taskSetId(taskSetId: String) {
    cdkBuilder.taskSetId(taskSetId)
  }

  public fun build(): CfnPrimaryTaskSetProps = cdkBuilder.build()
}
