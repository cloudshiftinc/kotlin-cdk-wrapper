@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.eks.ICluster
import software.amazon.awscdk.services.eks.ServiceAccountProps

@CdkDslMarker
public class ServiceAccountPropsDsl {
  private val cdkBuilder: ServiceAccountProps.Builder = ServiceAccountProps.builder()

  public fun annotations(annotations: Map<String, String>) {
    cdkBuilder.annotations(annotations)
  }

  public fun cluster(cluster: ICluster) {
    cdkBuilder.cluster(cluster)
  }

  public fun labels(labels: Map<String, String>) {
    cdkBuilder.labels(labels)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun namespace(namespace: String) {
    cdkBuilder.namespace(namespace)
  }

  public fun build(): ServiceAccountProps = cdkBuilder.build()
}
