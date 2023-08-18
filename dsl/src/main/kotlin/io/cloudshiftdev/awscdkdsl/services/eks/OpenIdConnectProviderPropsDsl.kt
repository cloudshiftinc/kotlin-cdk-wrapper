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
import software.amazon.awscdk.services.eks.OpenIdConnectProviderProps

/**
 * Initialization properties for `OpenIdConnectProvider`.
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
public class OpenIdConnectProviderPropsDsl {
    private val cdkBuilder: OpenIdConnectProviderProps.Builder =
        OpenIdConnectProviderProps.builder()

    /**
     * @param url The URL of the identity provider. The URL must begin with https:// and should
     *   correspond to the iss claim in the provider's OpenID Connect ID tokens. Per the OIDC
     *   standard, path components are allowed but query parameters are not. Typically the URL
     *   consists of only a hostname, like https://server.example.org or https://example.com.
     *
     * You can find your OIDC Issuer URL by: aws eks describe-cluster --name %cluster_name% --query
     * "cluster.identity.oidc.issuer" --output text
     */
    public fun url(url: String) {
        cdkBuilder.url(url)
    }

    public fun build(): OpenIdConnectProviderProps = cdkBuilder.build()
}
