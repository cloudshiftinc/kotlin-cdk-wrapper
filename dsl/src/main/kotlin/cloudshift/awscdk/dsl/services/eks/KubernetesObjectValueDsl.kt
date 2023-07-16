@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.eks.ICluster
import software.amazon.awscdk.services.eks.KubernetesObjectValue
import software.constructs.Construct

@CdkDslMarker
public class KubernetesObjectValueDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: KubernetesObjectValue.Builder =
      KubernetesObjectValue.Builder.create(scope, id)

  public fun cluster(cluster: ICluster) {
    cdkBuilder.cluster(cluster)
  }

  public fun jsonPath(jsonPath: String) {
    cdkBuilder.jsonPath(jsonPath)
  }

  public fun objectName(objectName: String) {
    cdkBuilder.objectName(objectName)
  }

  public fun objectNamespace(objectNamespace: String) {
    cdkBuilder.objectNamespace(objectNamespace)
  }

  public fun objectType(objectType: String) {
    cdkBuilder.objectType(objectType)
  }

  public fun timeout(timeout: Duration) {
    cdkBuilder.timeout(timeout)
  }

  public fun build(): KubernetesObjectValue = cdkBuilder.build()
}
