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

package io.cloudshiftdev.awscdkdsl.services.iam

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.iam.OpenIdConnectProviderProps

/**
 * Initialization properties for `OpenIdConnectProvider`.
 *
 * Example:
 * ```
 * OpenIdConnectProvider provider = OpenIdConnectProvider.Builder.create(this, "MyProvider")
 * .url("https://openid/connect")
 * .clientIds(List.of("myclient1", "myclient2"))
 * .build();
 * ```
 */
@CdkDslMarker
public class OpenIdConnectProviderPropsDsl {
    private val cdkBuilder: OpenIdConnectProviderProps.Builder =
        OpenIdConnectProviderProps.builder()

    private val _clientIds: MutableList<String> = mutableListOf()

    private val _thumbprints: MutableList<String> = mutableListOf()

    /**
     * @param clientIds A list of client IDs (also known as audiences). When a mobile or web app
     *   registers with an OpenID Connect provider, they establish a value that identifies the
     *   application. (This is the value that's sent as the client_id parameter on OAuth requests.)
     *
     * You can register multiple client IDs with the same provider. For example, you might have
     * multiple applications that use the same OIDC provider. You cannot register more than 100
     * client IDs with a single IAM OIDC provider.
     *
     * Client IDs are up to 255 characters long.
     */
    public fun clientIds(vararg clientIds: String) {
        _clientIds.addAll(listOf(*clientIds))
    }

    /**
     * @param clientIds A list of client IDs (also known as audiences). When a mobile or web app
     *   registers with an OpenID Connect provider, they establish a value that identifies the
     *   application. (This is the value that's sent as the client_id parameter on OAuth requests.)
     *
     * You can register multiple client IDs with the same provider. For example, you might have
     * multiple applications that use the same OIDC provider. You cannot register more than 100
     * client IDs with a single IAM OIDC provider.
     *
     * Client IDs are up to 255 characters long.
     */
    public fun clientIds(clientIds: Collection<String>) {
        _clientIds.addAll(clientIds)
    }

    /**
     * @param thumbprints A list of server certificate thumbprints for the OpenID Connect (OIDC)
     *   identity provider's server certificates. Typically this list includes only one entry.
     *   However, IAM lets you have up to five thumbprints for an OIDC provider. This lets you
     *   maintain multiple thumbprints if the identity provider is rotating certificates.
     *
     * The server certificate thumbprint is the hex-encoded SHA-1 hash value of the X.509
     * certificate used by the domain where the OpenID Connect provider makes its keys available. It
     * is always a 40-character string.
     *
     * You must provide at least one thumbprint when creating an IAM OIDC provider. For example,
     * assume that the OIDC provider is server.example.com and the provider stores its keys at
     * https://keys.server.example.com/openid-connect. In that case, the thumbprint string would be
     * the hex-encoded SHA-1 hash value of the certificate used by https://keys.server.example.com.
     */
    public fun thumbprints(vararg thumbprints: String) {
        _thumbprints.addAll(listOf(*thumbprints))
    }

    /**
     * @param thumbprints A list of server certificate thumbprints for the OpenID Connect (OIDC)
     *   identity provider's server certificates. Typically this list includes only one entry.
     *   However, IAM lets you have up to five thumbprints for an OIDC provider. This lets you
     *   maintain multiple thumbprints if the identity provider is rotating certificates.
     *
     * The server certificate thumbprint is the hex-encoded SHA-1 hash value of the X.509
     * certificate used by the domain where the OpenID Connect provider makes its keys available. It
     * is always a 40-character string.
     *
     * You must provide at least one thumbprint when creating an IAM OIDC provider. For example,
     * assume that the OIDC provider is server.example.com and the provider stores its keys at
     * https://keys.server.example.com/openid-connect. In that case, the thumbprint string would be
     * the hex-encoded SHA-1 hash value of the certificate used by https://keys.server.example.com.
     */
    public fun thumbprints(thumbprints: Collection<String>) {
        _thumbprints.addAll(thumbprints)
    }

    /**
     * @param url The URL of the identity provider. The URL must begin with https:// and should
     *   correspond to the iss claim in the provider's OpenID Connect ID tokens. Per the OIDC
     *   standard, path components are allowed but query parameters are not. Typically the URL
     *   consists of only a hostname, like https://server.example.org or https://example.com.
     *
     * You cannot register the same provider multiple times in a single AWS account. If you try to
     * submit a URL that has already been used for an OpenID Connect provider in the AWS account,
     * you will get an error.
     */
    public fun url(url: String) {
        cdkBuilder.url(url)
    }

    public fun build(): OpenIdConnectProviderProps {
        if (_clientIds.isNotEmpty()) cdkBuilder.clientIds(_clientIds)
        if (_thumbprints.isNotEmpty()) cdkBuilder.thumbprints(_thumbprints)
        return cdkBuilder.build()
    }
}
