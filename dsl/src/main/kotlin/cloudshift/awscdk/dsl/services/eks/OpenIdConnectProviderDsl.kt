@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.eks.OpenIdConnectProvider
import software.constructs.Construct

/**
 * IAM OIDC identity providers are entities in IAM that describe an external identity provider (IdP)
 * service that supports the OpenID Connect (OIDC) standard, such as Google or Salesforce.
 *
 * You use an IAM OIDC identity provider
 * when you want to establish trust between an OIDC-compatible IdP and your AWS
 * account.
 *
 * This implementation has default values for thumbprints and clientIds props
 * that will be compatible with the eks cluster
 *
 * Example:
 *
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
 *
 * [Documentation](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_oidc.html)
 */
@CdkDslMarker
public class OpenIdConnectProviderDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: OpenIdConnectProvider.Builder =
      OpenIdConnectProvider.Builder.create(scope, id)

  /**
   * The URL of the identity provider.
   *
   * The URL must begin with https:// and
   * should correspond to the iss claim in the provider's OpenID Connect ID
   * tokens. Per the OIDC standard, path components are allowed but query
   * parameters are not. Typically the URL consists of only a hostname, like
   * https://server.example.org or https://example.com.
   *
   * You can find your OIDC Issuer URL by:
   * aws eks describe-cluster --name %cluster_name% --query "cluster.identity.oidc.issuer" --output
   * text
   *
   * @param url The URL of the identity provider. 
   */
  public fun url(url: String) {
    cdkBuilder.url(url)
  }

  public fun build(): OpenIdConnectProvider = cdkBuilder.build()
}
