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

  /**
   * The EKS cluster to fetch attributes from.
   *
   * [disable-awslint:ref-via-interface]
   *
   * @param cluster The EKS cluster to fetch attributes from. 
   */
  public fun cluster(cluster: ICluster) {
    cdkBuilder.cluster(cluster)
  }

  /**
   * JSONPath to the specific value.
   *
   * [Documentation](https://kubernetes.io/docs/reference/kubectl/jsonpath/)
   * @param jsonPath JSONPath to the specific value. 
   */
  public fun jsonPath(jsonPath: String) {
    cdkBuilder.jsonPath(jsonPath)
  }

  /**
   * The name of the object to query.
   *
   * @param objectName The name of the object to query. 
   */
  public fun objectName(objectName: String) {
    cdkBuilder.objectName(objectName)
  }

  /**
   * The namespace the object belongs to.
   *
   * Default: 'default'
   *
   * @param objectNamespace The namespace the object belongs to. 
   */
  public fun objectNamespace(objectNamespace: String) {
    cdkBuilder.objectNamespace(objectNamespace)
  }

  /**
   * The object type to query.
   *
   * (e.g 'service', 'pod'...)
   *
   * @param objectType The object type to query. 
   */
  public fun objectType(objectType: String) {
    cdkBuilder.objectType(objectType)
  }

  /**
   * Timeout for waiting on a value.
   *
   * Default: Duration.minutes(5)
   *
   * @param timeout Timeout for waiting on a value. 
   */
  public fun timeout(timeout: Duration) {
    cdkBuilder.timeout(timeout)
  }

  public fun build(): KubernetesObjectValue = cdkBuilder.build()
}
