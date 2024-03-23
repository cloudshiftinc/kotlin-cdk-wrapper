@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Initialization properties for `OpenIdConnectProvider`.
 *
 * Example:
 *
 * ```
 * OpenIdConnectProvider provider = OpenIdConnectProvider.Builder.create(this, "MyProvider")
 * .url("https://openid/connect")
 * .clientIds(List.of("myclient1", "myclient2"))
 * .build();
 * ```
 */
public interface OpenIdConnectProviderProps {
  /**
   * A list of client IDs (also known as audiences).
   *
   * When a mobile or web app
   * registers with an OpenID Connect provider, they establish a value that
   * identifies the application. (This is the value that's sent as the client_id
   * parameter on OAuth requests.)
   *
   * You can register multiple client IDs with the same provider. For example,
   * you might have multiple applications that use the same OIDC provider. You
   * cannot register more than 100 client IDs with a single IAM OIDC provider.
   *
   * Client IDs are up to 255 characters long.
   *
   * Default: - no clients are allowed
   */
  public fun clientIds(): List<String> = unwrap(this).getClientIds() ?: emptyList()

  /**
   * A list of server certificate thumbprints for the OpenID Connect (OIDC) identity provider's
   * server certificates.
   *
   * Typically this list includes only one entry. However, IAM lets you have up
   * to five thumbprints for an OIDC provider. This lets you maintain multiple
   * thumbprints if the identity provider is rotating certificates.
   *
   * The server certificate thumbprint is the hex-encoded SHA-1 hash value of
   * the X.509 certificate used by the domain where the OpenID Connect provider
   * makes its keys available. It is always a 40-character string.
   *
   * You must provide at least one thumbprint when creating an IAM OIDC
   * provider. For example, assume that the OIDC provider is server.example.com
   * and the provider stores its keys at
   * https://keys.server.example.com/openid-connect. In that case, the
   * thumbprint string would be the hex-encoded SHA-1 hash value of the
   * certificate used by https://keys.server.example.com.
   *
   * Default: - If no thumbprints are specified (an empty array or `undefined`),
   * the thumbprint of the root certificate authority will be obtained from the
   * provider's server as described in
   * https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_create_oidc_verify-thumbprint.html
   */
  public fun thumbprints(): List<String> = unwrap(this).getThumbprints() ?: emptyList()

  /**
   * The URL of the identity provider.
   *
   * The URL must begin with https:// and
   * should correspond to the iss claim in the provider's OpenID Connect ID
   * tokens. Per the OIDC standard, path components are allowed but query
   * parameters are not. Typically the URL consists of only a hostname, like
   * https://server.example.org or https://example.com.
   *
   * You cannot register the same provider multiple times in a single AWS
   * account. If you try to submit a URL that has already been used for an
   * OpenID Connect provider in the AWS account, you will get an error.
   */
  public fun url(): String

  /**
   * A builder for [OpenIdConnectProviderProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param clientIds A list of client IDs (also known as audiences).
     * When a mobile or web app
     * registers with an OpenID Connect provider, they establish a value that
     * identifies the application. (This is the value that's sent as the client_id
     * parameter on OAuth requests.)
     *
     * You can register multiple client IDs with the same provider. For example,
     * you might have multiple applications that use the same OIDC provider. You
     * cannot register more than 100 client IDs with a single IAM OIDC provider.
     *
     * Client IDs are up to 255 characters long.
     */
    public fun clientIds(clientIds: List<String>)

    /**
     * @param clientIds A list of client IDs (also known as audiences).
     * When a mobile or web app
     * registers with an OpenID Connect provider, they establish a value that
     * identifies the application. (This is the value that's sent as the client_id
     * parameter on OAuth requests.)
     *
     * You can register multiple client IDs with the same provider. For example,
     * you might have multiple applications that use the same OIDC provider. You
     * cannot register more than 100 client IDs with a single IAM OIDC provider.
     *
     * Client IDs are up to 255 characters long.
     */
    public fun clientIds(vararg clientIds: String)

