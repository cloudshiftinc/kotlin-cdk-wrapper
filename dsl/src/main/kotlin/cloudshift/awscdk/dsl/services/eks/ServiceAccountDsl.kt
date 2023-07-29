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
import software.amazon.awscdk.services.eks.ServiceAccount
import software.constructs.Construct

/**
 * Service Account.
 *
 * Example:
 * ```
 * // or create a new one using an existing issuer url
 * String issuerUrl;
 * // you can import an existing provider
 * IOpenIdConnectProvider provider = OpenIdConnectProvider.fromOpenIdConnectProviderArn(this,
 * "Provider", "arn:aws:iam::123456:oidc-provider/oidc.eks.eu-west-1.amazonaws.com/id/AB123456ABC");
 * OpenIdConnectProvider provider2 = OpenIdConnectProvider.Builder.create(this, "Provider")
 * .url(issuerUrl)
 * .build();
 * ICluster cluster = Cluster.fromClusterAttributes(this, "MyCluster", ClusterAttributes.builder()
 * .clusterName("Cluster")
 * .openIdConnectProvider(provider)
 * .kubectlRoleArn("arn:aws:iam::123456:role/service-role/k8sservicerole")
 * .build());
 * ServiceAccount serviceAccount = cluster.addServiceAccount("MyServiceAccount");
 * Bucket bucket = new Bucket(this, "Bucket");
 * bucket.grantReadWrite(serviceAccount);
 * ```
 */
@CdkDslMarker
public class ServiceAccountDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: ServiceAccount.Builder = ServiceAccount.Builder.create(scope, id)

    /**
     * Additional annotations of the service account.
     *
     * Default: - no additional annotations
     *
     * @param annotations Additional annotations of the service account.
     */
    public fun annotations(annotations: Map<String, String>) {
        cdkBuilder.annotations(annotations)
    }

    /**
     * The cluster to apply the patch to.
     *
     * @param cluster The cluster to apply the patch to.
     */
    public fun cluster(cluster: ICluster) {
        cdkBuilder.cluster(cluster)
    }

    /**
     * Additional labels of the service account.
     *
     * Default: - no additional labels
     *
     * @param labels Additional labels of the service account.
     */
    public fun labels(labels: Map<String, String>) {
        cdkBuilder.labels(labels)
    }

    /**
     * The name of the service account.
     *
     * The name of a ServiceAccount object must be a valid DNS subdomain name.
     * https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/
     *
     * Default: - If no name is given, it will use the id of the resource.
     *
     * @param name The name of the service account.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The namespace of the service account.
     *
     * All namespace names must be valid RFC 1123 DNS labels.
     * https://kubernetes.io/docs/concepts/overview/working-with-objects/namespaces/#namespaces-and-dns
     *
     * Default: "default"
     *
     * @param namespace The namespace of the service account.
     */
    public fun namespace(namespace: String) {
        cdkBuilder.namespace(namespace)
    }

    public fun build(): ServiceAccount = cdkBuilder.build()
}
