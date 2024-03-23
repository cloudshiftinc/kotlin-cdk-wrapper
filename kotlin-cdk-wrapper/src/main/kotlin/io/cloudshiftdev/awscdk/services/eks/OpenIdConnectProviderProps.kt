@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Initialization properties for `OpenIdConnectProvider`.
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
 */
public interface OpenIdConnectProviderProps {
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
   */
  public fun url(): String

  /**
   * A builder for [OpenIdConnectProviderProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param url The URL of the identity provider. 
     * The URL must begin with https:// and
     * should correspond to the iss claim in the provider's OpenID Connect ID
     * tokens. Per the OIDC standard, path components are allowed but query
     * parameters are not. Typically the URL consists of only a hostname, like
     * https://server.example.org or https://example.com.
     *
     * You can find your OIDC Issuer URL by:
     * aws eks describe-cluster --name %cluster_name% --query
     * "cluster.identity.oidc.issuer" --output text
     */
    public fun url(url: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.OpenIdConnectProviderProps.Builder =
        software.amazon.awscdk.services.eks.OpenIdConnectProviderProps.builder()

    /**
     * @param url The URL of the identity provider. 
     * The URL must begin with https:// and
     * should correspond to the iss claim in the provider's OpenID Connect ID
     * tokens. Per the OIDC standard, path components are allowed but query
     * parameters are not. Typically the URL consists of only a hostname, like
     * https://server.example.org or https://example.com.
     *
     * You can find your OIDC Issuer URL by:
     * aws eks describe-cluster --name %cluster_name% --query
     * "cluster.identity.oidc.issuer" --output text
     */
    override fun url(url: String) {
      cdkBuilder.url(url)
    }

    public fun build(): software.amazon.awscdk.services.eks.OpenIdConnectProviderProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.eks.OpenIdConnectProviderProps,
  ) : CdkObject(cdkObject), OpenIdConnectProviderProps {
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
     * aws eks describe-cluster --name %cluster_name% --query
     * "cluster.identity.oidc.issuer" --output text
     */
    override fun url(): String = unwrap(this).getUrl()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): OpenIdConnectProviderProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.OpenIdConnectProviderProps):
        OpenIdConnectProviderProps = CdkObjectWrappers.wrap(cdkObject) as?
        OpenIdConnectProviderProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: OpenIdConnectProviderProps):
        software.amazon.awscdk.services.eks.OpenIdConnectProviderProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.eks.OpenIdConnectProviderProps
  }
}
