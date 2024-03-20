@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

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
public open class OpenIdConnectProvider internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.eks.OpenIdConnectProvider,
) : io.cloudshiftdev.awscdk.services.iam.OpenIdConnectProvider(cdkObject) {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: OpenIdConnectProviderProps,
  ) :
      this(software.amazon.awscdk.services.eks.OpenIdConnectProvider(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(OpenIdConnectProviderProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: OpenIdConnectProviderProps.Builder.() -> Unit,
  ) : this(scope, id, OpenIdConnectProviderProps(props)
  )

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.eks.OpenIdConnectProvider].
   */
  @CdkDslMarker
  public interface Builder {
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
     *
     * @param url The URL of the identity provider. 
     */
    public fun url(url: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.OpenIdConnectProvider.Builder =
        software.amazon.awscdk.services.eks.OpenIdConnectProvider.Builder.create(scope, id)

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
     *
     * @param url The URL of the identity provider. 
     */
    override fun url(url: String) {
      cdkBuilder.url(url)
    }

    public fun build(): software.amazon.awscdk.services.eks.OpenIdConnectProvider =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): OpenIdConnectProvider {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return OpenIdConnectProvider(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.OpenIdConnectProvider):
        OpenIdConnectProvider = OpenIdConnectProvider(cdkObject)

    internal fun unwrap(wrapped: OpenIdConnectProvider):
        software.amazon.awscdk.services.eks.OpenIdConnectProvider = wrapped.cdkObject
  }
}