    /**
     * @param thumbprints A list of server certificate thumbprints for the OpenID Connect (OIDC)
     * identity provider's server certificates.
     * Typically this list includes only one entry. However, IAM lets you have up
     * to five thumbprints for an OIDC provider. This lets you maintain multiple
     * thumbprints if the identity provider is rotating certificates.
     *
     * The server certificate thumbprint is the hex-encoded SHA-1 hash value of
     * the X.509 certificate used by the domain where the OpenID Connect provider
     * makes its keys available. It is always a 40-character string.
     *
     * You must provide at least one thumbprint when creating an IAM OIDC
     * provider. For example, assume that the OIDC provider is server.example.com
     * and the provider stores its keys at
     * https://keys.server.example.com/openid-connect. In that case, the
     * thumbprint string would be the hex-encoded SHA-1 hash value of the
     * certificate used by https://keys.server.example.com.
     */
    public fun thumbprints(thumbprints: List<String>)

    /**
     * @param thumbprints A list of server certificate thumbprints for the OpenID Connect (OIDC)
     * identity provider's server certificates.
     * Typically this list includes only one entry. However, IAM lets you have up
     * to five thumbprints for an OIDC provider. This lets you maintain multiple
     * thumbprints if the identity provider is rotating certificates.
     *
     * The server certificate thumbprint is the hex-encoded SHA-1 hash value of
     * the X.509 certificate used by the domain where the OpenID Connect provider
     * makes its keys available. It is always a 40-character string.
     *
     * You must provide at least one thumbprint when creating an IAM OIDC
     * provider. For example, assume that the OIDC provider is server.example.com
     * and the provider stores its keys at
     * https://keys.server.example.com/openid-connect. In that case, the
     * thumbprint string would be the hex-encoded SHA-1 hash value of the
     * certificate used by https://keys.server.example.com.
     */
    public fun thumbprints(vararg thumbprints: String)

