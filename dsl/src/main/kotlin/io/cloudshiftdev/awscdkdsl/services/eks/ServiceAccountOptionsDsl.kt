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

package io.cloudshiftdev.awscdkdsl.services.eks

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.eks.ServiceAccountOptions

/**
 * Options for `ServiceAccount`.
 *
 * Example:
 * ```
 * Cluster cluster;
 * // add service account with annotations and labels
 * ServiceAccount serviceAccount = cluster.addServiceAccount("MyServiceAccount",
 * ServiceAccountOptions.builder()
 * .annotations(Map.of(
 * "eks.amazonaws.com/sts-regional-endpoints", "false"))
 * .labels(Map.of(
 * "some-label", "with-some-value"))
 * .build());
 * ```
 */
@CdkDslMarker
public class ServiceAccountOptionsDsl {
    private val cdkBuilder: ServiceAccountOptions.Builder = ServiceAccountOptions.builder()

    /** @param annotations Additional annotations of the service account. */
    public fun annotations(annotations: Map<String, String>) {
        cdkBuilder.annotations(annotations)
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

    public fun build(): ServiceAccountOptions = cdkBuilder.build()
}
