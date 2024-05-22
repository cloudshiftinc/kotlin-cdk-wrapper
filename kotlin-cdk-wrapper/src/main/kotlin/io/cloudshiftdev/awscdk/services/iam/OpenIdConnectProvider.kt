@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * IAM OIDC identity providers are entities in IAM that describe an external identity provider (IdP)
 * service that supports the OpenID Connect (OIDC) standard, such as Google or Salesforce.
 *
 * You use an IAM OIDC identity provider
 * when you want to establish trust between an OIDC-compatible IdP and your AWS
 * account. This is useful when creating a mobile app or web application that
 * requires access to AWS resources, but you don't want to create custom sign-in
 * code or manage your own user identities.
 *
 * Example:
 *
 * ```
 * OpenIdConnectProvider provider = OpenIdConnectProvider.Builder.create(this, "MyProvider")
 * .url("https://openid/connect")
 * .clientIds(List.of("myclient1", "myclient2"))
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_oidc.html)
 */
public open class OpenIdConnectProvider(
  cdkObject: software.amazon.awscdk.services.iam.OpenIdConnectProvider,
) : Resource(cdkObject), IOpenIdConnectProvider {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: OpenIdConnectProviderProps,
  ) :
      this(software.amazon.awscdk.services.iam.OpenIdConnectProvider(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(OpenIdConnectProviderProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: OpenIdConnectProviderProps.Builder.() -> Unit,
  ) : this(scope, id, OpenIdConnectProviderProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the IAM OpenID Connect provider.
   */
  public override fun openIdConnectProviderArn(): String =
      unwrap(this).getOpenIdConnectProviderArn()

  /**
   * The issuer for OIDC Provider.
   */
  public override fun openIdConnectProviderIssuer(): String =
      unwrap(this).getOpenIdConnectProviderIssuer()

  /**
   * The thumbprints configured for this provider.
   */
  public open fun openIdConnectProviderthumbprints(): String =
      unwrap(this).getOpenIdConnectProviderthumbprints()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iam.OpenIdConnectProvider].
   */
  @CdkDslMarker
  public interface Builder {
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
     *
     * @param clientIds A list of client IDs (also known as audiences). 
     */
    public fun clientIds(clientIds: List<String>)

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
     *
     * @param clientIds A list of client IDs (also known as audiences). 
     */
    public fun clientIds(vararg clientIds: String)

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
     *
     * @param thumbprints A list of server certificate thumbprints for the OpenID Connect (OIDC)
     * identity provider's server certificates. 
     */
    public fun thumbprints(thumbprints: List<String>)

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
     *
     * @param thumbprints A list of server certificate thumbprints for the OpenID Connect (OIDC)
     * identity provider's server certificates. 
     */
    public fun thumbprints(vararg thumbprints: String)

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
     *
     * @param url The URL of the identity provider. 
     */
    public fun url(url: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.OpenIdConnectProvider.Builder =
        software.amazon.awscdk.services.iam.OpenIdConnectProvider.Builder.create(scope, id)

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
     *
     * @param clientIds A list of client IDs (also known as audiences). 
     */
    override fun clientIds(clientIds: List<String>) {
      cdkBuilder.clientIds(clientIds)
    }

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
     *
     * @param clientIds A list of client IDs (also known as audiences). 
     */
    override fun clientIds(vararg clientIds: String): Unit = clientIds(clientIds.toList())

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
     *
     * @param thumbprints A list of server certificate thumbprints for the OpenID Connect (OIDC)
     * identity provider's server certificates. 
     */
    override fun thumbprints(thumbprints: List<String>) {
      cdkBuilder.thumbprints(thumbprints)
    }

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
     *
     * @param thumbprints A list of server certificate thumbprints for the OpenID Connect (OIDC)
     * identity provider's server certificates. 
     */
    override fun thumbprints(vararg thumbprints: String): Unit = thumbprints(thumbprints.toList())

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
     *
     * @param url The URL of the identity provider. 
     */
    override fun url(url: String) {
      cdkBuilder.url(url)
    }

    public fun build(): software.amazon.awscdk.services.iam.OpenIdConnectProvider =
        cdkBuilder.build()
  }

  public companion object {
    public fun fromOpenIdConnectProviderArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      openIdConnectProviderArn: String,
    ): IOpenIdConnectProvider =
        software.amazon.awscdk.services.iam.OpenIdConnectProvider.fromOpenIdConnectProviderArn(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, openIdConnectProviderArn).let(IOpenIdConnectProvider::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): OpenIdConnectProvider {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return OpenIdConnectProvider(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.OpenIdConnectProvider):
        OpenIdConnectProvider = OpenIdConnectProvider(cdkObject)

    internal fun unwrap(wrapped: OpenIdConnectProvider):
        software.amazon.awscdk.services.iam.OpenIdConnectProvider = wrapped.cdkObject as
        software.amazon.awscdk.services.iam.OpenIdConnectProvider
  }
}