    /**
     * @param url The URL of the identity provider. 
     * The URL must begin with https:// and
     * should correspond to the iss claim in the provider's OpenID Connect ID
     * tokens. Per the OIDC standard, path components are allowed but query
     * parameters are not. Typically the URL consists of only a hostname, like
     * https://server.example.org or https://example.com.
     *
     * You cannot register the same provider multiple times in a single AWS
     * account. If you try to submit a URL that has already been used for an
     * OpenID Connect provider in the AWS account, you will get an error.
     */
    public fun url(url: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.OpenIdConnectProviderProps.Builder =
        software.amazon.awscdk.services.iam.OpenIdConnectProviderProps.builder()

    /**
     * @param clientIds A list of client IDs (also known as audiences).
     * When a mobile or web app
     * registers with an OpenID Connect provider, they establish a value that
     * identifies the application. (This is the value that's sent as the client_id
     * parameter on OAuth requests.)
     *
     * You can register multiple client IDs with the same provider. For example,
     * you might have multiple applications that use the same OIDC provider. You
     * cannot register more than 100 client IDs with a single IAM OIDC provider.
     *
     * Client IDs are up to 255 characters long.
     */
    override fun clientIds(clientIds: List<String>) {
      cdkBuilder.clientIds(clientIds)
    }

    /**
     * @param clientIds A list of client IDs (also known as audiences).
     * When a mobile or web app
     * registers with an OpenID Connect provider, they establish a value that
     * identifies the application. (This is the value that's sent as the client_id
     * parameter on OAuth requests.)
     *
     * You can register multiple client IDs with the same provider. For example,
     * you might have multiple applications that use the same OIDC provider. You
     * cannot register more than 100 client IDs with a single IAM OIDC provider.
     *
     * Client IDs are up to 255 characters long.
     */
    override fun clientIds(vararg clientIds: String): Unit = clientIds(clientIds.toList())

    /**
     * @param thumbprints A list of server certificate thumbprints for the OpenID Connect (OIDC)
     * identity provider's server certificates.
     * Typically this list includes only one entry. However, IAM lets you have up
     * to five thumbprints for an OIDC provider. This lets you maintain multiple
     * thumbprints if the identity provider is rotating certificates.
     *
     * The server certificate thumbprint is the hex-encoded SHA-1 hash value of
     * the X.509 certificate used by the domain where the OpenID Connect provider
     * makes its keys available. It is always a 40-character string.
     *
     * You must provide at least one thumbprint when creating an IAM OIDC
     * provider. For example, assume that the OIDC provider is server.example.com
     * and the provider stores its keys at
     * https://keys.server.example.com/openid-connect. In that case, the
     * thumbprint string would be the hex-encoded SHA-1 hash value of the
     * certificate used by https://keys.server.example.com.
     */
    override fun thumbprints(thumbprints: List<String>) {
      cdkBuilder.thumbprints(thumbprints)
    }

    /**
     * @param thumbprints A list of server certificate thumbprints for the OpenID Connect (OIDC)
     * identity provider's server certificates.
     * Typically this list includes only one entry. However, IAM lets you have up
     * to five thumbprints for an OIDC provider. This lets you maintain multiple
     * thumbprints if the identity provider is rotating certificates.
     *
     * The server certificate thumbprint is the hex-encoded SHA-1 hash value of
     * the X.509 certificate used by the domain where the OpenID Connect provider
     * makes its keys available. It is always a 40-character string.
     *
     * You must provide at least one thumbprint when creating an IAM OIDC
     * provider. For example, assume that the OIDC provider is server.example.com
     * and the provider stores its keys at
     * https://keys.server.example.com/openid-connect. In that case, the
     * thumbprint string would be the hex-encoded SHA-1 hash value of the
     * certificate used by https://keys.server.example.com.
     */
    override fun thumbprints(vararg thumbprints: String): Unit = thumbprints(thumbprints.toList())

    /**
     * @param url The URL of the identity provider. 
     * The URL must begin with https:// and
     * should correspond to the iss claim in the provider's OpenID Connect ID
     * tokens. Per the OIDC standard, path components are allowed but query
     * parameters are not. Typically the URL consists of only a hostname, like
     * https://server.example.org or https://example.com.
     *
     * You cannot register the same provider multiple times in a single AWS
     * account. If you try to submit a URL that has already been used for an
     * OpenID Connect provider in the AWS account, you will get an error.
     */
    override fun url(url: String) {
      cdkBuilder.url(url)
    }

    public fun build(): software.amazon.awscdk.services.iam.OpenIdConnectProviderProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.iam.OpenIdConnectProviderProps,
  ) : CdkObject(cdkObject), OpenIdConnectProviderProps {
    /**
     * A list of client IDs (also known as audiences).
     *
     * When a mobile or web app
     * registers with an OpenID Connect provider, they establish a value that
     * identifies the application. (This is the value that's sent as the client_id
     * parameter on OAuth requests.)
     *
     * You can register multiple client IDs with the same provider. For example,
     * you might have multiple applications that use the same OIDC provider. You
     * cannot register more than 100 client IDs with a single IAM OIDC provider.
     *
     * Client IDs are up to 255 characters long.
     *
     * Default: - no clients are allowed
     */
    override fun clientIds(): List<String> = unwrap(this).getClientIds() ?: emptyList()

    /**
     * A list of server certificate thumbprints for the OpenID Connect (OIDC) identity provider's
     * server certificates.
     *
     * Typically this list includes only one entry. However, IAM lets you have up
     * to five thumbprints for an OIDC provider. This lets you maintain multiple
     * thumbprints if the identity provider is rotating certificates.
     *
     * The server certificate thumbprint is the hex-encoded SHA-1 hash value of
     * the X.509 certificate used by the domain where the OpenID Connect provider
     * makes its keys available. It is always a 40-character string.
     *
     * You must provide at least one thumbprint when creating an IAM OIDC
     * provider. For example, assume that the OIDC provider is server.example.com
     * and the provider stores its keys at
     * https://keys.server.example.com/openid-connect. In that case, the
     * thumbprint string would be the hex-encoded SHA-1 hash value of the
     * certificate used by https://keys.server.example.com.
     *
     * Default: - If no thumbprints are specified (an empty array or `undefined`),
     * the thumbprint of the root certificate authority will be obtained from the
     * provider's server as described in
     * https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_create_oidc_verify-thumbprint.html
     */
    override fun thumbprints(): List<String> = unwrap(this).getThumbprints() ?: emptyList()

    /**
     * The URL of the identity provider.
     *
     * The URL must begin with https:// and
     * should correspond to the iss claim in the provider's OpenID Connect ID
     * tokens. Per the OIDC standard, path components are allowed but query
     * parameters are not. Typically the URL consists of only a hostname, like
     * https://server.example.org or https://example.com.
     *
     * You cannot register the same provider multiple times in a single AWS
     * account. If you try to submit a URL that has already been used for an
     * OpenID Connect provider in the AWS account, you will get an error.
     */
    override fun url(): String = unwrap(this).getUrl()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): OpenIdConnectProviderProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.OpenIdConnectProviderProps):
        OpenIdConnectProviderProps = CdkObjectWrappers.wrap(cdkObject) as?
        OpenIdConnectProviderProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: OpenIdConnectProviderProps):
        software.amazon.awscdk.services.iam.OpenIdConnectProviderProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iam.OpenIdConnectProviderProps
  }
}
