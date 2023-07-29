@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.services.eks.ICluster
import software.amazon.awscdk.services.eks.KubernetesPatchProps
import software.amazon.awscdk.services.eks.PatchType

/**
 * Properties for KubernetesPatch.
 *
 * Example:
 * ```
 * Cluster cluster;
 * KubernetesPatch.Builder.create(this, "hello-kub-deployment-label")
 * .cluster(cluster)
 * .resourceName("deployment/hello-kubernetes")
 * .applyPatch(Map.of("spec", Map.of("replicas", 5)))
 * .restorePatch(Map.of("spec", Map.of("replicas", 3)))
 * .build();
 * ```
 */
@CdkDslMarker
public class KubernetesPatchPropsDsl {
    private val cdkBuilder: KubernetesPatchProps.Builder = KubernetesPatchProps.builder()

    /**
     * @param applyPatch The JSON object to pass to `kubectl patch` when the resource is
     *   created/updated.
     */
    public fun applyPatch(applyPatch: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(applyPatch)
        cdkBuilder.applyPatch(builder.map)
    }

    /**
     * @param applyPatch The JSON object to pass to `kubectl patch` when the resource is
     *   created/updated.
     */
    public fun applyPatch(applyPatch: Map<String, Any>) {
        cdkBuilder.applyPatch(applyPatch)
    }

    /** @param cluster The cluster to apply the patch to. [disable-awslint:ref-via-interface] */
    public fun cluster(cluster: ICluster) {
        cdkBuilder.cluster(cluster)
    }

    /**
     * @param patchType The patch type to pass to `kubectl patch`. The default type used by `kubectl
     *   patch` is "strategic".
     */
    public fun patchType(patchType: PatchType) {
        cdkBuilder.patchType(patchType)
    }

    /** @param resourceName The full name of the resource to patch (e.g. `deployment/coredns`). */
    public fun resourceName(resourceName: String) {
        cdkBuilder.resourceName(resourceName)
    }

    /** @param resourceNamespace The kubernetes API namespace. */
    public fun resourceNamespace(resourceNamespace: String) {
        cdkBuilder.resourceNamespace(resourceNamespace)
    }

    /**
     * @param restorePatch The JSON object to pass to `kubectl patch` when the resource is removed.
     */
    public fun restorePatch(restorePatch: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(restorePatch)
        cdkBuilder.restorePatch(builder.map)
    }

    /**
     * @param restorePatch The JSON object to pass to `kubectl patch` when the resource is removed.
     */
    public fun restorePatch(restorePatch: Map<String, Any>) {
        cdkBuilder.restorePatch(restorePatch)
    }

    public fun build(): KubernetesPatchProps = cdkBuilder.build()
}
