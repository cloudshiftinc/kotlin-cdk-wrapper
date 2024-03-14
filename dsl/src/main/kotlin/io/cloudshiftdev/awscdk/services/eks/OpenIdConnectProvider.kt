package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class OpenIdConnectProvider internal constructor(
  private val cdkObject: software.amazon.awscdk.services.eks.OpenIdConnectProvider,
) : io.cloudshiftdev.awscdk.services.iam.OpenIdConnectProvider(cdkObject) {
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
    init {

    }

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
