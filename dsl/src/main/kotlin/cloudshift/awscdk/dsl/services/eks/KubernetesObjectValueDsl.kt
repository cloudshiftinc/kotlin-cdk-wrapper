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
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.eks.ICluster
import software.amazon.awscdk.services.eks.KubernetesObjectValue
import software.constructs.Construct

/**
 * Represents a value of a specific object deployed in the cluster.
 *
 * Use this to fetch any information available by the `kubectl get` command.
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
 * .runtime(Runtime.NODEJS_14_X)
 * .environment(Map.of(
 * "myServiceAddress", myServiceAddress.getValue()))
 * .build();
 * ```
 */
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
     *
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
