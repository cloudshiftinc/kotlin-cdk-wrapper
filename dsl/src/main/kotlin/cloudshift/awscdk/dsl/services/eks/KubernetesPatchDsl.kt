@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.services.eks.ICluster
import software.amazon.awscdk.services.eks.KubernetesPatch
import software.amazon.awscdk.services.eks.PatchType
import software.constructs.Construct

/**
 * A CloudFormation resource which applies/restores a JSON patch into a Kubernetes resource.
 *
 * Example:
 *
 * ```
 * Cluster cluster;
 * KubernetesPatch.Builder.create(this, "hello-kub-deployment-label")
 * .cluster(cluster)
 * .resourceName("deployment/hello-kubernetes")
 * .applyPatch(Map.of("spec", Map.of("replicas", 5)))
 * .restorePatch(Map.of("spec", Map.of("replicas", 3)))
 * .build();
 * ```
 *
 * [Documentation](https://kubernetes.io/docs/tasks/run-application/update-api-object-kubectl-patch/)
 */
@CdkDslMarker
public class KubernetesPatchDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: KubernetesPatch.Builder = KubernetesPatch.Builder.create(scope, id)

  /**
   * The JSON object to pass to `kubectl patch` when the resource is created/updated.
   *
   * @param applyPatch The JSON object to pass to `kubectl patch` when the resource is
   * created/updated. 
   */
  public fun applyPatch(applyPatch: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(applyPatch)
    cdkBuilder.applyPatch(builder.map)
  }

  /**
   * The JSON object to pass to `kubectl patch` when the resource is created/updated.
   *
   * @param applyPatch The JSON object to pass to `kubectl patch` when the resource is
   * created/updated. 
   */
  public fun applyPatch(applyPatch: Map<String, Any>) {
    cdkBuilder.applyPatch(applyPatch)
  }

  /**
   * The cluster to apply the patch to.
   *
   * [disable-awslint:ref-via-interface]
   *
   * @param cluster The cluster to apply the patch to. 
   */
  public fun cluster(cluster: ICluster) {
    cdkBuilder.cluster(cluster)
  }

  /**
   * The patch type to pass to `kubectl patch`.
   *
   * The default type used by `kubectl patch` is "strategic".
   *
   * Default: PatchType.STRATEGIC
   *
   * @param patchType The patch type to pass to `kubectl patch`. 
   */
  public fun patchType(patchType: PatchType) {
    cdkBuilder.patchType(patchType)
  }

  /**
   * The full name of the resource to patch (e.g. `deployment/coredns`).
   *
   * @param resourceName The full name of the resource to patch (e.g. `deployment/coredns`). 
   */
  public fun resourceName(resourceName: String) {
    cdkBuilder.resourceName(resourceName)
  }

  /**
   * The kubernetes API namespace.
   *
   * Default: "default"
   *
   * @param resourceNamespace The kubernetes API namespace. 
   */
  public fun resourceNamespace(resourceNamespace: String) {
    cdkBuilder.resourceNamespace(resourceNamespace)
  }

  /**
   * The JSON object to pass to `kubectl patch` when the resource is removed.
   *
   * @param restorePatch The JSON object to pass to `kubectl patch` when the resource is removed. 
   */
  public fun restorePatch(restorePatch: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(restorePatch)
    cdkBuilder.restorePatch(builder.map)
  }

  /**
   * The JSON object to pass to `kubectl patch` when the resource is removed.
   *
   * @param restorePatch The JSON object to pass to `kubectl patch` when the resource is removed. 
   */
  public fun restorePatch(restorePatch: Map<String, Any>) {
    cdkBuilder.restorePatch(restorePatch)
  }

  public fun build(): KubernetesPatch = cdkBuilder.build()
}
