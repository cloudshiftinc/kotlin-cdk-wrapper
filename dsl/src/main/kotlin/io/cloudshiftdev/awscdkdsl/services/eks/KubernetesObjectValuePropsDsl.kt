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
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.eks.ICluster
import software.amazon.awscdk.services.eks.KubernetesObjectValueProps

/**
 * Properties for KubernetesObjectValue.
 *
 * Example:
 * ```
 * Cluster cluster;
 * // query the load balancer address
 * KubernetesObjectValue myServiceAddress = KubernetesObjectValue.Builder.create(this,
 * "LoadBalancerAttribute")
 * .cluster(cluster)
 * .objectType("service")
 * .objectName("my-service")
 * .jsonPath(".status.loadBalancer.ingress[0].hostname")
 * .build();
 * // pass the address to a lambda function
 * Function proxyFunction = Function.Builder.create(this, "ProxyFunction")
 * .handler("index.handler")
 * .code(Code.fromInline("my-code"))
 * .runtime(Runtime.NODEJS_LATEST)
 * .environment(Map.of(
 * "myServiceAddress", myServiceAddress.getValue()))
 * .build();
 * ```
 */
@CdkDslMarker
public class KubernetesObjectValuePropsDsl {
    private val cdkBuilder: KubernetesObjectValueProps.Builder =
        KubernetesObjectValueProps.builder()

    /**
     * @param cluster The EKS cluster to fetch attributes from. [disable-awslint:ref-via-interface]
     */
    public fun cluster(cluster: ICluster) {
        cdkBuilder.cluster(cluster)
    }

    /** @param jsonPath JSONPath to the specific value. */
    public fun jsonPath(jsonPath: String) {
        cdkBuilder.jsonPath(jsonPath)
    }

    /** @param objectName The name of the object to query. */
    public fun objectName(objectName: String) {
        cdkBuilder.objectName(objectName)
    }

    /** @param objectNamespace The namespace the object belongs to. */
    public fun objectNamespace(objectNamespace: String) {
        cdkBuilder.objectNamespace(objectNamespace)
    }

    /** @param objectType The object type to query. (e.g 'service', 'pod'...) */
    public fun objectType(objectType: String) {
        cdkBuilder.objectType(objectType)
    }

    /** @param timeout Timeout for waiting on a value. */
    public fun timeout(timeout: Duration) {
        cdkBuilder.timeout(timeout)
    }

    public fun build(): KubernetesObjectValueProps = cdkBuilder.build()
}
