@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ecs.Ec2ServiceAttributes
import software.amazon.awscdk.services.ecs.ICluster

@CdkDslMarker
public class Ec2ServiceAttributesDsl {
  private val cdkBuilder: Ec2ServiceAttributes.Builder = Ec2ServiceAttributes.builder()

  public fun cluster(cluster: ICluster) {
    cdkBuilder.cluster(cluster)
  }

  public fun serviceArn(serviceArn: String) {
    cdkBuilder.serviceArn(serviceArn)
  }

  public fun serviceName(serviceName: String) {
    cdkBuilder.serviceName(serviceName)
  }

  public fun build(): Ec2ServiceAttributes = cdkBuilder.build()
}
