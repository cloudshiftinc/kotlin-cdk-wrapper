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
 * OidcProviderNative nativeProvider = OidcProviderNative.Builder.create(this, "MyProvider")
 * .url("https://openid/connect")
 * .clientIds(List.of("myclient1", "myclient2"))
 * .thumbprints(List.of("aa00aa1122aa00aa1122aa00aa1122aa00aa1122"))
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_oidc.html)
 */
public open class OidcProviderNative(
  cdkObject: software.amazon.awscdk.services.iam.OidcProviderNative,
) : Resource(cdkObject),
    IOidcProvider {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: OidcProviderNativeProps,
  ) :
      this(software.amazon.awscdk.services.iam.OidcProviderNative(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(OidcProviderNativeProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: OidcProviderNativeProps.Builder.() -> Unit,
  ) : this(scope, id, OidcProviderNativeProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the Native IAM OpenID Connect provider.
   */
  public override fun oidcProviderArn(): String = unwrap(this).getOidcProviderArn()

  /**
   * The issuer for the Native OIDC Provider.
   */
  public override fun oidcProviderIssuer(): String = unwrap(this).getOidcProviderIssuer()

  /**
   * The thumbprints configured for this provider.
   */
  public open fun oidcProviderThumbprints(): String = unwrap(this).getOidcProviderThumbprints()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iam.OidcProviderNative].
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
     * The name of the Native OIDC Provider.
     *
     * Default: - A name is automatically generated.
     *
     * @param oidcProviderName The name of the Native OIDC Provider. 
     */
    public fun oidcProviderName(oidcProviderName: String)

    /**
     * A list of server certificate thumbprints for the OpenID Connect (OIDC) identity provider's
     * server certificates.
     *
     * Typically this list includes only 1 entry or empty. However, IAM lets
     * you have up to 5 thumbprints for an OIDC provider. This lets you maintain
     * multiple thumbprints if the identity provider is rotating certificates.
     *
     * The server certificate thumbprint is the hex-encoded SHA-1 hash value of
     * the X.509 certificate used by the domain where the OpenID Connect provider
     * makes its keys available. It is always a 40-character string.
     *
     * For example, assume that the OIDC provider is server.example.com and the
     * provider stores its keys at https://keys.server.example.com/openid-connect.
     * In that case, the thumbprint string would be the hex-encoded SHA-1 hash
     * value of the certificate used by https://keys.server.example.com.
     *
     * This property is optional. If it is not included, IAM will retrieve and use
     * the top intermediate certificate authority (CA) thumbprint of the OpenID
     * Connect identity provider server certificate.
     *
     * Obtain the thumbprint of the root certificate authority from the provider's
     * server as described in
     * https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_create_oidc_verify-thumbprint.html
     *
     * Default: - no thumbprints are allowed. IAM will retrieve and use thumbprint
     * of idenity provider server cerctificate
     *
     * @param thumbprints A list of server certificate thumbprints for the OpenID Connect (OIDC)
     * identity provider's server certificates. 
     */
    public fun thumbprints(thumbprints: List<String>)

    /**
     * A list of server certificate thumbprints for the OpenID Connect (OIDC) identity provider's
     * server certificates.
     *
     * Typically this list includes only 1 entry or empty. However, IAM lets
     * you have up to 5 thumbprints for an OIDC provider. This lets you maintain
     * multiple thumbprints if the identity provider is rotating certificates.
     *
     * The server certificate thumbprint is the hex-encoded SHA-1 hash value of
     * the X.509 certificate used by the domain where the OpenID Connect provider
     * makes its keys available. It is always a 40-character string.
     *
     * For example, assume that the OIDC provider is server.example.com and the
     * provider stores its keys at https://keys.server.example.com/openid-connect.
     * In that case, the thumbprint string would be the hex-encoded SHA-1 hash
     * value of the certificate used by https://keys.server.example.com.
     *
     * This property is optional. If it is not included, IAM will retrieve and use
     * the top intermediate certificate authority (CA) thumbprint of the OpenID
     * Connect identity provider server certificate.
     *
     * Obtain the thumbprint of the root certificate authority from the provider's
     * server as described in
     * https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_create_oidc_verify-thumbprint.html
     *
     * Default: - no thumbprints are allowed. IAM will retrieve and use thumbprint
     * of idenity provider server cerctificate
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
     * Warning: This URL cannot contain any port numbers
     *
     * @param url The URL of the identity provider. 
     */
    public fun url(url: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.OidcProviderNative.Builder =
        software.amazon.awscdk.services.iam.OidcProviderNative.Builder.create(scope, id)

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
     * The name of the Native OIDC Provider.
     *
     * Default: - A name is automatically generated.
     *
     * @param oidcProviderName The name of the Native OIDC Provider. 
     */
    override fun oidcProviderName(oidcProviderName: String) {
      cdkBuilder.oidcProviderName(oidcProviderName)
    }

    /**
     * A list of server certificate thumbprints for the OpenID Connect (OIDC) identity provider's
     * server certificates.
     *
     * Typically this list includes only 1 entry or empty. However, IAM lets
     * you have up to 5 thumbprints for an OIDC provider. This lets you maintain
     * multiple thumbprints if the identity provider is rotating certificates.
     *
     * The server certificate thumbprint is the hex-encoded SHA-1 hash value of
     * the X.509 certificate used by the domain where the OpenID Connect provider
     * makes its keys available. It is always a 40-character string.
     *
     * For example, assume that the OIDC provider is server.example.com and the
     * provider stores its keys at https://keys.server.example.com/openid-connect.
     * In that case, the thumbprint string would be the hex-encoded SHA-1 hash
     * value of the certificate used by https://keys.server.example.com.
     *
     * This property is optional. If it is not included, IAM will retrieve and use
     * the top intermediate certificate authority (CA) thumbprint of the OpenID
     * Connect identity provider server certificate.
     *
     * Obtain the thumbprint of the root certificate authority from the provider's
     * server as described in
     * https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_create_oidc_verify-thumbprint.html
     *
     * Default: - no thumbprints are allowed. IAM will retrieve and use thumbprint
     * of idenity provider server cerctificate
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
     * Typically this list includes only 1 entry or empty. However, IAM lets
     * you have up to 5 thumbprints for an OIDC provider. This lets you maintain
     * multiple thumbprints if the identity provider is rotating certificates.
     *
     * The server certificate thumbprint is the hex-encoded SHA-1 hash value of
     * the X.509 certificate used by the domain where the OpenID Connect provider
     * makes its keys available. It is always a 40-character string.
     *
     * For example, assume that the OIDC provider is server.example.com and the
     * provider stores its keys at https://keys.server.example.com/openid-connect.
     * In that case, the thumbprint string would be the hex-encoded SHA-1 hash
     * value of the certificate used by https://keys.server.example.com.
     *
     * This property is optional. If it is not included, IAM will retrieve and use
     * the top intermediate certificate authority (CA) thumbprint of the OpenID
     * Connect identity provider server certificate.
     *
     * Obtain the thumbprint of the root certificate authority from the provider's
     * server as described in
     * https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_create_oidc_verify-thumbprint.html
     *
     * Default: - no thumbprints are allowed. IAM will retrieve and use thumbprint
     * of idenity provider server cerctificate
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
     * Warning: This URL cannot contain any port numbers
     *
     * @param url The URL of the identity provider. 
     */
    override fun url(url: String) {
      cdkBuilder.url(url)
    }

    public fun build(): software.amazon.awscdk.services.iam.OidcProviderNative = cdkBuilder.build()
  }

  public companion object {
    public val PROPERTY_INJECTION_ID: String =
        software.amazon.awscdk.services.iam.OidcProviderNative.PROPERTY_INJECTION_ID

    public fun fromOidcProviderArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      oidcProviderArn: String,
    ): IOidcProvider =
        software.amazon.awscdk.services.iam.OidcProviderNative.fromOidcProviderArn(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, oidcProviderArn).let(IOidcProvider::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): OidcProviderNative {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return OidcProviderNative(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.OidcProviderNative):
        OidcProviderNative = OidcProviderNative(cdkObject)

    internal fun unwrap(wrapped: OidcProviderNative):
        software.amazon.awscdk.services.iam.OidcProviderNative = wrapped.cdkObject as
        software.amazon.awscdk.services.iam.OidcProviderNative
  }
}
