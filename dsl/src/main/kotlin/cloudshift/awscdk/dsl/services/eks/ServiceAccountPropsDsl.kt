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
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.eks.ICluster
import software.amazon.awscdk.services.eks.ServiceAccountProps

/**
 * Properties for defining service accounts.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.eks.*;
 * Cluster cluster;
 * ServiceAccountProps serviceAccountProps = ServiceAccountProps.builder()
 * .cluster(cluster)
 * // the properties below are optional
 * .annotations(Map.of(
 * "annotationsKey", "annotations"))
 * .labels(Map.of(
 * "labelsKey", "labels"))
 * .name("name")
 * .namespace("namespace")
 * .build();
 * ```
 */
@CdkDslMarker
public class ServiceAccountPropsDsl {
    private val cdkBuilder: ServiceAccountProps.Builder = ServiceAccountProps.builder()

    /** @param annotations Additional annotations of the service account. */
    public fun annotations(annotations: Map<String, String>) {
        cdkBuilder.annotations(annotations)
    }

    /** @param cluster The cluster to apply the patch to. */
    public fun cluster(cluster: ICluster) {
        cdkBuilder.cluster(cluster)
    }

    /** @param labels Additional labels of the service account. */
    public fun labels(labels: Map<String, String>) {
        cdkBuilder.labels(labels)
    }

    /**
     * @param name The name of the service account. The name of a ServiceAccount object must be a
     *   valid DNS subdomain name.
     *   https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param namespace The namespace of the service account. All namespace names must be valid RFC
     *   1123 DNS labels.
     *   https://kubernetes.io/docs/concepts/overview/working-with-objects/namespaces/#namespaces-and-dns
     */
    public fun namespace(namespace: String) {
        cdkBuilder.namespace(namespace)
    }

    public fun build(): ServiceAccountProps = cdkBuilder.build()
}
