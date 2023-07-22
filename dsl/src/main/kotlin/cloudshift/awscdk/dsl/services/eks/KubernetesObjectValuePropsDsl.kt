@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.eks.ICluster
import software.amazon.awscdk.services.eks.KubernetesObjectValueProps

@CdkDslMarker
public class KubernetesObjectValuePropsDsl {
  private val cdkBuilder: KubernetesObjectValueProps.Builder = KubernetesObjectValueProps.builder()

  /**
   * @param cluster The EKS cluster to fetch attributes from. 
   * [disable-awslint:ref-via-interface]
   */
  public fun cluster(cluster: ICluster) {
    cdkBuilder.cluster(cluster)
  }

  /**
   * @param jsonPath JSONPath to the specific value. 
   */
  public fun jsonPath(jsonPath: String) {
    cdkBuilder.jsonPath(jsonPath)
  }

  /**
   * @param objectName The name of the object to query. 
   */
  public fun objectName(objectName: String) {
    cdkBuilder.objectName(objectName)
  }

  /**
   * @param objectNamespace The namespace the object belongs to.
   */
  public fun objectNamespace(objectNamespace: String) {
    cdkBuilder.objectNamespace(objectNamespace)
  }

  /**
   * @param objectType The object type to query. 
   * (e.g 'service', 'pod'...)
   */
  public fun objectType(objectType: String) {
    cdkBuilder.objectType(objectType)
  }

  /**
   * @param timeout Timeout for waiting on a value.
   */
  public fun timeout(timeout: Duration) {
    cdkBuilder.timeout(timeout)
  }

  public fun build(): KubernetesObjectValueProps = cdkBuilder.build()
}
