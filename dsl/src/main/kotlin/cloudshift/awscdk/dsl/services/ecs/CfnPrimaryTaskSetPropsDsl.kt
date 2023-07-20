@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ecs.CfnPrimaryTaskSetProps

@CdkDslMarker
public class CfnPrimaryTaskSetPropsDsl {
  private val cdkBuilder: CfnPrimaryTaskSetProps.Builder = CfnPrimaryTaskSetProps.builder()

  public fun cluster(cluster: String) {
    cdkBuilder.cluster(cluster)
  }

  public fun service(service: String) {
    cdkBuilder.service(service)
  }

  public fun taskSetId(taskSetId: String) {
    cdkBuilder.taskSetId(taskSetId)
  }

  public fun build(): CfnPrimaryTaskSetProps = cdkBuilder.build()
}
