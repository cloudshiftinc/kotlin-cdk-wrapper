@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ecs.FargateServiceAttributes
import software.amazon.awscdk.services.ecs.ICluster

@CdkDslMarker
public class FargateServiceAttributesDsl {
  private val cdkBuilder: FargateServiceAttributes.Builder = FargateServiceAttributes.builder()

  public fun cluster(cluster: ICluster) {
    cdkBuilder.cluster(cluster)
  }

  public fun serviceArn(serviceArn: String) {
    cdkBuilder.serviceArn(serviceArn)
  }

  public fun serviceName(serviceName: String) {
    cdkBuilder.serviceName(serviceName)
  }

  public fun build(): FargateServiceAttributes = cdkBuilder.build()
}
